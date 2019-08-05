package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties   {
  @JsonProperty("item.resource.types")
  private ConfigNodePropertyArray itemResourceTypes = null;

  public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties itemResourceTypes(ConfigNodePropertyArray itemResourceTypes) {
    this.itemResourceTypes = itemResourceTypes;
    return this;
  }

   /**
   * Get itemResourceTypes
   * @return itemResourceTypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getItemResourceTypes() {
    return itemResourceTypes;
  }

  public void setItemResourceTypes(ConfigNodePropertyArray itemResourceTypes) {
    this.itemResourceTypes = itemResourceTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

