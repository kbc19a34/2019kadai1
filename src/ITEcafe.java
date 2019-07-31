/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author kbc19a34
 */
public class ITEcafe {

    public static void main(String[] args) {

        //準備
        Item hotcoffee = new Item(1, "ホットコーヒー", 280);
        Item tea = new Item(2, "紅茶", 260);
        Item lemontea = new Item(3, "レモンティー", 200);
        Item cake = new Item(4, "ケーキ", 400);
        Item milktea = new Item(5, "ミルクティー", 250);
        Item cookie = new Item(6, "クッキー", 190);
        Item creampuff = new Item(7,"シュークリーム",330);

        Item[] items = new Item[20];
        items[0] = hotcoffee;
        items[1] = tea;
        items[2] = lemontea;
        items[3] = cake;
        items[4] = milktea;
        items[5] = cookie;
        items[6] = creampuff;

        Scanner scan = new Scanner(System.in);

        int inputNum; //入力された商品番号
        int price = 0;    //料金
        String inputStr;

        while (true) {
            //商品名を表示する
            System.out.println("■■■ITECafeシステム■■■");
            System.out.println(hotcoffee.getNo() + ":" + hotcoffee.getName());
            System.out.println(tea.getNo() + ":" + tea.getName());

            //商品番号を入力する
            System.out.println("商品番号を入力してください:");

            try {

                inputStr = scan.next();
                inputNum = Integer.parseInt(inputStr);
                //System.out.println(inputNum);

                System.out.println(items[inputNum - 1].getNo() + ":" + items[inputNum - 1].getName()
                        + "" + items[inputNum - 1].getPrice() + "円が入力されました");

                price = items[inputNum - 1].getPrice();

                //正しく入力されたらループを抜ける
                //break;
            } catch (NumberFormatException e) {
                System.out.println("【入力エラー:数値を入力してください】");
                continue;
            }

            //数量を入力する
            System.out.println("数量を入力してください");

            inputStr = scan.next();
            inputNum = Integer.parseInt(inputStr);
            //System.out.println(inputNum);

            System.out.println(inputNum + "個が入力されました");

            System.out.println("合計金額は" + inputNum * price + "円です");

            //お釣り
            int total = inputNum * price;

            inputStr = scan.next();
            inputNum = Integer.parseInt(inputStr);

            System.out.println(inputNum + "円お預かりします");
            System.out.println("お釣りは" + (inputNum - total) + "円です");
            System.out.println("ありがとうございました");
            System.out.println("続ける？ 1");
            inputStr = scan.next();
            inputNum = Integer.parseInt(inputStr);
            if (inputNum != 1) {
                break;
            }
        }
    }
}