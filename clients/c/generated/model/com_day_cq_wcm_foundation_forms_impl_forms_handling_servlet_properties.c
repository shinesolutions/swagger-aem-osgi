#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties.h"



static com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_create_internal(
    config_node_property_string_t *name_whitelist,
    config_node_property_boolean_t *allow_expressions
    ) {
    com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_local_var = malloc(sizeof(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_t));
    if (!com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_local_var, 0, sizeof(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_t));
    com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_local_var->name_whitelist = name_whitelist;
    com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_local_var->allow_expressions = allow_expressions;
    return com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_create(
    config_node_property_string_t *name_whitelist,
    config_node_property_boolean_t *allow_expressions
    ) {
    com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_t *result = com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_create_internal (
        name_whitelist,
        allow_expressions
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_free(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties) {
    if(NULL == com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties){
        return ;
    }
    if(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->name_whitelist) {
        config_node_property_string_free(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->name_whitelist);
        com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->name_whitelist = NULL;
    }
    if (com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->allow_expressions) {
        config_node_property_boolean_free(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->allow_expressions);
        com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->allow_expressions = NULL;
    }
    free(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties);
}

cJSON *com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_convertToJSON(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->name_whitelist
    if(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->name_whitelist) {
    cJSON *name_whitelist_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->name_whitelist);
    if(name_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name.whitelist", name_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->allow_expressions
    if(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->allow_expressions) {
    cJSON *allow_expressions_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->allow_expressions);
    if(allow_expressions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "allow.expressions", allow_expressions_local_JSON);
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

com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_parseFromJSON(cJSON *com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_propertiesJSON){

    com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->name_whitelist
    config_node_property_string_t *name_whitelist_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->allow_expressions
    config_node_property_boolean_t *allow_expressions_local_nonprim = NULL;

    // com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->name_whitelist
    cJSON *name_whitelist = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_propertiesJSON, "name.whitelist");
    if (cJSON_IsNull(name_whitelist)) {
        name_whitelist = NULL;
    }
    if (name_whitelist) { 
    name_whitelist_local_nonprim = config_node_property_string_parseFromJSON(name_whitelist); //nonprimitive
    }

    // com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties->allow_expressions
    cJSON *allow_expressions = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_propertiesJSON, "allow.expressions");
    if (cJSON_IsNull(allow_expressions)) {
        allow_expressions = NULL;
    }
    if (allow_expressions) { 
    allow_expressions_local_nonprim = config_node_property_boolean_parseFromJSON(allow_expressions); //nonprimitive
    }



    com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_local_var = com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_create_internal (
        name_whitelist ? name_whitelist_local_nonprim : NULL,
        allow_expressions ? allow_expressions_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties_local_var;
end:
    if (name_whitelist_local_nonprim) {
        config_node_property_string_free(name_whitelist_local_nonprim);
        name_whitelist_local_nonprim = NULL;
    }
    if (allow_expressions_local_nonprim) {
        config_node_property_boolean_free(allow_expressions_local_nonprim);
        allow_expressions_local_nonprim = NULL;
    }
    return NULL;

}
