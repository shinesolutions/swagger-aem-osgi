#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties.h"



static com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_t *com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_create_internal(
    config_node_property_string_t *event_topics,
    config_node_property_string_t *event_filter,
    config_node_property_array_t *verbs
    ) {
    com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_t *com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_local_var = malloc(sizeof(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_t));
    if (!com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_local_var, 0, sizeof(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_t));
    com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_local_var->event_topics = event_topics;
    com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_local_var->event_filter = event_filter;
    com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_local_var->verbs = verbs;
    return com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_t *com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_create(
    config_node_property_string_t *event_topics,
    config_node_property_string_t *event_filter,
    config_node_property_array_t *verbs
    ) {
    com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_t *result = com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_create_internal (
        event_topics,
        event_filter,
        verbs
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_free(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_t *com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties) {
    if(NULL == com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties){
        return ;
    }
    if(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_topics) {
        config_node_property_string_free(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_topics);
        com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_topics = NULL;
    }
    if (com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_filter) {
        config_node_property_string_free(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_filter);
        com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_filter = NULL;
    }
    if (com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->verbs) {
        config_node_property_array_free(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->verbs);
        com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->verbs = NULL;
    }
    free(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties);
}

cJSON *com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_convertToJSON(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_t *com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_topics
    if(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_topics) {
    cJSON *event_topics_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_topics);
    if(event_topics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event.topics", event_topics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_filter
    if(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_filter) {
    cJSON *event_filter_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_filter);
    if(event_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event.filter", event_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->verbs
    if(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->verbs) {
    cJSON *verbs_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->verbs);
    if(verbs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "verbs", verbs_local_JSON);
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

com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_t *com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_propertiesJSON){

    com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_t *com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_topics
    config_node_property_string_t *event_topics_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_filter
    config_node_property_string_t *event_filter_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->verbs
    config_node_property_array_t *verbs_local_nonprim = NULL;

    // com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_topics
    cJSON *event_topics = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_propertiesJSON, "event.topics");
    if (cJSON_IsNull(event_topics)) {
        event_topics = NULL;
    }
    if (event_topics) { 
    event_topics_local_nonprim = config_node_property_string_parseFromJSON(event_topics); //nonprimitive
    }

    // com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->event_filter
    cJSON *event_filter = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_propertiesJSON, "event.filter");
    if (cJSON_IsNull(event_filter)) {
        event_filter = NULL;
    }
    if (event_filter) { 
    event_filter_local_nonprim = config_node_property_string_parseFromJSON(event_filter); //nonprimitive
    }

    // com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties->verbs
    cJSON *verbs = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_propertiesJSON, "verbs");
    if (cJSON_IsNull(verbs)) {
        verbs = NULL;
    }
    if (verbs) { 
    verbs_local_nonprim = config_node_property_array_parseFromJSON(verbs); //nonprimitive
    }



    com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_local_var = com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_create_internal (
        event_topics ? event_topics_local_nonprim : NULL,
        event_filter ? event_filter_local_nonprim : NULL,
        verbs ? verbs_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties_local_var;
end:
    if (event_topics_local_nonprim) {
        config_node_property_string_free(event_topics_local_nonprim);
        event_topics_local_nonprim = NULL;
    }
    if (event_filter_local_nonprim) {
        config_node_property_string_free(event_filter_local_nonprim);
        event_filter_local_nonprim = NULL;
    }
    if (verbs_local_nonprim) {
        config_node_property_array_free(verbs_local_nonprim);
        verbs_local_nonprim = NULL;
    }
    return NULL;

}
