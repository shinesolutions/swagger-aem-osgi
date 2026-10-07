/*
 * com_adobe_cq_audit_purge_replication_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_audit_purge_replication_properties_H_
#define _com_adobe_cq_audit_purge_replication_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_audit_purge_replication_properties_t com_adobe_cq_audit_purge_replication_properties_t;

#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_audit_purge_replication_properties_t {
    struct config_node_property_string_t *auditlog_rule_name; //model
    struct config_node_property_string_t *auditlog_rule_contentpath; //model
    struct config_node_property_integer_t *auditlog_rule_minimumage; //model
    struct config_node_property_drop_down_t *auditlog_rule_types; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_audit_purge_replication_properties_t;

__attribute__((deprecated)) com_adobe_cq_audit_purge_replication_properties_t *com_adobe_cq_audit_purge_replication_properties_create(
    config_node_property_string_t *auditlog_rule_name,
    config_node_property_string_t *auditlog_rule_contentpath,
    config_node_property_integer_t *auditlog_rule_minimumage,
    config_node_property_drop_down_t *auditlog_rule_types
);

void com_adobe_cq_audit_purge_replication_properties_free(com_adobe_cq_audit_purge_replication_properties_t *com_adobe_cq_audit_purge_replication_properties);

com_adobe_cq_audit_purge_replication_properties_t *com_adobe_cq_audit_purge_replication_properties_parseFromJSON(cJSON *com_adobe_cq_audit_purge_replication_propertiesJSON);

cJSON *com_adobe_cq_audit_purge_replication_properties_convertToJSON(com_adobe_cq_audit_purge_replication_properties_t *com_adobe_cq_audit_purge_replication_properties);

#endif /* _com_adobe_cq_audit_purge_replication_properties_H_ */

