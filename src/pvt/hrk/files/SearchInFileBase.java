package pvt.hrk.files;

import java.io.File;
import java.io.IOException;
import java.util.function.Predicate;

import pvt.hrk.utils.SearchInString.StringSearchModes;

public abstract class SearchInFileBase {

	
	private String searchString;
	private StringSearchModes searchMode;
	protected File file;
	public SearchInFileBase(File file,String searchString) {
		super();
		this.searchString = searchString;
		this.searchMode = StringSearchModes.evaluate(searchString);
		this.file = file;
	}
	
	protected Predicate<String> match=line-> searchMode.doSearch(line, searchString);
	
	public boolean searchInName() {
		return match.test(file.getAbsolutePath());
	}
	protected abstract boolean searchContents() throws IOException;

}
