package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties   {
  
  private ConfigNodePropertyInteger jaasRanking = null;

  private ConfigNodePropertyString jaasControlFlag = null;

  private ConfigNodePropertyString jaasRealmName = null;

  private ConfigNodePropertyString idpName = null;

  private ConfigNodePropertyString syncHandlerName = null;


  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

  
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
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.controlFlag")
  public ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }
  public void setJaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
    return this;
  }

  
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
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties idpName(ConfigNodePropertyString idpName) {
    this.idpName = idpName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("idp.name")
  public ConfigNodePropertyString getIdpName() {
    return idpName;
  }
  public void setIdpName(ConfigNodePropertyString idpName) {
    this.idpName = idpName;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties syncHandlerName(ConfigNodePropertyString syncHandlerName) {
    this.syncHandlerName = syncHandlerName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sync.handlerName")
  public ConfigNodePropertyString getSyncHandlerName() {
    return syncHandlerName;
  }
  public void setSyncHandlerName(ConfigNodePropertyString syncHandlerName) {
    this.syncHandlerName = syncHandlerName;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties = (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties) o;
    return Objects.equals(jaasRanking, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.jaasRanking) &&
        Objects.equals(jaasControlFlag, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.jaasControlFlag) &&
        Objects.equals(jaasRealmName, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.jaasRealmName) &&
        Objects.equals(idpName, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.idpName) &&
        Objects.equals(syncHandlerName, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.syncHandlerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jaasRanking, jaasControlFlag, jaasRealmName, idpName, syncHandlerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties {\n");
    
    sb.append("    jaasRanking: ").append(toIndentedString(jaasRanking)).append("\n");
    sb.append("    jaasControlFlag: ").append(toIndentedString(jaasControlFlag)).append("\n");
    sb.append("    jaasRealmName: ").append(toIndentedString(jaasRealmName)).append("\n");
    sb.append("    idpName: ").append(toIndentedString(idpName)).append("\n");
    sb.append("    syncHandlerName: ").append(toIndentedString(syncHandlerName)).append("\n");
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

