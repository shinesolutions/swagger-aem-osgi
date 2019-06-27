/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqDamInddImplServletSnippetCreationServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T11:23:34.688Z[GMT]")
public class ComDayCqDamInddImplServletSnippetCreationServletProperties {
  public static final String SERIALIZED_NAME_SNIPPETCREATION_MAXCOLLECTIONS = "snippetcreation.maxcollections";
  @SerializedName(SERIALIZED_NAME_SNIPPETCREATION_MAXCOLLECTIONS)
  private ConfigNodePropertyInteger snippetcreationMaxcollections = null;

  public ComDayCqDamInddImplServletSnippetCreationServletProperties snippetcreationMaxcollections(ConfigNodePropertyInteger snippetcreationMaxcollections) {
    this.snippetcreationMaxcollections = snippetcreationMaxcollections;
    return this;
  }

   /**
   * Get snippetcreationMaxcollections
   * @return snippetcreationMaxcollections
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSnippetcreationMaxcollections() {
    return snippetcreationMaxcollections;
  }

  public void setSnippetcreationMaxcollections(ConfigNodePropertyInteger snippetcreationMaxcollections) {
    this.snippetcreationMaxcollections = snippetcreationMaxcollections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamInddImplServletSnippetCreationServletProperties comDayCqDamInddImplServletSnippetCreationServletProperties = (ComDayCqDamInddImplServletSnippetCreationServletProperties) o;
    return Objects.equals(this.snippetcreationMaxcollections, comDayCqDamInddImplServletSnippetCreationServletProperties.snippetcreationMaxcollections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snippetcreationMaxcollections);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamInddImplServletSnippetCreationServletProperties {\n");
    sb.append("    snippetcreationMaxcollections: ").append(toIndentedString(snippetcreationMaxcollections)).append("\n");
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

