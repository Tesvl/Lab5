public class Person {

    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Long height; //Поле может быть null, Значение поля должно быть больше 0
    private Float weight; //Поле может быть null, Значение поля должно быть больше 0
    private String passportID; //Строка не может быть пустой, Поле может быть null
    private Color eyeColor; //Поле может быть null
    private Location location; //Поле может быть null

    }


