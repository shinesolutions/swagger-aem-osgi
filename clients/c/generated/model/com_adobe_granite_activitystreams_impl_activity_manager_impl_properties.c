#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_activitystreams_impl_activity_manager_impl_properties.h"



static com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_t *com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_create_internal(
    config_node_property_array_t *aggregate_relationships,
    config_node_property_boolean_t *aggregate_descend_virtual
    ) {
    com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_t *com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_local_var = malloc(sizeof(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_t));
    if (!com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_local_var, 0, sizeof(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_t));
    com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_local_var->aggregate_relationships = aggregate_relationships;
    com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_local_var->aggregate_descend_virtual = aggregate_descend_virtual;
    return com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_t *com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_create(
    config_node_property_array_t *aggregate_relationships,
    config_node_property_boolean_t *aggregate_descend_virtual
    ) {
    com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_t *result = com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_create_internal (
        aggregate_relationships,
        aggregate_descend_virtual
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_free(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_t *com_adobe_granite_activitystreams_impl_activity_manager_impl_properties) {
    if(NULL == com_adobe_granite_activitystreams_impl_activity_manager_impl_properties){
        return ;
    }
    if(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_relationships) {
        config_node_property_array_free(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_relationships);
        com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_relationships = NULL;
    }
    if (com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_descend_virtual) {
        config_node_property_boolean_free(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_descend_virtual);
        com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_descend_virtual = NULL;
    }
    free(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties);
}

cJSON *com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_convertToJSON(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_t *com_adobe_granite_activitystreams_impl_activity_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_relationships
    if(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_relationships) {
    cJSON *aggregate_relationships_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_relationships);
    if(aggregate_relationships_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "aggregate.relationships", aggregate_relationships_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_descend_virtual
    if(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_descend_virtual) {
    cJSON *aggregate_descend_virtual_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_descend_virtual);
    if(aggregate_descend_virtual_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "aggregate.descend.virtual", aggregate_descend_virtual_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_t *com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_parseFromJSON(cJSON *com_adobe_granite_activitystreams_impl_activity_manager_impl_propertiesJSON){

    com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_t *com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_relationships
    config_node_property_array_t *aggregate_relationships_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_descend_virtual
    config_node_property_boolean_t *aggregate_descend_virtual_local_nonprim = NULL;

    // com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_relationships
    cJSON *aggregate_relationships = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_activitystreams_impl_activity_manager_impl_propertiesJSON, "aggregate.relationships");
    if (cJSON_IsNull(aggregate_relationships)) {
        aggregate_relationships = NULL;
    }
    if (aggregate_relationships) { 
    aggregate_relationships_local_nonprim = config_node_property_array_parseFromJSON(aggregate_relationships); //nonprimitive
    }

    // com_adobe_granite_activitystreams_impl_activity_manager_impl_properties->aggregate_descend_virtual
    cJSON *aggregate_descend_virtual = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_activitystreams_impl_activity_manager_impl_propertiesJSON, "aggregate.descend.virtual");
    if (cJSON_IsNull(aggregate_descend_virtual)) {
        aggregate_descend_virtual = NULL;
    }
    if (aggregate_descend_virtual) { 
    aggregate_descend_virtual_local_nonprim = config_node_property_boolean_parseFromJSON(aggregate_descend_virtual); //nonprimitive
    }



    com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_local_var = com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_create_internal (
        aggregate_relationships ? aggregate_relationships_local_nonprim : NULL,
        aggregate_descend_virtual ? aggregate_descend_virtual_local_nonprim : NULL
        );

    if (!com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_activitystreams_impl_activity_manager_impl_properties_local_var;
end:
    if (aggregate_relationships_local_nonprim) {
        config_node_property_array_free(aggregate_relationships_local_nonprim);
        aggregate_relationships_local_nonprim = NULL;
    }
    if (aggregate_descend_virtual_local_nonprim) {
        config_node_property_boolean_free(aggregate_descend_virtual_local_nonprim);
        aggregate_descend_virtual_local_nonprim = NULL;
    }
    return NULL;

}
