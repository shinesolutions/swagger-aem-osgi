package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties   {
  
  private ConfigNodePropertyBoolean enableScheduledPostsSearch = null;
  private ConfigNodePropertyInteger numberOfMinutes = null;
  private ConfigNodePropertyInteger maxSearchLimit = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableScheduledPostsSearch")
  public ConfigNodePropertyBoolean getEnableScheduledPostsSearch() {
    return enableScheduledPostsSearch;
  }
  public void setEnableScheduledPostsSearch(ConfigNodePropertyBoolean enableScheduledPostsSearch) {
    this.enableScheduledPostsSearch = enableScheduledPostsSearch;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfMinutes")
  public ConfigNodePropertyInteger getNumberOfMinutes() {
    return numberOfMinutes;
  }
  public void setNumberOfMinutes(ConfigNodePropertyInteger numberOfMinutes) {
    this.numberOfMinutes = numberOfMinutes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxSearchLimit")
  public ConfigNodePropertyInteger getMaxSearchLimit() {
    return maxSearchLimit;
  }
  public void setMaxSearchLimit(ConfigNodePropertyInteger maxSearchLimit) {
    this.maxSearchLimit = maxSearchLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties = (ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties) o;
    return Objects.equals(enableScheduledPostsSearch, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.enableScheduledPostsSearch) &&
        Objects.equals(numberOfMinutes, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.numberOfMinutes) &&
        Objects.equals(maxSearchLimit, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.maxSearchLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableScheduledPostsSearch, numberOfMinutes, maxSearchLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties {\n");
    
    sb.append("    enableScheduledPostsSearch: ").append(toIndentedString(enableScheduledPostsSearch)).append("\n");
    sb.append("    numberOfMinutes: ").append(toIndentedString(numberOfMinutes)).append("\n");
    sb.append("    maxSearchLimit: ").append(toIndentedString(maxSearchLimit)).append("\n");
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

