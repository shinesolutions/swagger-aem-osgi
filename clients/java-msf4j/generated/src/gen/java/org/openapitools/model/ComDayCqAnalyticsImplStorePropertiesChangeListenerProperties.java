package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties   {
  @JsonProperty("cq.store.listener.additionalStorePaths")
  private ConfigNodePropertyArray cqStoreListenerAdditionalStorePaths;

  public ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties cqStoreListenerAdditionalStorePaths(ConfigNodePropertyArray cqStoreListenerAdditionalStorePaths) {
    this.cqStoreListenerAdditionalStorePaths = cqStoreListenerAdditionalStorePaths;
    return this;
  }

   /**
   * Get cqStoreListenerAdditionalStorePaths
   * @return cqStoreListenerAdditionalStorePaths
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqStoreListenerAdditionalStorePaths() {
    return cqStoreListenerAdditionalStorePaths;
  }

  public void setCqStoreListenerAdditionalStorePaths(ConfigNodePropertyArray cqStoreListenerAdditionalStorePaths) {
    this.cqStoreListenerAdditionalStorePaths = cqStoreListenerAdditionalStorePaths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties comDayCqAnalyticsImplStorePropertiesChangeListenerProperties = (ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties) o;
    return Objects.equals(this.cqStoreListenerAdditionalStorePaths, comDayCqAnalyticsImplStorePropertiesChangeListenerProperties.cqStoreListenerAdditionalStorePaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqStoreListenerAdditionalStorePaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties {\n");
    
    sb.append("    cqStoreListenerAdditionalStorePaths: ").append(toIndentedString(cqStoreListenerAdditionalStorePaths)).append("\n");
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

