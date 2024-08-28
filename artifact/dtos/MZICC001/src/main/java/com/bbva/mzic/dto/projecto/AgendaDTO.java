package com.bbva.mzic.dto.projecto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The AgendaDTO class...
 */
public class AgendaDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;
    private String lastName;    
    private String email;
    private String phone;
    private String firstName;

    private CustomerDTO customer;
    private LetterDTO letter;
    private CreditDTO credit;
	
    public String getLastName(){
        return this.lastName
    }
    public void setLastName(final String lastName){
        this.lastName=lastName;
    }


    public String getEmail(){
        return this.email
    }
    public void setEmail(final String email){
        this.email=email;
    }
   
    public String getPhone(){
        return this.phone
    }
    public void setPhone(final String phone){
        this.phone=phone;
    }
   
    public String getFirstName(){
        return this.firstName
    }
    public void setFirstName(final String firstName){
        this.firstName=firstName;
    }
   

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final AgendaDTO rhs = (AgendaDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(lastName, rhs.lastName)
					.append(fisrtName, rhs.firstName)
					.append(email, rhs.email)
					.append(phone, rhs.phone)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.lastName)
			.append(this.firstName)
			.append(this.email)
			.append(this.phone)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("lastName", lastName)
			.append("firstName",firstName)
			.append("email", email)
			.append("phone",phone)
			.toString();
	}
}
