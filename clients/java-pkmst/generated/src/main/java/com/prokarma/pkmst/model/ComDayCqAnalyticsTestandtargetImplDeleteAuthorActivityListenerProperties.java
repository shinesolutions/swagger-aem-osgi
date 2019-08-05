package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties   {
  @JsonProperty("cq.analytics.testandtarget.deleteauthoractivitylistener.enabled")
  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled = null;

  public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled) {
    this.cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled = cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled;
    return this;
  }

   /**
   * Get cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled
   * @return cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled() {
    return cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled;
  }

  public void setCqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled) {
    this.cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled = cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties = (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties) o;
    return Objects.equals(this.cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled, comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties {\n");
    
    sb.append("    cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled: ").append(toIndentedString(cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled)).append("\n");
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

