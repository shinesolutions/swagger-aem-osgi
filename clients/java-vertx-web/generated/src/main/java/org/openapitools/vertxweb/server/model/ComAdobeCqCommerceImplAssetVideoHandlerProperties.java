package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeCqCommerceImplAssetVideoHandlerProperties   {
  
  private ConfigNodePropertyBoolean cqCommerceAssetHandlerActive;
  private ConfigNodePropertyString cqCommerceAssetHandlerName;

  public ComAdobeCqCommerceImplAssetVideoHandlerProperties () {

  }

  public ComAdobeCqCommerceImplAssetVideoHandlerProperties (ConfigNodePropertyBoolean cqCommerceAssetHandlerActive, ConfigNodePropertyString cqCommerceAssetHandlerName) {
    this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
    this.cqCommerceAssetHandlerName = cqCommerceAssetHandlerName;
  }

    
  @JsonProperty("cq.commerce.asset.handler.active")
  public ConfigNodePropertyBoolean getCqCommerceAssetHandlerActive() {
    return cqCommerceAssetHandlerActive;
  }
  public void setCqCommerceAssetHandlerActive(ConfigNodePropertyBoolean cqCommerceAssetHandlerActive) {
    this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
  }

    
  @JsonProperty("cq.commerce.asset.handler.name")
  public ConfigNodePropertyString getCqCommerceAssetHandlerName() {
    return cqCommerceAssetHandlerName;
  }
  public void setCqCommerceAssetHandlerName(ConfigNodePropertyString cqCommerceAssetHandlerName) {
    this.cqCommerceAssetHandlerName = cqCommerceAssetHandlerName;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
