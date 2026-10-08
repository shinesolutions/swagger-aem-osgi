#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties.h"



static org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_t *org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_create_internal(
    config_node_property_array_t *required_service_pids,
    config_node_property_drop_down_t *authorization_composition_type
    ) {
    org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_t *org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_t));
    if (!org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_t));
    org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_local_var->required_service_pids = required_service_pids;
    org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_local_var->authorization_composition_type = authorization_composition_type;
    return org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_t *org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_create(
    config_node_property_array_t *required_service_pids,
    config_node_property_drop_down_t *authorization_composition_type
    ) {
    org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_t *result = org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_create_internal (
        required_service_pids,
        authorization_composition_type
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_free(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_t *org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties) {
    if(NULL == org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->required_service_pids) {
        config_node_property_array_free(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->required_service_pids);
        org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->required_service_pids = NULL;
    }
    if (org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->authorization_composition_type) {
        config_node_property_drop_down_free(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->authorization_composition_type);
        org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->authorization_composition_type = NULL;
    }
    free(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties);
}

cJSON *org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_convertToJSON(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_t *org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->required_service_pids
    if(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->required_service_pids) {
    cJSON *required_service_pids_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->required_service_pids);
    if(required_service_pids_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "requiredServicePids", required_service_pids_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->authorization_composition_type
    if(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->authorization_composition_type) {
    cJSON *authorization_composition_type_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->authorization_composition_type);
    if(authorization_composition_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "authorizationCompositionType", authorization_composition_type_local_JSON);
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

org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_t *org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_security_internal_security_provider_registrati_propertiesJSON){

    org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_t *org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->required_service_pids
    config_node_property_array_t *required_service_pids_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->authorization_composition_type
    config_node_property_drop_down_t *authorization_composition_type_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->required_service_pids
    cJSON *required_service_pids = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_propertiesJSON, "requiredServicePids");
    if (cJSON_IsNull(required_service_pids)) {
        required_service_pids = NULL;
    }
    if (required_service_pids) { 
    required_service_pids_local_nonprim = config_node_property_array_parseFromJSON(required_service_pids); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties->authorization_composition_type
    cJSON *authorization_composition_type = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_internal_security_provider_registrati_propertiesJSON, "authorizationCompositionType");
    if (cJSON_IsNull(authorization_composition_type)) {
        authorization_composition_type = NULL;
    }
    if (authorization_composition_type) { 
    authorization_composition_type_local_nonprim = config_node_property_drop_down_parseFromJSON(authorization_composition_type); //nonprimitive
    }



    org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_local_var = org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_create_internal (
        required_service_pids ? required_service_pids_local_nonprim : NULL,
        authorization_composition_type ? authorization_composition_type_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties_local_var;
end:
    if (required_service_pids_local_nonprim) {
        config_node_property_array_free(required_service_pids_local_nonprim);
        required_service_pids_local_nonprim = NULL;
    }
    if (authorization_composition_type_local_nonprim) {
        config_node_property_drop_down_free(authorization_composition_type_local_nonprim);
        authorization_composition_type_local_nonprim = NULL;
    }
    return NULL;

}
