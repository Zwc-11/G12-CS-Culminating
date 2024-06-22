package CS.Version1_L;

import java.awt.*;

public class Main {
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static int screenHeight = (int) screenSize.getHeight();
    public static int screenWidth = (int) screenSize.getWidth();
    // Color 1 is light gray (panels)
    public static Color color1 = new Color(0xD4D9D8);
    // Color 2 is light blue (buttons)
    public static Color color2 = new Color(0x93EFF1);
    // Color 3 is dark blue (buttons on hover)
    public static Color color3 = new Color(0x3077D9);
    // Color 4 is black (frame)
    public static Color color4 = new Color(0x0F0F0F);

    public static void main(String[] args) {
        System.out.println("Screen size: " + screenHeight + " " + screenWidth);
        new Homepage();
    }
}

// Symbols (for copy paste): "Fₖ", "Fₐ", "Fₙ", "F₉", "Fₛ"