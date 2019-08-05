package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties   {
  
  private ConfigNodePropertyArray dtmStagingIpWhitelist = null;

  private ConfigNodePropertyArray dtmProductionIpWhitelist = null;


  /**
   **/
  public ComAdobeCqDtmImplServletsDTMDeployHookServletProperties dtmStagingIpWhitelist(ConfigNodePropertyArray dtmStagingIpWhitelist) {
    this.dtmStagingIpWhitelist = dtmStagingIpWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dtm.staging.ip.whitelist")
  public ConfigNodePropertyArray getDtmStagingIpWhitelist() {
    return dtmStagingIpWhitelist;
  }
  public void setDtmStagingIpWhitelist(ConfigNodePropertyArray dtmStagingIpWhitelist) {
    this.dtmStagingIpWhitelist = dtmStagingIpWhitelist;
  }


  /**
   **/
  public ComAdobeCqDtmImplServletsDTMDeployHookServletProperties dtmProductionIpWhitelist(ConfigNodePropertyArray dtmProductionIpWhitelist) {
    this.dtmProductionIpWhitelist = dtmProductionIpWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dtm.production.ip.whitelist")
  public ConfigNodePropertyArray getDtmProductionIpWhitelist() {
    return dtmProductionIpWhitelist;
  }
  public void setDtmProductionIpWhitelist(ConfigNodePropertyArray dtmProductionIpWhitelist) {
    this.dtmProductionIpWhitelist = dtmProductionIpWhitelist;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDtmImplServletsDTMDeployHookServletProperties comAdobeCqDtmImplServletsDTMDeployHookServletProperties = (ComAdobeCqDtmImplServletsDTMDeployHookServletProperties) o;
    return Objects.equals(dtmStagingIpWhitelist, comAdobeCqDtmImplServletsDTMDeployHookServletProperties.dtmStagingIpWhitelist) &&
        Objects.equals(dtmProductionIpWhitelist, comAdobeCqDtmImplServletsDTMDeployHookServletProperties.dtmProductionIpWhitelist);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

