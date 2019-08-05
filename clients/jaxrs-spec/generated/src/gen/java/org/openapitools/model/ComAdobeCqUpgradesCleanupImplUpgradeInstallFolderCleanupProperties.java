package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties   {
  
  private @Valid ConfigNodePropertyArray deleteNameRegexps = null;

  /**
   **/
  public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties deleteNameRegexps(ConfigNodePropertyArray deleteNameRegexps) {
    this.deleteNameRegexps = deleteNameRegexps;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delete.name.regexps")
  public ConfigNodePropertyArray getDeleteNameRegexps() {
    return deleteNameRegexps;
  }
  public void setDeleteNameRegexps(ConfigNodePropertyArray deleteNameRegexps) {
    this.deleteNameRegexps = deleteNameRegexps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties = (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties) o;
    return Objects.equals(deleteNameRegexps, comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.deleteNameRegexps);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

