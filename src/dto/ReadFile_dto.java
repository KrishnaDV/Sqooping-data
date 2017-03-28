package dto;

public class ReadFile_dto {

	private String exchange;

	private String s_sym;

	private String dt;

	private float s_p_o;

	private float s_p_h;

	private float s_p_l;

	private float s_p_c;

	private int s_v;

	private float s_p_a_c;

	public ReadFile_dto(String exchange, String s_sym, String dt, float s_p_o,
			float s_p_h, float s_p_l, float s_p_c, int s_v, float s_p_a_c) {
		this.exchange = exchange;
		this.s_sym = s_sym;
		this.dt = dt;
		this.s_p_o = s_p_o;
		this.s_p_h = s_p_h;
		this.s_p_l = s_p_l;
		this.s_p_c = s_p_c;
		this.s_v = s_v;
		this.s_p_a_c = s_p_a_c;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getS_sym() {
		return s_sym;
	}

	public void setS_sym(String s_sym) {
		this.s_sym = s_sym;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public float getS_p_o() {
		return s_p_o;
	}

	public void setS_p_o(float s_p_o) {
		this.s_p_o = s_p_o;
	}

	public float getS_p_h() {
		return s_p_h;
	}

	public void setS_p_h(float s_p_h) {
		this.s_p_h = s_p_h;
	}

	public float getS_p_l() {
		return s_p_l;
	}

	public void setS_p_l(float s_p_l) {
		this.s_p_l = s_p_l;
	}

	public float getS_p_c() {
		return s_p_c;
	}

	public void setS_p_c(float s_p_c) {
		this.s_p_c = s_p_c;
	}

	public int getS_v() {
		return s_v;
	}

	public void setS_v(int s_v) {
		this.s_v = s_v;
	}

	public float getS_p_a_c() {
		return s_p_a_c;
	}

	public void setS_p_a_c(float s_p_a_c) {
		this.s_p_a_c = s_p_a_c;
	}

	@Override
	public String toString() {
		return "ReadFile_dto [exchange=" + exchange + ", s_sym=" + s_sym
				+ ", dt=" + dt + ", s_p_o=" + s_p_o + ", s_p_h=" + s_p_h
				+ ", s_p_l=" + s_p_l + ", s_p_c=" + s_p_c + ", s_v=" + s_v
				+ ", s_p_a_c=" + s_p_a_c + "]";
	}

}
