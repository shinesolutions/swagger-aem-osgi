package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties
 */

@JsonTypeName("comAdobeGraniteAuthImsImplImsConfigProviderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthConfigmanagerImsConfigid;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString imsOwningEntity;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString aemInstanceId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString imsServiceCode;

  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties oauthConfigmanagerImsConfigid(@Nullable ConfigNodePropertyString oauthConfigmanagerImsConfigid) {
    this.oauthConfigmanagerImsConfigid = oauthConfigmanagerImsConfigid;
    return this;
  }

  /**
   * Get oauthConfigmanagerImsConfigid
   * @return oauthConfigmanagerImsConfigid
   */
  @Valid 
  @Schema(name = "oauth.configmanager.ims.configid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.configmanager.ims.configid")
  public @Nullable ConfigNodePropertyString getOauthConfigmanagerImsConfigid() {
    return oauthConfigmanagerImsConfigid;
  }

  @JsonProperty("oauth.configmanager.ims.configid")
  public void setOauthConfigmanagerImsConfigid(@Nullable ConfigNodePropertyString oauthConfigmanagerImsConfigid) {
    this.oauthConfigmanagerImsConfigid = oauthConfigmanagerImsConfigid;
  }

  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties imsOwningEntity(@Nullable ConfigNodePropertyString imsOwningEntity) {
    this.imsOwningEntity = imsOwningEntity;
    return this;
  }

  /**
   * Get imsOwningEntity
   * @return imsOwningEntity
   */
  @Valid 
  @Schema(name = "ims.owningEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ims.owningEntity")
  public @Nullable ConfigNodePropertyString getImsOwningEntity() {
    return imsOwningEntity;
  }

  @JsonProperty("ims.owningEntity")
  public void setImsOwningEntity(@Nullable ConfigNodePropertyString imsOwningEntity) {
    this.imsOwningEntity = imsOwningEntity;
  }

  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties aemInstanceId(@Nullable ConfigNodePropertyString aemInstanceId) {
    this.aemInstanceId = aemInstanceId;
    return this;
  }

  /**
   * Get aemInstanceId
   * @return aemInstanceId
   */
  @Valid 
  @Schema(name = "aem.instanceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem.instanceId")
  public @Nullable ConfigNodePropertyString getAemInstanceId() {
    return aemInstanceId;
  }

  @JsonProperty("aem.instanceId")
  public void setAemInstanceId(@Nullable ConfigNodePropertyString aemInstanceId) {
    this.aemInstanceId = aemInstanceId;
  }

  public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties imsServiceCode(@Nullable ConfigNodePropertyString imsServiceCode) {
    this.imsServiceCode = imsServiceCode;
    return this;
  }

  /**
   * Get imsServiceCode
   * @return imsServiceCode
   */
  @Valid 
  @Schema(name = "ims.serviceCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ims.serviceCode")
  public @Nullable ConfigNodePropertyString getImsServiceCode() {
    return imsServiceCode;
  }

  @JsonProperty("ims.serviceCode")
  public void setImsServiceCode(@Nullable ConfigNodePropertyString imsServiceCode) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

