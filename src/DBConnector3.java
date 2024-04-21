import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector3 {

	/*JDBCのドライバーの名前を変数に代入している。
	 * ドライバーはjavaとデータベースを繋げる工具箱のようなもの*/
	private static String driverName = "com.mysql.jdbc.Driver";

	/*mysql用のURLの指定の仕方。
	 * localhost（自分の使っているPC）testdb（データベース名）を使う。
	 * ？以降はオプションなので必須ではない*/
	private static String url = "jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

	//上記で指定したrootアカウントに対するパスワードをmysqlに指定している
	private static String user = "root";

	//mysqlにログインするための値の準備をしている
	private static String password = "root";

	//接続状態にする
	public Connection getConnection() {

		/*一度状態を初期化にしている。
		 * この二つは接続しかしないクラス。公式として覚える*/
		Connection con = null;

		//try.catchはjavaの例外処理のための構文
		try {

			//tryの中にはエラーが発生しそうな処理を書く
			Class.forName(driverName);

			//ドライバーがロードされ使えるような状態にしている、覚える。
			con = DriverManager.getConnection(url, user, password);

		/*tryの中でエラーが発生した場合、catchが受け取り
		 * printStackTraceでエラーに至る履歴を表示してくれる*/
		//ClassNotFoundException（クラスが見つからない場合の例外）
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		//SQLException（データベース処理に関する例外）
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//戻り値
		return con;

	}

}
