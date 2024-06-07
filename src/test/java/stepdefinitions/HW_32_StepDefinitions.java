package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import pages.NotePage;

import java.util.Map;

public class HW_32_StepDefinitions {
/*
     Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
     Add 50 titles and notes by using Data Table
*/

    @When("user enters titles and notes and clicks on add")
    public void user_enters_titles_and_notes_and_clicks_on_add(DataTable dataTable) throws InterruptedException {
        NotePage notePage = new NotePage();

        Map<String,String> titleNote = dataTable.asMap();

        for (Map.Entry<String,String> w: titleNote.entrySet()){
            String title = w.getKey();
            String note = w.getValue();

            notePage.title.sendKeys(title);
            notePage.note.sendKeys(note);
            notePage.add.click();

            Thread.sleep(1000);
        }
    }
}
