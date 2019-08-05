package apimodels;

import apimodels.OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo   {
  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("properties")
  private OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties properties = null;

  @JsonProperty("bundle_location")
  private String bundleLocation = null;

  @JsonProperty("service_location")
  private String serviceLocation = null;

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
    public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo properties(OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Valid
  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties properties) {
    this.properties = properties;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

   /**
   * Get bundleLocation
   * @return bundleLocation
  **/
    public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

   /**
   * Get serviceLocation
   * @return serviceLocation
  **/
    public String getServiceLocation() {
    return serviceLocation;
  }

  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo = (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo) o;
    return Objects.equals(pid, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.pid) &&
        Objects.equals(title, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.title) &&
        Objects.equals(description, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.description) &&
        Objects.equals(properties, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.properties) &&
        Objects.equals(bundleLocation, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.bundleLocation) &&
        Objects.equals(serviceLocation, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
    sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
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

