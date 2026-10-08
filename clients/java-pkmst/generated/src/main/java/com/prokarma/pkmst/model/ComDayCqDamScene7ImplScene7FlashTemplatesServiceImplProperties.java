package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties   {
  @JsonProperty("scene7FlashTemplates.rti")
  private ConfigNodePropertyString scene7FlashTemplatesRti;

  @JsonProperty("scene7FlashTemplates.rsi")
  private ConfigNodePropertyString scene7FlashTemplatesRsi;

  @JsonProperty("scene7FlashTemplates.rb")
  private ConfigNodePropertyString scene7FlashTemplatesRb;

  @JsonProperty("scene7FlashTemplates.rurl")
  private ConfigNodePropertyString scene7FlashTemplatesRurl;

  @JsonProperty("scene7FlashTemplate.urlFormatParameter")
  private ConfigNodePropertyString scene7FlashTemplateUrlFormatParameter;

  public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties scene7FlashTemplatesRti(ConfigNodePropertyString scene7FlashTemplatesRti) {
    this.scene7FlashTemplatesRti = scene7FlashTemplatesRti;
    return this;
  }

  /**
   * Get scene7FlashTemplatesRti
   * @return scene7FlashTemplatesRti
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getScene7FlashTemplatesRti() {
    return scene7FlashTemplatesRti;
  }

  public void setScene7FlashTemplatesRti(ConfigNodePropertyString scene7FlashTemplatesRti) {
    this.scene7FlashTemplatesRti = scene7FlashTemplatesRti;
  }

  public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties scene7FlashTemplatesRsi(ConfigNodePropertyString scene7FlashTemplatesRsi) {
    this.scene7FlashTemplatesRsi = scene7FlashTemplatesRsi;
    return this;
  }

  /**
   * Get scene7FlashTemplatesRsi
   * @return scene7FlashTemplatesRsi
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getScene7FlashTemplatesRsi() {
    return scene7FlashTemplatesRsi;
  }

  public void setScene7FlashTemplatesRsi(ConfigNodePropertyString scene7FlashTemplatesRsi) {
    this.scene7FlashTemplatesRsi = scene7FlashTemplatesRsi;
  }

  public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties scene7FlashTemplatesRb(ConfigNodePropertyString scene7FlashTemplatesRb) {
    this.scene7FlashTemplatesRb = scene7FlashTemplatesRb;
    return this;
  }

  /**
   * Get scene7FlashTemplatesRb
   * @return scene7FlashTemplatesRb
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getScene7FlashTemplatesRb() {
    return scene7FlashTemplatesRb;
  }

  public void setScene7FlashTemplatesRb(ConfigNodePropertyString scene7FlashTemplatesRb) {
    this.scene7FlashTemplatesRb = scene7FlashTemplatesRb;
  }

  public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties scene7FlashTemplatesRurl(ConfigNodePropertyString scene7FlashTemplatesRurl) {
    this.scene7FlashTemplatesRurl = scene7FlashTemplatesRurl;
    return this;
  }

  /**
   * Get scene7FlashTemplatesRurl
   * @return scene7FlashTemplatesRurl
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getScene7FlashTemplatesRurl() {
    return scene7FlashTemplatesRurl;
  }

  public void setScene7FlashTemplatesRurl(ConfigNodePropertyString scene7FlashTemplatesRurl) {
    this.scene7FlashTemplatesRurl = scene7FlashTemplatesRurl;
  }

  public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties scene7FlashTemplateUrlFormatParameter(ConfigNodePropertyString scene7FlashTemplateUrlFormatParameter) {
    this.scene7FlashTemplateUrlFormatParameter = scene7FlashTemplateUrlFormatParameter;
    return this;
  }

  /**
   * Get scene7FlashTemplateUrlFormatParameter
   * @return scene7FlashTemplateUrlFormatParameter
   */
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.scene7FlashTemplatesRti, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.scene7FlashTemplatesRti) &&
        Objects.equals(this.scene7FlashTemplatesRsi, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.scene7FlashTemplatesRsi) &&
        Objects.equals(this.scene7FlashTemplatesRb, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.scene7FlashTemplatesRb) &&
        Objects.equals(this.scene7FlashTemplatesRurl, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.scene7FlashTemplatesRurl) &&
        Objects.equals(this.scene7FlashTemplateUrlFormatParameter, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.scene7FlashTemplateUrlFormatParameter);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

