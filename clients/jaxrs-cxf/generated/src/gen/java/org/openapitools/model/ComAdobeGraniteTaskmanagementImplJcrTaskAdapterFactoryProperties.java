package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString adapterCondition;
 /**
   * Get adapterCondition
   * @return adapterCondition
  **/
  @JsonProperty("adapter.condition")
  public ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }

  public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }

  public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties adapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
    return this;
  }

  @Override
  public boolean equals(Object o) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

