package apimodels;

import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties   {
  @JsonProperty("jaas.ranking")
  private ConfigNodePropertyInteger jaasRanking = null;

  @JsonProperty("jaas.controlFlag")
  private ConfigNodePropertyString jaasControlFlag = null;

  @JsonProperty("jaas.realmName")
  private ConfigNodePropertyString jaasRealmName = null;

  @JsonProperty("idp.name")
  private ConfigNodePropertyString idpName = null;

  @JsonProperty("sync.handlerName")
  private ConfigNodePropertyString syncHandlerName = null;

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasRanking(ConfigNodePropertyInteger jaasRanking) {
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

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

   /**
   * Get jaasControlFlag
   * @return jaasControlFlag
  **/
  @Valid
  public ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }

  public void setJaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasRealmName(ConfigNodePropertyString jaasRealmName) {
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

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties idpName(ConfigNodePropertyString idpName) {
    this.idpName = idpName;
    return this;
  }

   /**
   * Get idpName
   * @return idpName
  **/
  @Valid
  public ConfigNodePropertyString getIdpName() {
    return idpName;
  }

  public void setIdpName(ConfigNodePropertyString idpName) {
    this.idpName = idpName;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties syncHandlerName(ConfigNodePropertyString syncHandlerName) {
    this.syncHandlerName = syncHandlerName;
    return this;
  }

   /**
   * Get syncHandlerName
   * @return syncHandlerName
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

