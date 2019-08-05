package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
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

public class OrgApacheFelixScrScrServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown dsLoglevel = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean dsFactoryEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean dsDelayedKeepInstances = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger dsLockTimeoutMilliseconds = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger dsStopTimeoutMilliseconds = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean dsGlobalExtender = null;
 /**
   * Get dsLoglevel
   * @return dsLoglevel
  **/
  @JsonProperty("ds.loglevel")
  public ConfigNodePropertyDropDown getDsLoglevel() {
    return dsLoglevel;
  }

  public void setDsLoglevel(ConfigNodePropertyDropDown dsLoglevel) {
    this.dsLoglevel = dsLoglevel;
  }

  public OrgApacheFelixScrScrServiceProperties dsLoglevel(ConfigNodePropertyDropDown dsLoglevel) {
    this.dsLoglevel = dsLoglevel;
    return this;
  }

 /**
   * Get dsFactoryEnabled
   * @return dsFactoryEnabled
  **/
  @JsonProperty("ds.factory.enabled")
  public ConfigNodePropertyBoolean getDsFactoryEnabled() {
    return dsFactoryEnabled;
  }

  public void setDsFactoryEnabled(ConfigNodePropertyBoolean dsFactoryEnabled) {
    this.dsFactoryEnabled = dsFactoryEnabled;
  }

  public OrgApacheFelixScrScrServiceProperties dsFactoryEnabled(ConfigNodePropertyBoolean dsFactoryEnabled) {
    this.dsFactoryEnabled = dsFactoryEnabled;
    return this;
  }

 /**
   * Get dsDelayedKeepInstances
   * @return dsDelayedKeepInstances
  **/
  @JsonProperty("ds.delayed.keepInstances")
  public ConfigNodePropertyBoolean getDsDelayedKeepInstances() {
    return dsDelayedKeepInstances;
  }

  public void setDsDelayedKeepInstances(ConfigNodePropertyBoolean dsDelayedKeepInstances) {
    this.dsDelayedKeepInstances = dsDelayedKeepInstances;
  }

  public OrgApacheFelixScrScrServiceProperties dsDelayedKeepInstances(ConfigNodePropertyBoolean dsDelayedKeepInstances) {
    this.dsDelayedKeepInstances = dsDelayedKeepInstances;
    return this;
  }

 /**
   * Get dsLockTimeoutMilliseconds
   * @return dsLockTimeoutMilliseconds
  **/
  @JsonProperty("ds.lock.timeout.milliseconds")
  public ConfigNodePropertyInteger getDsLockTimeoutMilliseconds() {
    return dsLockTimeoutMilliseconds;
  }

  public void setDsLockTimeoutMilliseconds(ConfigNodePropertyInteger dsLockTimeoutMilliseconds) {
    this.dsLockTimeoutMilliseconds = dsLockTimeoutMilliseconds;
  }

  public OrgApacheFelixScrScrServiceProperties dsLockTimeoutMilliseconds(ConfigNodePropertyInteger dsLockTimeoutMilliseconds) {
    this.dsLockTimeoutMilliseconds = dsLockTimeoutMilliseconds;
    return this;
  }

 /**
   * Get dsStopTimeoutMilliseconds
   * @return dsStopTimeoutMilliseconds
  **/
  @JsonProperty("ds.stop.timeout.milliseconds")
  public ConfigNodePropertyInteger getDsStopTimeoutMilliseconds() {
    return dsStopTimeoutMilliseconds;
  }

  public void setDsStopTimeoutMilliseconds(ConfigNodePropertyInteger dsStopTimeoutMilliseconds) {
    this.dsStopTimeoutMilliseconds = dsStopTimeoutMilliseconds;
  }

  public OrgApacheFelixScrScrServiceProperties dsStopTimeoutMilliseconds(ConfigNodePropertyInteger dsStopTimeoutMilliseconds) {
    this.dsStopTimeoutMilliseconds = dsStopTimeoutMilliseconds;
    return this;
  }

 /**
   * Get dsGlobalExtender
   * @return dsGlobalExtender
  **/
  @JsonProperty("ds.global.extender")
  public ConfigNodePropertyBoolean getDsGlobalExtender() {
    return dsGlobalExtender;
  }

  public void setDsGlobalExtender(ConfigNodePropertyBoolean dsGlobalExtender) {
    this.dsGlobalExtender = dsGlobalExtender;
  }

  public OrgApacheFelixScrScrServiceProperties dsGlobalExtender(ConfigNodePropertyBoolean dsGlobalExtender) {
    this.dsGlobalExtender = dsGlobalExtender;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixScrScrServiceProperties {\n");
    
    sb.append("    dsLoglevel: ").append(toIndentedString(dsLoglevel)).append("\n");
    sb.append("    dsFactoryEnabled: ").append(toIndentedString(dsFactoryEnabled)).append("\n");
    sb.append("    dsDelayedKeepInstances: ").append(toIndentedString(dsDelayedKeepInstances)).append("\n");
    sb.append("    dsLockTimeoutMilliseconds: ").append(toIndentedString(dsLockTimeoutMilliseconds)).append("\n");
    sb.append("    dsStopTimeoutMilliseconds: ").append(toIndentedString(dsStopTimeoutMilliseconds)).append("\n");
    sb.append("    dsGlobalExtender: ").append(toIndentedString(dsGlobalExtender)).append("\n");
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

