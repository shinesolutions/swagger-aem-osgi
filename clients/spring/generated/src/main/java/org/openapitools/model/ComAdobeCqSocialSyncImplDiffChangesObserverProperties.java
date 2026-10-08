package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeCqSocialSyncImplDiffChangesObserverProperties
 */

@JsonTypeName("comAdobeCqSocialSyncImplDiffChangesObserverProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialSyncImplDiffChangesObserverProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString agentName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString diffPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString propertyNames;

  public ComAdobeCqSocialSyncImplDiffChangesObserverProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
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

  public ComAdobeCqSocialSyncImplDiffChangesObserverProperties agentName(@Nullable ConfigNodePropertyString agentName) {
    this.agentName = agentName;
    return this;
  }

  /**
   * Get agentName
   * @return agentName
   */
  @Valid 
  @Schema(name = "agentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agentName")
  public @Nullable ConfigNodePropertyString getAgentName() {
    return agentName;
  }

  @JsonProperty("agentName")
  public void setAgentName(@Nullable ConfigNodePropertyString agentName) {
    this.agentName = agentName;
  }

  public ComAdobeCqSocialSyncImplDiffChangesObserverProperties diffPath(@Nullable ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
    return this;
  }

  /**
   * Get diffPath
   * @return diffPath
   */
  @Valid 
  @Schema(name = "diffPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("diffPath")
  public @Nullable ConfigNodePropertyString getDiffPath() {
    return diffPath;
  }

  @JsonProperty("diffPath")
  public void setDiffPath(@Nullable ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
  }

  public ComAdobeCqSocialSyncImplDiffChangesObserverProperties propertyNames(@Nullable ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
    return this;
  }

  /**
   * Get propertyNames
   * @return propertyNames
   */
  @Valid 
  @Schema(name = "propertyNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("propertyNames")
  public @Nullable ConfigNodePropertyString getPropertyNames() {
    return propertyNames;
  }

  @JsonProperty("propertyNames")
  public void setPropertyNames(@Nullable ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialSyncImplDiffChangesObserverProperties comAdobeCqSocialSyncImplDiffChangesObserverProperties = (ComAdobeCqSocialSyncImplDiffChangesObserverProperties) o;
    return Objects.equals(this.enabled, comAdobeCqSocialSyncImplDiffChangesObserverProperties.enabled) &&
        Objects.equals(this.agentName, comAdobeCqSocialSyncImplDiffChangesObserverProperties.agentName) &&
        Objects.equals(this.diffPath, comAdobeCqSocialSyncImplDiffChangesObserverProperties.diffPath) &&
        Objects.equals(this.propertyNames, comAdobeCqSocialSyncImplDiffChangesObserverProperties.propertyNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, agentName, diffPath, propertyNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialSyncImplDiffChangesObserverProperties {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    diffPath: ").append(toIndentedString(diffPath)).append("\n");
    sb.append("    propertyNames: ").append(toIndentedString(propertyNames)).append("\n");
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

