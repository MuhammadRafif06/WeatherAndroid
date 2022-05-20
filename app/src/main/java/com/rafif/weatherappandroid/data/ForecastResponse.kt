import com.google.gson.annotations.SerializedName
import com.rafif.weatherappandroid.Main
import com.rafif.weatherappandroid.WeatherItem

data class ForecastResponse(

	@field:SerializedName("list")
	val list: List<ListItem>? = null
)

data class ListItem(

	@field:SerializedName("dt_txt")
	val dtTxt: String? = null,

	@field:SerializedName("weather")
	val weather: List<WeatherItem?>? = null,

	@field:SerializedName("main")
	val main: Main? = null,

	)