#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties.h"



static com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_create_internal(
    config_node_property_array_t *dam_cfm_resource_types,
    config_node_property_array_t *dam_cfm_reference_properties
    ) {
    com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_local_var = malloc(sizeof(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t));
    if (!com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_local_var, 0, sizeof(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t));
    com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_local_var->dam_cfm_resource_types = dam_cfm_resource_types;
    com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_local_var->dam_cfm_reference_properties = dam_cfm_reference_properties;
    return com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_create(
    config_node_property_array_t *dam_cfm_resource_types,
    config_node_property_array_t *dam_cfm_reference_properties
    ) {
    com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t *result = com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_create_internal (
        dam_cfm_resource_types,
        dam_cfm_reference_properties
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_free(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties) {
    if(NULL == com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties){
        return ;
    }
    if(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_resource_types) {
        config_node_property_array_free(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_resource_types);
        com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_resource_types = NULL;
    }
    if (com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_reference_properties) {
        config_node_property_array_free(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_reference_properties);
        com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_reference_properties = NULL;
    }
    free(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties);
}

cJSON *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_convertToJSON(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_resource_types
    if(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_resource_types) {
    cJSON *dam_cfm_resource_types_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_resource_types);
    if(dam_cfm_resource_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dam.cfm.resourceTypes", dam_cfm_resource_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_reference_properties
    if(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_reference_properties) {
    cJSON *dam_cfm_reference_properties_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_reference_properties);
    if(dam_cfm_reference_properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dam.cfm.referenceProperties", dam_cfm_reference_properties_local_JSON);
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

com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_parseFromJSON(cJSON *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_propertiesJSON){

    com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_resource_types
    config_node_property_array_t *dam_cfm_resource_types_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_reference_properties
    config_node_property_array_t *dam_cfm_reference_properties_local_nonprim = NULL;

    // com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_resource_types
    cJSON *dam_cfm_resource_types = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_propertiesJSON, "dam.cfm.resourceTypes");
    if (cJSON_IsNull(dam_cfm_resource_types)) {
        dam_cfm_resource_types = NULL;
    }
    if (dam_cfm_resource_types) { 
    dam_cfm_resource_types_local_nonprim = config_node_property_array_parseFromJSON(dam_cfm_resource_types); //nonprimitive
    }

    // com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties->dam_cfm_reference_properties
    cJSON *dam_cfm_reference_properties = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_propertiesJSON, "dam.cfm.referenceProperties");
    if (cJSON_IsNull(dam_cfm_reference_properties)) {
        dam_cfm_reference_properties = NULL;
    }
    if (dam_cfm_reference_properties) { 
    dam_cfm_reference_properties_local_nonprim = config_node_property_array_parseFromJSON(dam_cfm_reference_properties); //nonprimitive
    }



    com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_local_var = com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_create_internal (
        dam_cfm_resource_types ? dam_cfm_resource_types_local_nonprim : NULL,
        dam_cfm_reference_properties ? dam_cfm_reference_properties_local_nonprim : NULL
        );

    if (!com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_local_var;
end:
    if (dam_cfm_resource_types_local_nonprim) {
        config_node_property_array_free(dam_cfm_resource_types_local_nonprim);
        dam_cfm_resource_types_local_nonprim = NULL;
    }
    if (dam_cfm_reference_properties_local_nonprim) {
        config_node_property_array_free(dam_cfm_reference_properties_local_nonprim);
        dam_cfm_reference_properties_local_nonprim = NULL;
    }
    return NULL;

}
