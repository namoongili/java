package Tamagotchi;

public abstract class TamaPet {
    protected int 체력;
    protected int 스트레스;
    protected int 친밀도;
    protected int 포만감;
    protected int 질병;
    protected static final int MAX_STAT = 200; 

    public TamaPet(int 체력, int 스트레스, int 친밀도, int 포만감, int 질병) {  
        this.체력 = 체력;
        this.스트레스 = 스트레스;
        this.친밀도 = 친밀도;
        this.포만감 = 포만감;
        this.질병 = 질병;
        validateStatus();
    }

    protected void validateStatus() {
        체력 = Math.max(0, Math.min(체력, MAX_STAT));
        스트레스 = Math.max(0, Math.min(스트레스, MAX_STAT));
        친밀도 = Math.max(0, Math.min(친밀도, MAX_STAT));
        포만감 = Math.max(0, Math.min(포만감, MAX_STAT));
        질병 = Math.max(0, Math.min(질병, MAX_STAT));
    }

    protected void adjust체력(int amount) {
        체력 += amount;
        validateStatus();
    }

    protected void adjust스트레스(int amount) {
        스트레스 += amount;
        validateStatus();
    }

    protected void adjust친밀도(int amount) {
        친밀도 += amount;
        validateStatus();
    }

    protected void adjust포만감(int amount) {
        포만감 += amount;
        validateStatus();
    }

    protected void adjust질병(int amount) {
        질병 += amount;
        validateStatus();
    }

    public abstract String 캐릭터선택();
    public abstract String 상태창();
    public abstract String 애정도올리기();
    public abstract String 통신하기();
}