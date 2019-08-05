package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmCoreImplCommandsWCMCommandServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties   {
  @JsonProperty("wcmcommandservlet.delete_whitelist")
  private ConfigNodePropertyArray wcmcommandservletDeleteWhitelist = null;

  public ComDayCqWcmCoreImplCommandsWCMCommandServletProperties wcmcommandservletDeleteWhitelist(ConfigNodePropertyArray wcmcommandservletDeleteWhitelist) {
    this.wcmcommandservletDeleteWhitelist = wcmcommandservletDeleteWhitelist;
    return this;
  }

   /**
   * Get wcmcommandservletDeleteWhitelist
   * @return wcmcommandservletDeleteWhitelist
  **/
  @Valid
  public ConfigNodePropertyArray getWcmcommandservletDeleteWhitelist() {
    return wcmcommandservletDeleteWhitelist;
  }

  public void setWcmcommandservletDeleteWhitelist(ConfigNodePropertyArray wcmcommandservletDeleteWhitelist) {
    this.wcmcommandservletDeleteWhitelist = wcmcommandservletDeleteWhitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplCommandsWCMCommandServletProperties comDayCqWcmCoreImplCommandsWCMCommandServletProperties = (ComDayCqWcmCoreImplCommandsWCMCommandServletProperties) o;
    return Objects.equals(wcmcommandservletDeleteWhitelist, comDayCqWcmCoreImplCommandsWCMCommandServletProperties.wcmcommandservletDeleteWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wcmcommandservletDeleteWhitelist);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties {\n");
    
    sb.append("    wcmcommandservletDeleteWhitelist: ").append(toIndentedString(wcmcommandservletDeleteWhitelist)).append("\n");
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

