package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqDamCoreImplServletAssetXMPSearchServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties   {
  @JsonProperty("cq.dam.batch.indesign.maxassets")
  private ConfigNodePropertyInteger cqDamBatchIndesignMaxassets = null;

  public ComDayCqDamCoreImplServletAssetXMPSearchServletProperties cqDamBatchIndesignMaxassets(ConfigNodePropertyInteger cqDamBatchIndesignMaxassets) {
    this.cqDamBatchIndesignMaxassets = cqDamBatchIndesignMaxassets;
    return this;
  }

  /**
   * Get cqDamBatchIndesignMaxassets
   * @return cqDamBatchIndesignMaxassets
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCqDamBatchIndesignMaxassets() {
    return cqDamBatchIndesignMaxassets;
  }

  public void setCqDamBatchIndesignMaxassets(ConfigNodePropertyInteger cqDamBatchIndesignMaxassets) {
    this.cqDamBatchIndesignMaxassets = cqDamBatchIndesignMaxassets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletAssetXMPSearchServletProperties comDayCqDamCoreImplServletAssetXMPSearchServletProperties = (ComDayCqDamCoreImplServletAssetXMPSearchServletProperties) o;
    return Objects.equals(this.cqDamBatchIndesignMaxassets, comDayCqDamCoreImplServletAssetXMPSearchServletProperties.cqDamBatchIndesignMaxassets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchIndesignMaxassets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties {\n");
    
    sb.append("    cqDamBatchIndesignMaxassets: ").append(toIndentedString(cqDamBatchIndesignMaxassets)).append("\n");
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

