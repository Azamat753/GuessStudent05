package com.example.guessstudent05;

import java.io.Serializable;

public class GameModel implements Serializable {
    String level;
    String imageAddressFirst;
    String imageAddressSecond;
    String imageAddressThird;
    String imageAddressFour;
    String answer;

    public GameModel(String level, String imageAddressFirst, String imageAddressSecond, String imageAddressThird, String imageAddressFour, String answer) {
        this.level = level;
        this.imageAddressFirst = imageAddressFirst;
        this.imageAddressSecond = imageAddressSecond;
        this.imageAddressThird = imageAddressThird;
        this.imageAddressFour = imageAddressFour;
        this.answer = answer;
    }
}
