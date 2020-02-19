package main.model;

import main.utils.Statuses;
import main.utils.Values;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Calendar;


@Entity
public class ArtPiece {

    @Id
    @GeneratedValue
	private int id;
	private String name;
	private int year;
	private double price; 
	private String technicalSpecs;
	private String currentOwner; 
	private String author;
	private String status;
	private boolean publicOwner; 
	private int biddingTimes;
	private String coverImage;

	public ArtPiece() {}
	
	public ArtPiece(int id, String name, int year, double price, String technicalSpecs,
					String currentOwner, String author, String status, boolean publicOwner,
			int biddingTimes, String coverImage) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.price = price;
		this.technicalSpecs = technicalSpecs;
		this.currentOwner = currentOwner;
		this.author = author;
		this.status = status;
		this.publicOwner = publicOwner;
		this.biddingTimes = biddingTimes;
		this.coverImage = coverImage;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTechnicalSpecs() {
		return technicalSpecs;
	}

	public void setTechnicalSpecs(String technicalSpecs) {
		this.technicalSpecs = technicalSpecs;
	}

	public String getCurrentOwner() {
		return currentOwner;
	}

	public void setCurrentOwner(String currentOwner) {
		this.currentOwner = currentOwner;
	}

    public String getAuthor() {
		return author;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void markToWaitTransaction() {
	    this.setStatus(Statuses.WAITING_TRANSACTION);
    }

    public void markAsSold() {
        this.setStatus(Statuses.SOLD);
    }

	public boolean isPublicOwner() {
		return publicOwner;
	}

	public void setPublicOwner(boolean publicOwner) {
		this.publicOwner = publicOwner;
	}

	public int getBiddingTimes() {
		return biddingTimes;
	}

	public void incrementBids() {
		this.biddingTimes ++;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getCoverImage() {
		return coverImage;
	}

	// Validation Methods

    // Tests if the given name is valid - not null and different than empty
	private boolean validName() {
        //Preconditions.validArgument(name != null && name != "", Messages.INVALID_NAME.getMessage());
	    return name != null && name != "";
    }

    // Tests if the year is valid - must be an integer with exactly 4 digits and it can't be higher than then current year
    private boolean validYear() {
	    Calendar today = Calendar.getInstance();
	    int currentYear = today.get(Calendar.YEAR);

        String toString = Integer.toString(year);
        return this.year <= currentYear && toString.length() == 4;
    }

    // Tests if the technical specifications field is valid
    private boolean validTechnicalSpecs() {
        return technicalSpecs.length() < Values.SPECS_CHAR_LIMIT;
    }

    // Tests if the provided status is valid
    private boolean validState() {
	    return Statuses.exists(status);
    }

    // Tests if the art piece is valid
    public boolean valid() {
        return validName() &&  validYear() && validTechnicalSpecs() && validState();
    }


	
}
