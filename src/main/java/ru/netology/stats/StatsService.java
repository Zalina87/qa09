package ru.netology.stats;

public class StatsService {
    public long calculateSumOfSales(long[] sales) {
        long SumOfSales = 0;
        for (long sale : sales) {
            SumOfSales += sale;
        }
        return SumOfSales; // сумма продаж за год/
    }

    public long calculateAverageSale(long[] sales) {
        return calculateSumOfSales(sales) / 12; // средние продажи
    }

    public int calculateMinSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int calculateMaxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int calculateMonthsBelowAverage(long[] sales) {
        int counterBelowAverage = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counterBelowAverage++;
            }
        }
        return counterBelowAverage;
    }

    public int calculateMonthsAboveAverage(long[] sales) {
        int counterAboveAverage = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counterAboveAverage++;
            }
        }
        return counterAboveAverage;
    }
}