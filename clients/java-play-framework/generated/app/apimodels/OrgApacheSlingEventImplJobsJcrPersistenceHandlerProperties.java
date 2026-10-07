package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties   {
  @JsonProperty("job.consumermanager.disableDistribution")
  @Valid

  private ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution;

  @JsonProperty("startup.delay")
  @Valid

  private ConfigNodePropertyInteger startupDelay;

  @JsonProperty("cleanup.period")
  @Valid

  private ConfigNodePropertyInteger cleanupPeriod;

  public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties jobConsumermanagerDisableDistribution(ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution) {
    this.jobConsumermanagerDisableDistribution = jobConsumermanagerDisableDistribution;
    return this;
  }

   /**
   * Get jobConsumermanagerDisableDistribution
   * @return jobConsumermanagerDisableDistribution
  **/
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
  public ConfigNodePropertyInteger getCleanupPeriod() {
    return cleanupPeriod;
  }

  public void setCleanupPeriod(ConfigNodePropertyInteger cleanupPeriod) {
    this.cleanupPeriod = cleanupPeriod;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

