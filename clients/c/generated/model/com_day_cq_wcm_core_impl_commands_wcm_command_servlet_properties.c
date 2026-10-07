#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties.h"



static com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_t *com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_create_internal(
    config_node_property_array_t *wcmcommandservlet_delete_whitelist
    ) {
    com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_t *com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_t));
    if (!com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_t));
    com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_local_var->wcmcommandservlet_delete_whitelist = wcmcommandservlet_delete_whitelist;
    return com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_t *com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_create(
    config_node_property_array_t *wcmcommandservlet_delete_whitelist
    ) {
    com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_t *result = com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_create_internal (
        wcmcommandservlet_delete_whitelist
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_free(com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_t *com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties) {
    if(NULL == com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties->wcmcommandservlet_delete_whitelist) {
        config_node_property_array_free(com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties->wcmcommandservlet_delete_whitelist);
        com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties->wcmcommandservlet_delete_whitelist = NULL;
    }
    free(com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties);
}

cJSON *com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_convertToJSON(com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_t *com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties->wcmcommandservlet_delete_whitelist
    if(com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties->wcmcommandservlet_delete_whitelist) {
    cJSON *wcmcommandservlet_delete_whitelist_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties->wcmcommandservlet_delete_whitelist);
    if(wcmcommandservlet_delete_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "wcmcommandservlet.delete_whitelist", wcmcommandservlet_delete_whitelist_local_JSON);
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

com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_t *com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_commands_wcm_command_servlet_propertiesJSON){

    com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_t *com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties->wcmcommandservlet_delete_whitelist
    config_node_property_array_t *wcmcommandservlet_delete_whitelist_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties->wcmcommandservlet_delete_whitelist
    cJSON *wcmcommandservlet_delete_whitelist = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_commands_wcm_command_servlet_propertiesJSON, "wcmcommandservlet.delete_whitelist");
    if (cJSON_IsNull(wcmcommandservlet_delete_whitelist)) {
        wcmcommandservlet_delete_whitelist = NULL;
    }
    if (wcmcommandservlet_delete_whitelist) { 
    wcmcommandservlet_delete_whitelist_local_nonprim = config_node_property_array_parseFromJSON(wcmcommandservlet_delete_whitelist); //nonprimitive
    }



    com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_local_var = com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_create_internal (
        wcmcommandservlet_delete_whitelist ? wcmcommandservlet_delete_whitelist_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties_local_var;
end:
    if (wcmcommandservlet_delete_whitelist_local_nonprim) {
        config_node_property_array_free(wcmcommandservlet_delete_whitelist_local_nonprim);
        wcmcommandservlet_delete_whitelist_local_nonprim = NULL;
    }
    return NULL;

}
