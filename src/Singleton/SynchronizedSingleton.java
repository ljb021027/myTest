package Singleton;
/**
 * Ë«ÖØ¼ÓËø
 * @author ljb
 *
 */
public class SynchronizedSingleton {
	private SynchronizedSingleton synSingleton;
	
	private SynchronizedSingleton(){
		
	};
	
	public SynchronizedSingleton getSynchronizedSingleton(){
		if(synSingleton==null){
			synchronized (synSingleton) {
				if(synSingleton==null){
					synSingleton =  new SynchronizedSingleton();
				}
			}
		}
		return synSingleton;
	}
}
