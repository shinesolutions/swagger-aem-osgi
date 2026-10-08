package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheFelixSystemreadySystemReadyMonitorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger pollInterval;
 /**
  * Get pollInterval
  * @return pollInterval
  */
  @JsonProperty("poll.interval")
  public ConfigNodePropertyInteger getPollInterval() {
    return pollInterval;
  }

  /**
   * Sets the <code>pollInterval</code> property.
   */
 public void setPollInterval(ConfigNodePropertyInteger pollInterval) {
    this.pollInterval = pollInterval;
  }

  /**
   * Sets the <code>pollInterval</code> property.
   */
  public OrgApacheFelixSystemreadySystemReadyMonitorProperties pollInterval(ConfigNodePropertyInteger pollInterval) {
    this.pollInterval = pollInterval;
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
    OrgApacheFelixSystemreadySystemReadyMonitorProperties orgApacheFelixSystemreadySystemReadyMonitorProperties = (OrgApacheFelixSystemreadySystemReadyMonitorProperties) o;
    return Objects.equals(this.pollInterval, orgApacheFelixSystemreadySystemReadyMonitorProperties.pollInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pollInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixSystemreadySystemReadyMonitorProperties {\n");
    
    sb.append("    pollInterval: ").append(toIndentedString(pollInterval)).append("\n");
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

