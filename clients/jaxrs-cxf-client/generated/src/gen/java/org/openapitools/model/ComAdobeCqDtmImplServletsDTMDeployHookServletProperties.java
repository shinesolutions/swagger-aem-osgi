package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray dtmStagingIpWhitelist = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray dtmProductionIpWhitelist = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

