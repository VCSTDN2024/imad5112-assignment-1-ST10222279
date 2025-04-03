package vcmsa.ci.mealsuggester

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeInput = findViewById<EditText>(R.id.InputTime)
        val suggestButton = findViewById<Button>(R.id.btnSuggest)
        val resetButton = findViewById<Button>(R.id.btnReset)
        val mealSuggestion = findViewById<TextView>(R.id.txtSuggestion)
        val mealImage = findViewById<ImageView>(R.id.mealImage)


        suggestButton.setOnClickListener {
            val timeOfDay = timeInput.text.toString().trim().lowercase()
            val suggestion = getMealSuggestion(timeOfDay)
            if (suggestion != null) {
                val (mealText, mealImageRes)= suggestion
                mealSuggestion.text = "Suggested Meal: $mealText"
                mealImage.setImageResource(mealImageRes)
                mealImage.visibility= View.VISIBLE
            }
            else {
                Toast.makeText(this, "Invalid input! Please enter a valid time of day.", Toast.LENGTH_SHORT).show()
                mealImage.visibility= View.GONE
            }
        }

        resetButton.setOnClickListener {
            timeInput.text.clear()
            mealSuggestion.text = ""
            mealImage.visibility = View.GONE
        }
    }

    private fun getMealSuggestion(time: String): Pair<String, Int>? {
        val mealList = mapOf(
            "morning" to listOf("Eggs and Toast" to R.drawable.eggs_and_toast, "Pancakes" to R.drawable.pancakes,"Oatmeal" to R.drawable.oats),
            "mid-morning" to listOf("Fruit Snack" to R.drawable.fruit_salad, "Granola Bar" to R.drawable.granola_bars, "Yoghurt" to R.drawable.yoghurt),
            "afternoon" to listOf("Sandwich" to R.drawable.sandwich, "Salad" to R.drawable.salad, "Grilled Chicken" to R.drawable.grilled_chicken),
            "mid-afternoon" to listOf("Cake" to R.drawable.cake, "Cookies" to R.drawable.cookie, "Smoothie" to R.drawable.smoothie),
            "dinner" to listOf("Pasta" to R.drawable.pasta, "Steak with Vegetables" to R.drawable.steak, "Stir-fried Tofu" to R.drawable.tofu),
            "after dinner" to listOf("Ice Cream" to R.drawable.ice_cream, "Cheesecake" to R.drawable.cheesecake, "Hot Chocolate" to R.drawable.hot_chocolate)
        )


        return mealList[time]?.random()
    }
}

