#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties.h"



static org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_t *org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_create_internal(
    config_node_property_boolean_t *allow_only_system_user
    ) {
    org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_t *org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_local_var = malloc(sizeof(org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_t));
    if (!org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_local_var, 0, sizeof(org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_t));
    org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_local_var->_library_owned = 1;
    org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_local_var->allow_only_system_user = allow_only_system_user;
    return org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_t *org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_create(
    config_node_property_boolean_t *allow_only_system_user
    ) {
    org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_t *result = org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_create_internal (
        allow_only_system_user
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_free(org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_t *org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties) {
    if(NULL == org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties){
        return ;
    }
    if(org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties->allow_only_system_user) {
        config_node_property_boolean_free(org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties->allow_only_system_user);
        org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties->allow_only_system_user = NULL;
    }
    free(org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties);
}

cJSON *org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_t *org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties->allow_only_system_user
    if(org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties->allow_only_system_user) {
    cJSON *allow_only_system_user_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties->allow_only_system_user);
    if(allow_only_system_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "allow.only.system.user", allow_only_system_user_local_JSON);
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

org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_t *org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_parseFromJSON(cJSON *org_apache_sling_jcr_resource_internal_jcr_system_user_validator_propertiesJSON){

    org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_t *org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_local_var = NULL;

    // define the local variable for org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties->allow_only_system_user
    config_node_property_boolean_t *allow_only_system_user_local_nonprim = NULL;

    // org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties->allow_only_system_user
    cJSON *allow_only_system_user = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resource_internal_jcr_system_user_validator_propertiesJSON, "allow.only.system.user");
    if (cJSON_IsNull(allow_only_system_user)) {
        allow_only_system_user = NULL;
    }
    if (allow_only_system_user) { 
    allow_only_system_user_local_nonprim = config_node_property_boolean_parseFromJSON(allow_only_system_user); //nonprimitive
    }



    org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_local_var = org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_create_internal (
        allow_only_system_user ? allow_only_system_user_local_nonprim : NULL
        );

    if (!org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_local_var) {
        goto end;
    }

    return org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties_local_var;
end:
    if (allow_only_system_user_local_nonprim) {
        config_node_property_boolean_free(allow_only_system_user_local_nonprim);
        allow_only_system_user_local_nonprim = NULL;
    }
    return NULL;

}
