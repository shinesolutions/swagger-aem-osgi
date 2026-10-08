package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties   {
  private ConfigNodePropertyArray deleteNameRegexps;

  public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties() {
  }

  /**
   **/
  public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties deleteNameRegexps(ConfigNodePropertyArray deleteNameRegexps) {
    this.deleteNameRegexps = deleteNameRegexps;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delete.name.regexps")
  @Valid public ConfigNodePropertyArray getDeleteNameRegexps() {
    return deleteNameRegexps;
  }

  @JsonProperty("delete.name.regexps")
  public void setDeleteNameRegexps(ConfigNodePropertyArray deleteNameRegexps) {
    this.deleteNameRegexps = deleteNameRegexps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties = (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties) o;
    return Objects.equals(this.deleteNameRegexps, comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.deleteNameRegexps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteNameRegexps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties {\n");
    
    sb.append("    deleteNameRegexps: ").append(toIndentedString(deleteNameRegexps)).append("\n");
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
