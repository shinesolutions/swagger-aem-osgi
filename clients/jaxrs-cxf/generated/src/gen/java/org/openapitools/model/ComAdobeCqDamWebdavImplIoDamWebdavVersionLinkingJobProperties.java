package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties = (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties) o;
    return Objects.equals(this.cqDamWebdavVersionLinkingEnable, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.cqDamWebdavVersionLinkingEnable) &&
        Objects.equals(this.cqDamWebdavVersionLinkingSchedulerPeriod, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.cqDamWebdavVersionLinkingSchedulerPeriod) &&
        Objects.equals(this.cqDamWebdavVersionLinkingStagingTimeout, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.cqDamWebdavVersionLinkingStagingTimeout);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

