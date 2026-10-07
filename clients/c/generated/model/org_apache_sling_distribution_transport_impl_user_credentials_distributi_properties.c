#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties.h"



static org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_t *org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *username,
    config_node_property_string_t *password
    ) {
    org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_t *org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_local_var = malloc(sizeof(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_t));
    if (!org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_local_var, 0, sizeof(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_t));
    org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_local_var->_library_owned = 1;
    org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_local_var->name = name;
    org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_local_var->username = username;
    org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_local_var->password = password;
    return org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_t *org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *username,
    config_node_property_string_t *password
    ) {
    org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_t *result = org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_create_internal (
        name,
        username,
        password
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_free(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_t *org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties) {
    if(NULL == org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties){
        return ;
    }
    if(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->name) {
        config_node_property_string_free(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->name);
        org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->name = NULL;
    }
    if (org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->username) {
        config_node_property_string_free(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->username);
        org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->username = NULL;
    }
    if (org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->password) {
        config_node_property_string_free(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->password);
        org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->password = NULL;
    }
    free(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties);
}

cJSON *org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_convertToJSON(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_t *org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->name
    if(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->username
    if(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->username) {
    cJSON *username_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->username);
    if(username_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "username", username_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->password
    if(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->password) {
    cJSON *password_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->password);
    if(password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "password", password_local_JSON);
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

org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_t *org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_parseFromJSON(cJSON *org_apache_sling_distribution_transport_impl_user_credentials_distributi_propertiesJSON){

    org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_t *org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_local_var = NULL;

    // define the local variable for org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->username
    config_node_property_string_t *username_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->password
    config_node_property_string_t *password_local_nonprim = NULL;

    // org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_transport_impl_user_credentials_distributi_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_transport_impl_user_credentials_distributi_propertiesJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (username) { 
    username_local_nonprim = config_node_property_string_parseFromJSON(username); //nonprimitive
    }

    // org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_transport_impl_user_credentials_distributi_propertiesJSON, "password");
    if (cJSON_IsNull(password)) {
        password = NULL;
    }
    if (password) { 
    password_local_nonprim = config_node_property_string_parseFromJSON(password); //nonprimitive
    }



    org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_local_var = org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_create_internal (
        name ? name_local_nonprim : NULL,
        username ? username_local_nonprim : NULL,
        password ? password_local_nonprim : NULL
        );

    if (!org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_local_var) {
        goto end;
    }

    return org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (username_local_nonprim) {
        config_node_property_string_free(username_local_nonprim);
        username_local_nonprim = NULL;
    }
    if (password_local_nonprim) {
        config_node_property_string_free(password_local_nonprim);
        password_local_nonprim = NULL;
    }
    return NULL;

}
