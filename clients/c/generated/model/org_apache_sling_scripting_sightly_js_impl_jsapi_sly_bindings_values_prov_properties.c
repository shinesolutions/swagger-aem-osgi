#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties.h"



static org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_t *org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_create_internal(
    config_node_property_array_t *org_apache_sling_scripting_sightly_js_bindings
    ) {
    org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_t *org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_local_var = malloc(sizeof(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_t));
    if (!org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_local_var, 0, sizeof(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_t));
    org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_local_var->_library_owned = 1;
    org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_local_var->org_apache_sling_scripting_sightly_js_bindings = org_apache_sling_scripting_sightly_js_bindings;
    return org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_t *org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_create(
    config_node_property_array_t *org_apache_sling_scripting_sightly_js_bindings
    ) {
    org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_t *result = org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_create_internal (
        org_apache_sling_scripting_sightly_js_bindings
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_free(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_t *org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties) {
    if(NULL == org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties){
        return ;
    }
    if(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties->org_apache_sling_scripting_sightly_js_bindings) {
        config_node_property_array_free(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties->org_apache_sling_scripting_sightly_js_bindings);
        org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties->org_apache_sling_scripting_sightly_js_bindings = NULL;
    }
    free(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties);
}

cJSON *org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_convertToJSON(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_t *org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties->org_apache_sling_scripting_sightly_js_bindings
    if(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties->org_apache_sling_scripting_sightly_js_bindings) {
    cJSON *org_apache_sling_scripting_sightly_js_bindings_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties->org_apache_sling_scripting_sightly_js_bindings);
    if(org_apache_sling_scripting_sightly_js_bindings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.scripting.sightly.js.bindings", org_apache_sling_scripting_sightly_js_bindings_local_JSON);
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

org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_t *org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_parseFromJSON(cJSON *org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_propertiesJSON){

    org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_t *org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_local_var = NULL;

    // define the local variable for org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties->org_apache_sling_scripting_sightly_js_bindings
    config_node_property_array_t *org_apache_sling_scripting_sightly_js_bindings_local_nonprim = NULL;

    // org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties->org_apache_sling_scripting_sightly_js_bindings
    cJSON *org_apache_sling_scripting_sightly_js_bindings = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_propertiesJSON, "org.apache.sling.scripting.sightly.js.bindings");
    if (cJSON_IsNull(org_apache_sling_scripting_sightly_js_bindings)) {
        org_apache_sling_scripting_sightly_js_bindings = NULL;
    }
    if (org_apache_sling_scripting_sightly_js_bindings) { 
    org_apache_sling_scripting_sightly_js_bindings_local_nonprim = config_node_property_array_parseFromJSON(org_apache_sling_scripting_sightly_js_bindings); //nonprimitive
    }



    org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_local_var = org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_create_internal (
        org_apache_sling_scripting_sightly_js_bindings ? org_apache_sling_scripting_sightly_js_bindings_local_nonprim : NULL
        );

    if (!org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_local_var) {
        goto end;
    }

    return org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties_local_var;
end:
    if (org_apache_sling_scripting_sightly_js_bindings_local_nonprim) {
        config_node_property_array_free(org_apache_sling_scripting_sightly_js_bindings_local_nonprim);
        org_apache_sling_scripting_sightly_js_bindings_local_nonprim = NULL;
    }
    return NULL;

}
