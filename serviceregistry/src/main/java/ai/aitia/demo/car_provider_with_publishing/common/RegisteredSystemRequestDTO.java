package ai.aitia.demo.car_provider_with_publishing.common;

import java.io.Serializable;

public class RegisteredSystemRequestDTO implements Serializable {

	//=================================================================================================
	// members

	private static final long serialVersionUID = -5363562707054976998L;

	private String name;
	private String endpoint;

	//=================================================================================================
	// methods
	
	//-------------------------------------------------------------------------------------------------
	public RegisteredSystemRequestDTO(final String brand, final String color) {
		this.name = brand;
		this.endpoint = color;
	}

	//-------------------------------------------------------------------------------------------------
	public String getName() { return name; }
	public String getEndpoint() { return endpoint; }

	//-------------------------------------------------------------------------------------------------
	public void setName(final String brand) { this.name = brand; }
	public void setEndpoint(final String color) { this.endpoint = color; }	
}
