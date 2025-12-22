-- Read the docs: https://www.lunarvim.org/docs/configuration
-- Example configs: https://github.com/LunarVim/starter.lvim
-- Video Tutorials: https://www.youtube.com/watch?v=sFA9kX-Ud_c&list=PLhoH5vyxr6QqGu0i7tt_XoVK9v-KvZ3m6
-- Forum: https://www.reddit.com/r/lunarvim/
-- Discord: https://discord.com/invite/Xb9B4Ny

---------- General Options ----------------------------------------

-- Change whichkey delay
vim.o.timeoutlen = 0  -- Change 300 to your preferred delay in milliseconds

-- COlorshceme
-- lvim.colorscheme = "parchment"

-- Set line break
vim.opt.showbreak = '↪\\ '
vim.opt.wrap = true

-- Search settings
vim.opt.incsearch = true
vim.opt.ignorecase = true
vim.opt.smartcase = true

-- Matching words during search
vim.opt.showmatch = true
vim.opt.hlsearch = true

-- Matching words during search
vim.opt.showmatch = true
vim.opt.hlsearch = true

-- Enable swap, backup, and persistant undo
vim.opt.directory = vim.fn.expand("~/.lvim_backups//")
vim.opt.backupdir = vim.fn.expand("~/.lvim_backups//")
vim.opt.undodir = vim.fn.expand("~/.lvim_backups//")
vim.opt.swapfile = true
vim.opt.backup = true
vim.opt.undofile = true
vim.opt.undolevels = 100000

-- Append backup files with timestamp
vim.api.nvim_create_autocmd("BufWritePre", {
	callback = function()
		local extension = "~" .. vim.fn.strftime("%Y-%m-%d-%H%M%S")
		vim.o.backupext = extension
	end,
})

-- Proper setup for nvim-surround
vim.api.nvim_create_autocmd("User", {
  pattern = "VeryLazy",
  callback = function()
    require("nvim-surround").setup()
  end,
})
---
-- Disable Java LSP (jdtls)
-- vim.list_extend(lvim.lsp.automatic_configuration.skipped_servers, { "jdtls" })
---------- Plugins --------------------------------------------------

-- Installation
lvim.plugins = {
  {"elmcgill/springboot-nvim"},
  -- {"folke/tokyonight.nvim"},
  -- {"chiendo97/intellij.vim"},
  {"kevinhwang91/nvim-fundo"},
  -- {"vim-scripts/eclipse.vim"},
  {"rafamadriz/friendly-snippets"},
  -- {"junegunn/seoul256.vim"},
  -- {"aonemd/quietlight.vim"},
  {"axgfn/parchment" },
  {"kylechui/nvim-surround", version = "*", event = "VeryLazy" },
  {
      "L3MON4D3/LuaSnip", -- snippet engine (usually already installed)
      dependencies = { "rafamadriz/friendly-snippets" },
      -- config = function()
      --   require("luasnip.loaders.from_vscode").lazy_load()
      -- end,
    },
  --
  -- {"nvim-java/nvim-java"},
  -- {"josebalius/vim-light-chromeclipse"},
  {
    "mattn/emmet-vim",
    ft = { "html", "css", "javascriptreact", "typescriptreact", "vue", "svelte" }, -- load only for these filetypes
  }
}



