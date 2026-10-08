#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_jcr_base_internal_login_admin_whitelist_properties.h"



static org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_create_internal(
    config_node_property_boolean_t *whitelist_bypass,
    config_node_property_string_t *whitelist_bundles_regexp
    ) {
    org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_local_var = malloc(sizeof(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t));
    if (!org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_local_var, 0, sizeof(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t));
    org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_local_var->_library_owned = 1;
    org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_local_var->whitelist_bypass = whitelist_bypass;
    org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_local_var->whitelist_bundles_regexp = whitelist_bundles_regexp;
    return org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_create(
    config_node_property_boolean_t *whitelist_bypass,
    config_node_property_string_t *whitelist_bundles_regexp
    ) {
    org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t *result = org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_create_internal (
        whitelist_bypass,
        whitelist_bundles_regexp
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_free(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties) {
    if(NULL == org_apache_sling_jcr_base_internal_login_admin_whitelist_properties){
        return ;
    }
    if(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bypass) {
        config_node_property_boolean_free(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bypass);
        org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bypass = NULL;
    }
    if (org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bundles_regexp) {
        config_node_property_string_free(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bundles_regexp);
        org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bundles_regexp = NULL;
    }
    free(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties);
}

cJSON *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_convertToJSON(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bypass
    if(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bypass) {
    cJSON *whitelist_bypass_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bypass);
    if(whitelist_bypass_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "whitelist.bypass", whitelist_bypass_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bundles_regexp
    if(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bundles_regexp) {
    cJSON *whitelist_bundles_regexp_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bundles_regexp);
    if(whitelist_bundles_regexp_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "whitelist.bundles.regexp", whitelist_bundles_regexp_local_JSON);
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

org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_parseFromJSON(cJSON *org_apache_sling_jcr_base_internal_login_admin_whitelist_propertiesJSON){

    org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_local_var = NULL;

    // define the local variable for org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bypass
    config_node_property_boolean_t *whitelist_bypass_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bundles_regexp
    config_node_property_string_t *whitelist_bundles_regexp_local_nonprim = NULL;

    // org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bypass
    cJSON *whitelist_bypass = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_base_internal_login_admin_whitelist_propertiesJSON, "whitelist.bypass");
    if (cJSON_IsNull(whitelist_bypass)) {
        whitelist_bypass = NULL;
    }
    if (whitelist_bypass) { 
    whitelist_bypass_local_nonprim = config_node_property_boolean_parseFromJSON(whitelist_bypass); //nonprimitive
    }

    // org_apache_sling_jcr_base_internal_login_admin_whitelist_properties->whitelist_bundles_regexp
    cJSON *whitelist_bundles_regexp = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_base_internal_login_admin_whitelist_propertiesJSON, "whitelist.bundles.regexp");
    if (cJSON_IsNull(whitelist_bundles_regexp)) {
        whitelist_bundles_regexp = NULL;
    }
    if (whitelist_bundles_regexp) { 
    whitelist_bundles_regexp_local_nonprim = config_node_property_string_parseFromJSON(whitelist_bundles_regexp); //nonprimitive
    }



    org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_local_var = org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_create_internal (
        whitelist_bypass ? whitelist_bypass_local_nonprim : NULL,
        whitelist_bundles_regexp ? whitelist_bundles_regexp_local_nonprim : NULL
        );

    if (!org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_local_var) {
        goto end;
    }

    return org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_local_var;
end:
    if (whitelist_bypass_local_nonprim) {
        config_node_property_boolean_free(whitelist_bypass_local_nonprim);
        whitelist_bypass_local_nonprim = NULL;
    }
    if (whitelist_bundles_regexp_local_nonprim) {
        config_node_property_string_free(whitelist_bundles_regexp_local_nonprim);
        whitelist_bundles_regexp_local_nonprim = NULL;
    }
    return NULL;

}
