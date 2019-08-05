package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheFelixJaasConfigurationFactoryProperties   {
  
  private ConfigNodePropertyDropDown jaasControlFlag = null;
  private ConfigNodePropertyInteger jaasRanking = null;
  private ConfigNodePropertyString jaasRealmName = null;
  private ConfigNodePropertyString jaasClassname = null;
  private ConfigNodePropertyArray jaasOptions = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.controlFlag")
  public ConfigNodePropertyDropDown getJaasControlFlag() {
    return jaasControlFlag;
  }
  public void setJaasControlFlag(ConfigNodePropertyDropDown jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.ranking")
  public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }
  public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.realmName")
  public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }
  public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.classname")
  public ConfigNodePropertyString getJaasClassname() {
    return jaasClassname;
  }
  public void setJaasClassname(ConfigNodePropertyString jaasClassname) {
    this.jaasClassname = jaasClassname;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.options")
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

