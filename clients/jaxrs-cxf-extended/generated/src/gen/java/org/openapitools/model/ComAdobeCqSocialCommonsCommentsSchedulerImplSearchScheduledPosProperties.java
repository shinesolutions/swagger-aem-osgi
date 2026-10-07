package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableScheduledPostsSearch;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger numberOfMinutes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxSearchLimit;
 /**
  * Get enableScheduledPostsSearch
  * @return enableScheduledPostsSearch
  */
  @JsonProperty("enableScheduledPostsSearch")
  public ConfigNodePropertyBoolean getEnableScheduledPostsSearch() {
    return enableScheduledPostsSearch;
  }

  /**
   * Sets the <code>enableScheduledPostsSearch</code> property.
   */
 public void setEnableScheduledPostsSearch(ConfigNodePropertyBoolean enableScheduledPostsSearch) {
    this.enableScheduledPostsSearch = enableScheduledPostsSearch;
  }

  /**
   * Sets the <code>enableScheduledPostsSearch</code> property.
   */
  public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties enableScheduledPostsSearch(ConfigNodePropertyBoolean enableScheduledPostsSearch) {
    this.enableScheduledPostsSearch = enableScheduledPostsSearch;
    return this;
  }

 /**
  * Get numberOfMinutes
  * @return numberOfMinutes
  */
  @JsonProperty("numberOfMinutes")
  public ConfigNodePropertyInteger getNumberOfMinutes() {
    return numberOfMinutes;
  }

  /**
   * Sets the <code>numberOfMinutes</code> property.
   */
 public void setNumberOfMinutes(ConfigNodePropertyInteger numberOfMinutes) {
    this.numberOfMinutes = numberOfMinutes;
  }

  /**
   * Sets the <code>numberOfMinutes</code> property.
   */
  public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties numberOfMinutes(ConfigNodePropertyInteger numberOfMinutes) {
    this.numberOfMinutes = numberOfMinutes;
    return this;
  }

 /**
  * Get maxSearchLimit
  * @return maxSearchLimit
  */
  @JsonProperty("maxSearchLimit")
  public ConfigNodePropertyInteger getMaxSearchLimit() {
    return maxSearchLimit;
  }

  /**
   * Sets the <code>maxSearchLimit</code> property.
   */
 public void setMaxSearchLimit(ConfigNodePropertyInteger maxSearchLimit) {
    this.maxSearchLimit = maxSearchLimit;
  }

  /**
   * Sets the <code>maxSearchLimit</code> property.
   */
  public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties maxSearchLimit(ConfigNodePropertyInteger maxSearchLimit) {
    this.maxSearchLimit = maxSearchLimit;
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
    ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties = (ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties) o;
    return Objects.equals(this.enableScheduledPostsSearch, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.enableScheduledPostsSearch) &&
        Objects.equals(this.numberOfMinutes, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.numberOfMinutes) &&
        Objects.equals(this.maxSearchLimit, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.maxSearchLimit);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

