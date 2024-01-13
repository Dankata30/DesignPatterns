package com.yordanch.patterns.behavioral.state.client;

import com.yordanch.patterns.behavioral.state.ui.Player;
import com.yordanch.patterns.behavioral.state.ui.UI;

public class StateDemo {
    public static void run() {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}