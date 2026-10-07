#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_ims_impl_ims_provider_impl_properties.h"



static com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_create_internal(
    config_node_property_string_t *oauth_provider_id,
    config_node_property_string_t *oauth_provider_ims_authorization_url,
    config_node_property_string_t *oauth_provider_ims_token_url,
    config_node_property_string_t *oauth_provider_ims_profile_url,
    config_node_property_array_t *oauth_provider_ims_extended_details_urls,
    config_node_property_string_t *oauth_provider_ims_validate_token_url,
    config_node_property_string_t *oauth_provider_ims_session_property,
    config_node_property_string_t *oauth_provider_ims_service_token_client_id,
    config_node_property_string_t *oauth_provider_ims_service_token_client_secret,
    config_node_property_string_t *oauth_provider_ims_service_token,
    config_node_property_string_t *ims_org_ref,
    config_node_property_array_t *ims_group_mapping,
    config_node_property_boolean_t *oauth_provider_ims_only_license_group
    ) {
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var = malloc(sizeof(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t));
    if (!com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var, 0, sizeof(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t));
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->oauth_provider_id = oauth_provider_id;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->oauth_provider_ims_authorization_url = oauth_provider_ims_authorization_url;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->oauth_provider_ims_token_url = oauth_provider_ims_token_url;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->oauth_provider_ims_profile_url = oauth_provider_ims_profile_url;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->oauth_provider_ims_extended_details_urls = oauth_provider_ims_extended_details_urls;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->oauth_provider_ims_validate_token_url = oauth_provider_ims_validate_token_url;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->oauth_provider_ims_session_property = oauth_provider_ims_session_property;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->oauth_provider_ims_service_token_client_id = oauth_provider_ims_service_token_client_id;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->oauth_provider_ims_service_token_client_secret = oauth_provider_ims_service_token_client_secret;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->oauth_provider_ims_service_token = oauth_provider_ims_service_token;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->ims_org_ref = ims_org_ref;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->ims_group_mapping = ims_group_mapping;
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var->oauth_provider_ims_only_license_group = oauth_provider_ims_only_license_group;
    return com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_create(
    config_node_property_string_t *oauth_provider_id,
    config_node_property_string_t *oauth_provider_ims_authorization_url,
    config_node_property_string_t *oauth_provider_ims_token_url,
    config_node_property_string_t *oauth_provider_ims_profile_url,
    config_node_property_array_t *oauth_provider_ims_extended_details_urls,
    config_node_property_string_t *oauth_provider_ims_validate_token_url,
    config_node_property_string_t *oauth_provider_ims_session_property,
    config_node_property_string_t *oauth_provider_ims_service_token_client_id,
    config_node_property_string_t *oauth_provider_ims_service_token_client_secret,
    config_node_property_string_t *oauth_provider_ims_service_token,
    config_node_property_string_t *ims_org_ref,
    config_node_property_array_t *ims_group_mapping,
    config_node_property_boolean_t *oauth_provider_ims_only_license_group
    ) {
    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t *result = com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_create_internal (
        oauth_provider_id,
        oauth_provider_ims_authorization_url,
        oauth_provider_ims_token_url,
        oauth_provider_ims_profile_url,
        oauth_provider_ims_extended_details_urls,
        oauth_provider_ims_validate_token_url,
        oauth_provider_ims_session_property,
        oauth_provider_ims_service_token_client_id,
        oauth_provider_ims_service_token_client_secret,
        oauth_provider_ims_service_token,
        ims_org_ref,
        ims_group_mapping,
        oauth_provider_ims_only_license_group
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties) {
    if(NULL == com_adobe_granite_auth_ims_impl_ims_provider_impl_properties){
        return ;
    }
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_id) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_id);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_id = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_authorization_url) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_authorization_url);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_authorization_url = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_token_url) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_token_url);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_token_url = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_profile_url) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_profile_url);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_profile_url = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_extended_details_urls) {
        config_node_property_array_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_extended_details_urls);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_extended_details_urls = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_validate_token_url) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_validate_token_url);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_validate_token_url = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_session_property) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_session_property);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_session_property = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_id) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_id);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_id = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_secret) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_secret);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_secret = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_org_ref) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_org_ref);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_org_ref = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_group_mapping) {
        config_node_property_array_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_group_mapping);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_group_mapping = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_only_license_group) {
        config_node_property_boolean_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_only_license_group);
        com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_only_license_group = NULL;
    }
    free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties);
}

