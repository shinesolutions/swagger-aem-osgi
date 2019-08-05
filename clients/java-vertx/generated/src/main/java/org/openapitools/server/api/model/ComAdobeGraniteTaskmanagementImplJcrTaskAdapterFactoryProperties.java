package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties   {
  
  private ConfigNodePropertyString adapterCondition = null;

  public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties () {

  }

  public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties (ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }

    
  @JsonProperty("adapter.condition")
  public ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }
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
    return Objects.equals(adapterCondition, comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.adapterCondition);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
