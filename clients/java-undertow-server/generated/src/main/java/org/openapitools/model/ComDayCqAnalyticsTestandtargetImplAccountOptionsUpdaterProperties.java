package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties   {
  
  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled = null;

  /**
   **/
  public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties cqAnalyticsTestandtargetAccountoptionsupdaterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled) {
    this.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled = cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.analytics.testandtarget.accountoptionsupdater.enabled")
  public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetAccountoptionsupdaterEnabled() {
    return cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
  }
  public void setCqAnalyticsTestandtargetAccountoptionsupdaterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled) {
    this.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled = cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties = (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties) o;
    return Objects.equals(cqAnalyticsTestandtargetAccountoptionsupdaterEnabled, comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

