package weatherAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * jsonファイルのcoord要素の入れ子ファイル
 * @author niwanatsuki
 *
 */

public class coord {

	@JsonProperty("lon")
	public String lon;

	@JsonProperty("lat")
	public String lat;

}
