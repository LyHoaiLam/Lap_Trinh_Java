package oo.games;


public class GuessGame 
{

        // 3 biến thực thể dành cho 3 đối tượng Player
        private Player player1;
        private Player player2;
        private Player player3;
        
        void StartGame()
        {
            // Tạo 3 đối tượng Player và gán cho 3 biến thực thể
            player1 = new Player();
            player2 = new Player();
            player3 = new Player();

            // Khai báo 3 biến để lưu 3 gái trị mà 3 đấu thủ đoán
            int guessp1 = 0;
            int guessp2 = 0;
            int guessp3 = 0;

            // Khai báo 3 biến để lưu giá trị đúng/sai tùy theo câu trả lời của các đấu thủ
            boolean p1listRight = false;
            boolean p2listRight = false;
            boolean p3listRight = false;

            int targetNumber = (int) (Math.random()*10);// Sinh 1 số để 3 đấu thủ đoán
            System.out.println("I'am thinking of a number between 0 and 9...");

            while(true)
            {
                System.out.println("Number to guess is: "+ targetNumber);

                // Yêu cầu từng đấu thủ đoán ( gọi phương thức Guess())
                player1.Guess();
                player2.Guess();
                player3.Guess();

                // Lấy kết quả đoán của từng đấu thủ
                guessp1 = player1.number;
                System.out.println("Player one guessed "+ guessp1);
                guessp2 = player2.number;
                System.out.println("Player two guessed "+ guessp2);
                guessp3 = player3.number;
                System.out.println("Player three guessed "+ guessp3);

                // Kiểm tra từng người xem đoán đúng không. Nếu đúng thì đặt biến của người đó về True
                // Nhớ rằng ta đã đặt giá trị mặc định của các biến đó là False
                if(guessp1 == targetNumber)
                {
                    p1listRight = true;
                }
                if(guessp2 == targetNumber)
                {
                    p2listRight = true;
                }
                if(guessp3 == targetNumber)
                {
                    p3listRight = true;
                }

                if(p1listRight || p2listRight || p3listRight)// Nếu có ít nhất 1 người đoán đúng (|| là toán tử hoặc)
                {
                    System.out.println("We have a winner !");
                    System.out.println("Player one got it right (NGUOI CHOI 1) ?"+ p1listRight);
                    System.out.println("Player two got it right (NGUOI CHOI 2) ?"+ p2listRight);
                    System.out.println("Player three got it right (NGUOI CHOI 3)?"+ p3listRight);
                    break;
                }
                else// Nếu không thì lặp lại yêu cầu đoán số
                {
                    System.out.println("Player will have to try again");
                }

            }


        }

        
        

}

