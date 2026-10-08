#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties.h"



static org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_create_internal(
    config_node_property_string_t *token_expiration,
    config_node_property_string_t *token_length,
    config_node_property_boolean_t *token_refresh,
    config_node_property_integer_t *token_cleanup_threshold,
    config_node_property_string_t *password_hash_algorithm,
    config_node_property_integer_t *password_hash_iterations,
    config_node_property_integer_t *password_salt_size
    ) {
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t));
    if (!org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t));
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var->token_expiration = token_expiration;
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var->token_length = token_length;
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var->token_refresh = token_refresh;
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var->token_cleanup_threshold = token_cleanup_threshold;
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var->password_hash_algorithm = password_hash_algorithm;
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var->password_hash_iterations = password_hash_iterations;
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var->password_salt_size = password_salt_size;
    return org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_create(
    config_node_property_string_t *token_expiration,
    config_node_property_string_t *token_length,
    config_node_property_boolean_t *token_refresh,
    config_node_property_integer_t *token_cleanup_threshold,
    config_node_property_string_t *password_hash_algorithm,
    config_node_property_integer_t *password_hash_iterations,
    config_node_property_integer_t *password_salt_size
    ) {
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t *result = org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_create_internal (
        token_expiration,
        token_length,
        token_refresh,
        token_cleanup_threshold,
        password_hash_algorithm,
        password_hash_iterations,
        password_salt_size
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_free(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties) {
    if(NULL == org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_expiration) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_expiration);
        org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_expiration = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_length) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_length);
        org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_length = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_refresh) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_refresh);
        org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_refresh = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_cleanup_threshold) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_cleanup_threshold);
        org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_cleanup_threshold = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_algorithm) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_algorithm);
        org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_algorithm = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_iterations) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_iterations);
        org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_iterations = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_salt_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_salt_size);
        org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_salt_size = NULL;
    }
    free(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties);
}

