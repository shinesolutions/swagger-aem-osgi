#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_saml_saml_authentication_handler_properties.h"



static com_adobe_granite_auth_saml_saml_authentication_handler_properties_t *com_adobe_granite_auth_saml_saml_authentication_handler_properties_create_internal(
    config_node_property_array_t *path,
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *idp_url,
    config_node_property_string_t *idp_cert_alias,
    config_node_property_boolean_t *idp_http_redirect,
    config_node_property_string_t *service_provider_entity_id,
    config_node_property_string_t *assertion_consumer_service_url,
    config_node_property_string_t *sp_private_key_alias,
    config_node_property_string_t *key_store_password,
    config_node_property_string_t *default_redirect_url,
    config_node_property_string_t *user_id_attribute,
    config_node_property_boolean_t *use_encryption,
    config_node_property_boolean_t *create_user,
    config_node_property_string_t *user_intermediate_path,
    config_node_property_boolean_t *add_group_memberships,
    config_node_property_string_t *group_membership_attribute,
    config_node_property_array_t *default_groups,
    config_node_property_string_t *name_id_format,
    config_node_property_array_t *synchronize_attributes,
    config_node_property_boolean_t *handle_logout,
    config_node_property_string_t *logout_url,
    config_node_property_integer_t *clock_tolerance,
    config_node_property_string_t *digest_method,
    config_node_property_string_t *signature_method,
    config_node_property_drop_down_t *identity_sync_type,
    config_node_property_string_t *idp_identifier
    ) {
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_t *com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var = malloc(sizeof(com_adobe_granite_auth_saml_saml_authentication_handler_properties_t));
    if (!com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var, 0, sizeof(com_adobe_granite_auth_saml_saml_authentication_handler_properties_t));
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->path = path;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->service_ranking = service_ranking;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->idp_url = idp_url;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->idp_cert_alias = idp_cert_alias;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->idp_http_redirect = idp_http_redirect;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->service_provider_entity_id = service_provider_entity_id;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->assertion_consumer_service_url = assertion_consumer_service_url;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->sp_private_key_alias = sp_private_key_alias;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->key_store_password = key_store_password;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->default_redirect_url = default_redirect_url;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->user_id_attribute = user_id_attribute;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->use_encryption = use_encryption;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->create_user = create_user;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->user_intermediate_path = user_intermediate_path;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->add_group_memberships = add_group_memberships;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->group_membership_attribute = group_membership_attribute;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->default_groups = default_groups;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->name_id_format = name_id_format;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->synchronize_attributes = synchronize_attributes;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->handle_logout = handle_logout;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->logout_url = logout_url;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->clock_tolerance = clock_tolerance;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->digest_method = digest_method;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->signature_method = signature_method;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->identity_sync_type = identity_sync_type;
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var->idp_identifier = idp_identifier;
    return com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_saml_saml_authentication_handler_properties_t *com_adobe_granite_auth_saml_saml_authentication_handler_properties_create(
    config_node_property_array_t *path,
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *idp_url,
    config_node_property_string_t *idp_cert_alias,
    config_node_property_boolean_t *idp_http_redirect,
    config_node_property_string_t *service_provider_entity_id,
    config_node_property_string_t *assertion_consumer_service_url,
    config_node_property_string_t *sp_private_key_alias,
    config_node_property_string_t *key_store_password,
    config_node_property_string_t *default_redirect_url,
    config_node_property_string_t *user_id_attribute,
    config_node_property_boolean_t *use_encryption,
    config_node_property_boolean_t *create_user,
    config_node_property_string_t *user_intermediate_path,
    config_node_property_boolean_t *add_group_memberships,
    config_node_property_string_t *group_membership_attribute,
    config_node_property_array_t *default_groups,
    config_node_property_string_t *name_id_format,
    config_node_property_array_t *synchronize_attributes,
    config_node_property_boolean_t *handle_logout,
    config_node_property_string_t *logout_url,
    config_node_property_integer_t *clock_tolerance,
    config_node_property_string_t *digest_method,
    config_node_property_string_t *signature_method,
    config_node_property_drop_down_t *identity_sync_type,
    config_node_property_string_t *idp_identifier
    ) {
    com_adobe_granite_auth_saml_saml_authentication_handler_properties_t *result = com_adobe_granite_auth_saml_saml_authentication_handler_properties_create_internal (
        path,
        service_ranking,
        idp_url,
        idp_cert_alias,
        idp_http_redirect,
        service_provider_entity_id,
        assertion_consumer_service_url,
        sp_private_key_alias,
        key_store_password,
        default_redirect_url,
        user_id_attribute,
        use_encryption,
        create_user,
        user_intermediate_path,
        add_group_memberships,
        group_membership_attribute,
        default_groups,
        name_id_format,
        synchronize_attributes,
        handle_logout,
        logout_url,
        clock_tolerance,
        digest_method,
        signature_method,
        identity_sync_type,
        idp_identifier
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_saml_saml_authentication_handler_properties_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties_t *com_adobe_granite_auth_saml_saml_authentication_handler_properties) {
    if(NULL == com_adobe_granite_auth_saml_saml_authentication_handler_properties){
        return ;
    }
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_saml_saml_authentication_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->path) {
        config_node_property_array_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->path);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->path = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_ranking) {
        config_node_property_integer_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_ranking);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_ranking = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_url) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_url);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_url = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_cert_alias) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_cert_alias);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_cert_alias = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_http_redirect) {
        config_node_property_boolean_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_http_redirect);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_http_redirect = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_provider_entity_id) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_provider_entity_id);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_provider_entity_id = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->assertion_consumer_service_url) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->assertion_consumer_service_url);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->assertion_consumer_service_url = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->sp_private_key_alias) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->sp_private_key_alias);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->sp_private_key_alias = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->key_store_password) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->key_store_password);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->key_store_password = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_redirect_url) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_redirect_url);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_redirect_url = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_id_attribute) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_id_attribute);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_id_attribute = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->use_encryption) {
        config_node_property_boolean_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->use_encryption);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->use_encryption = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->create_user) {
        config_node_property_boolean_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->create_user);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->create_user = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_intermediate_path) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_intermediate_path);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_intermediate_path = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->add_group_memberships) {
        config_node_property_boolean_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->add_group_memberships);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->add_group_memberships = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->group_membership_attribute) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->group_membership_attribute);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->group_membership_attribute = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_groups) {
        config_node_property_array_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_groups);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_groups = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->name_id_format) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->name_id_format);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->name_id_format = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->synchronize_attributes) {
        config_node_property_array_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->synchronize_attributes);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->synchronize_attributes = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->handle_logout) {
        config_node_property_boolean_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->handle_logout);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->handle_logout = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->logout_url) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->logout_url);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->logout_url = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->clock_tolerance) {
        config_node_property_integer_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->clock_tolerance);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->clock_tolerance = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->digest_method) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->digest_method);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->digest_method = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->signature_method) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->signature_method);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->signature_method = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->identity_sync_type) {
        config_node_property_drop_down_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->identity_sync_type);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->identity_sync_type = NULL;
    }
    if (com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_identifier) {
        config_node_property_string_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_identifier);
        com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_identifier = NULL;
    }
    free(com_adobe_granite_auth_saml_saml_authentication_handler_properties);
}

