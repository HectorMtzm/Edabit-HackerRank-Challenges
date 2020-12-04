package com.hectormtzm.edabit.very_hard;

/*
Function that returns which chapter is nearest to the page you're on. If two chapters are equidistant, return the chapter with the higher page number.
HM
 */

public class NearestChapter {
    public static void main(String[] args) {
        System.out.println(
            nearestChapter(new Chapter[] {
                    new Chapter("Chapter 1a", 1),
                    new Chapter("Chapter 1b", 5)
            }, 3)
        );
    }

    static String nearestChapter(Chapter[] chapter, int page){
        String prevChapter = "";
        String nextChapter = "";
        int prevChapterPage = 0;
        int nextChapterPage = 0;

        for (int i = chapter.length - 1; i > -1; i--) {
            if (page >= chapter[i].getPage()){
                prevChapter = chapter[i].getName();
                prevChapterPage = chapter[i].getPage();
                nextChapter = chapter[i+1].getName();
                nextChapterPage = chapter[i+1].getPage();
                break;
            }
        }
        return (Math.abs(prevChapterPage - page) < Math.abs(nextChapterPage - page)) ? prevChapter : nextChapter;
    }
}


class Chapter {
    private String name;
    private int page;

    public Chapter(String name, int page) {
        this.name = name;
        this.page = page;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getPage() { return page; }
    public void setPage(int page) { this.page = page; }
}