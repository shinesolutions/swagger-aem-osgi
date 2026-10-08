#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties.h"



static com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_t *com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_create_internal(
    config_node_property_integer_t *report_fetch_attempts,
    config_node_property_integer_t *report_fetch_delay
    ) {
    com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_t *com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_local_var = malloc(sizeof(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_t));
    if (!com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_local_var, 0, sizeof(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_t));
    com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_local_var->_library_owned = 1;
    com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_local_var->report_fetch_attempts = report_fetch_attempts;
    com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_local_var->report_fetch_delay = report_fetch_delay;
    return com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_t *com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_create(
    config_node_property_integer_t *report_fetch_attempts,
    config_node_property_integer_t *report_fetch_delay
    ) {
    com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_t *result = com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_create_internal (
        report_fetch_attempts,
        report_fetch_delay
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_free(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_t *com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties) {
    if(NULL == com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties){
        return ;
    }
    if(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_attempts) {
        config_node_property_integer_free(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_attempts);
        com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_attempts = NULL;
    }
    if (com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_delay) {
        config_node_property_integer_free(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_delay);
        com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_delay = NULL;
    }
    free(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties);
}

cJSON *com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_convertToJSON(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_t *com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_attempts
    if(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_attempts) {
    cJSON *report_fetch_attempts_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_attempts);
    if(report_fetch_attempts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "report.fetch.attempts", report_fetch_attempts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_delay
    if(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_delay) {
    cJSON *report_fetch_delay_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_delay);
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

com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_t *com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_parseFromJSON(cJSON *com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_propertiesJSON){

    com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_t *com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_local_var = NULL;

    // define the local variable for com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_attempts
    config_node_property_integer_t *report_fetch_attempts_local_nonprim = NULL;

    // define the local variable for com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_delay
    config_node_property_integer_t *report_fetch_delay_local_nonprim = NULL;

    // com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_attempts
    cJSON *report_fetch_attempts = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_propertiesJSON, "report.fetch.attempts");
    if (cJSON_IsNull(report_fetch_attempts)) {
        report_fetch_attempts = NULL;
    }
    if (report_fetch_attempts) { 
    report_fetch_attempts_local_nonprim = config_node_property_integer_parseFromJSON(report_fetch_attempts); //nonprimitive
    }

    // com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties->report_fetch_delay
    cJSON *report_fetch_delay = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_propertiesJSON, "report.fetch.delay");
    if (cJSON_IsNull(report_fetch_delay)) {
        report_fetch_delay = NULL;
    }
    if (report_fetch_delay) { 
    report_fetch_delay_local_nonprim = config_node_property_integer_parseFromJSON(report_fetch_delay); //nonprimitive
    }



    com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_local_var = com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_create_internal (
        report_fetch_attempts ? report_fetch_attempts_local_nonprim : NULL,
        report_fetch_delay ? report_fetch_delay_local_nonprim : NULL
        );

    if (!com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_local_var) {
        goto end;
    }

    return com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties_local_var;
end:
    if (report_fetch_attempts_local_nonprim) {
        config_node_property_integer_free(report_fetch_attempts_local_nonprim);
        report_fetch_attempts_local_nonprim = NULL;
    }
    if (report_fetch_delay_local_nonprim) {
        config_node_property_integer_free(report_fetch_delay_local_nonprim);
        report_fetch_delay_local_nonprim = NULL;
    }
    return NULL;

}
