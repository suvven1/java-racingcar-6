package racingcar.domain;

import camp.nextstep.edu.missionutils.Console;

public class UserInput {
    public String[] getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputCarNames = Console.readLine();
        String[] carNames = inputCarNames.split(",");
        return carNames;
    }

    public int getTryNumber() {
        System.out.println("시도할 회수는 몇회인가요?");
        int tryNumber = Integer.parseInt(Console.readLine());
        return tryNumber;
    }
}
