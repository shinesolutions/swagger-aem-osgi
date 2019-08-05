package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties   {
  
  private ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable = null;

  private ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod = null;

  private ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout = null;


  /**
   **/
  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties cqDamWebdavVersionLinkingEnable(ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable) {
    this.cqDamWebdavVersionLinkingEnable = cqDamWebdavVersionLinkingEnable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.webdav.version.linking.enable")
  public ConfigNodePropertyBoolean getCqDamWebdavVersionLinkingEnable() {
    return cqDamWebdavVersionLinkingEnable;
  }
  public void setCqDamWebdavVersionLinkingEnable(ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable) {
    this.cqDamWebdavVersionLinkingEnable = cqDamWebdavVersionLinkingEnable;
  }


  /**
   **/
  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties cqDamWebdavVersionLinkingSchedulerPeriod(ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod) {
    this.cqDamWebdavVersionLinkingSchedulerPeriod = cqDamWebdavVersionLinkingSchedulerPeriod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.webdav.version.linking.scheduler.period")
  public ConfigNodePropertyInteger getCqDamWebdavVersionLinkingSchedulerPeriod() {
    return cqDamWebdavVersionLinkingSchedulerPeriod;
  }
  public void setCqDamWebdavVersionLinkingSchedulerPeriod(ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod) {
    this.cqDamWebdavVersionLinkingSchedulerPeriod = cqDamWebdavVersionLinkingSchedulerPeriod;
  }


  /**
   **/
  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties cqDamWebdavVersionLinkingStagingTimeout(ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout) {
    this.cqDamWebdavVersionLinkingStagingTimeout = cqDamWebdavVersionLinkingStagingTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.webdav.version.linking.staging.timeout")
  public ConfigNodePropertyInteger getCqDamWebdavVersionLinkingStagingTimeout() {
    return cqDamWebdavVersionLinkingStagingTimeout;
  }
  public void setCqDamWebdavVersionLinkingStagingTimeout(ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout) {
    this.cqDamWebdavVersionLinkingStagingTimeout = cqDamWebdavVersionLinkingStagingTimeout;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties = (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties) o;
    return Objects.equals(cqDamWebdavVersionLinkingEnable, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.cqDamWebdavVersionLinkingEnable) &&
        Objects.equals(cqDamWebdavVersionLinkingSchedulerPeriod, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.cqDamWebdavVersionLinkingSchedulerPeriod) &&
        Objects.equals(cqDamWebdavVersionLinkingStagingTimeout, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.cqDamWebdavVersionLinkingStagingTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamWebdavVersionLinkingEnable, cqDamWebdavVersionLinkingSchedulerPeriod, cqDamWebdavVersionLinkingStagingTimeout);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

