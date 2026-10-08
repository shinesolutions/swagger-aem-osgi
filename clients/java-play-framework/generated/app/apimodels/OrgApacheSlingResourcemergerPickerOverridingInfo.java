package apimodels;

import apimodels.OrgApacheSlingResourcemergerPickerOverridingProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingResourcemergerPickerOverridingInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingResourcemergerPickerOverridingInfo   {
  @JsonProperty("pid")
  
  private String pid;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("properties")
  @Valid

  private OrgApacheSlingResourcemergerPickerOverridingProperties properties;

  @JsonProperty("additionalProperties")
  
  private String additionalProperties;

  @JsonProperty("bundle_location")
  
  private String bundleLocation;

  @JsonProperty("service_location")
  
  private String serviceLocation;

  public OrgApacheSlingResourcemergerPickerOverridingInfo pid(String pid) {
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

  public OrgApacheSlingResourcemergerPickerOverridingInfo title(String title) {
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

  public OrgApacheSlingResourcemergerPickerOverridingInfo description(String description) {
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

  public OrgApacheSlingResourcemergerPickerOverridingInfo properties(OrgApacheSlingResourcemergerPickerOverridingProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  public OrgApacheSlingResourcemergerPickerOverridingProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheSlingResourcemergerPickerOverridingProperties properties) {
    this.properties = properties;
  }

  public OrgApacheSlingResourcemergerPickerOverridingInfo additionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  public String getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public OrgApacheSlingResourcemergerPickerOverridingInfo bundleLocation(String bundleLocation) {
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

  public OrgApacheSlingResourcemergerPickerOverridingInfo serviceLocation(String serviceLocation) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingResourcemergerPickerOverridingInfo orgApacheSlingResourcemergerPickerOverridingInfo = (OrgApacheSlingResourcemergerPickerOverridingInfo) o;
    return Objects.equals(pid, orgApacheSlingResourcemergerPickerOverridingInfo.pid) &&
        Objects.equals(title, orgApacheSlingResourcemergerPickerOverridingInfo.title) &&
        Objects.equals(description, orgApacheSlingResourcemergerPickerOverridingInfo.description) &&
        Objects.equals(properties, orgApacheSlingResourcemergerPickerOverridingInfo.properties) &&
        Objects.equals(additionalProperties, orgApacheSlingResourcemergerPickerOverridingInfo.additionalProperties) &&
        Objects.equals(bundleLocation, orgApacheSlingResourcemergerPickerOverridingInfo.bundleLocation) &&
        Objects.equals(serviceLocation, orgApacheSlingResourcemergerPickerOverridingInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, additionalProperties, bundleLocation, serviceLocation);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingResourcemergerPickerOverridingInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
    sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

