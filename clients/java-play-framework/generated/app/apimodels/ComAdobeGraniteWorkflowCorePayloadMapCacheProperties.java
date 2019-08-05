package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteWorkflowCorePayloadMapCacheProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties   {
  @JsonProperty("getSystemWorkflowModels")
  private ConfigNodePropertyArray getSystemWorkflowModels = null;

  @JsonProperty("getPackageRootPath")
  private ConfigNodePropertyString getPackageRootPath = null;

  public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties getSystemWorkflowModels(ConfigNodePropertyArray getSystemWorkflowModels) {
    this.getSystemWorkflowModels = getSystemWorkflowModels;
    return this;
  }

   /**
   * Get getSystemWorkflowModels
   * @return getSystemWorkflowModels
  **/
  @Valid
  public ConfigNodePropertyArray getGetSystemWorkflowModels() {
    return getSystemWorkflowModels;
  }

  public void setGetSystemWorkflowModels(ConfigNodePropertyArray getSystemWorkflowModels) {
    this.getSystemWorkflowModels = getSystemWorkflowModels;
  }

  public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties getPackageRootPath(ConfigNodePropertyString getPackageRootPath) {
    this.getPackageRootPath = getPackageRootPath;
    return this;
  }

   /**
   * Get getPackageRootPath
   * @return getPackageRootPath
  **/
  @Valid
  public ConfigNodePropertyString getGetPackageRootPath() {
    return getPackageRootPath;
  }

  public void setGetPackageRootPath(ConfigNodePropertyString getPackageRootPath) {
    this.getPackageRootPath = getPackageRootPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowCorePayloadMapCacheProperties comAdobeGraniteWorkflowCorePayloadMapCacheProperties = (ComAdobeGraniteWorkflowCorePayloadMapCacheProperties) o;
    return Objects.equals(getSystemWorkflowModels, comAdobeGraniteWorkflowCorePayloadMapCacheProperties.getSystemWorkflowModels) &&
        Objects.equals(getPackageRootPath, comAdobeGraniteWorkflowCorePayloadMapCacheProperties.getPackageRootPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getSystemWorkflowModels, getPackageRootPath);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties {\n");
    
    sb.append("    getSystemWorkflowModels: ").append(toIndentedString(getSystemWorkflowModels)).append("\n");
    sb.append("    getPackageRootPath: ").append(toIndentedString(getPackageRootPath)).append("\n");
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

