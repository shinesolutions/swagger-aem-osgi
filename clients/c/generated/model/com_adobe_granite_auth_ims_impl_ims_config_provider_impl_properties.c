#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties.h"



static com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_create_internal(
    config_node_property_string_t *oauth_configmanager_ims_configid,
    config_node_property_string_t *ims_owning_entity,
    config_node_property_string_t *aem_instance_id,
    config_node_property_string_t *ims_service_code
    ) {
    com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var = malloc(sizeof(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t));
    if (!com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var, 0, sizeof(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t));
    com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var->oauth_configmanager_ims_configid = oauth_configmanager_ims_configid;
    com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var->ims_owning_entity = ims_owning_entity;
    com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var->aem_instance_id = aem_instance_id;
    com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var->ims_service_code = ims_service_code;
    return com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_create(
    config_node_property_string_t *oauth_configmanager_ims_configid,
    config_node_property_string_t *ims_owning_entity,
    config_node_property_string_t *aem_instance_id,
    config_node_property_string_t *ims_service_code
    ) {
    com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t *result = com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_create_internal (
        oauth_configmanager_ims_configid,
        ims_owning_entity,
        aem_instance_id,
        ims_service_code
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_free(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties) {
    if(NULL == com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties){
        return ;
    }
    if(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->oauth_configmanager_ims_configid) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->oauth_configmanager_ims_configid);
        com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->oauth_configmanager_ims_configid = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_owning_entity) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_owning_entity);
        com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_owning_entity = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->aem_instance_id) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->aem_instance_id);
        com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->aem_instance_id = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_service_code) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_service_code);
        com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_service_code = NULL;
    }
    free(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties);
}

cJSON *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_convertToJSON(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->oauth_configmanager_ims_configid
    if(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->oauth_configmanager_ims_configid) {
    cJSON *oauth_configmanager_ims_configid_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->oauth_configmanager_ims_configid);
    if(oauth_configmanager_ims_configid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.configmanager.ims.configid", oauth_configmanager_ims_configid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_owning_entity
    if(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_owning_entity) {
    cJSON *ims_owning_entity_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_owning_entity);
    if(ims_owning_entity_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ims.owningEntity", ims_owning_entity_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->aem_instance_id
    if(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->aem_instance_id) {
    cJSON *aem_instance_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->aem_instance_id);
    if(aem_instance_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "aem.instanceId", aem_instance_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_service_code
    if(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_service_code) {
    cJSON *ims_service_code_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_service_code);
    if(ims_service_code_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ims.serviceCode", ims_service_code_local_JSON);
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

com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_parseFromJSON(cJSON *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_propertiesJSON){

    com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->oauth_configmanager_ims_configid
    config_node_property_string_t *oauth_configmanager_ims_configid_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_owning_entity
    config_node_property_string_t *ims_owning_entity_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->aem_instance_id
    config_node_property_string_t *aem_instance_id_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_service_code
    config_node_property_string_t *ims_service_code_local_nonprim = NULL;

    // com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->oauth_configmanager_ims_configid
    cJSON *oauth_configmanager_ims_configid = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_propertiesJSON, "oauth.configmanager.ims.configid");
    if (cJSON_IsNull(oauth_configmanager_ims_configid)) {
        oauth_configmanager_ims_configid = NULL;
    }
    if (oauth_configmanager_ims_configid) { 
    oauth_configmanager_ims_configid_local_nonprim = config_node_property_string_parseFromJSON(oauth_configmanager_ims_configid); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_owning_entity
    cJSON *ims_owning_entity = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_propertiesJSON, "ims.owningEntity");
    if (cJSON_IsNull(ims_owning_entity)) {
        ims_owning_entity = NULL;
    }
    if (ims_owning_entity) { 
    ims_owning_entity_local_nonprim = config_node_property_string_parseFromJSON(ims_owning_entity); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->aem_instance_id
    cJSON *aem_instance_id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_propertiesJSON, "aem.instanceId");
    if (cJSON_IsNull(aem_instance_id)) {
        aem_instance_id = NULL;
    }
    if (aem_instance_id) { 
    aem_instance_id_local_nonprim = config_node_property_string_parseFromJSON(aem_instance_id); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties->ims_service_code
    cJSON *ims_service_code = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_propertiesJSON, "ims.serviceCode");
    if (cJSON_IsNull(ims_service_code)) {
        ims_service_code = NULL;
    }
    if (ims_service_code) { 
    ims_service_code_local_nonprim = config_node_property_string_parseFromJSON(ims_service_code); //nonprimitive
    }



    com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var = com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_create_internal (
        oauth_configmanager_ims_configid ? oauth_configmanager_ims_configid_local_nonprim : NULL,
        ims_owning_entity ? ims_owning_entity_local_nonprim : NULL,
        aem_instance_id ? aem_instance_id_local_nonprim : NULL,
        ims_service_code ? ims_service_code_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_local_var;
end:
    if (oauth_configmanager_ims_configid_local_nonprim) {
        config_node_property_string_free(oauth_configmanager_ims_configid_local_nonprim);
        oauth_configmanager_ims_configid_local_nonprim = NULL;
    }
    if (ims_owning_entity_local_nonprim) {
        config_node_property_string_free(ims_owning_entity_local_nonprim);
        ims_owning_entity_local_nonprim = NULL;
    }
    if (aem_instance_id_local_nonprim) {
        config_node_property_string_free(aem_instance_id_local_nonprim);
        aem_instance_id_local_nonprim = NULL;
    }
    if (ims_service_code_local_nonprim) {
        config_node_property_string_free(ims_service_code_local_nonprim);
        ims_service_code_local_nonprim = NULL;
    }
    return NULL;

}
