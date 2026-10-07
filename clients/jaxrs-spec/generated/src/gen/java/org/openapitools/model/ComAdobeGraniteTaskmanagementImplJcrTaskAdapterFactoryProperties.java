package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties   {
  private ConfigNodePropertyString adapterCondition;

  public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties() {
  }

  /**
   **/
  public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties adapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("adapter.condition")
  @Valid public ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }

  @JsonProperty("adapter.condition")
  public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
