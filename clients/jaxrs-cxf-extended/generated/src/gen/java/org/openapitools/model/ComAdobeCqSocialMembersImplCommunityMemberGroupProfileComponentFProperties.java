package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger everyoneLimit;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger priority;
 /**
  * Get everyoneLimit
  * @return everyoneLimit
  */
  @JsonProperty("everyoneLimit")
  public ConfigNodePropertyInteger getEveryoneLimit() {
    return everyoneLimit;
  }

  /**
   * Sets the <code>everyoneLimit</code> property.
   */
 public void setEveryoneLimit(ConfigNodePropertyInteger everyoneLimit) {
    this.everyoneLimit = everyoneLimit;
  }

  /**
   * Sets the <code>everyoneLimit</code> property.
   */
  public ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties everyoneLimit(ConfigNodePropertyInteger everyoneLimit) {
    this.everyoneLimit = everyoneLimit;
    return this;
  }

 /**
  * Get priority
  * @return priority
  */
  @JsonProperty("priority")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  /**
   * Sets the <code>priority</code> property.
   */
 public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }

  /**
   * Sets the <code>priority</code> property.
   */
  public ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
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
    return Objects.equals(this.everyoneLimit, comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.everyoneLimit) &&
        Objects.equals(this.priority, comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.priority);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

