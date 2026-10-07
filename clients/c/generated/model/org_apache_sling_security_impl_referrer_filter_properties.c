#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_security_impl_referrer_filter_properties.h"



static org_apache_sling_security_impl_referrer_filter_properties_t *org_apache_sling_security_impl_referrer_filter_properties_create_internal(
    config_node_property_boolean_t *allow_empty,
    config_node_property_array_t *allow_hosts,
    config_node_property_array_t *allow_hosts_regexp,
    config_node_property_array_t *filter_methods,
    config_node_property_array_t *exclude_agents_regexp
    ) {
    org_apache_sling_security_impl_referrer_filter_properties_t *org_apache_sling_security_impl_referrer_filter_properties_local_var = malloc(sizeof(org_apache_sling_security_impl_referrer_filter_properties_t));
    if (!org_apache_sling_security_impl_referrer_filter_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_security_impl_referrer_filter_properties_local_var, 0, sizeof(org_apache_sling_security_impl_referrer_filter_properties_t));
    org_apache_sling_security_impl_referrer_filter_properties_local_var->_library_owned = 1;
    org_apache_sling_security_impl_referrer_filter_properties_local_var->allow_empty = allow_empty;
    org_apache_sling_security_impl_referrer_filter_properties_local_var->allow_hosts = allow_hosts;
    org_apache_sling_security_impl_referrer_filter_properties_local_var->allow_hosts_regexp = allow_hosts_regexp;
    org_apache_sling_security_impl_referrer_filter_properties_local_var->filter_methods = filter_methods;
    org_apache_sling_security_impl_referrer_filter_properties_local_var->exclude_agents_regexp = exclude_agents_regexp;
    return org_apache_sling_security_impl_referrer_filter_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_security_impl_referrer_filter_properties_t *org_apache_sling_security_impl_referrer_filter_properties_create(
    config_node_property_boolean_t *allow_empty,
    config_node_property_array_t *allow_hosts,
    config_node_property_array_t *allow_hosts_regexp,
    config_node_property_array_t *filter_methods,
    config_node_property_array_t *exclude_agents_regexp
    ) {
    org_apache_sling_security_impl_referrer_filter_properties_t *result = org_apache_sling_security_impl_referrer_filter_properties_create_internal (
        allow_empty,
        allow_hosts,
        allow_hosts_regexp,
        filter_methods,
        exclude_agents_regexp
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_security_impl_referrer_filter_properties_free(org_apache_sling_security_impl_referrer_filter_properties_t *org_apache_sling_security_impl_referrer_filter_properties) {
    if(NULL == org_apache_sling_security_impl_referrer_filter_properties){
        return ;
    }
    if(org_apache_sling_security_impl_referrer_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_security_impl_referrer_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_security_impl_referrer_filter_properties->allow_empty) {
        config_node_property_boolean_free(org_apache_sling_security_impl_referrer_filter_properties->allow_empty);
        org_apache_sling_security_impl_referrer_filter_properties->allow_empty = NULL;
    }
    if (org_apache_sling_security_impl_referrer_filter_properties->allow_hosts) {
        config_node_property_array_free(org_apache_sling_security_impl_referrer_filter_properties->allow_hosts);
        org_apache_sling_security_impl_referrer_filter_properties->allow_hosts = NULL;
    }
    if (org_apache_sling_security_impl_referrer_filter_properties->allow_hosts_regexp) {
        config_node_property_array_free(org_apache_sling_security_impl_referrer_filter_properties->allow_hosts_regexp);
        org_apache_sling_security_impl_referrer_filter_properties->allow_hosts_regexp = NULL;
    }
    if (org_apache_sling_security_impl_referrer_filter_properties->filter_methods) {
        config_node_property_array_free(org_apache_sling_security_impl_referrer_filter_properties->filter_methods);
        org_apache_sling_security_impl_referrer_filter_properties->filter_methods = NULL;
    }
    if (org_apache_sling_security_impl_referrer_filter_properties->exclude_agents_regexp) {
        config_node_property_array_free(org_apache_sling_security_impl_referrer_filter_properties->exclude_agents_regexp);
        org_apache_sling_security_impl_referrer_filter_properties->exclude_agents_regexp = NULL;
    }
    free(org_apache_sling_security_impl_referrer_filter_properties);
}

cJSON *org_apache_sling_security_impl_referrer_filter_properties_convertToJSON(org_apache_sling_security_impl_referrer_filter_properties_t *org_apache_sling_security_impl_referrer_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_security_impl_referrer_filter_properties->allow_empty
    if(org_apache_sling_security_impl_referrer_filter_properties->allow_empty) {
    cJSON *allow_empty_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_security_impl_referrer_filter_properties->allow_empty);
    if(allow_empty_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "allow.empty", allow_empty_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_security_impl_referrer_filter_properties->allow_hosts
    if(org_apache_sling_security_impl_referrer_filter_properties->allow_hosts) {
    cJSON *allow_hosts_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_security_impl_referrer_filter_properties->allow_hosts);
    if(allow_hosts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "allow.hosts", allow_hosts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_security_impl_referrer_filter_properties->allow_hosts_regexp
    if(org_apache_sling_security_impl_referrer_filter_properties->allow_hosts_regexp) {
    cJSON *allow_hosts_regexp_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_security_impl_referrer_filter_properties->allow_hosts_regexp);
    if(allow_hosts_regexp_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "allow.hosts.regexp", allow_hosts_regexp_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_security_impl_referrer_filter_properties->filter_methods
    if(org_apache_sling_security_impl_referrer_filter_properties->filter_methods) {
    cJSON *filter_methods_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_security_impl_referrer_filter_properties->filter_methods);
    if(filter_methods_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filter.methods", filter_methods_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_security_impl_referrer_filter_properties->exclude_agents_regexp
    if(org_apache_sling_security_impl_referrer_filter_properties->exclude_agents_regexp) {
    cJSON *exclude_agents_regexp_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_security_impl_referrer_filter_properties->exclude_agents_regexp);
    if(exclude_agents_regexp_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exclude.agents.regexp", exclude_agents_regexp_local_JSON);
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

org_apache_sling_security_impl_referrer_filter_properties_t *org_apache_sling_security_impl_referrer_filter_properties_parseFromJSON(cJSON *org_apache_sling_security_impl_referrer_filter_propertiesJSON){

    org_apache_sling_security_impl_referrer_filter_properties_t *org_apache_sling_security_impl_referrer_filter_properties_local_var = NULL;

    // define the local variable for org_apache_sling_security_impl_referrer_filter_properties->allow_empty
    config_node_property_boolean_t *allow_empty_local_nonprim = NULL;

    // define the local variable for org_apache_sling_security_impl_referrer_filter_properties->allow_hosts
    config_node_property_array_t *allow_hosts_local_nonprim = NULL;

    // define the local variable for org_apache_sling_security_impl_referrer_filter_properties->allow_hosts_regexp
    config_node_property_array_t *allow_hosts_regexp_local_nonprim = NULL;

    // define the local variable for org_apache_sling_security_impl_referrer_filter_properties->filter_methods
    config_node_property_array_t *filter_methods_local_nonprim = NULL;

    // define the local variable for org_apache_sling_security_impl_referrer_filter_properties->exclude_agents_regexp
    config_node_property_array_t *exclude_agents_regexp_local_nonprim = NULL;

    // org_apache_sling_security_impl_referrer_filter_properties->allow_empty
    cJSON *allow_empty = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_referrer_filter_propertiesJSON, "allow.empty");
    if (cJSON_IsNull(allow_empty)) {
        allow_empty = NULL;
    }
    if (allow_empty) { 
    allow_empty_local_nonprim = config_node_property_boolean_parseFromJSON(allow_empty); //nonprimitive
    }

    // org_apache_sling_security_impl_referrer_filter_properties->allow_hosts
    cJSON *allow_hosts = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_referrer_filter_propertiesJSON, "allow.hosts");
    if (cJSON_IsNull(allow_hosts)) {
        allow_hosts = NULL;
    }
    if (allow_hosts) { 
    allow_hosts_local_nonprim = config_node_property_array_parseFromJSON(allow_hosts); //nonprimitive
    }

    // org_apache_sling_security_impl_referrer_filter_properties->allow_hosts_regexp
    cJSON *allow_hosts_regexp = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_referrer_filter_propertiesJSON, "allow.hosts.regexp");
    if (cJSON_IsNull(allow_hosts_regexp)) {
        allow_hosts_regexp = NULL;
    }
    if (allow_hosts_regexp) { 
    allow_hosts_regexp_local_nonprim = config_node_property_array_parseFromJSON(allow_hosts_regexp); //nonprimitive
    }

    // org_apache_sling_security_impl_referrer_filter_properties->filter_methods
    cJSON *filter_methods = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_referrer_filter_propertiesJSON, "filter.methods");
    if (cJSON_IsNull(filter_methods)) {
        filter_methods = NULL;
    }
    if (filter_methods) { 
    filter_methods_local_nonprim = config_node_property_array_parseFromJSON(filter_methods); //nonprimitive
    }

    // org_apache_sling_security_impl_referrer_filter_properties->exclude_agents_regexp
    cJSON *exclude_agents_regexp = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_referrer_filter_propertiesJSON, "exclude.agents.regexp");
    if (cJSON_IsNull(exclude_agents_regexp)) {
        exclude_agents_regexp = NULL;
    }
    if (exclude_agents_regexp) { 
    exclude_agents_regexp_local_nonprim = config_node_property_array_parseFromJSON(exclude_agents_regexp); //nonprimitive
    }



    org_apache_sling_security_impl_referrer_filter_properties_local_var = org_apache_sling_security_impl_referrer_filter_properties_create_internal (
        allow_empty ? allow_empty_local_nonprim : NULL,
        allow_hosts ? allow_hosts_local_nonprim : NULL,
        allow_hosts_regexp ? allow_hosts_regexp_local_nonprim : NULL,
        filter_methods ? filter_methods_local_nonprim : NULL,
        exclude_agents_regexp ? exclude_agents_regexp_local_nonprim : NULL
        );

    if (!org_apache_sling_security_impl_referrer_filter_properties_local_var) {
        goto end;
    }

    return org_apache_sling_security_impl_referrer_filter_properties_local_var;
end:
    if (allow_empty_local_nonprim) {
        config_node_property_boolean_free(allow_empty_local_nonprim);
        allow_empty_local_nonprim = NULL;
    }
    if (allow_hosts_local_nonprim) {
        config_node_property_array_free(allow_hosts_local_nonprim);
        allow_hosts_local_nonprim = NULL;
    }
    if (allow_hosts_regexp_local_nonprim) {
        config_node_property_array_free(allow_hosts_regexp_local_nonprim);
        allow_hosts_regexp_local_nonprim = NULL;
    }
    if (filter_methods_local_nonprim) {
        config_node_property_array_free(filter_methods_local_nonprim);
        filter_methods_local_nonprim = NULL;
    }
    if (exclude_agents_regexp_local_nonprim) {
        config_node_property_array_free(exclude_agents_regexp_local_nonprim);
        exclude_agents_regexp_local_nonprim = NULL;
    }
    return NULL;

}
