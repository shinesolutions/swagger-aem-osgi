package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties   {
  @JsonProperty("job.consumermanager.disableDistribution")
  private ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution = null;

  @JsonProperty("startup.delay")
  private ConfigNodePropertyInteger startupDelay = null;

  @JsonProperty("cleanup.period")
  private ConfigNodePropertyInteger cleanupPeriod = null;

  public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties jobConsumermanagerDisableDistribution(ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution) {
    this.jobConsumermanagerDisableDistribution = jobConsumermanagerDisableDistribution;
    return this;
  }

   /**
   * Get jobConsumermanagerDisableDistribution
   * @return jobConsumermanagerDisableDistribution
  **/
  @Valid
  public ConfigNodePropertyBoolean getJobConsumermanagerDisableDistribution() {
    return jobConsumermanagerDisableDistribution;
  }

  public void setJobConsumermanagerDisableDistribution(ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution) {
    this.jobConsumermanagerDisableDistribution = jobConsumermanagerDisableDistribution;
  }

  public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties startupDelay(ConfigNodePropertyInteger startupDelay) {
    this.startupDelay = startupDelay;
    return this;
  }

   /**
   * Get startupDelay
   * @return startupDelay
  **/
  @Valid
  public ConfigNodePropertyInteger getStartupDelay() {
    return startupDelay;
  }

  public void setStartupDelay(ConfigNodePropertyInteger startupDelay) {
    this.startupDelay = startupDelay;
  }

  public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties cleanupPeriod(ConfigNodePropertyInteger cleanupPeriod) {
    this.cleanupPeriod = cleanupPeriod;
    return this;
  }

   /**
   * Get cleanupPeriod
   * @return cleanupPeriod
  **/
  @Valid
  public ConfigNodePropertyInteger getCleanupPeriod() {
    return cleanupPeriod;
  }

  public void setCleanupPeriod(ConfigNodePropertyInteger cleanupPeriod) {
    this.cleanupPeriod = cleanupPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties = (OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties) o;
    return Objects.equals(jobConsumermanagerDisableDistribution, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.jobConsumermanagerDisableDistribution) &&
        Objects.equals(startupDelay, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.startupDelay) &&
        Objects.equals(cleanupPeriod, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.cleanupPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobConsumermanagerDisableDistribution, startupDelay, cleanupPeriod);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties {\n");
    
    sb.append("    jobConsumermanagerDisableDistribution: ").append(toIndentedString(jobConsumermanagerDisableDistribution)).append("\n");
    sb.append("    startupDelay: ").append(toIndentedString(startupDelay)).append("\n");
    sb.append("    cleanupPeriod: ").append(toIndentedString(cleanupPeriod)).append("\n");
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

