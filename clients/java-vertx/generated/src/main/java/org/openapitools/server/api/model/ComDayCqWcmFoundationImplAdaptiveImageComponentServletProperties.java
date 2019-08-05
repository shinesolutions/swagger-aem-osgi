package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties   {
  
  private ConfigNodePropertyArray adaptSupportedWidths = null;

  public ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties () {

  }

  public ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties (ConfigNodePropertyArray adaptSupportedWidths) {
    this.adaptSupportedWidths = adaptSupportedWidths;
  }

    
  @JsonProperty("adapt.supported.widths")
  public ConfigNodePropertyArray getAdaptSupportedWidths() {
    return adaptSupportedWidths;
  }
  public void setAdaptSupportedWidths(ConfigNodePropertyArray adaptSupportedWidths) {
    this.adaptSupportedWidths = adaptSupportedWidths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties = (ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties) o;
    return Objects.equals(adaptSupportedWidths, comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.adaptSupportedWidths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptSupportedWidths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties {\n");
    
    sb.append("    adaptSupportedWidths: ").append(toIndentedString(adaptSupportedWidths)).append("\n");
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
