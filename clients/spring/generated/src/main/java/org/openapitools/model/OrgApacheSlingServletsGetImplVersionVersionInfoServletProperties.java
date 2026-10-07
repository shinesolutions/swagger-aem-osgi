package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties
 */

@JsonTypeName("orgApacheSlingServletsGetImplVersionVersionInfoServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray slingServletSelectors;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean ecmaSuport;

  public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties slingServletSelectors(@Nullable ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

  /**
   * Get slingServletSelectors
   * @return slingServletSelectors
   */
  @Valid 
  @Schema(name = "sling.servlet.selectors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.selectors")
  public @Nullable ConfigNodePropertyArray getSlingServletSelectors() {
    return slingServletSelectors;
  }

  @JsonProperty("sling.servlet.selectors")
  public void setSlingServletSelectors(@Nullable ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties ecmaSuport(@Nullable ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
    return this;
  }

  /**
   * Get ecmaSuport
   * @return ecmaSuport
   */
  @Valid 
  @Schema(name = "ecmaSuport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ecmaSuport")
  public @Nullable ConfigNodePropertyBoolean getEcmaSuport() {
    return ecmaSuport;
  }

  @JsonProperty("ecmaSuport")
  public void setEcmaSuport(@Nullable ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties orgApacheSlingServletsGetImplVersionVersionInfoServletProperties = (OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties) o;
    return Objects.equals(this.slingServletSelectors, orgApacheSlingServletsGetImplVersionVersionInfoServletProperties.slingServletSelectors) &&
        Objects.equals(this.ecmaSuport, orgApacheSlingServletsGetImplVersionVersionInfoServletProperties.ecmaSuport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletSelectors, ecmaSuport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties {\n");
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    ecmaSuport: ").append(toIndentedString(ecmaSuport)).append("\n");
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

