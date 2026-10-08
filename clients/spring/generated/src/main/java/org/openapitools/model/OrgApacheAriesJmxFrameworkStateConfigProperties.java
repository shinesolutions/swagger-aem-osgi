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
 * OrgApacheAriesJmxFrameworkStateConfigProperties
 */

@JsonTypeName("orgApacheAriesJmxFrameworkStateConfigProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheAriesJmxFrameworkStateConfigProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean attributeChangeNotificationEnabled;

  public OrgApacheAriesJmxFrameworkStateConfigProperties attributeChangeNotificationEnabled(@Nullable ConfigNodePropertyBoolean attributeChangeNotificationEnabled) {
    this.attributeChangeNotificationEnabled = attributeChangeNotificationEnabled;
    return this;
  }

  /**
   * Get attributeChangeNotificationEnabled
   * @return attributeChangeNotificationEnabled
   */
  @Valid 
  @Schema(name = "attributeChangeNotificationEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributeChangeNotificationEnabled")
  public @Nullable ConfigNodePropertyBoolean getAttributeChangeNotificationEnabled() {
    return attributeChangeNotificationEnabled;
  }

  @JsonProperty("attributeChangeNotificationEnabled")
  public void setAttributeChangeNotificationEnabled(@Nullable ConfigNodePropertyBoolean attributeChangeNotificationEnabled) {
    this.attributeChangeNotificationEnabled = attributeChangeNotificationEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheAriesJmxFrameworkStateConfigProperties orgApacheAriesJmxFrameworkStateConfigProperties = (OrgApacheAriesJmxFrameworkStateConfigProperties) o;
    return Objects.equals(this.attributeChangeNotificationEnabled, orgApacheAriesJmxFrameworkStateConfigProperties.attributeChangeNotificationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeChangeNotificationEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheAriesJmxFrameworkStateConfigProperties {\n");
    sb.append("    attributeChangeNotificationEnabled: ").append(toIndentedString(attributeChangeNotificationEnabled)).append("\n");
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

