package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString scene7FlashTemplatesRti = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString scene7FlashTemplatesRsi = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString scene7FlashTemplatesRb = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString scene7FlashTemplatesRurl = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString scene7FlashTemplateUrlFormatParameter = null;
 /**
   * Get scene7FlashTemplatesRti
   * @return scene7FlashTemplatesRti
  **/
  @JsonProperty("scene7FlashTemplates.rti")
  public ConfigNodePropertyString getScene7FlashTemplatesRti() {
    return scene7FlashTemplatesRti;
  }

  public void setScene7FlashTemplatesRti(ConfigNodePropertyString scene7FlashTemplatesRti) {
    this.scene7FlashTemplatesRti = scene7FlashTemplatesRti;
  }

  public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties scene7FlashTemplatesRti(ConfigNodePropertyString scene7FlashTemplatesRti) {
    this.scene7FlashTemplatesRti = scene7FlashTemplatesRti;
    return this;
  }

 /**
   * Get scene7FlashTemplatesRsi
   * @return scene7FlashTemplatesRsi
  **/
  @JsonProperty("scene7FlashTemplates.rsi")
  public ConfigNodePropertyString getScene7FlashTemplatesRsi() {
    return scene7FlashTemplatesRsi;
  }

  public void setScene7FlashTemplatesRsi(ConfigNodePropertyString scene7FlashTemplatesRsi) {
    this.scene7FlashTemplatesRsi = scene7FlashTemplatesRsi;
  }

  public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties scene7FlashTemplatesRsi(ConfigNodePropertyString scene7FlashTemplatesRsi) {
    this.scene7FlashTemplatesRsi = scene7FlashTemplatesRsi;
    return this;
  }

 /**
   * Get scene7FlashTemplatesRb
   * @return scene7FlashTemplatesRb
  **/
  @JsonProperty("scene7FlashTemplates.rb")
  public ConfigNodePropertyString getScene7FlashTemplatesRb() {
    return scene7FlashTemplatesRb;
  }

  public void setScene7FlashTemplatesRb(ConfigNodePropertyString scene7FlashTemplatesRb) {
    this.scene7FlashTemplatesRb = scene7FlashTemplatesRb;
  }

  public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties scene7FlashTemplatesRb(ConfigNodePropertyString scene7FlashTemplatesRb) {
    this.scene7FlashTemplatesRb = scene7FlashTemplatesRb;
    return this;
  }

 /**
   * Get scene7FlashTemplatesRurl
   * @return scene7FlashTemplatesRurl
  **/
  @JsonProperty("scene7FlashTemplates.rurl")
  public ConfigNodePropertyString getScene7FlashTemplatesRurl() {
    return scene7FlashTemplatesRurl;
  }

  public void setScene7FlashTemplatesRurl(ConfigNodePropertyString scene7FlashTemplatesRurl) {
    this.scene7FlashTemplatesRurl = scene7FlashTemplatesRurl;
  }

  public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties scene7FlashTemplatesRurl(ConfigNodePropertyString scene7FlashTemplatesRurl) {
    this.scene7FlashTemplatesRurl = scene7FlashTemplatesRurl;
    return this;
  }

 /**
   * Get scene7FlashTemplateUrlFormatParameter
   * @return scene7FlashTemplateUrlFormatParameter
  **/
  @JsonProperty("scene7FlashTemplate.urlFormatParameter")
  public ConfigNodePropertyString getScene7FlashTemplateUrlFormatParameter() {
    return scene7FlashTemplateUrlFormatParameter;
  }

  public void setScene7FlashTemplateUrlFormatParameter(ConfigNodePropertyString scene7FlashTemplateUrlFormatParameter) {
    this.scene7FlashTemplateUrlFormatParameter = scene7FlashTemplateUrlFormatParameter;
  }

  public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties scene7FlashTemplateUrlFormatParameter(ConfigNodePropertyString scene7FlashTemplateUrlFormatParameter) {
    this.scene7FlashTemplateUrlFormatParameter = scene7FlashTemplateUrlFormatParameter;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties {\n");
    
    sb.append("    scene7FlashTemplatesRti: ").append(toIndentedString(scene7FlashTemplatesRti)).append("\n");
    sb.append("    scene7FlashTemplatesRsi: ").append(toIndentedString(scene7FlashTemplatesRsi)).append("\n");
    sb.append("    scene7FlashTemplatesRb: ").append(toIndentedString(scene7FlashTemplatesRb)).append("\n");
    sb.append("    scene7FlashTemplatesRurl: ").append(toIndentedString(scene7FlashTemplatesRurl)).append("\n");
    sb.append("    scene7FlashTemplateUrlFormatParameter: ").append(toIndentedString(scene7FlashTemplateUrlFormatParameter)).append("\n");
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

