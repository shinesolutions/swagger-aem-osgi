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
 * OrgApacheSlingJcrRepoinitRepositoryInitializerProperties
 */

@JsonTypeName("orgApacheSlingJcrRepoinitRepositoryInitializerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray references;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray scripts;

  public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties references(@Nullable ConfigNodePropertyArray references) {
    this.references = references;
    return this;
  }

  /**
   * Get references
   * @return references
   */
  @Valid 
  @Schema(name = "references", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("references")
  public @Nullable ConfigNodePropertyArray getReferences() {
    return references;
  }

  @JsonProperty("references")
  public void setReferences(@Nullable ConfigNodePropertyArray references) {
    this.references = references;
  }

  public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties scripts(@Nullable ConfigNodePropertyArray scripts) {
    this.scripts = scripts;
    return this;
  }

  /**
   * Get scripts
   * @return scripts
   */
  @Valid 
  @Schema(name = "scripts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scripts")
  public @Nullable ConfigNodePropertyArray getScripts() {
    return scripts;
  }

  @JsonProperty("scripts")
  public void setScripts(@Nullable ConfigNodePropertyArray scripts) {
    this.scripts = scripts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrRepoinitRepositoryInitializerProperties orgApacheSlingJcrRepoinitRepositoryInitializerProperties = (OrgApacheSlingJcrRepoinitRepositoryInitializerProperties) o;
    return Objects.equals(this.references, orgApacheSlingJcrRepoinitRepositoryInitializerProperties.references) &&
        Objects.equals(this.scripts, orgApacheSlingJcrRepoinitRepositoryInitializerProperties.scripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(references, scripts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties {\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
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

