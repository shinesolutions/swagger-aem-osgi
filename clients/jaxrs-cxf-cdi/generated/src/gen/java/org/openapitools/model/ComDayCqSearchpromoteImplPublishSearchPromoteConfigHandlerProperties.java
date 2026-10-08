package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties   {
  
  private ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled;

  /**
   **/
  public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties cqSearchpromoteConfighandlerEnabled(ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled) {
    this.cqSearchpromoteConfighandlerEnabled = cqSearchpromoteConfighandlerEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

