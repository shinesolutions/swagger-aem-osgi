package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray dtmStagingIpWhitelist;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray dtmProductionIpWhitelist;
 /**
   * Get dtmStagingIpWhitelist
   * @return dtmStagingIpWhitelist
  **/
  @JsonProperty("dtm.staging.ip.whitelist")
  public ConfigNodePropertyArray getDtmStagingIpWhitelist() {
    return dtmStagingIpWhitelist;
  }

  public void setDtmStagingIpWhitelist(ConfigNodePropertyArray dtmStagingIpWhitelist) {
    this.dtmStagingIpWhitelist = dtmStagingIpWhitelist;
  }

  public ComAdobeCqDtmImplServletsDTMDeployHookServletProperties dtmStagingIpWhitelist(ConfigNodePropertyArray dtmStagingIpWhitelist) {
    this.dtmStagingIpWhitelist = dtmStagingIpWhitelist;
    return this;
  }

 /**
   * Get dtmProductionIpWhitelist
   * @return dtmProductionIpWhitelist
  **/
  @JsonProperty("dtm.production.ip.whitelist")
  public ConfigNodePropertyArray getDtmProductionIpWhitelist() {
    return dtmProductionIpWhitelist;
  }

  public void setDtmProductionIpWhitelist(ConfigNodePropertyArray dtmProductionIpWhitelist) {
    this.dtmProductionIpWhitelist = dtmProductionIpWhitelist;
  }

  public ComAdobeCqDtmImplServletsDTMDeployHookServletProperties dtmProductionIpWhitelist(ConfigNodePropertyArray dtmProductionIpWhitelist) {
    this.dtmProductionIpWhitelist = dtmProductionIpWhitelist;
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
    ComAdobeCqDtmImplServletsDTMDeployHookServletProperties comAdobeCqDtmImplServletsDTMDeployHookServletProperties = (ComAdobeCqDtmImplServletsDTMDeployHookServletProperties) o;
    return Objects.equals(this.dtmStagingIpWhitelist, comAdobeCqDtmImplServletsDTMDeployHookServletProperties.dtmStagingIpWhitelist) &&
        Objects.equals(this.dtmProductionIpWhitelist, comAdobeCqDtmImplServletsDTMDeployHookServletProperties.dtmProductionIpWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtmStagingIpWhitelist, dtmProductionIpWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties {\n");
    
    sb.append("    dtmStagingIpWhitelist: ").append(toIndentedString(dtmStagingIpWhitelist)).append("\n");
    sb.append("    dtmProductionIpWhitelist: ").append(toIndentedString(dtmProductionIpWhitelist)).append("\n");
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

