package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cq.searchpromote.confighandler.enabled")
  private ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled;

  /**
   * 
   * @return cqSearchpromoteConfighandlerEnabled
   */
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
    return Objects.equals(this.cqSearchpromoteConfighandlerEnabled, comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.cqSearchpromoteConfighandlerEnabled);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
