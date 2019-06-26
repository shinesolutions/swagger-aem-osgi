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
 * ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T12:10:03.209Z[GMT]")
public class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactoryProperties {
  public static final String SERIALIZED_NAME_EVERYONE_LIMIT = "everyoneLimit";
  @SerializedName(SERIALIZED_NAME_EVERYONE_LIMIT)
  private ConfigNodePropertyInteger everyoneLimit = null;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private ConfigNodePropertyInteger priority = null;

  public ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactoryProperties everyoneLimit(ConfigNodePropertyInteger everyoneLimit) {
    this.everyoneLimit = everyoneLimit;
    return this;
  }

   /**
   * Get everyoneLimit
   * @return everyoneLimit
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getEveryoneLimit() {
    return everyoneLimit;
  }

  public void setEveryoneLimit(ConfigNodePropertyInteger everyoneLimit) {
    this.everyoneLimit = everyoneLimit;
  }

  public ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactoryProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactoryProperties comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactoryProperties = (ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactoryProperties) o;
    return Objects.equals(this.everyoneLimit, comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactoryProperties.everyoneLimit) &&
        Objects.equals(this.priority, comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactoryProperties.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(everyoneLimit, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactoryProperties {\n");
    sb.append("    everyoneLimit: ").append(toIndentedString(everyoneLimit)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

