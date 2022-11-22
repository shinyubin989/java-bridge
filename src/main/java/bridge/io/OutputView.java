package bridge.io;

import bridge.enums.InGameMessage;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {
    /**
     * 인자와 반환타입은 추가, 변경 가능
     * 메서드 추가 가능
     *
     * 메서드 이름 변경 불가능
     */


    public void printStart() {
        System.out.println(InGameMessage.START.getMessage());
        System.out.println();
    }

    public void printLastMapResult() {
        System.out.println(InGameMessage.RESULT.getMessage());
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(String map) {
        System.out.println(map);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(boolean success, int gameCount) {
        System.out.println(InGameMessage.SUCCESS_OR_FAILURE.getMessage()+ InGameMessage.findMessageBySuccessOrNot(success));
        System.out.println(InGameMessage.TRY_COUNT.getMessage() + Integer.toString(gameCount));
    }
}