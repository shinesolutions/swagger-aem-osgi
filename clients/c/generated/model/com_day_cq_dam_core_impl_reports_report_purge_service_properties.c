#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_reports_report_purge_service_properties.h"



static com_day_cq_dam_core_impl_reports_report_purge_service_properties_t *com_day_cq_dam_core_impl_reports_report_purge_service_properties_create_internal(
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *max_saved_reports,
    config_node_property_integer_t *time_duration,
    config_node_property_boolean_t *enable_report_purge
    ) {
    com_day_cq_dam_core_impl_reports_report_purge_service_properties_t *com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_reports_report_purge_service_properties_t));
    if (!com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_reports_report_purge_service_properties_t));
    com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var->scheduler_expression = scheduler_expression;
    com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var->max_saved_reports = max_saved_reports;
    com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var->time_duration = time_duration;
    com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var->enable_report_purge = enable_report_purge;
    return com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_reports_report_purge_service_properties_t *com_day_cq_dam_core_impl_reports_report_purge_service_properties_create(
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *max_saved_reports,
    config_node_property_integer_t *time_duration,
    config_node_property_boolean_t *enable_report_purge
    ) {
    com_day_cq_dam_core_impl_reports_report_purge_service_properties_t *result = com_day_cq_dam_core_impl_reports_report_purge_service_properties_create_internal (
        scheduler_expression,
        max_saved_reports,
        time_duration,
        enable_report_purge
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_reports_report_purge_service_properties_free(com_day_cq_dam_core_impl_reports_report_purge_service_properties_t *com_day_cq_dam_core_impl_reports_report_purge_service_properties) {
    if(NULL == com_day_cq_dam_core_impl_reports_report_purge_service_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_reports_report_purge_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_reports_report_purge_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_reports_report_purge_service_properties->scheduler_expression) {
        config_node_property_string_free(com_day_cq_dam_core_impl_reports_report_purge_service_properties->scheduler_expression);
        com_day_cq_dam_core_impl_reports_report_purge_service_properties->scheduler_expression = NULL;
    }
    if (com_day_cq_dam_core_impl_reports_report_purge_service_properties->max_saved_reports) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_reports_report_purge_service_properties->max_saved_reports);
        com_day_cq_dam_core_impl_reports_report_purge_service_properties->max_saved_reports = NULL;
    }
    if (com_day_cq_dam_core_impl_reports_report_purge_service_properties->time_duration) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_reports_report_purge_service_properties->time_duration);
        com_day_cq_dam_core_impl_reports_report_purge_service_properties->time_duration = NULL;
    }
    if (com_day_cq_dam_core_impl_reports_report_purge_service_properties->enable_report_purge) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_reports_report_purge_service_properties->enable_report_purge);
        com_day_cq_dam_core_impl_reports_report_purge_service_properties->enable_report_purge = NULL;
    }
    free(com_day_cq_dam_core_impl_reports_report_purge_service_properties);
}

