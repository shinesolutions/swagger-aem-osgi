package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties   {

    private ConfigNodePropertyString streamPath;
    private ConfigNodePropertyString streamName;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.
     *
     * @param streamPath streamPath
     * @param streamName streamName
     */
    public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties(
        ConfigNodePropertyString streamPath, 
        ConfigNodePropertyString streamName
    ) {
        this.streamPath = streamPath;
        this.streamName = streamName;
    }



    /**
     * Get streamPath
     * @return streamPath
     */
    public ConfigNodePropertyString getStreamPath() {
        return streamPath;
    }

    public void setStreamPath(ConfigNodePropertyString streamPath) {
        this.streamPath = streamPath;
    }

    /**
     * Get streamName
     * @return streamName
     */
    public ConfigNodePropertyString getStreamName() {
        return streamName;
    }

    public void setStreamName(ConfigNodePropertyString streamName) {
        this.streamName = streamName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties {\n");
        
        sb.append("    streamPath: ").append(toIndentedString(streamPath)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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

