/*
 * com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties.h
 *
 * 
 */

#ifndef _com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_H_
#define _com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"



typedef struct com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t {
    struct config_node_property_boolean_t *preserve_hierarchy_nodes; //model
    struct config_node_property_boolean_t *ignore_versioning; //model
    struct config_node_property_boolean_t *import_acl; //model
    struct config_node_property_integer_t *save_threshold; //model
    struct config_node_property_boolean_t *preserve_user_paths; //model
    struct config_node_property_boolean_t *preserve_uuid; //model
    struct config_node_property_array_t *preserve_uuid_nodetypes; //model
    struct config_node_property_array_t *preserve_uuid_subtrees; //model
    struct config_node_property_boolean_t *auto_commit; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t;

__attribute__((deprecated)) com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_create(
    config_node_property_boolean_t *preserve_hierarchy_nodes,
    config_node_property_boolean_t *ignore_versioning,
    config_node_property_boolean_t *import_acl,
    config_node_property_integer_t *save_threshold,
    config_node_property_boolean_t *preserve_user_paths,
    config_node_property_boolean_t *preserve_uuid,
    config_node_property_array_t *preserve_uuid_nodetypes,
    config_node_property_array_t *preserve_uuid_subtrees,
    config_node_property_boolean_t *auto_commit
);

void com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_free(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties);

com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_parseFromJSON(cJSON *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_propertiesJSON);

cJSON *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_convertToJSON(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties);

#endif /* _com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_H_ */

