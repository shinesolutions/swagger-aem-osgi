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
 * ComAdobeCqSocialSyncImplUserSyncListenerImplProperties
 */

@JsonTypeName("comAdobeCqSocialSyncImplUserSyncListenerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray nodetypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray ignorableprops;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray ignorablenodes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray distfolders;

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties nodetypes(@Nullable ConfigNodePropertyArray nodetypes) {
    this.nodetypes = nodetypes;
    return this;
  }

  /**
   * Get nodetypes
   * @return nodetypes
   */
  @Valid 
  @Schema(name = "nodetypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nodetypes")
  public @Nullable ConfigNodePropertyArray getNodetypes() {
    return nodetypes;
  }

  @JsonProperty("nodetypes")
  public void setNodetypes(@Nullable ConfigNodePropertyArray nodetypes) {
    this.nodetypes = nodetypes;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties ignorableprops(@Nullable ConfigNodePropertyArray ignorableprops) {
    this.ignorableprops = ignorableprops;
    return this;
  }

  /**
   * Get ignorableprops
   * @return ignorableprops
   */
  @Valid 
  @Schema(name = "ignorableprops", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignorableprops")
  public @Nullable ConfigNodePropertyArray getIgnorableprops() {
    return ignorableprops;
  }

  @JsonProperty("ignorableprops")
  public void setIgnorableprops(@Nullable ConfigNodePropertyArray ignorableprops) {
    this.ignorableprops = ignorableprops;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties ignorablenodes(@Nullable ConfigNodePropertyArray ignorablenodes) {
    this.ignorablenodes = ignorablenodes;
    return this;
  }

  /**
   * Get ignorablenodes
   * @return ignorablenodes
   */
  @Valid 
  @Schema(name = "ignorablenodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignorablenodes")
  public @Nullable ConfigNodePropertyArray getIgnorablenodes() {
    return ignorablenodes;
  }

  @JsonProperty("ignorablenodes")
  public void setIgnorablenodes(@Nullable ConfigNodePropertyArray ignorablenodes) {
    this.ignorablenodes = ignorablenodes;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @Valid 
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties distfolders(@Nullable ConfigNodePropertyArray distfolders) {
    this.distfolders = distfolders;
    return this;
  }

  /**
   * Get distfolders
   * @return distfolders
   */
  @Valid 
  @Schema(name = "distfolders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distfolders")
  public @Nullable ConfigNodePropertyArray getDistfolders() {
    return distfolders;
  }

  @JsonProperty("distfolders")
  public void setDistfolders(@Nullable ConfigNodePropertyArray distfolders) {
    this.distfolders = distfolders;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialSyncImplUserSyncListenerImplProperties comAdobeCqSocialSyncImplUserSyncListenerImplProperties = (ComAdobeCqSocialSyncImplUserSyncListenerImplProperties) o;
    return Objects.equals(this.nodetypes, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.nodetypes) &&
        Objects.equals(this.ignorableprops, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.ignorableprops) &&
        Objects.equals(this.ignorablenodes, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.ignorablenodes) &&
        Objects.equals(this.enabled, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.enabled) &&
        Objects.equals(this.distfolders, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.distfolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodetypes, ignorableprops, ignorablenodes, enabled, distfolders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties {\n");
    sb.append("    nodetypes: ").append(toIndentedString(nodetypes)).append("\n");
    sb.append("    ignorableprops: ").append(toIndentedString(ignorableprops)).append("\n");
    sb.append("    ignorablenodes: ").append(toIndentedString(ignorablenodes)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    distfolders: ").append(toIndentedString(distfolders)).append("\n");
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

