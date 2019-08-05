package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties   {
  @JsonProperty("cq.dam.scene7.assetmimetypeservice.mapping")
  private ConfigNodePropertyArray cqDamScene7AssetmimetypeserviceMapping = null;

  public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties cqDamScene7AssetmimetypeserviceMapping(ConfigNodePropertyArray cqDamScene7AssetmimetypeserviceMapping) {
    this.cqDamScene7AssetmimetypeserviceMapping = cqDamScene7AssetmimetypeserviceMapping;
    return this;
  }

   /**
   * Get cqDamScene7AssetmimetypeserviceMapping
   * @return cqDamScene7AssetmimetypeserviceMapping
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqDamScene7AssetmimetypeserviceMapping() {
    return cqDamScene7AssetmimetypeserviceMapping;
  }

  public void setCqDamScene7AssetmimetypeserviceMapping(ConfigNodePropertyArray cqDamScene7AssetmimetypeserviceMapping) {
    this.cqDamScene7AssetmimetypeserviceMapping = cqDamScene7AssetmimetypeserviceMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties = (ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties) o;
    return Objects.equals(this.cqDamScene7AssetmimetypeserviceMapping, comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.cqDamScene7AssetmimetypeserviceMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamScene7AssetmimetypeserviceMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties {\n");
    
    sb.append("    cqDamScene7AssetmimetypeserviceMapping: ").append(toIndentedString(cqDamScene7AssetmimetypeserviceMapping)).append("\n");
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

