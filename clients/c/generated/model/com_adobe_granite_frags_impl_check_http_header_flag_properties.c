#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_frags_impl_check_http_header_flag_properties.h"



static com_adobe_granite_frags_impl_check_http_header_flag_properties_t *com_adobe_granite_frags_impl_check_http_header_flag_properties_create_internal(
    config_node_property_string_t *feature_name,
    config_node_property_string_t *feature_description,
    config_node_property_string_t *http_header_name,
    config_node_property_string_t *http_header_valuepattern
    ) {
    com_adobe_granite_frags_impl_check_http_header_flag_properties_t *com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var = malloc(sizeof(com_adobe_granite_frags_impl_check_http_header_flag_properties_t));
    if (!com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var, 0, sizeof(com_adobe_granite_frags_impl_check_http_header_flag_properties_t));
    com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var->_library_owned = 1;
    com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var->feature_name = feature_name;
    com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var->feature_description = feature_description;
    com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var->http_header_name = http_header_name;
    com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var->http_header_valuepattern = http_header_valuepattern;
    return com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_frags_impl_check_http_header_flag_properties_t *com_adobe_granite_frags_impl_check_http_header_flag_properties_create(
    config_node_property_string_t *feature_name,
    config_node_property_string_t *feature_description,
    config_node_property_string_t *http_header_name,
    config_node_property_string_t *http_header_valuepattern
    ) {
    com_adobe_granite_frags_impl_check_http_header_flag_properties_t *result = com_adobe_granite_frags_impl_check_http_header_flag_properties_create_internal (
        feature_name,
        feature_description,
        http_header_name,
        http_header_valuepattern
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_frags_impl_check_http_header_flag_properties_free(com_adobe_granite_frags_impl_check_http_header_flag_properties_t *com_adobe_granite_frags_impl_check_http_header_flag_properties) {
    if(NULL == com_adobe_granite_frags_impl_check_http_header_flag_properties){
        return ;
    }
    if(com_adobe_granite_frags_impl_check_http_header_flag_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_frags_impl_check_http_header_flag_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_name) {
        config_node_property_string_free(com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_name);
        com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_name = NULL;
    }
    if (com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_description) {
        config_node_property_string_free(com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_description);
        com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_description = NULL;
    }
    if (com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_name) {
        config_node_property_string_free(com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_name);
        com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_name = NULL;
    }
    if (com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_valuepattern) {
        config_node_property_string_free(com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_valuepattern);
        com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_valuepattern = NULL;
    }
    free(com_adobe_granite_frags_impl_check_http_header_flag_properties);
}

cJSON *com_adobe_granite_frags_impl_check_http_header_flag_properties_convertToJSON(com_adobe_granite_frags_impl_check_http_header_flag_properties_t *com_adobe_granite_frags_impl_check_http_header_flag_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_name
    if(com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_name) {
    cJSON *feature_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_name);
    if(feature_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "feature.name", feature_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_description
    if(com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_description) {
    cJSON *feature_description_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_description);
    if(feature_description_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "feature.description", feature_description_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_name
    if(com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_name) {
    cJSON *http_header_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_name);
    if(http_header_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "http.header.name", http_header_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_valuepattern
    if(com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_valuepattern) {
    cJSON *http_header_valuepattern_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_valuepattern);
    if(http_header_valuepattern_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "http.header.valuepattern", http_header_valuepattern_local_JSON);
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

com_adobe_granite_frags_impl_check_http_header_flag_properties_t *com_adobe_granite_frags_impl_check_http_header_flag_properties_parseFromJSON(cJSON *com_adobe_granite_frags_impl_check_http_header_flag_propertiesJSON){

    com_adobe_granite_frags_impl_check_http_header_flag_properties_t *com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_name
    config_node_property_string_t *feature_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_description
    config_node_property_string_t *feature_description_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_name
    config_node_property_string_t *http_header_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_valuepattern
    config_node_property_string_t *http_header_valuepattern_local_nonprim = NULL;

    // com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_name
    cJSON *feature_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_frags_impl_check_http_header_flag_propertiesJSON, "feature.name");
    if (cJSON_IsNull(feature_name)) {
        feature_name = NULL;
    }
    if (feature_name) { 
    feature_name_local_nonprim = config_node_property_string_parseFromJSON(feature_name); //nonprimitive
    }

    // com_adobe_granite_frags_impl_check_http_header_flag_properties->feature_description
    cJSON *feature_description = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_frags_impl_check_http_header_flag_propertiesJSON, "feature.description");
    if (cJSON_IsNull(feature_description)) {
        feature_description = NULL;
    }
    if (feature_description) { 
    feature_description_local_nonprim = config_node_property_string_parseFromJSON(feature_description); //nonprimitive
    }

    // com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_name
    cJSON *http_header_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_frags_impl_check_http_header_flag_propertiesJSON, "http.header.name");
    if (cJSON_IsNull(http_header_name)) {
        http_header_name = NULL;
    }
    if (http_header_name) { 
    http_header_name_local_nonprim = config_node_property_string_parseFromJSON(http_header_name); //nonprimitive
    }

    // com_adobe_granite_frags_impl_check_http_header_flag_properties->http_header_valuepattern
    cJSON *http_header_valuepattern = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_frags_impl_check_http_header_flag_propertiesJSON, "http.header.valuepattern");
    if (cJSON_IsNull(http_header_valuepattern)) {
        http_header_valuepattern = NULL;
    }
    if (http_header_valuepattern) { 
    http_header_valuepattern_local_nonprim = config_node_property_string_parseFromJSON(http_header_valuepattern); //nonprimitive
    }



    com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var = com_adobe_granite_frags_impl_check_http_header_flag_properties_create_internal (
        feature_name ? feature_name_local_nonprim : NULL,
        feature_description ? feature_description_local_nonprim : NULL,
        http_header_name ? http_header_name_local_nonprim : NULL,
        http_header_valuepattern ? http_header_valuepattern_local_nonprim : NULL
        );

    if (!com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_frags_impl_check_http_header_flag_properties_local_var;
end:
    if (feature_name_local_nonprim) {
        config_node_property_string_free(feature_name_local_nonprim);
        feature_name_local_nonprim = NULL;
    }
    if (feature_description_local_nonprim) {
        config_node_property_string_free(feature_description_local_nonprim);
        feature_description_local_nonprim = NULL;
    }
    if (http_header_name_local_nonprim) {
        config_node_property_string_free(http_header_name_local_nonprim);
        http_header_name_local_nonprim = NULL;
    }
    if (http_header_valuepattern_local_nonprim) {
        config_node_property_string_free(http_header_valuepattern_local_nonprim);
        http_header_valuepattern_local_nonprim = NULL;
    }
    return NULL;

}
