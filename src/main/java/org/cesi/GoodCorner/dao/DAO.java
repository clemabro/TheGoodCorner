***REMOVED***

import java.io.Serializable;
***REMOVED***
import java.util.List;

public interface DAO<T, KeyType extends Serializable> {
	public Connection conn = ConnexionBDD.getInstance();
	
	T getById(KeyType id);

	T create(T bean);
	
	T update(T bean);

	List<T> getAll();

	void delete(KeyType id);
***REMOVED***

