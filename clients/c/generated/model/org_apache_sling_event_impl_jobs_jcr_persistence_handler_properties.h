/*
 * org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_H_
#define _org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"



typedef struct org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t {
    struct config_node_property_boolean_t *job_consumermanager_disable_distribution; //model
    struct config_node_property_integer_t *startup_delay; //model
    struct config_node_property_integer_t *cleanup_period; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t;

__attribute__((deprecated)) org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_create(
    config_node_property_boolean_t *job_consumermanager_disable_distribution,
    config_node_property_integer_t *startup_delay,
    config_node_property_integer_t *cleanup_period
);

void org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_free(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties);

org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_parseFromJSON(cJSON *org_apache_sling_event_impl_jobs_jcr_persistence_handler_propertiesJSON);

cJSON *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_convertToJSON(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties);

#endif /* _org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_H_ */

