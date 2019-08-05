package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties   {
  
  private ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled = null;

  private ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes = null;


  /**
   **/
  public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties formsFormparagraphpostprocessorEnabled(ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled) {
    this.formsFormparagraphpostprocessorEnabled = formsFormparagraphpostprocessorEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("forms.formparagraphpostprocessor.enabled")
  public ConfigNodePropertyBoolean getFormsFormparagraphpostprocessorEnabled() {
    return formsFormparagraphpostprocessorEnabled;
  }
  public void setFormsFormparagraphpostprocessorEnabled(ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled) {
    this.formsFormparagraphpostprocessorEnabled = formsFormparagraphpostprocessorEnabled;
  }


  /**
   **/
  public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties formsFormparagraphpostprocessorFormresourcetypes(ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes) {
    this.formsFormparagraphpostprocessorFormresourcetypes = formsFormparagraphpostprocessorFormresourcetypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("forms.formparagraphpostprocessor.formresourcetypes")
  public ConfigNodePropertyArray getFormsFormparagraphpostprocessorFormresourcetypes() {
    return formsFormparagraphpostprocessorFormresourcetypes;
  }
  public void setFormsFormparagraphpostprocessorFormresourcetypes(ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes) {
    this.formsFormparagraphpostprocessorFormresourcetypes = formsFormparagraphpostprocessorFormresourcetypes;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties = (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties) o;
    return Objects.equals(formsFormparagraphpostprocessorEnabled, comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.formsFormparagraphpostprocessorEnabled) &&
        Objects.equals(formsFormparagraphpostprocessorFormresourcetypes, comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.formsFormparagraphpostprocessorFormresourcetypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formsFormparagraphpostprocessorEnabled, formsFormparagraphpostprocessorFormresourcetypes);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

