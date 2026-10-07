#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_xss_impl_xss_filter_impl_properties.h"



static org_apache_sling_xss_impl_xss_filter_impl_properties_t *org_apache_sling_xss_impl_xss_filter_impl_properties_create_internal(
    config_node_property_string_t *policy_path
    ) {
    org_apache_sling_xss_impl_xss_filter_impl_properties_t *org_apache_sling_xss_impl_xss_filter_impl_properties_local_var = malloc(sizeof(org_apache_sling_xss_impl_xss_filter_impl_properties_t));
    if (!org_apache_sling_xss_impl_xss_filter_impl_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_xss_impl_xss_filter_impl_properties_local_var, 0, sizeof(org_apache_sling_xss_impl_xss_filter_impl_properties_t));
    org_apache_sling_xss_impl_xss_filter_impl_properties_local_var->_library_owned = 1;
    org_apache_sling_xss_impl_xss_filter_impl_properties_local_var->policy_path = policy_path;
    return org_apache_sling_xss_impl_xss_filter_impl_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_xss_impl_xss_filter_impl_properties_t *org_apache_sling_xss_impl_xss_filter_impl_properties_create(
    config_node_property_string_t *policy_path
    ) {
    org_apache_sling_xss_impl_xss_filter_impl_properties_t *result = org_apache_sling_xss_impl_xss_filter_impl_properties_create_internal (
        policy_path
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_xss_impl_xss_filter_impl_properties_free(org_apache_sling_xss_impl_xss_filter_impl_properties_t *org_apache_sling_xss_impl_xss_filter_impl_properties) {
    if(NULL == org_apache_sling_xss_impl_xss_filter_impl_properties){
        return ;
    }
    if(org_apache_sling_xss_impl_xss_filter_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_xss_impl_xss_filter_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_xss_impl_xss_filter_impl_properties->policy_path) {
        config_node_property_string_free(org_apache_sling_xss_impl_xss_filter_impl_properties->policy_path);
        org_apache_sling_xss_impl_xss_filter_impl_properties->policy_path = NULL;
    }
    free(org_apache_sling_xss_impl_xss_filter_impl_properties);
}

cJSON *org_apache_sling_xss_impl_xss_filter_impl_properties_convertToJSON(org_apache_sling_xss_impl_xss_filter_impl_properties_t *org_apache_sling_xss_impl_xss_filter_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_xss_impl_xss_filter_impl_properties->policy_path
    if(org_apache_sling_xss_impl_xss_filter_impl_properties->policy_path) {
    cJSON *policy_path_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_xss_impl_xss_filter_impl_properties->policy_path);
    if(policy_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "policyPath", policy_path_local_JSON);
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

org_apache_sling_xss_impl_xss_filter_impl_properties_t *org_apache_sling_xss_impl_xss_filter_impl_properties_parseFromJSON(cJSON *org_apache_sling_xss_impl_xss_filter_impl_propertiesJSON){

    org_apache_sling_xss_impl_xss_filter_impl_properties_t *org_apache_sling_xss_impl_xss_filter_impl_properties_local_var = NULL;

    // define the local variable for org_apache_sling_xss_impl_xss_filter_impl_properties->policy_path
    config_node_property_string_t *policy_path_local_nonprim = NULL;

    // org_apache_sling_xss_impl_xss_filter_impl_properties->policy_path
    cJSON *policy_path = cJSON_GetObjectItemCaseSensitive(org_apache_sling_xss_impl_xss_filter_impl_propertiesJSON, "policyPath");
    if (cJSON_IsNull(policy_path)) {
        policy_path = NULL;
    }
    if (policy_path) { 
    policy_path_local_nonprim = config_node_property_string_parseFromJSON(policy_path); //nonprimitive
    }



    org_apache_sling_xss_impl_xss_filter_impl_properties_local_var = org_apache_sling_xss_impl_xss_filter_impl_properties_create_internal (
        policy_path ? policy_path_local_nonprim : NULL
        );

    if (!org_apache_sling_xss_impl_xss_filter_impl_properties_local_var) {
        goto end;
    }

    return org_apache_sling_xss_impl_xss_filter_impl_properties_local_var;
end:
    if (policy_path_local_nonprim) {
        config_node_property_string_free(policy_path_local_nonprim);
        policy_path_local_nonprim = NULL;
    }
    return NULL;

}
