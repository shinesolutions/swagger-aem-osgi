/*
 * com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_H_
#define _com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t;

#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t {
    struct config_node_property_string_t *scheduler_expression; //model
    struct config_node_property_integer_t *job_purge_threshold; //model
    struct config_node_property_integer_t *job_purge_max_jobs; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t;

__attribute__((deprecated)) com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_create(
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *job_purge_threshold,
    config_node_property_integer_t *job_purge_max_jobs
);

void com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_free(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties);

com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_parseFromJSON(cJSON *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_propertiesJSON);

cJSON *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_convertToJSON(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties);

#endif /* _com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_H_ */

