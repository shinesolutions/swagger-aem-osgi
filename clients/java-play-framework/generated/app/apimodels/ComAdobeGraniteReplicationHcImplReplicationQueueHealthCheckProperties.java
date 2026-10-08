package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties   {
  @JsonProperty("number.of.retries.allowed")
  @Valid

  private ConfigNodePropertyInteger numberOfRetriesAllowed;

  @JsonProperty("hc.tags")
  @Valid

  private ConfigNodePropertyArray hcTags;

  public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties numberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
    return this;
  }

   /**
   * Get numberOfRetriesAllowed
   * @return numberOfRetriesAllowed
  **/
  public ConfigNodePropertyInteger getNumberOfRetriesAllowed() {
    return numberOfRetriesAllowed;
  }

  public void setNumberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
  }

  public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

   /**
   * Get hcTags
   * @return hcTags
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

