#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties.h"



static com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_t *com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_create_internal(
    config_node_property_string_t *hc_name,
    config_node_property_array_t *hc_tags,
    config_node_property_string_t *hc_mbean_name
    ) {
    com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_t *com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_local_var = malloc(sizeof(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_t));
    if (!com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_local_var, 0, sizeof(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_t));
    com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_local_var->_library_owned = 1;
    com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_local_var->hc_name = hc_name;
    com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_local_var->hc_tags = hc_tags;
    com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_local_var->hc_mbean_name = hc_mbean_name;
    return com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_local_var;
}

__attribute__((deprecated)) com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_t *com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_create(
    config_node_property_string_t *hc_name,
    config_node_property_array_t *hc_tags,
    config_node_property_string_t *hc_mbean_name
    ) {
    com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_t *result = com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_create_internal (
        hc_name,
        hc_tags,
        hc_mbean_name
        );
    if (!result) {
    }
    return result;
}

void com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_free(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_t *com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties) {
    if(NULL == com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties){
        return ;
    }
    if(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_name) {
        config_node_property_string_free(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_name);
        com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_name = NULL;
    }
    if (com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_tags) {
        config_node_property_array_free(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_tags);
        com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_tags = NULL;
    }
    if (com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_mbean_name) {
        config_node_property_string_free(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_mbean_name);
        com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_mbean_name = NULL;
    }
    free(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties);
}

cJSON *com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_convertToJSON(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_t *com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_name
    if(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_name) {
    cJSON *hc_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_name);
    if(hc_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.name", hc_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_tags
    if(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_tags) {
    cJSON *hc_tags_local_JSON = config_node_property_array_convertToJSON(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_tags);
    if(hc_tags_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.tags", hc_tags_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_mbean_name
    if(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_mbean_name) {
    cJSON *hc_mbean_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_mbean_name);
    if(hc_mbean_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.mbean.name", hc_mbean_name_local_JSON);
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

com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_t *com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_parseFromJSON(cJSON *com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_propertiesJSON){

    com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_t *com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_local_var = NULL;

    // define the local variable for com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_name
    config_node_property_string_t *hc_name_local_nonprim = NULL;

    // define the local variable for com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_tags
    config_node_property_array_t *hc_tags_local_nonprim = NULL;

    // define the local variable for com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_mbean_name
    config_node_property_string_t *hc_mbean_name_local_nonprim = NULL;

    // com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_name
    cJSON *hc_name = cJSON_GetObjectItemCaseSensitive(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_propertiesJSON, "hc.name");
    if (cJSON_IsNull(hc_name)) {
        hc_name = NULL;
    }
    if (hc_name) { 
    hc_name_local_nonprim = config_node_property_string_parseFromJSON(hc_name); //nonprimitive
    }

    // com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_tags
    cJSON *hc_tags = cJSON_GetObjectItemCaseSensitive(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_propertiesJSON, "hc.tags");
    if (cJSON_IsNull(hc_tags)) {
        hc_tags = NULL;
    }
    if (hc_tags) { 
    hc_tags_local_nonprim = config_node_property_array_parseFromJSON(hc_tags); //nonprimitive
    }

    // com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties->hc_mbean_name
    cJSON *hc_mbean_name = cJSON_GetObjectItemCaseSensitive(com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_propertiesJSON, "hc.mbean.name");
    if (cJSON_IsNull(hc_mbean_name)) {
        hc_mbean_name = NULL;
    }
    if (hc_mbean_name) { 
    hc_mbean_name_local_nonprim = config_node_property_string_parseFromJSON(hc_mbean_name); //nonprimitive
    }



    com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_local_var = com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_create_internal (
        hc_name ? hc_name_local_nonprim : NULL,
        hc_tags ? hc_tags_local_nonprim : NULL,
        hc_mbean_name ? hc_mbean_name_local_nonprim : NULL
        );

    if (!com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_local_var) {
        goto end;
    }

    return com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties_local_var;
end:
    if (hc_name_local_nonprim) {
        config_node_property_string_free(hc_name_local_nonprim);
        hc_name_local_nonprim = NULL;
    }
    if (hc_tags_local_nonprim) {
        config_node_property_array_free(hc_tags_local_nonprim);
        hc_tags_local_nonprim = NULL;
    }
    if (hc_mbean_name_local_nonprim) {
        config_node_property_string_free(hc_mbean_name_local_nonprim);
        hc_mbean_name_local_nonprim = NULL;
    }
    return NULL;

}
