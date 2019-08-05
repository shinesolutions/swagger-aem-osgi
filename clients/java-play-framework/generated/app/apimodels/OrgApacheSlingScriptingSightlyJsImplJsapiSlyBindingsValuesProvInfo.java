package apimodels;

import apimodels.OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo   {
  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("properties")
  private OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties properties = null;

  @JsonProperty("bundle_location")
  private String bundleLocation = null;

  @JsonProperty("service_location")
  private String serviceLocation = null;

  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo pid(String pid) {
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

  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo title(String title) {
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

  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo description(String description) {
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

  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo properties(OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Valid
  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties properties) {
    this.properties = properties;
  }

  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo bundleLocation(String bundleLocation) {
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

  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo serviceLocation(String serviceLocation) {
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
    OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo = (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo) o;
    return Objects.equals(pid, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo.pid) &&
        Objects.equals(title, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo.title) &&
        Objects.equals(description, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo.description) &&
        Objects.equals(properties, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo.properties) &&
        Objects.equals(bundleLocation, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo.bundleLocation) &&
        Objects.equals(serviceLocation, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo {\n");
    
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

