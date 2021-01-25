class Greeting{
    public static void main(String[] args){
        System.out.println("Good evening");

        System.out.println("Good morning");

        System.out.println("Good afternoon");   

        int var = 1;
        int var01 = 2;
        int var_01 = 3;
        int var$01 = 4;
        // int var-01 = 5;
        // int 01var = 6;
        // ルール違反

        int VAR = 1;
        int Var = 2;

        // int return = 1;
        // int class = 2;
        // 予約後は変数名には使えない

        byte var02 = 1;
        short var03 = 12345;
        int var04 =1234567890;
        long var05 = 123456789000L;

        double Var01 = 1.23456789;
        float Var02 = 1.234F;

        char Var03 = 'c';
        String Var04 = "hello,World";

        int var_a = 10;
        int var_b = 1;
        boolean var_bool;

        var_bool = (var_a < var_b);




        System.out.println(var);
        System.out.println(var01);
        System.out.println(var_01);
        System.out.println(var$01);
        // System.out.println(var-01);
        // System.out.println(01var);
        System.out.println(VAR);
        System.out.println(Var);
        System.out.println(var02);
        System.out.println(var03);
        System.out.println(var04);
        System.out.println(var05);
        System.out.println(Var01);
        System.out.println(Var02);
        System.out.println(Var03);
        System.out.println(Var04);
        System.out.println(var_bool);
    }
}