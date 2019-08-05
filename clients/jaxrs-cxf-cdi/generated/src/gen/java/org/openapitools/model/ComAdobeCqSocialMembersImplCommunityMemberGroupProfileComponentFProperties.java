package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties   {
  
  private ConfigNodePropertyInteger everyoneLimit = null;

  private ConfigNodePropertyInteger priority = null;


  /**
   **/
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
   **/
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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

