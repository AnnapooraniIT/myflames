package myn.flames;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MyflamesActivity extends Activity {
    /** Called when the activity is first created. */
	ToggleButton x;
	  TextView t1,t2,t3,ans,tf,ta,tm,te,ts;
	  String s1,s2,s11,s22;
	  Button f,l,aa,m,e,s;
	  int i,j,a,b;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        x=(ToggleButton)findViewById(R.id.toggleButton1);
        l=(Button)findViewById(R.id.button4);
        f=(Button)findViewById(R.id.button3);
        aa=(Button)findViewById(R.id.button5);
        m=(Button)findViewById(R.id.button6);
        e=(Button)findViewById(R.id.button7);
        s=(Button)findViewById(R.id.button8);
        t1=(TextView)findViewById(R.id.editText1);
        t2=(TextView)findViewById(R.id.editText2);
        t3=(TextView)findViewById(R.id.editText4);
        tf=(TextView)findViewById(R.id.editText3);
        ta=(TextView)findViewById(R.id.editText5);
        tm=(TextView)findViewById(R.id.editText6);
        te=(TextView)findViewById(R.id.editText7);
        ts=(TextView)findViewById(R.id.editText8);
        ans=(TextView)findViewById(R.id.textView1);
        ans.setTypeface(null, Typeface.BOLD);
        ans.setBackgroundColor(Color.BLUE);
        x.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			tf.setTextColor(Color.BLACK);
			t3.setTextColor(Color.BLACK);
			ta.setTextColor(Color.BLACK);
			tm.setTextColor(Color.BLACK);
			te.setTextColor(Color.BLACK);
			ts.setTextColor(Color.BLACK);
			f.setTextColor(Color.BLACK);
			l.setTextColor(Color.BLACK);
			aa.setTextColor(Color.BLACK);
			m.setTextColor(Color.BLACK);
			e.setTextColor(Color.BLACK);
			s.setTextColor(Color.BLACK);
			
				s11=t1.getText().toString();
			       s22=t2.getText().toString();
			       StringBuffer s1=new StringBuffer(s11);
					StringBuffer s2=new StringBuffer(s22);
					 a=s1.length();
				       b=s2.length();
					label: for(int i=0;i<a;i++)
					{
						char c=s1.charAt(i);
					//	System.out.println(c);
						for(int j=0;j<b;j++)
						{
							char d=s2.charAt(j);
							if(c==d)
							{
								 ////k++;
								 s1.deleteCharAt(i);
								 s2.deleteCharAt(j);
								 ////System.out.println(s1 +" " +s2);
								 a=s1.length();
								 //m=a;
								 b=s2.length();
								 i=0;
								 j=0;
								 continue label;
							}//if
							
						}//j

				////	System.out.println(k);
					}//i
					  int d=(a+b);
					 
					  
					  StringBuffer s3=new StringBuffer("flames");
					  String s4=new String();

					for(int i=0;i<5;i++)
						{int n=-1,l=0,p=0;
							for(int j=1;j<=d;j++)
							{
							n++;
							l++;
					
							if(n>s3.length()-1)
								{
								
								if(l==d)
									{
									s3.deleteCharAt(p);
									//String s4=new String();
									s4=s3.substring(p,s3.length());
									////System.out.println(s4);
									s3.delete(p,s3.length());
									////System.out.println(s3);
									s3.insert(0,s4);
									////System.out.println(s3);
									break;
									}
									else{ p++;
									     if(p==s3.length())
									     {p=0;
									     }
				                        }
								}
							else
								{
							
								if(l==d)
									{
									s3.deleteCharAt(n);

									s4=s3.substring(n,s3.length());
									////System.out.println(s4);
									s3.delete(n,s3.length());
							    	////System.out.println(s3);
									s3.insert(0,s4);
									////System.out.println(s3);
							    	break;
									}
									//break;
					    		}

				    		}
				   		 }
					final char result=s3.charAt(0);

		           x.setChecked(false);  
			    switch(result){
			    	case 'f':
			    		Toast.makeText(getBaseContext(),"friend",Toast.LENGTH_LONG).show();
						ans.setText("FRIEND");
						f.setTextColor(Color.RED);    
					     tf.setTextColor(Color.RED);
						
			    	     break;
			    	case 'l':
			    		Toast.makeText(getBaseContext(),"love",Toast.LENGTH_LONG).show();
						ans.setText("LOVE");
						  l.setTextColor(Color.RED);    
						     t3.setTextColor(Color.RED);
							
			    		 break;
			        case 'a':
			        	Toast.makeText(getBaseContext(),"affection",Toast.LENGTH_LONG).show();
			        	ans.setText("AFFECTION");
			        	aa.setTextColor(Color.RED);    
					     ta.setTextColor(Color.RED);
						
			        	 break;
			        case 'm':
			        	Toast.makeText(getBaseContext(),"marriage",Toast.LENGTH_LONG).show();
			        	ans.setText("MARRAIGE");
			        	m.setTextColor(Color.RED);    
					     tm.setTextColor(Color.RED);
						
			        	break;
			        case 'e':
			        	Toast.makeText(getBaseContext(),"enemy",Toast.LENGTH_LONG).show();
			        	ans.setText("ENEMY");
			        	e.setTextColor(Color.RED);    
					     te.setTextColor(Color.RED);
						
			        	break;
			        case 's':
			        	Toast.makeText(getBaseContext(),"sister",Toast.LENGTH_LONG).show();
			        	ans.setText("SISTER");
			        	s.setTextColor(Color.RED);    
					     ts.setTextColor(Color.RED);
						 
			        	break;
			    		      }					
			}
		});


   

       
    }
}