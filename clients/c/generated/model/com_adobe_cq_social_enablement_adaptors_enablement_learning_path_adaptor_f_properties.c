#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties.h"



static com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_t *com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_create_internal(
    config_node_property_boolean_t *is_member_check
    ) {
    com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_t *com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_local_var = malloc(sizeof(com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_t));
    if (!com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_local_var, 0, sizeof(com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_t));
    com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_local_var->is_member_check = is_member_check;
    return com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_t *com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_create(
    config_node_property_boolean_t *is_member_check
    ) {
    com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_t *result = com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_create_internal (
        is_member_check
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_free(com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_t *com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties) {
    if(NULL == com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties){
        return ;
    }
    if(com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties->is_member_check) {
        config_node_property_boolean_free(com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties->is_member_check);
        com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties->is_member_check = NULL;
    }
    free(com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties);
}

cJSON *com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_convertToJSON(com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_t *com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties->is_member_check
    if(com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties->is_member_check) {
    cJSON *is_member_check_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties->is_member_check);
    if(is_member_check_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "isMemberCheck", is_member_check_local_JSON);
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

com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_t *com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_parseFromJSON(cJSON *com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_propertiesJSON){

    com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_t *com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties->is_member_check
    config_node_property_boolean_t *is_member_check_local_nonprim = NULL;

    // com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties->is_member_check
    cJSON *is_member_check = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_propertiesJSON, "isMemberCheck");
    if (cJSON_IsNull(is_member_check)) {
        is_member_check = NULL;
    }
    if (is_member_check) { 
    is_member_check_local_nonprim = config_node_property_boolean_parseFromJSON(is_member_check); //nonprimitive
    }



    com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_local_var = com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_create_internal (
        is_member_check ? is_member_check_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties_local_var;
end:
    if (is_member_check_local_nonprim) {
        config_node_property_boolean_free(is_member_check_local_nonprim);
        is_member_check_local_nonprim = NULL;
    }
    return NULL;

}
