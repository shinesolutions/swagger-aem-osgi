package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties   {
  @JsonProperty("max.quartzJob.duration.acceptable")
  private ConfigNodePropertyInteger maxQuartzJobDurationAcceptable;

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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

