package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties   {
  
  private ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = null;

  private ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = null;


  /**
   **/
  public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath")
  public ConfigNodePropertyArray getComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath() {
    return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
  }
  public void setComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
  }


  /**
   **/
  public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency")
  public ConfigNodePropertyString getComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency() {
    return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
  }
  public void setComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties = (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties) o;
    return Objects.equals(comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath, comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath) &&
        Objects.equals(comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency, comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath, comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

