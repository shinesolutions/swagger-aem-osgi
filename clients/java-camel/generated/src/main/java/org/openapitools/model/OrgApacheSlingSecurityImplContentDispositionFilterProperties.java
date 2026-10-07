package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingSecurityImplContentDispositionFilterProperties
 */

@JsonTypeName("orgApacheSlingSecurityImplContentDispositionFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingSecurityImplContentDispositionFilterProperties {

  private ConfigNodePropertyArray slingContentDispositionPaths;

  private ConfigNodePropertyArray slingContentDispositionExcludedPaths;

  private ConfigNodePropertyBoolean slingContentDispositionAllPaths;

  public OrgApacheSlingSecurityImplContentDispositionFilterProperties slingContentDispositionPaths(ConfigNodePropertyArray slingContentDispositionPaths) {
    this.slingContentDispositionPaths = slingContentDispositionPaths;
    return this;
  }

  /**
   * Get slingContentDispositionPaths
   * @return slingContentDispositionPaths
   */
  @Valid 
  @Schema(name = "sling.content.disposition.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.content.disposition.paths")
  public ConfigNodePropertyArray getSlingContentDispositionPaths() {
    return slingContentDispositionPaths;
  }

  public void setSlingContentDispositionPaths(ConfigNodePropertyArray slingContentDispositionPaths) {
    this.slingContentDispositionPaths = slingContentDispositionPaths;
  }

  public OrgApacheSlingSecurityImplContentDispositionFilterProperties slingContentDispositionExcludedPaths(ConfigNodePropertyArray slingContentDispositionExcludedPaths) {
    this.slingContentDispositionExcludedPaths = slingContentDispositionExcludedPaths;
    return this;
  }

  /**
   * Get slingContentDispositionExcludedPaths
   * @return slingContentDispositionExcludedPaths
   */
  @Valid 
  @Schema(name = "sling.content.disposition.excluded.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.content.disposition.excluded.paths")
  public ConfigNodePropertyArray getSlingContentDispositionExcludedPaths() {
    return slingContentDispositionExcludedPaths;
  }

  public void setSlingContentDispositionExcludedPaths(ConfigNodePropertyArray slingContentDispositionExcludedPaths) {
    this.slingContentDispositionExcludedPaths = slingContentDispositionExcludedPaths;
  }

  public OrgApacheSlingSecurityImplContentDispositionFilterProperties slingContentDispositionAllPaths(ConfigNodePropertyBoolean slingContentDispositionAllPaths) {
    this.slingContentDispositionAllPaths = slingContentDispositionAllPaths;
    return this;
  }

  /**
   * Get slingContentDispositionAllPaths
   * @return slingContentDispositionAllPaths
   */
  @Valid 
  @Schema(name = "sling.content.disposition.all.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.content.disposition.all.paths")
  public ConfigNodePropertyBoolean getSlingContentDispositionAllPaths() {
    return slingContentDispositionAllPaths;
  }

  public void setSlingContentDispositionAllPaths(ConfigNodePropertyBoolean slingContentDispositionAllPaths) {
    this.slingContentDispositionAllPaths = slingContentDispositionAllPaths;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingSecurityImplContentDispositionFilterProperties orgApacheSlingSecurityImplContentDispositionFilterProperties = (OrgApacheSlingSecurityImplContentDispositionFilterProperties) o;
    return Objects.equals(this.slingContentDispositionPaths, orgApacheSlingSecurityImplContentDispositionFilterProperties.slingContentDispositionPaths) &&
        Objects.equals(this.slingContentDispositionExcludedPaths, orgApacheSlingSecurityImplContentDispositionFilterProperties.slingContentDispositionExcludedPaths) &&
        Objects.equals(this.slingContentDispositionAllPaths, orgApacheSlingSecurityImplContentDispositionFilterProperties.slingContentDispositionAllPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingContentDispositionPaths, slingContentDispositionExcludedPaths, slingContentDispositionAllPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingSecurityImplContentDispositionFilterProperties {\n");
    sb.append("    slingContentDispositionPaths: ").append(toIndentedString(slingContentDispositionPaths)).append("\n");
    sb.append("    slingContentDispositionExcludedPaths: ").append(toIndentedString(slingContentDispositionExcludedPaths)).append("\n");
    sb.append("    slingContentDispositionAllPaths: ").append(toIndentedString(slingContentDispositionAllPaths)).append("\n");
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

