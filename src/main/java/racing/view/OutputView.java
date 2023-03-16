package racing.view;

import java.util.List;
import java.util.Map;

public class OutputView {

    public void result(Map<String, Integer> nameSpotMap) {
        for (String name : nameSpotMap.keySet()) {
            System.out.print(name + " : ");
            distancePrint(nameSpotMap.get(name));
        }
        System.out.println();
    }

    private void distancePrint(Integer distance) {
        for(int i = 0; i < distance; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void end(List<String> winners) {
        String winnerNames = createWinnerNames(winners);
        System.out.println(winnerNames + "가 최종 우승했습니다.");
    }

    private static String createWinnerNames(List<String> winners) {
        StringBuilder sb = new StringBuilder();
        winners.forEach(winner -> sb.append(winner).append(", "));
        return sb.substring(0, sb.length() - 2);
    }
}
