***REMOVED***

import java.io.Serializable;
import java.util.List;

public interface DAO<T, KeyType extends Serializable> {
	T getById(KeyType id);

	T create(T bean);
	
	T update(T bean);

	List<T> getAll();

	void delete(KeyType id);
***REMOVED***