cJSON *com_day_cq_dam_core_impl_reports_report_purge_service_properties_convertToJSON(com_day_cq_dam_core_impl_reports_report_purge_service_properties_t *com_day_cq_dam_core_impl_reports_report_purge_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_reports_report_purge_service_properties->scheduler_expression
    if(com_day_cq_dam_core_impl_reports_report_purge_service_properties->scheduler_expression) {
    cJSON *scheduler_expression_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_reports_report_purge_service_properties->scheduler_expression);
    if(scheduler_expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.expression", scheduler_expression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_reports_report_purge_service_properties->max_saved_reports
    if(com_day_cq_dam_core_impl_reports_report_purge_service_properties->max_saved_reports) {
    cJSON *max_saved_reports_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_reports_report_purge_service_properties->max_saved_reports);
    if(max_saved_reports_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxSavedReports", max_saved_reports_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_reports_report_purge_service_properties->time_duration
    if(com_day_cq_dam_core_impl_reports_report_purge_service_properties->time_duration) {
    cJSON *time_duration_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_reports_report_purge_service_properties->time_duration);
    if(time_duration_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "timeDuration", time_duration_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_reports_report_purge_service_properties->enable_report_purge
    if(com_day_cq_dam_core_impl_reports_report_purge_service_properties->enable_report_purge) {
    cJSON *enable_report_purge_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_reports_report_purge_service_properties->enable_report_purge);
    if(enable_report_purge_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enableReportPurge", enable_report_purge_local_JSON);
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

com_day_cq_dam_core_impl_reports_report_purge_service_properties_t *com_day_cq_dam_core_impl_reports_report_purge_service_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_reports_report_purge_service_propertiesJSON){

    com_day_cq_dam_core_impl_reports_report_purge_service_properties_t *com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_reports_report_purge_service_properties->scheduler_expression
    config_node_property_string_t *scheduler_expression_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_reports_report_purge_service_properties->max_saved_reports
    config_node_property_integer_t *max_saved_reports_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_reports_report_purge_service_properties->time_duration
    config_node_property_integer_t *time_duration_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_reports_report_purge_service_properties->enable_report_purge
    config_node_property_boolean_t *enable_report_purge_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_reports_report_purge_service_properties->scheduler_expression
    cJSON *scheduler_expression = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_reports_report_purge_service_propertiesJSON, "scheduler.expression");
    if (cJSON_IsNull(scheduler_expression)) {
        scheduler_expression = NULL;
    }
    if (scheduler_expression) { 
    scheduler_expression_local_nonprim = config_node_property_string_parseFromJSON(scheduler_expression); //nonprimitive
    }

    // com_day_cq_dam_core_impl_reports_report_purge_service_properties->max_saved_reports
    cJSON *max_saved_reports = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_reports_report_purge_service_propertiesJSON, "maxSavedReports");
    if (cJSON_IsNull(max_saved_reports)) {
        max_saved_reports = NULL;
    }
    if (max_saved_reports) { 
    max_saved_reports_local_nonprim = config_node_property_integer_parseFromJSON(max_saved_reports); //nonprimitive
    }

    // com_day_cq_dam_core_impl_reports_report_purge_service_properties->time_duration
    cJSON *time_duration = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_reports_report_purge_service_propertiesJSON, "timeDuration");
    if (cJSON_IsNull(time_duration)) {
        time_duration = NULL;
    }
    if (time_duration) { 
    time_duration_local_nonprim = config_node_property_integer_parseFromJSON(time_duration); //nonprimitive
    }

    // com_day_cq_dam_core_impl_reports_report_purge_service_properties->enable_report_purge
    cJSON *enable_report_purge = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_reports_report_purge_service_propertiesJSON, "enableReportPurge");
    if (cJSON_IsNull(enable_report_purge)) {
        enable_report_purge = NULL;
    }
    if (enable_report_purge) { 
    enable_report_purge_local_nonprim = config_node_property_boolean_parseFromJSON(enable_report_purge); //nonprimitive
    }



    com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var = com_day_cq_dam_core_impl_reports_report_purge_service_properties_create_internal (
        scheduler_expression ? scheduler_expression_local_nonprim : NULL,
        max_saved_reports ? max_saved_reports_local_nonprim : NULL,
        time_duration ? time_duration_local_nonprim : NULL,
        enable_report_purge ? enable_report_purge_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_reports_report_purge_service_properties_local_var;
end:
    if (scheduler_expression_local_nonprim) {
        config_node_property_string_free(scheduler_expression_local_nonprim);
        scheduler_expression_local_nonprim = NULL;
    }
    if (max_saved_reports_local_nonprim) {
        config_node_property_integer_free(max_saved_reports_local_nonprim);
        max_saved_reports_local_nonprim = NULL;
    }
    if (time_duration_local_nonprim) {
        config_node_property_integer_free(time_duration_local_nonprim);
        time_duration_local_nonprim = NULL;
    }
    if (enable_report_purge_local_nonprim) {
        config_node_property_boolean_free(enable_report_purge_local_nonprim);
        enable_report_purge_local_nonprim = NULL;
    }
    return NULL;

}
