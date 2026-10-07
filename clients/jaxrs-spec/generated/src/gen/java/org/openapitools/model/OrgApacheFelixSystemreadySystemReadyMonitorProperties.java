package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheFelixSystemreadySystemReadyMonitorProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixSystemreadySystemReadyMonitorProperties   {
  private ConfigNodePropertyInteger pollInterval;

  public OrgApacheFelixSystemreadySystemReadyMonitorProperties() {
  }

  /**
   **/
  public OrgApacheFelixSystemreadySystemReadyMonitorProperties pollInterval(ConfigNodePropertyInteger pollInterval) {
    this.pollInterval = pollInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("poll.interval")
  @Valid public ConfigNodePropertyInteger getPollInterval() {
    return pollInterval;
  }

  @JsonProperty("poll.interval")
  public void setPollInterval(ConfigNodePropertyInteger pollInterval) {
    this.pollInterval = pollInterval;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
