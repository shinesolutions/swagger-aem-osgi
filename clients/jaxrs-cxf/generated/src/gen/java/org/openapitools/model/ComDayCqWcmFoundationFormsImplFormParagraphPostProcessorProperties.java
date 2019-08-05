package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
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

public class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes = null;
 /**
   * Get formsFormparagraphpostprocessorEnabled
   * @return formsFormparagraphpostprocessorEnabled
  **/
  @JsonProperty("forms.formparagraphpostprocessor.enabled")
  public ConfigNodePropertyBoolean getFormsFormparagraphpostprocessorEnabled() {
    return formsFormparagraphpostprocessorEnabled;
  }

  public void setFormsFormparagraphpostprocessorEnabled(ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled) {
    this.formsFormparagraphpostprocessorEnabled = formsFormparagraphpostprocessorEnabled;
  }

  public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties formsFormparagraphpostprocessorEnabled(ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled) {
    this.formsFormparagraphpostprocessorEnabled = formsFormparagraphpostprocessorEnabled;
    return this;
  }

 /**
   * Get formsFormparagraphpostprocessorFormresourcetypes
   * @return formsFormparagraphpostprocessorFormresourcetypes
  **/
  @JsonProperty("forms.formparagraphpostprocessor.formresourcetypes")
  public ConfigNodePropertyArray getFormsFormparagraphpostprocessorFormresourcetypes() {
    return formsFormparagraphpostprocessorFormresourcetypes;
  }

  public void setFormsFormparagraphpostprocessorFormresourcetypes(ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes) {
    this.formsFormparagraphpostprocessorFormresourcetypes = formsFormparagraphpostprocessorFormresourcetypes;
  }

  public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties formsFormparagraphpostprocessorFormresourcetypes(ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes) {
    this.formsFormparagraphpostprocessorFormresourcetypes = formsFormparagraphpostprocessorFormresourcetypes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties {\n");
    
    sb.append("    formsFormparagraphpostprocessorEnabled: ").append(toIndentedString(formsFormparagraphpostprocessorEnabled)).append("\n");
    sb.append("    formsFormparagraphpostprocessorFormresourcetypes: ").append(toIndentedString(formsFormparagraphpostprocessorFormresourcetypes)).append("\n");
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

