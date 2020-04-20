public class Page {
    public int pageNumber;
    public int numberOfWords;
    public String footnote;

    public Page(int pageNumber, int numberOfWords, String footnote) {
        super();
        this.pageNumber = pageNumber;
        this.numberOfWords = numberOfWords;
        this.footnote = footnote;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    public String getFootnote() {
        return footnote;
    }

    public void setFootnote(String footnote) {
        this.footnote = footnote;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNumber=" + pageNumber +
                ", numberOfWords=" + numberOfWords +
                ", footnote='" + footnote + '\'' +
                '}';
    }
}
