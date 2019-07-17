package set.www.latihankotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val firstTeam = editTeamPertama.text.toString()
        val secondTeam = editTeamKedua.text.toString()

        if (firstTeam.length == 0 || secondTeam.length == 0){
            Toast.makeText(applicationContext, "isi nama dengan benar", Toast.LENGTH_SHORT).show();
        } else {
            val intent: Intent = Intent(applicationContext, MainActivity::class.java);
            // untuk mengirimkan data;
            intent.putExtra("firstTeam",firstTeam)
            intent.putExtra("Second Team", secondTeam)
            startActivity(intent);
        }
    }
}
