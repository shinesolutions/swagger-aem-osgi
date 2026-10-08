#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties.h"



static com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_t *com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_create_internal(
    config_node_property_boolean_t *cq_dam_webdav_version_linking_enable,
    config_node_property_integer_t *cq_dam_webdav_version_linking_scheduler_period,
    config_node_property_integer_t *cq_dam_webdav_version_linking_staging_timeout
    ) {
    com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_t *com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_local_var = malloc(sizeof(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_t));
    if (!com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_local_var, 0, sizeof(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_t));
    com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_local_var->_library_owned = 1;
    com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_local_var->cq_dam_webdav_version_linking_enable = cq_dam_webdav_version_linking_enable;
    com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_local_var->cq_dam_webdav_version_linking_scheduler_period = cq_dam_webdav_version_linking_scheduler_period;
    com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_local_var->cq_dam_webdav_version_linking_staging_timeout = cq_dam_webdav_version_linking_staging_timeout;
    return com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_t *com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_create(
    config_node_property_boolean_t *cq_dam_webdav_version_linking_enable,
    config_node_property_integer_t *cq_dam_webdav_version_linking_scheduler_period,
    config_node_property_integer_t *cq_dam_webdav_version_linking_staging_timeout
    ) {
    com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_t *result = com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_create_internal (
        cq_dam_webdav_version_linking_enable,
        cq_dam_webdav_version_linking_scheduler_period,
        cq_dam_webdav_version_linking_staging_timeout
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_free(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_t *com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties) {
    if(NULL == com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties){
        return ;
    }
    if(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_enable) {
        config_node_property_boolean_free(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_enable);
        com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_enable = NULL;
    }
    if (com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_scheduler_period) {
        config_node_property_integer_free(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_scheduler_period);
        com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_scheduler_period = NULL;
    }
    if (com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_staging_timeout) {
        config_node_property_integer_free(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_staging_timeout);
        com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_staging_timeout = NULL;
    }
    free(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties);
}

cJSON *com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_convertToJSON(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_t *com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_enable
    if(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_enable) {
    cJSON *cq_dam_webdav_version_linking_enable_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_enable);
    if(cq_dam_webdav_version_linking_enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.webdav.version.linking.enable", cq_dam_webdav_version_linking_enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_scheduler_period
    if(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_scheduler_period) {
    cJSON *cq_dam_webdav_version_linking_scheduler_period_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_scheduler_period);
    if(cq_dam_webdav_version_linking_scheduler_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.webdav.version.linking.scheduler.period", cq_dam_webdav_version_linking_scheduler_period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_staging_timeout
    if(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_staging_timeout) {
    cJSON *cq_dam_webdav_version_linking_staging_timeout_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_staging_timeout);
    if(cq_dam_webdav_version_linking_staging_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.webdav.version.linking.staging.timeout", cq_dam_webdav_version_linking_staging_timeout_local_JSON);
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

com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_t *com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_parseFromJSON(cJSON *com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_propertiesJSON){

    com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_t *com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_enable
    config_node_property_boolean_t *cq_dam_webdav_version_linking_enable_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_scheduler_period
    config_node_property_integer_t *cq_dam_webdav_version_linking_scheduler_period_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_staging_timeout
    config_node_property_integer_t *cq_dam_webdav_version_linking_staging_timeout_local_nonprim = NULL;

    // com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_enable
    cJSON *cq_dam_webdav_version_linking_enable = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_propertiesJSON, "cq.dam.webdav.version.linking.enable");
    if (cJSON_IsNull(cq_dam_webdav_version_linking_enable)) {
        cq_dam_webdav_version_linking_enable = NULL;
    }
    if (cq_dam_webdav_version_linking_enable) { 
    cq_dam_webdav_version_linking_enable_local_nonprim = config_node_property_boolean_parseFromJSON(cq_dam_webdav_version_linking_enable); //nonprimitive
    }

    // com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_scheduler_period
    cJSON *cq_dam_webdav_version_linking_scheduler_period = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_propertiesJSON, "cq.dam.webdav.version.linking.scheduler.period");
    if (cJSON_IsNull(cq_dam_webdav_version_linking_scheduler_period)) {
        cq_dam_webdav_version_linking_scheduler_period = NULL;
    }
    if (cq_dam_webdav_version_linking_scheduler_period) { 
    cq_dam_webdav_version_linking_scheduler_period_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_webdav_version_linking_scheduler_period); //nonprimitive
    }

    // com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties->cq_dam_webdav_version_linking_staging_timeout
    cJSON *cq_dam_webdav_version_linking_staging_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_propertiesJSON, "cq.dam.webdav.version.linking.staging.timeout");
    if (cJSON_IsNull(cq_dam_webdav_version_linking_staging_timeout)) {
        cq_dam_webdav_version_linking_staging_timeout = NULL;
    }
    if (cq_dam_webdav_version_linking_staging_timeout) { 
    cq_dam_webdav_version_linking_staging_timeout_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_webdav_version_linking_staging_timeout); //nonprimitive
    }



    com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_local_var = com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_create_internal (
        cq_dam_webdav_version_linking_enable ? cq_dam_webdav_version_linking_enable_local_nonprim : NULL,
        cq_dam_webdav_version_linking_scheduler_period ? cq_dam_webdav_version_linking_scheduler_period_local_nonprim : NULL,
        cq_dam_webdav_version_linking_staging_timeout ? cq_dam_webdav_version_linking_staging_timeout_local_nonprim : NULL
        );

    if (!com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties_local_var;
end:
    if (cq_dam_webdav_version_linking_enable_local_nonprim) {
        config_node_property_boolean_free(cq_dam_webdav_version_linking_enable_local_nonprim);
        cq_dam_webdav_version_linking_enable_local_nonprim = NULL;
    }
    if (cq_dam_webdav_version_linking_scheduler_period_local_nonprim) {
        config_node_property_integer_free(cq_dam_webdav_version_linking_scheduler_period_local_nonprim);
        cq_dam_webdav_version_linking_scheduler_period_local_nonprim = NULL;
    }
    if (cq_dam_webdav_version_linking_staging_timeout_local_nonprim) {
        config_node_property_integer_free(cq_dam_webdav_version_linking_staging_timeout_local_nonprim);
        cq_dam_webdav_version_linking_staging_timeout_local_nonprim = NULL;
    }
    return NULL;

}
