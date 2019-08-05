package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties   {
  
  private @Valid ConfigNodePropertyString jobTopics = null;

  /**
   **/
  public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties jobTopics(ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("job.topics")
  public ConfigNodePropertyString getJobTopics() {
    return jobTopics;
  }
  public void setJobTopics(ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties = (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties) o;
    return Objects.equals(jobTopics, comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties.jobTopics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobTopics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties {\n");
    
    sb.append("    jobTopics: ").append(toIndentedString(jobTopics)).append("\n");
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

