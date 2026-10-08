#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties.h"



static com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_create_internal(
    config_node_property_integer_t *cq_social_reporting_analytics_polling_importer_interval,
    config_node_property_integer_t *cq_social_reporting_analytics_polling_importer_page_size
    ) {
    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_local_var = malloc(sizeof(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_t));
    if (!com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_local_var, 0, sizeof(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_t));
    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_local_var->cq_social_reporting_analytics_polling_importer_interval = cq_social_reporting_analytics_polling_importer_interval;
    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_local_var->cq_social_reporting_analytics_polling_importer_page_size = cq_social_reporting_analytics_polling_importer_page_size;
    return com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_create(
    config_node_property_integer_t *cq_social_reporting_analytics_polling_importer_interval,
    config_node_property_integer_t *cq_social_reporting_analytics_polling_importer_page_size
    ) {
    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_t *result = com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_create_internal (
        cq_social_reporting_analytics_polling_importer_interval,
        cq_social_reporting_analytics_polling_importer_page_size
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_free(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties) {
    if(NULL == com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties){
        return ;
    }
    if(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_interval) {
        config_node_property_integer_free(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_interval);
        com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_interval = NULL;
    }
    if (com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_page_size) {
        config_node_property_integer_free(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_page_size);
        com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_page_size = NULL;
    }
    free(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties);
}

cJSON *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_convertToJSON(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_interval
    if(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_interval) {
    cJSON *cq_social_reporting_analytics_polling_importer_interval_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_interval);
    if(cq_social_reporting_analytics_polling_importer_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.social.reporting.analytics.polling.importer.interval", cq_social_reporting_analytics_polling_importer_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_page_size
    if(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_page_size) {
    cJSON *cq_social_reporting_analytics_polling_importer_page_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_page_size);
    if(cq_social_reporting_analytics_polling_importer_page_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.social.reporting.analytics.polling.importer.pageSize", cq_social_reporting_analytics_polling_importer_page_size_local_JSON);
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

com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_parseFromJSON(cJSON *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_propertiesJSON){

    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_interval
    config_node_property_integer_t *cq_social_reporting_analytics_polling_importer_interval_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_page_size
    config_node_property_integer_t *cq_social_reporting_analytics_polling_importer_page_size_local_nonprim = NULL;

    // com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_interval
    cJSON *cq_social_reporting_analytics_polling_importer_interval = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_propertiesJSON, "cq.social.reporting.analytics.polling.importer.interval");
    if (cJSON_IsNull(cq_social_reporting_analytics_polling_importer_interval)) {
        cq_social_reporting_analytics_polling_importer_interval = NULL;
    }
    if (cq_social_reporting_analytics_polling_importer_interval) { 
    cq_social_reporting_analytics_polling_importer_interval_local_nonprim = config_node_property_integer_parseFromJSON(cq_social_reporting_analytics_polling_importer_interval); //nonprimitive
    }

    // com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties->cq_social_reporting_analytics_polling_importer_page_size
    cJSON *cq_social_reporting_analytics_polling_importer_page_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_propertiesJSON, "cq.social.reporting.analytics.polling.importer.pageSize");
    if (cJSON_IsNull(cq_social_reporting_analytics_polling_importer_page_size)) {
        cq_social_reporting_analytics_polling_importer_page_size = NULL;
    }
    if (cq_social_reporting_analytics_polling_importer_page_size) { 
    cq_social_reporting_analytics_polling_importer_page_size_local_nonprim = config_node_property_integer_parseFromJSON(cq_social_reporting_analytics_polling_importer_page_size); //nonprimitive
    }



    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_local_var = com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_create_internal (
        cq_social_reporting_analytics_polling_importer_interval ? cq_social_reporting_analytics_polling_importer_interval_local_nonprim : NULL,
        cq_social_reporting_analytics_polling_importer_page_size ? cq_social_reporting_analytics_polling_importer_page_size_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties_local_var;
end:
    if (cq_social_reporting_analytics_polling_importer_interval_local_nonprim) {
        config_node_property_integer_free(cq_social_reporting_analytics_polling_importer_interval_local_nonprim);
        cq_social_reporting_analytics_polling_importer_interval_local_nonprim = NULL;
    }
    if (cq_social_reporting_analytics_polling_importer_page_size_local_nonprim) {
        config_node_property_integer_free(cq_social_reporting_analytics_polling_importer_page_size_local_nonprim);
        cq_social_reporting_analytics_polling_importer_page_size_local_nonprim = NULL;
    }
    return NULL;

}
