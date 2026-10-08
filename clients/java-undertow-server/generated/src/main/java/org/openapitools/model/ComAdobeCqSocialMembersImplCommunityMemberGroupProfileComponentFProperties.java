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
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties   {
  
  private ConfigNodePropertyInteger everyoneLimit;
  private ConfigNodePropertyInteger priority;

  /**
   */
  public ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties everyoneLimit(ConfigNodePropertyInteger everyoneLimit) {
    this.everyoneLimit = everyoneLimit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("everyoneLimit")
  public ConfigNodePropertyInteger getEveryoneLimit() {
    return everyoneLimit;
  }
  public void setEveryoneLimit(ConfigNodePropertyInteger everyoneLimit) {
    this.everyoneLimit = everyoneLimit;
  }

  /**
   */
  public ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("priority")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }
  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties = (ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties) o;
    return Objects.equals(everyoneLimit, comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.everyoneLimit) &&
        Objects.equals(priority, comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(everyoneLimit, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties {\n");
    
    sb.append("    everyoneLimit: ").append(toIndentedString(everyoneLimit)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

