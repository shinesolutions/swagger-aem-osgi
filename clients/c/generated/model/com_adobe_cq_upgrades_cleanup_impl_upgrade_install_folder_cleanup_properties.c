#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties.h"



static com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_create_internal(
    config_node_property_array_t *delete_name_regexps
    ) {
    com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_local_var = malloc(sizeof(com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_t));
    if (!com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_local_var, 0, sizeof(com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_t));
    com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_local_var->_library_owned = 1;
    com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_local_var->delete_name_regexps = delete_name_regexps;
    return com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_create(
    config_node_property_array_t *delete_name_regexps
    ) {
    com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_t *result = com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_create_internal (
        delete_name_regexps
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_free(com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties) {
    if(NULL == com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties){
        return ;
    }
    if(com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties->delete_name_regexps) {
        config_node_property_array_free(com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties->delete_name_regexps);
        com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties->delete_name_regexps = NULL;
    }
    free(com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties);
}

cJSON *com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_convertToJSON(com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties->delete_name_regexps
    if(com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties->delete_name_regexps) {
    cJSON *delete_name_regexps_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties->delete_name_regexps);
    if(delete_name_regexps_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "delete.name.regexps", delete_name_regexps_local_JSON);
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

com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_parseFromJSON(cJSON *com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_propertiesJSON){

    com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties->delete_name_regexps
    config_node_property_array_t *delete_name_regexps_local_nonprim = NULL;

    // com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties->delete_name_regexps
    cJSON *delete_name_regexps = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_propertiesJSON, "delete.name.regexps");
    if (cJSON_IsNull(delete_name_regexps)) {
        delete_name_regexps = NULL;
    }
    if (delete_name_regexps) { 
    delete_name_regexps_local_nonprim = config_node_property_array_parseFromJSON(delete_name_regexps); //nonprimitive
    }



    com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_local_var = com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_create_internal (
        delete_name_regexps ? delete_name_regexps_local_nonprim : NULL
        );

    if (!com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties_local_var;
end:
    if (delete_name_regexps_local_nonprim) {
        config_node_property_array_free(delete_name_regexps_local_nonprim);
        delete_name_regexps_local_nonprim = NULL;
    }
    return NULL;

}
