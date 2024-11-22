public class ShapeFactory {
    public Factory computeFactory(String Type){
        if(Type==null){
            return null;
        }
        if(Type.equalsIgnoreCase("circles")){
            return new circles();
        } else if (Type.equalsIgnoreCase("squares")) {
            return new squares();
        } else if (Type.equalsIgnoreCase("rectangle")) {
            return new rectangle();
        }
        return null;
    }

}