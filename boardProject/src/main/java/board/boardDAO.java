package board;

public class boardDAO {
	private String createSQL = "insert into board values(?,?,?,?,?,?)";
	private String readSQL = "select * from board";
	private String updateSQL = "update board set title=?, wirter=?, content=? where seq=? ";
	private String deleteSQL = "delete from board where seq=?";
	
	//생성
}
