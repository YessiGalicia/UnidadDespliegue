
import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


public class LetterDTO implements Serializable{
	private static final long serialVersionUID = 2931699728946643245L;
    private String id;    
    private String description;
	
    private CreditDTO creditDTO;

    
    public String getId(){
        return this.id
    }
    public void setId(final String id){
        this.id=id;
    }


    public String getDescription(){
        return this.description
    }
    public void setDescription(final String description){
        this.description=description;
    }



    @Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final LetterDTO rhs = (LetterDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					
					.append(id, rhs.id)
					.append(description, rhs.description)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.description)
			.append(this.id)
			
			
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("id", id)
			.append("description",description)
			
			
			.toString();
	}
}


