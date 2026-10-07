package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties
 */

@JsonTypeName("comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString group;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray ids;

  public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties group(@Nullable ConfigNodePropertyString group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  @Valid 
  @Schema(name = "group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group")
  public @Nullable ConfigNodePropertyString getGroup() {
    return group;
  }

  @JsonProperty("group")
  public void setGroup(@Nullable ConfigNodePropertyString group) {
    this.group = group;
  }

  public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties ids(@Nullable ConfigNodePropertyArray ids) {
    this.ids = ids;
    return this;
  }

  /**
   * Get ids
   * @return ids
   */
  @Valid 
  @Schema(name = "ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ids")
  public @Nullable ConfigNodePropertyArray getIds() {
    return ids;
  }

  @JsonProperty("ids")
  public void setIds(@Nullable ConfigNodePropertyArray ids) {
    this.ids = ids;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties = (ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties) o;
    return Objects.equals(this.group, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.group) &&
        Objects.equals(this.ids, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

