package ru.netology.statistics;

public class StatsService {
    //Сумму всех продаж
    public long calculateSum (long[] purchases){
        long sum = 0;
        for (long purchase : purchases){
            sum += purchase;
        }
        return sum;
    }
    //Средняя сумма продаж в месяц
    public long calculateAverageForMonths (long[] purchases){
        long sum = calculateSum(purchases);
        long average = sum / purchases.length;
        return average;
    }
    //Месяц в котором был пик продаж
    public long peakSales (long[] purchases){
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
    public long minimumSales (long[] purchases){
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
    public long calculateCountMonthUnderAverage(long[] purchases){
        long average = calculateAverageForMonths(purchases);
        long countMonth = 0;
        for (long purchase : purchases){
            if(purchase < average){
                countMonth++;
            }
        }
        return  countMonth;
    }
    //Колличество месяцев, в котором было продаж выше среднего
    public long calculateCountMonthOverAverage(long[] purchases){
        long countMonth = 0;
        long average = calculateAverageForMonths(purchases);
        for (long purchase : purchases){
            if(purchase > average){
                countMonth++;
            }
        }
        return  countMonth;
    }
}