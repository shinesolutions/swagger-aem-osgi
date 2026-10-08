#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_contentsync_impl_content_sync_manager_impl_properties.h"



static com_day_cq_contentsync_impl_content_sync_manager_impl_properties_t *com_day_cq_contentsync_impl_content_sync_manager_impl_properties_create_internal(
    config_node_property_string_t *contentsync_fallback_authorizable,
    config_node_property_string_t *contentsync_fallback_updateuser
    ) {
    com_day_cq_contentsync_impl_content_sync_manager_impl_properties_t *com_day_cq_contentsync_impl_content_sync_manager_impl_properties_local_var = malloc(sizeof(com_day_cq_contentsync_impl_content_sync_manager_impl_properties_t));
    if (!com_day_cq_contentsync_impl_content_sync_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_contentsync_impl_content_sync_manager_impl_properties_local_var, 0, sizeof(com_day_cq_contentsync_impl_content_sync_manager_impl_properties_t));
    com_day_cq_contentsync_impl_content_sync_manager_impl_properties_local_var->_library_owned = 1;
    com_day_cq_contentsync_impl_content_sync_manager_impl_properties_local_var->contentsync_fallback_authorizable = contentsync_fallback_authorizable;
    com_day_cq_contentsync_impl_content_sync_manager_impl_properties_local_var->contentsync_fallback_updateuser = contentsync_fallback_updateuser;
    return com_day_cq_contentsync_impl_content_sync_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_contentsync_impl_content_sync_manager_impl_properties_t *com_day_cq_contentsync_impl_content_sync_manager_impl_properties_create(
    config_node_property_string_t *contentsync_fallback_authorizable,
    config_node_property_string_t *contentsync_fallback_updateuser
    ) {
    com_day_cq_contentsync_impl_content_sync_manager_impl_properties_t *result = com_day_cq_contentsync_impl_content_sync_manager_impl_properties_create_internal (
        contentsync_fallback_authorizable,
        contentsync_fallback_updateuser
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_contentsync_impl_content_sync_manager_impl_properties_free(com_day_cq_contentsync_impl_content_sync_manager_impl_properties_t *com_day_cq_contentsync_impl_content_sync_manager_impl_properties) {
    if(NULL == com_day_cq_contentsync_impl_content_sync_manager_impl_properties){
        return ;
    }
    if(com_day_cq_contentsync_impl_content_sync_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_contentsync_impl_content_sync_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_authorizable) {
        config_node_property_string_free(com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_authorizable);
        com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_authorizable = NULL;
    }
    if (com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_updateuser) {
        config_node_property_string_free(com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_updateuser);
        com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_updateuser = NULL;
    }
    free(com_day_cq_contentsync_impl_content_sync_manager_impl_properties);
}

cJSON *com_day_cq_contentsync_impl_content_sync_manager_impl_properties_convertToJSON(com_day_cq_contentsync_impl_content_sync_manager_impl_properties_t *com_day_cq_contentsync_impl_content_sync_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_authorizable
    if(com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_authorizable) {
    cJSON *contentsync_fallback_authorizable_local_JSON = config_node_property_string_convertToJSON(com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_authorizable);
    if(contentsync_fallback_authorizable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "contentsync.fallback.authorizable", contentsync_fallback_authorizable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_updateuser
    if(com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_updateuser) {
    cJSON *contentsync_fallback_updateuser_local_JSON = config_node_property_string_convertToJSON(com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_updateuser);
    if(contentsync_fallback_updateuser_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "contentsync.fallback.updateuser", contentsync_fallback_updateuser_local_JSON);
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

com_day_cq_contentsync_impl_content_sync_manager_impl_properties_t *com_day_cq_contentsync_impl_content_sync_manager_impl_properties_parseFromJSON(cJSON *com_day_cq_contentsync_impl_content_sync_manager_impl_propertiesJSON){

    com_day_cq_contentsync_impl_content_sync_manager_impl_properties_t *com_day_cq_contentsync_impl_content_sync_manager_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_authorizable
    config_node_property_string_t *contentsync_fallback_authorizable_local_nonprim = NULL;

    // define the local variable for com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_updateuser
    config_node_property_string_t *contentsync_fallback_updateuser_local_nonprim = NULL;

    // com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_authorizable
    cJSON *contentsync_fallback_authorizable = cJSON_GetObjectItemCaseSensitive(com_day_cq_contentsync_impl_content_sync_manager_impl_propertiesJSON, "contentsync.fallback.authorizable");
    if (cJSON_IsNull(contentsync_fallback_authorizable)) {
        contentsync_fallback_authorizable = NULL;
    }
    if (contentsync_fallback_authorizable) { 
    contentsync_fallback_authorizable_local_nonprim = config_node_property_string_parseFromJSON(contentsync_fallback_authorizable); //nonprimitive
    }

    // com_day_cq_contentsync_impl_content_sync_manager_impl_properties->contentsync_fallback_updateuser
    cJSON *contentsync_fallback_updateuser = cJSON_GetObjectItemCaseSensitive(com_day_cq_contentsync_impl_content_sync_manager_impl_propertiesJSON, "contentsync.fallback.updateuser");
    if (cJSON_IsNull(contentsync_fallback_updateuser)) {
        contentsync_fallback_updateuser = NULL;
    }
    if (contentsync_fallback_updateuser) { 
    contentsync_fallback_updateuser_local_nonprim = config_node_property_string_parseFromJSON(contentsync_fallback_updateuser); //nonprimitive
    }



    com_day_cq_contentsync_impl_content_sync_manager_impl_properties_local_var = com_day_cq_contentsync_impl_content_sync_manager_impl_properties_create_internal (
        contentsync_fallback_authorizable ? contentsync_fallback_authorizable_local_nonprim : NULL,
        contentsync_fallback_updateuser ? contentsync_fallback_updateuser_local_nonprim : NULL
        );

    if (!com_day_cq_contentsync_impl_content_sync_manager_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_contentsync_impl_content_sync_manager_impl_properties_local_var;
end:
    if (contentsync_fallback_authorizable_local_nonprim) {
        config_node_property_string_free(contentsync_fallback_authorizable_local_nonprim);
        contentsync_fallback_authorizable_local_nonprim = NULL;
    }
    if (contentsync_fallback_updateuser_local_nonprim) {
        config_node_property_string_free(contentsync_fallback_updateuser_local_nonprim);
        contentsync_fallback_updateuser_local_nonprim = NULL;
    }
    return NULL;

}
