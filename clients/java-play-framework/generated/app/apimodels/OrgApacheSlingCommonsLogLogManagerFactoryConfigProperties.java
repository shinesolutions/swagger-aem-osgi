package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties   {
  @JsonProperty("org.apache.sling.commons.log.level")
  @Valid

  private ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel;

  @JsonProperty("org.apache.sling.commons.log.file")
  @Valid

  private ConfigNodePropertyString orgApacheSlingCommonsLogFile;

  @JsonProperty("org.apache.sling.commons.log.pattern")
  @Valid

  private ConfigNodePropertyString orgApacheSlingCommonsLogPattern;

  @JsonProperty("org.apache.sling.commons.log.names")
  @Valid

  private ConfigNodePropertyArray orgApacheSlingCommonsLogNames;

  @JsonProperty("org.apache.sling.commons.log.additiv")
  @Valid

  private ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv;

  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogLevel
   * @return orgApacheSlingCommonsLogLevel
  **/
  public ConfigNodePropertyDropDown getOrgApacheSlingCommonsLogLevel() {
    return orgApacheSlingCommonsLogLevel;
  }

  public void setOrgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogFile
   * @return orgApacheSlingCommonsLogFile
  **/
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
    return orgApacheSlingCommonsLogFile;
  }

  public void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogPattern
   * @return orgApacheSlingCommonsLogPattern
  **/
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogPattern() {
    return orgApacheSlingCommonsLogPattern;
  }

  public void setOrgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogNames(ConfigNodePropertyArray orgApacheSlingCommonsLogNames) {
    this.orgApacheSlingCommonsLogNames = orgApacheSlingCommonsLogNames;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogNames
   * @return orgApacheSlingCommonsLogNames
  **/
  public ConfigNodePropertyArray getOrgApacheSlingCommonsLogNames() {
    return orgApacheSlingCommonsLogNames;
  }

  public void setOrgApacheSlingCommonsLogNames(ConfigNodePropertyArray orgApacheSlingCommonsLogNames) {
    this.orgApacheSlingCommonsLogNames = orgApacheSlingCommonsLogNames;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogAdditiv(ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv) {
    this.orgApacheSlingCommonsLogAdditiv = orgApacheSlingCommonsLogAdditiv;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogAdditiv
   * @return orgApacheSlingCommonsLogAdditiv
  **/
  public ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogAdditiv() {
    return orgApacheSlingCommonsLogAdditiv;
  }

  public void setOrgApacheSlingCommonsLogAdditiv(ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv) {
    this.orgApacheSlingCommonsLogAdditiv = orgApacheSlingCommonsLogAdditiv;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogLogManagerFactoryConfigProperties = (OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties) o;
    return Objects.equals(orgApacheSlingCommonsLogLevel, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogLevel) &&
        Objects.equals(orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogFile) &&
        Objects.equals(orgApacheSlingCommonsLogPattern, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogPattern) &&
        Objects.equals(orgApacheSlingCommonsLogNames, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogNames) &&
        Objects.equals(orgApacheSlingCommonsLogAdditiv, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogAdditiv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingCommonsLogLevel, orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogPattern, orgApacheSlingCommonsLogNames, orgApacheSlingCommonsLogAdditiv);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties {\n");
    
    sb.append("    orgApacheSlingCommonsLogLevel: ").append(toIndentedString(orgApacheSlingCommonsLogLevel)).append("\n");
    sb.append("    orgApacheSlingCommonsLogFile: ").append(toIndentedString(orgApacheSlingCommonsLogFile)).append("\n");
    sb.append("    orgApacheSlingCommonsLogPattern: ").append(toIndentedString(orgApacheSlingCommonsLogPattern)).append("\n");
    sb.append("    orgApacheSlingCommonsLogNames: ").append(toIndentedString(orgApacheSlingCommonsLogNames)).append("\n");
    sb.append("    orgApacheSlingCommonsLogAdditiv: ").append(toIndentedString(orgApacheSlingCommonsLogAdditiv)).append("\n");
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

