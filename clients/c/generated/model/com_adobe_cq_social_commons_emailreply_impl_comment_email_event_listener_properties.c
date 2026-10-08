#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties.h"



static com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_t *com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_create_internal(
    config_node_property_string_t *event_topics
    ) {
    com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_t *com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_local_var = malloc(sizeof(com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_t));
    if (!com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_local_var, 0, sizeof(com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_t));
    com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_local_var->event_topics = event_topics;
    return com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_t *com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_create(
    config_node_property_string_t *event_topics
    ) {
    com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_t *result = com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_create_internal (
        event_topics
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_free(com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_t *com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties) {
    if(NULL == com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties){
        return ;
    }
    if(com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties->event_topics) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties->event_topics);
        com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties->event_topics = NULL;
    }
    free(com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties);
}

cJSON *com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_t *com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties->event_topics
    if(com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties->event_topics) {
    cJSON *event_topics_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties->event_topics);
    if(event_topics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event.topics", event_topics_local_JSON);
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

com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_t *com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_propertiesJSON){

    com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_t *com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties->event_topics
    config_node_property_string_t *event_topics_local_nonprim = NULL;

    // com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties->event_topics
    cJSON *event_topics = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_propertiesJSON, "event.topics");
    if (cJSON_IsNull(event_topics)) {
        event_topics = NULL;
    }
    if (event_topics) { 
    event_topics_local_nonprim = config_node_property_string_parseFromJSON(event_topics); //nonprimitive
    }



    com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_local_var = com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_create_internal (
        event_topics ? event_topics_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties_local_var;
end:
    if (event_topics_local_nonprim) {
        config_node_property_string_free(event_topics_local_nonprim);
        event_topics_local_nonprim = NULL;
    }
    return NULL;

}
