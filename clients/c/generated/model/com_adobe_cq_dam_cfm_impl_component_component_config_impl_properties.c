#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties.h"



static com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_create_internal(
    config_node_property_string_t *dam_cfm_component_resource_type,
    config_node_property_string_t *dam_cfm_component_file_reference_prop,
    config_node_property_string_t *dam_cfm_component_elements_prop,
    config_node_property_string_t *dam_cfm_component_variation_prop
    ) {
    com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var = malloc(sizeof(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t));
    if (!com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var, 0, sizeof(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t));
    com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var->dam_cfm_component_resource_type = dam_cfm_component_resource_type;
    com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var->dam_cfm_component_file_reference_prop = dam_cfm_component_file_reference_prop;
    com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var->dam_cfm_component_elements_prop = dam_cfm_component_elements_prop;
    com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var->dam_cfm_component_variation_prop = dam_cfm_component_variation_prop;
    return com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_create(
    config_node_property_string_t *dam_cfm_component_resource_type,
    config_node_property_string_t *dam_cfm_component_file_reference_prop,
    config_node_property_string_t *dam_cfm_component_elements_prop,
    config_node_property_string_t *dam_cfm_component_variation_prop
    ) {
    com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t *result = com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_create_internal (
        dam_cfm_component_resource_type,
        dam_cfm_component_file_reference_prop,
        dam_cfm_component_elements_prop,
        dam_cfm_component_variation_prop
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_free(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties) {
    if(NULL == com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties){
        return ;
    }
    if(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_resource_type) {
        config_node_property_string_free(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_resource_type);
        com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_resource_type = NULL;
    }
    if (com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_file_reference_prop) {
        config_node_property_string_free(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_file_reference_prop);
        com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_file_reference_prop = NULL;
    }
    if (com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_elements_prop) {
        config_node_property_string_free(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_elements_prop);
        com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_elements_prop = NULL;
    }
    if (com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_variation_prop) {
        config_node_property_string_free(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_variation_prop);
        com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_variation_prop = NULL;
    }
    free(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties);
}

cJSON *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_convertToJSON(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_resource_type
    if(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_resource_type) {
    cJSON *dam_cfm_component_resource_type_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_resource_type);
    if(dam_cfm_component_resource_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dam.cfm.component.resourceType", dam_cfm_component_resource_type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_file_reference_prop
    if(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_file_reference_prop) {
    cJSON *dam_cfm_component_file_reference_prop_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_file_reference_prop);
    if(dam_cfm_component_file_reference_prop_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dam.cfm.component.fileReferenceProp", dam_cfm_component_file_reference_prop_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_elements_prop
    if(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_elements_prop) {
    cJSON *dam_cfm_component_elements_prop_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_elements_prop);
    if(dam_cfm_component_elements_prop_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dam.cfm.component.elementsProp", dam_cfm_component_elements_prop_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_variation_prop
    if(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_variation_prop) {
    cJSON *dam_cfm_component_variation_prop_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_variation_prop);
    if(dam_cfm_component_variation_prop_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dam.cfm.component.variationProp", dam_cfm_component_variation_prop_local_JSON);
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

com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_parseFromJSON(cJSON *com_adobe_cq_dam_cfm_impl_component_component_config_impl_propertiesJSON){

    com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_resource_type
    config_node_property_string_t *dam_cfm_component_resource_type_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_file_reference_prop
    config_node_property_string_t *dam_cfm_component_file_reference_prop_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_elements_prop
    config_node_property_string_t *dam_cfm_component_elements_prop_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_variation_prop
    config_node_property_string_t *dam_cfm_component_variation_prop_local_nonprim = NULL;

    // com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_resource_type
    cJSON *dam_cfm_component_resource_type = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_cfm_impl_component_component_config_impl_propertiesJSON, "dam.cfm.component.resourceType");
    if (cJSON_IsNull(dam_cfm_component_resource_type)) {
        dam_cfm_component_resource_type = NULL;
    }
    if (dam_cfm_component_resource_type) { 
    dam_cfm_component_resource_type_local_nonprim = config_node_property_string_parseFromJSON(dam_cfm_component_resource_type); //nonprimitive
    }

    // com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_file_reference_prop
    cJSON *dam_cfm_component_file_reference_prop = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_cfm_impl_component_component_config_impl_propertiesJSON, "dam.cfm.component.fileReferenceProp");
    if (cJSON_IsNull(dam_cfm_component_file_reference_prop)) {
        dam_cfm_component_file_reference_prop = NULL;
    }
    if (dam_cfm_component_file_reference_prop) { 
    dam_cfm_component_file_reference_prop_local_nonprim = config_node_property_string_parseFromJSON(dam_cfm_component_file_reference_prop); //nonprimitive
    }

    // com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_elements_prop
    cJSON *dam_cfm_component_elements_prop = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_cfm_impl_component_component_config_impl_propertiesJSON, "dam.cfm.component.elementsProp");
    if (cJSON_IsNull(dam_cfm_component_elements_prop)) {
        dam_cfm_component_elements_prop = NULL;
    }
    if (dam_cfm_component_elements_prop) { 
    dam_cfm_component_elements_prop_local_nonprim = config_node_property_string_parseFromJSON(dam_cfm_component_elements_prop); //nonprimitive
    }

    // com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties->dam_cfm_component_variation_prop
    cJSON *dam_cfm_component_variation_prop = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_cfm_impl_component_component_config_impl_propertiesJSON, "dam.cfm.component.variationProp");
    if (cJSON_IsNull(dam_cfm_component_variation_prop)) {
        dam_cfm_component_variation_prop = NULL;
    }
    if (dam_cfm_component_variation_prop) { 
    dam_cfm_component_variation_prop_local_nonprim = config_node_property_string_parseFromJSON(dam_cfm_component_variation_prop); //nonprimitive
    }



    com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var = com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_create_internal (
        dam_cfm_component_resource_type ? dam_cfm_component_resource_type_local_nonprim : NULL,
        dam_cfm_component_file_reference_prop ? dam_cfm_component_file_reference_prop_local_nonprim : NULL,
        dam_cfm_component_elements_prop ? dam_cfm_component_elements_prop_local_nonprim : NULL,
        dam_cfm_component_variation_prop ? dam_cfm_component_variation_prop_local_nonprim : NULL
        );

    if (!com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_local_var;
end:
    if (dam_cfm_component_resource_type_local_nonprim) {
        config_node_property_string_free(dam_cfm_component_resource_type_local_nonprim);
        dam_cfm_component_resource_type_local_nonprim = NULL;
    }
    if (dam_cfm_component_file_reference_prop_local_nonprim) {
        config_node_property_string_free(dam_cfm_component_file_reference_prop_local_nonprim);
        dam_cfm_component_file_reference_prop_local_nonprim = NULL;
    }
    if (dam_cfm_component_elements_prop_local_nonprim) {
        config_node_property_string_free(dam_cfm_component_elements_prop_local_nonprim);
        dam_cfm_component_elements_prop_local_nonprim = NULL;
    }
    if (dam_cfm_component_variation_prop_local_nonprim) {
        config_node_property_string_free(dam_cfm_component_variation_prop_local_nonprim);
        dam_cfm_component_variation_prop_local_nonprim = NULL;
    }
    return NULL;

}
