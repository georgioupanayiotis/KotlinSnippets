import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hbb20.CCPCountry
import com.hbb20.CountryCodePicker

class MainActivity : AppCompatActivity() ,CountryCodePicker.OnCountryChangeListener{
    private var ccp:CountryCodePicker?=null
    private var countryCode:String?=null
    private var countryName:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         ccp = findViewById(R.id.country_code_picker)
        ccp!!.setOnCountryChangeListener(this)

        //to set default country code as Japan
        
        ccp!!.setDefaultCountryUsingNameCode("UK")
    }

    override fun onCountrySelected() {
        countryCode=ccp!!.selectedCountryCode
        countryName=ccp!!.selectedCountryName

        Toast.makeText(this,"Country Code "+countryCode,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Country Name "+countryName,Toast.LENGTH_SHORT).show()
    }

}