cJSON *com_adobe_granite_auth_saml_saml_authentication_handler_properties_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties_t *com_adobe_granite_auth_saml_saml_authentication_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->path
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->path) {
    cJSON *path_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_ranking
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_url
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_url) {
    cJSON *idp_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_url);
    if(idp_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "idpUrl", idp_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_cert_alias
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_cert_alias) {
    cJSON *idp_cert_alias_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_cert_alias);
    if(idp_cert_alias_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "idpCertAlias", idp_cert_alias_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_http_redirect
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_http_redirect) {
    cJSON *idp_http_redirect_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_http_redirect);
    if(idp_http_redirect_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "idpHttpRedirect", idp_http_redirect_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_provider_entity_id
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_provider_entity_id) {
    cJSON *service_provider_entity_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_provider_entity_id);
    if(service_provider_entity_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceProviderEntityId", service_provider_entity_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->assertion_consumer_service_url
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->assertion_consumer_service_url) {
    cJSON *assertion_consumer_service_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->assertion_consumer_service_url);
    if(assertion_consumer_service_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "assertionConsumerServiceURL", assertion_consumer_service_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->sp_private_key_alias
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->sp_private_key_alias) {
    cJSON *sp_private_key_alias_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->sp_private_key_alias);
    if(sp_private_key_alias_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "spPrivateKeyAlias", sp_private_key_alias_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->key_store_password
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->key_store_password) {
    cJSON *key_store_password_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->key_store_password);
    if(key_store_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "keyStorePassword", key_store_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_redirect_url
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_redirect_url) {
    cJSON *default_redirect_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_redirect_url);
    if(default_redirect_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultRedirectUrl", default_redirect_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_id_attribute
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_id_attribute) {
    cJSON *user_id_attribute_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_id_attribute);
    if(user_id_attribute_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "userIDAttribute", user_id_attribute_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->use_encryption
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->use_encryption) {
    cJSON *use_encryption_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->use_encryption);
    if(use_encryption_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "useEncryption", use_encryption_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->create_user
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->create_user) {
    cJSON *create_user_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->create_user);
    if(create_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "createUser", create_user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_intermediate_path
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_intermediate_path) {
    cJSON *user_intermediate_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_intermediate_path);
    if(user_intermediate_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "userIntermediatePath", user_intermediate_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->add_group_memberships
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->add_group_memberships) {
    cJSON *add_group_memberships_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->add_group_memberships);
    if(add_group_memberships_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "addGroupMemberships", add_group_memberships_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->group_membership_attribute
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->group_membership_attribute) {
    cJSON *group_membership_attribute_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->group_membership_attribute);
    if(group_membership_attribute_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "groupMembershipAttribute", group_membership_attribute_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_groups
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_groups) {
    cJSON *default_groups_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_groups);
    if(default_groups_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultGroups", default_groups_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->name_id_format
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->name_id_format) {
    cJSON *name_id_format_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->name_id_format);
    if(name_id_format_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "nameIdFormat", name_id_format_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->synchronize_attributes
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->synchronize_attributes) {
    cJSON *synchronize_attributes_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->synchronize_attributes);
    if(synchronize_attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "synchronizeAttributes", synchronize_attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->handle_logout
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->handle_logout) {
    cJSON *handle_logout_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->handle_logout);
    if(handle_logout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "handleLogout", handle_logout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->logout_url
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->logout_url) {
    cJSON *logout_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->logout_url);
    if(logout_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "logoutUrl", logout_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->clock_tolerance
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->clock_tolerance) {
    cJSON *clock_tolerance_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->clock_tolerance);
    if(clock_tolerance_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "clockTolerance", clock_tolerance_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->digest_method
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->digest_method) {
    cJSON *digest_method_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->digest_method);
    if(digest_method_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "digestMethod", digest_method_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->signature_method
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->signature_method) {
    cJSON *signature_method_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->signature_method);
    if(signature_method_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "signatureMethod", signature_method_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->identity_sync_type
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->identity_sync_type) {
    cJSON *identity_sync_type_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->identity_sync_type);
    if(identity_sync_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "identitySyncType", identity_sync_type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_identifier
    if(com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_identifier) {
    cJSON *idp_identifier_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_identifier);
    if(idp_identifier_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "idpIdentifier", idp_identifier_local_JSON);
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

com_adobe_granite_auth_saml_saml_authentication_handler_properties_t *com_adobe_granite_auth_saml_saml_authentication_handler_properties_parseFromJSON(cJSON *com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON){

    com_adobe_granite_auth_saml_saml_authentication_handler_properties_t *com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->path
    config_node_property_array_t *path_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_url
    config_node_property_string_t *idp_url_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_cert_alias
    config_node_property_string_t *idp_cert_alias_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_http_redirect
    config_node_property_boolean_t *idp_http_redirect_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_provider_entity_id
    config_node_property_string_t *service_provider_entity_id_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->assertion_consumer_service_url
    config_node_property_string_t *assertion_consumer_service_url_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->sp_private_key_alias
    config_node_property_string_t *sp_private_key_alias_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->key_store_password
    config_node_property_string_t *key_store_password_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_redirect_url
    config_node_property_string_t *default_redirect_url_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_id_attribute
    config_node_property_string_t *user_id_attribute_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->use_encryption
    config_node_property_boolean_t *use_encryption_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->create_user
    config_node_property_boolean_t *create_user_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_intermediate_path
    config_node_property_string_t *user_intermediate_path_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->add_group_memberships
    config_node_property_boolean_t *add_group_memberships_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->group_membership_attribute
    config_node_property_string_t *group_membership_attribute_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_groups
    config_node_property_array_t *default_groups_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->name_id_format
    config_node_property_string_t *name_id_format_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->synchronize_attributes
    config_node_property_array_t *synchronize_attributes_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->handle_logout
    config_node_property_boolean_t *handle_logout_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->logout_url
    config_node_property_string_t *logout_url_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->clock_tolerance
    config_node_property_integer_t *clock_tolerance_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->digest_method
    config_node_property_string_t *digest_method_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->signature_method
    config_node_property_string_t *signature_method_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->identity_sync_type
    config_node_property_drop_down_t *identity_sync_type_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_identifier
    config_node_property_string_t *idp_identifier_local_nonprim = NULL;

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_array_parseFromJSON(path); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_url
    cJSON *idp_url = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "idpUrl");
    if (cJSON_IsNull(idp_url)) {
        idp_url = NULL;
    }
    if (idp_url) { 
    idp_url_local_nonprim = config_node_property_string_parseFromJSON(idp_url); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_cert_alias
    cJSON *idp_cert_alias = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "idpCertAlias");
    if (cJSON_IsNull(idp_cert_alias)) {
        idp_cert_alias = NULL;
    }
    if (idp_cert_alias) { 
    idp_cert_alias_local_nonprim = config_node_property_string_parseFromJSON(idp_cert_alias); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_http_redirect
    cJSON *idp_http_redirect = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "idpHttpRedirect");
    if (cJSON_IsNull(idp_http_redirect)) {
        idp_http_redirect = NULL;
    }
    if (idp_http_redirect) { 
    idp_http_redirect_local_nonprim = config_node_property_boolean_parseFromJSON(idp_http_redirect); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->service_provider_entity_id
    cJSON *service_provider_entity_id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "serviceProviderEntityId");
    if (cJSON_IsNull(service_provider_entity_id)) {
        service_provider_entity_id = NULL;
    }
    if (service_provider_entity_id) { 
    service_provider_entity_id_local_nonprim = config_node_property_string_parseFromJSON(service_provider_entity_id); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->assertion_consumer_service_url
    cJSON *assertion_consumer_service_url = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "assertionConsumerServiceURL");
    if (cJSON_IsNull(assertion_consumer_service_url)) {
        assertion_consumer_service_url = NULL;
    }
    if (assertion_consumer_service_url) { 
    assertion_consumer_service_url_local_nonprim = config_node_property_string_parseFromJSON(assertion_consumer_service_url); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->sp_private_key_alias
    cJSON *sp_private_key_alias = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "spPrivateKeyAlias");
    if (cJSON_IsNull(sp_private_key_alias)) {
        sp_private_key_alias = NULL;
    }
    if (sp_private_key_alias) { 
    sp_private_key_alias_local_nonprim = config_node_property_string_parseFromJSON(sp_private_key_alias); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->key_store_password
    cJSON *key_store_password = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "keyStorePassword");
    if (cJSON_IsNull(key_store_password)) {
        key_store_password = NULL;
    }
    if (key_store_password) { 
    key_store_password_local_nonprim = config_node_property_string_parseFromJSON(key_store_password); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_redirect_url
    cJSON *default_redirect_url = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "defaultRedirectUrl");
    if (cJSON_IsNull(default_redirect_url)) {
        default_redirect_url = NULL;
    }
    if (default_redirect_url) { 
    default_redirect_url_local_nonprim = config_node_property_string_parseFromJSON(default_redirect_url); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_id_attribute
    cJSON *user_id_attribute = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "userIDAttribute");
    if (cJSON_IsNull(user_id_attribute)) {
        user_id_attribute = NULL;
    }
    if (user_id_attribute) { 
    user_id_attribute_local_nonprim = config_node_property_string_parseFromJSON(user_id_attribute); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->use_encryption
    cJSON *use_encryption = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "useEncryption");
    if (cJSON_IsNull(use_encryption)) {
        use_encryption = NULL;
    }
    if (use_encryption) { 
    use_encryption_local_nonprim = config_node_property_boolean_parseFromJSON(use_encryption); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->create_user
    cJSON *create_user = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "createUser");
    if (cJSON_IsNull(create_user)) {
        create_user = NULL;
    }
    if (create_user) { 
    create_user_local_nonprim = config_node_property_boolean_parseFromJSON(create_user); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->user_intermediate_path
    cJSON *user_intermediate_path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "userIntermediatePath");
    if (cJSON_IsNull(user_intermediate_path)) {
        user_intermediate_path = NULL;
    }
    if (user_intermediate_path) { 
    user_intermediate_path_local_nonprim = config_node_property_string_parseFromJSON(user_intermediate_path); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->add_group_memberships
    cJSON *add_group_memberships = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "addGroupMemberships");
    if (cJSON_IsNull(add_group_memberships)) {
        add_group_memberships = NULL;
    }
    if (add_group_memberships) { 
    add_group_memberships_local_nonprim = config_node_property_boolean_parseFromJSON(add_group_memberships); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->group_membership_attribute
    cJSON *group_membership_attribute = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "groupMembershipAttribute");
    if (cJSON_IsNull(group_membership_attribute)) {
        group_membership_attribute = NULL;
    }
    if (group_membership_attribute) { 
    group_membership_attribute_local_nonprim = config_node_property_string_parseFromJSON(group_membership_attribute); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->default_groups
    cJSON *default_groups = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "defaultGroups");
    if (cJSON_IsNull(default_groups)) {
        default_groups = NULL;
    }
    if (default_groups) { 
    default_groups_local_nonprim = config_node_property_array_parseFromJSON(default_groups); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->name_id_format
    cJSON *name_id_format = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "nameIdFormat");
    if (cJSON_IsNull(name_id_format)) {
        name_id_format = NULL;
    }
    if (name_id_format) { 
    name_id_format_local_nonprim = config_node_property_string_parseFromJSON(name_id_format); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->synchronize_attributes
    cJSON *synchronize_attributes = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "synchronizeAttributes");
    if (cJSON_IsNull(synchronize_attributes)) {
        synchronize_attributes = NULL;
    }
    if (synchronize_attributes) { 
    synchronize_attributes_local_nonprim = config_node_property_array_parseFromJSON(synchronize_attributes); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->handle_logout
    cJSON *handle_logout = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "handleLogout");
    if (cJSON_IsNull(handle_logout)) {
        handle_logout = NULL;
    }
    if (handle_logout) { 
    handle_logout_local_nonprim = config_node_property_boolean_parseFromJSON(handle_logout); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->logout_url
    cJSON *logout_url = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "logoutUrl");
    if (cJSON_IsNull(logout_url)) {
        logout_url = NULL;
    }
    if (logout_url) { 
    logout_url_local_nonprim = config_node_property_string_parseFromJSON(logout_url); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->clock_tolerance
    cJSON *clock_tolerance = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "clockTolerance");
    if (cJSON_IsNull(clock_tolerance)) {
        clock_tolerance = NULL;
    }
    if (clock_tolerance) { 
    clock_tolerance_local_nonprim = config_node_property_integer_parseFromJSON(clock_tolerance); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->digest_method
    cJSON *digest_method = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "digestMethod");
    if (cJSON_IsNull(digest_method)) {
        digest_method = NULL;
    }
    if (digest_method) { 
    digest_method_local_nonprim = config_node_property_string_parseFromJSON(digest_method); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->signature_method
    cJSON *signature_method = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "signatureMethod");
    if (cJSON_IsNull(signature_method)) {
        signature_method = NULL;
    }
    if (signature_method) { 
    signature_method_local_nonprim = config_node_property_string_parseFromJSON(signature_method); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->identity_sync_type
    cJSON *identity_sync_type = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "identitySyncType");
    if (cJSON_IsNull(identity_sync_type)) {
        identity_sync_type = NULL;
    }
    if (identity_sync_type) { 
    identity_sync_type_local_nonprim = config_node_property_drop_down_parseFromJSON(identity_sync_type); //nonprimitive
    }

    // com_adobe_granite_auth_saml_saml_authentication_handler_properties->idp_identifier
    cJSON *idp_identifier = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON, "idpIdentifier");
    if (cJSON_IsNull(idp_identifier)) {
        idp_identifier = NULL;
    }
    if (idp_identifier) { 
    idp_identifier_local_nonprim = config_node_property_string_parseFromJSON(idp_identifier); //nonprimitive
    }



    com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var = com_adobe_granite_auth_saml_saml_authentication_handler_properties_create_internal (
        path ? path_local_nonprim : NULL,
        service_ranking ? service_ranking_local_nonprim : NULL,
        idp_url ? idp_url_local_nonprim : NULL,
        idp_cert_alias ? idp_cert_alias_local_nonprim : NULL,
        idp_http_redirect ? idp_http_redirect_local_nonprim : NULL,
        service_provider_entity_id ? service_provider_entity_id_local_nonprim : NULL,
        assertion_consumer_service_url ? assertion_consumer_service_url_local_nonprim : NULL,
        sp_private_key_alias ? sp_private_key_alias_local_nonprim : NULL,
        key_store_password ? key_store_password_local_nonprim : NULL,
        default_redirect_url ? default_redirect_url_local_nonprim : NULL,
        user_id_attribute ? user_id_attribute_local_nonprim : NULL,
        use_encryption ? use_encryption_local_nonprim : NULL,
        create_user ? create_user_local_nonprim : NULL,
        user_intermediate_path ? user_intermediate_path_local_nonprim : NULL,
        add_group_memberships ? add_group_memberships_local_nonprim : NULL,
        group_membership_attribute ? group_membership_attribute_local_nonprim : NULL,
        default_groups ? default_groups_local_nonprim : NULL,
        name_id_format ? name_id_format_local_nonprim : NULL,
        synchronize_attributes ? synchronize_attributes_local_nonprim : NULL,
        handle_logout ? handle_logout_local_nonprim : NULL,
        logout_url ? logout_url_local_nonprim : NULL,
        clock_tolerance ? clock_tolerance_local_nonprim : NULL,
        digest_method ? digest_method_local_nonprim : NULL,
        signature_method ? signature_method_local_nonprim : NULL,
        identity_sync_type ? identity_sync_type_local_nonprim : NULL,
        idp_identifier ? idp_identifier_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_saml_saml_authentication_handler_properties_local_var;
end:
    if (path_local_nonprim) {
        config_node_property_array_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    if (idp_url_local_nonprim) {
        config_node_property_string_free(idp_url_local_nonprim);
        idp_url_local_nonprim = NULL;
    }
    if (idp_cert_alias_local_nonprim) {
        config_node_property_string_free(idp_cert_alias_local_nonprim);
        idp_cert_alias_local_nonprim = NULL;
    }
    if (idp_http_redirect_local_nonprim) {
        config_node_property_boolean_free(idp_http_redirect_local_nonprim);
        idp_http_redirect_local_nonprim = NULL;
    }
    if (service_provider_entity_id_local_nonprim) {
        config_node_property_string_free(service_provider_entity_id_local_nonprim);
        service_provider_entity_id_local_nonprim = NULL;
    }
    if (assertion_consumer_service_url_local_nonprim) {
        config_node_property_string_free(assertion_consumer_service_url_local_nonprim);
        assertion_consumer_service_url_local_nonprim = NULL;
    }
    if (sp_private_key_alias_local_nonprim) {
        config_node_property_string_free(sp_private_key_alias_local_nonprim);
        sp_private_key_alias_local_nonprim = NULL;
    }
    if (key_store_password_local_nonprim) {
        config_node_property_string_free(key_store_password_local_nonprim);
        key_store_password_local_nonprim = NULL;
    }
    if (default_redirect_url_local_nonprim) {
        config_node_property_string_free(default_redirect_url_local_nonprim);
        default_redirect_url_local_nonprim = NULL;
    }
    if (user_id_attribute_local_nonprim) {
        config_node_property_string_free(user_id_attribute_local_nonprim);
        user_id_attribute_local_nonprim = NULL;
    }
    if (use_encryption_local_nonprim) {
        config_node_property_boolean_free(use_encryption_local_nonprim);
        use_encryption_local_nonprim = NULL;
    }
    if (create_user_local_nonprim) {
        config_node_property_boolean_free(create_user_local_nonprim);
        create_user_local_nonprim = NULL;
    }
    if (user_intermediate_path_local_nonprim) {
        config_node_property_string_free(user_intermediate_path_local_nonprim);
        user_intermediate_path_local_nonprim = NULL;
    }
    if (add_group_memberships_local_nonprim) {
        config_node_property_boolean_free(add_group_memberships_local_nonprim);
        add_group_memberships_local_nonprim = NULL;
    }
    if (group_membership_attribute_local_nonprim) {
        config_node_property_string_free(group_membership_attribute_local_nonprim);
        group_membership_attribute_local_nonprim = NULL;
    }
    if (default_groups_local_nonprim) {
        config_node_property_array_free(default_groups_local_nonprim);
        default_groups_local_nonprim = NULL;
    }
    if (name_id_format_local_nonprim) {
        config_node_property_string_free(name_id_format_local_nonprim);
        name_id_format_local_nonprim = NULL;
    }
    if (synchronize_attributes_local_nonprim) {
        config_node_property_array_free(synchronize_attributes_local_nonprim);
        synchronize_attributes_local_nonprim = NULL;
    }
    if (handle_logout_local_nonprim) {
        config_node_property_boolean_free(handle_logout_local_nonprim);
        handle_logout_local_nonprim = NULL;
    }
    if (logout_url_local_nonprim) {
        config_node_property_string_free(logout_url_local_nonprim);
        logout_url_local_nonprim = NULL;
    }
    if (clock_tolerance_local_nonprim) {
        config_node_property_integer_free(clock_tolerance_local_nonprim);
        clock_tolerance_local_nonprim = NULL;
    }
    if (digest_method_local_nonprim) {
        config_node_property_string_free(digest_method_local_nonprim);
        digest_method_local_nonprim = NULL;
    }
    if (signature_method_local_nonprim) {
        config_node_property_string_free(signature_method_local_nonprim);
        signature_method_local_nonprim = NULL;
    }
    if (identity_sync_type_local_nonprim) {
        config_node_property_drop_down_free(identity_sync_type_local_nonprim);
        identity_sync_type_local_nonprim = NULL;
    }
    if (idp_identifier_local_nonprim) {
        config_node_property_string_free(idp_identifier_local_nonprim);
        idp_identifier_local_nonprim = NULL;
    }
    return NULL;

}
