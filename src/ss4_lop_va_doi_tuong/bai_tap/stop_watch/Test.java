package ss4_lop_va_doi_tuong.bai_tap.stop_watch;

public class Test {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.star();
        System.out.println("start time: " + stopWatch.getStarTime());
        for (int i = 0; i <1000 ; i++) {
            for (int j = 0; j <1000 ; j++) {
                System.out.println(" ");
            }
        }
        stopWatch.end();
        System.out.println("stop time: " + stopWatch.getEndTime());
        System.out.println("milisecon: " + stopWatch.getElapsedTime());
    }
}
