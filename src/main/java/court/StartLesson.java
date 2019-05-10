/**  
* @Title: StartLesson.java  
* @Package court  
* @Description: TODO(用一句话描述该文件做什么)  
* @author PC  
* @date 2019年5月10日  
* @version V1.0  
*/ 

package court;

import entity.Court;

/**  
* @ClassName: StartLesson  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author PC  
* @date 2019年5月10日  
*    
*/
public interface StartLesson {
	
	
	/**  
	* @Title: rentCourt  
	* @Description: TODO参数中传入开课的周几和第几节课
	* @param @param date
	* @param @return    参数  
	* @return Court    返回类型  
	* @throws  
	*/  
	public abstract Court rentCourt(String weekday,int idx);

}
