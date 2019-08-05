package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties   {
  
  private ConfigNodePropertyString oauthConfigmanagerImsConfigid = null;
  private ConfigNodePropertyString imsOwningEntity = null;
  private ConfigNodePropertyString aemInstanceId = null;
  private ConfigNodePropertyString imsServiceCode = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.configmanager.ims.configid")
  public ConfigNodePropertyString getOauthConfigmanagerImsConfigid() {
    return oauthConfigmanagerImsConfigid;
  }
  public void setOauthConfigmanagerImsConfigid(ConfigNodePropertyString oauthConfigmanagerImsConfigid) {
    this.oauthConfigmanagerImsConfigid = oauthConfigmanagerImsConfigid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ims.owningEntity")
  public ConfigNodePropertyString getImsOwningEntity() {
    return imsOwningEntity;
  }
  public void setImsOwningEntity(ConfigNodePropertyString imsOwningEntity) {
    this.imsOwningEntity = imsOwningEntity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aem.instanceId")
  public ConfigNodePropertyString getAemInstanceId() {
    return aemInstanceId;
  }
  public void setAemInstanceId(ConfigNodePropertyString aemInstanceId) {
    this.aemInstanceId = aemInstanceId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ims.serviceCode")
  public ConfigNodePropertyString getImsServiceCode() {
    return imsServiceCode;
  }
  public void setImsServiceCode(ConfigNodePropertyString imsServiceCode) {
    this.imsServiceCode = imsServiceCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

