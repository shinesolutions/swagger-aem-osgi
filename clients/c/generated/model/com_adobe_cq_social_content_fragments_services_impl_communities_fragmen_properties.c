#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties.h"



static com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_t *com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_create_internal(
    config_node_property_boolean_t *cq_social_content_fragments_services_enabled,
    config_node_property_integer_t *cq_social_content_fragments_services_wait_time_seconds
    ) {
    com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_t *com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_local_var = malloc(sizeof(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_t));
    if (!com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_local_var, 0, sizeof(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_t));
    com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_local_var->cq_social_content_fragments_services_enabled = cq_social_content_fragments_services_enabled;
    com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_local_var->cq_social_content_fragments_services_wait_time_seconds = cq_social_content_fragments_services_wait_time_seconds;
    return com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_t *com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_create(
    config_node_property_boolean_t *cq_social_content_fragments_services_enabled,
    config_node_property_integer_t *cq_social_content_fragments_services_wait_time_seconds
    ) {
    com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_t *result = com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_create_internal (
        cq_social_content_fragments_services_enabled,
        cq_social_content_fragments_services_wait_time_seconds
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_free(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_t *com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties) {
    if(NULL == com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties){
        return ;
    }
    if(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_enabled) {
        config_node_property_boolean_free(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_enabled);
        com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_enabled = NULL;
    }
    if (com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_wait_time_seconds) {
        config_node_property_integer_free(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_wait_time_seconds);
        com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_wait_time_seconds = NULL;
    }
    free(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties);
}

cJSON *com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_convertToJSON(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_t *com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_enabled
    if(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_enabled) {
    cJSON *cq_social_content_fragments_services_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_enabled);
    if(cq_social_content_fragments_services_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.social.content.fragments.services.enabled", cq_social_content_fragments_services_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_wait_time_seconds
    if(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_wait_time_seconds) {
    cJSON *cq_social_content_fragments_services_wait_time_seconds_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_wait_time_seconds);
    if(cq_social_content_fragments_services_wait_time_seconds_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.social.content.fragments.services.waitTimeSeconds", cq_social_content_fragments_services_wait_time_seconds_local_JSON);
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

com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_t *com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_parseFromJSON(cJSON *com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_propertiesJSON){

    com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_t *com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_enabled
    config_node_property_boolean_t *cq_social_content_fragments_services_enabled_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_wait_time_seconds
    config_node_property_integer_t *cq_social_content_fragments_services_wait_time_seconds_local_nonprim = NULL;

    // com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_enabled
    cJSON *cq_social_content_fragments_services_enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_propertiesJSON, "cq.social.content.fragments.services.enabled");
    if (cJSON_IsNull(cq_social_content_fragments_services_enabled)) {
        cq_social_content_fragments_services_enabled = NULL;
    }
    if (cq_social_content_fragments_services_enabled) { 
    cq_social_content_fragments_services_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(cq_social_content_fragments_services_enabled); //nonprimitive
    }

    // com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties->cq_social_content_fragments_services_wait_time_seconds
    cJSON *cq_social_content_fragments_services_wait_time_seconds = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_propertiesJSON, "cq.social.content.fragments.services.waitTimeSeconds");
    if (cJSON_IsNull(cq_social_content_fragments_services_wait_time_seconds)) {
        cq_social_content_fragments_services_wait_time_seconds = NULL;
    }
    if (cq_social_content_fragments_services_wait_time_seconds) { 
    cq_social_content_fragments_services_wait_time_seconds_local_nonprim = config_node_property_integer_parseFromJSON(cq_social_content_fragments_services_wait_time_seconds); //nonprimitive
    }



    com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_local_var = com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_create_internal (
        cq_social_content_fragments_services_enabled ? cq_social_content_fragments_services_enabled_local_nonprim : NULL,
        cq_social_content_fragments_services_wait_time_seconds ? cq_social_content_fragments_services_wait_time_seconds_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties_local_var;
end:
    if (cq_social_content_fragments_services_enabled_local_nonprim) {
        config_node_property_boolean_free(cq_social_content_fragments_services_enabled_local_nonprim);
        cq_social_content_fragments_services_enabled_local_nonprim = NULL;
    }
    if (cq_social_content_fragments_services_wait_time_seconds_local_nonprim) {
        config_node_property_integer_free(cq_social_content_fragments_services_wait_time_seconds_local_nonprim);
        cq_social_content_fragments_services_wait_time_seconds_local_nonprim = NULL;
    }
    return NULL;

}
