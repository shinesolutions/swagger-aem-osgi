package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeCqSocialSyncImplDiffChangesObserverProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqSocialSyncImplDiffChangesObserverProperties   {
  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  @JsonProperty("agentName")
  private ConfigNodePropertyString agentName = null;

  @JsonProperty("diffPath")
  private ConfigNodePropertyString diffPath = null;

  @JsonProperty("propertyNames")
  private ConfigNodePropertyString propertyNames = null;

  public ComAdobeCqSocialSyncImplDiffChangesObserverProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeCqSocialSyncImplDiffChangesObserverProperties agentName(ConfigNodePropertyString agentName) {
    this.agentName = agentName;
    return this;
  }

   /**
   * Get agentName
   * @return agentName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAgentName() {
    return agentName;
  }

  public void setAgentName(ConfigNodePropertyString agentName) {
    this.agentName = agentName;
  }

  public ComAdobeCqSocialSyncImplDiffChangesObserverProperties diffPath(ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
    return this;
  }

   /**
   * Get diffPath
   * @return diffPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDiffPath() {
    return diffPath;
  }

  public void setDiffPath(ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
  }

  public ComAdobeCqSocialSyncImplDiffChangesObserverProperties propertyNames(ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
    return this;
  }

   /**
   * Get propertyNames
   * @return propertyNames
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPropertyNames() {
    return propertyNames;
  }

  public void setPropertyNames(ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialSyncImplDiffChangesObserverProperties comAdobeCqSocialSyncImplDiffChangesObserverProperties = (ComAdobeCqSocialSyncImplDiffChangesObserverProperties) o;
    return Objects.equals(this.enabled, comAdobeCqSocialSyncImplDiffChangesObserverProperties.enabled) &&
        Objects.equals(this.agentName, comAdobeCqSocialSyncImplDiffChangesObserverProperties.agentName) &&
        Objects.equals(this.diffPath, comAdobeCqSocialSyncImplDiffChangesObserverProperties.diffPath) &&
        Objects.equals(this.propertyNames, comAdobeCqSocialSyncImplDiffChangesObserverProperties.propertyNames);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

