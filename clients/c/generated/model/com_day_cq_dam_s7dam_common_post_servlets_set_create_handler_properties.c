#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties.h"



static com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_t *com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_create_internal(
    config_node_property_string_t *sling_post_operation,
    config_node_property_string_t *sling_servlet_methods
    ) {
    com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_t *com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_local_var = malloc(sizeof(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_t));
    if (!com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_local_var, 0, sizeof(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_t));
    com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_local_var->_library_owned = 1;
    com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_local_var->sling_post_operation = sling_post_operation;
    com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_local_var->sling_servlet_methods = sling_servlet_methods;
    return com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_t *com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_create(
    config_node_property_string_t *sling_post_operation,
    config_node_property_string_t *sling_servlet_methods
    ) {
    com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_t *result = com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_create_internal (
        sling_post_operation,
        sling_servlet_methods
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_free(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_t *com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties) {
    if(NULL == com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties){
        return ;
    }
    if(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_post_operation) {
        config_node_property_string_free(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_post_operation);
        com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_post_operation = NULL;
    }
    if (com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_servlet_methods) {
        config_node_property_string_free(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_servlet_methods);
        com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_servlet_methods = NULL;
    }
    free(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties);
}

cJSON *com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_convertToJSON(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_t *com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_post_operation
    if(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_post_operation) {
    cJSON *sling_post_operation_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_post_operation);
    if(sling_post_operation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.post.operation", sling_post_operation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_servlet_methods
    if(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_servlet_methods) {
    cJSON *sling_servlet_methods_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_servlet_methods);
    if(sling_servlet_methods_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.methods", sling_servlet_methods_local_JSON);
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

com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_t *com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_parseFromJSON(cJSON *com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_propertiesJSON){

    com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_t *com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_post_operation
    config_node_property_string_t *sling_post_operation_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_servlet_methods
    config_node_property_string_t *sling_servlet_methods_local_nonprim = NULL;

    // com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_post_operation
    cJSON *sling_post_operation = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_propertiesJSON, "sling.post.operation");
    if (cJSON_IsNull(sling_post_operation)) {
        sling_post_operation = NULL;
    }
    if (sling_post_operation) { 
    sling_post_operation_local_nonprim = config_node_property_string_parseFromJSON(sling_post_operation); //nonprimitive
    }

    // com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties->sling_servlet_methods
    cJSON *sling_servlet_methods = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_propertiesJSON, "sling.servlet.methods");
    if (cJSON_IsNull(sling_servlet_methods)) {
        sling_servlet_methods = NULL;
    }
    if (sling_servlet_methods) { 
    sling_servlet_methods_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_methods); //nonprimitive
    }



    com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_local_var = com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_create_internal (
        sling_post_operation ? sling_post_operation_local_nonprim : NULL,
        sling_servlet_methods ? sling_servlet_methods_local_nonprim : NULL
        );

    if (!com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties_local_var;
end:
    if (sling_post_operation_local_nonprim) {
        config_node_property_string_free(sling_post_operation_local_nonprim);
        sling_post_operation_local_nonprim = NULL;
    }
    if (sling_servlet_methods_local_nonprim) {
        config_node_property_string_free(sling_servlet_methods_local_nonprim);
        sling_servlet_methods_local_nonprim = NULL;
    }
    return NULL;

}
