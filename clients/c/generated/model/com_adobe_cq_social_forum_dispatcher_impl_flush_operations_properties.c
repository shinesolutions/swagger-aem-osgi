#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties.h"



static com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_t *com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_create_internal(
    config_node_property_integer_t *extension_order,
    config_node_property_boolean_t *flush_forumontopic
    ) {
    com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_t *com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_local_var = malloc(sizeof(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_t));
    if (!com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_local_var, 0, sizeof(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_t));
    com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_local_var->extension_order = extension_order;
    com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_local_var->flush_forumontopic = flush_forumontopic;
    return com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_t *com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_create(
    config_node_property_integer_t *extension_order,
    config_node_property_boolean_t *flush_forumontopic
    ) {
    com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_t *result = com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_create_internal (
        extension_order,
        flush_forumontopic
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_free(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_t *com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties) {
    if(NULL == com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties){
        return ;
    }
    if(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->extension_order) {
        config_node_property_integer_free(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->extension_order);
        com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->extension_order = NULL;
    }
    if (com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->flush_forumontopic) {
        config_node_property_boolean_free(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->flush_forumontopic);
        com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->flush_forumontopic = NULL;
    }
    free(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties);
}

cJSON *com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_convertToJSON(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_t *com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->extension_order
    if(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->extension_order) {
    cJSON *extension_order_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->extension_order);
    if(extension_order_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "extension.order", extension_order_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->flush_forumontopic
    if(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->flush_forumontopic) {
    cJSON *flush_forumontopic_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->flush_forumontopic);
    if(flush_forumontopic_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "flush.forumontopic", flush_forumontopic_local_JSON);
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

com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_t *com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_parseFromJSON(cJSON *com_adobe_cq_social_forum_dispatcher_impl_flush_operations_propertiesJSON){

    com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_t *com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->extension_order
    config_node_property_integer_t *extension_order_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->flush_forumontopic
    config_node_property_boolean_t *flush_forumontopic_local_nonprim = NULL;

    // com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->extension_order
    cJSON *extension_order = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_propertiesJSON, "extension.order");
    if (cJSON_IsNull(extension_order)) {
        extension_order = NULL;
    }
    if (extension_order) { 
    extension_order_local_nonprim = config_node_property_integer_parseFromJSON(extension_order); //nonprimitive
    }

    // com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties->flush_forumontopic
    cJSON *flush_forumontopic = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_forum_dispatcher_impl_flush_operations_propertiesJSON, "flush.forumontopic");
    if (cJSON_IsNull(flush_forumontopic)) {
        flush_forumontopic = NULL;
    }
    if (flush_forumontopic) { 
    flush_forumontopic_local_nonprim = config_node_property_boolean_parseFromJSON(flush_forumontopic); //nonprimitive
    }



    com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_local_var = com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_create_internal (
        extension_order ? extension_order_local_nonprim : NULL,
        flush_forumontopic ? flush_forumontopic_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties_local_var;
end:
    if (extension_order_local_nonprim) {
        config_node_property_integer_free(extension_order_local_nonprim);
        extension_order_local_nonprim = NULL;
    }
    if (flush_forumontopic_local_nonprim) {
        config_node_property_boolean_free(flush_forumontopic_local_nonprim);
        flush_forumontopic_local_nonprim = NULL;
    }
    return NULL;

}
