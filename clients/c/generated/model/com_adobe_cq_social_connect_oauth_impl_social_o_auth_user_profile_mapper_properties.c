#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties.h"



static com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_t *com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_create_internal(
    config_node_property_array_t *facebook,
    config_node_property_array_t *twitter,
    config_node_property_string_t *provider_config_user_folder
    ) {
    com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_t *com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_local_var = malloc(sizeof(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_t));
    if (!com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_local_var, 0, sizeof(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_t));
    com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_local_var->facebook = facebook;
    com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_local_var->twitter = twitter;
    com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_local_var->provider_config_user_folder = provider_config_user_folder;
    return com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_t *com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_create(
    config_node_property_array_t *facebook,
    config_node_property_array_t *twitter,
    config_node_property_string_t *provider_config_user_folder
    ) {
    com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_t *result = com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_create_internal (
        facebook,
        twitter,
        provider_config_user_folder
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_free(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_t *com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties) {
    if(NULL == com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties){
        return ;
    }
    if(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->facebook) {
        config_node_property_array_free(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->facebook);
        com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->facebook = NULL;
    }
    if (com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->twitter) {
        config_node_property_array_free(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->twitter);
        com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->twitter = NULL;
    }
    if (com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->provider_config_user_folder) {
        config_node_property_string_free(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->provider_config_user_folder);
        com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->provider_config_user_folder = NULL;
    }
    free(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties);
}

cJSON *com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_convertToJSON(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_t *com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->facebook
    if(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->facebook) {
    cJSON *facebook_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->facebook);
    if(facebook_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "facebook", facebook_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->twitter
    if(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->twitter) {
    cJSON *twitter_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->twitter);
    if(twitter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "twitter", twitter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->provider_config_user_folder
    if(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->provider_config_user_folder) {
    cJSON *provider_config_user_folder_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->provider_config_user_folder);
    if(provider_config_user_folder_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "provider.config.user.folder", provider_config_user_folder_local_JSON);
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

com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_t *com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_parseFromJSON(cJSON *com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_propertiesJSON){

    com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_t *com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->facebook
    config_node_property_array_t *facebook_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->twitter
    config_node_property_array_t *twitter_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->provider_config_user_folder
    config_node_property_string_t *provider_config_user_folder_local_nonprim = NULL;

    // com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->facebook
    cJSON *facebook = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_propertiesJSON, "facebook");
    if (cJSON_IsNull(facebook)) {
        facebook = NULL;
    }
    if (facebook) { 
    facebook_local_nonprim = config_node_property_array_parseFromJSON(facebook); //nonprimitive
    }

    // com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->twitter
    cJSON *twitter = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_propertiesJSON, "twitter");
    if (cJSON_IsNull(twitter)) {
        twitter = NULL;
    }
    if (twitter) { 
    twitter_local_nonprim = config_node_property_array_parseFromJSON(twitter); //nonprimitive
    }

    // com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties->provider_config_user_folder
    cJSON *provider_config_user_folder = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_propertiesJSON, "provider.config.user.folder");
    if (cJSON_IsNull(provider_config_user_folder)) {
        provider_config_user_folder = NULL;
    }
    if (provider_config_user_folder) { 
    provider_config_user_folder_local_nonprim = config_node_property_string_parseFromJSON(provider_config_user_folder); //nonprimitive
    }



    com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_local_var = com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_create_internal (
        facebook ? facebook_local_nonprim : NULL,
        twitter ? twitter_local_nonprim : NULL,
        provider_config_user_folder ? provider_config_user_folder_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties_local_var;
end:
    if (facebook_local_nonprim) {
        config_node_property_array_free(facebook_local_nonprim);
        facebook_local_nonprim = NULL;
    }
    if (twitter_local_nonprim) {
        config_node_property_array_free(twitter_local_nonprim);
        twitter_local_nonprim = NULL;
    }
    if (provider_config_user_folder_local_nonprim) {
        config_node_property_string_free(provider_config_user_folder_local_nonprim);
        provider_config_user_folder_local_nonprim = NULL;
    }
    return NULL;

}
