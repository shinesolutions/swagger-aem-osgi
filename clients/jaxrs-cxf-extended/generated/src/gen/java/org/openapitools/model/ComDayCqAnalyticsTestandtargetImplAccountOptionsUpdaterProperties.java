package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
 /**
  * Get cqAnalyticsTestandtargetAccountoptionsupdaterEnabled
  * @return cqAnalyticsTestandtargetAccountoptionsupdaterEnabled
  */
  @JsonProperty("cq.analytics.testandtarget.accountoptionsupdater.enabled")
  public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetAccountoptionsupdaterEnabled() {
    return cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
  }

  /**
   * Sets the <code>cqAnalyticsTestandtargetAccountoptionsupdaterEnabled</code> property.
   */
 public void setCqAnalyticsTestandtargetAccountoptionsupdaterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled) {
    this.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled = cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
  }

  /**
   * Sets the <code>cqAnalyticsTestandtargetAccountoptionsupdaterEnabled</code> property.
   */
  public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties cqAnalyticsTestandtargetAccountoptionsupdaterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled) {
    this.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled = cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
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
    ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties = (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties) o;
    return Objects.equals(this.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled, comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsTestandtargetAccountoptionsupdaterEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties {\n");
    
    sb.append("    cqAnalyticsTestandtargetAccountoptionsupdaterEnabled: ").append(toIndentedString(cqAnalyticsTestandtargetAccountoptionsupdaterEnabled)).append("\n");
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

