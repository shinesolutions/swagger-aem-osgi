#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties.h"



static com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_t *com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_create_internal(
    config_node_property_string_t *non_valid_chars
    ) {
    com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_t *com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_t));
    if (!com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_t));
    com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_local_var->non_valid_chars = non_valid_chars;
    return com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_t *com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_create(
    config_node_property_string_t *non_valid_chars
    ) {
    com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_t *result = com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_create_internal (
        non_valid_chars
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_free(com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_t *com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties) {
    if(NULL == com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties->non_valid_chars) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties->non_valid_chars);
        com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties->non_valid_chars = NULL;
    }
    free(com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties);
}

cJSON *com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_convertToJSON(com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_t *com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties->non_valid_chars
    if(com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties->non_valid_chars) {
    cJSON *non_valid_chars_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties->non_valid_chars);
    if(non_valid_chars_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "nonValidChars", non_valid_chars_local_JSON);
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

com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_t *com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_utils_default_page_name_validator_propertiesJSON){

    com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_t *com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties->non_valid_chars
    config_node_property_string_t *non_valid_chars_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties->non_valid_chars
    cJSON *non_valid_chars = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_utils_default_page_name_validator_propertiesJSON, "nonValidChars");
    if (cJSON_IsNull(non_valid_chars)) {
        non_valid_chars = NULL;
    }
    if (non_valid_chars) { 
    non_valid_chars_local_nonprim = config_node_property_string_parseFromJSON(non_valid_chars); //nonprimitive
    }



    com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_local_var = com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_create_internal (
        non_valid_chars ? non_valid_chars_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties_local_var;
end:
    if (non_valid_chars_local_nonprim) {
        config_node_property_string_free(non_valid_chars_local_nonprim);
        non_valid_chars_local_nonprim = NULL;
    }
    return NULL;

}
