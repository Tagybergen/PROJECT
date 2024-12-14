import java.time.LocalDate;
import java.util.List;

public class ResearchPaper {

    public String title; // Название статьи
    public List<User> authors; // Список авторов статьи
    public String journal; // Название журнала, в котором опубликована статья
    public int citations; // Количество цитирований статьи
    public int pages; // Количество страниц в статье
    public LocalDate datePublished; // Дата публикации статьи
    public String doi; // DOI статьи

    // Конструктор по умолчанию
    public ResearchPaper() {
    }

    // Конструктор с параметрами
    public ResearchPaper(String title, List<User> authors, String journal, int citations, int pages, LocalDate datePublished, String doi) {
        this.title = title;
        this.authors = authors;
        this.journal = journal;
        this.citations = citations;
        this.pages = pages;
        this.datePublished = datePublished;
        this.doi = doi;
    }

    // Метод для получения форматированной ссылки на статью
    public String getCitation(Format format) {
        if (format == null) {
            return "Некорректный формат";
        }

        // Пример возвращения форматированной строки (можно доработать для конкретных форматов)
        switch (format) {
            case PLAIN_TEXT:
                return title + " - " + journal + ", " + datePublished.getYear();
            case BIBTEX:
                return "@article{" + title.replaceAll("\\s", "") + ",\n"
                        + "  title={" + title + "},\n"
                        + "  author={" + getAuthorsAsString() + "},\n"
                        + "  journal={" + journal + "},\n"
                        + "  year={" + datePublished.getYear() + "},\n"
                        + "  doi={" + doi + "}\n}";
            default:
                return "Формат не поддерживается";
        }
    }

    // Приватный метод для получения списка авторов в строковом виде
    private String getAuthorsAsString() {
        if (authors == null || authors.isEmpty()) {
            return "Без авторов";
        }
        StringBuilder authorsString = new StringBuilder();
        for (User author : authors) {
            authorsString.append(author.getName()).append(", ");
        }
        return authorsString.substring(0, authorsString.length() - 2); // Удаляем последнюю запятую
    }

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<User> getAuthors() {
        return authors;
    }

    public void setAuthors(List<User> authors) {
        this.authors = authors;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }
}
