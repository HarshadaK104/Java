package Day7;

public class Exam<C> {
    private C code;
    public  Exam(C code){
        this.code=code;
    }
    public C getCode() {
        return code;
    };

    public void setCode(C code) {
        this.code = code;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Exam{"+
                "code:"+code+
                ",type:"+code.getClass().getSimpleName()+
                "}";
    }
}
