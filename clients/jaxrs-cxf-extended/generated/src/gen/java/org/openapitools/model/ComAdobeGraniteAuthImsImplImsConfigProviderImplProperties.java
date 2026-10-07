package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthConfigmanagerImsConfigid;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString imsOwningEntity;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString aemInstanceId;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString imsServiceCode;
 /**
  * Get oauthConfigmanagerImsConfigid
  * @return oauthConfigmanagerImsConfigid
  */
  @JsonProperty("oauth.configmanager.ims.configid")
  public ConfigNodePropertyString getOauthConfigmanagerImsConfigid() {
    return oauthConfigmanagerImsConfigid;
  }

  /**
   * Sets the <code>oauthConfigmanagerImsConfigid</code> property.
   */
 public void setOauthConfigmanagerImsConfigid(ConfigNodePropertyString oauthConfigmanagerImsConfigid) {
    this.oauthConfigmanagerImsConfigid = oauthConfigmanagerImsConfigid;
  }

  /**
   * Sets the <code>oauthConfigmanagerImsConfigid</code> property.
   */
  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties oauthConfigmanagerImsConfigid(ConfigNodePropertyString oauthConfigmanagerImsConfigid) {
    this.oauthConfigmanagerImsConfigid = oauthConfigmanagerImsConfigid;
    return this;
  }

 /**
  * Get imsOwningEntity
  * @return imsOwningEntity
  */
  @JsonProperty("ims.owningEntity")
  public ConfigNodePropertyString getImsOwningEntity() {
    return imsOwningEntity;
  }

  /**
   * Sets the <code>imsOwningEntity</code> property.
   */
 public void setImsOwningEntity(ConfigNodePropertyString imsOwningEntity) {
    this.imsOwningEntity = imsOwningEntity;
  }

  /**
   * Sets the <code>imsOwningEntity</code> property.
   */
  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties imsOwningEntity(ConfigNodePropertyString imsOwningEntity) {
    this.imsOwningEntity = imsOwningEntity;
    return this;
  }

 /**
  * Get aemInstanceId
  * @return aemInstanceId
  */
  @JsonProperty("aem.instanceId")
  public ConfigNodePropertyString getAemInstanceId() {
    return aemInstanceId;
  }

  /**
   * Sets the <code>aemInstanceId</code> property.
   */
 public void setAemInstanceId(ConfigNodePropertyString aemInstanceId) {
    this.aemInstanceId = aemInstanceId;
  }

  /**
   * Sets the <code>aemInstanceId</code> property.
   */
  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties aemInstanceId(ConfigNodePropertyString aemInstanceId) {
    this.aemInstanceId = aemInstanceId;
    return this;
  }

 /**
  * Get imsServiceCode
  * @return imsServiceCode
  */
  @JsonProperty("ims.serviceCode")
  public ConfigNodePropertyString getImsServiceCode() {
    return imsServiceCode;
  }

  /**
   * Sets the <code>imsServiceCode</code> property.
   */
 public void setImsServiceCode(ConfigNodePropertyString imsServiceCode) {
    this.imsServiceCode = imsServiceCode;
  }

  /**
   * Sets the <code>imsServiceCode</code> property.
   */
  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties imsServiceCode(ConfigNodePropertyString imsServiceCode) {
    this.imsServiceCode = imsServiceCode;
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
    ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties comAdobeGraniteAuthImsImplImsConfigProviderImplProperties = (ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties) o;
    return Objects.equals(this.oauthConfigmanagerImsConfigid, comAdobeGraniteAuthImsImplImsConfigProviderImplProperties.oauthConfigmanagerImsConfigid) &&
        Objects.equals(this.imsOwningEntity, comAdobeGraniteAuthImsImplImsConfigProviderImplProperties.imsOwningEntity) &&
        Objects.equals(this.aemInstanceId, comAdobeGraniteAuthImsImplImsConfigProviderImplProperties.aemInstanceId) &&
        Objects.equals(this.imsServiceCode, comAdobeGraniteAuthImsImplImsConfigProviderImplProperties.imsServiceCode);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

