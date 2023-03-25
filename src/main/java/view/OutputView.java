package view;

import java.util.List;

public class OutputView {

    public void end(List<String> winners) {
        System.out.println(String.join(",", winners) + "가 최종 우승했습니다.");
    }
}
