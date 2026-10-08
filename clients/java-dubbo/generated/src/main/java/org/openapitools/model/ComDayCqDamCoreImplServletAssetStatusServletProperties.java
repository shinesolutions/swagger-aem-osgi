package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamCoreImplServletAssetStatusServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cq.dam.batch.status.maxassets")
  private ConfigNodePropertyInteger cqDamBatchStatusMaxassets;

  /**
   * 
   * @return cqDamBatchStatusMaxassets
   */
  public ConfigNodePropertyInteger getCqDamBatchStatusMaxassets() {
    return cqDamBatchStatusMaxassets;
  }

  public void setCqDamBatchStatusMaxassets(ConfigNodePropertyInteger cqDamBatchStatusMaxassets) {
    this.cqDamBatchStatusMaxassets = cqDamBatchStatusMaxassets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletAssetStatusServletProperties comDayCqDamCoreImplServletAssetStatusServletProperties = (ComDayCqDamCoreImplServletAssetStatusServletProperties) o;
    return Objects.equals(this.cqDamBatchStatusMaxassets, comDayCqDamCoreImplServletAssetStatusServletProperties.cqDamBatchStatusMaxassets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchStatusMaxassets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletAssetStatusServletProperties {\n");
    
    sb.append("    cqDamBatchStatusMaxassets: ").append(toIndentedString(cqDamBatchStatusMaxassets)).append("\n");
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
