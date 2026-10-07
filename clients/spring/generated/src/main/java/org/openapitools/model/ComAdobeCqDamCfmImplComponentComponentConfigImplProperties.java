package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComAdobeCqDamCfmImplComponentComponentConfigImplProperties
 */

@JsonTypeName("comAdobeCqDamCfmImplComponentComponentConfigImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString damCfmComponentResourceType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString damCfmComponentFileReferenceProp;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString damCfmComponentElementsProp;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString damCfmComponentVariationProp;

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentResourceType(@Nullable ConfigNodePropertyString damCfmComponentResourceType) {
    this.damCfmComponentResourceType = damCfmComponentResourceType;
    return this;
  }

  /**
   * Get damCfmComponentResourceType
   * @return damCfmComponentResourceType
   */
  @Valid 
  @Schema(name = "dam.cfm.component.resourceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dam.cfm.component.resourceType")
  public @Nullable ConfigNodePropertyString getDamCfmComponentResourceType() {
    return damCfmComponentResourceType;
  }

  @JsonProperty("dam.cfm.component.resourceType")
  public void setDamCfmComponentResourceType(@Nullable ConfigNodePropertyString damCfmComponentResourceType) {
    this.damCfmComponentResourceType = damCfmComponentResourceType;
  }

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentFileReferenceProp(@Nullable ConfigNodePropertyString damCfmComponentFileReferenceProp) {
    this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
    return this;
  }

  /**
   * Get damCfmComponentFileReferenceProp
   * @return damCfmComponentFileReferenceProp
   */
  @Valid 
  @Schema(name = "dam.cfm.component.fileReferenceProp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dam.cfm.component.fileReferenceProp")
  public @Nullable ConfigNodePropertyString getDamCfmComponentFileReferenceProp() {
    return damCfmComponentFileReferenceProp;
  }

  @JsonProperty("dam.cfm.component.fileReferenceProp")
  public void setDamCfmComponentFileReferenceProp(@Nullable ConfigNodePropertyString damCfmComponentFileReferenceProp) {
    this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
  }

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentElementsProp(@Nullable ConfigNodePropertyString damCfmComponentElementsProp) {
    this.damCfmComponentElementsProp = damCfmComponentElementsProp;
    return this;
  }

  /**
   * Get damCfmComponentElementsProp
   * @return damCfmComponentElementsProp
   */
  @Valid 
  @Schema(name = "dam.cfm.component.elementsProp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dam.cfm.component.elementsProp")
  public @Nullable ConfigNodePropertyString getDamCfmComponentElementsProp() {
    return damCfmComponentElementsProp;
  }

  @JsonProperty("dam.cfm.component.elementsProp")
  public void setDamCfmComponentElementsProp(@Nullable ConfigNodePropertyString damCfmComponentElementsProp) {
    this.damCfmComponentElementsProp = damCfmComponentElementsProp;
  }

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentVariationProp(@Nullable ConfigNodePropertyString damCfmComponentVariationProp) {
    this.damCfmComponentVariationProp = damCfmComponentVariationProp;
    return this;
  }

  /**
   * Get damCfmComponentVariationProp
   * @return damCfmComponentVariationProp
   */
  @Valid 
  @Schema(name = "dam.cfm.component.variationProp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dam.cfm.component.variationProp")
  public @Nullable ConfigNodePropertyString getDamCfmComponentVariationProp() {
    return damCfmComponentVariationProp;
  }

  @JsonProperty("dam.cfm.component.variationProp")
  public void setDamCfmComponentVariationProp(@Nullable ConfigNodePropertyString damCfmComponentVariationProp) {
    this.damCfmComponentVariationProp = damCfmComponentVariationProp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamCfmImplComponentComponentConfigImplProperties comAdobeCqDamCfmImplComponentComponentConfigImplProperties = (ComAdobeCqDamCfmImplComponentComponentConfigImplProperties) o;
    return Objects.equals(this.damCfmComponentResourceType, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentResourceType) &&
        Objects.equals(this.damCfmComponentFileReferenceProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentFileReferenceProp) &&
        Objects.equals(this.damCfmComponentElementsProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentElementsProp) &&
        Objects.equals(this.damCfmComponentVariationProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentVariationProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(damCfmComponentResourceType, damCfmComponentFileReferenceProp, damCfmComponentElementsProp, damCfmComponentVariationProp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties {\n");
    sb.append("    damCfmComponentResourceType: ").append(toIndentedString(damCfmComponentResourceType)).append("\n");
    sb.append("    damCfmComponentFileReferenceProp: ").append(toIndentedString(damCfmComponentFileReferenceProp)).append("\n");
    sb.append("    damCfmComponentElementsProp: ").append(toIndentedString(damCfmComponentElementsProp)).append("\n");
    sb.append("    damCfmComponentVariationProp: ").append(toIndentedString(damCfmComponentVariationProp)).append("\n");
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

