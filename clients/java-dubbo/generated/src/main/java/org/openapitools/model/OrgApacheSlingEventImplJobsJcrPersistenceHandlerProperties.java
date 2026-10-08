package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("job.consumermanager.disableDistribution")
  private ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution;

  @JsonProperty("startup.delay")
  private ConfigNodePropertyInteger startupDelay;

  @JsonProperty("cleanup.period")
  private ConfigNodePropertyInteger cleanupPeriod;

  /**
   * 
   * @return jobConsumermanagerDisableDistribution
   */
  public ConfigNodePropertyBoolean getJobConsumermanagerDisableDistribution() {
    return jobConsumermanagerDisableDistribution;
  }

  public void setJobConsumermanagerDisableDistribution(ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution) {
    this.jobConsumermanagerDisableDistribution = jobConsumermanagerDisableDistribution;
  }

  /**
   * 
   * @return startupDelay
   */
  public ConfigNodePropertyInteger getStartupDelay() {
    return startupDelay;
  }

  public void setStartupDelay(ConfigNodePropertyInteger startupDelay) {
    this.startupDelay = startupDelay;
  }

  /**
   * 
   * @return cleanupPeriod
   */
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
    return Objects.equals(this.jobConsumermanagerDisableDistribution, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.jobConsumermanagerDisableDistribution) &&
        Objects.equals(this.startupDelay, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.startupDelay) &&
        Objects.equals(this.cleanupPeriod, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.cleanupPeriod);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
