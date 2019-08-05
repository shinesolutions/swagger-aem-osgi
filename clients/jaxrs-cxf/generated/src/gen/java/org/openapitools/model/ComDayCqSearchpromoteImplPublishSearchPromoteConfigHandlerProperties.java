package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled = null;
 /**
   * Get cqSearchpromoteConfighandlerEnabled
   * @return cqSearchpromoteConfighandlerEnabled
  **/
  @JsonProperty("cq.searchpromote.confighandler.enabled")
  public ConfigNodePropertyBoolean getCqSearchpromoteConfighandlerEnabled() {
    return cqSearchpromoteConfighandlerEnabled;
  }

  public void setCqSearchpromoteConfighandlerEnabled(ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled) {
    this.cqSearchpromoteConfighandlerEnabled = cqSearchpromoteConfighandlerEnabled;
  }

  public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties cqSearchpromoteConfighandlerEnabled(ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled) {
    this.cqSearchpromoteConfighandlerEnabled = cqSearchpromoteConfighandlerEnabled;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

