import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fibonacci.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FibonacciAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        adapter = FibonacciAdapter(getFibonacciNumbers())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun getFibonacciNumbers(): List<Int> {
        val fibonacciNumbers = mutableListOf(0, 1)
        for (i in 2 until 100) {
            val nextNumber = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2]
            fibonacciNumbers.add(nextNumber)
        }
        return fibonacciNumbers
    }
}