#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_license_impl_license_check_filter_properties.h"



static com_adobe_granite_license_impl_license_check_filter_properties_t *com_adobe_granite_license_impl_license_check_filter_properties_create_internal(
    config_node_property_integer_t *check_internval,
    config_node_property_array_t *exclude_ids,
    config_node_property_boolean_t *encrypt_ping
    ) {
    com_adobe_granite_license_impl_license_check_filter_properties_t *com_adobe_granite_license_impl_license_check_filter_properties_local_var = malloc(sizeof(com_adobe_granite_license_impl_license_check_filter_properties_t));
    if (!com_adobe_granite_license_impl_license_check_filter_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_license_impl_license_check_filter_properties_local_var, 0, sizeof(com_adobe_granite_license_impl_license_check_filter_properties_t));
    com_adobe_granite_license_impl_license_check_filter_properties_local_var->_library_owned = 1;
    com_adobe_granite_license_impl_license_check_filter_properties_local_var->check_internval = check_internval;
    com_adobe_granite_license_impl_license_check_filter_properties_local_var->exclude_ids = exclude_ids;
    com_adobe_granite_license_impl_license_check_filter_properties_local_var->encrypt_ping = encrypt_ping;
    return com_adobe_granite_license_impl_license_check_filter_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_license_impl_license_check_filter_properties_t *com_adobe_granite_license_impl_license_check_filter_properties_create(
    config_node_property_integer_t *check_internval,
    config_node_property_array_t *exclude_ids,
    config_node_property_boolean_t *encrypt_ping
    ) {
    com_adobe_granite_license_impl_license_check_filter_properties_t *result = com_adobe_granite_license_impl_license_check_filter_properties_create_internal (
        check_internval,
        exclude_ids,
        encrypt_ping
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_license_impl_license_check_filter_properties_free(com_adobe_granite_license_impl_license_check_filter_properties_t *com_adobe_granite_license_impl_license_check_filter_properties) {
    if(NULL == com_adobe_granite_license_impl_license_check_filter_properties){
        return ;
    }
    if(com_adobe_granite_license_impl_license_check_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_license_impl_license_check_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_license_impl_license_check_filter_properties->check_internval) {
        config_node_property_integer_free(com_adobe_granite_license_impl_license_check_filter_properties->check_internval);
        com_adobe_granite_license_impl_license_check_filter_properties->check_internval = NULL;
    }
    if (com_adobe_granite_license_impl_license_check_filter_properties->exclude_ids) {
        config_node_property_array_free(com_adobe_granite_license_impl_license_check_filter_properties->exclude_ids);
        com_adobe_granite_license_impl_license_check_filter_properties->exclude_ids = NULL;
    }
    if (com_adobe_granite_license_impl_license_check_filter_properties->encrypt_ping) {
        config_node_property_boolean_free(com_adobe_granite_license_impl_license_check_filter_properties->encrypt_ping);
        com_adobe_granite_license_impl_license_check_filter_properties->encrypt_ping = NULL;
    }
    free(com_adobe_granite_license_impl_license_check_filter_properties);
}

cJSON *com_adobe_granite_license_impl_license_check_filter_properties_convertToJSON(com_adobe_granite_license_impl_license_check_filter_properties_t *com_adobe_granite_license_impl_license_check_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_license_impl_license_check_filter_properties->check_internval
    if(com_adobe_granite_license_impl_license_check_filter_properties->check_internval) {
    cJSON *check_internval_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_license_impl_license_check_filter_properties->check_internval);
    if(check_internval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "checkInternval", check_internval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_license_impl_license_check_filter_properties->exclude_ids
    if(com_adobe_granite_license_impl_license_check_filter_properties->exclude_ids) {
    cJSON *exclude_ids_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_license_impl_license_check_filter_properties->exclude_ids);
    if(exclude_ids_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "excludeIds", exclude_ids_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_license_impl_license_check_filter_properties->encrypt_ping
    if(com_adobe_granite_license_impl_license_check_filter_properties->encrypt_ping) {
    cJSON *encrypt_ping_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_license_impl_license_check_filter_properties->encrypt_ping);
    if(encrypt_ping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "encryptPing", encrypt_ping_local_JSON);
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

com_adobe_granite_license_impl_license_check_filter_properties_t *com_adobe_granite_license_impl_license_check_filter_properties_parseFromJSON(cJSON *com_adobe_granite_license_impl_license_check_filter_propertiesJSON){

    com_adobe_granite_license_impl_license_check_filter_properties_t *com_adobe_granite_license_impl_license_check_filter_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_license_impl_license_check_filter_properties->check_internval
    config_node_property_integer_t *check_internval_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_license_impl_license_check_filter_properties->exclude_ids
    config_node_property_array_t *exclude_ids_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_license_impl_license_check_filter_properties->encrypt_ping
    config_node_property_boolean_t *encrypt_ping_local_nonprim = NULL;

    // com_adobe_granite_license_impl_license_check_filter_properties->check_internval
    cJSON *check_internval = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_license_impl_license_check_filter_propertiesJSON, "checkInternval");
    if (cJSON_IsNull(check_internval)) {
        check_internval = NULL;
    }
    if (check_internval) { 
    check_internval_local_nonprim = config_node_property_integer_parseFromJSON(check_internval); //nonprimitive
    }

    // com_adobe_granite_license_impl_license_check_filter_properties->exclude_ids
    cJSON *exclude_ids = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_license_impl_license_check_filter_propertiesJSON, "excludeIds");
    if (cJSON_IsNull(exclude_ids)) {
        exclude_ids = NULL;
    }
    if (exclude_ids) { 
    exclude_ids_local_nonprim = config_node_property_array_parseFromJSON(exclude_ids); //nonprimitive
    }

    // com_adobe_granite_license_impl_license_check_filter_properties->encrypt_ping
    cJSON *encrypt_ping = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_license_impl_license_check_filter_propertiesJSON, "encryptPing");
    if (cJSON_IsNull(encrypt_ping)) {
        encrypt_ping = NULL;
    }
    if (encrypt_ping) { 
    encrypt_ping_local_nonprim = config_node_property_boolean_parseFromJSON(encrypt_ping); //nonprimitive
    }



    com_adobe_granite_license_impl_license_check_filter_properties_local_var = com_adobe_granite_license_impl_license_check_filter_properties_create_internal (
        check_internval ? check_internval_local_nonprim : NULL,
        exclude_ids ? exclude_ids_local_nonprim : NULL,
        encrypt_ping ? encrypt_ping_local_nonprim : NULL
        );

    if (!com_adobe_granite_license_impl_license_check_filter_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_license_impl_license_check_filter_properties_local_var;
end:
    if (check_internval_local_nonprim) {
        config_node_property_integer_free(check_internval_local_nonprim);
        check_internval_local_nonprim = NULL;
    }
    if (exclude_ids_local_nonprim) {
        config_node_property_array_free(exclude_ids_local_nonprim);
        exclude_ids_local_nonprim = NULL;
    }
    if (encrypt_ping_local_nonprim) {
        config_node_property_boolean_free(encrypt_ping_local_nonprim);
        encrypt_ping_local_nonprim = NULL;
    }
    return NULL;

}
