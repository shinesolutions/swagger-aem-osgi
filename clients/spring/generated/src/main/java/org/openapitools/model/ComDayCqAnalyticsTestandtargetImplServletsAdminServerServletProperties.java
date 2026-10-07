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
 * ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties
 */

@JsonTypeName("comDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString testandtargetEndpointUrl;

  public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties testandtargetEndpointUrl(@Nullable ConfigNodePropertyString testandtargetEndpointUrl) {
    this.testandtargetEndpointUrl = testandtargetEndpointUrl;
    return this;
  }

  /**
   * Get testandtargetEndpointUrl
   * @return testandtargetEndpointUrl
   */
  @Valid 
  @Schema(name = "testandtarget.endpoint.url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testandtarget.endpoint.url")
  public @Nullable ConfigNodePropertyString getTestandtargetEndpointUrl() {
    return testandtargetEndpointUrl;
  }

  @JsonProperty("testandtarget.endpoint.url")
  public void setTestandtargetEndpointUrl(@Nullable ConfigNodePropertyString testandtargetEndpointUrl) {
    this.testandtargetEndpointUrl = testandtargetEndpointUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties comDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties = (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties) o;
    return Objects.equals(this.testandtargetEndpointUrl, comDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.testandtargetEndpointUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testandtargetEndpointUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {\n");
    sb.append("    testandtargetEndpointUrl: ").append(toIndentedString(testandtargetEndpointUrl)).append("\n");
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

