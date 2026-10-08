package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqDamDmProcessImagePTiffManagerImplProperties
 */

@JsonTypeName("comAdobeCqDamDmProcessImagePTiffManagerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxMemory;

  public ComAdobeCqDamDmProcessImagePTiffManagerImplProperties maxMemory(@Nullable ConfigNodePropertyInteger maxMemory) {
    this.maxMemory = maxMemory;
    return this;
  }

  /**
   * Get maxMemory
   * @return maxMemory
   */
  @Valid 
  @Schema(name = "maxMemory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxMemory")
  public @Nullable ConfigNodePropertyInteger getMaxMemory() {
    return maxMemory;
  }

  @JsonProperty("maxMemory")
  public void setMaxMemory(@Nullable ConfigNodePropertyInteger maxMemory) {
    this.maxMemory = maxMemory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamDmProcessImagePTiffManagerImplProperties comAdobeCqDamDmProcessImagePTiffManagerImplProperties = (ComAdobeCqDamDmProcessImagePTiffManagerImplProperties) o;
    return Objects.equals(this.maxMemory, comAdobeCqDamDmProcessImagePTiffManagerImplProperties.maxMemory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxMemory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties {\n");
    sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
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

