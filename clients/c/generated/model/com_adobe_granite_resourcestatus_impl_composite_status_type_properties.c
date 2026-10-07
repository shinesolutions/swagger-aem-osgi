#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_resourcestatus_impl_composite_status_type_properties.h"



static com_adobe_granite_resourcestatus_impl_composite_status_type_properties_t *com_adobe_granite_resourcestatus_impl_composite_status_type_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_array_t *types
    ) {
    com_adobe_granite_resourcestatus_impl_composite_status_type_properties_t *com_adobe_granite_resourcestatus_impl_composite_status_type_properties_local_var = malloc(sizeof(com_adobe_granite_resourcestatus_impl_composite_status_type_properties_t));
    if (!com_adobe_granite_resourcestatus_impl_composite_status_type_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_resourcestatus_impl_composite_status_type_properties_local_var, 0, sizeof(com_adobe_granite_resourcestatus_impl_composite_status_type_properties_t));
    com_adobe_granite_resourcestatus_impl_composite_status_type_properties_local_var->_library_owned = 1;
    com_adobe_granite_resourcestatus_impl_composite_status_type_properties_local_var->name = name;
    com_adobe_granite_resourcestatus_impl_composite_status_type_properties_local_var->types = types;
    return com_adobe_granite_resourcestatus_impl_composite_status_type_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_resourcestatus_impl_composite_status_type_properties_t *com_adobe_granite_resourcestatus_impl_composite_status_type_properties_create(
    config_node_property_string_t *name,
    config_node_property_array_t *types
    ) {
    com_adobe_granite_resourcestatus_impl_composite_status_type_properties_t *result = com_adobe_granite_resourcestatus_impl_composite_status_type_properties_create_internal (
        name,
        types
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_resourcestatus_impl_composite_status_type_properties_free(com_adobe_granite_resourcestatus_impl_composite_status_type_properties_t *com_adobe_granite_resourcestatus_impl_composite_status_type_properties) {
    if(NULL == com_adobe_granite_resourcestatus_impl_composite_status_type_properties){
        return ;
    }
    if(com_adobe_granite_resourcestatus_impl_composite_status_type_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_resourcestatus_impl_composite_status_type_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_resourcestatus_impl_composite_status_type_properties->name) {
        config_node_property_string_free(com_adobe_granite_resourcestatus_impl_composite_status_type_properties->name);
        com_adobe_granite_resourcestatus_impl_composite_status_type_properties->name = NULL;
    }
    if (com_adobe_granite_resourcestatus_impl_composite_status_type_properties->types) {
        config_node_property_array_free(com_adobe_granite_resourcestatus_impl_composite_status_type_properties->types);
        com_adobe_granite_resourcestatus_impl_composite_status_type_properties->types = NULL;
    }
    free(com_adobe_granite_resourcestatus_impl_composite_status_type_properties);
}

cJSON *com_adobe_granite_resourcestatus_impl_composite_status_type_properties_convertToJSON(com_adobe_granite_resourcestatus_impl_composite_status_type_properties_t *com_adobe_granite_resourcestatus_impl_composite_status_type_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_resourcestatus_impl_composite_status_type_properties->name
    if(com_adobe_granite_resourcestatus_impl_composite_status_type_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_resourcestatus_impl_composite_status_type_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_resourcestatus_impl_composite_status_type_properties->types
    if(com_adobe_granite_resourcestatus_impl_composite_status_type_properties->types) {
    cJSON *types_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_resourcestatus_impl_composite_status_type_properties->types);
    if(types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "types", types_local_JSON);
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

com_adobe_granite_resourcestatus_impl_composite_status_type_properties_t *com_adobe_granite_resourcestatus_impl_composite_status_type_properties_parseFromJSON(cJSON *com_adobe_granite_resourcestatus_impl_composite_status_type_propertiesJSON){

    com_adobe_granite_resourcestatus_impl_composite_status_type_properties_t *com_adobe_granite_resourcestatus_impl_composite_status_type_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_resourcestatus_impl_composite_status_type_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_resourcestatus_impl_composite_status_type_properties->types
    config_node_property_array_t *types_local_nonprim = NULL;

    // com_adobe_granite_resourcestatus_impl_composite_status_type_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_resourcestatus_impl_composite_status_type_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // com_adobe_granite_resourcestatus_impl_composite_status_type_properties->types
    cJSON *types = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_resourcestatus_impl_composite_status_type_propertiesJSON, "types");
    if (cJSON_IsNull(types)) {
        types = NULL;
    }
    if (types) { 
    types_local_nonprim = config_node_property_array_parseFromJSON(types); //nonprimitive
    }



    com_adobe_granite_resourcestatus_impl_composite_status_type_properties_local_var = com_adobe_granite_resourcestatus_impl_composite_status_type_properties_create_internal (
        name ? name_local_nonprim : NULL,
        types ? types_local_nonprim : NULL
        );

    if (!com_adobe_granite_resourcestatus_impl_composite_status_type_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_resourcestatus_impl_composite_status_type_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (types_local_nonprim) {
        config_node_property_array_free(types_local_nonprim);
        types_local_nonprim = NULL;
    }
    return NULL;

}
