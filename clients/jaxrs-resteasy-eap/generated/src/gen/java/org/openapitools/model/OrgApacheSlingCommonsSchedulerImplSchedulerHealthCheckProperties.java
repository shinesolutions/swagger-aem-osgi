package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties   {
  

  private ConfigNodePropertyInteger maxQuartzJobDurationAcceptable = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("max.quartzJob.duration.acceptable")
  public ConfigNodePropertyInteger getMaxQuartzJobDurationAcceptable() {
    return maxQuartzJobDurationAcceptable;
  }
  public void setMaxQuartzJobDurationAcceptable(ConfigNodePropertyInteger maxQuartzJobDurationAcceptable) {
    this.maxQuartzJobDurationAcceptable = maxQuartzJobDurationAcceptable;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

