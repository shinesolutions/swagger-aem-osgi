package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties   {
  @JsonProperty("adapter.condition")
  private ConfigNodePropertyString adapterCondition = null;

  public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties adapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
    return this;
  }

   /**
   * Get adapterCondition
   * @return adapterCondition
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }

  public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties = (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties) o;
    return Objects.equals(this.adapterCondition, comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.adapterCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adapterCondition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties {\n");
    
    sb.append("    adapterCondition: ").append(toIndentedString(adapterCondition)).append("\n");
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

