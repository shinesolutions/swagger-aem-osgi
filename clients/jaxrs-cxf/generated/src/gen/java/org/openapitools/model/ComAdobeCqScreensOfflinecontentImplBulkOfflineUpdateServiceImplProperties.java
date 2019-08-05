package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = null;
 /**
   * Get comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath
   * @return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath
  **/
  @JsonProperty("com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath")
  public ConfigNodePropertyArray getComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath() {
    return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
  }

  public void setComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
  }

  public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
    return this;
  }

 /**
   * Get comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
   * @return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
  **/
  @JsonProperty("com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency")
  public ConfigNodePropertyString getComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency() {
    return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
  }

  public void setComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
  }

  public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {\n");
    
    sb.append("    comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath: ").append(toIndentedString(comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath)).append("\n");
    sb.append("    comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency: ").append(toIndentedString(comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency)).append("\n");
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

