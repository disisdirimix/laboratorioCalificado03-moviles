import com.gutierrez.francisco.laboratoriocalificado03.TeacherResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("list/teacher")
    fun getTeachers(): Call<TeacherResponse>
}
