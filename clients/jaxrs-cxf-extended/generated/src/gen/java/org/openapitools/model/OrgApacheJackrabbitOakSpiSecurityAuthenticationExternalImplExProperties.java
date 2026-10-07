package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger jaasRanking;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jaasControlFlag;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jaasRealmName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString idpName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString syncHandlerName;
 /**
  * Get jaasRanking
  * @return jaasRanking
  */
  @JsonProperty("jaas.ranking")
  public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }

  /**
   * Sets the <code>jaasRanking</code> property.
   */
 public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  /**
   * Sets the <code>jaasRanking</code> property.
   */
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

 /**
  * Get jaasControlFlag
  * @return jaasControlFlag
  */
  @JsonProperty("jaas.controlFlag")
  public ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }

  /**
   * Sets the <code>jaasControlFlag</code> property.
   */
 public void setJaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  /**
   * Sets the <code>jaasControlFlag</code> property.
   */
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

 /**
  * Get jaasRealmName
  * @return jaasRealmName
  */
  @JsonProperty("jaas.realmName")
  public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }

  /**
   * Sets the <code>jaasRealmName</code> property.
   */
 public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  /**
   * Sets the <code>jaasRealmName</code> property.
   */
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
    return this;
  }

 /**
  * Get idpName
  * @return idpName
  */
  @JsonProperty("idp.name")
  public ConfigNodePropertyString getIdpName() {
    return idpName;
  }

  /**
   * Sets the <code>idpName</code> property.
   */
 public void setIdpName(ConfigNodePropertyString idpName) {
    this.idpName = idpName;
  }

  /**
   * Sets the <code>idpName</code> property.
   */
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties idpName(ConfigNodePropertyString idpName) {
    this.idpName = idpName;
    return this;
  }

 /**
  * Get syncHandlerName
  * @return syncHandlerName
  */
  @JsonProperty("sync.handlerName")
  public ConfigNodePropertyString getSyncHandlerName() {
    return syncHandlerName;
  }

  /**
   * Sets the <code>syncHandlerName</code> property.
   */
 public void setSyncHandlerName(ConfigNodePropertyString syncHandlerName) {
    this.syncHandlerName = syncHandlerName;
  }

  /**
   * Sets the <code>syncHandlerName</code> property.
   */
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties syncHandlerName(ConfigNodePropertyString syncHandlerName) {
    this.syncHandlerName = syncHandlerName;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties = (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties) o;
    return Objects.equals(this.jaasRanking, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.jaasRanking) &&
        Objects.equals(this.jaasControlFlag, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.jaasControlFlag) &&
        Objects.equals(this.jaasRealmName, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.jaasRealmName) &&
        Objects.equals(this.idpName, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.idpName) &&
        Objects.equals(this.syncHandlerName, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.syncHandlerName);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

