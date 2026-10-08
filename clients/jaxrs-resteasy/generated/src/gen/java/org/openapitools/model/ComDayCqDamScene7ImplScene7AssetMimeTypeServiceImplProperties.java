package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties   {
  
  private ConfigNodePropertyArray cqDamScene7AssetmimetypeserviceMapping;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.scene7.assetmimetypeservice.mapping")
  @Valid
  public ConfigNodePropertyArray getCqDamScene7AssetmimetypeserviceMapping() {
    return cqDamScene7AssetmimetypeserviceMapping;
  }
  public void setCqDamScene7AssetmimetypeserviceMapping(ConfigNodePropertyArray cqDamScene7AssetmimetypeserviceMapping) {
    this.cqDamScene7AssetmimetypeserviceMapping = cqDamScene7AssetmimetypeserviceMapping;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

