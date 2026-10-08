package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqWcmCoreImplCommandsWCMCommandServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties   {
  @JsonProperty("wcmcommandservlet.delete_whitelist")
  @Valid

  private ConfigNodePropertyArray wcmcommandservletDeleteWhitelist;

  public ComDayCqWcmCoreImplCommandsWCMCommandServletProperties wcmcommandservletDeleteWhitelist(ConfigNodePropertyArray wcmcommandservletDeleteWhitelist) {
    this.wcmcommandservletDeleteWhitelist = wcmcommandservletDeleteWhitelist;
    return this;
  }

   /**
   * Get wcmcommandservletDeleteWhitelist
   * @return wcmcommandservletDeleteWhitelist
  **/
  public ConfigNodePropertyArray getWcmcommandservletDeleteWhitelist() {
    return wcmcommandservletDeleteWhitelist;
  }

  public void setWcmcommandservletDeleteWhitelist(ConfigNodePropertyArray wcmcommandservletDeleteWhitelist) {
    this.wcmcommandservletDeleteWhitelist = wcmcommandservletDeleteWhitelist;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

