package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties
 */

@JsonTypeName("comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray upgradeTaskIgnoreList;

  public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties upgradeTaskIgnoreList(@Nullable ConfigNodePropertyArray upgradeTaskIgnoreList) {
    this.upgradeTaskIgnoreList = upgradeTaskIgnoreList;
    return this;
  }

  /**
   * Get upgradeTaskIgnoreList
   * @return upgradeTaskIgnoreList
   */
  @Valid 
  @Schema(name = "upgradeTaskIgnoreList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("upgradeTaskIgnoreList")
  public @Nullable ConfigNodePropertyArray getUpgradeTaskIgnoreList() {
    return upgradeTaskIgnoreList;
  }

  @JsonProperty("upgradeTaskIgnoreList")
  public void setUpgradeTaskIgnoreList(@Nullable ConfigNodePropertyArray upgradeTaskIgnoreList) {
    this.upgradeTaskIgnoreList = upgradeTaskIgnoreList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties = (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties) o;
    return Objects.equals(this.upgradeTaskIgnoreList, comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.upgradeTaskIgnoreList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upgradeTaskIgnoreList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties {\n");
    sb.append("    upgradeTaskIgnoreList: ").append(toIndentedString(upgradeTaskIgnoreList)).append("\n");
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

