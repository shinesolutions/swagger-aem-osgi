package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled;
 /**
   * Get cqDamS7damDynamicmediaconfigeventlistenerEnabled
   * @return cqDamS7damDynamicmediaconfigeventlistenerEnabled
  **/
  @JsonProperty("cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled")
  public ConfigNodePropertyBoolean getCqDamS7damDynamicmediaconfigeventlistenerEnabled() {
    return cqDamS7damDynamicmediaconfigeventlistenerEnabled;
  }

  public void setCqDamS7damDynamicmediaconfigeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled) {
    this.cqDamS7damDynamicmediaconfigeventlistenerEnabled = cqDamS7damDynamicmediaconfigeventlistenerEnabled;
  }

  public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties cqDamS7damDynamicmediaconfigeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled) {
    this.cqDamS7damDynamicmediaconfigeventlistenerEnabled = cqDamS7damDynamicmediaconfigeventlistenerEnabled;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

