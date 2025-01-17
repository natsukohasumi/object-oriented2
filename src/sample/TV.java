package sample;

public class TV {
    private int channnel;

    public void changeChannel(int channnel){
        if(channnel <= 0 || 13 <= channnel){
            System.out.println("チャンネルは１〜１２までの間で設定してください");
            return;
        }

        this.channnel = channnel;
        System.out.println(this.channnel + "チャンネルに切り替わりました");

    }
}
