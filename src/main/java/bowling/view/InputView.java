package bowling.view;

import java.util.Scanner;

public class InputView {

    public static final String INPUT_PLAYER_NAME_MESSAGE = "플레이어 이름은(3 english letters)?: ";

    private static final Scanner scanner = new Scanner(System.in);

    public static String inputPlayerName() {
        System.out.print(INPUT_PLAYER_NAME_MESSAGE);
        return scanner.nextLine();
    }
}
