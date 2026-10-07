/*
 * org_apache_sling_event_jobs_queue_configuration_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_event_jobs_queue_configuration_properties_H_
#define _org_apache_sling_event_jobs_queue_configuration_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_event_jobs_queue_configuration_properties_t org_apache_sling_event_jobs_queue_configuration_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_float.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_event_jobs_queue_configuration_properties_t {
    struct config_node_property_string_t *queue_name; //model
    struct config_node_property_array_t *queue_topics; //model
    struct config_node_property_drop_down_t *queue_type; //model
    struct config_node_property_drop_down_t *queue_priority; //model
    struct config_node_property_integer_t *queue_retries; //model
    struct config_node_property_integer_t *queue_retrydelay; //model
    struct config_node_property_float_t *queue_maxparallel; //model
    struct config_node_property_boolean_t *queue_keep_jobs; //model
    struct config_node_property_boolean_t *queue_prefer_run_on_creation_instance; //model
    struct config_node_property_integer_t *queue_thread_pool_size; //model
    struct config_node_property_integer_t *service_ranking; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_event_jobs_queue_configuration_properties_t;

__attribute__((deprecated)) org_apache_sling_event_jobs_queue_configuration_properties_t *org_apache_sling_event_jobs_queue_configuration_properties_create(
    config_node_property_string_t *queue_name,
    config_node_property_array_t *queue_topics,
    config_node_property_drop_down_t *queue_type,
    config_node_property_drop_down_t *queue_priority,
    config_node_property_integer_t *queue_retries,
    config_node_property_integer_t *queue_retrydelay,
    config_node_property_float_t *queue_maxparallel,
    config_node_property_boolean_t *queue_keep_jobs,
    config_node_property_boolean_t *queue_prefer_run_on_creation_instance,
    config_node_property_integer_t *queue_thread_pool_size,
    config_node_property_integer_t *service_ranking
);

void org_apache_sling_event_jobs_queue_configuration_properties_free(org_apache_sling_event_jobs_queue_configuration_properties_t *org_apache_sling_event_jobs_queue_configuration_properties);

org_apache_sling_event_jobs_queue_configuration_properties_t *org_apache_sling_event_jobs_queue_configuration_properties_parseFromJSON(cJSON *org_apache_sling_event_jobs_queue_configuration_propertiesJSON);

cJSON *org_apache_sling_event_jobs_queue_configuration_properties_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties_t *org_apache_sling_event_jobs_queue_configuration_properties);

#endif /* _org_apache_sling_event_jobs_queue_configuration_properties_H_ */

