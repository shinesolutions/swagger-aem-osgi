package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties   {
  @JsonProperty("max.quartzJob.duration.acceptable")
  private ConfigNodePropertyInteger maxQuartzJobDurationAcceptable = null;

  public OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties maxQuartzJobDurationAcceptable(ConfigNodePropertyInteger maxQuartzJobDurationAcceptable) {
    this.maxQuartzJobDurationAcceptable = maxQuartzJobDurationAcceptable;
    return this;
  }

   /**
   * Get maxQuartzJobDurationAcceptable
   * @return maxQuartzJobDurationAcceptable
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

