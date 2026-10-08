#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_frags_impl_random_feature_properties.h"



static com_adobe_granite_frags_impl_random_feature_properties_t *com_adobe_granite_frags_impl_random_feature_properties_create_internal(
    config_node_property_string_t *feature_name,
    config_node_property_string_t *feature_description,
    config_node_property_string_t *active_percentage,
    config_node_property_string_t *cookie_name,
    config_node_property_integer_t *cookie_max_age
    ) {
    com_adobe_granite_frags_impl_random_feature_properties_t *com_adobe_granite_frags_impl_random_feature_properties_local_var = malloc(sizeof(com_adobe_granite_frags_impl_random_feature_properties_t));
    if (!com_adobe_granite_frags_impl_random_feature_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_frags_impl_random_feature_properties_local_var, 0, sizeof(com_adobe_granite_frags_impl_random_feature_properties_t));
    com_adobe_granite_frags_impl_random_feature_properties_local_var->_library_owned = 1;
    com_adobe_granite_frags_impl_random_feature_properties_local_var->feature_name = feature_name;
    com_adobe_granite_frags_impl_random_feature_properties_local_var->feature_description = feature_description;
    com_adobe_granite_frags_impl_random_feature_properties_local_var->active_percentage = active_percentage;
    com_adobe_granite_frags_impl_random_feature_properties_local_var->cookie_name = cookie_name;
    com_adobe_granite_frags_impl_random_feature_properties_local_var->cookie_max_age = cookie_max_age;
    return com_adobe_granite_frags_impl_random_feature_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_frags_impl_random_feature_properties_t *com_adobe_granite_frags_impl_random_feature_properties_create(
    config_node_property_string_t *feature_name,
    config_node_property_string_t *feature_description,
    config_node_property_string_t *active_percentage,
    config_node_property_string_t *cookie_name,
    config_node_property_integer_t *cookie_max_age
    ) {
    com_adobe_granite_frags_impl_random_feature_properties_t *result = com_adobe_granite_frags_impl_random_feature_properties_create_internal (
        feature_name,
        feature_description,
        active_percentage,
        cookie_name,
        cookie_max_age
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_frags_impl_random_feature_properties_free(com_adobe_granite_frags_impl_random_feature_properties_t *com_adobe_granite_frags_impl_random_feature_properties) {
    if(NULL == com_adobe_granite_frags_impl_random_feature_properties){
        return ;
    }
    if(com_adobe_granite_frags_impl_random_feature_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_frags_impl_random_feature_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_frags_impl_random_feature_properties->feature_name) {
        config_node_property_string_free(com_adobe_granite_frags_impl_random_feature_properties->feature_name);
        com_adobe_granite_frags_impl_random_feature_properties->feature_name = NULL;
    }
    if (com_adobe_granite_frags_impl_random_feature_properties->feature_description) {
        config_node_property_string_free(com_adobe_granite_frags_impl_random_feature_properties->feature_description);
        com_adobe_granite_frags_impl_random_feature_properties->feature_description = NULL;
    }
    if (com_adobe_granite_frags_impl_random_feature_properties->active_percentage) {
        config_node_property_string_free(com_adobe_granite_frags_impl_random_feature_properties->active_percentage);
        com_adobe_granite_frags_impl_random_feature_properties->active_percentage = NULL;
    }
    if (com_adobe_granite_frags_impl_random_feature_properties->cookie_name) {
        config_node_property_string_free(com_adobe_granite_frags_impl_random_feature_properties->cookie_name);
        com_adobe_granite_frags_impl_random_feature_properties->cookie_name = NULL;
    }
    if (com_adobe_granite_frags_impl_random_feature_properties->cookie_max_age) {
        config_node_property_integer_free(com_adobe_granite_frags_impl_random_feature_properties->cookie_max_age);
        com_adobe_granite_frags_impl_random_feature_properties->cookie_max_age = NULL;
    }
    free(com_adobe_granite_frags_impl_random_feature_properties);
}

cJSON *com_adobe_granite_frags_impl_random_feature_properties_convertToJSON(com_adobe_granite_frags_impl_random_feature_properties_t *com_adobe_granite_frags_impl_random_feature_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_frags_impl_random_feature_properties->feature_name
    if(com_adobe_granite_frags_impl_random_feature_properties->feature_name) {
    cJSON *feature_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_frags_impl_random_feature_properties->feature_name);
    if(feature_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "feature.name", feature_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_frags_impl_random_feature_properties->feature_description
    if(com_adobe_granite_frags_impl_random_feature_properties->feature_description) {
    cJSON *feature_description_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_frags_impl_random_feature_properties->feature_description);
    if(feature_description_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "feature.description", feature_description_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_frags_impl_random_feature_properties->active_percentage
    if(com_adobe_granite_frags_impl_random_feature_properties->active_percentage) {
    cJSON *active_percentage_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_frags_impl_random_feature_properties->active_percentage);
    if(active_percentage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "active.percentage", active_percentage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_frags_impl_random_feature_properties->cookie_name
    if(com_adobe_granite_frags_impl_random_feature_properties->cookie_name) {
    cJSON *cookie_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_frags_impl_random_feature_properties->cookie_name);
    if(cookie_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cookie.name", cookie_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_frags_impl_random_feature_properties->cookie_max_age
    if(com_adobe_granite_frags_impl_random_feature_properties->cookie_max_age) {
    cJSON *cookie_max_age_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_frags_impl_random_feature_properties->cookie_max_age);
    if(cookie_max_age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cookie.maxAge", cookie_max_age_local_JSON);
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

com_adobe_granite_frags_impl_random_feature_properties_t *com_adobe_granite_frags_impl_random_feature_properties_parseFromJSON(cJSON *com_adobe_granite_frags_impl_random_feature_propertiesJSON){

    com_adobe_granite_frags_impl_random_feature_properties_t *com_adobe_granite_frags_impl_random_feature_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_frags_impl_random_feature_properties->feature_name
    config_node_property_string_t *feature_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_frags_impl_random_feature_properties->feature_description
    config_node_property_string_t *feature_description_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_frags_impl_random_feature_properties->active_percentage
    config_node_property_string_t *active_percentage_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_frags_impl_random_feature_properties->cookie_name
    config_node_property_string_t *cookie_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_frags_impl_random_feature_properties->cookie_max_age
    config_node_property_integer_t *cookie_max_age_local_nonprim = NULL;

    // com_adobe_granite_frags_impl_random_feature_properties->feature_name
    cJSON *feature_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_frags_impl_random_feature_propertiesJSON, "feature.name");
    if (cJSON_IsNull(feature_name)) {
        feature_name = NULL;
    }
    if (feature_name) { 
    feature_name_local_nonprim = config_node_property_string_parseFromJSON(feature_name); //nonprimitive
    }

    // com_adobe_granite_frags_impl_random_feature_properties->feature_description
    cJSON *feature_description = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_frags_impl_random_feature_propertiesJSON, "feature.description");
    if (cJSON_IsNull(feature_description)) {
        feature_description = NULL;
    }
    if (feature_description) { 
    feature_description_local_nonprim = config_node_property_string_parseFromJSON(feature_description); //nonprimitive
    }

    // com_adobe_granite_frags_impl_random_feature_properties->active_percentage
    cJSON *active_percentage = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_frags_impl_random_feature_propertiesJSON, "active.percentage");
    if (cJSON_IsNull(active_percentage)) {
        active_percentage = NULL;
    }
    if (active_percentage) { 
    active_percentage_local_nonprim = config_node_property_string_parseFromJSON(active_percentage); //nonprimitive
    }

    // com_adobe_granite_frags_impl_random_feature_properties->cookie_name
    cJSON *cookie_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_frags_impl_random_feature_propertiesJSON, "cookie.name");
    if (cJSON_IsNull(cookie_name)) {
        cookie_name = NULL;
    }
    if (cookie_name) { 
    cookie_name_local_nonprim = config_node_property_string_parseFromJSON(cookie_name); //nonprimitive
    }

    // com_adobe_granite_frags_impl_random_feature_properties->cookie_max_age
    cJSON *cookie_max_age = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_frags_impl_random_feature_propertiesJSON, "cookie.maxAge");
    if (cJSON_IsNull(cookie_max_age)) {
        cookie_max_age = NULL;
    }
    if (cookie_max_age) { 
    cookie_max_age_local_nonprim = config_node_property_integer_parseFromJSON(cookie_max_age); //nonprimitive
    }



    com_adobe_granite_frags_impl_random_feature_properties_local_var = com_adobe_granite_frags_impl_random_feature_properties_create_internal (
        feature_name ? feature_name_local_nonprim : NULL,
        feature_description ? feature_description_local_nonprim : NULL,
        active_percentage ? active_percentage_local_nonprim : NULL,
        cookie_name ? cookie_name_local_nonprim : NULL,
        cookie_max_age ? cookie_max_age_local_nonprim : NULL
        );

    if (!com_adobe_granite_frags_impl_random_feature_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_frags_impl_random_feature_properties_local_var;
end:
    if (feature_name_local_nonprim) {
        config_node_property_string_free(feature_name_local_nonprim);
        feature_name_local_nonprim = NULL;
    }
    if (feature_description_local_nonprim) {
        config_node_property_string_free(feature_description_local_nonprim);
        feature_description_local_nonprim = NULL;
    }
    if (active_percentage_local_nonprim) {
        config_node_property_string_free(active_percentage_local_nonprim);
        active_percentage_local_nonprim = NULL;
    }
    if (cookie_name_local_nonprim) {
        config_node_property_string_free(cookie_name_local_nonprim);
        cookie_name_local_nonprim = NULL;
    }
    if (cookie_max_age_local_nonprim) {
        config_node_property_integer_free(cookie_max_age_local_nonprim);
        cookie_max_age_local_nonprim = NULL;
    }
    return NULL;

}
