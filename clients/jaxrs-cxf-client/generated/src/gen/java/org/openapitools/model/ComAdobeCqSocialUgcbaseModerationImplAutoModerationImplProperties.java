package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray automoderationSequence = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean automoderationOnfailurestop = null;
 /**
   * Get automoderationSequence
   * @return automoderationSequence
  **/
  @JsonProperty("automoderation.sequence")
  public ConfigNodePropertyArray getAutomoderationSequence() {
    return automoderationSequence;
  }

  public void setAutomoderationSequence(ConfigNodePropertyArray automoderationSequence) {
    this.automoderationSequence = automoderationSequence;
  }

  public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties automoderationSequence(ConfigNodePropertyArray automoderationSequence) {
    this.automoderationSequence = automoderationSequence;
    return this;
  }

 /**
   * Get automoderationOnfailurestop
   * @return automoderationOnfailurestop
  **/
  @JsonProperty("automoderation.onfailurestop")
  public ConfigNodePropertyBoolean getAutomoderationOnfailurestop() {
    return automoderationOnfailurestop;
  }

  public void setAutomoderationOnfailurestop(ConfigNodePropertyBoolean automoderationOnfailurestop) {
    this.automoderationOnfailurestop = automoderationOnfailurestop;
  }

  public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties automoderationOnfailurestop(ConfigNodePropertyBoolean automoderationOnfailurestop) {
    this.automoderationOnfailurestop = automoderationOnfailurestop;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties {\n");
    
    sb.append("    automoderationSequence: ").append(toIndentedString(automoderationSequence)).append("\n");
    sb.append("    automoderationOnfailurestop: ").append(toIndentedString(automoderationOnfailurestop)).append("\n");
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

