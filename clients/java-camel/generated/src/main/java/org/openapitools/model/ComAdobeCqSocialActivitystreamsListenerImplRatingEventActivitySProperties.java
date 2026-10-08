package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties
 */

@JsonTypeName("comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties {

  private ConfigNodePropertyInteger ranking;

  private ConfigNodePropertyBoolean enable;

  public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties ranking(ConfigNodePropertyInteger ranking) {
    this.ranking = ranking;
    return this;
  }

  /**
   * Get ranking
   * @return ranking
   */
  @Valid 
  @Schema(name = "ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ranking")
  public ConfigNodePropertyInteger getRanking() {
    return ranking;
  }

  public void setRanking(ConfigNodePropertyInteger ranking) {
    this.ranking = ranking;
  }

  public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties enable(ConfigNodePropertyBoolean enable) {
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
  public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties = (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties) o;
    return Objects.equals(this.ranking, comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.ranking) &&
        Objects.equals(this.enable, comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.enable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranking, enable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties {\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

