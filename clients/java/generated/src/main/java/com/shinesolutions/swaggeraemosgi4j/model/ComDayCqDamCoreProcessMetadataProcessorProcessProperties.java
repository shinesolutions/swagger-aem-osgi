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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqDamCoreProcessMetadataProcessorProcessProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T02:21:59.870Z[GMT]")
public class ComDayCqDamCoreProcessMetadataProcessorProcessProperties {
  public static final String SERIALIZED_NAME_PROCESS_LABEL = "process.label";
  @SerializedName(SERIALIZED_NAME_PROCESS_LABEL)
  private ConfigNodePropertyString processLabel = null;

  public static final String SERIALIZED_NAME_CQ_DAM_ENABLE_SHA1 = "cq.dam.enable.sha1";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_ENABLE_SHA1)
  private ConfigNodePropertyBoolean cqDamEnableSha1 = null;

  public static final String SERIALIZED_NAME_CQ_DAM_METADATA_XSSPROTECTED_PROPERTIES = "cq.dam.metadata.xssprotected.properties";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_METADATA_XSSPROTECTED_PROPERTIES)
  private ConfigNodePropertyArray cqDamMetadataXssprotectedProperties = null;

  public ComDayCqDamCoreProcessMetadataProcessorProcessProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

   /**
   * Get processLabel
   * @return processLabel
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamCoreProcessMetadataProcessorProcessProperties cqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
    return this;
  }

   /**
   * Get cqDamEnableSha1
   * @return cqDamEnableSha1
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqDamEnableSha1() {
    return cqDamEnableSha1;
  }

  public void setCqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
  }

  public ComDayCqDamCoreProcessMetadataProcessorProcessProperties cqDamMetadataXssprotectedProperties(ConfigNodePropertyArray cqDamMetadataXssprotectedProperties) {
    this.cqDamMetadataXssprotectedProperties = cqDamMetadataXssprotectedProperties;
    return this;
  }

   /**
   * Get cqDamMetadataXssprotectedProperties
   * @return cqDamMetadataXssprotectedProperties
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqDamMetadataXssprotectedProperties() {
    return cqDamMetadataXssprotectedProperties;
  }

  public void setCqDamMetadataXssprotectedProperties(ConfigNodePropertyArray cqDamMetadataXssprotectedProperties) {
    this.cqDamMetadataXssprotectedProperties = cqDamMetadataXssprotectedProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreProcessMetadataProcessorProcessProperties comDayCqDamCoreProcessMetadataProcessorProcessProperties = (ComDayCqDamCoreProcessMetadataProcessorProcessProperties) o;
    return Objects.equals(this.processLabel, comDayCqDamCoreProcessMetadataProcessorProcessProperties.processLabel) &&
        Objects.equals(this.cqDamEnableSha1, comDayCqDamCoreProcessMetadataProcessorProcessProperties.cqDamEnableSha1) &&
        Objects.equals(this.cqDamMetadataXssprotectedProperties, comDayCqDamCoreProcessMetadataProcessorProcessProperties.cqDamMetadataXssprotectedProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel, cqDamEnableSha1, cqDamMetadataXssprotectedProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreProcessMetadataProcessorProcessProperties {\n");
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    cqDamEnableSha1: ").append(toIndentedString(cqDamEnableSha1)).append("\n");
    sb.append("    cqDamMetadataXssprotectedProperties: ").append(toIndentedString(cqDamMetadataXssprotectedProperties)).append("\n");
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

