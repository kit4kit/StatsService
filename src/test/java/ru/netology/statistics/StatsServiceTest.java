package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.CalculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageForMonths() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.CalculateAverageForMonths(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void peakSales() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.PeakSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void minimumSales() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.MinimumSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateCountMonthUnderAverage() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.CalculateCountMonthUnderAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateCountMonthOverAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.CalculateCountMonthOverAverage(purchases);
        assertEquals(expected, actual);
    }
}