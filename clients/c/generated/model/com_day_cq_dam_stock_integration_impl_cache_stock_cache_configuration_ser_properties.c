#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties.h"



static com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_t *com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_create_internal(
    config_node_property_drop_down_t *get_cache_expiration_unit,
    config_node_property_integer_t *get_cache_expiration_value
    ) {
    com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_t *com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_local_var = malloc(sizeof(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_t));
    if (!com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_local_var, 0, sizeof(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_t));
    com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_local_var->_library_owned = 1;
    com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_local_var->get_cache_expiration_unit = get_cache_expiration_unit;
    com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_local_var->get_cache_expiration_value = get_cache_expiration_value;
    return com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_t *com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_create(
    config_node_property_drop_down_t *get_cache_expiration_unit,
    config_node_property_integer_t *get_cache_expiration_value
    ) {
    com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_t *result = com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_create_internal (
        get_cache_expiration_unit,
        get_cache_expiration_value
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_free(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_t *com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties) {
    if(NULL == com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties){
        return ;
    }
    if(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_unit) {
        config_node_property_drop_down_free(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_unit);
        com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_unit = NULL;
    }
    if (com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_value) {
        config_node_property_integer_free(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_value);
        com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_value = NULL;
    }
    free(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties);
}

cJSON *com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_convertToJSON(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_t *com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_unit
    if(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_unit) {
    cJSON *get_cache_expiration_unit_local_JSON = config_node_property_drop_down_convertToJSON(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_unit);
    if(get_cache_expiration_unit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "getCacheExpirationUnit", get_cache_expiration_unit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_value
    if(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_value) {
    cJSON *get_cache_expiration_value_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_value);
    if(get_cache_expiration_value_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "getCacheExpirationValue", get_cache_expiration_value_local_JSON);
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

com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_t *com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_parseFromJSON(cJSON *com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_propertiesJSON){

    com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_t *com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_unit
    config_node_property_drop_down_t *get_cache_expiration_unit_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_value
    config_node_property_integer_t *get_cache_expiration_value_local_nonprim = NULL;

    // com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_unit
    cJSON *get_cache_expiration_unit = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_propertiesJSON, "getCacheExpirationUnit");
    if (cJSON_IsNull(get_cache_expiration_unit)) {
        get_cache_expiration_unit = NULL;
    }
    if (get_cache_expiration_unit) { 
    get_cache_expiration_unit_local_nonprim = config_node_property_drop_down_parseFromJSON(get_cache_expiration_unit); //nonprimitive
    }

    // com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties->get_cache_expiration_value
    cJSON *get_cache_expiration_value = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_propertiesJSON, "getCacheExpirationValue");
    if (cJSON_IsNull(get_cache_expiration_value)) {
        get_cache_expiration_value = NULL;
    }
    if (get_cache_expiration_value) { 
    get_cache_expiration_value_local_nonprim = config_node_property_integer_parseFromJSON(get_cache_expiration_value); //nonprimitive
    }



    com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_local_var = com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_create_internal (
        get_cache_expiration_unit ? get_cache_expiration_unit_local_nonprim : NULL,
        get_cache_expiration_value ? get_cache_expiration_value_local_nonprim : NULL
        );

    if (!com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties_local_var;
end:
    if (get_cache_expiration_unit_local_nonprim) {
        config_node_property_drop_down_free(get_cache_expiration_unit_local_nonprim);
        get_cache_expiration_unit_local_nonprim = NULL;
    }
    if (get_cache_expiration_value_local_nonprim) {
        config_node_property_integer_free(get_cache_expiration_value_local_nonprim);
        get_cache_expiration_value_local_nonprim = NULL;
    }
    return NULL;

}
