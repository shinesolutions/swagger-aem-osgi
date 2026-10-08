package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyDropDown;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrgApacheFelixJaasConfigurationFactoryProperties   {
  
  private ConfigNodePropertyDropDown jaasControlFlag;
  private ConfigNodePropertyInteger jaasRanking;
  private ConfigNodePropertyString jaasRealmName;
  private ConfigNodePropertyString jaasClassname;
  private ConfigNodePropertyArray jaasOptions;

  public OrgApacheFelixJaasConfigurationFactoryProperties () {

  }

  public OrgApacheFelixJaasConfigurationFactoryProperties (ConfigNodePropertyDropDown jaasControlFlag, ConfigNodePropertyInteger jaasRanking, ConfigNodePropertyString jaasRealmName, ConfigNodePropertyString jaasClassname, ConfigNodePropertyArray jaasOptions) {
    this.jaasControlFlag = jaasControlFlag;
    this.jaasRanking = jaasRanking;
    this.jaasRealmName = jaasRealmName;
    this.jaasClassname = jaasClassname;
    this.jaasOptions = jaasOptions;
  }

    
  @JsonProperty("jaas.controlFlag")
  public ConfigNodePropertyDropDown getJaasControlFlag() {
    return jaasControlFlag;
  }
  public void setJaasControlFlag(ConfigNodePropertyDropDown jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

    
  @JsonProperty("jaas.ranking")
  public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }
  public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

    
  @JsonProperty("jaas.realmName")
  public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }
  public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

    
  @JsonProperty("jaas.classname")
  public ConfigNodePropertyString getJaasClassname() {
    return jaasClassname;
  }
  public void setJaasClassname(ConfigNodePropertyString jaasClassname) {
    this.jaasClassname = jaasClassname;
  }

    
  @JsonProperty("jaas.options")
  public ConfigNodePropertyArray getJaasOptions() {
    return jaasOptions;
  }
  public void setJaasOptions(ConfigNodePropertyArray jaasOptions) {
    this.jaasOptions = jaasOptions;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
