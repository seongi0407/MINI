package member;

public class MemberVo {
	private String member_no;
	private String id;
	private String pwd;
	private String nick;
	private String phone;
	private String memberAddress;
	private String member_delYn;
	
	// Constructor
	public MemberVo() {
	}
	public MemberVo(String member_no, String id, String pwd, String nick, String phone, String memberAddress,
			String member_delYn) {
		this.member_no = member_no;
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
		this.phone = phone;
		this.memberAddress = memberAddress;
		this.member_delYn = member_delYn;
	}
	
	@Override
	public String toString() {
		return "MemberVo [member_no=" + member_no + ", id=" + id + ", pwd=" + pwd + ", nick=" + nick + ", phone="
				+ phone + ", memberAddress=" + memberAddress + ", member_delYn=" + member_delYn + "]";
	}
	
	// Getter, Setter
	public String getMember_no() {
		return member_no;
	}
	public void setMember_no(String member_no) {
		this.member_no = member_no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMember_delYn() {
		return member_delYn;
	}
	public void setMember_delYn(String member_delYn) {
		this.member_delYn = member_delYn;
	}
} // class
