package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialSyncImplDiffChangesObserverProperties   {
  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled;

  @JsonProperty("agentName")
  private ConfigNodePropertyString agentName;

  @JsonProperty("diffPath")
  private ConfigNodePropertyString diffPath;

  @JsonProperty("propertyNames")
  private ConfigNodePropertyString propertyNames;

  /**
   **/
  public ComAdobeCqSocialSyncImplDiffChangesObserverProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  public ComAdobeCqSocialSyncImplDiffChangesObserverProperties agentName(ConfigNodePropertyString agentName) {
    this.agentName = agentName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("agentName")
  public ConfigNodePropertyString getAgentName() {
    return agentName;
  }
  public void setAgentName(ConfigNodePropertyString agentName) {
    this.agentName = agentName;
  }

  /**
   **/
  public ComAdobeCqSocialSyncImplDiffChangesObserverProperties diffPath(ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("diffPath")
  public ConfigNodePropertyString getDiffPath() {
    return diffPath;
  }
  public void setDiffPath(ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
  }

  /**
   **/
  public ComAdobeCqSocialSyncImplDiffChangesObserverProperties propertyNames(ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("propertyNames")
  public ConfigNodePropertyString getPropertyNames() {
    return propertyNames;
  }
  public void setPropertyNames(ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialSyncImplDiffChangesObserverProperties comAdobeCqSocialSyncImplDiffChangesObserverProperties = (ComAdobeCqSocialSyncImplDiffChangesObserverProperties) o;
    return Objects.equals(enabled, comAdobeCqSocialSyncImplDiffChangesObserverProperties.enabled) &&
        Objects.equals(agentName, comAdobeCqSocialSyncImplDiffChangesObserverProperties.agentName) &&
        Objects.equals(diffPath, comAdobeCqSocialSyncImplDiffChangesObserverProperties.diffPath) &&
        Objects.equals(propertyNames, comAdobeCqSocialSyncImplDiffChangesObserverProperties.propertyNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, agentName, diffPath, propertyNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialSyncImplDiffChangesObserverProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    diffPath: ").append(toIndentedString(diffPath)).append("\n");
    sb.append("    propertyNames: ").append(toIndentedString(propertyNames)).append("\n");
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

