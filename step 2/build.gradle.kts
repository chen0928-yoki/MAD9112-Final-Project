// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

import android.os.Bundle
        import android.widget.TextView
        import androidx.appcompat.app.AppCompatActivity
        import java.text.SimpleDateFormat
        import java.util.*

class Finalproject : AppFinalproject () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentDate = getCurrentDate()

        val modifiedName = "Qianyuchen $currentDate"

        val displayTextView: TextView = findViewById(R.id.displayTextView)
        displayTextView.text = modifiedName
    }

    private fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("yyyy/MM/dd", Locale.getDefault())
        val currentDate = Date()
        return dateFormat.format(currentDate)
    }
}














