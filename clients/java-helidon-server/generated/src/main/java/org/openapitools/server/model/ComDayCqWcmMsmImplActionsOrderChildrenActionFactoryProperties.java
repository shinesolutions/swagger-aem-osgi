package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties   {

    private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes;
    private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems;
    private ConfigNodePropertyArray cqWcmMsmActionExcludedprops;

    /**
     * Default constructor.
     */
    public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.
     *
     * @param cqWcmMsmActionExcludednodetypes cqWcmMsmActionExcludednodetypes
     * @param cqWcmMsmActionExcludedparagraphitems cqWcmMsmActionExcludedparagraphitems
     * @param cqWcmMsmActionExcludedprops cqWcmMsmActionExcludedprops
     */
    public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties(
        ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes, 
        ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems, 
        ConfigNodePropertyArray cqWcmMsmActionExcludedprops
    ) {
        this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
        this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
        this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
    }



    /**
     * Get cqWcmMsmActionExcludednodetypes
     * @return cqWcmMsmActionExcludednodetypes
     */
    public ConfigNodePropertyArray getCqWcmMsmActionExcludednodetypes() {
        return cqWcmMsmActionExcludednodetypes;
    }

    public void setCqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
        this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
    }

    /**
     * Get cqWcmMsmActionExcludedparagraphitems
     * @return cqWcmMsmActionExcludedparagraphitems
     */
    public ConfigNodePropertyArray getCqWcmMsmActionExcludedparagraphitems() {
        return cqWcmMsmActionExcludedparagraphitems;
    }

    public void setCqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
        this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
    }

    /**
     * Get cqWcmMsmActionExcludedprops
     * @return cqWcmMsmActionExcludedprops
     */
    public ConfigNodePropertyArray getCqWcmMsmActionExcludedprops() {
        return cqWcmMsmActionExcludedprops;
    }

    public void setCqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
        this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties {\n");
        
        sb.append("    cqWcmMsmActionExcludednodetypes: ").append(toIndentedString(cqWcmMsmActionExcludednodetypes)).append("\n");
        sb.append("    cqWcmMsmActionExcludedparagraphitems: ").append(toIndentedString(cqWcmMsmActionExcludedparagraphitems)).append("\n");
        sb.append("    cqWcmMsmActionExcludedprops: ").append(toIndentedString(cqWcmMsmActionExcludedprops)).append("\n");
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

