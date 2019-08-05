package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties   {
  

  private ConfigNodePropertyArray deletePathRegexps = null;

  private ConfigNodePropertyString deleteSql2Query = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("delete.path.regexps")
  public ConfigNodePropertyArray getDeletePathRegexps() {
    return deletePathRegexps;
  }
  public void setDeletePathRegexps(ConfigNodePropertyArray deletePathRegexps) {
    this.deletePathRegexps = deletePathRegexps;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("delete.sql2.query")
  public ConfigNodePropertyString getDeleteSql2Query() {
    return deleteSql2Query;
  }
  public void setDeleteSql2Query(ConfigNodePropertyString deleteSql2Query) {
    this.deleteSql2Query = deleteSql2Query;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties = (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties) o;
    return Objects.equals(deletePathRegexps, comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.deletePathRegexps) &&
        Objects.equals(deleteSql2Query, comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.deleteSql2Query);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

