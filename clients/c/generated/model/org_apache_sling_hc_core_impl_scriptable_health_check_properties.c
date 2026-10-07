#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_hc_core_impl_scriptable_health_check_properties.h"



static org_apache_sling_hc_core_impl_scriptable_health_check_properties_t *org_apache_sling_hc_core_impl_scriptable_health_check_properties_create_internal(
    config_node_property_string_t *hc_name,
    config_node_property_array_t *hc_tags,
    config_node_property_string_t *hc_mbean_name,
    config_node_property_string_t *expression,
    config_node_property_string_t *language_extension
    ) {
    org_apache_sling_hc_core_impl_scriptable_health_check_properties_t *org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var = malloc(sizeof(org_apache_sling_hc_core_impl_scriptable_health_check_properties_t));
    if (!org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var, 0, sizeof(org_apache_sling_hc_core_impl_scriptable_health_check_properties_t));
    org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var->_library_owned = 1;
    org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var->hc_name = hc_name;
    org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var->hc_tags = hc_tags;
    org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var->hc_mbean_name = hc_mbean_name;
    org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var->expression = expression;
    org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var->language_extension = language_extension;
    return org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_hc_core_impl_scriptable_health_check_properties_t *org_apache_sling_hc_core_impl_scriptable_health_check_properties_create(
    config_node_property_string_t *hc_name,
    config_node_property_array_t *hc_tags,
    config_node_property_string_t *hc_mbean_name,
    config_node_property_string_t *expression,
    config_node_property_string_t *language_extension
    ) {
    org_apache_sling_hc_core_impl_scriptable_health_check_properties_t *result = org_apache_sling_hc_core_impl_scriptable_health_check_properties_create_internal (
        hc_name,
        hc_tags,
        hc_mbean_name,
        expression,
        language_extension
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_hc_core_impl_scriptable_health_check_properties_free(org_apache_sling_hc_core_impl_scriptable_health_check_properties_t *org_apache_sling_hc_core_impl_scriptable_health_check_properties) {
    if(NULL == org_apache_sling_hc_core_impl_scriptable_health_check_properties){
        return ;
    }
    if(org_apache_sling_hc_core_impl_scriptable_health_check_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_hc_core_impl_scriptable_health_check_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_name) {
        config_node_property_string_free(org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_name);
        org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_name = NULL;
    }
    if (org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_tags) {
        config_node_property_array_free(org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_tags);
        org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_tags = NULL;
    }
    if (org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_mbean_name) {
        config_node_property_string_free(org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_mbean_name);
        org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_mbean_name = NULL;
    }
    if (org_apache_sling_hc_core_impl_scriptable_health_check_properties->expression) {
        config_node_property_string_free(org_apache_sling_hc_core_impl_scriptable_health_check_properties->expression);
        org_apache_sling_hc_core_impl_scriptable_health_check_properties->expression = NULL;
    }
    if (org_apache_sling_hc_core_impl_scriptable_health_check_properties->language_extension) {
        config_node_property_string_free(org_apache_sling_hc_core_impl_scriptable_health_check_properties->language_extension);
        org_apache_sling_hc_core_impl_scriptable_health_check_properties->language_extension = NULL;
    }
    free(org_apache_sling_hc_core_impl_scriptable_health_check_properties);
}

cJSON *org_apache_sling_hc_core_impl_scriptable_health_check_properties_convertToJSON(org_apache_sling_hc_core_impl_scriptable_health_check_properties_t *org_apache_sling_hc_core_impl_scriptable_health_check_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_name
    if(org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_name) {
    cJSON *hc_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_name);
    if(hc_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.name", hc_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_tags
    if(org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_tags) {
    cJSON *hc_tags_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_tags);
    if(hc_tags_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.tags", hc_tags_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_mbean_name
    if(org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_mbean_name) {
    cJSON *hc_mbean_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_mbean_name);
    if(hc_mbean_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.mbean.name", hc_mbean_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hc_core_impl_scriptable_health_check_properties->expression
    if(org_apache_sling_hc_core_impl_scriptable_health_check_properties->expression) {
    cJSON *expression_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_hc_core_impl_scriptable_health_check_properties->expression);
    if(expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "expression", expression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hc_core_impl_scriptable_health_check_properties->language_extension
    if(org_apache_sling_hc_core_impl_scriptable_health_check_properties->language_extension) {
    cJSON *language_extension_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_hc_core_impl_scriptable_health_check_properties->language_extension);
    if(language_extension_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "language.extension", language_extension_local_JSON);
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

org_apache_sling_hc_core_impl_scriptable_health_check_properties_t *org_apache_sling_hc_core_impl_scriptable_health_check_properties_parseFromJSON(cJSON *org_apache_sling_hc_core_impl_scriptable_health_check_propertiesJSON){

    org_apache_sling_hc_core_impl_scriptable_health_check_properties_t *org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_name
    config_node_property_string_t *hc_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_tags
    config_node_property_array_t *hc_tags_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_mbean_name
    config_node_property_string_t *hc_mbean_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_scriptable_health_check_properties->expression
    config_node_property_string_t *expression_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_scriptable_health_check_properties->language_extension
    config_node_property_string_t *language_extension_local_nonprim = NULL;

    // org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_name
    cJSON *hc_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_scriptable_health_check_propertiesJSON, "hc.name");
    if (cJSON_IsNull(hc_name)) {
        hc_name = NULL;
    }
    if (hc_name) { 
    hc_name_local_nonprim = config_node_property_string_parseFromJSON(hc_name); //nonprimitive
    }

    // org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_tags
    cJSON *hc_tags = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_scriptable_health_check_propertiesJSON, "hc.tags");
    if (cJSON_IsNull(hc_tags)) {
        hc_tags = NULL;
    }
    if (hc_tags) { 
    hc_tags_local_nonprim = config_node_property_array_parseFromJSON(hc_tags); //nonprimitive
    }

    // org_apache_sling_hc_core_impl_scriptable_health_check_properties->hc_mbean_name
    cJSON *hc_mbean_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_scriptable_health_check_propertiesJSON, "hc.mbean.name");
    if (cJSON_IsNull(hc_mbean_name)) {
        hc_mbean_name = NULL;
    }
    if (hc_mbean_name) { 
    hc_mbean_name_local_nonprim = config_node_property_string_parseFromJSON(hc_mbean_name); //nonprimitive
    }

    // org_apache_sling_hc_core_impl_scriptable_health_check_properties->expression
    cJSON *expression = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_scriptable_health_check_propertiesJSON, "expression");
    if (cJSON_IsNull(expression)) {
        expression = NULL;
    }
    if (expression) { 
    expression_local_nonprim = config_node_property_string_parseFromJSON(expression); //nonprimitive
    }

    // org_apache_sling_hc_core_impl_scriptable_health_check_properties->language_extension
    cJSON *language_extension = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_scriptable_health_check_propertiesJSON, "language.extension");
    if (cJSON_IsNull(language_extension)) {
        language_extension = NULL;
    }
    if (language_extension) { 
    language_extension_local_nonprim = config_node_property_string_parseFromJSON(language_extension); //nonprimitive
    }



    org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var = org_apache_sling_hc_core_impl_scriptable_health_check_properties_create_internal (
        hc_name ? hc_name_local_nonprim : NULL,
        hc_tags ? hc_tags_local_nonprim : NULL,
        hc_mbean_name ? hc_mbean_name_local_nonprim : NULL,
        expression ? expression_local_nonprim : NULL,
        language_extension ? language_extension_local_nonprim : NULL
        );

    if (!org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var) {
        goto end;
    }

    return org_apache_sling_hc_core_impl_scriptable_health_check_properties_local_var;
end:
    if (hc_name_local_nonprim) {
        config_node_property_string_free(hc_name_local_nonprim);
        hc_name_local_nonprim = NULL;
    }
    if (hc_tags_local_nonprim) {
        config_node_property_array_free(hc_tags_local_nonprim);
        hc_tags_local_nonprim = NULL;
    }
    if (hc_mbean_name_local_nonprim) {
        config_node_property_string_free(hc_mbean_name_local_nonprim);
        hc_mbean_name_local_nonprim = NULL;
    }
    if (expression_local_nonprim) {
        config_node_property_string_free(expression_local_nonprim);
        expression_local_nonprim = NULL;
    }
    if (language_extension_local_nonprim) {
        config_node_property_string_free(language_extension_local_nonprim);
        language_extension_local_nonprim = NULL;
    }
    return NULL;

}
