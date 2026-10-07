#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties.h"



static com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_t *com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_create_internal(
    config_node_property_string_t *reportingservices_url
    ) {
    com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_t *com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_local_var = malloc(sizeof(com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_t));
    if (!com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_local_var, 0, sizeof(com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_t));
    com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_local_var->_library_owned = 1;
    com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_local_var->reportingservices_url = reportingservices_url;
    return com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_t *com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_create(
    config_node_property_string_t *reportingservices_url
    ) {
    com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_t *result = com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_create_internal (
        reportingservices_url
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_free(com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_t *com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties) {
    if(NULL == com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties){
        return ;
    }
    if(com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties->reportingservices_url) {
        config_node_property_string_free(com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties->reportingservices_url);
        com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties->reportingservices_url = NULL;
    }
    free(com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties);
}

cJSON *com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_convertToJSON(com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_t *com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties->reportingservices_url
    if(com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties->reportingservices_url) {
    cJSON *reportingservices_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties->reportingservices_url);
    if(reportingservices_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "reportingservices.url", reportingservices_url_local_JSON);
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

com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_t *com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_parseFromJSON(cJSON *com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_propertiesJSON){

    com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_t *com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties->reportingservices_url
    config_node_property_string_t *reportingservices_url_local_nonprim = NULL;

    // com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties->reportingservices_url
    cJSON *reportingservices_url = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_propertiesJSON, "reportingservices.url");
    if (cJSON_IsNull(reportingservices_url)) {
        reportingservices_url = NULL;
    }
    if (reportingservices_url) { 
    reportingservices_url_local_nonprim = config_node_property_string_parseFromJSON(reportingservices_url); //nonprimitive
    }



    com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_local_var = com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_create_internal (
        reportingservices_url ? reportingservices_url_local_nonprim : NULL
        );

    if (!com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties_local_var;
end:
    if (reportingservices_url_local_nonprim) {
        config_node_property_string_free(reportingservices_url_local_nonprim);
        reportingservices_url_local_nonprim = NULL;
    }
    return NULL;

}
