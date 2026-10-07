#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties.h"



static org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_t *org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_create_internal(
    config_node_property_boolean_t *log_stacktrace_onclose
    ) {
    org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_t *org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_local_var = malloc(sizeof(org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_t));
    if (!org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_local_var, 0, sizeof(org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_t));
    org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_local_var->_library_owned = 1;
    org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_local_var->log_stacktrace_onclose = log_stacktrace_onclose;
    return org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_t *org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_create(
    config_node_property_boolean_t *log_stacktrace_onclose
    ) {
    org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_t *result = org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_create_internal (
        log_stacktrace_onclose
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_free(org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_t *org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties) {
    if(NULL == org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties){
        return ;
    }
    if(org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties->log_stacktrace_onclose) {
        config_node_property_boolean_free(org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties->log_stacktrace_onclose);
        org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties->log_stacktrace_onclose = NULL;
    }
    free(org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties);
}

cJSON *org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_convertToJSON(org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_t *org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties->log_stacktrace_onclose
    if(org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties->log_stacktrace_onclose) {
    cJSON *log_stacktrace_onclose_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties->log_stacktrace_onclose);
    if(log_stacktrace_onclose_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "log.stacktrace.onclose", log_stacktrace_onclose_local_JSON);
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

org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_t *org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_parseFromJSON(cJSON *org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_propertiesJSON){

    org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_t *org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_local_var = NULL;

    // define the local variable for org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties->log_stacktrace_onclose
    config_node_property_boolean_t *log_stacktrace_onclose_local_nonprim = NULL;

    // org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties->log_stacktrace_onclose
    cJSON *log_stacktrace_onclose = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_propertiesJSON, "log.stacktrace.onclose");
    if (cJSON_IsNull(log_stacktrace_onclose)) {
        log_stacktrace_onclose = NULL;
    }
    if (log_stacktrace_onclose) { 
    log_stacktrace_onclose_local_nonprim = config_node_property_boolean_parseFromJSON(log_stacktrace_onclose); //nonprimitive
    }



    org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_local_var = org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_create_internal (
        log_stacktrace_onclose ? log_stacktrace_onclose_local_nonprim : NULL
        );

    if (!org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_local_var) {
        goto end;
    }

    return org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties_local_var;
end:
    if (log_stacktrace_onclose_local_nonprim) {
        config_node_property_boolean_free(log_stacktrace_onclose_local_nonprim);
        log_stacktrace_onclose_local_nonprim = NULL;
    }
    return NULL;

}
