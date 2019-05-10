/**  
* @Title: Court.java  
* @Package entity  
* @Description: TODO(用一句话描述该文件做什么)  
* @author PC  
* @date 2019年5月10日  
* @version V1.0  
*/ 

package entity;

import java.util.Calendar;

/**  
* @ClassName: Court  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author PC  
* @date 2019年5月10日  
*    
*/
public class Court {
	final public static int FREE = 1;
	final public static int PENDINGAPPROVAL = 2;
	final public static int APPOINTMENT = 3;
	final public static int POWFULOCCUPY = 4;
	
	private String dateString;
	private int courtId;
	private int scene;
	private int state;
	private int userId;
	
	/**
	 * @return the courtId
	 */
	public int getCourtId() {
		return courtId;
	}
	/**
	 * @param courtId the courtId to set
	 */
	public void setCourtId(int courtId) {
		this.courtId = courtId;
	}
	/**
	 * @return the scene
	 */
	public int getScene() {
		return scene;
	}
	/**
	 * @param scene the scene to set
	 */
	public void setScene(int scene) {
		this.scene = scene;
	}
	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the dateString
	 */
	public String getDateString() {
		return dateString;
	}
	/**
	 * @param dateString the dateString to set
	 */
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
	
	
	
	
	/**  
	* @Title: init_court  
	* @Description: TODO date传入的是学期结束的时间，将数据库中的所有数据清除，然后新加入从系统当前日期到date的所有记录  
	* @param @param date    参数  
	* @return void    返回类型  
	* @throws  
	*/  
	public static void init_court(String date)
	{
		String sqlString = "";
	}
	

}
