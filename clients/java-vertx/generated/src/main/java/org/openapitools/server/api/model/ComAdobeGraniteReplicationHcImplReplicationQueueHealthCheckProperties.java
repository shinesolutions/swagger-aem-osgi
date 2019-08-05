package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties   {
  
  private ConfigNodePropertyInteger numberOfRetriesAllowed = null;
  private ConfigNodePropertyArray hcTags = null;

  public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties () {

  }

  public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties (ConfigNodePropertyInteger numberOfRetriesAllowed, ConfigNodePropertyArray hcTags) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
    this.hcTags = hcTags;
  }

    
  @JsonProperty("number.of.retries.allowed")
  public ConfigNodePropertyInteger getNumberOfRetriesAllowed() {
    return numberOfRetriesAllowed;
  }
  public void setNumberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
  }

    
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties = (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties) o;
    return Objects.equals(numberOfRetriesAllowed, comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.numberOfRetriesAllowed) &&
        Objects.equals(hcTags, comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.hcTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfRetriesAllowed, hcTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties {\n");
    
    sb.append("    numberOfRetriesAllowed: ").append(toIndentedString(numberOfRetriesAllowed)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
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
