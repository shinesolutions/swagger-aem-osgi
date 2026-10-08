/*
 * org_apache_sling_jcr_base_internal_login_admin_whitelist_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_H_
#define _org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t {
    struct config_node_property_boolean_t *whitelist_bypass; //model
    struct config_node_property_string_t *whitelist_bundles_regexp; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t;

__attribute__((deprecated)) org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_create(
    config_node_property_boolean_t *whitelist_bypass,
    config_node_property_string_t *whitelist_bundles_regexp
);

void org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_free(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties);

org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_parseFromJSON(cJSON *org_apache_sling_jcr_base_internal_login_admin_whitelist_propertiesJSON);

cJSON *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_convertToJSON(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties);

#endif /* _org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_H_ */

