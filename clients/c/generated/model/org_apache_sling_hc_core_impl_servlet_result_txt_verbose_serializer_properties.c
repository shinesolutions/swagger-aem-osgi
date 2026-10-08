#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties.h"



static org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_t *org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_create_internal(
    config_node_property_integer_t *total_width,
    config_node_property_integer_t *col_width_name,
    config_node_property_integer_t *col_width_result,
    config_node_property_integer_t *col_width_timing
    ) {
    org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_t *org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var = malloc(sizeof(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_t));
    if (!org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var, 0, sizeof(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_t));
    org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var->_library_owned = 1;
    org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var->total_width = total_width;
    org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var->col_width_name = col_width_name;
    org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var->col_width_result = col_width_result;
    org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var->col_width_timing = col_width_timing;
    return org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_t *org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_create(
    config_node_property_integer_t *total_width,
    config_node_property_integer_t *col_width_name,
    config_node_property_integer_t *col_width_result,
    config_node_property_integer_t *col_width_timing
    ) {
    org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_t *result = org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_create_internal (
        total_width,
        col_width_name,
        col_width_result,
        col_width_timing
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_free(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_t *org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties) {
    if(NULL == org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties){
        return ;
    }
    if(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->total_width) {
        config_node_property_integer_free(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->total_width);
        org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->total_width = NULL;
    }
    if (org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_name) {
        config_node_property_integer_free(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_name);
        org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_name = NULL;
    }
    if (org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_result) {
        config_node_property_integer_free(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_result);
        org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_result = NULL;
    }
    if (org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_timing) {
        config_node_property_integer_free(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_timing);
        org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_timing = NULL;
    }
    free(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties);
}

cJSON *org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_convertToJSON(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_t *org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->total_width
    if(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->total_width) {
    cJSON *total_width_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->total_width);
    if(total_width_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "totalWidth", total_width_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_name
    if(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_name) {
    cJSON *col_width_name_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_name);
    if(col_width_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "colWidthName", col_width_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_result
    if(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_result) {
    cJSON *col_width_result_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_result);
    if(col_width_result_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "colWidthResult", col_width_result_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_timing
    if(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_timing) {
    cJSON *col_width_timing_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_timing);
    if(col_width_timing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "colWidthTiming", col_width_timing_local_JSON);
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

org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_t *org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_parseFromJSON(cJSON *org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_propertiesJSON){

    org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_t *org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->total_width
    config_node_property_integer_t *total_width_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_name
    config_node_property_integer_t *col_width_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_result
    config_node_property_integer_t *col_width_result_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_timing
    config_node_property_integer_t *col_width_timing_local_nonprim = NULL;

    // org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->total_width
    cJSON *total_width = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_propertiesJSON, "totalWidth");
    if (cJSON_IsNull(total_width)) {
        total_width = NULL;
    }
    if (total_width) { 
    total_width_local_nonprim = config_node_property_integer_parseFromJSON(total_width); //nonprimitive
    }

    // org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_name
    cJSON *col_width_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_propertiesJSON, "colWidthName");
    if (cJSON_IsNull(col_width_name)) {
        col_width_name = NULL;
    }
    if (col_width_name) { 
    col_width_name_local_nonprim = config_node_property_integer_parseFromJSON(col_width_name); //nonprimitive
    }

    // org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_result
    cJSON *col_width_result = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_propertiesJSON, "colWidthResult");
    if (cJSON_IsNull(col_width_result)) {
        col_width_result = NULL;
    }
    if (col_width_result) { 
    col_width_result_local_nonprim = config_node_property_integer_parseFromJSON(col_width_result); //nonprimitive
    }

    // org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties->col_width_timing
    cJSON *col_width_timing = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_propertiesJSON, "colWidthTiming");
    if (cJSON_IsNull(col_width_timing)) {
        col_width_timing = NULL;
    }
    if (col_width_timing) { 
    col_width_timing_local_nonprim = config_node_property_integer_parseFromJSON(col_width_timing); //nonprimitive
    }



    org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var = org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_create_internal (
        total_width ? total_width_local_nonprim : NULL,
        col_width_name ? col_width_name_local_nonprim : NULL,
        col_width_result ? col_width_result_local_nonprim : NULL,
        col_width_timing ? col_width_timing_local_nonprim : NULL
        );

    if (!org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var) {
        goto end;
    }

    return org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties_local_var;
end:
    if (total_width_local_nonprim) {
        config_node_property_integer_free(total_width_local_nonprim);
        total_width_local_nonprim = NULL;
    }
    if (col_width_name_local_nonprim) {
        config_node_property_integer_free(col_width_name_local_nonprim);
        col_width_name_local_nonprim = NULL;
    }
    if (col_width_result_local_nonprim) {
        config_node_property_integer_free(col_width_result_local_nonprim);
        col_width_result_local_nonprim = NULL;
    }
    if (col_width_timing_local_nonprim) {
        config_node_property_integer_free(col_width_timing_local_nonprim);
        col_width_timing_local_nonprim = NULL;
    }
    return NULL;

}
