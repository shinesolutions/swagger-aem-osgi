package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties   {
  
  private ConfigNodePropertyArray deletePathRegexps = null;
  private ConfigNodePropertyString deleteSql2Query = null;

  public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties () {

  }

  public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties (ConfigNodePropertyArray deletePathRegexps, ConfigNodePropertyString deleteSql2Query) {
    this.deletePathRegexps = deletePathRegexps;
    this.deleteSql2Query = deleteSql2Query;
  }

    
  @JsonProperty("delete.path.regexps")
  public ConfigNodePropertyArray getDeletePathRegexps() {
    return deletePathRegexps;
  }
  public void setDeletePathRegexps(ConfigNodePropertyArray deletePathRegexps) {
    this.deletePathRegexps = deletePathRegexps;
  }

    
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