cJSON *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_convertToJSON(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_expiration
    if(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_expiration) {
    cJSON *token_expiration_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_expiration);
    if(token_expiration_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tokenExpiration", token_expiration_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_length
    if(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_length) {
    cJSON *token_length_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_length);
    if(token_length_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tokenLength", token_length_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_refresh
    if(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_refresh) {
    cJSON *token_refresh_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_refresh);
    if(token_refresh_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tokenRefresh", token_refresh_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_cleanup_threshold
    if(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_cleanup_threshold) {
    cJSON *token_cleanup_threshold_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_cleanup_threshold);
    if(token_cleanup_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tokenCleanupThreshold", token_cleanup_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_algorithm
    if(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_algorithm) {
    cJSON *password_hash_algorithm_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_algorithm);
    if(password_hash_algorithm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "passwordHashAlgorithm", password_hash_algorithm_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_iterations
    if(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_iterations) {
    cJSON *password_hash_iterations_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_iterations);
    if(password_hash_iterations_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "passwordHashIterations", password_hash_iterations_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_salt_size
    if(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_salt_size) {
    cJSON *password_salt_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_salt_size);
    if(password_salt_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "passwordSaltSize", password_salt_size_local_JSON);
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

org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_security_authentication_token_token_configura_propertiesJSON){

    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_expiration
    config_node_property_string_t *token_expiration_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_length
    config_node_property_string_t *token_length_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_refresh
    config_node_property_boolean_t *token_refresh_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_cleanup_threshold
    config_node_property_integer_t *token_cleanup_threshold_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_algorithm
    config_node_property_string_t *password_hash_algorithm_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_iterations
    config_node_property_integer_t *password_hash_iterations_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_salt_size
    config_node_property_integer_t *password_salt_size_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_expiration
    cJSON *token_expiration = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_token_token_configura_propertiesJSON, "tokenExpiration");
    if (cJSON_IsNull(token_expiration)) {
        token_expiration = NULL;
    }
    if (token_expiration) { 
    token_expiration_local_nonprim = config_node_property_string_parseFromJSON(token_expiration); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_length
    cJSON *token_length = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_token_token_configura_propertiesJSON, "tokenLength");
    if (cJSON_IsNull(token_length)) {
        token_length = NULL;
    }
    if (token_length) { 
    token_length_local_nonprim = config_node_property_string_parseFromJSON(token_length); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_refresh
    cJSON *token_refresh = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_token_token_configura_propertiesJSON, "tokenRefresh");
    if (cJSON_IsNull(token_refresh)) {
        token_refresh = NULL;
    }
    if (token_refresh) { 
    token_refresh_local_nonprim = config_node_property_boolean_parseFromJSON(token_refresh); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->token_cleanup_threshold
    cJSON *token_cleanup_threshold = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_token_token_configura_propertiesJSON, "tokenCleanupThreshold");
    if (cJSON_IsNull(token_cleanup_threshold)) {
        token_cleanup_threshold = NULL;
    }
    if (token_cleanup_threshold) { 
    token_cleanup_threshold_local_nonprim = config_node_property_integer_parseFromJSON(token_cleanup_threshold); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_algorithm
    cJSON *password_hash_algorithm = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_token_token_configura_propertiesJSON, "passwordHashAlgorithm");
    if (cJSON_IsNull(password_hash_algorithm)) {
        password_hash_algorithm = NULL;
    }
    if (password_hash_algorithm) { 
    password_hash_algorithm_local_nonprim = config_node_property_string_parseFromJSON(password_hash_algorithm); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_hash_iterations
    cJSON *password_hash_iterations = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_token_token_configura_propertiesJSON, "passwordHashIterations");
    if (cJSON_IsNull(password_hash_iterations)) {
        password_hash_iterations = NULL;
    }
    if (password_hash_iterations) { 
    password_hash_iterations_local_nonprim = config_node_property_integer_parseFromJSON(password_hash_iterations); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties->password_salt_size
    cJSON *password_salt_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_token_token_configura_propertiesJSON, "passwordSaltSize");
    if (cJSON_IsNull(password_salt_size)) {
        password_salt_size = NULL;
    }
    if (password_salt_size) { 
    password_salt_size_local_nonprim = config_node_property_integer_parseFromJSON(password_salt_size); //nonprimitive
    }



    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var = org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_create_internal (
        token_expiration ? token_expiration_local_nonprim : NULL,
        token_length ? token_length_local_nonprim : NULL,
        token_refresh ? token_refresh_local_nonprim : NULL,
        token_cleanup_threshold ? token_cleanup_threshold_local_nonprim : NULL,
        password_hash_algorithm ? password_hash_algorithm_local_nonprim : NULL,
        password_hash_iterations ? password_hash_iterations_local_nonprim : NULL,
        password_salt_size ? password_salt_size_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_local_var;
end:
    if (token_expiration_local_nonprim) {
        config_node_property_string_free(token_expiration_local_nonprim);
        token_expiration_local_nonprim = NULL;
    }
    if (token_length_local_nonprim) {
        config_node_property_string_free(token_length_local_nonprim);
        token_length_local_nonprim = NULL;
    }
    if (token_refresh_local_nonprim) {
        config_node_property_boolean_free(token_refresh_local_nonprim);
        token_refresh_local_nonprim = NULL;
    }
    if (token_cleanup_threshold_local_nonprim) {
        config_node_property_integer_free(token_cleanup_threshold_local_nonprim);
        token_cleanup_threshold_local_nonprim = NULL;
    }
    if (password_hash_algorithm_local_nonprim) {
        config_node_property_string_free(password_hash_algorithm_local_nonprim);
        password_hash_algorithm_local_nonprim = NULL;
    }
    if (password_hash_iterations_local_nonprim) {
        config_node_property_integer_free(password_hash_iterations_local_nonprim);
        password_hash_iterations_local_nonprim = NULL;
    }
    if (password_salt_size_local_nonprim) {
        config_node_property_integer_free(password_salt_size_local_nonprim);
        password_salt_size_local_nonprim = NULL;
    }
    return NULL;

}
