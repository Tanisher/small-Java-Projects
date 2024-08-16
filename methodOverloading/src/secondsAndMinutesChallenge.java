public class secondsAndMinutesChallenge {

    public static int getDurationString(int seconds){
        if (seconds >0) {
            seconds = getDurationString(4, seconds);
            int minutes = seconds / 60;
            int remSeconds = seconds % 60;
            int hours = minutes / 60;
            int remMinutes = minutes % 60;
            System.out.println(hours+"h "+remMinutes+"m "+remSeconds+"s");
        }
        return 0;
    }
    public static int getDurationString(int minutes,int seconds){
        if ((minutes > 0) && ((seconds>0) && (seconds<60))) {
            int a = (minutes * 60) + seconds;
            return a;
        }else {
            System.out.println("your time is not accurate");
        }
        return 0;
    }

    public static void main(String[] args) {
        getDurationString(80);
    }

}
