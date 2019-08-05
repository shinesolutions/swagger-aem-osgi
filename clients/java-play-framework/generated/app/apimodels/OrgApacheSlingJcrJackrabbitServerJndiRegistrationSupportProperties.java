package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties   {
  @JsonProperty("java.naming.factory.initial")
  private ConfigNodePropertyString javaNamingFactoryInitial = null;

  @JsonProperty("java.naming.provider.url")
  private ConfigNodePropertyString javaNamingProviderUrl = null;

  public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties javaNamingFactoryInitial(ConfigNodePropertyString javaNamingFactoryInitial) {
    this.javaNamingFactoryInitial = javaNamingFactoryInitial;
    return this;
  }

   /**
   * Get javaNamingFactoryInitial
   * @return javaNamingFactoryInitial
  **/
  @Valid
  public ConfigNodePropertyString getJavaNamingFactoryInitial() {
    return javaNamingFactoryInitial;
  }

  public void setJavaNamingFactoryInitial(ConfigNodePropertyString javaNamingFactoryInitial) {
    this.javaNamingFactoryInitial = javaNamingFactoryInitial;
  }

  public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties javaNamingProviderUrl(ConfigNodePropertyString javaNamingProviderUrl) {
    this.javaNamingProviderUrl = javaNamingProviderUrl;
    return this;
  }

   /**
   * Get javaNamingProviderUrl
   * @return javaNamingProviderUrl
  **/
  @Valid
  public ConfigNodePropertyString getJavaNamingProviderUrl() {
    return javaNamingProviderUrl;
  }

  public void setJavaNamingProviderUrl(ConfigNodePropertyString javaNamingProviderUrl) {
    this.javaNamingProviderUrl = javaNamingProviderUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

