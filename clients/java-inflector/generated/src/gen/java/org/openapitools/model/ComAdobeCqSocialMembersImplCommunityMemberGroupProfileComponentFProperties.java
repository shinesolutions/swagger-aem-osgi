package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties   {
  @JsonProperty("everyoneLimit")
  private ConfigNodePropertyInteger everyoneLimit;

  @JsonProperty("priority")
  private ConfigNodePropertyInteger priority;

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

