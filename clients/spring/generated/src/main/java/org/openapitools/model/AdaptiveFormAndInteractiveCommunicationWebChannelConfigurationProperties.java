package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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
 * AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties
 */

@JsonTypeName("adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean showPlaceholder;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maximumCacheEntries;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown afScriptingCompatversion;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean makeFileNameUnique;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean generatingCompliantData;

  public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties showPlaceholder(@Nullable ConfigNodePropertyBoolean showPlaceholder) {
    this.showPlaceholder = showPlaceholder;
    return this;
  }

  /**
   * Get showPlaceholder
   * @return showPlaceholder
   */
  @Valid 
  @Schema(name = "showPlaceholder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showPlaceholder")
  public @Nullable ConfigNodePropertyBoolean getShowPlaceholder() {
    return showPlaceholder;
  }

  @JsonProperty("showPlaceholder")
  public void setShowPlaceholder(@Nullable ConfigNodePropertyBoolean showPlaceholder) {
    this.showPlaceholder = showPlaceholder;
  }

  public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties maximumCacheEntries(@Nullable ConfigNodePropertyInteger maximumCacheEntries) {
    this.maximumCacheEntries = maximumCacheEntries;
    return this;
  }

  /**
   * Get maximumCacheEntries
   * @return maximumCacheEntries
   */
  @Valid 
  @Schema(name = "maximumCacheEntries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumCacheEntries")
  public @Nullable ConfigNodePropertyInteger getMaximumCacheEntries() {
    return maximumCacheEntries;
  }

  @JsonProperty("maximumCacheEntries")
  public void setMaximumCacheEntries(@Nullable ConfigNodePropertyInteger maximumCacheEntries) {
    this.maximumCacheEntries = maximumCacheEntries;
  }

  public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties afScriptingCompatversion(@Nullable ConfigNodePropertyDropDown afScriptingCompatversion) {
    this.afScriptingCompatversion = afScriptingCompatversion;
    return this;
  }

  /**
   * Get afScriptingCompatversion
   * @return afScriptingCompatversion
   */
  @Valid 
  @Schema(name = "af.scripting.compatversion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("af.scripting.compatversion")
  public @Nullable ConfigNodePropertyDropDown getAfScriptingCompatversion() {
    return afScriptingCompatversion;
  }

  @JsonProperty("af.scripting.compatversion")
  public void setAfScriptingCompatversion(@Nullable ConfigNodePropertyDropDown afScriptingCompatversion) {
    this.afScriptingCompatversion = afScriptingCompatversion;
  }

  public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties makeFileNameUnique(@Nullable ConfigNodePropertyBoolean makeFileNameUnique) {
    this.makeFileNameUnique = makeFileNameUnique;
    return this;
  }

  /**
   * Get makeFileNameUnique
   * @return makeFileNameUnique
   */
  @Valid 
  @Schema(name = "makeFileNameUnique", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("makeFileNameUnique")
  public @Nullable ConfigNodePropertyBoolean getMakeFileNameUnique() {
    return makeFileNameUnique;
  }

  @JsonProperty("makeFileNameUnique")
  public void setMakeFileNameUnique(@Nullable ConfigNodePropertyBoolean makeFileNameUnique) {
    this.makeFileNameUnique = makeFileNameUnique;
  }

  public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties generatingCompliantData(@Nullable ConfigNodePropertyBoolean generatingCompliantData) {
    this.generatingCompliantData = generatingCompliantData;
    return this;
  }

  /**
   * Get generatingCompliantData
   * @return generatingCompliantData
   */
  @Valid 
  @Schema(name = "generatingCompliantData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generatingCompliantData")
  public @Nullable ConfigNodePropertyBoolean getGeneratingCompliantData() {
    return generatingCompliantData;
  }

  @JsonProperty("generatingCompliantData")
  public void setGeneratingCompliantData(@Nullable ConfigNodePropertyBoolean generatingCompliantData) {
    this.generatingCompliantData = generatingCompliantData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties = (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties) o;
    return Objects.equals(this.showPlaceholder, adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.showPlaceholder) &&
        Objects.equals(this.maximumCacheEntries, adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.maximumCacheEntries) &&
        Objects.equals(this.afScriptingCompatversion, adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.afScriptingCompatversion) &&
        Objects.equals(this.makeFileNameUnique, adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.makeFileNameUnique) &&
        Objects.equals(this.generatingCompliantData, adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.generatingCompliantData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showPlaceholder, maximumCacheEntries, afScriptingCompatversion, makeFileNameUnique, generatingCompliantData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties {\n");
    sb.append("    showPlaceholder: ").append(toIndentedString(showPlaceholder)).append("\n");
    sb.append("    maximumCacheEntries: ").append(toIndentedString(maximumCacheEntries)).append("\n");
    sb.append("    afScriptingCompatversion: ").append(toIndentedString(afScriptingCompatversion)).append("\n");
    sb.append("    makeFileNameUnique: ").append(toIndentedString(makeFileNameUnique)).append("\n");
    sb.append("    generatingCompliantData: ").append(toIndentedString(generatingCompliantData)).append("\n");
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

