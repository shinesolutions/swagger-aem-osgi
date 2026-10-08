package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyDropDown;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrgApacheFelixScrScrServiceProperties   {
  
  private ConfigNodePropertyDropDown dsLoglevel;
  private ConfigNodePropertyBoolean dsFactoryEnabled;
  private ConfigNodePropertyBoolean dsDelayedKeepInstances;
  private ConfigNodePropertyInteger dsLockTimeoutMilliseconds;
  private ConfigNodePropertyInteger dsStopTimeoutMilliseconds;
  private ConfigNodePropertyBoolean dsGlobalExtender;

  public OrgApacheFelixScrScrServiceProperties () {

  }

  public OrgApacheFelixScrScrServiceProperties (ConfigNodePropertyDropDown dsLoglevel, ConfigNodePropertyBoolean dsFactoryEnabled, ConfigNodePropertyBoolean dsDelayedKeepInstances, ConfigNodePropertyInteger dsLockTimeoutMilliseconds, ConfigNodePropertyInteger dsStopTimeoutMilliseconds, ConfigNodePropertyBoolean dsGlobalExtender) {
    this.dsLoglevel = dsLoglevel;
    this.dsFactoryEnabled = dsFactoryEnabled;
    this.dsDelayedKeepInstances = dsDelayedKeepInstances;
    this.dsLockTimeoutMilliseconds = dsLockTimeoutMilliseconds;
    this.dsStopTimeoutMilliseconds = dsStopTimeoutMilliseconds;
    this.dsGlobalExtender = dsGlobalExtender;
  }

    
  @JsonProperty("ds.loglevel")
  public ConfigNodePropertyDropDown getDsLoglevel() {
    return dsLoglevel;
  }
  public void setDsLoglevel(ConfigNodePropertyDropDown dsLoglevel) {
    this.dsLoglevel = dsLoglevel;
  }

    
  @JsonProperty("ds.factory.enabled")
  public ConfigNodePropertyBoolean getDsFactoryEnabled() {
    return dsFactoryEnabled;
  }
  public void setDsFactoryEnabled(ConfigNodePropertyBoolean dsFactoryEnabled) {
    this.dsFactoryEnabled = dsFactoryEnabled;
  }

    
  @JsonProperty("ds.delayed.keepInstances")
  public ConfigNodePropertyBoolean getDsDelayedKeepInstances() {
    return dsDelayedKeepInstances;
  }
  public void setDsDelayedKeepInstances(ConfigNodePropertyBoolean dsDelayedKeepInstances) {
    this.dsDelayedKeepInstances = dsDelayedKeepInstances;
  }

    
  @JsonProperty("ds.lock.timeout.milliseconds")
  public ConfigNodePropertyInteger getDsLockTimeoutMilliseconds() {
    return dsLockTimeoutMilliseconds;
  }
  public void setDsLockTimeoutMilliseconds(ConfigNodePropertyInteger dsLockTimeoutMilliseconds) {
    this.dsLockTimeoutMilliseconds = dsLockTimeoutMilliseconds;
  }

    
  @JsonProperty("ds.stop.timeout.milliseconds")
  public ConfigNodePropertyInteger getDsStopTimeoutMilliseconds() {
    return dsStopTimeoutMilliseconds;
  }
  public void setDsStopTimeoutMilliseconds(ConfigNodePropertyInteger dsStopTimeoutMilliseconds) {
    this.dsStopTimeoutMilliseconds = dsStopTimeoutMilliseconds;
  }

    
  @JsonProperty("ds.global.extender")
  public ConfigNodePropertyBoolean getDsGlobalExtender() {
    return dsGlobalExtender;
  }
  public void setDsGlobalExtender(ConfigNodePropertyBoolean dsGlobalExtender) {
    this.dsGlobalExtender = dsGlobalExtender;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixScrScrServiceProperties orgApacheFelixScrScrServiceProperties = (OrgApacheFelixScrScrServiceProperties) o;
    return Objects.equals(dsLoglevel, orgApacheFelixScrScrServiceProperties.dsLoglevel) &&
        Objects.equals(dsFactoryEnabled, orgApacheFelixScrScrServiceProperties.dsFactoryEnabled) &&
        Objects.equals(dsDelayedKeepInstances, orgApacheFelixScrScrServiceProperties.dsDelayedKeepInstances) &&
        Objects.equals(dsLockTimeoutMilliseconds, orgApacheFelixScrScrServiceProperties.dsLockTimeoutMilliseconds) &&
        Objects.equals(dsStopTimeoutMilliseconds, orgApacheFelixScrScrServiceProperties.dsStopTimeoutMilliseconds) &&
        Objects.equals(dsGlobalExtender, orgApacheFelixScrScrServiceProperties.dsGlobalExtender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dsLoglevel, dsFactoryEnabled, dsDelayedKeepInstances, dsLockTimeoutMilliseconds, dsStopTimeoutMilliseconds, dsGlobalExtender);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
