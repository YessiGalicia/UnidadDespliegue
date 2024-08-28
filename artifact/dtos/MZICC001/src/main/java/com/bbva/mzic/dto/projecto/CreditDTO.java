
import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


public class CreditDTO implements Serializable{
	private static final long serialVersionUID = 2931699728946643245L;
    private String id;    
    private String desCredit;

    
    public String getId(){
        return this.id
    }
    public void setId(final String id){
        this.id=id;
    }



	public String getDesCredit(){
        return this.creditDTO
    }
    public void setDesCredit(final String desCredit){
        this.desCredit=desCredit;
    }
   

    @Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final CreditDTO rhs = (CreditDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(desCredit, rhs.desCredit)
					.append(id, rhs.id)
					
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.desCredit)
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
			.append("description",desCredit)
		
			
			.toString();
	}
}


