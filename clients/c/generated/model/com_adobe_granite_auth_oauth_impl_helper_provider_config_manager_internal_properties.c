#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties.h"



static com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_t *com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_create_internal(
    config_node_property_string_t *oauth_cookie_login_timeout,
    config_node_property_string_t *oauth_cookie_max_age
    ) {
    com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_t *com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_local_var = malloc(sizeof(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_t));
    if (!com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_local_var, 0, sizeof(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_t));
    com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_local_var->oauth_cookie_login_timeout = oauth_cookie_login_timeout;
    com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_local_var->oauth_cookie_max_age = oauth_cookie_max_age;
    return com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_t *com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_create(
    config_node_property_string_t *oauth_cookie_login_timeout,
    config_node_property_string_t *oauth_cookie_max_age
    ) {
    com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_t *result = com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_create_internal (
        oauth_cookie_login_timeout,
        oauth_cookie_max_age
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_free(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_t *com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties) {
    if(NULL == com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties){
        return ;
    }
    if(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_login_timeout) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_login_timeout);
        com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_login_timeout = NULL;
    }
    if (com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_max_age) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_max_age);
        com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_max_age = NULL;
    }
    free(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties);
}

cJSON *com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_convertToJSON(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_t *com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_login_timeout
    if(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_login_timeout) {
    cJSON *oauth_cookie_login_timeout_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_login_timeout);
    if(oauth_cookie_login_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.cookie.login.timeout", oauth_cookie_login_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_max_age
    if(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_max_age) {
    cJSON *oauth_cookie_max_age_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_max_age);
    if(oauth_cookie_max_age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.cookie.max.age", oauth_cookie_max_age_local_JSON);
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

com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_t *com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_parseFromJSON(cJSON *com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_propertiesJSON){

    com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_t *com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_login_timeout
    config_node_property_string_t *oauth_cookie_login_timeout_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_max_age
    config_node_property_string_t *oauth_cookie_max_age_local_nonprim = NULL;

    // com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_login_timeout
    cJSON *oauth_cookie_login_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_propertiesJSON, "oauth.cookie.login.timeout");
    if (cJSON_IsNull(oauth_cookie_login_timeout)) {
        oauth_cookie_login_timeout = NULL;
    }
    if (oauth_cookie_login_timeout) { 
    oauth_cookie_login_timeout_local_nonprim = config_node_property_string_parseFromJSON(oauth_cookie_login_timeout); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties->oauth_cookie_max_age
    cJSON *oauth_cookie_max_age = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_propertiesJSON, "oauth.cookie.max.age");
    if (cJSON_IsNull(oauth_cookie_max_age)) {
        oauth_cookie_max_age = NULL;
    }
    if (oauth_cookie_max_age) { 
    oauth_cookie_max_age_local_nonprim = config_node_property_string_parseFromJSON(oauth_cookie_max_age); //nonprimitive
    }



    com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_local_var = com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_create_internal (
        oauth_cookie_login_timeout ? oauth_cookie_login_timeout_local_nonprim : NULL,
        oauth_cookie_max_age ? oauth_cookie_max_age_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties_local_var;
end:
    if (oauth_cookie_login_timeout_local_nonprim) {
        config_node_property_string_free(oauth_cookie_login_timeout_local_nonprim);
        oauth_cookie_login_timeout_local_nonprim = NULL;
    }
    if (oauth_cookie_max_age_local_nonprim) {
        config_node_property_string_free(oauth_cookie_max_age_local_nonprim);
        oauth_cookie_max_age_local_nonprim = NULL;
    }
    return NULL;

}
