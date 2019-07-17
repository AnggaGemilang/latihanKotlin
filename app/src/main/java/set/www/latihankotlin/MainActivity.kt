package set.www.latihankotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var scoreFirstTeam: Int = 0;
    var scoreSecondTeam: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tombolUpdate.setOnClickListener{

        }

        // untuk menerima data
        val firstteam = intent.getStringExtra("firstTeam")
        val secondTeam = intent.getStringExtra("seconsTeam")

        txt_first_team.text = firstteam
        txt_second_team.text = secondTeam

        updateScore(1);
        updateScore(2);

        two_point_first_team.setOnClickListener {
            addPoint(1, 2);
        }

        three_point_first_team.setOnClickListener {
            addPoint(1, 3);
        }

        two_point_second_team.setOnClickListener{
            addPoint(2,2);
        }

        three_point_second_team.setOnClickListener {
            addPoint(2, 3);
        }
    }
    fun addPoint(team: Int, point:Int){
        if (team == 1){
            scoreFirstTeam += point;
        } else {
            scoreSecondTeam += point;
        }
        updateScore(team);
    }

    fun updateScore(team: Int){
        if(team == 1){
            score_first_team.text = scoreFirstTeam.toString();
        } else {
            score_second_team.text = scoreSecondTeam.toString();
        }
    }
}
