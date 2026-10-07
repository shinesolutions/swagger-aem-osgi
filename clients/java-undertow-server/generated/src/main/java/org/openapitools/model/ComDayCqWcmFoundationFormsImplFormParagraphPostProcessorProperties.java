/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties   {
  
  private ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled;
  private ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes;

  /**
   */
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
   */
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
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

