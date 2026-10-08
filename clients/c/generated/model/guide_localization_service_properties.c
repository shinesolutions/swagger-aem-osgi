#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "guide_localization_service_properties.h"



static guide_localization_service_properties_t *guide_localization_service_properties_create_internal(
    config_node_property_array_t *supported_locales,
    config_node_property_array_t *localizable_properties
    ) {
    guide_localization_service_properties_t *guide_localization_service_properties_local_var = malloc(sizeof(guide_localization_service_properties_t));
    if (!guide_localization_service_properties_local_var) {
        return NULL;
    }
    memset(guide_localization_service_properties_local_var, 0, sizeof(guide_localization_service_properties_t));
    guide_localization_service_properties_local_var->_library_owned = 1;
    guide_localization_service_properties_local_var->supported_locales = supported_locales;
    guide_localization_service_properties_local_var->localizable_properties = localizable_properties;
    return guide_localization_service_properties_local_var;
}

__attribute__((deprecated)) guide_localization_service_properties_t *guide_localization_service_properties_create(
    config_node_property_array_t *supported_locales,
    config_node_property_array_t *localizable_properties
    ) {
    guide_localization_service_properties_t *result = guide_localization_service_properties_create_internal (
        supported_locales,
        localizable_properties
        );
    if (!result) {
    }
    return result;
}

void guide_localization_service_properties_free(guide_localization_service_properties_t *guide_localization_service_properties) {
    if(NULL == guide_localization_service_properties){
        return ;
    }
    if(guide_localization_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "guide_localization_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (guide_localization_service_properties->supported_locales) {
        config_node_property_array_free(guide_localization_service_properties->supported_locales);
        guide_localization_service_properties->supported_locales = NULL;
    }
    if (guide_localization_service_properties->localizable_properties) {
        config_node_property_array_free(guide_localization_service_properties->localizable_properties);
        guide_localization_service_properties->localizable_properties = NULL;
    }
    free(guide_localization_service_properties);
}

cJSON *guide_localization_service_properties_convertToJSON(guide_localization_service_properties_t *guide_localization_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // guide_localization_service_properties->supported_locales
    if(guide_localization_service_properties->supported_locales) {
    cJSON *supported_locales_local_JSON = config_node_property_array_convertToJSON(guide_localization_service_properties->supported_locales);
    if(supported_locales_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "supportedLocales", supported_locales_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // guide_localization_service_properties->localizable_properties
    if(guide_localization_service_properties->localizable_properties) {
    cJSON *localizable_properties_local_JSON = config_node_property_array_convertToJSON(guide_localization_service_properties->localizable_properties);
    if(localizable_properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "Localizable Properties", localizable_properties_local_JSON);
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

guide_localization_service_properties_t *guide_localization_service_properties_parseFromJSON(cJSON *guide_localization_service_propertiesJSON){

    guide_localization_service_properties_t *guide_localization_service_properties_local_var = NULL;

    // define the local variable for guide_localization_service_properties->supported_locales
    config_node_property_array_t *supported_locales_local_nonprim = NULL;

    // define the local variable for guide_localization_service_properties->localizable_properties
    config_node_property_array_t *localizable_properties_local_nonprim = NULL;

    // guide_localization_service_properties->supported_locales
    cJSON *supported_locales = cJSON_GetObjectItemCaseSensitive(guide_localization_service_propertiesJSON, "supportedLocales");
    if (cJSON_IsNull(supported_locales)) {
        supported_locales = NULL;
    }
    if (supported_locales) { 
    supported_locales_local_nonprim = config_node_property_array_parseFromJSON(supported_locales); //nonprimitive
    }

    // guide_localization_service_properties->localizable_properties
    cJSON *localizable_properties = cJSON_GetObjectItemCaseSensitive(guide_localization_service_propertiesJSON, "Localizable Properties");
    if (cJSON_IsNull(localizable_properties)) {
        localizable_properties = NULL;
    }
    if (localizable_properties) { 
    localizable_properties_local_nonprim = config_node_property_array_parseFromJSON(localizable_properties); //nonprimitive
    }



    guide_localization_service_properties_local_var = guide_localization_service_properties_create_internal (
        supported_locales ? supported_locales_local_nonprim : NULL,
        localizable_properties ? localizable_properties_local_nonprim : NULL
        );

    if (!guide_localization_service_properties_local_var) {
        goto end;
    }

    return guide_localization_service_properties_local_var;
end:
    if (supported_locales_local_nonprim) {
        config_node_property_array_free(supported_locales_local_nonprim);
        supported_locales_local_nonprim = NULL;
    }
    if (localizable_properties_local_nonprim) {
        config_node_property_array_free(localizable_properties_local_nonprim);
        localizable_properties_local_nonprim = NULL;
    }
    return NULL;

}
