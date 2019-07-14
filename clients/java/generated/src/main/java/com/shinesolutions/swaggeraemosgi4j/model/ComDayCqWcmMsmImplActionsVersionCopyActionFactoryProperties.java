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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties {
  public static final String SERIALIZED_NAME_CQ_WCM_MSM_ACTION_EXCLUDEDNODETYPES = "cq.wcm.msm.action.excludednodetypes";
  @SerializedName(SERIALIZED_NAME_CQ_WCM_MSM_ACTION_EXCLUDEDNODETYPES)
  private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes = null;

  public static final String SERIALIZED_NAME_CQ_WCM_MSM_ACTION_EXCLUDEDPARAGRAPHITEMS = "cq.wcm.msm.action.excludedparagraphitems";
  @SerializedName(SERIALIZED_NAME_CQ_WCM_MSM_ACTION_EXCLUDEDPARAGRAPHITEMS)
  private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems = null;

  public static final String SERIALIZED_NAME_CQ_WCM_MSM_ACTION_EXCLUDEDPROPS = "cq.wcm.msm.action.excludedprops";
  @SerializedName(SERIALIZED_NAME_CQ_WCM_MSM_ACTION_EXCLUDEDPROPS)
  private ConfigNodePropertyArray cqWcmMsmActionExcludedprops = null;

  public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties cqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
    return this;
  }

   /**
   * Get cqWcmMsmActionExcludednodetypes
   * @return cqWcmMsmActionExcludednodetypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludednodetypes() {
    return cqWcmMsmActionExcludednodetypes;
  }

  public void setCqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
  }

  public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties cqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
    return this;
  }

   /**
   * Get cqWcmMsmActionExcludedparagraphitems
   * @return cqWcmMsmActionExcludedparagraphitems
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedparagraphitems() {
    return cqWcmMsmActionExcludedparagraphitems;
  }

  public void setCqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
  }

  public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties cqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
    return this;
  }

   /**
   * Get cqWcmMsmActionExcludedprops
   * @return cqWcmMsmActionExcludedprops
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedprops() {
    return cqWcmMsmActionExcludedprops;
  }

  public void setCqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties = (ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties) o;
    return Objects.equals(this.cqWcmMsmActionExcludednodetypes, comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties.cqWcmMsmActionExcludednodetypes) &&
        Objects.equals(this.cqWcmMsmActionExcludedparagraphitems, comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties.cqWcmMsmActionExcludedparagraphitems) &&
        Objects.equals(this.cqWcmMsmActionExcludedprops, comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties.cqWcmMsmActionExcludedprops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWcmMsmActionExcludednodetypes, cqWcmMsmActionExcludedparagraphitems, cqWcmMsmActionExcludedprops);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties {\n");
    sb.append("    cqWcmMsmActionExcludednodetypes: ").append(toIndentedString(cqWcmMsmActionExcludednodetypes)).append("\n");
    sb.append("    cqWcmMsmActionExcludedparagraphitems: ").append(toIndentedString(cqWcmMsmActionExcludedparagraphitems)).append("\n");
    sb.append("    cqWcmMsmActionExcludedprops: ").append(toIndentedString(cqWcmMsmActionExcludedprops)).append("\n");
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

