package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties   {
  
  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.analytics.testandtarget.accountoptionsupdater.enabled")
  public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetAccountoptionsupdaterEnabled() {
    return cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
  }
  public void setCqAnalyticsTestandtargetAccountoptionsupdaterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled) {
    this.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled = cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

