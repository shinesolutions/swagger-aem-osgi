#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_screens_impl_screens_channel_post_processor_properties.h"



static com_adobe_cq_screens_impl_screens_channel_post_processor_properties_t *com_adobe_cq_screens_impl_screens_channel_post_processor_properties_create_internal(
    config_node_property_array_t *screens_channels_properties_to_remove
    ) {
    com_adobe_cq_screens_impl_screens_channel_post_processor_properties_t *com_adobe_cq_screens_impl_screens_channel_post_processor_properties_local_var = malloc(sizeof(com_adobe_cq_screens_impl_screens_channel_post_processor_properties_t));
    if (!com_adobe_cq_screens_impl_screens_channel_post_processor_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_screens_impl_screens_channel_post_processor_properties_local_var, 0, sizeof(com_adobe_cq_screens_impl_screens_channel_post_processor_properties_t));
    com_adobe_cq_screens_impl_screens_channel_post_processor_properties_local_var->_library_owned = 1;
    com_adobe_cq_screens_impl_screens_channel_post_processor_properties_local_var->screens_channels_properties_to_remove = screens_channels_properties_to_remove;
    return com_adobe_cq_screens_impl_screens_channel_post_processor_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_screens_impl_screens_channel_post_processor_properties_t *com_adobe_cq_screens_impl_screens_channel_post_processor_properties_create(
    config_node_property_array_t *screens_channels_properties_to_remove
    ) {
    com_adobe_cq_screens_impl_screens_channel_post_processor_properties_t *result = com_adobe_cq_screens_impl_screens_channel_post_processor_properties_create_internal (
        screens_channels_properties_to_remove
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_screens_impl_screens_channel_post_processor_properties_free(com_adobe_cq_screens_impl_screens_channel_post_processor_properties_t *com_adobe_cq_screens_impl_screens_channel_post_processor_properties) {
    if(NULL == com_adobe_cq_screens_impl_screens_channel_post_processor_properties){
        return ;
    }
    if(com_adobe_cq_screens_impl_screens_channel_post_processor_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_screens_impl_screens_channel_post_processor_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_screens_impl_screens_channel_post_processor_properties->screens_channels_properties_to_remove) {
        config_node_property_array_free(com_adobe_cq_screens_impl_screens_channel_post_processor_properties->screens_channels_properties_to_remove);
        com_adobe_cq_screens_impl_screens_channel_post_processor_properties->screens_channels_properties_to_remove = NULL;
    }
    free(com_adobe_cq_screens_impl_screens_channel_post_processor_properties);
}

cJSON *com_adobe_cq_screens_impl_screens_channel_post_processor_properties_convertToJSON(com_adobe_cq_screens_impl_screens_channel_post_processor_properties_t *com_adobe_cq_screens_impl_screens_channel_post_processor_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_screens_impl_screens_channel_post_processor_properties->screens_channels_properties_to_remove
    if(com_adobe_cq_screens_impl_screens_channel_post_processor_properties->screens_channels_properties_to_remove) {
    cJSON *screens_channels_properties_to_remove_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_screens_impl_screens_channel_post_processor_properties->screens_channels_properties_to_remove);
    if(screens_channels_properties_to_remove_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "screens.channels.properties.to.remove", screens_channels_properties_to_remove_local_JSON);
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

com_adobe_cq_screens_impl_screens_channel_post_processor_properties_t *com_adobe_cq_screens_impl_screens_channel_post_processor_properties_parseFromJSON(cJSON *com_adobe_cq_screens_impl_screens_channel_post_processor_propertiesJSON){

    com_adobe_cq_screens_impl_screens_channel_post_processor_properties_t *com_adobe_cq_screens_impl_screens_channel_post_processor_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_screens_impl_screens_channel_post_processor_properties->screens_channels_properties_to_remove
    config_node_property_array_t *screens_channels_properties_to_remove_local_nonprim = NULL;

    // com_adobe_cq_screens_impl_screens_channel_post_processor_properties->screens_channels_properties_to_remove
    cJSON *screens_channels_properties_to_remove = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_impl_screens_channel_post_processor_propertiesJSON, "screens.channels.properties.to.remove");
    if (cJSON_IsNull(screens_channels_properties_to_remove)) {
        screens_channels_properties_to_remove = NULL;
    }
    if (screens_channels_properties_to_remove) { 
    screens_channels_properties_to_remove_local_nonprim = config_node_property_array_parseFromJSON(screens_channels_properties_to_remove); //nonprimitive
    }



    com_adobe_cq_screens_impl_screens_channel_post_processor_properties_local_var = com_adobe_cq_screens_impl_screens_channel_post_processor_properties_create_internal (
        screens_channels_properties_to_remove ? screens_channels_properties_to_remove_local_nonprim : NULL
        );

    if (!com_adobe_cq_screens_impl_screens_channel_post_processor_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_screens_impl_screens_channel_post_processor_properties_local_var;
end:
    if (screens_channels_properties_to_remove_local_nonprim) {
        config_node_property_array_free(screens_channels_properties_to_remove_local_nonprim);
        screens_channels_properties_to_remove_local_nonprim = NULL;
    }
    return NULL;

}
