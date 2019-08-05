package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties   {
  
  private ConfigNodePropertyString javaNamingFactoryInitial = null;
  private ConfigNodePropertyString javaNamingProviderUrl = null;

  public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties () {

  }

  public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties (ConfigNodePropertyString javaNamingFactoryInitial, ConfigNodePropertyString javaNamingProviderUrl) {
    this.javaNamingFactoryInitial = javaNamingFactoryInitial;
    this.javaNamingProviderUrl = javaNamingProviderUrl;
  }

    
  @JsonProperty("java.naming.factory.initial")
  public ConfigNodePropertyString getJavaNamingFactoryInitial() {
    return javaNamingFactoryInitial;
  }
  public void setJavaNamingFactoryInitial(ConfigNodePropertyString javaNamingFactoryInitial) {
    this.javaNamingFactoryInitial = javaNamingFactoryInitial;
  }

    
  @JsonProperty("java.naming.provider.url")
  public ConfigNodePropertyString getJavaNamingProviderUrl() {
    return javaNamingProviderUrl;
  }
  public void setJavaNamingProviderUrl(ConfigNodePropertyString javaNamingProviderUrl) {
    this.javaNamingProviderUrl = javaNamingProviderUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties = (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties) o;
    return Objects.equals(javaNamingFactoryInitial, orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.javaNamingFactoryInitial) &&
        Objects.equals(javaNamingProviderUrl, orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.javaNamingProviderUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(javaNamingFactoryInitial, javaNamingProviderUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties {\n");
    
    sb.append("    javaNamingFactoryInitial: ").append(toIndentedString(javaNamingFactoryInitial)).append("\n");
    sb.append("    javaNamingProviderUrl: ").append(toIndentedString(javaNamingProviderUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
