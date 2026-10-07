package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray activeRunModes;
 /**
  * Get activeRunModes
  * @return activeRunModes
  */
  @JsonProperty("activeRunModes")
  public ConfigNodePropertyArray getActiveRunModes() {
    return activeRunModes;
  }

  /**
   * Sets the <code>activeRunModes</code> property.
   */
 public void setActiveRunModes(ConfigNodePropertyArray activeRunModes) {
    this.activeRunModes = activeRunModes;
  }

  /**
   * Sets the <code>activeRunModes</code> property.
   */
  public ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties activeRunModes(ConfigNodePropertyArray activeRunModes) {
    this.activeRunModes = activeRunModes;
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
    ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties = (ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties) o;
    return Objects.equals(this.activeRunModes, comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.activeRunModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeRunModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties {\n");
    
    sb.append("    activeRunModes: ").append(toIndentedString(activeRunModes)).append("\n");
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

