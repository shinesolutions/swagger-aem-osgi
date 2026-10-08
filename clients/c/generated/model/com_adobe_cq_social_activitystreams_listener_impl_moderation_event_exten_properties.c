#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties.h"



static com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_t *com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_create_internal(
    config_node_property_boolean_t *accepted,
    config_node_property_integer_t *ranked
    ) {
    com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_t *com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_local_var = malloc(sizeof(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_t));
    if (!com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_local_var, 0, sizeof(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_t));
    com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_local_var->accepted = accepted;
    com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_local_var->ranked = ranked;
    return com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_t *com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_create(
    config_node_property_boolean_t *accepted,
    config_node_property_integer_t *ranked
    ) {
    com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_t *result = com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_create_internal (
        accepted,
        ranked
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_free(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_t *com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties) {
    if(NULL == com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties){
        return ;
    }
    if(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->accepted) {
        config_node_property_boolean_free(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->accepted);
        com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->accepted = NULL;
    }
    if (com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->ranked) {
        config_node_property_integer_free(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->ranked);
        com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->ranked = NULL;
    }
    free(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties);
}

cJSON *com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_convertToJSON(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_t *com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->accepted
    if(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->accepted) {
    cJSON *accepted_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->accepted);
    if(accepted_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "accepted", accepted_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->ranked
    if(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->ranked) {
    cJSON *ranked_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->ranked);
    if(ranked_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ranked", ranked_local_JSON);
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

com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_t *com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_parseFromJSON(cJSON *com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_propertiesJSON){

    com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_t *com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->accepted
    config_node_property_boolean_t *accepted_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->ranked
    config_node_property_integer_t *ranked_local_nonprim = NULL;

    // com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->accepted
    cJSON *accepted = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_propertiesJSON, "accepted");
    if (cJSON_IsNull(accepted)) {
        accepted = NULL;
    }
    if (accepted) { 
    accepted_local_nonprim = config_node_property_boolean_parseFromJSON(accepted); //nonprimitive
    }

    // com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties->ranked
    cJSON *ranked = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_propertiesJSON, "ranked");
    if (cJSON_IsNull(ranked)) {
        ranked = NULL;
    }
    if (ranked) { 
    ranked_local_nonprim = config_node_property_integer_parseFromJSON(ranked); //nonprimitive
    }



    com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_local_var = com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_create_internal (
        accepted ? accepted_local_nonprim : NULL,
        ranked ? ranked_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties_local_var;
end:
    if (accepted_local_nonprim) {
        config_node_property_boolean_free(accepted_local_nonprim);
        accepted_local_nonprim = NULL;
    }
    if (ranked_local_nonprim) {
        config_node_property_integer_free(ranked_local_nonprim);
        ranked_local_nonprim = NULL;
    }
    return NULL;

}
