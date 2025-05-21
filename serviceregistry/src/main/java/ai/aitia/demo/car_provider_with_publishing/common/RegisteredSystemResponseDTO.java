package ai.aitia.demo.car_provider_with_publishing.common;

import java.io.Serializable;

public class RegisteredSystemResponseDTO implements Serializable {

	//=================================================================================================
	// members

	private static final long serialVersionUID = -8371510478751740542L;
	
	private int id;
	private String name;
	private String endpoint;

	//=================================================================================================
	// methods

	//-------------------------------------------------------------------------------------------------
	public RegisteredSystemResponseDTO() {}
	
	//-------------------------------------------------------------------------------------------------
	public RegisteredSystemResponseDTO(final int id, final String brand, final String color) {
		this.id = id;
		this.name = brand;
		this.endpoint = color;
	}

	//-------------------------------------------------------------------------------------------------
	public int getId() { return id; }
	public String getName() { return name; }
	public String getEndpoint() { return endpoint; }

	//-------------------------------------------------------------------------------------------------
	public void setId(final int id) {this.id = id; }
	public void setName(final String brand) { this.name = brand; }
	public void setEndpoint(final String color) { this.endpoint = color; }	
}
