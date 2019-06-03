package talex.zsw.flavorsdemo;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * 作用：基于MVP架构的Activity基类
 * 作者：赵小白 email:vvtale@gmail.com  
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public abstract class BaseMVPActivity extends AppCompatActivity
{
	public View getView()
	{
		TextView textView = new TextView(this);
		textView.setText("1111111111");
		return textView;
	}
}
