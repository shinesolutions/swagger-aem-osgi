package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamCoreImplServletAssetXMPSearchServletProperties
 */

@JsonTypeName("comDayCqDamCoreImplServletAssetXMPSearchServletProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties {

  private ConfigNodePropertyInteger cqDamBatchIndesignMaxassets;

  public ComDayCqDamCoreImplServletAssetXMPSearchServletProperties cqDamBatchIndesignMaxassets(ConfigNodePropertyInteger cqDamBatchIndesignMaxassets) {
    this.cqDamBatchIndesignMaxassets = cqDamBatchIndesignMaxassets;
    return this;
  }

  /**
   * Get cqDamBatchIndesignMaxassets
   * @return cqDamBatchIndesignMaxassets
   */
  @Valid 
  @Schema(name = "cq.dam.batch.indesign.maxassets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.batch.indesign.maxassets")
  public ConfigNodePropertyInteger getCqDamBatchIndesignMaxassets() {
    return cqDamBatchIndesignMaxassets;
  }

  public void setCqDamBatchIndesignMaxassets(ConfigNodePropertyInteger cqDamBatchIndesignMaxassets) {
    this.cqDamBatchIndesignMaxassets = cqDamBatchIndesignMaxassets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletAssetXMPSearchServletProperties comDayCqDamCoreImplServletAssetXMPSearchServletProperties = (ComDayCqDamCoreImplServletAssetXMPSearchServletProperties) o;
    return Objects.equals(this.cqDamBatchIndesignMaxassets, comDayCqDamCoreImplServletAssetXMPSearchServletProperties.cqDamBatchIndesignMaxassets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchIndesignMaxassets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties {\n");
    sb.append("    cqDamBatchIndesignMaxassets: ").append(toIndentedString(cqDamBatchIndesignMaxassets)).append("\n");
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

