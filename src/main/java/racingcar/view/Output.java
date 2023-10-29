package racingcar.view;


import java.util.Map;

public class Output {
    public static void printInputCarMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void printInputTryCountMessage() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printResultMessage() {
        System.out.println("");
        System.out.println("실행 결과");
    }

    public static void printGameWinnerMessage(String winners) {
        System.out.println("최종 우승자 : " + winners);
    }

    public static void printGameProgress(Map<String, Integer> carMap) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String car : carMap.keySet()) {
            stringBuilder.append(car + " : ");
            for (int forwardCount = 0; forwardCount < carMap.get(car); forwardCount++) {
                stringBuilder.append("-");
            }
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);
    }
}
