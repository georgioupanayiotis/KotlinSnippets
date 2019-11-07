import net.panayiotisgeorgiou.kotlinretrofit.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("photos")
    fun getPhotos(): Call<List<DataModel>>

}
