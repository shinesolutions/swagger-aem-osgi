#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties.h"



static com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_t *com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_create_internal(
    config_node_property_string_t *communities_integration_livefyre_sling_event_filter
    ) {
    com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_t *com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_local_var = malloc(sizeof(com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_t));
    if (!com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_local_var, 0, sizeof(com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_t));
    com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_local_var->_library_owned = 1;
    com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_local_var->communities_integration_livefyre_sling_event_filter = communities_integration_livefyre_sling_event_filter;
    return com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_local_var;
}

__attribute__((deprecated)) com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_t *com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_create(
    config_node_property_string_t *communities_integration_livefyre_sling_event_filter
    ) {
    com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_t *result = com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_create_internal (
        communities_integration_livefyre_sling_event_filter
        );
    if (!result) {
    }
    return result;
}

void com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_free(com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_t *com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties) {
    if(NULL == com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties){
        return ;
    }
    if(com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties->communities_integration_livefyre_sling_event_filter) {
        config_node_property_string_free(com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties->communities_integration_livefyre_sling_event_filter);
        com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties->communities_integration_livefyre_sling_event_filter = NULL;
    }
    free(com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties);
}

cJSON *com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_convertToJSON(com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_t *com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties->communities_integration_livefyre_sling_event_filter
    if(com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties->communities_integration_livefyre_sling_event_filter) {
    cJSON *communities_integration_livefyre_sling_event_filter_local_JSON = config_node_property_string_convertToJSON(com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties->communities_integration_livefyre_sling_event_filter);
    if(communities_integration_livefyre_sling_event_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "communities.integration.livefyre.sling.event.filter", communities_integration_livefyre_sling_event_filter_local_JSON);
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

com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_t *com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_parseFromJSON(cJSON *com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_propertiesJSON){

    com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_t *com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_local_var = NULL;

    // define the local variable for com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties->communities_integration_livefyre_sling_event_filter
    config_node_property_string_t *communities_integration_livefyre_sling_event_filter_local_nonprim = NULL;

    // com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties->communities_integration_livefyre_sling_event_filter
    cJSON *communities_integration_livefyre_sling_event_filter = cJSON_GetObjectItemCaseSensitive(com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_propertiesJSON, "communities.integration.livefyre.sling.event.filter");
    if (cJSON_IsNull(communities_integration_livefyre_sling_event_filter)) {
        communities_integration_livefyre_sling_event_filter = NULL;
    }
    if (communities_integration_livefyre_sling_event_filter) { 
    communities_integration_livefyre_sling_event_filter_local_nonprim = config_node_property_string_parseFromJSON(communities_integration_livefyre_sling_event_filter); //nonprimitive
    }



    com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_local_var = com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_create_internal (
        communities_integration_livefyre_sling_event_filter ? communities_integration_livefyre_sling_event_filter_local_nonprim : NULL
        );

    if (!com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_local_var) {
        goto end;
    }

    return com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties_local_var;
end:
    if (communities_integration_livefyre_sling_event_filter_local_nonprim) {
        config_node_property_string_free(communities_integration_livefyre_sling_event_filter_local_nonprim);
        communities_integration_livefyre_sling_event_filter_local_nonprim = NULL;
    }
    return NULL;

}
