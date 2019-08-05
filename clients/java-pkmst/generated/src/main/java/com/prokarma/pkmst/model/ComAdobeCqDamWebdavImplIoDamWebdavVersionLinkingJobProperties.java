package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties   {
  @JsonProperty("cq.dam.webdav.version.linking.enable")
  private ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable = null;

  @JsonProperty("cq.dam.webdav.version.linking.scheduler.period")
  private ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod = null;

  @JsonProperty("cq.dam.webdav.version.linking.staging.timeout")
  private ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout = null;

  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties cqDamWebdavVersionLinkingEnable(ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable) {
    this.cqDamWebdavVersionLinkingEnable = cqDamWebdavVersionLinkingEnable;
    return this;
  }

   /**
   * Get cqDamWebdavVersionLinkingEnable
   * @return cqDamWebdavVersionLinkingEnable
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqDamWebdavVersionLinkingEnable() {
    return cqDamWebdavVersionLinkingEnable;
  }

  public void setCqDamWebdavVersionLinkingEnable(ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable) {
    this.cqDamWebdavVersionLinkingEnable = cqDamWebdavVersionLinkingEnable;
  }

  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties cqDamWebdavVersionLinkingSchedulerPeriod(ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod) {
    this.cqDamWebdavVersionLinkingSchedulerPeriod = cqDamWebdavVersionLinkingSchedulerPeriod;
    return this;
  }

   /**
   * Get cqDamWebdavVersionLinkingSchedulerPeriod
   * @return cqDamWebdavVersionLinkingSchedulerPeriod
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCqDamWebdavVersionLinkingSchedulerPeriod() {
    return cqDamWebdavVersionLinkingSchedulerPeriod;
  }

  public void setCqDamWebdavVersionLinkingSchedulerPeriod(ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod) {
    this.cqDamWebdavVersionLinkingSchedulerPeriod = cqDamWebdavVersionLinkingSchedulerPeriod;
  }

  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties cqDamWebdavVersionLinkingStagingTimeout(ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout) {
    this.cqDamWebdavVersionLinkingStagingTimeout = cqDamWebdavVersionLinkingStagingTimeout;
    return this;
  }

   /**
   * Get cqDamWebdavVersionLinkingStagingTimeout
   * @return cqDamWebdavVersionLinkingStagingTimeout
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

