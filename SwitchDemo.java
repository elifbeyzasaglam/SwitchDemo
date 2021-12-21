
package switchdemo;

public class SwitchDemo {

    public static void main(String[] args) {
    char grade='C';
    
    switch(grade){
        case'A':
            System.out.println("Mükemmel Geçtiniz");
            break;
            case'B':
                System.out.println("Güzel Geçtiniz");
                break;
            case'C':
                System.out.println("Çok İyi Geçtiniz");
                break;
                case'D':
                    System.out.println("İyi Geçtiniz");
                    break;
                    case'F':
                        System.out.println("Maalesef Kaldınız" );
                        break;
                    default:
                        System.out.println("Geçersiz not girdiniz");
             
            

                
    }
            
    }
    
}
