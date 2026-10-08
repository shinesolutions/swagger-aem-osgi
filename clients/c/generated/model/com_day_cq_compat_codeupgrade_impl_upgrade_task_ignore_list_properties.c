#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties.h"



static com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_t *com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_create_internal(
    config_node_property_array_t *upgrade_task_ignore_list
    ) {
    com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_t *com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_local_var = malloc(sizeof(com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_t));
    if (!com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_local_var, 0, sizeof(com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_t));
    com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_local_var->_library_owned = 1;
    com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_local_var->upgrade_task_ignore_list = upgrade_task_ignore_list;
    return com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_t *com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_create(
    config_node_property_array_t *upgrade_task_ignore_list
    ) {
    com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_t *result = com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_create_internal (
        upgrade_task_ignore_list
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_free(com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_t *com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties) {
    if(NULL == com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties){
        return ;
    }
    if(com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties->upgrade_task_ignore_list) {
        config_node_property_array_free(com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties->upgrade_task_ignore_list);
        com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties->upgrade_task_ignore_list = NULL;
    }
    free(com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties);
}

cJSON *com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_convertToJSON(com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_t *com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties->upgrade_task_ignore_list
    if(com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties->upgrade_task_ignore_list) {
    cJSON *upgrade_task_ignore_list_local_JSON = config_node_property_array_convertToJSON(com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties->upgrade_task_ignore_list);
    if(upgrade_task_ignore_list_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "upgradeTaskIgnoreList", upgrade_task_ignore_list_local_JSON);
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

com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_t *com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_parseFromJSON(cJSON *com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_propertiesJSON){

    com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_t *com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_local_var = NULL;

    // define the local variable for com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties->upgrade_task_ignore_list
    config_node_property_array_t *upgrade_task_ignore_list_local_nonprim = NULL;

    // com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties->upgrade_task_ignore_list
    cJSON *upgrade_task_ignore_list = cJSON_GetObjectItemCaseSensitive(com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_propertiesJSON, "upgradeTaskIgnoreList");
    if (cJSON_IsNull(upgrade_task_ignore_list)) {
        upgrade_task_ignore_list = NULL;
    }
    if (upgrade_task_ignore_list) { 
    upgrade_task_ignore_list_local_nonprim = config_node_property_array_parseFromJSON(upgrade_task_ignore_list); //nonprimitive
    }



    com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_local_var = com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_create_internal (
        upgrade_task_ignore_list ? upgrade_task_ignore_list_local_nonprim : NULL
        );

    if (!com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_local_var) {
        goto end;
    }

    return com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties_local_var;
end:
    if (upgrade_task_ignore_list_local_nonprim) {
        config_node_property_array_free(upgrade_task_ignore_list_local_nonprim);
        upgrade_task_ignore_list_local_nonprim = NULL;
    }
    return NULL;

}
