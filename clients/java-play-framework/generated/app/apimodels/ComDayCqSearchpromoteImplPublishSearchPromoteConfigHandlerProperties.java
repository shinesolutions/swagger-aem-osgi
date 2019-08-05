package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties   {
  @JsonProperty("cq.searchpromote.confighandler.enabled")
  private ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled = null;

  public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties cqSearchpromoteConfighandlerEnabled(ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled) {
    this.cqSearchpromoteConfighandlerEnabled = cqSearchpromoteConfighandlerEnabled;
    return this;
  }

   /**
   * Get cqSearchpromoteConfighandlerEnabled
   * @return cqSearchpromoteConfighandlerEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqSearchpromoteConfighandlerEnabled() {
    return cqSearchpromoteConfighandlerEnabled;
  }

  public void setCqSearchpromoteConfighandlerEnabled(ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled) {
    this.cqSearchpromoteConfighandlerEnabled = cqSearchpromoteConfighandlerEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties = (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties) o;
    return Objects.equals(cqSearchpromoteConfighandlerEnabled, comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.cqSearchpromoteConfighandlerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqSearchpromoteConfighandlerEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties {\n");
    
    sb.append("    cqSearchpromoteConfighandlerEnabled: ").append(toIndentedString(cqSearchpromoteConfighandlerEnabled)).append("\n");
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

