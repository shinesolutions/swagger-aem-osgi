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
 * ComAdobeCqSocialGroupImplGroupServiceImplProperties
 */

@JsonTypeName("comAdobeCqSocialGroupImplGroupServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialGroupImplGroupServiceImplProperties {

  private ConfigNodePropertyInteger maxWaitTime;

  private ConfigNodePropertyInteger minWaitBetweenRetries;

  public ComAdobeCqSocialGroupImplGroupServiceImplProperties maxWaitTime(ConfigNodePropertyInteger maxWaitTime) {
    this.maxWaitTime = maxWaitTime;
    return this;
  }

  /**
   * Get maxWaitTime
   * @return maxWaitTime
   */
  @Valid 
  @Schema(name = "maxWaitTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxWaitTime")
  public ConfigNodePropertyInteger getMaxWaitTime() {
    return maxWaitTime;
  }

  public void setMaxWaitTime(ConfigNodePropertyInteger maxWaitTime) {
    this.maxWaitTime = maxWaitTime;
  }

  public ComAdobeCqSocialGroupImplGroupServiceImplProperties minWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
    return this;
  }

  /**
   * Get minWaitBetweenRetries
   * @return minWaitBetweenRetries
   */
  @Valid 
  @Schema(name = "minWaitBetweenRetries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minWaitBetweenRetries")
  public ConfigNodePropertyInteger getMinWaitBetweenRetries() {
    return minWaitBetweenRetries;
  }

  public void setMinWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialGroupImplGroupServiceImplProperties comAdobeCqSocialGroupImplGroupServiceImplProperties = (ComAdobeCqSocialGroupImplGroupServiceImplProperties) o;
    return Objects.equals(this.maxWaitTime, comAdobeCqSocialGroupImplGroupServiceImplProperties.maxWaitTime) &&
        Objects.equals(this.minWaitBetweenRetries, comAdobeCqSocialGroupImplGroupServiceImplProperties.minWaitBetweenRetries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxWaitTime, minWaitBetweenRetries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialGroupImplGroupServiceImplProperties {\n");
    sb.append("    maxWaitTime: ").append(toIndentedString(maxWaitTime)).append("\n");
    sb.append("    minWaitBetweenRetries: ").append(toIndentedString(minWaitBetweenRetries)).append("\n");
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

