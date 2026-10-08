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
 * ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties
 */

@JsonTypeName("comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize;

  public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties cqDamAdhocAssetSharePrezipMaxcontentsize(@Nullable ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize) {
    this.cqDamAdhocAssetSharePrezipMaxcontentsize = cqDamAdhocAssetSharePrezipMaxcontentsize;
    return this;
  }

  /**
   * Get cqDamAdhocAssetSharePrezipMaxcontentsize
   * @return cqDamAdhocAssetSharePrezipMaxcontentsize
   */
  @Valid 
  @Schema(name = "cq.dam.adhoc.asset.share.prezip.maxcontentsize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.adhoc.asset.share.prezip.maxcontentsize")
  public @Nullable ConfigNodePropertyInteger getCqDamAdhocAssetSharePrezipMaxcontentsize() {
    return cqDamAdhocAssetSharePrezipMaxcontentsize;
  }

  @JsonProperty("cq.dam.adhoc.asset.share.prezip.maxcontentsize")
  public void setCqDamAdhocAssetSharePrezipMaxcontentsize(@Nullable ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize) {
    this.cqDamAdhocAssetSharePrezipMaxcontentsize = cqDamAdhocAssetSharePrezipMaxcontentsize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties = (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties) o;
    return Objects.equals(this.cqDamAdhocAssetSharePrezipMaxcontentsize, comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.cqDamAdhocAssetSharePrezipMaxcontentsize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamAdhocAssetSharePrezipMaxcontentsize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties {\n");
    sb.append("    cqDamAdhocAssetSharePrezipMaxcontentsize: ").append(toIndentedString(cqDamAdhocAssetSharePrezipMaxcontentsize)).append("\n");
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

