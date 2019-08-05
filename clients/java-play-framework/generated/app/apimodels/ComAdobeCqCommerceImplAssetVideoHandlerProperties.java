package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqCommerceImplAssetVideoHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqCommerceImplAssetVideoHandlerProperties   {
  @JsonProperty("cq.commerce.asset.handler.active")
  private ConfigNodePropertyBoolean cqCommerceAssetHandlerActive = null;

  @JsonProperty("cq.commerce.asset.handler.name")
  private ConfigNodePropertyString cqCommerceAssetHandlerName = null;

  public ComAdobeCqCommerceImplAssetVideoHandlerProperties cqCommerceAssetHandlerActive(ConfigNodePropertyBoolean cqCommerceAssetHandlerActive) {
    this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
    return this;
  }

   /**
   * Get cqCommerceAssetHandlerActive
   * @return cqCommerceAssetHandlerActive
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqCommerceAssetHandlerActive() {
    return cqCommerceAssetHandlerActive;
  }

  public void setCqCommerceAssetHandlerActive(ConfigNodePropertyBoolean cqCommerceAssetHandlerActive) {
    this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
  }

  public ComAdobeCqCommerceImplAssetVideoHandlerProperties cqCommerceAssetHandlerName(ConfigNodePropertyString cqCommerceAssetHandlerName) {
    this.cqCommerceAssetHandlerName = cqCommerceAssetHandlerName;
    return this;
  }

   /**
   * Get cqCommerceAssetHandlerName
   * @return cqCommerceAssetHandlerName
  **/
  @Valid
  public ConfigNodePropertyString getCqCommerceAssetHandlerName() {
    return cqCommerceAssetHandlerName;
  }

  public void setCqCommerceAssetHandlerName(ConfigNodePropertyString cqCommerceAssetHandlerName) {
    this.cqCommerceAssetHandlerName = cqCommerceAssetHandlerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCommerceImplAssetVideoHandlerProperties comAdobeCqCommerceImplAssetVideoHandlerProperties = (ComAdobeCqCommerceImplAssetVideoHandlerProperties) o;
    return Objects.equals(cqCommerceAssetHandlerActive, comAdobeCqCommerceImplAssetVideoHandlerProperties.cqCommerceAssetHandlerActive) &&
        Objects.equals(cqCommerceAssetHandlerName, comAdobeCqCommerceImplAssetVideoHandlerProperties.cqCommerceAssetHandlerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqCommerceAssetHandlerActive, cqCommerceAssetHandlerName);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCommerceImplAssetVideoHandlerProperties {\n");
    
    sb.append("    cqCommerceAssetHandlerActive: ").append(toIndentedString(cqCommerceAssetHandlerActive)).append("\n");
    sb.append("    cqCommerceAssetHandlerName: ").append(toIndentedString(cqCommerceAssetHandlerName)).append("\n");
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

