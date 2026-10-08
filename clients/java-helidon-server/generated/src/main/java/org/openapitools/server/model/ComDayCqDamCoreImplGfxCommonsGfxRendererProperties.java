package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties   {

    private ConfigNodePropertyBoolean skipBufferedcache;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplGfxCommonsGfxRendererProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.
     *
     * @param skipBufferedcache skipBufferedcache
     */
    public ComDayCqDamCoreImplGfxCommonsGfxRendererProperties(
        ConfigNodePropertyBoolean skipBufferedcache
    ) {
        this.skipBufferedcache = skipBufferedcache;
    }



    /**
     * Get skipBufferedcache
     * @return skipBufferedcache
     */
    public ConfigNodePropertyBoolean getSkipBufferedcache() {
        return skipBufferedcache;
    }

    public void setSkipBufferedcache(ConfigNodePropertyBoolean skipBufferedcache) {
        this.skipBufferedcache = skipBufferedcache;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties {\n");
        
        sb.append("    skipBufferedcache: ").append(toIndentedString(skipBufferedcache)).append("\n");
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

