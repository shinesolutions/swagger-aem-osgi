#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_rest_impl_servlet_default_get_servlet_properties.h"



static com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_t *com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_create_internal(
    config_node_property_integer_t *default_limit,
    config_node_property_boolean_t *use_absolute_uri
    ) {
    com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_t *com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_local_var = malloc(sizeof(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_t));
    if (!com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_local_var, 0, sizeof(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_t));
    com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_local_var->_library_owned = 1;
    com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_local_var->default_limit = default_limit;
    com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_local_var->use_absolute_uri = use_absolute_uri;
    return com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_t *com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_create(
    config_node_property_integer_t *default_limit,
    config_node_property_boolean_t *use_absolute_uri
    ) {
    com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_t *result = com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_create_internal (
        default_limit,
        use_absolute_uri
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_free(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_t *com_adobe_granite_rest_impl_servlet_default_get_servlet_properties) {
    if(NULL == com_adobe_granite_rest_impl_servlet_default_get_servlet_properties){
        return ;
    }
    if(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->default_limit) {
        config_node_property_integer_free(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->default_limit);
        com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->default_limit = NULL;
    }
    if (com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->use_absolute_uri) {
        config_node_property_boolean_free(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->use_absolute_uri);
        com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->use_absolute_uri = NULL;
    }
    free(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties);
}

cJSON *com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_convertToJSON(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_t *com_adobe_granite_rest_impl_servlet_default_get_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->default_limit
    if(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->default_limit) {
    cJSON *default_limit_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->default_limit);
    if(default_limit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.limit", default_limit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->use_absolute_uri
    if(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->use_absolute_uri) {
    cJSON *use_absolute_uri_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->use_absolute_uri);
    if(use_absolute_uri_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "use.absolute.uri", use_absolute_uri_local_JSON);
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

com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_t *com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_parseFromJSON(cJSON *com_adobe_granite_rest_impl_servlet_default_get_servlet_propertiesJSON){

    com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_t *com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->default_limit
    config_node_property_integer_t *default_limit_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->use_absolute_uri
    config_node_property_boolean_t *use_absolute_uri_local_nonprim = NULL;

    // com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->default_limit
    cJSON *default_limit = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_rest_impl_servlet_default_get_servlet_propertiesJSON, "default.limit");
    if (cJSON_IsNull(default_limit)) {
        default_limit = NULL;
    }
    if (default_limit) { 
    default_limit_local_nonprim = config_node_property_integer_parseFromJSON(default_limit); //nonprimitive
    }

    // com_adobe_granite_rest_impl_servlet_default_get_servlet_properties->use_absolute_uri
    cJSON *use_absolute_uri = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_rest_impl_servlet_default_get_servlet_propertiesJSON, "use.absolute.uri");
    if (cJSON_IsNull(use_absolute_uri)) {
        use_absolute_uri = NULL;
    }
    if (use_absolute_uri) { 
    use_absolute_uri_local_nonprim = config_node_property_boolean_parseFromJSON(use_absolute_uri); //nonprimitive
    }



    com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_local_var = com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_create_internal (
        default_limit ? default_limit_local_nonprim : NULL,
        use_absolute_uri ? use_absolute_uri_local_nonprim : NULL
        );

    if (!com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_rest_impl_servlet_default_get_servlet_properties_local_var;
end:
    if (default_limit_local_nonprim) {
        config_node_property_integer_free(default_limit_local_nonprim);
        default_limit_local_nonprim = NULL;
    }
    if (use_absolute_uri_local_nonprim) {
        config_node_property_boolean_free(use_absolute_uri_local_nonprim);
        use_absolute_uri_local_nonprim = NULL;
    }
    return NULL;

}
