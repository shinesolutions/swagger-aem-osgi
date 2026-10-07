package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties
 */

@JsonTypeName("orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings;

  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties orgApacheSlingScriptingSightlyJsBindings(@Nullable ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings) {
    this.orgApacheSlingScriptingSightlyJsBindings = orgApacheSlingScriptingSightlyJsBindings;
    return this;
  }

  /**
   * Get orgApacheSlingScriptingSightlyJsBindings
   * @return orgApacheSlingScriptingSightlyJsBindings
   */
  @Valid 
  @Schema(name = "org.apache.sling.scripting.sightly.js.bindings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.scripting.sightly.js.bindings")
  public @Nullable ConfigNodePropertyArray getOrgApacheSlingScriptingSightlyJsBindings() {
    return orgApacheSlingScriptingSightlyJsBindings;
  }

  @JsonProperty("org.apache.sling.scripting.sightly.js.bindings")
  public void setOrgApacheSlingScriptingSightlyJsBindings(@Nullable ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings) {
    this.orgApacheSlingScriptingSightlyJsBindings = orgApacheSlingScriptingSightlyJsBindings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties = (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties) o;
    return Objects.equals(this.orgApacheSlingScriptingSightlyJsBindings, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.orgApacheSlingScriptingSightlyJsBindings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingScriptingSightlyJsBindings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties {\n");
    sb.append("    orgApacheSlingScriptingSightlyJsBindings: ").append(toIndentedString(orgApacheSlingScriptingSightlyJsBindings)).append("\n");
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

