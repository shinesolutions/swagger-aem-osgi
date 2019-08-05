package apimodels;

import apimodels.ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo   {
  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("properties")
  private ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties properties = null;

  @JsonProperty("bundle_location")
  private String bundleLocation = null;

  @JsonProperty("service_location")
  private String serviceLocation = null;

  public ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo pid(String pid) {
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

  public ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo title(String title) {
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

  public ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo description(String description) {
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

  public ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo properties(ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Valid
  public ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties getProperties() {
    return properties;
  }

  public void setProperties(ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties properties) {
    this.properties = properties;
  }

  public ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo bundleLocation(String bundleLocation) {
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

  public ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo serviceLocation(String serviceLocation) {
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
    ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo comDayCqDamScene7ImplScene7DamChangeEventListenerInfo = (ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo) o;
    return Objects.equals(pid, comDayCqDamScene7ImplScene7DamChangeEventListenerInfo.pid) &&
        Objects.equals(title, comDayCqDamScene7ImplScene7DamChangeEventListenerInfo.title) &&
        Objects.equals(description, comDayCqDamScene7ImplScene7DamChangeEventListenerInfo.description) &&
        Objects.equals(properties, comDayCqDamScene7ImplScene7DamChangeEventListenerInfo.properties) &&
        Objects.equals(bundleLocation, comDayCqDamScene7ImplScene7DamChangeEventListenerInfo.bundleLocation) &&
        Objects.equals(serviceLocation, comDayCqDamScene7ImplScene7DamChangeEventListenerInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo {\n");
    
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

