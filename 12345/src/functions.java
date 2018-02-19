import java.text.DecimalFormat;

public class functions {
	// Установка формата чисел для выводимых данных
	DecimalFormat format = new DecimalFormat("0.##");
	// Тариф на холодную воду
	public double cold_water_tarif = 21.03; 
	
	/* 	Метод, расчитывающий стоимость хол. воды (индивидуальное потребление).
	 *	На вход подается число - кол-во проживающих в квартире.
	 */
	public String cold_water (int kolvo_chelovek) {
		// Норматив потребления хол. воды
    	double cold_water_norm = 5.48;
    	// Результат расчета = кол-во проживающих в квартире*норматив потребления*тариф
    	double cold_water_result = (double)kolvo_chelovek*cold_water_norm*cold_water_tarif;
    	// Возвращение результата будет производиться только в том случае, если он не превышает максимально допустимого
    	if (cold_water_result > 0 && cold_water_result < 9999) {
    		return String.valueOf(format.format(cold_water_result));
    	}
    	// В противном случае будет возвращена пустая строка
    	else return "";
	}
	
	/* Метод, расчитывающий стоимость гор. воды (индивидуальное потребление).
	*  На вход подается число - кол-во проживающих в квартире.
	*/
	public String hot_water (int kolvo_chelovek) {
		// Норматив потребления гор. воды
    	double hot_water_norm = 3.81;
    	// Тариф на гор. воду
    	double hot_water_tarif = 84.48;
    	// Результат расчета = кол-во проживающих*норматив потребления*тариф
    	double hot_water_result = (double)kolvo_chelovek*hot_water_norm*hot_water_tarif;
    	// Возвращение результата будет производиться только в том случае, если он не превышает максимально допустимого
    	if (hot_water_result > 0 && hot_water_result < 9999) {
        	return String.valueOf(format.format(hot_water_result));
    	}
    	// В противном случае будет возвращена пустая строка
    	else return "";
	}
	
	/* Метод, расчитывающий стоимость водоотведения.
	 * На вход подается число - кол-во проживающих в квартире.
	 */
	public String vodootvod (int kolvo_chelovek) {
		// Нормативный объем потребления
		double vodootvod_norm = 9.29;
		// Результат = нормативный объем*кол-во проживающих*тариф (хол. вода)
    	double vodootvod_result = vodootvod_norm*kolvo_chelovek*cold_water_tarif;
    	// Возвращение результата будет производиться только в том случае, если он не превышает максимально допустимого
    	if (vodootvod_result > 0 && vodootvod_result < 9999) {
    		return String.valueOf(format.format(vodootvod_result));
    	}
    	// В противном случае будет возвращена пустая строка
    	else return "";
	}
	
	/* Метод, расчитывающий стоимость газоснабжения.
	 * На вход подается число - кол-во проживающих в квартире.
	 */
	public String gaz (int kolvo_chelovek) {
		// Норматив потребления в месяц
    	double gaz_norm = 10.40;
    	// Тариф
    	double gaz_tarif = 5.24152;
    	// Результат расчета = норматив потребления*тариф*кол-во проживающих
    	double gaz_result = gaz_norm*gaz_tarif*kolvo_chelovek;
    	// Возвращение результата будет производиться только в том случае, если он не превышает максимально допустимого
    	if (gaz_result > 0 && gaz_result <9999) {
    		return String.valueOf(format.format(gaz_result));
    	}
    	// В противном случае будет возвращена пустая строка
    	else return "";
	}
	
	/* Метод, расчитывающий стоимость холодной воды (общедомовое потребление).
	*  На вход подаются числа - объем холодной воды по общедомовому прибору учета,
	*  объем хол. воды потребленной в квартирах оснащенных индивидуальными приборами учета,
	*  объем хол. воды потребленной в квартирах не оборудованных индвидуальными приборами учета,
	*  общая площадь помещений в доме, площадь квартиры. 
	*/
	public String cold_water_mutual (double cold_water_total, double cold_water_count, double cold_water_no_count, double S_total, double S_house) {
		// Тариф на хол. воду
		double cold_water_tarif = 21.03;
		/*Результат = (объем воды по общедомовому прибор учета - объем в квартирах не оборудованных приборами учета -
		 * - объем в квартирах оборудованных приборами учета)/(Плошадь квартиры/Плошадь всех помещений в доме)*тариф
    	*/
    	double cold_water_mutual_result = (cold_water_total - cold_water_no_count - cold_water_count)*(S_house/S_total)*cold_water_tarif;
    	// Возвращение результата будет производиться только в том случае, если он не превышает максимально допустимого
    	if (cold_water_mutual_result > 0 && cold_water_mutual_result < 9999) {
    		return String.valueOf(format.format(cold_water_mutual_result));
    	}
    	// В противном случае будет возвращена пустая строка
    	else return "";
	}
	
