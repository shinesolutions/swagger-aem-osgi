#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_forms_common_service_impl_default_data_provider_properties.h"



static com_adobe_forms_common_service_impl_default_data_provider_properties_t *com_adobe_forms_common_service_impl_default_data_provider_properties_create_internal(
    config_node_property_array_t *alloweddata_file_locations
    ) {
    com_adobe_forms_common_service_impl_default_data_provider_properties_t *com_adobe_forms_common_service_impl_default_data_provider_properties_local_var = malloc(sizeof(com_adobe_forms_common_service_impl_default_data_provider_properties_t));
    if (!com_adobe_forms_common_service_impl_default_data_provider_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_forms_common_service_impl_default_data_provider_properties_local_var, 0, sizeof(com_adobe_forms_common_service_impl_default_data_provider_properties_t));
    com_adobe_forms_common_service_impl_default_data_provider_properties_local_var->_library_owned = 1;
    com_adobe_forms_common_service_impl_default_data_provider_properties_local_var->alloweddata_file_locations = alloweddata_file_locations;
    return com_adobe_forms_common_service_impl_default_data_provider_properties_local_var;
}

__attribute__((deprecated)) com_adobe_forms_common_service_impl_default_data_provider_properties_t *com_adobe_forms_common_service_impl_default_data_provider_properties_create(
    config_node_property_array_t *alloweddata_file_locations
    ) {
    com_adobe_forms_common_service_impl_default_data_provider_properties_t *result = com_adobe_forms_common_service_impl_default_data_provider_properties_create_internal (
        alloweddata_file_locations
        );
    if (!result) {
    }
    return result;
}

void com_adobe_forms_common_service_impl_default_data_provider_properties_free(com_adobe_forms_common_service_impl_default_data_provider_properties_t *com_adobe_forms_common_service_impl_default_data_provider_properties) {
    if(NULL == com_adobe_forms_common_service_impl_default_data_provider_properties){
        return ;
    }
    if(com_adobe_forms_common_service_impl_default_data_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_forms_common_service_impl_default_data_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_forms_common_service_impl_default_data_provider_properties->alloweddata_file_locations) {
        config_node_property_array_free(com_adobe_forms_common_service_impl_default_data_provider_properties->alloweddata_file_locations);
        com_adobe_forms_common_service_impl_default_data_provider_properties->alloweddata_file_locations = NULL;
    }
    free(com_adobe_forms_common_service_impl_default_data_provider_properties);
}

cJSON *com_adobe_forms_common_service_impl_default_data_provider_properties_convertToJSON(com_adobe_forms_common_service_impl_default_data_provider_properties_t *com_adobe_forms_common_service_impl_default_data_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_forms_common_service_impl_default_data_provider_properties->alloweddata_file_locations
    if(com_adobe_forms_common_service_impl_default_data_provider_properties->alloweddata_file_locations) {
    cJSON *alloweddata_file_locations_local_JSON = config_node_property_array_convertToJSON(com_adobe_forms_common_service_impl_default_data_provider_properties->alloweddata_file_locations);
    if(alloweddata_file_locations_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "alloweddataFileLocations", alloweddata_file_locations_local_JSON);
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

com_adobe_forms_common_service_impl_default_data_provider_properties_t *com_adobe_forms_common_service_impl_default_data_provider_properties_parseFromJSON(cJSON *com_adobe_forms_common_service_impl_default_data_provider_propertiesJSON){

    com_adobe_forms_common_service_impl_default_data_provider_properties_t *com_adobe_forms_common_service_impl_default_data_provider_properties_local_var = NULL;

    // define the local variable for com_adobe_forms_common_service_impl_default_data_provider_properties->alloweddata_file_locations
    config_node_property_array_t *alloweddata_file_locations_local_nonprim = NULL;

    // com_adobe_forms_common_service_impl_default_data_provider_properties->alloweddata_file_locations
    cJSON *alloweddata_file_locations = cJSON_GetObjectItemCaseSensitive(com_adobe_forms_common_service_impl_default_data_provider_propertiesJSON, "alloweddataFileLocations");
    if (cJSON_IsNull(alloweddata_file_locations)) {
        alloweddata_file_locations = NULL;
    }
    if (alloweddata_file_locations) { 
    alloweddata_file_locations_local_nonprim = config_node_property_array_parseFromJSON(alloweddata_file_locations); //nonprimitive
    }



    com_adobe_forms_common_service_impl_default_data_provider_properties_local_var = com_adobe_forms_common_service_impl_default_data_provider_properties_create_internal (
        alloweddata_file_locations ? alloweddata_file_locations_local_nonprim : NULL
        );

    if (!com_adobe_forms_common_service_impl_default_data_provider_properties_local_var) {
        goto end;
    }

    return com_adobe_forms_common_service_impl_default_data_provider_properties_local_var;
end:
    if (alloweddata_file_locations_local_nonprim) {
        config_node_property_array_free(alloweddata_file_locations_local_nonprim);
        alloweddata_file_locations_local_nonprim = NULL;
    }
    return NULL;

}
