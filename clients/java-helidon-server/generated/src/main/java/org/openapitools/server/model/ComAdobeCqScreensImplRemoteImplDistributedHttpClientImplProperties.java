package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties   {

    private ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout;

    /**
     * Default constructor.
     */
    public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.
     *
     * @param comAdobeAemScreensImplRemoteRequestTimeout comAdobeAemScreensImplRemoteRequestTimeout
     */
    public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties(
        ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout
    ) {
        this.comAdobeAemScreensImplRemoteRequestTimeout = comAdobeAemScreensImplRemoteRequestTimeout;
    }



    /**
     * Get comAdobeAemScreensImplRemoteRequestTimeout
     * @return comAdobeAemScreensImplRemoteRequestTimeout
     */
    public ConfigNodePropertyInteger getComAdobeAemScreensImplRemoteRequestTimeout() {
        return comAdobeAemScreensImplRemoteRequestTimeout;
    }

    public void setComAdobeAemScreensImplRemoteRequestTimeout(ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout) {
        this.comAdobeAemScreensImplRemoteRequestTimeout = comAdobeAemScreensImplRemoteRequestTimeout;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties {\n");
        
        sb.append("    comAdobeAemScreensImplRemoteRequestTimeout: ").append(toIndentedString(comAdobeAemScreensImplRemoteRequestTimeout)).append("\n");
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

