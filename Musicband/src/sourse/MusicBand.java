package sourse;

import java.util.PriorityQueue;
import java.util.Objects;

public class MusicBand {
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Boolean realHero; //Поле не может быть null
    private Boolean hasToothpick; //Поле не может быть null
    private Integer impactSpeed; //Поле не может быть null
    private String soundtrackName; //Поле не может быть null
    private float minutesOfWaiting;


    /**
     * New human
     * @param id id
     * @param name name
     * @param coordinates coordinates
     * @param creationDate creation date
     * @param realHero realHero
     * @param hasToothpick hasToothpick
     * @param impactSpeed impactSpeed
     * @param soundtrackName soundTrackName
     * @param minutesOfWaiting minutesOfWaiting
     */

    public MusicBand(int id, String name, Coordinates coordinates, java.time.ZonedDateTime creationDate,
                      Boolean realHero,Boolean hasToothpick,Integer impactSpeed, String soundtrackName,
                      float minutesOfWaiting) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.realHero = realHero;
        this.hasToothpick = hasToothpick;
        this.impactSpeed = impactSpeed;
        this.soundtrackName = soundtrackName;
        this.minutesOfWaiting = minutesOfWaiting;

    }
    public MusicBand(Integer impactSpeed) {
        this.id = -1;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.realHero = realHero;
        this.hasToothpick = hasToothpick;
        this.impactSpeed = impactSpeed;
        this.soundtrackName = soundtrackName;
        this.minutesOfWaiting = minutesOfWaiting;
    }

    /**
     * Method to set id
     * @param id id
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Method to set name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to set coordinates
     * @param coordinates coordinates
     */
    public void setCoordinates (Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Method to set creationDate
     * @param creationDate creationDate
     */
    public void setCreationDate(java.time.ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Method to set realHero
     * @param realHero realHero
     */
    public void setRealHero(Boolean realHero) {
        this.realHero = realHero;
    }

    /**
     * Method to set hasToothpick
     * @param hasToothpick hasToothpick
     */
    public void setHasToothpick(Boolean hasToothpick) {
        this.hasToothpick = hasToothpick;
    }

    /**
     * Method to set impactSpeed
     * @param impactSpeed impactSpeed
     */
    public void setImpactSpeed (Integer impactSpeed) {
        this.impactSpeed = impactSpeed;
    }

    /**
     * Method to set soundTrackName
     * @param soundtrackName soundTrackName
     */
    public void setSoundtrackName(String soundtrackName) {
        this.soundtrackName = soundtrackName;
    }

    /**
     * Method to set minutesOfWaiting
     * @param minutesOfWaiting minutesOfWaiting
     */
    public void setMinutesOfWaiting(float minutesOfWaiting) {
        this.minutesOfWaiting = minutesOfWaiting;
    }

    /**
     * Method to get id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Method to get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to get coordinateX
     * @return coordinateX
     */
    public double getCoordinateX() {
        return coordinates.getX();
    }

    /**
     * Method to get coordinateY
     * @return coordinateY
     */
    public double getCoordinateY() {
        return coordinates.getY();
    }

    /**
     * Method to get creationDate
     * @return creationDate
     */
    public java.time.ZonedDateTime getCreationDate() {
        return creationDate;
    }

    /**
     * Method to check realHero
     * @return realHero
     */
    public Boolean checkRealHero() {
        return realHero;
    }

    /**
     * Method to check hasToothpick
     * @return hasToothpick
     */
    public Boolean checkHasToothpick() {
        return hasToothpick;
    }

    /**
     * Method to get impactSpeed
     * @return impactSpeed
     */
    public Integer getImpactSpeed() {
        return impactSpeed;
    }

    /**
     * Method to get soundTrackName
     * @return soundTrackName
     */
    public String getSoundtrackName() {
        return soundtrackName;
    }

    /**
     * Method to get minutesOfWaiting
     * @return minutesOfWaiting
     */
    public float getMinutesOfWaiting() {
        return minutesOfWaiting;
    }


    @Override
    public String toString(){
        String string = "id: "+ id +"\n name: " + name + "\n coordinates: "+ coordinates + "\n creationDate: " + creationDate +
                "\n realHero: " + realHero + "\n hasToothpick: " + hasToothpick + "\n impactSpeed: " + impactSpeed +
                "\n soundtrackName: " + soundtrackName + "\n minutesOfWaiting: " + minutesOfWaiting;
        return string;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicBand that = (MusicBand) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(coordinates, that.coordinates) && Objects.equals(creationDate, that.creationDate) && Objects.equals(realHero, that.realHero) && Objects.equals(hasToothpick, that.hasToothpick) && Objects.equals(impactSpeed, that.impactSpeed) && Objects.equals(soundtrackName, that.soundtrackName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, coordinates, creationDate, realHero, hasToothpick, impactSpeed, soundtrackName);
    }


    public Coordinates getCoordinates() { return coordinates;
    }

}
