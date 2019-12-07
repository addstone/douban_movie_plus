package org.humingk.movie.entity;

public class ImagePlaceScene {
    private Long id;

    private Long idPlaceScene;

    private String urlImage;

    private String description;

    public ImagePlaceScene(Long id, Long idPlaceScene, String urlImage, String description) {
        this.id = id;
        this.idPlaceScene = idPlaceScene;
        this.urlImage = urlImage;
        this.description = description;
    }

    public ImagePlaceScene() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPlaceScene() {
        return idPlaceScene;
    }

    public void setIdPlaceScene(Long idPlaceScene) {
        this.idPlaceScene = idPlaceScene;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage == null ? null : urlImage.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ImagePlaceScene other = (ImagePlaceScene) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIdPlaceScene() == null ? other.getIdPlaceScene() == null : this.getIdPlaceScene().equals(other.getIdPlaceScene()))
            && (this.getUrlImage() == null ? other.getUrlImage() == null : this.getUrlImage().equals(other.getUrlImage()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIdPlaceScene() == null) ? 0 : getIdPlaceScene().hashCode());
        result = prime * result + ((getUrlImage() == null) ? 0 : getUrlImage().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}