package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
    return Objects.equals(cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled, comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