cJSON *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_id
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_id) {
    cJSON *oauth_provider_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_id);
    if(oauth_provider_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.id", oauth_provider_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_authorization_url
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_authorization_url) {
    cJSON *oauth_provider_ims_authorization_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_authorization_url);
    if(oauth_provider_ims_authorization_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.ims.authorization.url", oauth_provider_ims_authorization_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_token_url
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_token_url) {
    cJSON *oauth_provider_ims_token_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_token_url);
    if(oauth_provider_ims_token_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.ims.token.url", oauth_provider_ims_token_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_profile_url
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_profile_url) {
    cJSON *oauth_provider_ims_profile_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_profile_url);
    if(oauth_provider_ims_profile_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.ims.profile.url", oauth_provider_ims_profile_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_extended_details_urls
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_extended_details_urls) {
    cJSON *oauth_provider_ims_extended_details_urls_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_extended_details_urls);
    if(oauth_provider_ims_extended_details_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.ims.extended.details.urls", oauth_provider_ims_extended_details_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_validate_token_url
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_validate_token_url) {
    cJSON *oauth_provider_ims_validate_token_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_validate_token_url);
    if(oauth_provider_ims_validate_token_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.ims.validate.token.url", oauth_provider_ims_validate_token_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_session_property
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_session_property) {
    cJSON *oauth_provider_ims_session_property_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_session_property);
    if(oauth_provider_ims_session_property_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.ims.session.property", oauth_provider_ims_session_property_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_id
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_id) {
    cJSON *oauth_provider_ims_service_token_client_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_id);
    if(oauth_provider_ims_service_token_client_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.ims.service.token.client.id", oauth_provider_ims_service_token_client_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_secret
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_secret) {
    cJSON *oauth_provider_ims_service_token_client_secret_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_secret);
    if(oauth_provider_ims_service_token_client_secret_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.ims.service.token.client.secret", oauth_provider_ims_service_token_client_secret_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token) {
    cJSON *oauth_provider_ims_service_token_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token);
    if(oauth_provider_ims_service_token_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.ims.service.token", oauth_provider_ims_service_token_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_org_ref
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_org_ref) {
    cJSON *ims_org_ref_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_org_ref);
    if(ims_org_ref_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ims.org.ref", ims_org_ref_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_group_mapping
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_group_mapping) {
    cJSON *ims_group_mapping_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_group_mapping);
    if(ims_group_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ims.group.mapping", ims_group_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_only_license_group
    if(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_only_license_group) {
    cJSON *oauth_provider_ims_only_license_group_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_only_license_group);
    if(oauth_provider_ims_only_license_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.ims.only.license.group", oauth_provider_ims_only_license_group_local_JSON);
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

com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_parseFromJSON(cJSON *com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON){

    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_id
    config_node_property_string_t *oauth_provider_id_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_authorization_url
    config_node_property_string_t *oauth_provider_ims_authorization_url_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_token_url
    config_node_property_string_t *oauth_provider_ims_token_url_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_profile_url
    config_node_property_string_t *oauth_provider_ims_profile_url_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_extended_details_urls
    config_node_property_array_t *oauth_provider_ims_extended_details_urls_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_validate_token_url
    config_node_property_string_t *oauth_provider_ims_validate_token_url_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_session_property
    config_node_property_string_t *oauth_provider_ims_session_property_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_id
    config_node_property_string_t *oauth_provider_ims_service_token_client_id_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_secret
    config_node_property_string_t *oauth_provider_ims_service_token_client_secret_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token
    config_node_property_string_t *oauth_provider_ims_service_token_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_org_ref
    config_node_property_string_t *ims_org_ref_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_group_mapping
    config_node_property_array_t *ims_group_mapping_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_only_license_group
    config_node_property_boolean_t *oauth_provider_ims_only_license_group_local_nonprim = NULL;

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_id
    cJSON *oauth_provider_id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "oauth.provider.id");
    if (cJSON_IsNull(oauth_provider_id)) {
        oauth_provider_id = NULL;
    }
    if (oauth_provider_id) { 
    oauth_provider_id_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_id); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_authorization_url
    cJSON *oauth_provider_ims_authorization_url = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "oauth.provider.ims.authorization.url");
    if (cJSON_IsNull(oauth_provider_ims_authorization_url)) {
        oauth_provider_ims_authorization_url = NULL;
    }
    if (oauth_provider_ims_authorization_url) { 
    oauth_provider_ims_authorization_url_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_ims_authorization_url); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_token_url
    cJSON *oauth_provider_ims_token_url = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "oauth.provider.ims.token.url");
    if (cJSON_IsNull(oauth_provider_ims_token_url)) {
        oauth_provider_ims_token_url = NULL;
    }
    if (oauth_provider_ims_token_url) { 
    oauth_provider_ims_token_url_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_ims_token_url); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_profile_url
    cJSON *oauth_provider_ims_profile_url = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "oauth.provider.ims.profile.url");
    if (cJSON_IsNull(oauth_provider_ims_profile_url)) {
        oauth_provider_ims_profile_url = NULL;
    }
    if (oauth_provider_ims_profile_url) { 
    oauth_provider_ims_profile_url_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_ims_profile_url); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_extended_details_urls
    cJSON *oauth_provider_ims_extended_details_urls = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "oauth.provider.ims.extended.details.urls");
    if (cJSON_IsNull(oauth_provider_ims_extended_details_urls)) {
        oauth_provider_ims_extended_details_urls = NULL;
    }
    if (oauth_provider_ims_extended_details_urls) { 
    oauth_provider_ims_extended_details_urls_local_nonprim = config_node_property_array_parseFromJSON(oauth_provider_ims_extended_details_urls); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_validate_token_url
    cJSON *oauth_provider_ims_validate_token_url = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "oauth.provider.ims.validate.token.url");
    if (cJSON_IsNull(oauth_provider_ims_validate_token_url)) {
        oauth_provider_ims_validate_token_url = NULL;
    }
    if (oauth_provider_ims_validate_token_url) { 
    oauth_provider_ims_validate_token_url_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_ims_validate_token_url); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_session_property
    cJSON *oauth_provider_ims_session_property = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "oauth.provider.ims.session.property");
    if (cJSON_IsNull(oauth_provider_ims_session_property)) {
        oauth_provider_ims_session_property = NULL;
    }
    if (oauth_provider_ims_session_property) { 
    oauth_provider_ims_session_property_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_ims_session_property); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_id
    cJSON *oauth_provider_ims_service_token_client_id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "oauth.provider.ims.service.token.client.id");
    if (cJSON_IsNull(oauth_provider_ims_service_token_client_id)) {
        oauth_provider_ims_service_token_client_id = NULL;
    }
    if (oauth_provider_ims_service_token_client_id) { 
    oauth_provider_ims_service_token_client_id_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_ims_service_token_client_id); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token_client_secret
    cJSON *oauth_provider_ims_service_token_client_secret = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "oauth.provider.ims.service.token.client.secret");
    if (cJSON_IsNull(oauth_provider_ims_service_token_client_secret)) {
        oauth_provider_ims_service_token_client_secret = NULL;
    }
    if (oauth_provider_ims_service_token_client_secret) { 
    oauth_provider_ims_service_token_client_secret_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_ims_service_token_client_secret); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_service_token
    cJSON *oauth_provider_ims_service_token = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "oauth.provider.ims.service.token");
    if (cJSON_IsNull(oauth_provider_ims_service_token)) {
        oauth_provider_ims_service_token = NULL;
    }
    if (oauth_provider_ims_service_token) { 
    oauth_provider_ims_service_token_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_ims_service_token); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_org_ref
    cJSON *ims_org_ref = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "ims.org.ref");
    if (cJSON_IsNull(ims_org_ref)) {
        ims_org_ref = NULL;
    }
    if (ims_org_ref) { 
    ims_org_ref_local_nonprim = config_node_property_string_parseFromJSON(ims_org_ref); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->ims_group_mapping
    cJSON *ims_group_mapping = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "ims.group.mapping");
    if (cJSON_IsNull(ims_group_mapping)) {
        ims_group_mapping = NULL;
    }
    if (ims_group_mapping) { 
    ims_group_mapping_local_nonprim = config_node_property_array_parseFromJSON(ims_group_mapping); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_provider_impl_properties->oauth_provider_ims_only_license_group
    cJSON *oauth_provider_ims_only_license_group = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON, "oauth.provider.ims.only.license.group");
    if (cJSON_IsNull(oauth_provider_ims_only_license_group)) {
        oauth_provider_ims_only_license_group = NULL;
    }
    if (oauth_provider_ims_only_license_group) { 
    oauth_provider_ims_only_license_group_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_provider_ims_only_license_group); //nonprimitive
    }



    com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var = com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_create_internal (
        oauth_provider_id ? oauth_provider_id_local_nonprim : NULL,
        oauth_provider_ims_authorization_url ? oauth_provider_ims_authorization_url_local_nonprim : NULL,
        oauth_provider_ims_token_url ? oauth_provider_ims_token_url_local_nonprim : NULL,
        oauth_provider_ims_profile_url ? oauth_provider_ims_profile_url_local_nonprim : NULL,
        oauth_provider_ims_extended_details_urls ? oauth_provider_ims_extended_details_urls_local_nonprim : NULL,
        oauth_provider_ims_validate_token_url ? oauth_provider_ims_validate_token_url_local_nonprim : NULL,
        oauth_provider_ims_session_property ? oauth_provider_ims_session_property_local_nonprim : NULL,
        oauth_provider_ims_service_token_client_id ? oauth_provider_ims_service_token_client_id_local_nonprim : NULL,
        oauth_provider_ims_service_token_client_secret ? oauth_provider_ims_service_token_client_secret_local_nonprim : NULL,
        oauth_provider_ims_service_token ? oauth_provider_ims_service_token_local_nonprim : NULL,
        ims_org_ref ? ims_org_ref_local_nonprim : NULL,
        ims_group_mapping ? ims_group_mapping_local_nonprim : NULL,
        oauth_provider_ims_only_license_group ? oauth_provider_ims_only_license_group_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_local_var;
end:
    if (oauth_provider_id_local_nonprim) {
        config_node_property_string_free(oauth_provider_id_local_nonprim);
        oauth_provider_id_local_nonprim = NULL;
    }
    if (oauth_provider_ims_authorization_url_local_nonprim) {
        config_node_property_string_free(oauth_provider_ims_authorization_url_local_nonprim);
        oauth_provider_ims_authorization_url_local_nonprim = NULL;
    }
    if (oauth_provider_ims_token_url_local_nonprim) {
        config_node_property_string_free(oauth_provider_ims_token_url_local_nonprim);
        oauth_provider_ims_token_url_local_nonprim = NULL;
    }
    if (oauth_provider_ims_profile_url_local_nonprim) {
        config_node_property_string_free(oauth_provider_ims_profile_url_local_nonprim);
        oauth_provider_ims_profile_url_local_nonprim = NULL;
    }
    if (oauth_provider_ims_extended_details_urls_local_nonprim) {
        config_node_property_array_free(oauth_provider_ims_extended_details_urls_local_nonprim);
        oauth_provider_ims_extended_details_urls_local_nonprim = NULL;
    }
    if (oauth_provider_ims_validate_token_url_local_nonprim) {
        config_node_property_string_free(oauth_provider_ims_validate_token_url_local_nonprim);
        oauth_provider_ims_validate_token_url_local_nonprim = NULL;
    }
    if (oauth_provider_ims_session_property_local_nonprim) {
        config_node_property_string_free(oauth_provider_ims_session_property_local_nonprim);
        oauth_provider_ims_session_property_local_nonprim = NULL;
    }
    if (oauth_provider_ims_service_token_client_id_local_nonprim) {
        config_node_property_string_free(oauth_provider_ims_service_token_client_id_local_nonprim);
        oauth_provider_ims_service_token_client_id_local_nonprim = NULL;
    }
    if (oauth_provider_ims_service_token_client_secret_local_nonprim) {
        config_node_property_string_free(oauth_provider_ims_service_token_client_secret_local_nonprim);
        oauth_provider_ims_service_token_client_secret_local_nonprim = NULL;
    }
    if (oauth_provider_ims_service_token_local_nonprim) {
        config_node_property_string_free(oauth_provider_ims_service_token_local_nonprim);
        oauth_provider_ims_service_token_local_nonprim = NULL;
    }
    if (ims_org_ref_local_nonprim) {
        config_node_property_string_free(ims_org_ref_local_nonprim);
        ims_org_ref_local_nonprim = NULL;
    }
    if (ims_group_mapping_local_nonprim) {
        config_node_property_array_free(ims_group_mapping_local_nonprim);
        ims_group_mapping_local_nonprim = NULL;
    }
    if (oauth_provider_ims_only_license_group_local_nonprim) {
        config_node_property_boolean_free(oauth_provider_ims_only_license_group_local_nonprim);
        oauth_provider_ims_only_license_group_local_nonprim = NULL;
    }
    return NULL;

}
