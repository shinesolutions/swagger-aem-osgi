#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties.h"



static org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_create_internal(
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
    ) {
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var = malloc(sizeof(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t));
    if (!org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var, 0, sizeof(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t));
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->_library_owned = 1;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_searchpath = resource_resolver_searchpath;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_manglenamespaces = resource_resolver_manglenamespaces;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_allow_direct = resource_resolver_allow_direct;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_required_providers = resource_resolver_required_providers;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_required_providernames = resource_resolver_required_providernames;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_virtual = resource_resolver_virtual;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_mapping = resource_resolver_mapping;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_map_location = resource_resolver_map_location;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_map_observation = resource_resolver_map_observation;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_default_vanity_redirect_status = resource_resolver_default_vanity_redirect_status;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_enable_vanitypath = resource_resolver_enable_vanitypath;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_vanitypath_max_entries = resource_resolver_vanitypath_max_entries;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_vanitypath_max_entries_startup = resource_resolver_vanitypath_max_entries_startup;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_vanitypath_bloomfilter_max_bytes = resource_resolver_vanitypath_bloomfilter_max_bytes;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_optimize_alias_resolution = resource_resolver_optimize_alias_resolution;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_vanitypath_whitelist = resource_resolver_vanitypath_whitelist;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_vanitypath_blacklist = resource_resolver_vanitypath_blacklist;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_vanity_precedence = resource_resolver_vanity_precedence;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_providerhandling_paranoid = resource_resolver_providerhandling_paranoid;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_log_closing = resource_resolver_log_closing;
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var->resource_resolver_log_unclosed = resource_resolver_log_unclosed;
    return org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var;
}

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
    ) {
    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t *result = org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_create_internal (
        resource_resolver_searchpath,
        resource_resolver_manglenamespaces,
        resource_resolver_allow_direct,
        resource_resolver_required_providers,
        resource_resolver_required_providernames,
        resource_resolver_virtual,
        resource_resolver_mapping,
        resource_resolver_map_location,
        resource_resolver_map_observation,
        resource_resolver_default_vanity_redirect_status,
        resource_resolver_enable_vanitypath,
        resource_resolver_vanitypath_max_entries,
        resource_resolver_vanitypath_max_entries_startup,
        resource_resolver_vanitypath_bloomfilter_max_bytes,
        resource_resolver_optimize_alias_resolution,
        resource_resolver_vanitypath_whitelist,
        resource_resolver_vanitypath_blacklist,
        resource_resolver_vanity_precedence,
        resource_resolver_providerhandling_paranoid,
        resource_resolver_log_closing,
        resource_resolver_log_unclosed
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties) {
    if(NULL == org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties){
        return ;
    }
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_searchpath) {
        config_node_property_array_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_searchpath);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_searchpath = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_manglenamespaces) {
        config_node_property_boolean_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_manglenamespaces);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_manglenamespaces = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_allow_direct) {
        config_node_property_boolean_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_allow_direct);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_allow_direct = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providers) {
        config_node_property_array_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providers);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providers = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providernames) {
        config_node_property_array_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providernames);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providernames = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_virtual) {
        config_node_property_array_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_virtual);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_virtual = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_mapping) {
        config_node_property_array_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_mapping);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_mapping = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_location) {
        config_node_property_string_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_location);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_location = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_observation) {
        config_node_property_array_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_observation);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_observation = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_default_vanity_redirect_status) {
        config_node_property_integer_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_default_vanity_redirect_status);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_default_vanity_redirect_status = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_enable_vanitypath) {
        config_node_property_boolean_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_enable_vanitypath);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_enable_vanitypath = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries) {
        config_node_property_integer_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries_startup) {
        config_node_property_boolean_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries_startup);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries_startup = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_bloomfilter_max_bytes) {
        config_node_property_integer_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_bloomfilter_max_bytes);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_bloomfilter_max_bytes = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_optimize_alias_resolution) {
        config_node_property_boolean_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_optimize_alias_resolution);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_optimize_alias_resolution = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_whitelist) {
        config_node_property_array_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_whitelist);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_whitelist = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_blacklist) {
        config_node_property_array_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_blacklist);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_blacklist = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanity_precedence) {
        config_node_property_boolean_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanity_precedence);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanity_precedence = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_providerhandling_paranoid) {
        config_node_property_boolean_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_providerhandling_paranoid);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_providerhandling_paranoid = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_closing) {
        config_node_property_boolean_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_closing);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_closing = NULL;
    }
    if (org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_unclosed) {
        config_node_property_boolean_free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_unclosed);
        org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_unclosed = NULL;
    }
    free(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties);
}

