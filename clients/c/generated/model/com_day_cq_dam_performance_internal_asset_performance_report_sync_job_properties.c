#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties.h"



static com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_t *com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_create_internal(
    config_node_property_string_t *scheduler_expression
    ) {
    com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_t *com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_local_var = malloc(sizeof(com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_t));
    if (!com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_local_var, 0, sizeof(com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_t));
    com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_local_var->_library_owned = 1;
    com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_local_var->scheduler_expression = scheduler_expression;
    return com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_t *com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_create(
    config_node_property_string_t *scheduler_expression
    ) {
    com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_t *result = com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_create_internal (
        scheduler_expression
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_free(com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_t *com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties) {
    if(NULL == com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties){
        return ;
    }
    if(com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties->scheduler_expression) {
        config_node_property_string_free(com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties->scheduler_expression);
        com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties->scheduler_expression = NULL;
    }
    free(com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties);
}

cJSON *com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_convertToJSON(com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_t *com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties->scheduler_expression
    if(com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties->scheduler_expression) {
    cJSON *scheduler_expression_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties->scheduler_expression);
    if(scheduler_expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.expression", scheduler_expression_local_JSON);
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

com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_t *com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_parseFromJSON(cJSON *com_day_cq_dam_performance_internal_asset_performance_report_sync_job_propertiesJSON){

    com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_t *com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties->scheduler_expression
    config_node_property_string_t *scheduler_expression_local_nonprim = NULL;

    // com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties->scheduler_expression
    cJSON *scheduler_expression = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_performance_internal_asset_performance_report_sync_job_propertiesJSON, "scheduler.expression");
    if (cJSON_IsNull(scheduler_expression)) {
        scheduler_expression = NULL;
    }
    if (scheduler_expression) { 
    scheduler_expression_local_nonprim = config_node_property_string_parseFromJSON(scheduler_expression); //nonprimitive
    }



    com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_local_var = com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_create_internal (
        scheduler_expression ? scheduler_expression_local_nonprim : NULL
        );

    if (!com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties_local_var;
end:
    if (scheduler_expression_local_nonprim) {
        config_node_property_string_free(scheduler_expression_local_nonprim);
        scheduler_expression_local_nonprim = NULL;
    }
    return NULL;

}
