package model;

import java.awt.Color;

public class Config {
    public static final int WINDOW_WIDTH = 1000; //
    public static final int WINDOW_HEIGHT = 630; // 600 + 30 para el header

    public static final Color COLOR_COIN = new Color(255, 215, 0); // Color dorado para las monedas

    // --- NUEVAS CONSTANTES DE COLOR ---
    // Colores de los elementos del juego
    public static final Color COLOR_PLAYER = Color.RED;
    public static final Color COLOR_OBSTACLE = Color.BLUE;
    public static final Color COLOR_GOAL = new Color(165, 255, 163);
    public static final Color COLOR_WALL_TILE = new Color(179, 179, 255);

    // Colores del fondo del área de juego
    public static final Color COLOR_BACKGROUND_CHESS_LIGHT = new Color(222, 222, 255); // Lavanda muy claro
    public static final Color COLOR_BACKGROUND_CHESS_DARK = new Color(247, 247, 255); // Gris claro
    public static final Color COLOR_PLAY_AREA_BACKGROUND = new Color(179, 179, 255); // Color lavanda para el área externa

    // Colores del Header
    public static final Color COLOR_HEADER_BACKGROUND = new Color(0, 0, 0);
    public static final Color COLOR_HEADER_TEXT = Color.WHITE;
    public static final int HEADER_HEIGHT = 40; // Ya que estamos, movamos esto aquí también

    // Colores de la pantalla de Game Over
    public static final Color COLOR_GAME_OVER_BACKGROUND = new Color(0, 0, 0, 128); // Negro semi-transparente
    public static final Color COLOR_GAME_OVER_TEXT = Color.GREEN;

    // Otros tamaños constantes que podrían ser útiles
    public static final int CHESSBOARD_TILE_SIZE = 30;

}