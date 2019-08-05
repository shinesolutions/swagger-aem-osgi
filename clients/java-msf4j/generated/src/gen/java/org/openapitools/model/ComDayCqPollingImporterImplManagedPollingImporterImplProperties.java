package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqPollingImporterImplManagedPollingImporterImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqPollingImporterImplManagedPollingImporterImplProperties   {
  @JsonProperty("importer.user")
  private ConfigNodePropertyString importerUser = null;

  public ComDayCqPollingImporterImplManagedPollingImporterImplProperties importerUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
    return this;
  }

   /**
   * Get importerUser
   * @return importerUser
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getImporterUser() {
    return importerUser;
  }

  public void setImporterUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqPollingImporterImplManagedPollingImporterImplProperties comDayCqPollingImporterImplManagedPollingImporterImplProperties = (ComDayCqPollingImporterImplManagedPollingImporterImplProperties) o;
    return Objects.equals(this.importerUser, comDayCqPollingImporterImplManagedPollingImporterImplProperties.importerUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importerUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqPollingImporterImplManagedPollingImporterImplProperties {\n");
    
    sb.append("    importerUser: ").append(toIndentedString(importerUser)).append("\n");
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

