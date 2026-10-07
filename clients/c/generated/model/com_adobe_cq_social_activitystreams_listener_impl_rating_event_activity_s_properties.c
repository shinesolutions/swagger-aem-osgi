#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties.h"



static com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_t *com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_create_internal(
    config_node_property_integer_t *ranking,
    config_node_property_boolean_t *enable
    ) {
    com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_t *com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_local_var = malloc(sizeof(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_t));
    if (!com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_local_var, 0, sizeof(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_t));
    com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_local_var->ranking = ranking;
    com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_local_var->enable = enable;
    return com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_t *com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_create(
    config_node_property_integer_t *ranking,
    config_node_property_boolean_t *enable
    ) {
    com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_t *result = com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_create_internal (
        ranking,
        enable
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_free(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_t *com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties) {
    if(NULL == com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties){
        return ;
    }
    if(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->ranking) {
        config_node_property_integer_free(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->ranking);
        com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->ranking = NULL;
    }
    if (com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->enable) {
        config_node_property_boolean_free(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->enable);
        com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->enable = NULL;
    }
    free(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties);
}

cJSON *com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_convertToJSON(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_t *com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->ranking
    if(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->ranking) {
    cJSON *ranking_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->ranking);
    if(ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ranking", ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->enable
    if(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->enable) {
    cJSON *enable_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->enable);
    if(enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enable", enable_local_JSON);
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

com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_t *com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_parseFromJSON(cJSON *com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_propertiesJSON){

    com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_t *com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->ranking
    config_node_property_integer_t *ranking_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->enable
    config_node_property_boolean_t *enable_local_nonprim = NULL;

    // com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->ranking
    cJSON *ranking = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_propertiesJSON, "ranking");
    if (cJSON_IsNull(ranking)) {
        ranking = NULL;
    }
    if (ranking) { 
    ranking_local_nonprim = config_node_property_integer_parseFromJSON(ranking); //nonprimitive
    }

    // com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties->enable
    cJSON *enable = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_propertiesJSON, "enable");
    if (cJSON_IsNull(enable)) {
        enable = NULL;
    }
    if (enable) { 
    enable_local_nonprim = config_node_property_boolean_parseFromJSON(enable); //nonprimitive
    }



    com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_local_var = com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_create_internal (
        ranking ? ranking_local_nonprim : NULL,
        enable ? enable_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties_local_var;
end:
    if (ranking_local_nonprim) {
        config_node_property_integer_free(ranking_local_nonprim);
        ranking_local_nonprim = NULL;
    }
    if (enable_local_nonprim) {
        config_node_property_boolean_free(enable_local_nonprim);
        enable_local_nonprim = NULL;
    }
    return NULL;

}
