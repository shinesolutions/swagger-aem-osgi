#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_servlets_post_impl_sling_post_servlet_properties.h"



static org_apache_sling_servlets_post_impl_sling_post_servlet_properties_t *org_apache_sling_servlets_post_impl_sling_post_servlet_properties_create_internal(
    config_node_property_array_t *servlet_post_date_formats,
    config_node_property_array_t *servlet_post_node_name_hints,
    config_node_property_integer_t *servlet_post_node_name_max_length,
    config_node_property_boolean_t *servlet_post_checkin_new_versionable_nodes,
    config_node_property_boolean_t *servlet_post_auto_checkout,
    config_node_property_boolean_t *servlet_post_auto_checkin,
    config_node_property_string_t *servlet_post_ignore_pattern
    ) {
    org_apache_sling_servlets_post_impl_sling_post_servlet_properties_t *org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var = malloc(sizeof(org_apache_sling_servlets_post_impl_sling_post_servlet_properties_t));
    if (!org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var, 0, sizeof(org_apache_sling_servlets_post_impl_sling_post_servlet_properties_t));
    org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var->_library_owned = 1;
    org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var->servlet_post_date_formats = servlet_post_date_formats;
    org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var->servlet_post_node_name_hints = servlet_post_node_name_hints;
    org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var->servlet_post_node_name_max_length = servlet_post_node_name_max_length;
    org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var->servlet_post_checkin_new_versionable_nodes = servlet_post_checkin_new_versionable_nodes;
    org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var->servlet_post_auto_checkout = servlet_post_auto_checkout;
    org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var->servlet_post_auto_checkin = servlet_post_auto_checkin;
    org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var->servlet_post_ignore_pattern = servlet_post_ignore_pattern;
    return org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_servlets_post_impl_sling_post_servlet_properties_t *org_apache_sling_servlets_post_impl_sling_post_servlet_properties_create(
    config_node_property_array_t *servlet_post_date_formats,
    config_node_property_array_t *servlet_post_node_name_hints,
    config_node_property_integer_t *servlet_post_node_name_max_length,
    config_node_property_boolean_t *servlet_post_checkin_new_versionable_nodes,
    config_node_property_boolean_t *servlet_post_auto_checkout,
    config_node_property_boolean_t *servlet_post_auto_checkin,
    config_node_property_string_t *servlet_post_ignore_pattern
    ) {
    org_apache_sling_servlets_post_impl_sling_post_servlet_properties_t *result = org_apache_sling_servlets_post_impl_sling_post_servlet_properties_create_internal (
        servlet_post_date_formats,
        servlet_post_node_name_hints,
        servlet_post_node_name_max_length,
        servlet_post_checkin_new_versionable_nodes,
        servlet_post_auto_checkout,
        servlet_post_auto_checkin,
        servlet_post_ignore_pattern
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_servlets_post_impl_sling_post_servlet_properties_free(org_apache_sling_servlets_post_impl_sling_post_servlet_properties_t *org_apache_sling_servlets_post_impl_sling_post_servlet_properties) {
    if(NULL == org_apache_sling_servlets_post_impl_sling_post_servlet_properties){
        return ;
    }
    if(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_servlets_post_impl_sling_post_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_date_formats) {
        config_node_property_array_free(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_date_formats);
        org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_date_formats = NULL;
    }
    if (org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_hints) {
        config_node_property_array_free(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_hints);
        org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_hints = NULL;
    }
    if (org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_max_length) {
        config_node_property_integer_free(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_max_length);
        org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_max_length = NULL;
    }
    if (org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_checkin_new_versionable_nodes) {
        config_node_property_boolean_free(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_checkin_new_versionable_nodes);
        org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_checkin_new_versionable_nodes = NULL;
    }
    if (org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkout) {
        config_node_property_boolean_free(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkout);
        org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkout = NULL;
    }
    if (org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkin) {
        config_node_property_boolean_free(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkin);
        org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkin = NULL;
    }
    if (org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_ignore_pattern) {
        config_node_property_string_free(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_ignore_pattern);
        org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_ignore_pattern = NULL;
    }
    free(org_apache_sling_servlets_post_impl_sling_post_servlet_properties);
}

cJSON *org_apache_sling_servlets_post_impl_sling_post_servlet_properties_convertToJSON(org_apache_sling_servlets_post_impl_sling_post_servlet_properties_t *org_apache_sling_servlets_post_impl_sling_post_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_date_formats
    if(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_date_formats) {
    cJSON *servlet_post_date_formats_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_date_formats);
    if(servlet_post_date_formats_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servlet.post.dateFormats", servlet_post_date_formats_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_hints
    if(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_hints) {
    cJSON *servlet_post_node_name_hints_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_hints);
    if(servlet_post_node_name_hints_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servlet.post.nodeNameHints", servlet_post_node_name_hints_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_max_length
    if(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_max_length) {
    cJSON *servlet_post_node_name_max_length_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_max_length);
    if(servlet_post_node_name_max_length_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servlet.post.nodeNameMaxLength", servlet_post_node_name_max_length_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_checkin_new_versionable_nodes
    if(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_checkin_new_versionable_nodes) {
    cJSON *servlet_post_checkin_new_versionable_nodes_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_checkin_new_versionable_nodes);
    if(servlet_post_checkin_new_versionable_nodes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servlet.post.checkinNewVersionableNodes", servlet_post_checkin_new_versionable_nodes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkout
    if(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkout) {
    cJSON *servlet_post_auto_checkout_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkout);
    if(servlet_post_auto_checkout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servlet.post.autoCheckout", servlet_post_auto_checkout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkin
    if(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkin) {
    cJSON *servlet_post_auto_checkin_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkin);
    if(servlet_post_auto_checkin_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servlet.post.autoCheckin", servlet_post_auto_checkin_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_ignore_pattern
    if(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_ignore_pattern) {
    cJSON *servlet_post_ignore_pattern_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_ignore_pattern);
    if(servlet_post_ignore_pattern_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servlet.post.ignorePattern", servlet_post_ignore_pattern_local_JSON);
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

org_apache_sling_servlets_post_impl_sling_post_servlet_properties_t *org_apache_sling_servlets_post_impl_sling_post_servlet_properties_parseFromJSON(cJSON *org_apache_sling_servlets_post_impl_sling_post_servlet_propertiesJSON){

    org_apache_sling_servlets_post_impl_sling_post_servlet_properties_t *org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var = NULL;

    // define the local variable for org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_date_formats
    config_node_property_array_t *servlet_post_date_formats_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_hints
    config_node_property_array_t *servlet_post_node_name_hints_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_max_length
    config_node_property_integer_t *servlet_post_node_name_max_length_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_checkin_new_versionable_nodes
    config_node_property_boolean_t *servlet_post_checkin_new_versionable_nodes_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkout
    config_node_property_boolean_t *servlet_post_auto_checkout_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkin
    config_node_property_boolean_t *servlet_post_auto_checkin_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_ignore_pattern
    config_node_property_string_t *servlet_post_ignore_pattern_local_nonprim = NULL;

    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_date_formats
    cJSON *servlet_post_date_formats = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_post_impl_sling_post_servlet_propertiesJSON, "servlet.post.dateFormats");
    if (cJSON_IsNull(servlet_post_date_formats)) {
        servlet_post_date_formats = NULL;
    }
    if (servlet_post_date_formats) { 
    servlet_post_date_formats_local_nonprim = config_node_property_array_parseFromJSON(servlet_post_date_formats); //nonprimitive
    }

    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_hints
    cJSON *servlet_post_node_name_hints = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_post_impl_sling_post_servlet_propertiesJSON, "servlet.post.nodeNameHints");
    if (cJSON_IsNull(servlet_post_node_name_hints)) {
        servlet_post_node_name_hints = NULL;
    }
    if (servlet_post_node_name_hints) { 
    servlet_post_node_name_hints_local_nonprim = config_node_property_array_parseFromJSON(servlet_post_node_name_hints); //nonprimitive
    }

    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_node_name_max_length
    cJSON *servlet_post_node_name_max_length = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_post_impl_sling_post_servlet_propertiesJSON, "servlet.post.nodeNameMaxLength");
    if (cJSON_IsNull(servlet_post_node_name_max_length)) {
        servlet_post_node_name_max_length = NULL;
    }
    if (servlet_post_node_name_max_length) { 
    servlet_post_node_name_max_length_local_nonprim = config_node_property_integer_parseFromJSON(servlet_post_node_name_max_length); //nonprimitive
    }

    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_checkin_new_versionable_nodes
    cJSON *servlet_post_checkin_new_versionable_nodes = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_post_impl_sling_post_servlet_propertiesJSON, "servlet.post.checkinNewVersionableNodes");
    if (cJSON_IsNull(servlet_post_checkin_new_versionable_nodes)) {
        servlet_post_checkin_new_versionable_nodes = NULL;
    }
    if (servlet_post_checkin_new_versionable_nodes) { 
    servlet_post_checkin_new_versionable_nodes_local_nonprim = config_node_property_boolean_parseFromJSON(servlet_post_checkin_new_versionable_nodes); //nonprimitive
    }

    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkout
    cJSON *servlet_post_auto_checkout = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_post_impl_sling_post_servlet_propertiesJSON, "servlet.post.autoCheckout");
    if (cJSON_IsNull(servlet_post_auto_checkout)) {
        servlet_post_auto_checkout = NULL;
    }
    if (servlet_post_auto_checkout) { 
    servlet_post_auto_checkout_local_nonprim = config_node_property_boolean_parseFromJSON(servlet_post_auto_checkout); //nonprimitive
    }

    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_auto_checkin
    cJSON *servlet_post_auto_checkin = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_post_impl_sling_post_servlet_propertiesJSON, "servlet.post.autoCheckin");
    if (cJSON_IsNull(servlet_post_auto_checkin)) {
        servlet_post_auto_checkin = NULL;
    }
    if (servlet_post_auto_checkin) { 
    servlet_post_auto_checkin_local_nonprim = config_node_property_boolean_parseFromJSON(servlet_post_auto_checkin); //nonprimitive
    }

    // org_apache_sling_servlets_post_impl_sling_post_servlet_properties->servlet_post_ignore_pattern
    cJSON *servlet_post_ignore_pattern = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_post_impl_sling_post_servlet_propertiesJSON, "servlet.post.ignorePattern");
    if (cJSON_IsNull(servlet_post_ignore_pattern)) {
        servlet_post_ignore_pattern = NULL;
    }
    if (servlet_post_ignore_pattern) { 
    servlet_post_ignore_pattern_local_nonprim = config_node_property_string_parseFromJSON(servlet_post_ignore_pattern); //nonprimitive
    }



    org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var = org_apache_sling_servlets_post_impl_sling_post_servlet_properties_create_internal (
        servlet_post_date_formats ? servlet_post_date_formats_local_nonprim : NULL,
        servlet_post_node_name_hints ? servlet_post_node_name_hints_local_nonprim : NULL,
        servlet_post_node_name_max_length ? servlet_post_node_name_max_length_local_nonprim : NULL,
        servlet_post_checkin_new_versionable_nodes ? servlet_post_checkin_new_versionable_nodes_local_nonprim : NULL,
        servlet_post_auto_checkout ? servlet_post_auto_checkout_local_nonprim : NULL,
        servlet_post_auto_checkin ? servlet_post_auto_checkin_local_nonprim : NULL,
        servlet_post_ignore_pattern ? servlet_post_ignore_pattern_local_nonprim : NULL
        );

    if (!org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var) {
        goto end;
    }

    return org_apache_sling_servlets_post_impl_sling_post_servlet_properties_local_var;
end:
    if (servlet_post_date_formats_local_nonprim) {
        config_node_property_array_free(servlet_post_date_formats_local_nonprim);
        servlet_post_date_formats_local_nonprim = NULL;
    }
    if (servlet_post_node_name_hints_local_nonprim) {
        config_node_property_array_free(servlet_post_node_name_hints_local_nonprim);
        servlet_post_node_name_hints_local_nonprim = NULL;
    }
    if (servlet_post_node_name_max_length_local_nonprim) {
        config_node_property_integer_free(servlet_post_node_name_max_length_local_nonprim);
        servlet_post_node_name_max_length_local_nonprim = NULL;
    }
    if (servlet_post_checkin_new_versionable_nodes_local_nonprim) {
        config_node_property_boolean_free(servlet_post_checkin_new_versionable_nodes_local_nonprim);
        servlet_post_checkin_new_versionable_nodes_local_nonprim = NULL;
    }
    if (servlet_post_auto_checkout_local_nonprim) {
        config_node_property_boolean_free(servlet_post_auto_checkout_local_nonprim);
        servlet_post_auto_checkout_local_nonprim = NULL;
    }
    if (servlet_post_auto_checkin_local_nonprim) {
        config_node_property_boolean_free(servlet_post_auto_checkin_local_nonprim);
        servlet_post_auto_checkin_local_nonprim = NULL;
    }
    if (servlet_post_ignore_pattern_local_nonprim) {
        config_node_property_string_free(servlet_post_ignore_pattern_local_nonprim);
        servlet_post_ignore_pattern_local_nonprim = NULL;
    }
    return NULL;

}
