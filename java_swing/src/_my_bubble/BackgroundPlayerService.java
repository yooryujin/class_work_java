package _my_bubble;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BackgroundPlayerService implements Runnable {


    private BufferedImage image;
    private Player player;

    public BackgroundPlayerService(_my_bubble.Player player) {
        this.player = player;
        try {
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void run() {
        // 색상 확인
        while(true) {
            Color leftColor = new Color(image.getRGB(player.getX() + 10, player.getY() + 25));
            Color rightColor = new Color(image.getRGB(player.getX() + 50 + 10, player.getY() + 25));
            // 왼쪽에 충돌
            if (leftColor.getRed() == 225 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
                System.out.println("왼쪽 벽에 충돌");

            }
        }
    }
}
