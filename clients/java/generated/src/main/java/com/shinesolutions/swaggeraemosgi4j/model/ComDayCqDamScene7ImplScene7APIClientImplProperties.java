/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
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
 * ComDayCqDamScene7ImplScene7APIClientImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class ComDayCqDamScene7ImplScene7APIClientImplProperties {
  public static final String SERIALIZED_NAME_CQ_DAM_SCENE7_APICLIENT_RECORDSPERPAGE_NOFILTER_NAME = "cq.dam.scene7.apiclient.recordsperpage.nofilter.name";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_SCENE7_APICLIENT_RECORDSPERPAGE_NOFILTER_NAME)
  private ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageNofilterName = null;

  public static final String SERIALIZED_NAME_CQ_DAM_SCENE7_APICLIENT_RECORDSPERPAGE_WITHFILTER_NAME = "cq.dam.scene7.apiclient.recordsperpage.withfilter.name";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_SCENE7_APICLIENT_RECORDSPERPAGE_WITHFILTER_NAME)
  private ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageWithfilterName = null;

  public ComDayCqDamScene7ImplScene7APIClientImplProperties cqDamScene7ApiclientRecordsperpageNofilterName(ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageNofilterName) {
    this.cqDamScene7ApiclientRecordsperpageNofilterName = cqDamScene7ApiclientRecordsperpageNofilterName;
    return this;
  }

   /**
   * Get cqDamScene7ApiclientRecordsperpageNofilterName
   * @return cqDamScene7ApiclientRecordsperpageNofilterName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCqDamScene7ApiclientRecordsperpageNofilterName() {
    return cqDamScene7ApiclientRecordsperpageNofilterName;
  }

  public void setCqDamScene7ApiclientRecordsperpageNofilterName(ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageNofilterName) {
    this.cqDamScene7ApiclientRecordsperpageNofilterName = cqDamScene7ApiclientRecordsperpageNofilterName;
  }

  public ComDayCqDamScene7ImplScene7APIClientImplProperties cqDamScene7ApiclientRecordsperpageWithfilterName(ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageWithfilterName) {
    this.cqDamScene7ApiclientRecordsperpageWithfilterName = cqDamScene7ApiclientRecordsperpageWithfilterName;
    return this;
  }

   /**
   * Get cqDamScene7ApiclientRecordsperpageWithfilterName
   * @return cqDamScene7ApiclientRecordsperpageWithfilterName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCqDamScene7ApiclientRecordsperpageWithfilterName() {
    return cqDamScene7ApiclientRecordsperpageWithfilterName;
  }

  public void setCqDamScene7ApiclientRecordsperpageWithfilterName(ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageWithfilterName) {
    this.cqDamScene7ApiclientRecordsperpageWithfilterName = cqDamScene7ApiclientRecordsperpageWithfilterName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7APIClientImplProperties comDayCqDamScene7ImplScene7APIClientImplProperties = (ComDayCqDamScene7ImplScene7APIClientImplProperties) o;
    return Objects.equals(this.cqDamScene7ApiclientRecordsperpageNofilterName, comDayCqDamScene7ImplScene7APIClientImplProperties.cqDamScene7ApiclientRecordsperpageNofilterName) &&
        Objects.equals(this.cqDamScene7ApiclientRecordsperpageWithfilterName, comDayCqDamScene7ImplScene7APIClientImplProperties.cqDamScene7ApiclientRecordsperpageWithfilterName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamScene7ApiclientRecordsperpageNofilterName, cqDamScene7ApiclientRecordsperpageWithfilterName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7APIClientImplProperties {\n");
    sb.append("    cqDamScene7ApiclientRecordsperpageNofilterName: ").append(toIndentedString(cqDamScene7ApiclientRecordsperpageNofilterName)).append("\n");
    sb.append("    cqDamScene7ApiclientRecordsperpageWithfilterName: ").append(toIndentedString(cqDamScene7ApiclientRecordsperpageWithfilterName)).append("\n");
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

