package talex.zsw.flavorsdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : BaseMVPActivity() {

    var mLinearLayout: LinearLayout? = null
    var mTvTitle: TextView? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mLinearLayout = findViewById(R.id.mLinearLayout)
        mTvTitle = findViewById(R.id.mTvTitle)

        mTvTitle?.text =
            "包名 = ${packageManager.getPackageInfo(packageName, 0).packageName}\n" +
                    "应用名 = ${resources.getString(
                        packageManager.getPackageInfo(
                            packageName,
                            0
                        ).applicationInfo.labelRes
                    )}\n" +
                    "talex.zsw.flavorsdemo.Constant.info = ${Constant.info}\n" +
                    "渠道名称 = ${BuildConfig.FLAVOR}\n"+
                    "app build.gradle CHANNEL = ${BuildConfig.CHANNEL}"


        mLinearLayout?.addView(view)
    }


}
