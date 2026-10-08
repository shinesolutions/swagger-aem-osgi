/*
 * org_apache_sling_event_impl_jobs_job_consumer_manager_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_event_impl_jobs_job_consumer_manager_properties_H_
#define _org_apache_sling_event_impl_jobs_job_consumer_manager_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"



typedef struct org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t {
    struct config_node_property_boolean_t *org_apache_sling_installer_configuration_persist; //model
    struct config_node_property_array_t *job_consumermanager_whitelist; //model
    struct config_node_property_array_t *job_consumermanager_blacklist; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t;

__attribute__((deprecated)) org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t *org_apache_sling_event_impl_jobs_job_consumer_manager_properties_create(
    config_node_property_boolean_t *org_apache_sling_installer_configuration_persist,
    config_node_property_array_t *job_consumermanager_whitelist,
    config_node_property_array_t *job_consumermanager_blacklist
);

void org_apache_sling_event_impl_jobs_job_consumer_manager_properties_free(org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t *org_apache_sling_event_impl_jobs_job_consumer_manager_properties);

org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t *org_apache_sling_event_impl_jobs_job_consumer_manager_properties_parseFromJSON(cJSON *org_apache_sling_event_impl_jobs_job_consumer_manager_propertiesJSON);

cJSON *org_apache_sling_event_impl_jobs_job_consumer_manager_properties_convertToJSON(org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t *org_apache_sling_event_impl_jobs_job_consumer_manager_properties);

#endif /* _org_apache_sling_event_impl_jobs_job_consumer_manager_properties_H_ */

