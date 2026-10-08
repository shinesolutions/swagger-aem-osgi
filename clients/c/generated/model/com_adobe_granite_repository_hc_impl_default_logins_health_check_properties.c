#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_repository_hc_impl_default_logins_health_check_properties.h"



static com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_t *com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_create_internal(
    config_node_property_array_t *hc_tags,
    config_node_property_array_t *account_logins,
    config_node_property_array_t *console_logins
    ) {
    com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_t *com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_local_var = malloc(sizeof(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_t));
    if (!com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_local_var, 0, sizeof(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_t));
    com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_local_var->_library_owned = 1;
    com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_local_var->hc_tags = hc_tags;
    com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_local_var->account_logins = account_logins;
    com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_local_var->console_logins = console_logins;
    return com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_t *com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_create(
    config_node_property_array_t *hc_tags,
    config_node_property_array_t *account_logins,
    config_node_property_array_t *console_logins
    ) {
    com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_t *result = com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_create_internal (
        hc_tags,
        account_logins,
        console_logins
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_free(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_t *com_adobe_granite_repository_hc_impl_default_logins_health_check_properties) {
    if(NULL == com_adobe_granite_repository_hc_impl_default_logins_health_check_properties){
        return ;
    }
    if(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->hc_tags) {
        config_node_property_array_free(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->hc_tags);
        com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->hc_tags = NULL;
    }
    if (com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->account_logins) {
        config_node_property_array_free(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->account_logins);
        com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->account_logins = NULL;
    }
    if (com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->console_logins) {
        config_node_property_array_free(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->console_logins);
        com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->console_logins = NULL;
    }
    free(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties);
}

cJSON *com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_convertToJSON(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_t *com_adobe_granite_repository_hc_impl_default_logins_health_check_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->hc_tags
    if(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->hc_tags) {
    cJSON *hc_tags_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->hc_tags);
    if(hc_tags_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.tags", hc_tags_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->account_logins
    if(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->account_logins) {
    cJSON *account_logins_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->account_logins);
    if(account_logins_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "account.logins", account_logins_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->console_logins
    if(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->console_logins) {
    cJSON *console_logins_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->console_logins);
    if(console_logins_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "console.logins", console_logins_local_JSON);
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

com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_t *com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_parseFromJSON(cJSON *com_adobe_granite_repository_hc_impl_default_logins_health_check_propertiesJSON){

    com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_t *com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->hc_tags
    config_node_property_array_t *hc_tags_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->account_logins
    config_node_property_array_t *account_logins_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->console_logins
    config_node_property_array_t *console_logins_local_nonprim = NULL;

    // com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->hc_tags
    cJSON *hc_tags = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_hc_impl_default_logins_health_check_propertiesJSON, "hc.tags");
    if (cJSON_IsNull(hc_tags)) {
        hc_tags = NULL;
    }
    if (hc_tags) { 
    hc_tags_local_nonprim = config_node_property_array_parseFromJSON(hc_tags); //nonprimitive
    }

    // com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->account_logins
    cJSON *account_logins = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_hc_impl_default_logins_health_check_propertiesJSON, "account.logins");
    if (cJSON_IsNull(account_logins)) {
        account_logins = NULL;
    }
    if (account_logins) { 
    account_logins_local_nonprim = config_node_property_array_parseFromJSON(account_logins); //nonprimitive
    }

    // com_adobe_granite_repository_hc_impl_default_logins_health_check_properties->console_logins
    cJSON *console_logins = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_hc_impl_default_logins_health_check_propertiesJSON, "console.logins");
    if (cJSON_IsNull(console_logins)) {
        console_logins = NULL;
    }
    if (console_logins) { 
    console_logins_local_nonprim = config_node_property_array_parseFromJSON(console_logins); //nonprimitive
    }



    com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_local_var = com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_create_internal (
        hc_tags ? hc_tags_local_nonprim : NULL,
        account_logins ? account_logins_local_nonprim : NULL,
        console_logins ? console_logins_local_nonprim : NULL
        );

    if (!com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_repository_hc_impl_default_logins_health_check_properties_local_var;
end:
    if (hc_tags_local_nonprim) {
        config_node_property_array_free(hc_tags_local_nonprim);
        hc_tags_local_nonprim = NULL;
    }
    if (account_logins_local_nonprim) {
        config_node_property_array_free(account_logins_local_nonprim);
        account_logins_local_nonprim = NULL;
    }
    if (console_logins_local_nonprim) {
        config_node_property_array_free(console_logins_local_nonprim);
        console_logins_local_nonprim = NULL;
    }
    return NULL;

}
