package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
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

public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown connectProtocol = null;
 /**
   * Get connectProtocol
   * @return connectProtocol
  **/
  @JsonProperty("connectProtocol")
  public ConfigNodePropertyDropDown getConnectProtocol() {
    return connectProtocol;
  }

  public void setConnectProtocol(ConfigNodePropertyDropDown connectProtocol) {
    this.connectProtocol = connectProtocol;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties connectProtocol(ConfigNodePropertyDropDown connectProtocol) {
    this.connectProtocol = connectProtocol;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties {\n");
    
    sb.append("    connectProtocol: ").append(toIndentedString(connectProtocol)).append("\n");
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

