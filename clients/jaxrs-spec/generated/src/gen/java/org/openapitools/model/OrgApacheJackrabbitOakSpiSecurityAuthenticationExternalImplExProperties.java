package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties   {
  private ConfigNodePropertyInteger jaasRanking;
  private ConfigNodePropertyString jaasControlFlag;
  private ConfigNodePropertyString jaasRealmName;
  private ConfigNodePropertyString idpName;
  private ConfigNodePropertyString syncHandlerName;

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties() {
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.ranking")
  @Valid public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }

  @JsonProperty("jaas.ranking")
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
  @Valid public ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }

  @JsonProperty("jaas.controlFlag")
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
  @Valid public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }

  @JsonProperty("jaas.realmName")
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
  @Valid public ConfigNodePropertyString getIdpName() {
    return idpName;
  }

  @JsonProperty("idp.name")
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
  @Valid public ConfigNodePropertyString getSyncHandlerName() {
    return syncHandlerName;
  }

  @JsonProperty("sync.handlerName")
  public void setSyncHandlerName(ConfigNodePropertyString syncHandlerName) {
    this.syncHandlerName = syncHandlerName;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
