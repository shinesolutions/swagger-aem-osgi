package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray flushAgents;
 /**
  * Get flushAgents
  * @return flushAgents
  */
  @JsonProperty("Flush agents")
  public ConfigNodePropertyArray getFlushAgents() {
    return flushAgents;
  }

  /**
   * Sets the <code>flushAgents</code> property.
   */
 public void setFlushAgents(ConfigNodePropertyArray flushAgents) {
    this.flushAgents = flushAgents;
  }

  /**
   * Sets the <code>flushAgents</code> property.
   */
  public ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties flushAgents(ConfigNodePropertyArray flushAgents) {
    this.flushAgents = flushAgents;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties comDayCqWcmWebservicesupportImplReplicationEventListenerProperties = (ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties) o;
    return Objects.equals(this.flushAgents, comDayCqWcmWebservicesupportImplReplicationEventListenerProperties.flushAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flushAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties {\n");
    
    sb.append("    flushAgents: ").append(toIndentedString(flushAgents)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

