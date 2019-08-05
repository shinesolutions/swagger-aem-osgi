package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties   {
  

  private ConfigNodePropertyString scene7FlashTemplatesRti = null;

  private ConfigNodePropertyString scene7FlashTemplatesRsi = null;

  private ConfigNodePropertyString scene7FlashTemplatesRb = null;

  private ConfigNodePropertyString scene7FlashTemplatesRurl = null;

  private ConfigNodePropertyString scene7FlashTemplateUrlFormatParameter = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scene7FlashTemplates.rti")
  public ConfigNodePropertyString getScene7FlashTemplatesRti() {
    return scene7FlashTemplatesRti;
  }
  public void setScene7FlashTemplatesRti(ConfigNodePropertyString scene7FlashTemplatesRti) {
    this.scene7FlashTemplatesRti = scene7FlashTemplatesRti;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scene7FlashTemplates.rsi")
  public ConfigNodePropertyString getScene7FlashTemplatesRsi() {
    return scene7FlashTemplatesRsi;
  }
  public void setScene7FlashTemplatesRsi(ConfigNodePropertyString scene7FlashTemplatesRsi) {
    this.scene7FlashTemplatesRsi = scene7FlashTemplatesRsi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scene7FlashTemplates.rb")
  public ConfigNodePropertyString getScene7FlashTemplatesRb() {
    return scene7FlashTemplatesRb;
  }
  public void setScene7FlashTemplatesRb(ConfigNodePropertyString scene7FlashTemplatesRb) {
    this.scene7FlashTemplatesRb = scene7FlashTemplatesRb;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scene7FlashTemplates.rurl")
  public ConfigNodePropertyString getScene7FlashTemplatesRurl() {
    return scene7FlashTemplatesRurl;
  }
  public void setScene7FlashTemplatesRurl(ConfigNodePropertyString scene7FlashTemplatesRurl) {
    this.scene7FlashTemplatesRurl = scene7FlashTemplatesRurl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scene7FlashTemplate.urlFormatParameter")
  public ConfigNodePropertyString getScene7FlashTemplateUrlFormatParameter() {
    return scene7FlashTemplateUrlFormatParameter;
  }
  public void setScene7FlashTemplateUrlFormatParameter(ConfigNodePropertyString scene7FlashTemplateUrlFormatParameter) {
    this.scene7FlashTemplateUrlFormatParameter = scene7FlashTemplateUrlFormatParameter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties = (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties) o;
    return Objects.equals(scene7FlashTemplatesRti, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.scene7FlashTemplatesRti) &&
        Objects.equals(scene7FlashTemplatesRsi, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.scene7FlashTemplatesRsi) &&
        Objects.equals(scene7FlashTemplatesRb, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.scene7FlashTemplatesRb) &&
        Objects.equals(scene7FlashTemplatesRurl, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.scene7FlashTemplatesRurl) &&
        Objects.equals(scene7FlashTemplateUrlFormatParameter, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.scene7FlashTemplateUrlFormatParameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scene7FlashTemplatesRti, scene7FlashTemplatesRsi, scene7FlashTemplatesRb, scene7FlashTemplatesRurl, scene7FlashTemplateUrlFormatParameter);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

