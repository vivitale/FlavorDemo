package talex.zsw.flavorsdemo;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

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
		ImageView imageView = new ImageView(this);
		imageView.setImageResource(R.mipmap.ic_launcher);
		return imageView;
	}
}