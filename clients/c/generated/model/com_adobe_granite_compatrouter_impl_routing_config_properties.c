#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_compatrouter_impl_routing_config_properties.h"



static com_adobe_granite_compatrouter_impl_routing_config_properties_t *com_adobe_granite_compatrouter_impl_routing_config_properties_create_internal(
    config_node_property_string_t *id,
    config_node_property_string_t *compat_path,
    config_node_property_string_t *new_path
    ) {
    com_adobe_granite_compatrouter_impl_routing_config_properties_t *com_adobe_granite_compatrouter_impl_routing_config_properties_local_var = malloc(sizeof(com_adobe_granite_compatrouter_impl_routing_config_properties_t));
    if (!com_adobe_granite_compatrouter_impl_routing_config_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_compatrouter_impl_routing_config_properties_local_var, 0, sizeof(com_adobe_granite_compatrouter_impl_routing_config_properties_t));
    com_adobe_granite_compatrouter_impl_routing_config_properties_local_var->_library_owned = 1;
    com_adobe_granite_compatrouter_impl_routing_config_properties_local_var->id = id;
    com_adobe_granite_compatrouter_impl_routing_config_properties_local_var->compat_path = compat_path;
    com_adobe_granite_compatrouter_impl_routing_config_properties_local_var->new_path = new_path;
    return com_adobe_granite_compatrouter_impl_routing_config_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_compatrouter_impl_routing_config_properties_t *com_adobe_granite_compatrouter_impl_routing_config_properties_create(
    config_node_property_string_t *id,
    config_node_property_string_t *compat_path,
    config_node_property_string_t *new_path
    ) {
    com_adobe_granite_compatrouter_impl_routing_config_properties_t *result = com_adobe_granite_compatrouter_impl_routing_config_properties_create_internal (
        id,
        compat_path,
        new_path
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_compatrouter_impl_routing_config_properties_free(com_adobe_granite_compatrouter_impl_routing_config_properties_t *com_adobe_granite_compatrouter_impl_routing_config_properties) {
    if(NULL == com_adobe_granite_compatrouter_impl_routing_config_properties){
        return ;
    }
    if(com_adobe_granite_compatrouter_impl_routing_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_compatrouter_impl_routing_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_compatrouter_impl_routing_config_properties->id) {
        config_node_property_string_free(com_adobe_granite_compatrouter_impl_routing_config_properties->id);
        com_adobe_granite_compatrouter_impl_routing_config_properties->id = NULL;
    }
    if (com_adobe_granite_compatrouter_impl_routing_config_properties->compat_path) {
        config_node_property_string_free(com_adobe_granite_compatrouter_impl_routing_config_properties->compat_path);
        com_adobe_granite_compatrouter_impl_routing_config_properties->compat_path = NULL;
    }
    if (com_adobe_granite_compatrouter_impl_routing_config_properties->new_path) {
        config_node_property_string_free(com_adobe_granite_compatrouter_impl_routing_config_properties->new_path);
        com_adobe_granite_compatrouter_impl_routing_config_properties->new_path = NULL;
    }
    free(com_adobe_granite_compatrouter_impl_routing_config_properties);
}

cJSON *com_adobe_granite_compatrouter_impl_routing_config_properties_convertToJSON(com_adobe_granite_compatrouter_impl_routing_config_properties_t *com_adobe_granite_compatrouter_impl_routing_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_compatrouter_impl_routing_config_properties->id
    if(com_adobe_granite_compatrouter_impl_routing_config_properties->id) {
    cJSON *id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_compatrouter_impl_routing_config_properties->id);
    if(id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "id", id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_compatrouter_impl_routing_config_properties->compat_path
    if(com_adobe_granite_compatrouter_impl_routing_config_properties->compat_path) {
    cJSON *compat_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_compatrouter_impl_routing_config_properties->compat_path);
    if(compat_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "compatPath", compat_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_compatrouter_impl_routing_config_properties->new_path
    if(com_adobe_granite_compatrouter_impl_routing_config_properties->new_path) {
    cJSON *new_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_compatrouter_impl_routing_config_properties->new_path);
    if(new_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "newPath", new_path_local_JSON);
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

com_adobe_granite_compatrouter_impl_routing_config_properties_t *com_adobe_granite_compatrouter_impl_routing_config_properties_parseFromJSON(cJSON *com_adobe_granite_compatrouter_impl_routing_config_propertiesJSON){

    com_adobe_granite_compatrouter_impl_routing_config_properties_t *com_adobe_granite_compatrouter_impl_routing_config_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_compatrouter_impl_routing_config_properties->id
    config_node_property_string_t *id_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_compatrouter_impl_routing_config_properties->compat_path
    config_node_property_string_t *compat_path_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_compatrouter_impl_routing_config_properties->new_path
    config_node_property_string_t *new_path_local_nonprim = NULL;

    // com_adobe_granite_compatrouter_impl_routing_config_properties->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_compatrouter_impl_routing_config_propertiesJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    id_local_nonprim = config_node_property_string_parseFromJSON(id); //nonprimitive
    }

    // com_adobe_granite_compatrouter_impl_routing_config_properties->compat_path
    cJSON *compat_path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_compatrouter_impl_routing_config_propertiesJSON, "compatPath");
    if (cJSON_IsNull(compat_path)) {
        compat_path = NULL;
    }
    if (compat_path) { 
    compat_path_local_nonprim = config_node_property_string_parseFromJSON(compat_path); //nonprimitive
    }

    // com_adobe_granite_compatrouter_impl_routing_config_properties->new_path
    cJSON *new_path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_compatrouter_impl_routing_config_propertiesJSON, "newPath");
    if (cJSON_IsNull(new_path)) {
        new_path = NULL;
    }
    if (new_path) { 
    new_path_local_nonprim = config_node_property_string_parseFromJSON(new_path); //nonprimitive
    }



    com_adobe_granite_compatrouter_impl_routing_config_properties_local_var = com_adobe_granite_compatrouter_impl_routing_config_properties_create_internal (
        id ? id_local_nonprim : NULL,
        compat_path ? compat_path_local_nonprim : NULL,
        new_path ? new_path_local_nonprim : NULL
        );

    if (!com_adobe_granite_compatrouter_impl_routing_config_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_compatrouter_impl_routing_config_properties_local_var;
end:
    if (id_local_nonprim) {
        config_node_property_string_free(id_local_nonprim);
        id_local_nonprim = NULL;
    }
    if (compat_path_local_nonprim) {
        config_node_property_string_free(compat_path_local_nonprim);
        compat_path_local_nonprim = NULL;
    }
    if (new_path_local_nonprim) {
        config_node_property_string_free(new_path_local_nonprim);
        new_path_local_nonprim = NULL;
    }
    return NULL;

}
