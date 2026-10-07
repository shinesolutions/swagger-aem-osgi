package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties   {
  
  private ConfigNodePropertyString oauthConfigmanagerImsConfigid;
  private ConfigNodePropertyString imsOwningEntity;
  private ConfigNodePropertyString aemInstanceId;
  private ConfigNodePropertyString imsServiceCode;

  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties () {

  }

  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties (ConfigNodePropertyString oauthConfigmanagerImsConfigid, ConfigNodePropertyString imsOwningEntity, ConfigNodePropertyString aemInstanceId, ConfigNodePropertyString imsServiceCode) {
    this.oauthConfigmanagerImsConfigid = oauthConfigmanagerImsConfigid;
    this.imsOwningEntity = imsOwningEntity;
    this.aemInstanceId = aemInstanceId;
    this.imsServiceCode = imsServiceCode;
  }

    
  @JsonProperty("oauth.configmanager.ims.configid")
  public ConfigNodePropertyString getOauthConfigmanagerImsConfigid() {
    return oauthConfigmanagerImsConfigid;
  }
  public void setOauthConfigmanagerImsConfigid(ConfigNodePropertyString oauthConfigmanagerImsConfigid) {
    this.oauthConfigmanagerImsConfigid = oauthConfigmanagerImsConfigid;
  }

    
  @JsonProperty("ims.owningEntity")
  public ConfigNodePropertyString getImsOwningEntity() {
    return imsOwningEntity;
  }
  public void setImsOwningEntity(ConfigNodePropertyString imsOwningEntity) {
    this.imsOwningEntity = imsOwningEntity;
  }

    
  @JsonProperty("aem.instanceId")
  public ConfigNodePropertyString getAemInstanceId() {
    return aemInstanceId;
  }
  public void setAemInstanceId(ConfigNodePropertyString aemInstanceId) {
    this.aemInstanceId = aemInstanceId;
  }

    
  @JsonProperty("ims.serviceCode")
  public ConfigNodePropertyString getImsServiceCode() {
    return imsServiceCode;
  }
  public void setImsServiceCode(ConfigNodePropertyString imsServiceCode) {
    this.imsServiceCode = imsServiceCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties comAdobeGraniteAuthImsImplImsConfigProviderImplProperties = (ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties) o;
    return Objects.equals(oauthConfigmanagerImsConfigid, comAdobeGraniteAuthImsImplImsConfigProviderImplProperties.oauthConfigmanagerImsConfigid) &&
        Objects.equals(imsOwningEntity, comAdobeGraniteAuthImsImplImsConfigProviderImplProperties.imsOwningEntity) &&
        Objects.equals(aemInstanceId, comAdobeGraniteAuthImsImplImsConfigProviderImplProperties.aemInstanceId) &&
        Objects.equals(imsServiceCode, comAdobeGraniteAuthImsImplImsConfigProviderImplProperties.imsServiceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthConfigmanagerImsConfigid, imsOwningEntity, aemInstanceId, imsServiceCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties {\n");
    
    sb.append("    oauthConfigmanagerImsConfigid: ").append(toIndentedString(oauthConfigmanagerImsConfigid)).append("\n");
    sb.append("    imsOwningEntity: ").append(toIndentedString(imsOwningEntity)).append("\n");
    sb.append("    aemInstanceId: ").append(toIndentedString(aemInstanceId)).append("\n");
    sb.append("    imsServiceCode: ").append(toIndentedString(imsServiceCode)).append("\n");
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
