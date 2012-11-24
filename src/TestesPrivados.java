
public class TestesPrivados {
	private int contadorNaoUtilizado;
	@SuppressWarnings("unused")
	private void metodoNaoInvocado() {
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.nanoTime();
	}
	public int getContadorNaoUtilizado() {
		return contadorNaoUtilizado;
	}
	public void setContadorNaoUtilizado(int contadorNaoUtilizado) {
		this.contadorNaoUtilizado = contadorNaoUtilizado;
	}

}
