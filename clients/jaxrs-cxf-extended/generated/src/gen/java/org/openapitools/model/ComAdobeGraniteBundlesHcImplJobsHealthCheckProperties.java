package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray hcTags;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxQueuedJobs;
 /**
  * Get hcTags
  * @return hcTags
  */
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  /**
   * Sets the <code>hcTags</code> property.
   */
 public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   * Sets the <code>hcTags</code> property.
   */
  public ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
  * Get maxQueuedJobs
  * @return maxQueuedJobs
  */
  @JsonProperty("max.queued.jobs")
  public ConfigNodePropertyInteger getMaxQueuedJobs() {
    return maxQueuedJobs;
  }

  /**
   * Sets the <code>maxQueuedJobs</code> property.
   */
 public void setMaxQueuedJobs(ConfigNodePropertyInteger maxQueuedJobs) {
    this.maxQueuedJobs = maxQueuedJobs;
  }

  /**
   * Sets the <code>maxQueuedJobs</code> property.
   */
  public ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties maxQueuedJobs(ConfigNodePropertyInteger maxQueuedJobs) {
    this.maxQueuedJobs = maxQueuedJobs;
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
    ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties comAdobeGraniteBundlesHcImplJobsHealthCheckProperties = (ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties) o;
    return Objects.equals(this.hcTags, comAdobeGraniteBundlesHcImplJobsHealthCheckProperties.hcTags) &&
        Objects.equals(this.maxQueuedJobs, comAdobeGraniteBundlesHcImplJobsHealthCheckProperties.maxQueuedJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, maxQueuedJobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties {\n");
    
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    maxQueuedJobs: ").append(toIndentedString(maxQueuedJobs)).append("\n");
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

