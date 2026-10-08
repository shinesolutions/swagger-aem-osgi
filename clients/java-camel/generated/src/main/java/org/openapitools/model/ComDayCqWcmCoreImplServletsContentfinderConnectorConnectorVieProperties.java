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
 * ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties
 */

@JsonTypeName("comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties {

  private ConfigNodePropertyArray itemResourceTypes;

  public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties itemResourceTypes(ConfigNodePropertyArray itemResourceTypes) {
    this.itemResourceTypes = itemResourceTypes;
    return this;
  }

  /**
   * Get itemResourceTypes
   * @return itemResourceTypes
   */
  @Valid 
  @Schema(name = "item.resource.types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item.resource.types")
  public ConfigNodePropertyArray getItemResourceTypes() {
    return itemResourceTypes;
  }

  public void setItemResourceTypes(ConfigNodePropertyArray itemResourceTypes) {
    this.itemResourceTypes = itemResourceTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties = (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties) o;
    return Objects.equals(this.itemResourceTypes, comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.itemResourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemResourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties {\n");
    sb.append("    itemResourceTypes: ").append(toIndentedString(itemResourceTypes)).append("\n");
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

