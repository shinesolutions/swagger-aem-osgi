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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqWcmFoundationImplPageImpressionsTrackerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T02:21:59.870Z[GMT]")
public class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties {
  public static final String SERIALIZED_NAME_SLING_AUTH_REQUIREMENTS = "sling.auth.requirements";
  @SerializedName(SERIALIZED_NAME_SLING_AUTH_REQUIREMENTS)
  private ConfigNodePropertyString slingAuthRequirements = null;

  public ComDayCqWcmFoundationImplPageImpressionsTrackerProperties slingAuthRequirements(ConfigNodePropertyString slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
    return this;
  }

   /**
   * Get slingAuthRequirements
   * @return slingAuthRequirements
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingAuthRequirements() {
    return slingAuthRequirements;
  }

  public void setSlingAuthRequirements(ConfigNodePropertyString slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationImplPageImpressionsTrackerProperties comDayCqWcmFoundationImplPageImpressionsTrackerProperties = (ComDayCqWcmFoundationImplPageImpressionsTrackerProperties) o;
    return Objects.equals(this.slingAuthRequirements, comDayCqWcmFoundationImplPageImpressionsTrackerProperties.slingAuthRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingAuthRequirements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties {\n");
    sb.append("    slingAuthRequirements: ").append(toIndentedString(slingAuthRequirements)).append("\n");
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

