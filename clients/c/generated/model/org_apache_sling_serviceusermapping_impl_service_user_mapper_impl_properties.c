#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties.h"



static org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_t *org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_create_internal(
    config_node_property_array_t *user_mapping,
    config_node_property_string_t *user_default,
    config_node_property_boolean_t *user_enable_default_mapping,
    config_node_property_boolean_t *require_validation
    ) {
    org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_t *org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var = malloc(sizeof(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_t));
    if (!org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var, 0, sizeof(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_t));
    org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var->_library_owned = 1;
    org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var->user_mapping = user_mapping;
    org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var->user_default = user_default;
    org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var->user_enable_default_mapping = user_enable_default_mapping;
    org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var->require_validation = require_validation;
    return org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_t *org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_create(
    config_node_property_array_t *user_mapping,
    config_node_property_string_t *user_default,
    config_node_property_boolean_t *user_enable_default_mapping,
    config_node_property_boolean_t *require_validation
    ) {
    org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_t *result = org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_create_internal (
        user_mapping,
        user_default,
        user_enable_default_mapping,
        require_validation
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_free(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_t *org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties) {
    if(NULL == org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties){
        return ;
    }
    if(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_mapping) {
        config_node_property_array_free(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_mapping);
        org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_mapping = NULL;
    }
    if (org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_default) {
        config_node_property_string_free(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_default);
        org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_default = NULL;
    }
    if (org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_enable_default_mapping) {
        config_node_property_boolean_free(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_enable_default_mapping);
        org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_enable_default_mapping = NULL;
    }
    if (org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->require_validation) {
        config_node_property_boolean_free(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->require_validation);
        org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->require_validation = NULL;
    }
    free(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties);
}

cJSON *org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_convertToJSON(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_t *org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_mapping
    if(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_mapping) {
    cJSON *user_mapping_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_mapping);
    if(user_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.mapping", user_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_default
    if(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_default) {
    cJSON *user_default_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_default);
    if(user_default_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.default", user_default_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_enable_default_mapping
    if(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_enable_default_mapping) {
    cJSON *user_enable_default_mapping_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_enable_default_mapping);
    if(user_enable_default_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.enable.default.mapping", user_enable_default_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->require_validation
    if(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->require_validation) {
    cJSON *require_validation_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->require_validation);
    if(require_validation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "require.validation", require_validation_local_JSON);
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

org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_t *org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_parseFromJSON(cJSON *org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_propertiesJSON){

    org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_t *org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var = NULL;

    // define the local variable for org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_mapping
    config_node_property_array_t *user_mapping_local_nonprim = NULL;

    // define the local variable for org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_default
    config_node_property_string_t *user_default_local_nonprim = NULL;

    // define the local variable for org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_enable_default_mapping
    config_node_property_boolean_t *user_enable_default_mapping_local_nonprim = NULL;

    // define the local variable for org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->require_validation
    config_node_property_boolean_t *require_validation_local_nonprim = NULL;

    // org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_mapping
    cJSON *user_mapping = cJSON_GetObjectItemCaseSensitive(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_propertiesJSON, "user.mapping");
    if (cJSON_IsNull(user_mapping)) {
        user_mapping = NULL;
    }
    if (user_mapping) { 
    user_mapping_local_nonprim = config_node_property_array_parseFromJSON(user_mapping); //nonprimitive
    }

    // org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_default
    cJSON *user_default = cJSON_GetObjectItemCaseSensitive(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_propertiesJSON, "user.default");
    if (cJSON_IsNull(user_default)) {
        user_default = NULL;
    }
    if (user_default) { 
    user_default_local_nonprim = config_node_property_string_parseFromJSON(user_default); //nonprimitive
    }

    // org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->user_enable_default_mapping
    cJSON *user_enable_default_mapping = cJSON_GetObjectItemCaseSensitive(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_propertiesJSON, "user.enable.default.mapping");
    if (cJSON_IsNull(user_enable_default_mapping)) {
        user_enable_default_mapping = NULL;
    }
    if (user_enable_default_mapping) { 
    user_enable_default_mapping_local_nonprim = config_node_property_boolean_parseFromJSON(user_enable_default_mapping); //nonprimitive
    }

    // org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties->require_validation
    cJSON *require_validation = cJSON_GetObjectItemCaseSensitive(org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_propertiesJSON, "require.validation");
    if (cJSON_IsNull(require_validation)) {
        require_validation = NULL;
    }
    if (require_validation) { 
    require_validation_local_nonprim = config_node_property_boolean_parseFromJSON(require_validation); //nonprimitive
    }



    org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var = org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_create_internal (
        user_mapping ? user_mapping_local_nonprim : NULL,
        user_default ? user_default_local_nonprim : NULL,
        user_enable_default_mapping ? user_enable_default_mapping_local_nonprim : NULL,
        require_validation ? require_validation_local_nonprim : NULL
        );

    if (!org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var) {
        goto end;
    }

    return org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties_local_var;
end:
    if (user_mapping_local_nonprim) {
        config_node_property_array_free(user_mapping_local_nonprim);
        user_mapping_local_nonprim = NULL;
    }
    if (user_default_local_nonprim) {
        config_node_property_string_free(user_default_local_nonprim);
        user_default_local_nonprim = NULL;
    }
    if (user_enable_default_mapping_local_nonprim) {
        config_node_property_boolean_free(user_enable_default_mapping_local_nonprim);
        user_enable_default_mapping_local_nonprim = NULL;
    }
    if (require_validation_local_nonprim) {
        config_node_property_boolean_free(require_validation_local_nonprim);
        require_validation_local_nonprim = NULL;
    }
    return NULL;

}
