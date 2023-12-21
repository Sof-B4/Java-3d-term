package Lab4;

public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human("Андрей", 18);
        human.set_age(19);
        human.display_info();

        Human.Hand human_hand = human.new Hand();
        human_hand.move();
        human_hand.drop_item();
        human_hand.hold_item("кофе");
        human_hand.drop_item();


        Human.Leg human_leg = human.new Leg();
        human_leg.move();


        Human.Head human_head = human.new Head();
        human_head.think();
        human_head.sleep(true);
        human_head.sleep(false);
    }
}
