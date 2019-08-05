package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties   {
  
  private ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize = null;

  public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties () {

  }

  public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties (ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize) {
    this.cqDamAdhocAssetSharePrezipMaxcontentsize = cqDamAdhocAssetSharePrezipMaxcontentsize;
  }

    
  @JsonProperty("cq.dam.adhoc.asset.share.prezip.maxcontentsize")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
