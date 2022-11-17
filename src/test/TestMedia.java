package test;

public class TestMedia {

	public static void main(String[] args) {
		Media book=new Media<String>();
		book.setMediaName("Let Us C");
		System.out.println(book.getMediaName());
		
		Media video=new Media<String>();
		video.setMediaName("Movie");
		System.out.println(video.getMediaName());
		
		Media newspaper=new Media<String>();
		newspaper.setMediaName("The Times of India");
		System.out.println(newspaper.getMediaName());


	}

}
