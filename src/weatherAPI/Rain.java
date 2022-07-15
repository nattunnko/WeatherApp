package weatherAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * jsonファイルのrain要素の入れ子クラス
 * @author niwanatsuki
 *
 */

public class Rain {

	@JsonProperty("1h")
	public String rain1h;
}
