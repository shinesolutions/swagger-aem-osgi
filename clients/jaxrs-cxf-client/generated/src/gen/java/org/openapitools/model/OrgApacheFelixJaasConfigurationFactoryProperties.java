package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheFelixJaasConfigurationFactoryProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown jaasControlFlag = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger jaasRanking = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString jaasRealmName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString jaasClassname = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray jaasOptions = null;
 /**
   * Get jaasControlFlag
   * @return jaasControlFlag
  **/
  @JsonProperty("jaas.controlFlag")
  public ConfigNodePropertyDropDown getJaasControlFlag() {
    return jaasControlFlag;
  }

  public void setJaasControlFlag(ConfigNodePropertyDropDown jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasControlFlag(ConfigNodePropertyDropDown jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

 /**
   * Get jaasRanking
   * @return jaasRanking
  **/
  @JsonProperty("jaas.ranking")
  public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }

  public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

 /**
   * Get jaasRealmName
   * @return jaasRealmName
  **/
  @JsonProperty("jaas.realmName")
  public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }

  public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
    return this;
  }

 /**
   * Get jaasClassname
   * @return jaasClassname
  **/
  @JsonProperty("jaas.classname")
  public ConfigNodePropertyString getJaasClassname() {
    return jaasClassname;
  }

  public void setJaasClassname(ConfigNodePropertyString jaasClassname) {
    this.jaasClassname = jaasClassname;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasClassname(ConfigNodePropertyString jaasClassname) {
    this.jaasClassname = jaasClassname;
    return this;
  }

 /**
   * Get jaasOptions
   * @return jaasOptions
  **/
  @JsonProperty("jaas.options")
  public ConfigNodePropertyArray getJaasOptions() {
    return jaasOptions;
  }

  public void setJaasOptions(ConfigNodePropertyArray jaasOptions) {
    this.jaasOptions = jaasOptions;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasOptions(ConfigNodePropertyArray jaasOptions) {
    this.jaasOptions = jaasOptions;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

