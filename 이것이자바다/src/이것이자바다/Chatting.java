package �̰����ڹٴ�;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;  //(X) 
		//���� --> String nickName = chatId;
		
		Chat chat = new Chat() {
			
			@Override
			public void start() {
				while(true) {
					String inputDate = "�ȳ��ϼ���";
					String message = "[" + nickName + "]" + inputDate;
					//nickName�� final�� ����� ����� chatId�� �ʱ�ȭ�� �Ұ����ϴ�.
					//null�� �ϳ��� ������ �ν��ϱ� ����.
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}

}
