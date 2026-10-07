#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties.h"



static org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_t *org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_create_internal(
    config_node_property_string_t *servlet_path,
    config_node_property_boolean_t *disabled,
    config_node_property_string_t *cors_access_control_allow_origin
    ) {
    org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_t *org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_local_var = malloc(sizeof(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_t));
    if (!org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_local_var, 0, sizeof(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_t));
    org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_local_var->_library_owned = 1;
    org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_local_var->servlet_path = servlet_path;
    org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_local_var->disabled = disabled;
    org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_local_var->cors_access_control_allow_origin = cors_access_control_allow_origin;
    return org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_t *org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_create(
    config_node_property_string_t *servlet_path,
    config_node_property_boolean_t *disabled,
    config_node_property_string_t *cors_access_control_allow_origin
    ) {
    org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_t *result = org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_create_internal (
        servlet_path,
        disabled,
        cors_access_control_allow_origin
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_free(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_t *org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties) {
    if(NULL == org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties){
        return ;
    }
    if(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->servlet_path) {
        config_node_property_string_free(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->servlet_path);
        org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->servlet_path = NULL;
    }
    if (org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->disabled) {
        config_node_property_boolean_free(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->disabled);
        org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->disabled = NULL;
    }
    if (org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->cors_access_control_allow_origin) {
        config_node_property_string_free(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->cors_access_control_allow_origin);
        org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->cors_access_control_allow_origin = NULL;
    }
    free(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties);
}

cJSON *org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_convertToJSON(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_t *org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->servlet_path
    if(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->servlet_path) {
    cJSON *servlet_path_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->servlet_path);
    if(servlet_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servletPath", servlet_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->disabled
    if(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->disabled) {
    cJSON *disabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->disabled);
    if(disabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "disabled", disabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->cors_access_control_allow_origin
    if(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->cors_access_control_allow_origin) {
    cJSON *cors_access_control_allow_origin_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->cors_access_control_allow_origin);
    if(cors_access_control_allow_origin_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cors.accessControlAllowOrigin", cors_access_control_allow_origin_local_JSON);
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

org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_t *org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_parseFromJSON(cJSON *org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_propertiesJSON){

    org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_t *org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_local_var = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->servlet_path
    config_node_property_string_t *servlet_path_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->disabled
    config_node_property_boolean_t *disabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->cors_access_control_allow_origin
    config_node_property_string_t *cors_access_control_allow_origin_local_nonprim = NULL;

    // org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->servlet_path
    cJSON *servlet_path = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_propertiesJSON, "servletPath");
    if (cJSON_IsNull(servlet_path)) {
        servlet_path = NULL;
    }
    if (servlet_path) { 
    servlet_path_local_nonprim = config_node_property_string_parseFromJSON(servlet_path); //nonprimitive
    }

    // org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->disabled
    cJSON *disabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_propertiesJSON, "disabled");
    if (cJSON_IsNull(disabled)) {
        disabled = NULL;
    }
    if (disabled) { 
    disabled_local_nonprim = config_node_property_boolean_parseFromJSON(disabled); //nonprimitive
    }

    // org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties->cors_access_control_allow_origin
    cJSON *cors_access_control_allow_origin = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_propertiesJSON, "cors.accessControlAllowOrigin");
    if (cJSON_IsNull(cors_access_control_allow_origin)) {
        cors_access_control_allow_origin = NULL;
    }
    if (cors_access_control_allow_origin) { 
    cors_access_control_allow_origin_local_nonprim = config_node_property_string_parseFromJSON(cors_access_control_allow_origin); //nonprimitive
    }



    org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_local_var = org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_create_internal (
        servlet_path ? servlet_path_local_nonprim : NULL,
        disabled ? disabled_local_nonprim : NULL,
        cors_access_control_allow_origin ? cors_access_control_allow_origin_local_nonprim : NULL
        );

    if (!org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_local_var) {
        goto end;
    }

    return org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_local_var;
end:
    if (servlet_path_local_nonprim) {
        config_node_property_string_free(servlet_path_local_nonprim);
        servlet_path_local_nonprim = NULL;
    }
    if (disabled_local_nonprim) {
        config_node_property_boolean_free(disabled_local_nonprim);
        disabled_local_nonprim = NULL;
    }
    if (cors_access_control_allow_origin_local_nonprim) {
        config_node_property_string_free(cors_access_control_allow_origin_local_nonprim);
        cors_access_control_allow_origin_local_nonprim = NULL;
    }
    return NULL;

}
