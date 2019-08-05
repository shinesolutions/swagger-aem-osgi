package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheFelixJaasConfigurationFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheFelixJaasConfigurationFactoryProperties   {
  @JsonProperty("jaas.controlFlag")
  private ConfigNodePropertyDropDown jaasControlFlag = null;

  @JsonProperty("jaas.ranking")
  private ConfigNodePropertyInteger jaasRanking = null;

  @JsonProperty("jaas.realmName")
  private ConfigNodePropertyString jaasRealmName = null;

  @JsonProperty("jaas.classname")
  private ConfigNodePropertyString jaasClassname = null;

  @JsonProperty("jaas.options")
  private ConfigNodePropertyArray jaasOptions = null;

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasControlFlag(ConfigNodePropertyDropDown jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

   /**
   * Get jaasControlFlag
   * @return jaasControlFlag
  **/
  @Valid
  public ConfigNodePropertyDropDown getJaasControlFlag() {
    return jaasControlFlag;
  }

  public void setJaasControlFlag(ConfigNodePropertyDropDown jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

   /**
   * Get jaasRanking
   * @return jaasRanking
  **/
  @Valid
  public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }

  public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
    return this;
  }

   /**
   * Get jaasRealmName
   * @return jaasRealmName
  **/
  @Valid
  public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }

  public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasClassname(ConfigNodePropertyString jaasClassname) {
    this.jaasClassname = jaasClassname;
    return this;
  }

   /**
   * Get jaasClassname
   * @return jaasClassname
  **/
  @Valid
  public ConfigNodePropertyString getJaasClassname() {
    return jaasClassname;
  }

  public void setJaasClassname(ConfigNodePropertyString jaasClassname) {
    this.jaasClassname = jaasClassname;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasOptions(ConfigNodePropertyArray jaasOptions) {
    this.jaasOptions = jaasOptions;
    return this;
  }

   /**
   * Get jaasOptions
   * @return jaasOptions
  **/
  @Valid
  public ConfigNodePropertyArray getJaasOptions() {
    return jaasOptions;
  }

  public void setJaasOptions(ConfigNodePropertyArray jaasOptions) {
    this.jaasOptions = jaasOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixJaasConfigurationFactoryProperties orgApacheFelixJaasConfigurationFactoryProperties = (OrgApacheFelixJaasConfigurationFactoryProperties) o;
    return Objects.equals(jaasControlFlag, orgApacheFelixJaasConfigurationFactoryProperties.jaasControlFlag) &&
        Objects.equals(jaasRanking, orgApacheFelixJaasConfigurationFactoryProperties.jaasRanking) &&
        Objects.equals(jaasRealmName, orgApacheFelixJaasConfigurationFactoryProperties.jaasRealmName) &&
        Objects.equals(jaasClassname, orgApacheFelixJaasConfigurationFactoryProperties.jaasClassname) &&
        Objects.equals(jaasOptions, orgApacheFelixJaasConfigurationFactoryProperties.jaasOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jaasControlFlag, jaasRanking, jaasRealmName, jaasClassname, jaasOptions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixJaasConfigurationFactoryProperties {\n");
    
    sb.append("    jaasControlFlag: ").append(toIndentedString(jaasControlFlag)).append("\n");
    sb.append("    jaasRanking: ").append(toIndentedString(jaasRanking)).append("\n");
    sb.append("    jaasRealmName: ").append(toIndentedString(jaasRealmName)).append("\n");
    sb.append("    jaasClassname: ").append(toIndentedString(jaasClassname)).append("\n");
    sb.append("    jaasOptions: ").append(toIndentedString(jaasOptions)).append("\n");
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

