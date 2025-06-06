package day10.question2.q2;

public class CD {
  private String title;
  private String artist;
  private int cost;

  public CD(String title, String artist, int cost) {
    this.title = title;
    this.artist = artist;
    this.cost = cost;
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public int getCost() {
    return cost;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "제목 : " + title + " 연주자 : " + artist + " 구입 가격 : " + cost;
  }
}
