import java.util.Scanner;

public class lab8 { //основной класс
	public static void main(String[] args) {
		int x, y, z, n; //переменные
		String s1, s2, s3; //строки
		Scanner in = new Scanner(System.in);
		result res = new result();
		int a, b, c;
		System.out.println("Input information about the 1 book\n"); //ввод информации о книге
		System.out.printf("Input number of specials: ");
		n = in.nextInt();
		special[] spec_offer1 = new special[n];
		for(int i = 0; i < n; i++)
		{
			spec_offer1[i] = new special();
		}
		System.out.printf("Input title: ");
		s1 = in.next();
		System.out.printf("Input author: ");
		s2 = in.next();
		System.out.printf("Input genre: ");
		s3 = in.next();
		System.out.printf("Input price: ");
		x = in.nextInt();
		System.out.printf("Input number in stock: ");
		y = in.nextInt();
		System.out.printf("Input popularity: ");
		z = in.nextInt();
		book_store book1 = new book_store(s1, s2, s3, x, y, z, n, spec_offer1);
		in.close();
		book1.get_title();
		book1.get_author();
		book1.get_genre();
		book1.get_price();
		book1.get_num_stock();
		book1.get_popularity();
		//book1.get_spec_offer();
		book1.output(); //вывод
		book1.sell(); //продажа
		book1.output();
		book1.price_rise(); //повышение цены
		book1.output();
		book1.rearrange(); //перестановка
		book1.output();
		book1.archivate(); //отправка на склад
		book1.output();
		book1.reduce_bonus(); //уменьшение количества бонусов
		book1.output();
		a = book1.predictable_profit();
		System.out.printf("\nPredictable profit (using func): %d", a); //возврат значения через функцию
		book1.predictable_profit(res);
		c=res.value;
		System.out.printf("\nPredictable profit (using class arg): %d", c);  //возврат значения через дополнительный класс
		System.out.printf("\n\nLength of the 'genre' (static method): %d\n", book_store.genre_len(book1));  //подсчет длины строки 'жанр' через статический метод
		book1.space_left = 50;
		System.out.printf("\nSpace left in the store (static field): %d\n", book1.space_left); //вывод оставшегося места в книжном магазине через статическое поле
		book1.title_author_compare(); //сравнение автора и названия
	}
}
	