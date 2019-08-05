package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout = null;
 /**
   * Get cqDamWebdavVersionLinkingEnable
   * @return cqDamWebdavVersionLinkingEnable
  **/
  @JsonProperty("cq.dam.webdav.version.linking.enable")
  public ConfigNodePropertyBoolean getCqDamWebdavVersionLinkingEnable() {
    return cqDamWebdavVersionLinkingEnable;
  }

  public void setCqDamWebdavVersionLinkingEnable(ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable) {
    this.cqDamWebdavVersionLinkingEnable = cqDamWebdavVersionLinkingEnable;
  }

  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties cqDamWebdavVersionLinkingEnable(ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable) {
    this.cqDamWebdavVersionLinkingEnable = cqDamWebdavVersionLinkingEnable;
    return this;
  }

 /**
   * Get cqDamWebdavVersionLinkingSchedulerPeriod
   * @return cqDamWebdavVersionLinkingSchedulerPeriod
  **/
  @JsonProperty("cq.dam.webdav.version.linking.scheduler.period")
  public ConfigNodePropertyInteger getCqDamWebdavVersionLinkingSchedulerPeriod() {
    return cqDamWebdavVersionLinkingSchedulerPeriod;
  }

  public void setCqDamWebdavVersionLinkingSchedulerPeriod(ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod) {
    this.cqDamWebdavVersionLinkingSchedulerPeriod = cqDamWebdavVersionLinkingSchedulerPeriod;
  }

  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties cqDamWebdavVersionLinkingSchedulerPeriod(ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod) {
    this.cqDamWebdavVersionLinkingSchedulerPeriod = cqDamWebdavVersionLinkingSchedulerPeriod;
    return this;
  }

 /**
   * Get cqDamWebdavVersionLinkingStagingTimeout
   * @return cqDamWebdavVersionLinkingStagingTimeout
  **/
  @JsonProperty("cq.dam.webdav.version.linking.staging.timeout")
  public ConfigNodePropertyInteger getCqDamWebdavVersionLinkingStagingTimeout() {
    return cqDamWebdavVersionLinkingStagingTimeout;
  }

  public void setCqDamWebdavVersionLinkingStagingTimeout(ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout) {
    this.cqDamWebdavVersionLinkingStagingTimeout = cqDamWebdavVersionLinkingStagingTimeout;
  }

  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties cqDamWebdavVersionLinkingStagingTimeout(ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout) {
    this.cqDamWebdavVersionLinkingStagingTimeout = cqDamWebdavVersionLinkingStagingTimeout;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties {\n");
    
    sb.append("    cqDamWebdavVersionLinkingEnable: ").append(toIndentedString(cqDamWebdavVersionLinkingEnable)).append("\n");
    sb.append("    cqDamWebdavVersionLinkingSchedulerPeriod: ").append(toIndentedString(cqDamWebdavVersionLinkingSchedulerPeriod)).append("\n");
    sb.append("    cqDamWebdavVersionLinkingStagingTimeout: ").append(toIndentedString(cqDamWebdavVersionLinkingStagingTimeout)).append("\n");
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

