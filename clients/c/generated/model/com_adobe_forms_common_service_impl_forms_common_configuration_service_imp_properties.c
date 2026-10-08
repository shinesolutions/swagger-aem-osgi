#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties.h"



static com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_t *com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_create_internal(
    config_node_property_drop_down_t *temp_storage_config
    ) {
    com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_t *com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_local_var = malloc(sizeof(com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_t));
    if (!com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_local_var, 0, sizeof(com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_t));
    com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_local_var->_library_owned = 1;
    com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_local_var->temp_storage_config = temp_storage_config;
    return com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_local_var;
}

__attribute__((deprecated)) com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_t *com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_create(
    config_node_property_drop_down_t *temp_storage_config
    ) {
    com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_t *result = com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_create_internal (
        temp_storage_config
        );
    if (!result) {
    }
    return result;
}

void com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_free(com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_t *com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties) {
    if(NULL == com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties){
        return ;
    }
    if(com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties->temp_storage_config) {
        config_node_property_drop_down_free(com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties->temp_storage_config);
        com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties->temp_storage_config = NULL;
    }
    free(com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties);
}

cJSON *com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_convertToJSON(com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_t *com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties->temp_storage_config
    if(com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties->temp_storage_config) {
    cJSON *temp_storage_config_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties->temp_storage_config);
    if(temp_storage_config_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tempStorageConfig", temp_storage_config_local_JSON);
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

com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_t *com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_parseFromJSON(cJSON *com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_propertiesJSON){

    com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_t *com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_local_var = NULL;

    // define the local variable for com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties->temp_storage_config
    config_node_property_drop_down_t *temp_storage_config_local_nonprim = NULL;

    // com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties->temp_storage_config
    cJSON *temp_storage_config = cJSON_GetObjectItemCaseSensitive(com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_propertiesJSON, "tempStorageConfig");
    if (cJSON_IsNull(temp_storage_config)) {
        temp_storage_config = NULL;
    }
    if (temp_storage_config) { 
    temp_storage_config_local_nonprim = config_node_property_drop_down_parseFromJSON(temp_storage_config); //nonprimitive
    }



    com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_local_var = com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_create_internal (
        temp_storage_config ? temp_storage_config_local_nonprim : NULL
        );

    if (!com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_local_var) {
        goto end;
    }

    return com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties_local_var;
end:
    if (temp_storage_config_local_nonprim) {
        config_node_property_drop_down_free(temp_storage_config_local_nonprim);
        temp_storage_config_local_nonprim = NULL;
    }
    return NULL;

}
