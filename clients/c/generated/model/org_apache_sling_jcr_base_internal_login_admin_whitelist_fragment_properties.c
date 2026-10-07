#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties.h"



static org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_create_internal(
    config_node_property_string_t *whitelist_name,
    config_node_property_array_t *whitelist_bundles
    ) {
    org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_local_var = malloc(sizeof(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_t));
    if (!org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_local_var, 0, sizeof(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_t));
    org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_local_var->_library_owned = 1;
    org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_local_var->whitelist_name = whitelist_name;
    org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_local_var->whitelist_bundles = whitelist_bundles;
    return org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_create(
    config_node_property_string_t *whitelist_name,
    config_node_property_array_t *whitelist_bundles
    ) {
    org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_t *result = org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_create_internal (
        whitelist_name,
        whitelist_bundles
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_free(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties) {
    if(NULL == org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties){
        return ;
    }
    if(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_name) {
        config_node_property_string_free(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_name);
        org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_name = NULL;
    }
    if (org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_bundles) {
        config_node_property_array_free(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_bundles);
        org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_bundles = NULL;
    }
    free(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties);
}

cJSON *org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_convertToJSON(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_name
    if(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_name) {
    cJSON *whitelist_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_name);
    if(whitelist_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "whitelist.name", whitelist_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_bundles
    if(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_bundles) {
    cJSON *whitelist_bundles_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_bundles);
    if(whitelist_bundles_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "whitelist.bundles", whitelist_bundles_local_JSON);
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

org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_parseFromJSON(cJSON *org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_propertiesJSON){

    org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_t *org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_local_var = NULL;

    // define the local variable for org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_name
    config_node_property_string_t *whitelist_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_bundles
    config_node_property_array_t *whitelist_bundles_local_nonprim = NULL;

    // org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_name
    cJSON *whitelist_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_propertiesJSON, "whitelist.name");
    if (cJSON_IsNull(whitelist_name)) {
        whitelist_name = NULL;
    }
    if (whitelist_name) { 
    whitelist_name_local_nonprim = config_node_property_string_parseFromJSON(whitelist_name); //nonprimitive
    }

    // org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties->whitelist_bundles
    cJSON *whitelist_bundles = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_propertiesJSON, "whitelist.bundles");
    if (cJSON_IsNull(whitelist_bundles)) {
        whitelist_bundles = NULL;
    }
    if (whitelist_bundles) { 
    whitelist_bundles_local_nonprim = config_node_property_array_parseFromJSON(whitelist_bundles); //nonprimitive
    }



    org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_local_var = org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_create_internal (
        whitelist_name ? whitelist_name_local_nonprim : NULL,
        whitelist_bundles ? whitelist_bundles_local_nonprim : NULL
        );

    if (!org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_local_var) {
        goto end;
    }

    return org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties_local_var;
end:
    if (whitelist_name_local_nonprim) {
        config_node_property_string_free(whitelist_name_local_nonprim);
        whitelist_name_local_nonprim = NULL;
    }
    if (whitelist_bundles_local_nonprim) {
        config_node_property_array_free(whitelist_bundles_local_nonprim);
        whitelist_bundles_local_nonprim = NULL;
    }
    return NULL;

}
