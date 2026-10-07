package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties
 */

@JsonTypeName("comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger ttl1;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger ttl2;

  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties enable(@Nullable ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Get enable
   * @return enable
   */
  @Valid 
  @Schema(name = "enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enable")
  public @Nullable ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  @JsonProperty("enable")
  public void setEnable(@Nullable ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties ttl1(@Nullable ConfigNodePropertyInteger ttl1) {
    this.ttl1 = ttl1;
    return this;
  }

  /**
   * Get ttl1
   * @return ttl1
   */
  @Valid 
  @Schema(name = "ttl1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ttl1")
  public @Nullable ConfigNodePropertyInteger getTtl1() {
    return ttl1;
  }

  @JsonProperty("ttl1")
  public void setTtl1(@Nullable ConfigNodePropertyInteger ttl1) {
    this.ttl1 = ttl1;
  }

  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties ttl2(@Nullable ConfigNodePropertyInteger ttl2) {
    this.ttl2 = ttl2;
    return this;
  }

  /**
   * Get ttl2
   * @return ttl2
   */
  @Valid 
  @Schema(name = "ttl2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ttl2")
  public @Nullable ConfigNodePropertyInteger getTtl2() {
    return ttl2;
  }

  @JsonProperty("ttl2")
  public void setTtl2(@Nullable ConfigNodePropertyInteger ttl2) {
    this.ttl2 = ttl2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties = (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties) o;
    return Objects.equals(this.enable, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.enable) &&
        Objects.equals(this.ttl1, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.ttl1) &&
        Objects.equals(this.ttl2, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.ttl2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, ttl1, ttl2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    ttl1: ").append(toIndentedString(ttl1)).append("\n");
    sb.append("    ttl2: ").append(toIndentedString(ttl2)).append("\n");
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

