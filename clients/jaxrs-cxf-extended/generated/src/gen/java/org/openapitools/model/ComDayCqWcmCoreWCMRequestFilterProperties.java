package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreWCMRequestFilterProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown wcmfilterMode;
 /**
  * Get wcmfilterMode
  * @return wcmfilterMode
  */
  @JsonProperty("wcmfilter.mode")
  public ConfigNodePropertyDropDown getWcmfilterMode() {
    return wcmfilterMode;
  }

  /**
   * Sets the <code>wcmfilterMode</code> property.
   */
 public void setWcmfilterMode(ConfigNodePropertyDropDown wcmfilterMode) {
    this.wcmfilterMode = wcmfilterMode;
  }

  /**
   * Sets the <code>wcmfilterMode</code> property.
   */
  public ComDayCqWcmCoreWCMRequestFilterProperties wcmfilterMode(ConfigNodePropertyDropDown wcmfilterMode) {
    this.wcmfilterMode = wcmfilterMode;
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
    ComDayCqWcmCoreWCMRequestFilterProperties comDayCqWcmCoreWCMRequestFilterProperties = (ComDayCqWcmCoreWCMRequestFilterProperties) o;
    return Objects.equals(this.wcmfilterMode, comDayCqWcmCoreWCMRequestFilterProperties.wcmfilterMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wcmfilterMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreWCMRequestFilterProperties {\n");
    
    sb.append("    wcmfilterMode: ").append(toIndentedString(wcmfilterMode)).append("\n");
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

