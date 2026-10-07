package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties   {
  
  private ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled;

  /**
   **/
  public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties cqDamS7damDynamicmediaconfigeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled) {
    this.cqDamS7damDynamicmediaconfigeventlistenerEnabled = cqDamS7damDynamicmediaconfigeventlistenerEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled")
  public ConfigNodePropertyBoolean getCqDamS7damDynamicmediaconfigeventlistenerEnabled() {
    return cqDamS7damDynamicmediaconfigeventlistenerEnabled;
  }
  public void setCqDamS7damDynamicmediaconfigeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled) {
    this.cqDamS7damDynamicmediaconfigeventlistenerEnabled = cqDamS7damDynamicmediaconfigeventlistenerEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties = (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties) o;
    return Objects.equals(this.cqDamS7damDynamicmediaconfigeventlistenerEnabled, comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.cqDamS7damDynamicmediaconfigeventlistenerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamS7damDynamicmediaconfigeventlistenerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties {\n");
    
    sb.append("    cqDamS7damDynamicmediaconfigeventlistenerEnabled: ").append(toIndentedString(cqDamS7damDynamicmediaconfigeventlistenerEnabled)).append("\n");
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

