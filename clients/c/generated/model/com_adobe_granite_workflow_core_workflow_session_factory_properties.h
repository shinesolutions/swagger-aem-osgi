/*
 * com_adobe_granite_workflow_core_workflow_session_factory_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_workflow_core_workflow_session_factory_properties_H_
#define _com_adobe_granite_workflow_core_workflow_session_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_workflow_core_workflow_session_factory_properties_t com_adobe_granite_workflow_core_workflow_session_factory_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_workflow_core_workflow_session_factory_properties_t {
    struct config_node_property_drop_down_t *granite_workflowinbox_sort_property_name; //model
    struct config_node_property_string_t *granite_workflowinbox_sort_order; //model
    struct config_node_property_integer_t *cq_workflow_job_retry; //model
    struct config_node_property_array_t *cq_workflow_superuser; //model
    struct config_node_property_integer_t *granite_workflow_inbox_query_size; //model
    struct config_node_property_boolean_t *granite_workflow_admin_user_group_filter; //model
    struct config_node_property_boolean_t *granite_workflow_enforce_workitem_assignee_permissions; //model
    struct config_node_property_boolean_t *granite_workflow_enforce_workflow_initiator_permissions; //model
    struct config_node_property_boolean_t *granite_workflow_inject_tenant_id_in_job_topics; //model
    struct config_node_property_integer_t *granite_workflow_max_purge_save_threshold; //model
    struct config_node_property_integer_t *granite_workflow_max_purge_query_count; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_workflow_core_workflow_session_factory_properties_t;

__attribute__((deprecated)) com_adobe_granite_workflow_core_workflow_session_factory_properties_t *com_adobe_granite_workflow_core_workflow_session_factory_properties_create(
    config_node_property_drop_down_t *granite_workflowinbox_sort_property_name,
    config_node_property_string_t *granite_workflowinbox_sort_order,
    config_node_property_integer_t *cq_workflow_job_retry,
    config_node_property_array_t *cq_workflow_superuser,
    config_node_property_integer_t *granite_workflow_inbox_query_size,
    config_node_property_boolean_t *granite_workflow_admin_user_group_filter,
    config_node_property_boolean_t *granite_workflow_enforce_workitem_assignee_permissions,
    config_node_property_boolean_t *granite_workflow_enforce_workflow_initiator_permissions,
    config_node_property_boolean_t *granite_workflow_inject_tenant_id_in_job_topics,
    config_node_property_integer_t *granite_workflow_max_purge_save_threshold,
    config_node_property_integer_t *granite_workflow_max_purge_query_count
);

void com_adobe_granite_workflow_core_workflow_session_factory_properties_free(com_adobe_granite_workflow_core_workflow_session_factory_properties_t *com_adobe_granite_workflow_core_workflow_session_factory_properties);

com_adobe_granite_workflow_core_workflow_session_factory_properties_t *com_adobe_granite_workflow_core_workflow_session_factory_properties_parseFromJSON(cJSON *com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON);

cJSON *com_adobe_granite_workflow_core_workflow_session_factory_properties_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties_t *com_adobe_granite_workflow_core_workflow_session_factory_properties);

#endif /* _com_adobe_granite_workflow_core_workflow_session_factory_properties_H_ */

