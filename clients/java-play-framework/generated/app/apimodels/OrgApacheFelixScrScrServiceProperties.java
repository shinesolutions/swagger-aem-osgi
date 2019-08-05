package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheFelixScrScrServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheFelixScrScrServiceProperties   {
  @JsonProperty("ds.loglevel")
  private ConfigNodePropertyDropDown dsLoglevel = null;

  @JsonProperty("ds.factory.enabled")
  private ConfigNodePropertyBoolean dsFactoryEnabled = null;

  @JsonProperty("ds.delayed.keepInstances")
  private ConfigNodePropertyBoolean dsDelayedKeepInstances = null;

  @JsonProperty("ds.lock.timeout.milliseconds")
  private ConfigNodePropertyInteger dsLockTimeoutMilliseconds = null;

  @JsonProperty("ds.stop.timeout.milliseconds")
  private ConfigNodePropertyInteger dsStopTimeoutMilliseconds = null;

  @JsonProperty("ds.global.extender")
  private ConfigNodePropertyBoolean dsGlobalExtender = null;

  public OrgApacheFelixScrScrServiceProperties dsLoglevel(ConfigNodePropertyDropDown dsLoglevel) {
    this.dsLoglevel = dsLoglevel;
    return this;
  }

   /**
   * Get dsLoglevel
   * @return dsLoglevel
  **/
  @Valid
  public ConfigNodePropertyDropDown getDsLoglevel() {
    return dsLoglevel;
  }

  public void setDsLoglevel(ConfigNodePropertyDropDown dsLoglevel) {
    this.dsLoglevel = dsLoglevel;
  }

  public OrgApacheFelixScrScrServiceProperties dsFactoryEnabled(ConfigNodePropertyBoolean dsFactoryEnabled) {
    this.dsFactoryEnabled = dsFactoryEnabled;
    return this;
  }

   /**
   * Get dsFactoryEnabled
   * @return dsFactoryEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getDsFactoryEnabled() {
    return dsFactoryEnabled;
  }

  public void setDsFactoryEnabled(ConfigNodePropertyBoolean dsFactoryEnabled) {
    this.dsFactoryEnabled = dsFactoryEnabled;
  }

  public OrgApacheFelixScrScrServiceProperties dsDelayedKeepInstances(ConfigNodePropertyBoolean dsDelayedKeepInstances) {
    this.dsDelayedKeepInstances = dsDelayedKeepInstances;
    return this;
  }

   /**
   * Get dsDelayedKeepInstances
   * @return dsDelayedKeepInstances
  **/
  @Valid
  public ConfigNodePropertyBoolean getDsDelayedKeepInstances() {
    return dsDelayedKeepInstances;
  }

  public void setDsDelayedKeepInstances(ConfigNodePropertyBoolean dsDelayedKeepInstances) {
    this.dsDelayedKeepInstances = dsDelayedKeepInstances;
  }

  public OrgApacheFelixScrScrServiceProperties dsLockTimeoutMilliseconds(ConfigNodePropertyInteger dsLockTimeoutMilliseconds) {
    this.dsLockTimeoutMilliseconds = dsLockTimeoutMilliseconds;
    return this;
  }

   /**
   * Get dsLockTimeoutMilliseconds
   * @return dsLockTimeoutMilliseconds
  **/
  @Valid
  public ConfigNodePropertyInteger getDsLockTimeoutMilliseconds() {
    return dsLockTimeoutMilliseconds;
  }

  public void setDsLockTimeoutMilliseconds(ConfigNodePropertyInteger dsLockTimeoutMilliseconds) {
    this.dsLockTimeoutMilliseconds = dsLockTimeoutMilliseconds;
  }

  public OrgApacheFelixScrScrServiceProperties dsStopTimeoutMilliseconds(ConfigNodePropertyInteger dsStopTimeoutMilliseconds) {
    this.dsStopTimeoutMilliseconds = dsStopTimeoutMilliseconds;
    return this;
  }

   /**
   * Get dsStopTimeoutMilliseconds
   * @return dsStopTimeoutMilliseconds
  **/
  @Valid
  public ConfigNodePropertyInteger getDsStopTimeoutMilliseconds() {
    return dsStopTimeoutMilliseconds;
  }

  public void setDsStopTimeoutMilliseconds(ConfigNodePropertyInteger dsStopTimeoutMilliseconds) {
    this.dsStopTimeoutMilliseconds = dsStopTimeoutMilliseconds;
  }

  public OrgApacheFelixScrScrServiceProperties dsGlobalExtender(ConfigNodePropertyBoolean dsGlobalExtender) {
    this.dsGlobalExtender = dsGlobalExtender;
    return this;
  }

   /**
   * Get dsGlobalExtender
   * @return dsGlobalExtender
  **/
  @Valid
  public ConfigNodePropertyBoolean getDsGlobalExtender() {
    return dsGlobalExtender;
  }

  public void setDsGlobalExtender(ConfigNodePropertyBoolean dsGlobalExtender) {
    this.dsGlobalExtender = dsGlobalExtender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

