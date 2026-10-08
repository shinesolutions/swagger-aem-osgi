#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties.h"



static com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_t *com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_create_internal(
    config_node_property_string_t *cq_commerce_promotion_root
    ) {
    com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_t *com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_local_var = malloc(sizeof(com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_t));
    if (!com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_local_var, 0, sizeof(com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_t));
    com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_local_var->cq_commerce_promotion_root = cq_commerce_promotion_root;
    return com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_t *com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_create(
    config_node_property_string_t *cq_commerce_promotion_root
    ) {
    com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_t *result = com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_create_internal (
        cq_commerce_promotion_root
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_free(com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_t *com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties) {
    if(NULL == com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties){
        return ;
    }
    if(com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties->cq_commerce_promotion_root) {
        config_node_property_string_free(com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties->cq_commerce_promotion_root);
        com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties->cq_commerce_promotion_root = NULL;
    }
    free(com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties);
}

cJSON *com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_convertToJSON(com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_t *com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties->cq_commerce_promotion_root
    if(com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties->cq_commerce_promotion_root) {
    cJSON *cq_commerce_promotion_root_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties->cq_commerce_promotion_root);
    if(cq_commerce_promotion_root_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.commerce.promotion.root", cq_commerce_promotion_root_local_JSON);
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

com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_t *com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_parseFromJSON(cJSON *com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_propertiesJSON){

    com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_t *com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties->cq_commerce_promotion_root
    config_node_property_string_t *cq_commerce_promotion_root_local_nonprim = NULL;

    // com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties->cq_commerce_promotion_root
    cJSON *cq_commerce_promotion_root = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_propertiesJSON, "cq.commerce.promotion.root");
    if (cJSON_IsNull(cq_commerce_promotion_root)) {
        cq_commerce_promotion_root = NULL;
    }
    if (cq_commerce_promotion_root) { 
    cq_commerce_promotion_root_local_nonprim = config_node_property_string_parseFromJSON(cq_commerce_promotion_root); //nonprimitive
    }



    com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_local_var = com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_create_internal (
        cq_commerce_promotion_root ? cq_commerce_promotion_root_local_nonprim : NULL
        );

    if (!com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties_local_var;
end:
    if (cq_commerce_promotion_root_local_nonprim) {
        config_node_property_string_free(cq_commerce_promotion_root_local_nonprim);
        cq_commerce_promotion_root_local_nonprim = NULL;
    }
    return NULL;

}
