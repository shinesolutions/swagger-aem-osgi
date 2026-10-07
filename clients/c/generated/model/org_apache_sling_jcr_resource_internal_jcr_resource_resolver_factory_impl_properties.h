/*
 * org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_H_
#define _org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t {
    struct config_node_property_array_t *resource_resolver_searchpath; //model
    struct config_node_property_boolean_t *resource_resolver_manglenamespaces; //model
    struct config_node_property_boolean_t *resource_resolver_allow_direct; //model
    struct config_node_property_array_t *resource_resolver_required_providers; //model
    struct config_node_property_array_t *resource_resolver_required_providernames; //model
    struct config_node_property_array_t *resource_resolver_virtual; //model
    struct config_node_property_array_t *resource_resolver_mapping; //model
    struct config_node_property_string_t *resource_resolver_map_location; //model
    struct config_node_property_array_t *resource_resolver_map_observation; //model
    struct config_node_property_integer_t *resource_resolver_default_vanity_redirect_status; //model
    struct config_node_property_boolean_t *resource_resolver_enable_vanitypath; //model
    struct config_node_property_integer_t *resource_resolver_vanitypath_max_entries; //model
    struct config_node_property_boolean_t *resource_resolver_vanitypath_max_entries_startup; //model
    struct config_node_property_integer_t *resource_resolver_vanitypath_bloomfilter_max_bytes; //model
    struct config_node_property_boolean_t *resource_resolver_optimize_alias_resolution; //model
    struct config_node_property_array_t *resource_resolver_vanitypath_whitelist; //model
    struct config_node_property_array_t *resource_resolver_vanitypath_blacklist; //model
    struct config_node_property_boolean_t *resource_resolver_vanity_precedence; //model
    struct config_node_property_boolean_t *resource_resolver_providerhandling_paranoid; //model
    struct config_node_property_boolean_t *resource_resolver_log_closing; //model
    struct config_node_property_boolean_t *resource_resolver_log_unclosed; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t;

__attribute__((deprecated)) org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_create(
    config_node_property_array_t *resource_resolver_searchpath,
    config_node_property_boolean_t *resource_resolver_manglenamespaces,
    config_node_property_boolean_t *resource_resolver_allow_direct,
    config_node_property_array_t *resource_resolver_required_providers,
    config_node_property_array_t *resource_resolver_required_providernames,
    config_node_property_array_t *resource_resolver_virtual,
    config_node_property_array_t *resource_resolver_mapping,
    config_node_property_string_t *resource_resolver_map_location,
    config_node_property_array_t *resource_resolver_map_observation,
    config_node_property_integer_t *resource_resolver_default_vanity_redirect_status,
    config_node_property_boolean_t *resource_resolver_enable_vanitypath,
    config_node_property_integer_t *resource_resolver_vanitypath_max_entries,
    config_node_property_boolean_t *resource_resolver_vanitypath_max_entries_startup,
    config_node_property_integer_t *resource_resolver_vanitypath_bloomfilter_max_bytes,
    config_node_property_boolean_t *resource_resolver_optimize_alias_resolution,
    config_node_property_array_t *resource_resolver_vanitypath_whitelist,
    config_node_property_array_t *resource_resolver_vanitypath_blacklist,
    config_node_property_boolean_t *resource_resolver_vanity_precedence,
    config_node_property_boolean_t *resource_resolver_providerhandling_paranoid,
    config_node_property_boolean_t *resource_resolver_log_closing,
    config_node_property_boolean_t *resource_resolver_log_unclosed
);

void org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties);

org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_parseFromJSON(cJSON *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON);

cJSON *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties);

#endif /* _org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_H_ */