cJSON *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_searchpath
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_searchpath) {
    cJSON *resource_resolver_searchpath_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_searchpath);
    if(resource_resolver_searchpath_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.searchpath", resource_resolver_searchpath_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_manglenamespaces
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_manglenamespaces) {
    cJSON *resource_resolver_manglenamespaces_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_manglenamespaces);
    if(resource_resolver_manglenamespaces_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.manglenamespaces", resource_resolver_manglenamespaces_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_allow_direct
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_allow_direct) {
    cJSON *resource_resolver_allow_direct_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_allow_direct);
    if(resource_resolver_allow_direct_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.allowDirect", resource_resolver_allow_direct_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providers
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providers) {
    cJSON *resource_resolver_required_providers_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providers);
    if(resource_resolver_required_providers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.required.providers", resource_resolver_required_providers_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providernames
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providernames) {
    cJSON *resource_resolver_required_providernames_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providernames);
    if(resource_resolver_required_providernames_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.required.providernames", resource_resolver_required_providernames_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_virtual
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_virtual) {
    cJSON *resource_resolver_virtual_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_virtual);
    if(resource_resolver_virtual_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.virtual", resource_resolver_virtual_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_mapping
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_mapping) {
    cJSON *resource_resolver_mapping_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_mapping);
    if(resource_resolver_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.mapping", resource_resolver_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_location
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_location) {
    cJSON *resource_resolver_map_location_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_location);
    if(resource_resolver_map_location_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.map.location", resource_resolver_map_location_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_observation
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_observation) {
    cJSON *resource_resolver_map_observation_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_observation);
    if(resource_resolver_map_observation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.map.observation", resource_resolver_map_observation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_default_vanity_redirect_status
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_default_vanity_redirect_status) {
    cJSON *resource_resolver_default_vanity_redirect_status_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_default_vanity_redirect_status);
    if(resource_resolver_default_vanity_redirect_status_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.default.vanity.redirect.status", resource_resolver_default_vanity_redirect_status_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_enable_vanitypath
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_enable_vanitypath) {
    cJSON *resource_resolver_enable_vanitypath_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_enable_vanitypath);
    if(resource_resolver_enable_vanitypath_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.enable.vanitypath", resource_resolver_enable_vanitypath_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries) {
    cJSON *resource_resolver_vanitypath_max_entries_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries);
    if(resource_resolver_vanitypath_max_entries_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.vanitypath.maxEntries", resource_resolver_vanitypath_max_entries_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries_startup
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries_startup) {
    cJSON *resource_resolver_vanitypath_max_entries_startup_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries_startup);
    if(resource_resolver_vanitypath_max_entries_startup_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.vanitypath.maxEntries.startup", resource_resolver_vanitypath_max_entries_startup_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_bloomfilter_max_bytes
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_bloomfilter_max_bytes) {
    cJSON *resource_resolver_vanitypath_bloomfilter_max_bytes_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_bloomfilter_max_bytes);
    if(resource_resolver_vanitypath_bloomfilter_max_bytes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.vanitypath.bloomfilter.maxBytes", resource_resolver_vanitypath_bloomfilter_max_bytes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_optimize_alias_resolution
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_optimize_alias_resolution) {
    cJSON *resource_resolver_optimize_alias_resolution_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_optimize_alias_resolution);
    if(resource_resolver_optimize_alias_resolution_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.optimize.alias.resolution", resource_resolver_optimize_alias_resolution_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_whitelist
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_whitelist) {
    cJSON *resource_resolver_vanitypath_whitelist_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_whitelist);
    if(resource_resolver_vanitypath_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.vanitypath.whitelist", resource_resolver_vanitypath_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_blacklist
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_blacklist) {
    cJSON *resource_resolver_vanitypath_blacklist_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_blacklist);
    if(resource_resolver_vanitypath_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.vanitypath.blacklist", resource_resolver_vanitypath_blacklist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanity_precedence
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanity_precedence) {
    cJSON *resource_resolver_vanity_precedence_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanity_precedence);
    if(resource_resolver_vanity_precedence_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.vanity.precedence", resource_resolver_vanity_precedence_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_providerhandling_paranoid
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_providerhandling_paranoid) {
    cJSON *resource_resolver_providerhandling_paranoid_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_providerhandling_paranoid);
    if(resource_resolver_providerhandling_paranoid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.providerhandling.paranoid", resource_resolver_providerhandling_paranoid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_closing
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_closing) {
    cJSON *resource_resolver_log_closing_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_closing);
    if(resource_resolver_log_closing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.log.closing", resource_resolver_log_closing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_unclosed
    if(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_unclosed) {
    cJSON *resource_resolver_log_unclosed_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_unclosed);
    if(resource_resolver_log_unclosed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.resolver.log.unclosed", resource_resolver_log_unclosed_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_parseFromJSON(cJSON *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON){

    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_t *org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_searchpath
    config_node_property_array_t *resource_resolver_searchpath_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_manglenamespaces
    config_node_property_boolean_t *resource_resolver_manglenamespaces_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_allow_direct
    config_node_property_boolean_t *resource_resolver_allow_direct_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providers
    config_node_property_array_t *resource_resolver_required_providers_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providernames
    config_node_property_array_t *resource_resolver_required_providernames_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_virtual
    config_node_property_array_t *resource_resolver_virtual_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_mapping
    config_node_property_array_t *resource_resolver_mapping_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_location
    config_node_property_string_t *resource_resolver_map_location_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_observation
    config_node_property_array_t *resource_resolver_map_observation_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_default_vanity_redirect_status
    config_node_property_integer_t *resource_resolver_default_vanity_redirect_status_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_enable_vanitypath
    config_node_property_boolean_t *resource_resolver_enable_vanitypath_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries
    config_node_property_integer_t *resource_resolver_vanitypath_max_entries_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries_startup
    config_node_property_boolean_t *resource_resolver_vanitypath_max_entries_startup_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_bloomfilter_max_bytes
    config_node_property_integer_t *resource_resolver_vanitypath_bloomfilter_max_bytes_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_optimize_alias_resolution
    config_node_property_boolean_t *resource_resolver_optimize_alias_resolution_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_whitelist
    config_node_property_array_t *resource_resolver_vanitypath_whitelist_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_blacklist
    config_node_property_array_t *resource_resolver_vanitypath_blacklist_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanity_precedence
    config_node_property_boolean_t *resource_resolver_vanity_precedence_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_providerhandling_paranoid
    config_node_property_boolean_t *resource_resolver_providerhandling_paranoid_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_closing
    config_node_property_boolean_t *resource_resolver_log_closing_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_unclosed
    config_node_property_boolean_t *resource_resolver_log_unclosed_local_nonprim = NULL;

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_searchpath
    cJSON *resource_resolver_searchpath = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.searchpath");
    if (cJSON_IsNull(resource_resolver_searchpath)) {
        resource_resolver_searchpath = NULL;
    }
    if (resource_resolver_searchpath) { 
    resource_resolver_searchpath_local_nonprim = config_node_property_array_parseFromJSON(resource_resolver_searchpath); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_manglenamespaces
    cJSON *resource_resolver_manglenamespaces = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.manglenamespaces");
    if (cJSON_IsNull(resource_resolver_manglenamespaces)) {
        resource_resolver_manglenamespaces = NULL;
    }
    if (resource_resolver_manglenamespaces) { 
    resource_resolver_manglenamespaces_local_nonprim = config_node_property_boolean_parseFromJSON(resource_resolver_manglenamespaces); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_allow_direct
    cJSON *resource_resolver_allow_direct = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.allowDirect");
    if (cJSON_IsNull(resource_resolver_allow_direct)) {
        resource_resolver_allow_direct = NULL;
    }
    if (resource_resolver_allow_direct) { 
    resource_resolver_allow_direct_local_nonprim = config_node_property_boolean_parseFromJSON(resource_resolver_allow_direct); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providers
    cJSON *resource_resolver_required_providers = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.required.providers");
    if (cJSON_IsNull(resource_resolver_required_providers)) {
        resource_resolver_required_providers = NULL;
    }
    if (resource_resolver_required_providers) { 
    resource_resolver_required_providers_local_nonprim = config_node_property_array_parseFromJSON(resource_resolver_required_providers); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_required_providernames
    cJSON *resource_resolver_required_providernames = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.required.providernames");
    if (cJSON_IsNull(resource_resolver_required_providernames)) {
        resource_resolver_required_providernames = NULL;
    }
    if (resource_resolver_required_providernames) { 
    resource_resolver_required_providernames_local_nonprim = config_node_property_array_parseFromJSON(resource_resolver_required_providernames); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_virtual
    cJSON *resource_resolver_virtual = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.virtual");
    if (cJSON_IsNull(resource_resolver_virtual)) {
        resource_resolver_virtual = NULL;
    }
    if (resource_resolver_virtual) { 
    resource_resolver_virtual_local_nonprim = config_node_property_array_parseFromJSON(resource_resolver_virtual); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_mapping
    cJSON *resource_resolver_mapping = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.mapping");
    if (cJSON_IsNull(resource_resolver_mapping)) {
        resource_resolver_mapping = NULL;
    }
    if (resource_resolver_mapping) { 
    resource_resolver_mapping_local_nonprim = config_node_property_array_parseFromJSON(resource_resolver_mapping); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_location
    cJSON *resource_resolver_map_location = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.map.location");
    if (cJSON_IsNull(resource_resolver_map_location)) {
        resource_resolver_map_location = NULL;
    }
    if (resource_resolver_map_location) { 
    resource_resolver_map_location_local_nonprim = config_node_property_string_parseFromJSON(resource_resolver_map_location); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_map_observation
    cJSON *resource_resolver_map_observation = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.map.observation");
    if (cJSON_IsNull(resource_resolver_map_observation)) {
        resource_resolver_map_observation = NULL;
    }
    if (resource_resolver_map_observation) { 
    resource_resolver_map_observation_local_nonprim = config_node_property_array_parseFromJSON(resource_resolver_map_observation); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_default_vanity_redirect_status
    cJSON *resource_resolver_default_vanity_redirect_status = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.default.vanity.redirect.status");
    if (cJSON_IsNull(resource_resolver_default_vanity_redirect_status)) {
        resource_resolver_default_vanity_redirect_status = NULL;
    }
    if (resource_resolver_default_vanity_redirect_status) { 
    resource_resolver_default_vanity_redirect_status_local_nonprim = config_node_property_integer_parseFromJSON(resource_resolver_default_vanity_redirect_status); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_enable_vanitypath
    cJSON *resource_resolver_enable_vanitypath = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.enable.vanitypath");
    if (cJSON_IsNull(resource_resolver_enable_vanitypath)) {
        resource_resolver_enable_vanitypath = NULL;
    }
    if (resource_resolver_enable_vanitypath) { 
    resource_resolver_enable_vanitypath_local_nonprim = config_node_property_boolean_parseFromJSON(resource_resolver_enable_vanitypath); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries
    cJSON *resource_resolver_vanitypath_max_entries = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.vanitypath.maxEntries");
    if (cJSON_IsNull(resource_resolver_vanitypath_max_entries)) {
        resource_resolver_vanitypath_max_entries = NULL;
    }
    if (resource_resolver_vanitypath_max_entries) { 
    resource_resolver_vanitypath_max_entries_local_nonprim = config_node_property_integer_parseFromJSON(resource_resolver_vanitypath_max_entries); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_max_entries_startup
    cJSON *resource_resolver_vanitypath_max_entries_startup = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.vanitypath.maxEntries.startup");
    if (cJSON_IsNull(resource_resolver_vanitypath_max_entries_startup)) {
        resource_resolver_vanitypath_max_entries_startup = NULL;
    }
    if (resource_resolver_vanitypath_max_entries_startup) { 
    resource_resolver_vanitypath_max_entries_startup_local_nonprim = config_node_property_boolean_parseFromJSON(resource_resolver_vanitypath_max_entries_startup); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_bloomfilter_max_bytes
    cJSON *resource_resolver_vanitypath_bloomfilter_max_bytes = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.vanitypath.bloomfilter.maxBytes");
    if (cJSON_IsNull(resource_resolver_vanitypath_bloomfilter_max_bytes)) {
        resource_resolver_vanitypath_bloomfilter_max_bytes = NULL;
    }
    if (resource_resolver_vanitypath_bloomfilter_max_bytes) { 
    resource_resolver_vanitypath_bloomfilter_max_bytes_local_nonprim = config_node_property_integer_parseFromJSON(resource_resolver_vanitypath_bloomfilter_max_bytes); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_optimize_alias_resolution
    cJSON *resource_resolver_optimize_alias_resolution = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.optimize.alias.resolution");
    if (cJSON_IsNull(resource_resolver_optimize_alias_resolution)) {
        resource_resolver_optimize_alias_resolution = NULL;
    }
    if (resource_resolver_optimize_alias_resolution) { 
    resource_resolver_optimize_alias_resolution_local_nonprim = config_node_property_boolean_parseFromJSON(resource_resolver_optimize_alias_resolution); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_whitelist
    cJSON *resource_resolver_vanitypath_whitelist = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.vanitypath.whitelist");
    if (cJSON_IsNull(resource_resolver_vanitypath_whitelist)) {
        resource_resolver_vanitypath_whitelist = NULL;
    }
    if (resource_resolver_vanitypath_whitelist) { 
    resource_resolver_vanitypath_whitelist_local_nonprim = config_node_property_array_parseFromJSON(resource_resolver_vanitypath_whitelist); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanitypath_blacklist
    cJSON *resource_resolver_vanitypath_blacklist = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.vanitypath.blacklist");
    if (cJSON_IsNull(resource_resolver_vanitypath_blacklist)) {
        resource_resolver_vanitypath_blacklist = NULL;
    }
    if (resource_resolver_vanitypath_blacklist) { 
    resource_resolver_vanitypath_blacklist_local_nonprim = config_node_property_array_parseFromJSON(resource_resolver_vanitypath_blacklist); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_vanity_precedence
    cJSON *resource_resolver_vanity_precedence = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.vanity.precedence");
    if (cJSON_IsNull(resource_resolver_vanity_precedence)) {
        resource_resolver_vanity_precedence = NULL;
    }
    if (resource_resolver_vanity_precedence) { 
    resource_resolver_vanity_precedence_local_nonprim = config_node_property_boolean_parseFromJSON(resource_resolver_vanity_precedence); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_providerhandling_paranoid
    cJSON *resource_resolver_providerhandling_paranoid = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.providerhandling.paranoid");
    if (cJSON_IsNull(resource_resolver_providerhandling_paranoid)) {
        resource_resolver_providerhandling_paranoid = NULL;
    }
    if (resource_resolver_providerhandling_paranoid) { 
    resource_resolver_providerhandling_paranoid_local_nonprim = config_node_property_boolean_parseFromJSON(resource_resolver_providerhandling_paranoid); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_closing
    cJSON *resource_resolver_log_closing = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.log.closing");
    if (cJSON_IsNull(resource_resolver_log_closing)) {
        resource_resolver_log_closing = NULL;
    }
    if (resource_resolver_log_closing) { 
    resource_resolver_log_closing_local_nonprim = config_node_property_boolean_parseFromJSON(resource_resolver_log_closing); //nonprimitive
    }

    // org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties->resource_resolver_log_unclosed
    cJSON *resource_resolver_log_unclosed = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_propertiesJSON, "resource.resolver.log.unclosed");
    if (cJSON_IsNull(resource_resolver_log_unclosed)) {
        resource_resolver_log_unclosed = NULL;
    }
    if (resource_resolver_log_unclosed) { 
    resource_resolver_log_unclosed_local_nonprim = config_node_property_boolean_parseFromJSON(resource_resolver_log_unclosed); //nonprimitive
    }



    org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var = org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_create_internal (
        resource_resolver_searchpath ? resource_resolver_searchpath_local_nonprim : NULL,
        resource_resolver_manglenamespaces ? resource_resolver_manglenamespaces_local_nonprim : NULL,
        resource_resolver_allow_direct ? resource_resolver_allow_direct_local_nonprim : NULL,
        resource_resolver_required_providers ? resource_resolver_required_providers_local_nonprim : NULL,
        resource_resolver_required_providernames ? resource_resolver_required_providernames_local_nonprim : NULL,
        resource_resolver_virtual ? resource_resolver_virtual_local_nonprim : NULL,
        resource_resolver_mapping ? resource_resolver_mapping_local_nonprim : NULL,
        resource_resolver_map_location ? resource_resolver_map_location_local_nonprim : NULL,
        resource_resolver_map_observation ? resource_resolver_map_observation_local_nonprim : NULL,
        resource_resolver_default_vanity_redirect_status ? resource_resolver_default_vanity_redirect_status_local_nonprim : NULL,
        resource_resolver_enable_vanitypath ? resource_resolver_enable_vanitypath_local_nonprim : NULL,
        resource_resolver_vanitypath_max_entries ? resource_resolver_vanitypath_max_entries_local_nonprim : NULL,
        resource_resolver_vanitypath_max_entries_startup ? resource_resolver_vanitypath_max_entries_startup_local_nonprim : NULL,
        resource_resolver_vanitypath_bloomfilter_max_bytes ? resource_resolver_vanitypath_bloomfilter_max_bytes_local_nonprim : NULL,
        resource_resolver_optimize_alias_resolution ? resource_resolver_optimize_alias_resolution_local_nonprim : NULL,
        resource_resolver_vanitypath_whitelist ? resource_resolver_vanitypath_whitelist_local_nonprim : NULL,
        resource_resolver_vanitypath_blacklist ? resource_resolver_vanitypath_blacklist_local_nonprim : NULL,
        resource_resolver_vanity_precedence ? resource_resolver_vanity_precedence_local_nonprim : NULL,
        resource_resolver_providerhandling_paranoid ? resource_resolver_providerhandling_paranoid_local_nonprim : NULL,
        resource_resolver_log_closing ? resource_resolver_log_closing_local_nonprim : NULL,
        resource_resolver_log_unclosed ? resource_resolver_log_unclosed_local_nonprim : NULL
        );

    if (!org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var) {
        goto end;
    }

    return org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_local_var;
end:
    if (resource_resolver_searchpath_local_nonprim) {
        config_node_property_array_free(resource_resolver_searchpath_local_nonprim);
        resource_resolver_searchpath_local_nonprim = NULL;
    }
    if (resource_resolver_manglenamespaces_local_nonprim) {
        config_node_property_boolean_free(resource_resolver_manglenamespaces_local_nonprim);
        resource_resolver_manglenamespaces_local_nonprim = NULL;
    }
    if (resource_resolver_allow_direct_local_nonprim) {
        config_node_property_boolean_free(resource_resolver_allow_direct_local_nonprim);
        resource_resolver_allow_direct_local_nonprim = NULL;
    }
    if (resource_resolver_required_providers_local_nonprim) {
        config_node_property_array_free(resource_resolver_required_providers_local_nonprim);
        resource_resolver_required_providers_local_nonprim = NULL;
    }
    if (resource_resolver_required_providernames_local_nonprim) {
        config_node_property_array_free(resource_resolver_required_providernames_local_nonprim);
        resource_resolver_required_providernames_local_nonprim = NULL;
    }
    if (resource_resolver_virtual_local_nonprim) {
        config_node_property_array_free(resource_resolver_virtual_local_nonprim);
        resource_resolver_virtual_local_nonprim = NULL;
    }
    if (resource_resolver_mapping_local_nonprim) {
        config_node_property_array_free(resource_resolver_mapping_local_nonprim);
        resource_resolver_mapping_local_nonprim = NULL;
    }
    if (resource_resolver_map_location_local_nonprim) {
        config_node_property_string_free(resource_resolver_map_location_local_nonprim);
        resource_resolver_map_location_local_nonprim = NULL;
    }
    if (resource_resolver_map_observation_local_nonprim) {
        config_node_property_array_free(resource_resolver_map_observation_local_nonprim);
        resource_resolver_map_observation_local_nonprim = NULL;
    }
    if (resource_resolver_default_vanity_redirect_status_local_nonprim) {
        config_node_property_integer_free(resource_resolver_default_vanity_redirect_status_local_nonprim);
        resource_resolver_default_vanity_redirect_status_local_nonprim = NULL;
    }
    if (resource_resolver_enable_vanitypath_local_nonprim) {
        config_node_property_boolean_free(resource_resolver_enable_vanitypath_local_nonprim);
        resource_resolver_enable_vanitypath_local_nonprim = NULL;
    }
    if (resource_resolver_vanitypath_max_entries_local_nonprim) {
        config_node_property_integer_free(resource_resolver_vanitypath_max_entries_local_nonprim);
        resource_resolver_vanitypath_max_entries_local_nonprim = NULL;
    }
    if (resource_resolver_vanitypath_max_entries_startup_local_nonprim) {
        config_node_property_boolean_free(resource_resolver_vanitypath_max_entries_startup_local_nonprim);
        resource_resolver_vanitypath_max_entries_startup_local_nonprim = NULL;
    }
    if (resource_resolver_vanitypath_bloomfilter_max_bytes_local_nonprim) {
        config_node_property_integer_free(resource_resolver_vanitypath_bloomfilter_max_bytes_local_nonprim);
        resource_resolver_vanitypath_bloomfilter_max_bytes_local_nonprim = NULL;
    }
    if (resource_resolver_optimize_alias_resolution_local_nonprim) {
        config_node_property_boolean_free(resource_resolver_optimize_alias_resolution_local_nonprim);
        resource_resolver_optimize_alias_resolution_local_nonprim = NULL;
    }
    if (resource_resolver_vanitypath_whitelist_local_nonprim) {
        config_node_property_array_free(resource_resolver_vanitypath_whitelist_local_nonprim);
        resource_resolver_vanitypath_whitelist_local_nonprim = NULL;
    }
    if (resource_resolver_vanitypath_blacklist_local_nonprim) {
        config_node_property_array_free(resource_resolver_vanitypath_blacklist_local_nonprim);
        resource_resolver_vanitypath_blacklist_local_nonprim = NULL;
    }
    if (resource_resolver_vanity_precedence_local_nonprim) {
        config_node_property_boolean_free(resource_resolver_vanity_precedence_local_nonprim);
        resource_resolver_vanity_precedence_local_nonprim = NULL;
    }
    if (resource_resolver_providerhandling_paranoid_local_nonprim) {
        config_node_property_boolean_free(resource_resolver_providerhandling_paranoid_local_nonprim);
        resource_resolver_providerhandling_paranoid_local_nonprim = NULL;
    }
    if (resource_resolver_log_closing_local_nonprim) {
        config_node_property_boolean_free(resource_resolver_log_closing_local_nonprim);
        resource_resolver_log_closing_local_nonprim = NULL;
    }
    if (resource_resolver_log_unclosed_local_nonprim) {
        config_node_property_boolean_free(resource_resolver_log_unclosed_local_nonprim);
        resource_resolver_log_unclosed_local_nonprim = NULL;
    }
    return NULL;

}
