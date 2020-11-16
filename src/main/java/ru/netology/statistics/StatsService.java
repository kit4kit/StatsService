package ru.netology.statistics;

public class StatsService {
    //Сумму всех продаж
    public long CalculateSum (long[] purchases){
        long sum = 0;
        for (long purchase : purchases){
            sum += purchase;
        }
        return sum;
    }
    //Средняя сумма продаж в месяц
    public long CalculateAverageForMonths (long[] purchases){
        long sum = 0;
        long month = 12;
        for (long purchase : purchases){
            sum += purchase;
        }
        long average = sum / month;
        return average;
    }
    //Месяц в котором был пик продаж
    public long PeakSales (long[] purchases){
        long peak = 0;
        long numberMonth = 0;
        long currentMonth = 1;
        for(long purchase : purchases){
            if(purchase >= peak){
                peak = purchase;
                numberMonth = currentMonth;
            }
            currentMonth++;
        }
        return numberMonth;
    }
    //Месяц в котором был минимум продаж
    public long MinimumSales (long[] purchases){
        long minimun = purchases[0];
        long numberMonth = 0;
        long currentMonth = 1;
        for(long purchase : purchases){
            if(purchase <= minimun){
                numberMonth = currentMonth;
            }
            currentMonth++;
        }
        return numberMonth;
    }
    //Колличество месяцев, в котором было продаж ниже среднего
    public long CalculateCountMonthUnderAverage(long[] purchases){
        long sum = 0;
        long month = 12;
        for (long purchase : purchases){
            sum += purchase;
        }
        long average = sum / month;
        long countMonth = 0;
        for (long purchase : purchases){
            if(purchase < average){
                countMonth++;
            }
        }
        return  countMonth;
    }
    //Колличество месяцев, в котором было продаж выше среднего
    public long CalculateCountMonthOverAverage(long[] purchases){
        long sum = 0;
        long month = 12;
        for (long purchase : purchases){
            sum += purchase;
        }
        long average = sum / month;
        long countMonth = 0;
        for (long purchase : purchases){
            if(purchase > average){
                countMonth++;
            }
        }
        return  countMonth;
    }
}
