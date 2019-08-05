package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties   {
  
  private ConfigNodePropertyInteger numberOfRetriesAllowed = null;
  private ConfigNodePropertyArray hcTags = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("number.of.retries.allowed")
  public ConfigNodePropertyInteger getNumberOfRetriesAllowed() {
    return numberOfRetriesAllowed;
  }
  public void setNumberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

