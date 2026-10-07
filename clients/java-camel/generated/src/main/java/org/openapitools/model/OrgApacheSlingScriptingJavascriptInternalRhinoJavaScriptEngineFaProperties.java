package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties
 */

@JsonTypeName("orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties {

  private ConfigNodePropertyInteger orgApacheSlingScriptingJavascriptRhinoOptLevel;

  public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties orgApacheSlingScriptingJavascriptRhinoOptLevel(ConfigNodePropertyInteger orgApacheSlingScriptingJavascriptRhinoOptLevel) {
    this.orgApacheSlingScriptingJavascriptRhinoOptLevel = orgApacheSlingScriptingJavascriptRhinoOptLevel;
    return this;
  }

  /**
   * Get orgApacheSlingScriptingJavascriptRhinoOptLevel
   * @return orgApacheSlingScriptingJavascriptRhinoOptLevel
   */
  @Valid 
  @Schema(name = "org.apache.sling.scripting.javascript.rhino.optLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.scripting.javascript.rhino.optLevel")
  public ConfigNodePropertyInteger getOrgApacheSlingScriptingJavascriptRhinoOptLevel() {
    return orgApacheSlingScriptingJavascriptRhinoOptLevel;
  }

  public void setOrgApacheSlingScriptingJavascriptRhinoOptLevel(ConfigNodePropertyInteger orgApacheSlingScriptingJavascriptRhinoOptLevel) {
    this.orgApacheSlingScriptingJavascriptRhinoOptLevel = orgApacheSlingScriptingJavascriptRhinoOptLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties = (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties) o;
    return Objects.equals(this.orgApacheSlingScriptingJavascriptRhinoOptLevel, orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.orgApacheSlingScriptingJavascriptRhinoOptLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingScriptingJavascriptRhinoOptLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties {\n");
    sb.append("    orgApacheSlingScriptingJavascriptRhinoOptLevel: ").append(toIndentedString(orgApacheSlingScriptingJavascriptRhinoOptLevel)).append("\n");
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

