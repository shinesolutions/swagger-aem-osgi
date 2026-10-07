package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean protectExternalId;

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties protectExternalId(@Nullable ConfigNodePropertyBoolean protectExternalId) {
    this.protectExternalId = protectExternalId;
    return this;
  }

  /**
   * Get protectExternalId
   * @return protectExternalId
   */
  @Valid 
  @Schema(name = "protectExternalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("protectExternalId")
  public @Nullable ConfigNodePropertyBoolean getProtectExternalId() {
    return protectExternalId;
  }

  @JsonProperty("protectExternalId")
  public void setProtectExternalId(@Nullable ConfigNodePropertyBoolean protectExternalId) {
    this.protectExternalId = protectExternalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties = (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties) o;
    return Objects.equals(this.protectExternalId, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.protectExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protectExternalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties {\n");
    sb.append("    protectExternalId: ").append(toIndentedString(protectExternalId)).append("\n");
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

