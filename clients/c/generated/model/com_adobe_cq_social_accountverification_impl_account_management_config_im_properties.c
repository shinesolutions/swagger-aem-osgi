#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_accountverification_impl_account_management_config_im_properties.h"



static com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_t *com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_create_internal(
    config_node_property_boolean_t *enable,
    config_node_property_integer_t *ttl1,
    config_node_property_integer_t *ttl2
    ) {
    com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_t *com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_local_var = malloc(sizeof(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_t));
    if (!com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_local_var, 0, sizeof(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_t));
    com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_local_var->enable = enable;
    com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_local_var->ttl1 = ttl1;
    com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_local_var->ttl2 = ttl2;
    return com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_t *com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_create(
    config_node_property_boolean_t *enable,
    config_node_property_integer_t *ttl1,
    config_node_property_integer_t *ttl2
    ) {
    com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_t *result = com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_create_internal (
        enable,
        ttl1,
        ttl2
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_free(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_t *com_adobe_cq_social_accountverification_impl_account_management_config_im_properties) {
    if(NULL == com_adobe_cq_social_accountverification_impl_account_management_config_im_properties){
        return ;
    }
    if(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->enable) {
        config_node_property_boolean_free(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->enable);
        com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->enable = NULL;
    }
    if (com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl1) {
        config_node_property_integer_free(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl1);
        com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl1 = NULL;
    }
    if (com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl2) {
        config_node_property_integer_free(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl2);
        com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl2 = NULL;
    }
    free(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties);
}

cJSON *com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_convertToJSON(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_t *com_adobe_cq_social_accountverification_impl_account_management_config_im_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->enable
    if(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->enable) {
    cJSON *enable_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->enable);
    if(enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enable", enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl1
    if(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl1) {
    cJSON *ttl1_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl1);
    if(ttl1_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ttl1", ttl1_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl2
    if(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl2) {
    cJSON *ttl2_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl2);
    if(ttl2_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ttl2", ttl2_local_JSON);
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

com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_t *com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_parseFromJSON(cJSON *com_adobe_cq_social_accountverification_impl_account_management_config_im_propertiesJSON){

    com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_t *com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->enable
    config_node_property_boolean_t *enable_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl1
    config_node_property_integer_t *ttl1_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl2
    config_node_property_integer_t *ttl2_local_nonprim = NULL;

    // com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->enable
    cJSON *enable = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_accountverification_impl_account_management_config_im_propertiesJSON, "enable");
    if (cJSON_IsNull(enable)) {
        enable = NULL;
    }
    if (enable) { 
    enable_local_nonprim = config_node_property_boolean_parseFromJSON(enable); //nonprimitive
    }

    // com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl1
    cJSON *ttl1 = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_accountverification_impl_account_management_config_im_propertiesJSON, "ttl1");
    if (cJSON_IsNull(ttl1)) {
        ttl1 = NULL;
    }
    if (ttl1) { 
    ttl1_local_nonprim = config_node_property_integer_parseFromJSON(ttl1); //nonprimitive
    }

    // com_adobe_cq_social_accountverification_impl_account_management_config_im_properties->ttl2
    cJSON *ttl2 = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_accountverification_impl_account_management_config_im_propertiesJSON, "ttl2");
    if (cJSON_IsNull(ttl2)) {
        ttl2 = NULL;
    }
    if (ttl2) { 
    ttl2_local_nonprim = config_node_property_integer_parseFromJSON(ttl2); //nonprimitive
    }



    com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_local_var = com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_create_internal (
        enable ? enable_local_nonprim : NULL,
        ttl1 ? ttl1_local_nonprim : NULL,
        ttl2 ? ttl2_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_accountverification_impl_account_management_config_im_properties_local_var;
end:
    if (enable_local_nonprim) {
        config_node_property_boolean_free(enable_local_nonprim);
        enable_local_nonprim = NULL;
    }
    if (ttl1_local_nonprim) {
        config_node_property_integer_free(ttl1_local_nonprim);
        ttl1_local_nonprim = NULL;
    }
    if (ttl2_local_nonprim) {
        config_node_property_integer_free(ttl2_local_nonprim);
        ttl2_local_nonprim = NULL;
    }
    return NULL;

}
