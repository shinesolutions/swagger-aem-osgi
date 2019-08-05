package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties   {
  
  private ConfigNodePropertyInteger maxQuartzJobDurationAcceptable = null;


  /**
   **/
  public OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties maxQuartzJobDurationAcceptable(ConfigNodePropertyInteger maxQuartzJobDurationAcceptable) {
    this.maxQuartzJobDurationAcceptable = maxQuartzJobDurationAcceptable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max.quartzJob.duration.acceptable")
  public ConfigNodePropertyInteger getMaxQuartzJobDurationAcceptable() {
    return maxQuartzJobDurationAcceptable;
  }
  public void setMaxQuartzJobDurationAcceptable(ConfigNodePropertyInteger maxQuartzJobDurationAcceptable) {
    this.maxQuartzJobDurationAcceptable = maxQuartzJobDurationAcceptable;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties = (OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties) o;
    return Objects.equals(maxQuartzJobDurationAcceptable, orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.maxQuartzJobDurationAcceptable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxQuartzJobDurationAcceptable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties {\n");
    
    sb.append("    maxQuartzJobDurationAcceptable: ").append(toIndentedString(maxQuartzJobDurationAcceptable)).append("\n");
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

