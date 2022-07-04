package by.academy.homework.homework2;

import java.util.*;

/**
 * Задание 4.
 * Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер.
 * Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n  игроков (по 5 карт каждому)
 * из рассортированной колоды.
 * Разделяйте пять карт, выданных каждому игроку, пустой строкой.
 */
class PLayer {
    public String name;
    public List<String> cards;


public String toString() {// взялся из объекта обжект
        return "PLayer{" +
                "name ='" + name + '\'' +
                ", cards=" + cards +
                '}';
    }
}
public class Home_TasK2_4 {
    public static void main(String[] args) {
        int cardsForPlayer = 5;
        int players = 5;
        List<PLayer> playerObjs = new ArrayList<>();

        String[] suits = {"Bubej", "Pik", "4ervej", "tref"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dama", "Korol", "Tuz"};


        var coloda = new Stack<String>();

        for (String suit : suits) {
            for (String rank : ranks) {
                coloda.push(suit + "/" + rank);
            }
        }
        Collections.shuffle(coloda);

        System.out.println(coloda);

        for (int i = 0; i < players; i++) {

            PLayer pl = new PLayer();
            pl.name = "player" + i;
            pl.cards = new ArrayList<>();

            for (int y = 0; y < cardsForPlayer; y++) {
                var stCard = coloda.pop();
                pl.cards.add(stCard);
            }
            playerObjs.add(pl);
        }

        //print results
        for (PLayer player : playerObjs) {
            System.out.println(player);
        }

        System.out.println(coloda.size());
        System.out.println(coloda);



    }
}
