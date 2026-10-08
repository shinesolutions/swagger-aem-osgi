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
 * ComAdobeCqDamCfmImplConfFeatureConfigImplProperties
 */

@JsonTypeName("comAdobeCqDamCfmImplConfFeatureConfigImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray damCfmResourceTypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray damCfmReferenceProperties;

  public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties damCfmResourceTypes(@Nullable ConfigNodePropertyArray damCfmResourceTypes) {
    this.damCfmResourceTypes = damCfmResourceTypes;
    return this;
  }

  /**
   * Get damCfmResourceTypes
   * @return damCfmResourceTypes
   */
  @Valid 
  @Schema(name = "dam.cfm.resourceTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dam.cfm.resourceTypes")
  public @Nullable ConfigNodePropertyArray getDamCfmResourceTypes() {
    return damCfmResourceTypes;
  }

  @JsonProperty("dam.cfm.resourceTypes")
  public void setDamCfmResourceTypes(@Nullable ConfigNodePropertyArray damCfmResourceTypes) {
    this.damCfmResourceTypes = damCfmResourceTypes;
  }

  public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties damCfmReferenceProperties(@Nullable ConfigNodePropertyArray damCfmReferenceProperties) {
    this.damCfmReferenceProperties = damCfmReferenceProperties;
    return this;
  }

  /**
   * Get damCfmReferenceProperties
   * @return damCfmReferenceProperties
   */
  @Valid 
  @Schema(name = "dam.cfm.referenceProperties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dam.cfm.referenceProperties")
  public @Nullable ConfigNodePropertyArray getDamCfmReferenceProperties() {
    return damCfmReferenceProperties;
  }

  @JsonProperty("dam.cfm.referenceProperties")
  public void setDamCfmReferenceProperties(@Nullable ConfigNodePropertyArray damCfmReferenceProperties) {
    this.damCfmReferenceProperties = damCfmReferenceProperties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamCfmImplConfFeatureConfigImplProperties comAdobeCqDamCfmImplConfFeatureConfigImplProperties = (ComAdobeCqDamCfmImplConfFeatureConfigImplProperties) o;
    return Objects.equals(this.damCfmResourceTypes, comAdobeCqDamCfmImplConfFeatureConfigImplProperties.damCfmResourceTypes) &&
        Objects.equals(this.damCfmReferenceProperties, comAdobeCqDamCfmImplConfFeatureConfigImplProperties.damCfmReferenceProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(damCfmResourceTypes, damCfmReferenceProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties {\n");
    sb.append("    damCfmResourceTypes: ").append(toIndentedString(damCfmResourceTypes)).append("\n");
    sb.append("    damCfmReferenceProperties: ").append(toIndentedString(damCfmReferenceProperties)).append("\n");
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

