package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties   {

    private ConfigNodePropertyArray payloadMoveWhiteList;
    private ConfigNodePropertyBoolean payloadMoveHandleFromWorkflowProcess;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.
     *
     * @param payloadMoveWhiteList payloadMoveWhiteList
     * @param payloadMoveHandleFromWorkflowProcess payloadMoveHandleFromWorkflowProcess
     */
    public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties(
        ConfigNodePropertyArray payloadMoveWhiteList, 
        ConfigNodePropertyBoolean payloadMoveHandleFromWorkflowProcess
    ) {
        this.payloadMoveWhiteList = payloadMoveWhiteList;
        this.payloadMoveHandleFromWorkflowProcess = payloadMoveHandleFromWorkflowProcess;
    }



    /**
     * Get payloadMoveWhiteList
     * @return payloadMoveWhiteList
     */
    public ConfigNodePropertyArray getPayloadMoveWhiteList() {
        return payloadMoveWhiteList;
    }

    public void setPayloadMoveWhiteList(ConfigNodePropertyArray payloadMoveWhiteList) {
        this.payloadMoveWhiteList = payloadMoveWhiteList;
    }

    /**
     * Get payloadMoveHandleFromWorkflowProcess
     * @return payloadMoveHandleFromWorkflowProcess
     */
    public ConfigNodePropertyBoolean getPayloadMoveHandleFromWorkflowProcess() {
        return payloadMoveHandleFromWorkflowProcess;
    }

    public void setPayloadMoveHandleFromWorkflowProcess(ConfigNodePropertyBoolean payloadMoveHandleFromWorkflowProcess) {
        this.payloadMoveHandleFromWorkflowProcess = payloadMoveHandleFromWorkflowProcess;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties {\n");
        
        sb.append("    payloadMoveWhiteList: ").append(toIndentedString(payloadMoveWhiteList)).append("\n");
        sb.append("    payloadMoveHandleFromWorkflowProcess: ").append(toIndentedString(payloadMoveHandleFromWorkflowProcess)).append("\n");
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

