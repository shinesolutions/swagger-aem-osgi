package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties   {
  
  private ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled = null;

  public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties () {

  }

  public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties (ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled) {
    this.cqSearchpromoteConfighandlerEnabled = cqSearchpromoteConfighandlerEnabled;
  }

    
  @JsonProperty("cq.searchpromote.confighandler.enabled")
  public ConfigNodePropertyBoolean getCqSearchpromoteConfighandlerEnabled() {
    return cqSearchpromoteConfighandlerEnabled;
  }
  public void setCqSearchpromoteConfighandlerEnabled(ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled) {
    this.cqSearchpromoteConfighandlerEnabled = cqSearchpromoteConfighandlerEnabled;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
