package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger jaasRanking;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jaasControlFlag;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jaasRealmName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString idpName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString syncHandlerName;

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasRanking(@Nullable ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

  /**
   * Get jaasRanking
   * @return jaasRanking
   */
  @Valid 
  @Schema(name = "jaas.ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.ranking")
  public @Nullable ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }

  @JsonProperty("jaas.ranking")
  public void setJaasRanking(@Nullable ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasControlFlag(@Nullable ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

  /**
   * Get jaasControlFlag
   * @return jaasControlFlag
   */
  @Valid 
  @Schema(name = "jaas.controlFlag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.controlFlag")
  public @Nullable ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }

  @JsonProperty("jaas.controlFlag")
  public void setJaasControlFlag(@Nullable ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties jaasRealmName(@Nullable ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
    return this;
  }

  /**
   * Get jaasRealmName
   * @return jaasRealmName
   */
  @Valid 
  @Schema(name = "jaas.realmName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.realmName")
  public @Nullable ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }

  @JsonProperty("jaas.realmName")
  public void setJaasRealmName(@Nullable ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties idpName(@Nullable ConfigNodePropertyString idpName) {
    this.idpName = idpName;
    return this;
  }

  /**
   * Get idpName
   * @return idpName
   */
  @Valid 
  @Schema(name = "idp.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idp.name")
  public @Nullable ConfigNodePropertyString getIdpName() {
    return idpName;
  }

  @JsonProperty("idp.name")
  public void setIdpName(@Nullable ConfigNodePropertyString idpName) {
    this.idpName = idpName;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties syncHandlerName(@Nullable ConfigNodePropertyString syncHandlerName) {
    this.syncHandlerName = syncHandlerName;
    return this;
  }

  /**
   * Get syncHandlerName
   * @return syncHandlerName
   */
  @Valid 
  @Schema(name = "sync.handlerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sync.handlerName")
  public @Nullable ConfigNodePropertyString getSyncHandlerName() {
    return syncHandlerName;
  }

  @JsonProperty("sync.handlerName")
  public void setSyncHandlerName(@Nullable ConfigNodePropertyString syncHandlerName) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

