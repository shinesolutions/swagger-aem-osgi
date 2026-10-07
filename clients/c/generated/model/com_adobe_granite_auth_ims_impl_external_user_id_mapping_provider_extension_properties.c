#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties.h"



static com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_t *com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_create_internal(
    config_node_property_string_t *oauth_provider_id
    ) {
    com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_t *com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_local_var = malloc(sizeof(com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_t));
    if (!com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_local_var, 0, sizeof(com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_t));
    com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_local_var->oauth_provider_id = oauth_provider_id;
    return com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_t *com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_create(
    config_node_property_string_t *oauth_provider_id
    ) {
    com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_t *result = com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_create_internal (
        oauth_provider_id
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_free(com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_t *com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties) {
    if(NULL == com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties){
        return ;
    }
    if(com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties->oauth_provider_id) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties->oauth_provider_id);
        com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties->oauth_provider_id = NULL;
    }
    free(com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties);
}

cJSON *com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_convertToJSON(com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_t *com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties->oauth_provider_id
    if(com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties->oauth_provider_id) {
    cJSON *oauth_provider_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties->oauth_provider_id);
    if(oauth_provider_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.id", oauth_provider_id_local_JSON);
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

com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_t *com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_parseFromJSON(cJSON *com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_propertiesJSON){

    com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_t *com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties->oauth_provider_id
    config_node_property_string_t *oauth_provider_id_local_nonprim = NULL;

    // com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties->oauth_provider_id
    cJSON *oauth_provider_id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_propertiesJSON, "oauth.provider.id");
    if (cJSON_IsNull(oauth_provider_id)) {
        oauth_provider_id = NULL;
    }
    if (oauth_provider_id) { 
    oauth_provider_id_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_id); //nonprimitive
    }



    com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_local_var = com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_create_internal (
        oauth_provider_id ? oauth_provider_id_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties_local_var;
end:
    if (oauth_provider_id_local_nonprim) {
        config_node_property_string_free(oauth_provider_id_local_nonprim);
        oauth_provider_id_local_nonprim = NULL;
    }
    return NULL;

}
