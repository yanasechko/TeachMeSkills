package Lesson8.robot;

import Lesson8.robot.hands.SamsungHand;
import Lesson8.robot.hands.SonyHand;
import Lesson8.robot.hands.ToshibaHand;
import Lesson8.robot.heads.SamsungHead;
import Lesson8.robot.heads.SonyHead;
import Lesson8.robot.heads.ToshibaHead;
import Lesson8.robot.legs.SamsungLeg;
import Lesson8.robot.legs.SonyLeg;
import Lesson8.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


        var r1 = new Robot(new SamsungHead(15), new SonyHand(10), new ToshibaLeg(10));
        var r2 = new Robot(new ToshibaHead(20), new SamsungHand(15), new SonyLeg(12));
        var r3 = new Robot(new SonyHead(17), new ToshibaHand(12), new SamsungLeg(16));

        System.out.println("Первый робот:");
        r1.action();
        System.out.println("Второй робот:");
        r2.action();
        System.out.println("Третий робот:");
        r3.action();

        if (r1.getPrice() > r2.getPrice() && r1.getPrice() > r3.getPrice()) {
            System.out.println("Первый робот самый дорогой");
        } else if (r2.getPrice() > r1.getPrice() && r2.getPrice() > r3.getPrice()) {
            System.out.println("Второй робот самый дорогой");
        } else System.out.println("Третий робот самый дорогой");
    }

}
