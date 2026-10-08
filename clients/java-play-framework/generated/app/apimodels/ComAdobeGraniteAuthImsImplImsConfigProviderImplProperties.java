package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties   {
  @JsonProperty("oauth.configmanager.ims.configid")
  @Valid

  private ConfigNodePropertyString oauthConfigmanagerImsConfigid;

  @JsonProperty("ims.owningEntity")
  @Valid

  private ConfigNodePropertyString imsOwningEntity;

  @JsonProperty("aem.instanceId")
  @Valid

  private ConfigNodePropertyString aemInstanceId;

  @JsonProperty("ims.serviceCode")
  @Valid

  private ConfigNodePropertyString imsServiceCode;

  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties oauthConfigmanagerImsConfigid(ConfigNodePropertyString oauthConfigmanagerImsConfigid) {
    this.oauthConfigmanagerImsConfigid = oauthConfigmanagerImsConfigid;
    return this;
  }

   /**
   * Get oauthConfigmanagerImsConfigid
   * @return oauthConfigmanagerImsConfigid
  **/
  public ConfigNodePropertyString getOauthConfigmanagerImsConfigid() {
    return oauthConfigmanagerImsConfigid;
  }

  public void setOauthConfigmanagerImsConfigid(ConfigNodePropertyString oauthConfigmanagerImsConfigid) {
    this.oauthConfigmanagerImsConfigid = oauthConfigmanagerImsConfigid;
  }

  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties imsOwningEntity(ConfigNodePropertyString imsOwningEntity) {
    this.imsOwningEntity = imsOwningEntity;
    return this;
  }

   /**
   * Get imsOwningEntity
   * @return imsOwningEntity
  **/
  public ConfigNodePropertyString getImsOwningEntity() {
    return imsOwningEntity;
  }

  public void setImsOwningEntity(ConfigNodePropertyString imsOwningEntity) {
    this.imsOwningEntity = imsOwningEntity;
  }

  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties aemInstanceId(ConfigNodePropertyString aemInstanceId) {
    this.aemInstanceId = aemInstanceId;
    return this;
  }

   /**
   * Get aemInstanceId
   * @return aemInstanceId
  **/
  public ConfigNodePropertyString getAemInstanceId() {
    return aemInstanceId;
  }

  public void setAemInstanceId(ConfigNodePropertyString aemInstanceId) {
    this.aemInstanceId = aemInstanceId;
  }

  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties imsServiceCode(ConfigNodePropertyString imsServiceCode) {
    this.imsServiceCode = imsServiceCode;
    return this;
  }

   /**
   * Get imsServiceCode
   * @return imsServiceCode
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

