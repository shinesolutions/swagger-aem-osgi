package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties   {

    private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes;
    private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems;
    private ConfigNodePropertyArray cqWcmMsmActionExcludedprops;
    private ConfigNodePropertyBoolean cqWcmMsmImplActionReferencesupdatePropUpdateNested;

    /**
     * Default constructor.
     */
    public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.
     *
     * @param cqWcmMsmActionExcludednodetypes cqWcmMsmActionExcludednodetypes
     * @param cqWcmMsmActionExcludedparagraphitems cqWcmMsmActionExcludedparagraphitems
     * @param cqWcmMsmActionExcludedprops cqWcmMsmActionExcludedprops
     * @param cqWcmMsmImplActionReferencesupdatePropUpdateNested cqWcmMsmImplActionReferencesupdatePropUpdateNested
     */
    public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties(
        ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes, 
        ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems, 
        ConfigNodePropertyArray cqWcmMsmActionExcludedprops, 
        ConfigNodePropertyBoolean cqWcmMsmImplActionReferencesupdatePropUpdateNested
    ) {
        this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
        this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
        this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
        this.cqWcmMsmImplActionReferencesupdatePropUpdateNested = cqWcmMsmImplActionReferencesupdatePropUpdateNested;
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
     * Get cqWcmMsmImplActionReferencesupdatePropUpdateNested
     * @return cqWcmMsmImplActionReferencesupdatePropUpdateNested
     */
    public ConfigNodePropertyBoolean getCqWcmMsmImplActionReferencesupdatePropUpdateNested() {
        return cqWcmMsmImplActionReferencesupdatePropUpdateNested;
    }

    public void setCqWcmMsmImplActionReferencesupdatePropUpdateNested(ConfigNodePropertyBoolean cqWcmMsmImplActionReferencesupdatePropUpdateNested) {
        this.cqWcmMsmImplActionReferencesupdatePropUpdateNested = cqWcmMsmImplActionReferencesupdatePropUpdateNested;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties {\n");
        
        sb.append("    cqWcmMsmActionExcludednodetypes: ").append(toIndentedString(cqWcmMsmActionExcludednodetypes)).append("\n");
        sb.append("    cqWcmMsmActionExcludedparagraphitems: ").append(toIndentedString(cqWcmMsmActionExcludedparagraphitems)).append("\n");
        sb.append("    cqWcmMsmActionExcludedprops: ").append(toIndentedString(cqWcmMsmActionExcludedprops)).append("\n");
        sb.append("    cqWcmMsmImplActionReferencesupdatePropUpdateNested: ").append(toIndentedString(cqWcmMsmImplActionReferencesupdatePropUpdateNested)).append("\n");
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

