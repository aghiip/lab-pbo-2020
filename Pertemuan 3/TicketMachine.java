
/**
 * Write a description of class TicketMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicketMachine
{
    private int price;
    private int balance;
    private int total;
      
    public TicketMachine(int ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
    }

    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
    }

    /* method ini digunakan untuk mengembalikan nilai dari price*/
    public int getPrice()
    {
        return price;
    }

    /* method ini digunakan untuk mengembalikan nilai dari balance*/
    public int getBalance()
    {
        return balance;
    }

    /*method ini terdapat beberapa parameter, kondisi dan operasi aritmatika*/
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("masukkan uang bernilai positif : "+amount);
        }
    }

    /*method ini terdapat beberapa kondisi dan operasi aritmatika*/
    public void printTicket()
    {
        if(balance >= price){
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            total = total + price;
            balance = balance - price;
            
            int sisa = this.refundBalance();
            if(sisa > 0)
                System.out.println("Uang kembalian : "+sisa);
        }
        else {
            System.out.println("Uang anda kurang, silahkan masukkan : "+(price - balance) + " cents lagi.");
        }
    }
    
    /*method ini yang digunakan untuk mengembalikan nilai dari amountToRefund*/
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
