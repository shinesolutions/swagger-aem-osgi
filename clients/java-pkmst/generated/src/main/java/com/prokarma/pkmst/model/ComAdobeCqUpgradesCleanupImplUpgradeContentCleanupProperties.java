package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties   {
  @JsonProperty("delete.path.regexps")
  private ConfigNodePropertyArray deletePathRegexps = null;

  @JsonProperty("delete.sql2.query")
  private ConfigNodePropertyString deleteSql2Query = null;

  public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties deletePathRegexps(ConfigNodePropertyArray deletePathRegexps) {
    this.deletePathRegexps = deletePathRegexps;
    return this;
  }

   /**
   * Get deletePathRegexps
   * @return deletePathRegexps
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getDeletePathRegexps() {
    return deletePathRegexps;
  }

  public void setDeletePathRegexps(ConfigNodePropertyArray deletePathRegexps) {
    this.deletePathRegexps = deletePathRegexps;
  }

  public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties deleteSql2Query(ConfigNodePropertyString deleteSql2Query) {
    this.deleteSql2Query = deleteSql2Query;
    return this;
  }

   /**
   * Get deleteSql2Query
   * @return deleteSql2Query
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDeleteSql2Query() {
    return deleteSql2Query;
  }

  public void setDeleteSql2Query(ConfigNodePropertyString deleteSql2Query) {
    this.deleteSql2Query = deleteSql2Query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties = (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties) o;
    return Objects.equals(this.deletePathRegexps, comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.deletePathRegexps) &&
        Objects.equals(this.deleteSql2Query, comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.deleteSql2Query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletePathRegexps, deleteSql2Query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties {\n");
    
    sb.append("    deletePathRegexps: ").append(toIndentedString(deletePathRegexps)).append("\n");
    sb.append("    deleteSql2Query: ").append(toIndentedString(deleteSql2Query)).append("\n");
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

