package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmCoreWCMRequestFilterProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreWCMRequestFilterProperties   {
  @JsonProperty("wcmfilter.mode")
  private ConfigNodePropertyDropDown wcmfilterMode;

  public ComDayCqWcmCoreWCMRequestFilterProperties wcmfilterMode(ConfigNodePropertyDropDown wcmfilterMode) {
    this.wcmfilterMode = wcmfilterMode;
    return this;
  }

  /**
   * Get wcmfilterMode
   * @return wcmfilterMode
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getWcmfilterMode() {
    return wcmfilterMode;
  }

  public void setWcmfilterMode(ConfigNodePropertyDropDown wcmfilterMode) {
    this.wcmfilterMode = wcmfilterMode;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

