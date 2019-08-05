package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties   {
  
  private @Valid ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize = null;

  /**
   **/
  public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties cqDamAdhocAssetSharePrezipMaxcontentsize(ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize) {
    this.cqDamAdhocAssetSharePrezipMaxcontentsize = cqDamAdhocAssetSharePrezipMaxcontentsize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.adhoc.asset.share.prezip.maxcontentsize")
  public ConfigNodePropertyInteger getCqDamAdhocAssetSharePrezipMaxcontentsize() {
    return cqDamAdhocAssetSharePrezipMaxcontentsize;
  }
  public void setCqDamAdhocAssetSharePrezipMaxcontentsize(ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize) {
    this.cqDamAdhocAssetSharePrezipMaxcontentsize = cqDamAdhocAssetSharePrezipMaxcontentsize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties = (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties) o;
    return Objects.equals(cqDamAdhocAssetSharePrezipMaxcontentsize, comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.cqDamAdhocAssetSharePrezipMaxcontentsize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamAdhocAssetSharePrezipMaxcontentsize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties {\n");
    
    sb.append("    cqDamAdhocAssetSharePrezipMaxcontentsize: ").append(toIndentedString(cqDamAdhocAssetSharePrezipMaxcontentsize)).append("\n");
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

