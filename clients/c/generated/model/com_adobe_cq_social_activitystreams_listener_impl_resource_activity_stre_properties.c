#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties.h"



static com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_t *com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_create_internal(
    config_node_property_string_t *stream_path,
    config_node_property_string_t *stream_name
    ) {
    com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_t *com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_local_var = malloc(sizeof(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_t));
    if (!com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_local_var, 0, sizeof(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_t));
    com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_local_var->stream_path = stream_path;
    com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_local_var->stream_name = stream_name;
    return com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_t *com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_create(
    config_node_property_string_t *stream_path,
    config_node_property_string_t *stream_name
    ) {
    com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_t *result = com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_create_internal (
        stream_path,
        stream_name
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_free(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_t *com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties) {
    if(NULL == com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties){
        return ;
    }
    if(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_path) {
        config_node_property_string_free(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_path);
        com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_path = NULL;
    }
    if (com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_name) {
        config_node_property_string_free(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_name);
        com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_name = NULL;
    }
    free(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties);
}

cJSON *com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_convertToJSON(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_t *com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_path
    if(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_path) {
    cJSON *stream_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_path);
    if(stream_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "streamPath", stream_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_name
    if(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_name) {
    cJSON *stream_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_name);
    if(stream_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "streamName", stream_name_local_JSON);
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

com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_t *com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_parseFromJSON(cJSON *com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_propertiesJSON){

    com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_t *com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_path
    config_node_property_string_t *stream_path_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_name
    config_node_property_string_t *stream_name_local_nonprim = NULL;

    // com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_path
    cJSON *stream_path = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_propertiesJSON, "streamPath");
    if (cJSON_IsNull(stream_path)) {
        stream_path = NULL;
    }
    if (stream_path) { 
    stream_path_local_nonprim = config_node_property_string_parseFromJSON(stream_path); //nonprimitive
    }

    // com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties->stream_name
    cJSON *stream_name = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_propertiesJSON, "streamName");
    if (cJSON_IsNull(stream_name)) {
        stream_name = NULL;
    }
    if (stream_name) { 
    stream_name_local_nonprim = config_node_property_string_parseFromJSON(stream_name); //nonprimitive
    }



    com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_local_var = com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_create_internal (
        stream_path ? stream_path_local_nonprim : NULL,
        stream_name ? stream_name_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties_local_var;
end:
    if (stream_path_local_nonprim) {
        config_node_property_string_free(stream_path_local_nonprim);
        stream_path_local_nonprim = NULL;
    }
    if (stream_name_local_nonprim) {
        config_node_property_string_free(stream_name_local_nonprim);
        stream_name_local_nonprim = NULL;
    }
    return NULL;

}
