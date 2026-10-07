package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqDamCoreImplGfxCommonsGfxRendererProperties
 */

@JsonTypeName("comDayCqDamCoreImplGfxCommonsGfxRendererProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean skipBufferedcache;

  public ComDayCqDamCoreImplGfxCommonsGfxRendererProperties skipBufferedcache(@Nullable ConfigNodePropertyBoolean skipBufferedcache) {
    this.skipBufferedcache = skipBufferedcache;
    return this;
  }

  /**
   * Get skipBufferedcache
   * @return skipBufferedcache
   */
  @Valid 
  @Schema(name = "skip.bufferedcache", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skip.bufferedcache")
  public @Nullable ConfigNodePropertyBoolean getSkipBufferedcache() {
    return skipBufferedcache;
  }

  @JsonProperty("skip.bufferedcache")
  public void setSkipBufferedcache(@Nullable ConfigNodePropertyBoolean skipBufferedcache) {
    this.skipBufferedcache = skipBufferedcache;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplGfxCommonsGfxRendererProperties comDayCqDamCoreImplGfxCommonsGfxRendererProperties = (ComDayCqDamCoreImplGfxCommonsGfxRendererProperties) o;
    return Objects.equals(this.skipBufferedcache, comDayCqDamCoreImplGfxCommonsGfxRendererProperties.skipBufferedcache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skipBufferedcache);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties {\n");
    sb.append("    skipBufferedcache: ").append(toIndentedString(skipBufferedcache)).append("\n");
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

