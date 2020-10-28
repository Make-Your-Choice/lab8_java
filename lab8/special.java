public class special {
	int bonus_num; //число бонусов
	public special() { //конструктор
		this.bonus_num = 5;
	}
	public void reduce_bonus() { //сокращение числа бонусов
		System.out.println("\nDecreasing number of bonuses");
		this.bonus_num = bonus_num - 2;
		System.out.println("Number of bonuses decreased on 2");
	}
	public void set_default() { //установка значений по умолчанию
		this.bonus_num = 5;
	}
}