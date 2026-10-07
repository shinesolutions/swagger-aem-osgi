/*
 * com_day_cq_wcm_core_impl_version_purge_task_properties.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_core_impl_version_purge_task_properties_H_
#define _com_day_cq_wcm_core_impl_version_purge_task_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_core_impl_version_purge_task_properties_t com_day_cq_wcm_core_impl_version_purge_task_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"



typedef struct com_day_cq_wcm_core_impl_version_purge_task_properties_t {
    struct config_node_property_array_t *versionpurge_paths; //model
    struct config_node_property_boolean_t *versionpurge_recursive; //model
    struct config_node_property_integer_t *versionpurge_max_versions; //model
    struct config_node_property_integer_t *versionpurge_min_versions; //model
    struct config_node_property_integer_t *versionpurge_max_age_days; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_core_impl_version_purge_task_properties_t;

__attribute__((deprecated)) com_day_cq_wcm_core_impl_version_purge_task_properties_t *com_day_cq_wcm_core_impl_version_purge_task_properties_create(
    config_node_property_array_t *versionpurge_paths,
    config_node_property_boolean_t *versionpurge_recursive,
    config_node_property_integer_t *versionpurge_max_versions,
    config_node_property_integer_t *versionpurge_min_versions,
    config_node_property_integer_t *versionpurge_max_age_days
);

void com_day_cq_wcm_core_impl_version_purge_task_properties_free(com_day_cq_wcm_core_impl_version_purge_task_properties_t *com_day_cq_wcm_core_impl_version_purge_task_properties);

com_day_cq_wcm_core_impl_version_purge_task_properties_t *com_day_cq_wcm_core_impl_version_purge_task_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_version_purge_task_propertiesJSON);

cJSON *com_day_cq_wcm_core_impl_version_purge_task_properties_convertToJSON(com_day_cq_wcm_core_impl_version_purge_task_properties_t *com_day_cq_wcm_core_impl_version_purge_task_properties);

#endif /* _com_day_cq_wcm_core_impl_version_purge_task_properties_H_ */

