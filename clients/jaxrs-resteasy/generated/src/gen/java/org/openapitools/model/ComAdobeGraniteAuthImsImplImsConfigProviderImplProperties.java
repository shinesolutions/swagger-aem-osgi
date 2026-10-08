package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties   {
  
  private ConfigNodePropertyString oauthConfigmanagerImsConfigid;
  private ConfigNodePropertyString imsOwningEntity;
  private ConfigNodePropertyString aemInstanceId;
  private ConfigNodePropertyString imsServiceCode;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.configmanager.ims.configid")
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

