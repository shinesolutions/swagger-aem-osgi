package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties   {
  
  private ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable;
  private ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod;
  private ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.webdav.version.linking.staging.timeout")
  public ConfigNodePropertyInteger getCqDamWebdavVersionLinkingStagingTimeout() {
    return cqDamWebdavVersionLinkingStagingTimeout;
  }
  public void setCqDamWebdavVersionLinkingStagingTimeout(ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout) {
    this.cqDamWebdavVersionLinkingStagingTimeout = cqDamWebdavVersionLinkingStagingTimeout;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

