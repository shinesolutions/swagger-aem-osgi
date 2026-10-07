#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties.h"



static com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_create_internal(
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *job_purge_threshold,
    config_node_property_integer_t *job_purge_max_jobs
    ) {
    com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_local_var = malloc(sizeof(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t));
    if (!com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_local_var, 0, sizeof(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t));
    com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_local_var->_library_owned = 1;
    com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_local_var->scheduler_expression = scheduler_expression;
    com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_local_var->job_purge_threshold = job_purge_threshold;
    com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_local_var->job_purge_max_jobs = job_purge_max_jobs;
    return com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_create(
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *job_purge_threshold,
    config_node_property_integer_t *job_purge_max_jobs
    ) {
    com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t *result = com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_create_internal (
        scheduler_expression,
        job_purge_threshold,
        job_purge_max_jobs
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_free(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties) {
    if(NULL == com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties){
        return ;
    }
    if(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->scheduler_expression) {
        config_node_property_string_free(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->scheduler_expression);
        com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->scheduler_expression = NULL;
    }
    if (com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_threshold) {
        config_node_property_integer_free(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_threshold);
        com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_threshold = NULL;
    }
    if (com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_max_jobs) {
        config_node_property_integer_free(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_max_jobs);
        com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_max_jobs = NULL;
    }
    free(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties);
}

cJSON *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_convertToJSON(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->scheduler_expression
    if(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->scheduler_expression) {
    cJSON *scheduler_expression_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->scheduler_expression);
    if(scheduler_expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.expression", scheduler_expression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_threshold
    if(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_threshold) {
    cJSON *job_purge_threshold_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_threshold);
    if(job_purge_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "job.purge.threshold", job_purge_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_max_jobs
    if(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_max_jobs) {
    cJSON *job_purge_max_jobs_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_max_jobs);
    if(job_purge_max_jobs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "job.purge.max.jobs", job_purge_max_jobs_local_JSON);
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

com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_parseFromJSON(cJSON *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_propertiesJSON){

    com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->scheduler_expression
    config_node_property_string_t *scheduler_expression_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_threshold
    config_node_property_integer_t *job_purge_threshold_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_max_jobs
    config_node_property_integer_t *job_purge_max_jobs_local_nonprim = NULL;

    // com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->scheduler_expression
    cJSON *scheduler_expression = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_propertiesJSON, "scheduler.expression");
    if (cJSON_IsNull(scheduler_expression)) {
        scheduler_expression = NULL;
    }
    if (scheduler_expression) { 
    scheduler_expression_local_nonprim = config_node_property_string_parseFromJSON(scheduler_expression); //nonprimitive
    }

    // com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_threshold
    cJSON *job_purge_threshold = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_propertiesJSON, "job.purge.threshold");
    if (cJSON_IsNull(job_purge_threshold)) {
        job_purge_threshold = NULL;
    }
    if (job_purge_threshold) { 
    job_purge_threshold_local_nonprim = config_node_property_integer_parseFromJSON(job_purge_threshold); //nonprimitive
    }

    // com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties->job_purge_max_jobs
    cJSON *job_purge_max_jobs = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_propertiesJSON, "job.purge.max.jobs");
    if (cJSON_IsNull(job_purge_max_jobs)) {
        job_purge_max_jobs = NULL;
    }
    if (job_purge_max_jobs) { 
    job_purge_max_jobs_local_nonprim = config_node_property_integer_parseFromJSON(job_purge_max_jobs); //nonprimitive
    }



    com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_local_var = com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_create_internal (
        scheduler_expression ? scheduler_expression_local_nonprim : NULL,
        job_purge_threshold ? job_purge_threshold_local_nonprim : NULL,
        job_purge_max_jobs ? job_purge_max_jobs_local_nonprim : NULL
        );

    if (!com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_local_var;
end:
    if (scheduler_expression_local_nonprim) {
        config_node_property_string_free(scheduler_expression_local_nonprim);
        scheduler_expression_local_nonprim = NULL;
    }
    if (job_purge_threshold_local_nonprim) {
        config_node_property_integer_free(job_purge_threshold_local_nonprim);
        job_purge_threshold_local_nonprim = NULL;
    }
    if (job_purge_max_jobs_local_nonprim) {
        config_node_property_integer_free(job_purge_max_jobs_local_nonprim);
        job_purge_max_jobs_local_nonprim = NULL;
    }
    return NULL;

}
