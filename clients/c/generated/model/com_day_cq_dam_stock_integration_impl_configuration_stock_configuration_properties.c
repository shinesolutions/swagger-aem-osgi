#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties.h"



static com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_t *com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *locale,
    config_node_property_string_t *ims_config
    ) {
    com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_t *com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_local_var = malloc(sizeof(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_t));
    if (!com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_local_var, 0, sizeof(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_t));
    com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_local_var->_library_owned = 1;
    com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_local_var->name = name;
    com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_local_var->locale = locale;
    com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_local_var->ims_config = ims_config;
    return com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_t *com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *locale,
    config_node_property_string_t *ims_config
    ) {
    com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_t *result = com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_create_internal (
        name,
        locale,
        ims_config
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_free(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_t *com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties) {
    if(NULL == com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties){
        return ;
    }
    if(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->name) {
        config_node_property_string_free(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->name);
        com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->name = NULL;
    }
    if (com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->locale) {
        config_node_property_string_free(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->locale);
        com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->locale = NULL;
    }
    if (com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->ims_config) {
        config_node_property_string_free(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->ims_config);
        com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->ims_config = NULL;
    }
    free(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties);
}

cJSON *com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_convertToJSON(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_t *com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->name
    if(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->locale
    if(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->locale) {
    cJSON *locale_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->locale);
    if(locale_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "locale", locale_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->ims_config
    if(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->ims_config) {
    cJSON *ims_config_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->ims_config);
    if(ims_config_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "imsConfig", ims_config_local_JSON);
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

com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_t *com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_parseFromJSON(cJSON *com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_propertiesJSON){

    com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_t *com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->locale
    config_node_property_string_t *locale_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->ims_config
    config_node_property_string_t *ims_config_local_nonprim = NULL;

    // com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->locale
    cJSON *locale = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_propertiesJSON, "locale");
    if (cJSON_IsNull(locale)) {
        locale = NULL;
    }
    if (locale) { 
    locale_local_nonprim = config_node_property_string_parseFromJSON(locale); //nonprimitive
    }

    // com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties->ims_config
    cJSON *ims_config = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_propertiesJSON, "imsConfig");
    if (cJSON_IsNull(ims_config)) {
        ims_config = NULL;
    }
    if (ims_config) { 
    ims_config_local_nonprim = config_node_property_string_parseFromJSON(ims_config); //nonprimitive
    }



    com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_local_var = com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_create_internal (
        name ? name_local_nonprim : NULL,
        locale ? locale_local_nonprim : NULL,
        ims_config ? ims_config_local_nonprim : NULL
        );

    if (!com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (locale_local_nonprim) {
        config_node_property_string_free(locale_local_nonprim);
        locale_local_nonprim = NULL;
    }
    if (ims_config_local_nonprim) {
        config_node_property_string_free(ims_config_local_nonprim);
        ims_config_local_nonprim = NULL;
    }
    return NULL;

}
