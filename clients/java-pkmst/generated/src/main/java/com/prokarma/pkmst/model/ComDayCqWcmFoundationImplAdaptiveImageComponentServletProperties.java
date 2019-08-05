package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties   {
  @JsonProperty("adapt.supported.widths")
  private ConfigNodePropertyArray adaptSupportedWidths = null;

  public ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties adaptSupportedWidths(ConfigNodePropertyArray adaptSupportedWidths) {
    this.adaptSupportedWidths = adaptSupportedWidths;
    return this;
  }

   /**
   * Get adaptSupportedWidths
   * @return adaptSupportedWidths
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAdaptSupportedWidths() {
    return adaptSupportedWidths;
  }

  public void setAdaptSupportedWidths(ConfigNodePropertyArray adaptSupportedWidths) {
    this.adaptSupportedWidths = adaptSupportedWidths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

