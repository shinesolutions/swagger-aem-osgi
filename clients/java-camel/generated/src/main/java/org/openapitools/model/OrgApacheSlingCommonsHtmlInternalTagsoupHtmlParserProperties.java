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
 * OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties
 */

@JsonTypeName("orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties {

  private ConfigNodePropertyArray parserFeatures;

  public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties parserFeatures(ConfigNodePropertyArray parserFeatures) {
    this.parserFeatures = parserFeatures;
    return this;
  }

  /**
   * Get parserFeatures
   * @return parserFeatures
   */
  @Valid 
  @Schema(name = "parser.features", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parser.features")
  public ConfigNodePropertyArray getParserFeatures() {
    return parserFeatures;
  }

  public void setParserFeatures(ConfigNodePropertyArray parserFeatures) {
    this.parserFeatures = parserFeatures;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties = (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties) o;
    return Objects.equals(this.parserFeatures, orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.parserFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parserFeatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties {\n");
    sb.append("    parserFeatures: ").append(toIndentedString(parserFeatures)).append("\n");
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

