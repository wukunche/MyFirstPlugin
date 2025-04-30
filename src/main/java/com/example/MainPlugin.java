package com.example;

import org.bukkit.plugin.java.JavaPlugin;

public class MainPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("插件已啟用！");
    }

    @Override
    public void onDisable() {
        getLogger().info("插件已停用！");
    }
}