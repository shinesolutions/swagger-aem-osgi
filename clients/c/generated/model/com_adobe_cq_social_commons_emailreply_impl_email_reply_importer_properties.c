#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties.h"



static com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_create_internal(
    config_node_property_drop_down_t *connect_protocol
    ) {
    com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_local_var = malloc(sizeof(com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_t));
    if (!com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_local_var, 0, sizeof(com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_t));
    com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_local_var->connect_protocol = connect_protocol;
    return com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_create(
    config_node_property_drop_down_t *connect_protocol
    ) {
    com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_t *result = com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_create_internal (
        connect_protocol
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties) {
    if(NULL == com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties){
        return ;
    }
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties->connect_protocol) {
        config_node_property_drop_down_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties->connect_protocol);
        com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties->connect_protocol = NULL;
    }
    free(com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties);
}

cJSON *com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties->connect_protocol
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties->connect_protocol) {
    cJSON *connect_protocol_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties->connect_protocol);
    if(connect_protocol_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "connectProtocol", connect_protocol_local_JSON);
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

com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_propertiesJSON){

    com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties->connect_protocol
    config_node_property_drop_down_t *connect_protocol_local_nonprim = NULL;

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties->connect_protocol
    cJSON *connect_protocol = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_propertiesJSON, "connectProtocol");
    if (cJSON_IsNull(connect_protocol)) {
        connect_protocol = NULL;
    }
    if (connect_protocol) { 
    connect_protocol_local_nonprim = config_node_property_drop_down_parseFromJSON(connect_protocol); //nonprimitive
    }



    com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_local_var = com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_create_internal (
        connect_protocol ? connect_protocol_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties_local_var;
end:
    if (connect_protocol_local_nonprim) {
        config_node_property_drop_down_free(connect_protocol_local_nonprim);
        connect_protocol_local_nonprim = NULL;
    }
    return NULL;

}
