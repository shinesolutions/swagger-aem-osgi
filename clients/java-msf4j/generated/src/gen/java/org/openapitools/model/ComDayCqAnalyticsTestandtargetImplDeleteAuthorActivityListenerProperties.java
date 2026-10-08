package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties   {
  @JsonProperty("cq.analytics.testandtarget.deleteauthoractivitylistener.enabled")
  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled;

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
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

