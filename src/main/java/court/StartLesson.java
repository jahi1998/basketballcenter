/**  
* @Title: StartLesson.java  
* @Package court  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author PC  
* @date 2019��5��10��  
* @version V1.0  
*/ 

package court;

import entity.Court;

/**  
* @ClassName: StartLesson  
* @Description: TODO(������һ�仰��������������)  
* @author PC  
* @date 2019��5��10��  
*    
*/
public interface StartLesson {
	
	
	/**  
	* @Title: rentCourt  
	* @Description: TODO�����д��뿪�ε��ܼ��͵ڼ��ڿ�
	* @param @param date
	* @param @return    ����  
	* @return Court    ��������  
	* @throws  
	*/  
	public abstract Court rentCourt(String weekday,int idx);

}
