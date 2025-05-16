package bubble.test03;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 현재 메인 쓰레드는 너무 바쁜 상태이다.
 * 백그라운드에서 계속 Player 의 움직임을 관찰할 예정
 */
public class BackgroundPlayerService implements Runnable {

    private BufferedImage image;
    private Player player;

    // 생성자 의존 주입 (DI) - (연관관계)
    public BackgroundPlayerService(Player player) {
        this.player = player;
        try {
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // start() 메서드가 호출 되면 동작 하도록 약속 되어 있다.
    @Override
    public void run() {
        // 색상 확인 보정값 필요.
        while (true) {
            // RGB
            // R - 0 ~ 255, G - 0 ~ 255, B - 0 ~ 255;
            Color leftColor = new Color(image.getRGB(player.getX(), player.getY()));
            // 플레이어 좌표에 보정 값 추가
            Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY() + 25));
            // 플레이어의 좌표 값에 따라서 빨간색, 파란색, 하얀색을 구분할 수 있다.
            // System.out.println("왼쪽 확인 : " + leftColor);
            // System.out.println("오른쪽 확인 : " + rightColor);

            // leftColor - 논리적으로 255, 0, 0 이면 왼쪽 벽에 충돌함으로 판단.
            // rightColor - 논리적으로 255, 0, 0 이면 왼쪽 벽에 충돌함으로 판단.
            if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
                // 빨간색으로 판별 --> 왼쪽 벽에 충돌 상태이다.
                System.out.println("왼쪽 벽에 충돌");
                player.setLeftWallCrash(true);
                player.setLeft(false); // 왼쪽 이동 쓰레드 종료
            } else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
                // 빨간색으로 판별 --> 오른쪽 벽에 충돌 상태이다.
                System.out.println("오른쪽 벽에 충돌");
                player.setRightWallCrash(true);
                player.setRight(false); // 오른쪽 이동 쓰레드 종료
            } else {
                player.setLeftWallCrash(false);
                player.setRight(false);
            }
            // 위 두 조건이 아니면 하얀색.. 즉 마음대로 움직일 수 있다.
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
