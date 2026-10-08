package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties   {
  @JsonProperty("flush.agents")
  private ConfigNodePropertyArray flushAgents;

  public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties flushAgents(ConfigNodePropertyArray flushAgents) {
    this.flushAgents = flushAgents;
    return this;
  }

   /**
   * Get flushAgents
   * @return flushAgents
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getFlushAgents() {
    return flushAgents;
  }

  public void setFlushAgents(ConfigNodePropertyArray flushAgents) {
    this.flushAgents = flushAgents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties = (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties) o;
    return Objects.equals(this.flushAgents, comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.flushAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flushAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties {\n");
    
    sb.append("    flushAgents: ").append(toIndentedString(flushAgents)).append("\n");
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

