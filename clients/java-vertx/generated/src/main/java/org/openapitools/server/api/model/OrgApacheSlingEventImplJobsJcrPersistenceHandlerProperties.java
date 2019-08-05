package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties   {
  
  private ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution = null;
  private ConfigNodePropertyInteger startupDelay = null;
  private ConfigNodePropertyInteger cleanupPeriod = null;

  public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties () {

  }

  public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties (ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution, ConfigNodePropertyInteger startupDelay, ConfigNodePropertyInteger cleanupPeriod) {
    this.jobConsumermanagerDisableDistribution = jobConsumermanagerDisableDistribution;
    this.startupDelay = startupDelay;
    this.cleanupPeriod = cleanupPeriod;
  }

    
  @JsonProperty("job.consumermanager.disableDistribution")
  public ConfigNodePropertyBoolean getJobConsumermanagerDisableDistribution() {
    return jobConsumermanagerDisableDistribution;
  }
  public void setJobConsumermanagerDisableDistribution(ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution) {
    this.jobConsumermanagerDisableDistribution = jobConsumermanagerDisableDistribution;
  }

    
  @JsonProperty("startup.delay")
  public ConfigNodePropertyInteger getStartupDelay() {
    return startupDelay;
  }
  public void setStartupDelay(ConfigNodePropertyInteger startupDelay) {
    this.startupDelay = startupDelay;
  }

    
  @JsonProperty("cleanup.period")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
