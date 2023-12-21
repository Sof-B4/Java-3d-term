package Lab24;

public class Tester {
    public static void main(String[] args) {
        InternetOrder intOrd1 = new InternetOrder();
        intOrd1.addPosition(new Dish("\n Тар-тар из лосося\n", "Цитрусовая заправка, кунжутное масло, огурец", 740));
        intOrd1.addPosition(new Dish("Тыквенный крем-суп с креветкой\n", "Тыквенные семечки, имбирь", 660));
        intOrd1.addPosition(new Dish("Креветки с рукколой и пармезаном\n", "Бальзамическая заправка, вяленые томаты, фисташки", 860));
        intOrd1.addPosition(new Drink("Мохито\n", "Ром La Criolla Caribbean, мята, лайм, сахарный, сироп, газированная вода", 350));
        intOrd1.addPosition(new Drink("Дыня-Пломбир на игристом\n", "Игристое “Винья Альбали” б/а, кордиал, дыня-пломбир", 495));

        InternetOrder intOrd2 = new InternetOrder();
        intOrd2.addPosition(new Drink("\n Лимонад\n", "Манго-Маракуйя-Тимьян", 370));
        intOrd2.addPosition(new Dish("Ризотто с морепродуктами\n", "Трюфельный соус", 740));
        intOrd2.addPosition(new Dish("Гребешки с цветной капусты\n", "И трюфельным маслом", 760));
        intOrd2.addPosition(new Drink("Пэшнсекко\n", "Аперитив Дринксам б/а, сорбет лимон, пюре, маракуйя, игристое “Винья Альбали” б/а", 350));
        intOrd2.addPosition(new Dish("Мохито\n", "Классический, Клубничный, Малиновый, Манго-Маракуйя", 370));

        RestaurantOrder restOrd1 = new RestaurantOrder();
        restOrd1.addPosition(new Drink("\n Смузи\n", "Груша-Шпинат", 380));
        restOrd1.addPosition(new Dish("Феттучине с курицей\n", "И сливочным песто", 100));
        restOrd1.addPosition(new Dish("Лазанья\n", "С грибным соусом", 100));

        RestaurantOrder restOrd2 = new RestaurantOrder();
        restOrd2.addPosition(new Dish("\n Тар-тар из селедки\n", "Цитрусовая заправка, кунжутное масло, огурец", 740));
        restOrd2.addPosition(new Dish("Томатный с сыром страчателла\n", "Тыквенные семечки, имбирь", 660));
        restOrd2.addPosition(new Dish("С грушей и горгонзолой\n", "Салатные листья, малиновый бальзамик, орехи", 550));
        restOrd2.addPosition(new Drink("Мохито\n", "Ром La Criolla Caribbean, мята, лайм, сахарный, сироп, газированная вода", 350));
        restOrd2.addPosition(new Drink("Мохито\n", "Ром La Criolla Caribbean, мята, лайм, сахарный, сироп, газированная вода", 350));

        OrderManager man = new OrderManager(2);
        try {
            man.add(restOrd1, 0);
            man.add(restOrd2, 1);
            man.add("Москва", intOrd1);
            man.add("Волгоград", intOrd2);
        }
        catch(OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }

        man.show();
        System.out.println();
        System.out.println(man.internetDishQuantity("Паста с морепродуктами"));
        System.out.println(man.tableDishQuantity("Паста с морепродуктами"));

        System.out.println();

        man.removeOrder(0);
        man.removeOrder("Москва");
        man.addItem("Волгоград", new Drink("Мохито", "Ром La Criolla Caribbean, мята, лайм, сахарный, сироп, газированная вода"));
        man.addItem(new Dish("Паста с морепродуктами", "Мидии в сливочном соусе", 1000), 1);

        man.show();
        System.out.println();
        System.out.println("Свободный номер столика:");
        System.out.println(man.freeTableNumber());
        System.out.println("Сводная стоимость интернет-заказа:");
        System.out.println(man.internetOrderCostSummary());
        System.out.println("Сводная стоимость заказа в ресторане:");
        System.out.println(man.tableOrderCostSummary());
    }
}

