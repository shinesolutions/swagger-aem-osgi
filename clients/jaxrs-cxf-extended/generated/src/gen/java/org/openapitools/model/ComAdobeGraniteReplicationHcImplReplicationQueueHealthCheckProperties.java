package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger numberOfRetriesAllowed;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray hcTags;
 /**
  * Get numberOfRetriesAllowed
  * @return numberOfRetriesAllowed
  */
  @JsonProperty("number.of.retries.allowed")
  public ConfigNodePropertyInteger getNumberOfRetriesAllowed() {
    return numberOfRetriesAllowed;
  }

  /**
   * Sets the <code>numberOfRetriesAllowed</code> property.
   */
 public void setNumberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
  }

  /**
   * Sets the <code>numberOfRetriesAllowed</code> property.
   */
  public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties numberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
    return this;
  }

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
  public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
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
    ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties = (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties) o;
    return Objects.equals(this.numberOfRetriesAllowed, comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.numberOfRetriesAllowed) &&
        Objects.equals(this.hcTags, comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.hcTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfRetriesAllowed, hcTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties {\n");
    
    sb.append("    numberOfRetriesAllowed: ").append(toIndentedString(numberOfRetriesAllowed)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
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

