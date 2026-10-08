package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties
 */

@JsonTypeName("comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties {

  private ConfigNodePropertyArray graniteData;

  public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties graniteData(ConfigNodePropertyArray graniteData) {
    this.graniteData = graniteData;
    return this;
  }

  /**
   * Get graniteData
   * @return graniteData
   */
  @Valid 
  @Schema(name = "granite:data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite:data")
  public ConfigNodePropertyArray getGraniteData() {
    return graniteData;
  }

  public void setGraniteData(ConfigNodePropertyArray graniteData) {
    this.graniteData = graniteData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties = (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties) o;
    return Objects.equals(this.graniteData, comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.graniteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graniteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties {\n");
    sb.append("    graniteData: ").append(toIndentedString(graniteData)).append("\n");
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

