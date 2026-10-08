#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties.h"



static com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_t *com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_create_internal(
    config_node_property_array_t *dtm_staging_ip_whitelist,
    config_node_property_array_t *dtm_production_ip_whitelist
    ) {
    com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_t *com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_local_var = malloc(sizeof(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_t));
    if (!com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_local_var, 0, sizeof(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_t));
    com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_local_var->_library_owned = 1;
    com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_local_var->dtm_staging_ip_whitelist = dtm_staging_ip_whitelist;
    com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_local_var->dtm_production_ip_whitelist = dtm_production_ip_whitelist;
    return com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_t *com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_create(
    config_node_property_array_t *dtm_staging_ip_whitelist,
    config_node_property_array_t *dtm_production_ip_whitelist
    ) {
    com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_t *result = com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_create_internal (
        dtm_staging_ip_whitelist,
        dtm_production_ip_whitelist
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_free(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_t *com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties) {
    if(NULL == com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties){
        return ;
    }
    if(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_staging_ip_whitelist) {
        config_node_property_array_free(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_staging_ip_whitelist);
        com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_staging_ip_whitelist = NULL;
    }
    if (com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_production_ip_whitelist) {
        config_node_property_array_free(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_production_ip_whitelist);
        com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_production_ip_whitelist = NULL;
    }
    free(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties);
}

cJSON *com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_convertToJSON(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_t *com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_staging_ip_whitelist
    if(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_staging_ip_whitelist) {
    cJSON *dtm_staging_ip_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_staging_ip_whitelist);
    if(dtm_staging_ip_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dtm.staging.ip.whitelist", dtm_staging_ip_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_production_ip_whitelist
    if(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_production_ip_whitelist) {
    cJSON *dtm_production_ip_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_production_ip_whitelist);
    if(dtm_production_ip_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dtm.production.ip.whitelist", dtm_production_ip_whitelist_local_JSON);
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

com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_t *com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_parseFromJSON(cJSON *com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_propertiesJSON){

    com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_t *com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_staging_ip_whitelist
    config_node_property_array_t *dtm_staging_ip_whitelist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_production_ip_whitelist
    config_node_property_array_t *dtm_production_ip_whitelist_local_nonprim = NULL;

    // com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_staging_ip_whitelist
    cJSON *dtm_staging_ip_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_propertiesJSON, "dtm.staging.ip.whitelist");
    if (cJSON_IsNull(dtm_staging_ip_whitelist)) {
        dtm_staging_ip_whitelist = NULL;
    }
    if (dtm_staging_ip_whitelist) { 
    dtm_staging_ip_whitelist_local_nonprim = config_node_property_array_parseFromJSON(dtm_staging_ip_whitelist); //nonprimitive
    }

    // com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties->dtm_production_ip_whitelist
    cJSON *dtm_production_ip_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_propertiesJSON, "dtm.production.ip.whitelist");
    if (cJSON_IsNull(dtm_production_ip_whitelist)) {
        dtm_production_ip_whitelist = NULL;
    }
    if (dtm_production_ip_whitelist) { 
    dtm_production_ip_whitelist_local_nonprim = config_node_property_array_parseFromJSON(dtm_production_ip_whitelist); //nonprimitive
    }



    com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_local_var = com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_create_internal (
        dtm_staging_ip_whitelist ? dtm_staging_ip_whitelist_local_nonprim : NULL,
        dtm_production_ip_whitelist ? dtm_production_ip_whitelist_local_nonprim : NULL
        );

    if (!com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties_local_var;
end:
    if (dtm_staging_ip_whitelist_local_nonprim) {
        config_node_property_array_free(dtm_staging_ip_whitelist_local_nonprim);
        dtm_staging_ip_whitelist_local_nonprim = NULL;
    }
    if (dtm_production_ip_whitelist_local_nonprim) {
        config_node_property_array_free(dtm_production_ip_whitelist_local_nonprim);
        dtm_production_ip_whitelist_local_nonprim = NULL;
    }
    return NULL;

}
