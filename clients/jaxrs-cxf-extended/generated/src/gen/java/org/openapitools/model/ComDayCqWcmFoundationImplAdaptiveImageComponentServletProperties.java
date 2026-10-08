package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray adaptSupportedWidths;
 /**
  * Get adaptSupportedWidths
  * @return adaptSupportedWidths
  */
  @JsonProperty("adapt.supported.widths")
  public ConfigNodePropertyArray getAdaptSupportedWidths() {
    return adaptSupportedWidths;
  }

  /**
   * Sets the <code>adaptSupportedWidths</code> property.
   */
 public void setAdaptSupportedWidths(ConfigNodePropertyArray adaptSupportedWidths) {
    this.adaptSupportedWidths = adaptSupportedWidths;
  }

  /**
   * Sets the <code>adaptSupportedWidths</code> property.
   */
  public ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties adaptSupportedWidths(ConfigNodePropertyArray adaptSupportedWidths) {
    this.adaptSupportedWidths = adaptSupportedWidths;
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
    ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties = (ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties) o;
    return Objects.equals(this.adaptSupportedWidths, comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.adaptSupportedWidths);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

