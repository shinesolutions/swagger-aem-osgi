package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties   {
  @JsonProperty("enableScheduledPostsSearch")
  private ConfigNodePropertyBoolean enableScheduledPostsSearch;

  @JsonProperty("numberOfMinutes")
  private ConfigNodePropertyInteger numberOfMinutes;

  @JsonProperty("maxSearchLimit")
  private ConfigNodePropertyInteger maxSearchLimit;

  public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties enableScheduledPostsSearch(ConfigNodePropertyBoolean enableScheduledPostsSearch) {
    this.enableScheduledPostsSearch = enableScheduledPostsSearch;
    return this;
  }

  /**
   * Get enableScheduledPostsSearch
   * @return enableScheduledPostsSearch
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnableScheduledPostsSearch() {
    return enableScheduledPostsSearch;
  }

  public void setEnableScheduledPostsSearch(ConfigNodePropertyBoolean enableScheduledPostsSearch) {
    this.enableScheduledPostsSearch = enableScheduledPostsSearch;
  }

  public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties numberOfMinutes(ConfigNodePropertyInteger numberOfMinutes) {
    this.numberOfMinutes = numberOfMinutes;
    return this;
  }

  /**
   * Get numberOfMinutes
   * @return numberOfMinutes
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getNumberOfMinutes() {
    return numberOfMinutes;
  }

  public void setNumberOfMinutes(ConfigNodePropertyInteger numberOfMinutes) {
    this.numberOfMinutes = numberOfMinutes;
  }

  public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties maxSearchLimit(ConfigNodePropertyInteger maxSearchLimit) {
    this.maxSearchLimit = maxSearchLimit;
    return this;
  }

  /**
   * Get maxSearchLimit
   * @return maxSearchLimit
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxSearchLimit() {
    return maxSearchLimit;
  }

  public void setMaxSearchLimit(ConfigNodePropertyInteger maxSearchLimit) {
    this.maxSearchLimit = maxSearchLimit;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

