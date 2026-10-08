package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize;
 /**
   * Get cqDamAdhocAssetSharePrezipMaxcontentsize
   * @return cqDamAdhocAssetSharePrezipMaxcontentsize
  **/
  @JsonProperty("cq.dam.adhoc.asset.share.prezip.maxcontentsize")
  public ConfigNodePropertyInteger getCqDamAdhocAssetSharePrezipMaxcontentsize() {
    return cqDamAdhocAssetSharePrezipMaxcontentsize;
  }

  public void setCqDamAdhocAssetSharePrezipMaxcontentsize(ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize) {
    this.cqDamAdhocAssetSharePrezipMaxcontentsize = cqDamAdhocAssetSharePrezipMaxcontentsize;
  }

  public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties cqDamAdhocAssetSharePrezipMaxcontentsize(ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize) {
    this.cqDamAdhocAssetSharePrezipMaxcontentsize = cqDamAdhocAssetSharePrezipMaxcontentsize;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties = (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties) o;
    return Objects.equals(this.cqDamAdhocAssetSharePrezipMaxcontentsize, comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.cqDamAdhocAssetSharePrezipMaxcontentsize);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

