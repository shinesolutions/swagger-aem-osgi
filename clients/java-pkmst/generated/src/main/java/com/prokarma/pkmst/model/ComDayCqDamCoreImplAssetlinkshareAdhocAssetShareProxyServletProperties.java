package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties   {
  @JsonProperty("cq.dam.adhoc.asset.share.prezip.maxcontentsize")
  private ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize;

  public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties cqDamAdhocAssetSharePrezipMaxcontentsize(ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize) {
    this.cqDamAdhocAssetSharePrezipMaxcontentsize = cqDamAdhocAssetSharePrezipMaxcontentsize;
    return this;
  }

  /**
   * Get cqDamAdhocAssetSharePrezipMaxcontentsize
   * @return cqDamAdhocAssetSharePrezipMaxcontentsize
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCqDamAdhocAssetSharePrezipMaxcontentsize() {
    return cqDamAdhocAssetSharePrezipMaxcontentsize;
  }

  public void setCqDamAdhocAssetSharePrezipMaxcontentsize(ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize) {
    this.cqDamAdhocAssetSharePrezipMaxcontentsize = cqDamAdhocAssetSharePrezipMaxcontentsize;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

