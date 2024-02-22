public class DataStructureFactory {
    public static Stack<?> getStack(int type) {
        switch (type) {
            case 3:
                return new ArrayListStack<>();
            case 4:
                return new VectorStack<>();
            default:
                throw new IllegalArgumentException("Tipo de Stack no soportado.");
                
        }
    }

    public static List<?> getList(int type) {
        switch (type) {
            case 1:
                return new SLList<>();
            case 2:
                return new DLList<>();
            default:
                throw new IllegalArgumentException("Tipo de List no soportado.");
        }
    }
}