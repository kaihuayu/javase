package cn.itxdl.day10;

public interface Metal {
	//�Զ�����󷽷��������������Ϊ
	public abstract void shine();
	
	//�ýӿ������ӵķ�����Ӱ��ʵ����
	public default void test() {
		System.out.println("��������Ƿ���д���������Ҫ");
	}

}
