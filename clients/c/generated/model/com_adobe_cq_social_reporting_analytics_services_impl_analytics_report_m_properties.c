#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties.h"



static com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_create_internal(
    config_node_property_integer_t *report_fetch_delay
    ) {
    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_local_var = malloc(sizeof(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_t));
    if (!com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_local_var, 0, sizeof(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_t));
    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_local_var->report_fetch_delay = report_fetch_delay;
    return com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_create(
    config_node_property_integer_t *report_fetch_delay
    ) {
    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_t *result = com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_create_internal (
        report_fetch_delay
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_free(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties) {
    if(NULL == com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties){
        return ;
    }
    if(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties->report_fetch_delay) {
        config_node_property_integer_free(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties->report_fetch_delay);
        com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties->report_fetch_delay = NULL;
    }
    free(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties);
}

cJSON *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_convertToJSON(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties->report_fetch_delay
    if(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties->report_fetch_delay) {
    cJSON *report_fetch_delay_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties->report_fetch_delay);
    if(report_fetch_delay_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "report.fetch.delay", report_fetch_delay_local_JSON);
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

com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_parseFromJSON(cJSON *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_propertiesJSON){

    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_t *com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties->report_fetch_delay
    config_node_property_integer_t *report_fetch_delay_local_nonprim = NULL;

    // com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties->report_fetch_delay
    cJSON *report_fetch_delay = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_propertiesJSON, "report.fetch.delay");
    if (cJSON_IsNull(report_fetch_delay)) {
        report_fetch_delay = NULL;
    }
    if (report_fetch_delay) { 
    report_fetch_delay_local_nonprim = config_node_property_integer_parseFromJSON(report_fetch_delay); //nonprimitive
    }



    com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_local_var = com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_create_internal (
        report_fetch_delay ? report_fetch_delay_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties_local_var;
end:
    if (report_fetch_delay_local_nonprim) {
        config_node_property_integer_free(report_fetch_delay_local_nonprim);
        report_fetch_delay_local_nonprim = NULL;
    }
    return NULL;

}
