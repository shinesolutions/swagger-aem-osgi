#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties.h"



static com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_t *com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_create_internal(
    config_node_property_array_t *cq_wcm_qrcode_servlet_whitelist
    ) {
    com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_t *com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_local_var = malloc(sizeof(com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_t));
    if (!com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_local_var, 0, sizeof(com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_t));
    com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_local_var->_library_owned = 1;
    com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_local_var->cq_wcm_qrcode_servlet_whitelist = cq_wcm_qrcode_servlet_whitelist;
    return com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_t *com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_create(
    config_node_property_array_t *cq_wcm_qrcode_servlet_whitelist
    ) {
    com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_t *result = com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_create_internal (
        cq_wcm_qrcode_servlet_whitelist
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_free(com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_t *com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties) {
    if(NULL == com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties){
        return ;
    }
    if(com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties->cq_wcm_qrcode_servlet_whitelist) {
        config_node_property_array_free(com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties->cq_wcm_qrcode_servlet_whitelist);
        com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties->cq_wcm_qrcode_servlet_whitelist = NULL;
    }
    free(com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties);
}

cJSON *com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_convertToJSON(com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_t *com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties->cq_wcm_qrcode_servlet_whitelist
    if(com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties->cq_wcm_qrcode_servlet_whitelist) {
    cJSON *cq_wcm_qrcode_servlet_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties->cq_wcm_qrcode_servlet_whitelist);
    if(cq_wcm_qrcode_servlet_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.qrcode.servlet.whitelist", cq_wcm_qrcode_servlet_whitelist_local_JSON);
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

com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_t *com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_parseFromJSON(cJSON *com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_propertiesJSON){

    com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_t *com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties->cq_wcm_qrcode_servlet_whitelist
    config_node_property_array_t *cq_wcm_qrcode_servlet_whitelist_local_nonprim = NULL;

    // com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties->cq_wcm_qrcode_servlet_whitelist
    cJSON *cq_wcm_qrcode_servlet_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_propertiesJSON, "cq.wcm.qrcode.servlet.whitelist");
    if (cJSON_IsNull(cq_wcm_qrcode_servlet_whitelist)) {
        cq_wcm_qrcode_servlet_whitelist = NULL;
    }
    if (cq_wcm_qrcode_servlet_whitelist) { 
    cq_wcm_qrcode_servlet_whitelist_local_nonprim = config_node_property_array_parseFromJSON(cq_wcm_qrcode_servlet_whitelist); //nonprimitive
    }



    com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_local_var = com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_create_internal (
        cq_wcm_qrcode_servlet_whitelist ? cq_wcm_qrcode_servlet_whitelist_local_nonprim : NULL
        );

    if (!com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties_local_var;
end:
    if (cq_wcm_qrcode_servlet_whitelist_local_nonprim) {
        config_node_property_array_free(cq_wcm_qrcode_servlet_whitelist_local_nonprim);
        cq_wcm_qrcode_servlet_whitelist_local_nonprim = NULL;
    }
    return NULL;

}
