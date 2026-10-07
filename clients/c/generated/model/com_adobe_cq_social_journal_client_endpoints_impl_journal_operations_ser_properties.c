#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties.h"



static com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_t *com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_create_internal(
    config_node_property_array_t *field_whitelist,
    config_node_property_array_t *attachment_type_blacklist
    ) {
    com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_t *com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_local_var = malloc(sizeof(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_t));
    if (!com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_local_var, 0, sizeof(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_t));
    com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_local_var->field_whitelist = field_whitelist;
    com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_local_var->attachment_type_blacklist = attachment_type_blacklist;
    return com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_t *com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_create(
    config_node_property_array_t *field_whitelist,
    config_node_property_array_t *attachment_type_blacklist
    ) {
    com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_t *result = com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_create_internal (
        field_whitelist,
        attachment_type_blacklist
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_free(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_t *com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties) {
    if(NULL == com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties){
        return ;
    }
    if(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->field_whitelist) {
        config_node_property_array_free(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->field_whitelist);
        com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->field_whitelist = NULL;
    }
    if (com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->attachment_type_blacklist) {
        config_node_property_array_free(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->attachment_type_blacklist);
        com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->attachment_type_blacklist = NULL;
    }
    free(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties);
}

cJSON *com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_convertToJSON(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_t *com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->field_whitelist
    if(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->field_whitelist) {
    cJSON *field_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->field_whitelist);
    if(field_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fieldWhitelist", field_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->attachment_type_blacklist
    if(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->attachment_type_blacklist) {
    cJSON *attachment_type_blacklist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->attachment_type_blacklist);
    if(attachment_type_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attachmentTypeBlacklist", attachment_type_blacklist_local_JSON);
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

com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_t *com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_parseFromJSON(cJSON *com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_propertiesJSON){

    com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_t *com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->field_whitelist
    config_node_property_array_t *field_whitelist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->attachment_type_blacklist
    config_node_property_array_t *attachment_type_blacklist_local_nonprim = NULL;

    // com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->field_whitelist
    cJSON *field_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_propertiesJSON, "fieldWhitelist");
    if (cJSON_IsNull(field_whitelist)) {
        field_whitelist = NULL;
    }
    if (field_whitelist) { 
    field_whitelist_local_nonprim = config_node_property_array_parseFromJSON(field_whitelist); //nonprimitive
    }

    // com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties->attachment_type_blacklist
    cJSON *attachment_type_blacklist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_propertiesJSON, "attachmentTypeBlacklist");
    if (cJSON_IsNull(attachment_type_blacklist)) {
        attachment_type_blacklist = NULL;
    }
    if (attachment_type_blacklist) { 
    attachment_type_blacklist_local_nonprim = config_node_property_array_parseFromJSON(attachment_type_blacklist); //nonprimitive
    }



    com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_local_var = com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_create_internal (
        field_whitelist ? field_whitelist_local_nonprim : NULL,
        attachment_type_blacklist ? attachment_type_blacklist_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties_local_var;
end:
    if (field_whitelist_local_nonprim) {
        config_node_property_array_free(field_whitelist_local_nonprim);
        field_whitelist_local_nonprim = NULL;
    }
    if (attachment_type_blacklist_local_nonprim) {
        config_node_property_array_free(attachment_type_blacklist_local_nonprim);
        attachment_type_blacklist_local_nonprim = NULL;
    }
    return NULL;

}
