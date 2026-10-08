package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties   {

    private ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.
     *
     * @param cqDamAdhocAssetSharePrezipMaxcontentsize cqDamAdhocAssetSharePrezipMaxcontentsize
     */
    public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties(
        ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize
    ) {
        this.cqDamAdhocAssetSharePrezipMaxcontentsize = cqDamAdhocAssetSharePrezipMaxcontentsize;
    }



    /**
     * Get cqDamAdhocAssetSharePrezipMaxcontentsize
     * @return cqDamAdhocAssetSharePrezipMaxcontentsize
     */
    public ConfigNodePropertyInteger getCqDamAdhocAssetSharePrezipMaxcontentsize() {
        return cqDamAdhocAssetSharePrezipMaxcontentsize;
    }

    public void setCqDamAdhocAssetSharePrezipMaxcontentsize(ConfigNodePropertyInteger cqDamAdhocAssetSharePrezipMaxcontentsize) {
        this.cqDamAdhocAssetSharePrezipMaxcontentsize = cqDamAdhocAssetSharePrezipMaxcontentsize;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

