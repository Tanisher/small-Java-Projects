public class excercise {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if ((width <=0)||(height <=0)||(areaPerBucket<=0)|| extraBuckets<0){
            return -1;
        }
        double area = width * height;
        double coveredwall = areaPerBucket * extraBuckets;
        double arealeft = area - coveredwall;
        double bucketsFraction = arealeft / areaPerBucket;
        int buckets = (int)Math.ceil(bucketsFraction);
        return buckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if ((width <=0)||(height <=0)||(areaPerBucket<=0)){
            return -1;
        }
        return ((int)Math.ceil((height*width)/areaPerBucket));
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75,3.25,2.5));
    }
}
