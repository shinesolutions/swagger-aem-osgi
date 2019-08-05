package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties   {
  
  private @Valid ConfigNodePropertyArray commitsTrackerWriterGroups = null;

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties commitsTrackerWriterGroups(ConfigNodePropertyArray commitsTrackerWriterGroups) {
    this.commitsTrackerWriterGroups = commitsTrackerWriterGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("commitsTrackerWriterGroups")
  public ConfigNodePropertyArray getCommitsTrackerWriterGroups() {
    return commitsTrackerWriterGroups;
  }
  public void setCommitsTrackerWriterGroups(ConfigNodePropertyArray commitsTrackerWriterGroups) {
    this.commitsTrackerWriterGroups = commitsTrackerWriterGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties = (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties) o;
    return Objects.equals(commitsTrackerWriterGroups, orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.commitsTrackerWriterGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitsTrackerWriterGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties {\n");
    
    sb.append("    commitsTrackerWriterGroups: ").append(toIndentedString(commitsTrackerWriterGroups)).append("\n");
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