	/* Метод, расчитывающий стоимость горячей воды (обшедомовое потребление).
	*  На вход подаются числа - объем гор. воды по общедомовому прибору учета,
	*  объем горячей воды потребленный в нежилых помещениях, объем горячей воды потребленной в квартирах оснащенных индивидуальными приборами учета,
	*  объем горячей воды потребленный в квартирах не оборудованных индивидуальными приборами учета,
	*  общая площадь помещений в доме, площадь квартиры. 
	*/
	public String hot_water_mutual (double hot_water_total, double hot_water_nolivingthing, double hot_water_count, double hot_water_nocount, double S_total, double S_house) {
		// Тариф на гор. воду
		double hot_water_tarif = 84.48;
		/*	Результат = (объем воды по общедомовому прибору учета - объем воды в нежилых помещениях -
		 *  - объем воды в квартирах не оборудованных приборами учета - объем воды в квартирах оборудованных приборами учета)/
		 *	/(Плошадь квартиры/Площадь всех помещений в доме)*тариф
		 */
		double hot_water_mutual_result = (hot_water_total - hot_water_nolivingthing - hot_water_nocount - hot_water_count)*(S_house/S_total)*hot_water_tarif;
    	// Возвращение результата будет производиться только в том случае, если он не превышает максимально допустимого
		if (hot_water_mutual_result > 0 & hot_water_mutual_result < 9999) {
			return String.valueOf(format.format(hot_water_mutual_result));
		}
    	// В противном случае будет возвращена пустая строка
		else return "";
	}
	
	/*  Метод, расчитывающий стоимость тепловой энергии (отопления).
	 *  На вход подаются числа - объем тепловой энергии по общедомовому прибору учета,
	 *  общая плошадь помещений в доме, плошадь квартиры.
	 */
	public String otoplenie (double otoplenie_value, double S_total, double S_house) {
		// Тариф на тепловую энергию
		double otoplenie_tarif = 1408.01;
		/* Результат = объем телповой энергии по общедомовому прибору учета*
		 * *(Плошадь квартиры/Плошадь всех помещений в доме)*тариф
		 */
		double otoplenie_result = otoplenie_value*(S_house/S_total)*otoplenie_tarif;
    	// Возвращение результата будет производиться только в том случае, если он не превышает максимально допустимого
    	if (otoplenie_result > 0 && otoplenie_result < 9999) {
    		return String.valueOf(format.format(otoplenie_result));
    	}
    	// В противном случае будет возвращена пустая строка
    	else return "";
	}
	
	/* Метод, расчитывающий стоимость электроэнергии (общедомовой).
	 * На вход подаются числа - объем элекроэнергии по общедомовоу прибору учета (день),
	 * объем элекроэнергии по общедомовоу прибору учета (ночь),
	 * общая плошадь помещений в доме, плошадь квартиры.
	 */
	public String electro (double electro_day, double electro_night, double S_total, double S_house) {
		// Тариф на электроэнергию (дневной)
		double electro_tarif_day = 3.55;
		// Тариф на электроэнергию (ночной)
    	double electro_tarif_night = 2.14;
    	// Расчет дневной электроэнергии = дневной тариф*(Плошадь квартиры/Плошадь всех помещений в доме)
    	double electro_day_result = electro_day*(S_house/S_total);
    	// Расчет ночной электроэнергии = ночной тариф*(Плошадь квартиры/Плошадь всех помещений в доме)
    	double electro_night_result = electro_night*(S_house/S_total);
    	// Результат = Дневная электроэнергия*тариф + Ночная электроэнергия*тариф
    	double electro_result = electro_day_result*electro_tarif_day+electro_night_result*electro_tarif_night;
    	// Возвращение результата будет производиться только в том случае, если он не превышает максимально допустимого
    	if (electro_result > 0 && electro_result <9999) {
    		return String.valueOf(format.format(electro_result));
    	}
    	// В противном случае будет возвращена пустая строка
    	else return "";
	}
	
	/* Метод, суммирующий все результаты. На вход подаются числа - результаты расчетов.
	*/
	public String sum (double it1, double it2, double it3, double it4, double it5, double it6, double it7, double it8){
		return String.valueOf(format.format(it1 + it2 + it3 + it4 + it5 + it6 + it7 + it8));
	}
}