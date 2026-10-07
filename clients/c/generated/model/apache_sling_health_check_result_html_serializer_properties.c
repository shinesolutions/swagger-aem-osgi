#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "apache_sling_health_check_result_html_serializer_properties.h"



static apache_sling_health_check_result_html_serializer_properties_t *apache_sling_health_check_result_html_serializer_properties_create_internal(
    config_node_property_string_t *style_string
    ) {
    apache_sling_health_check_result_html_serializer_properties_t *apache_sling_health_check_result_html_serializer_properties_local_var = malloc(sizeof(apache_sling_health_check_result_html_serializer_properties_t));
    if (!apache_sling_health_check_result_html_serializer_properties_local_var) {
        return NULL;
    }
    memset(apache_sling_health_check_result_html_serializer_properties_local_var, 0, sizeof(apache_sling_health_check_result_html_serializer_properties_t));
    apache_sling_health_check_result_html_serializer_properties_local_var->_library_owned = 1;
    apache_sling_health_check_result_html_serializer_properties_local_var->style_string = style_string;
    return apache_sling_health_check_result_html_serializer_properties_local_var;
}

__attribute__((deprecated)) apache_sling_health_check_result_html_serializer_properties_t *apache_sling_health_check_result_html_serializer_properties_create(
    config_node_property_string_t *style_string
    ) {
    apache_sling_health_check_result_html_serializer_properties_t *result = apache_sling_health_check_result_html_serializer_properties_create_internal (
        style_string
        );
    if (!result) {
    }
    return result;
}

void apache_sling_health_check_result_html_serializer_properties_free(apache_sling_health_check_result_html_serializer_properties_t *apache_sling_health_check_result_html_serializer_properties) {
    if(NULL == apache_sling_health_check_result_html_serializer_properties){
        return ;
    }
    if(apache_sling_health_check_result_html_serializer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "apache_sling_health_check_result_html_serializer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (apache_sling_health_check_result_html_serializer_properties->style_string) {
        config_node_property_string_free(apache_sling_health_check_result_html_serializer_properties->style_string);
        apache_sling_health_check_result_html_serializer_properties->style_string = NULL;
    }
    free(apache_sling_health_check_result_html_serializer_properties);
}

cJSON *apache_sling_health_check_result_html_serializer_properties_convertToJSON(apache_sling_health_check_result_html_serializer_properties_t *apache_sling_health_check_result_html_serializer_properties) {
    cJSON *item = cJSON_CreateObject();

    // apache_sling_health_check_result_html_serializer_properties->style_string
    if(apache_sling_health_check_result_html_serializer_properties->style_string) {
    cJSON *style_string_local_JSON = config_node_property_string_convertToJSON(apache_sling_health_check_result_html_serializer_properties->style_string);
    if(style_string_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "styleString", style_string_local_JSON);
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

apache_sling_health_check_result_html_serializer_properties_t *apache_sling_health_check_result_html_serializer_properties_parseFromJSON(cJSON *apache_sling_health_check_result_html_serializer_propertiesJSON){

    apache_sling_health_check_result_html_serializer_properties_t *apache_sling_health_check_result_html_serializer_properties_local_var = NULL;

    // define the local variable for apache_sling_health_check_result_html_serializer_properties->style_string
    config_node_property_string_t *style_string_local_nonprim = NULL;

    // apache_sling_health_check_result_html_serializer_properties->style_string
    cJSON *style_string = cJSON_GetObjectItemCaseSensitive(apache_sling_health_check_result_html_serializer_propertiesJSON, "styleString");
    if (cJSON_IsNull(style_string)) {
        style_string = NULL;
    }
    if (style_string) { 
    style_string_local_nonprim = config_node_property_string_parseFromJSON(style_string); //nonprimitive
    }



    apache_sling_health_check_result_html_serializer_properties_local_var = apache_sling_health_check_result_html_serializer_properties_create_internal (
        style_string ? style_string_local_nonprim : NULL
        );

    if (!apache_sling_health_check_result_html_serializer_properties_local_var) {
        goto end;
    }

    return apache_sling_health_check_result_html_serializer_properties_local_var;
end:
    if (style_string_local_nonprim) {
        config_node_property_string_free(style_string_local_nonprim);
        style_string_local_nonprim = NULL;
    }
    return NULL;

}
