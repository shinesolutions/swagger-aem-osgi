#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_widget_impl_html_library_manager_impl_properties.h"



static com_day_cq_widget_impl_html_library_manager_impl_properties_t *com_day_cq_widget_impl_html_library_manager_impl_properties_create_internal(
    config_node_property_string_t *htmllibmanager_clientmanager,
    config_node_property_boolean_t *htmllibmanager_debug,
    config_node_property_boolean_t *htmllibmanager_debug_console,
    config_node_property_string_t *htmllibmanager_debug_init_js,
    config_node_property_string_t *htmllibmanager_defaultthemename,
    config_node_property_string_t *htmllibmanager_defaultuserthemename,
    config_node_property_string_t *htmllibmanager_firebuglite_path,
    config_node_property_boolean_t *htmllibmanager_force_cq_url_info,
    config_node_property_boolean_t *htmllibmanager_gzip,
    config_node_property_integer_t *htmllibmanager_maxage,
    config_node_property_integer_t *htmllibmanager_max_data_uri_size,
    config_node_property_boolean_t *htmllibmanager_minify,
    config_node_property_array_t *htmllibmanager_path_list,
    config_node_property_boolean_t *htmllibmanager_timing
    ) {
    com_day_cq_widget_impl_html_library_manager_impl_properties_t *com_day_cq_widget_impl_html_library_manager_impl_properties_local_var = malloc(sizeof(com_day_cq_widget_impl_html_library_manager_impl_properties_t));
    if (!com_day_cq_widget_impl_html_library_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_widget_impl_html_library_manager_impl_properties_local_var, 0, sizeof(com_day_cq_widget_impl_html_library_manager_impl_properties_t));
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->_library_owned = 1;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_clientmanager = htmllibmanager_clientmanager;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_debug = htmllibmanager_debug;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_debug_console = htmllibmanager_debug_console;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_debug_init_js = htmllibmanager_debug_init_js;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_defaultthemename = htmllibmanager_defaultthemename;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_defaultuserthemename = htmllibmanager_defaultuserthemename;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_firebuglite_path = htmllibmanager_firebuglite_path;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_force_cq_url_info = htmllibmanager_force_cq_url_info;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_gzip = htmllibmanager_gzip;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_maxage = htmllibmanager_maxage;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_max_data_uri_size = htmllibmanager_max_data_uri_size;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_minify = htmllibmanager_minify;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_path_list = htmllibmanager_path_list;
    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var->htmllibmanager_timing = htmllibmanager_timing;
    return com_day_cq_widget_impl_html_library_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_widget_impl_html_library_manager_impl_properties_t *com_day_cq_widget_impl_html_library_manager_impl_properties_create(
    config_node_property_string_t *htmllibmanager_clientmanager,
    config_node_property_boolean_t *htmllibmanager_debug,
    config_node_property_boolean_t *htmllibmanager_debug_console,
    config_node_property_string_t *htmllibmanager_debug_init_js,
    config_node_property_string_t *htmllibmanager_defaultthemename,
    config_node_property_string_t *htmllibmanager_defaultuserthemename,
    config_node_property_string_t *htmllibmanager_firebuglite_path,
    config_node_property_boolean_t *htmllibmanager_force_cq_url_info,
    config_node_property_boolean_t *htmllibmanager_gzip,
    config_node_property_integer_t *htmllibmanager_maxage,
    config_node_property_integer_t *htmllibmanager_max_data_uri_size,
    config_node_property_boolean_t *htmllibmanager_minify,
    config_node_property_array_t *htmllibmanager_path_list,
    config_node_property_boolean_t *htmllibmanager_timing
    ) {
    com_day_cq_widget_impl_html_library_manager_impl_properties_t *result = com_day_cq_widget_impl_html_library_manager_impl_properties_create_internal (
        htmllibmanager_clientmanager,
        htmllibmanager_debug,
        htmllibmanager_debug_console,
        htmllibmanager_debug_init_js,
        htmllibmanager_defaultthemename,
        htmllibmanager_defaultuserthemename,
        htmllibmanager_firebuglite_path,
        htmllibmanager_force_cq_url_info,
        htmllibmanager_gzip,
        htmllibmanager_maxage,
        htmllibmanager_max_data_uri_size,
        htmllibmanager_minify,
        htmllibmanager_path_list,
        htmllibmanager_timing
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_widget_impl_html_library_manager_impl_properties_free(com_day_cq_widget_impl_html_library_manager_impl_properties_t *com_day_cq_widget_impl_html_library_manager_impl_properties) {
    if(NULL == com_day_cq_widget_impl_html_library_manager_impl_properties){
        return ;
    }
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_widget_impl_html_library_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager) {
        config_node_property_string_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug) {
        config_node_property_boolean_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_console) {
        config_node_property_boolean_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_console);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_console = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js) {
        config_node_property_string_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename) {
        config_node_property_string_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename) {
        config_node_property_string_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_firebuglite_path) {
        config_node_property_string_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_firebuglite_path);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_firebuglite_path = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info) {
        config_node_property_boolean_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_gzip) {
        config_node_property_boolean_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_gzip);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_gzip = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_maxage) {
        config_node_property_integer_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_maxage);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_maxage = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size) {
        config_node_property_integer_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_minify) {
        config_node_property_boolean_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_minify);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_minify = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_path_list) {
        config_node_property_array_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_path_list);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_path_list = NULL;
    }
    if (com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_timing) {
        config_node_property_boolean_free(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_timing);
        com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_timing = NULL;
    }
    free(com_day_cq_widget_impl_html_library_manager_impl_properties);
}

cJSON *com_day_cq_widget_impl_html_library_manager_impl_properties_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties_t *com_day_cq_widget_impl_html_library_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager) {
    cJSON *htmllibmanager_clientmanager_local_JSON = config_node_property_string_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager);
    if(htmllibmanager_clientmanager_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.clientmanager", htmllibmanager_clientmanager_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug) {
    cJSON *htmllibmanager_debug_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug);
    if(htmllibmanager_debug_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.debug", htmllibmanager_debug_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_console
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_console) {
    cJSON *htmllibmanager_debug_console_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_console);
    if(htmllibmanager_debug_console_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.debug.console", htmllibmanager_debug_console_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js) {
    cJSON *htmllibmanager_debug_init_js_local_JSON = config_node_property_string_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js);
    if(htmllibmanager_debug_init_js_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.debug.init.js", htmllibmanager_debug_init_js_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename) {
    cJSON *htmllibmanager_defaultthemename_local_JSON = config_node_property_string_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename);
    if(htmllibmanager_defaultthemename_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.defaultthemename", htmllibmanager_defaultthemename_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename) {
    cJSON *htmllibmanager_defaultuserthemename_local_JSON = config_node_property_string_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename);
    if(htmllibmanager_defaultuserthemename_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.defaultuserthemename", htmllibmanager_defaultuserthemename_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_firebuglite_path
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_firebuglite_path) {
    cJSON *htmllibmanager_firebuglite_path_local_JSON = config_node_property_string_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_firebuglite_path);
    if(htmllibmanager_firebuglite_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.firebuglite.path", htmllibmanager_firebuglite_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info) {
    cJSON *htmllibmanager_force_cq_url_info_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info);
    if(htmllibmanager_force_cq_url_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.forceCQUrlInfo", htmllibmanager_force_cq_url_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_gzip
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_gzip) {
    cJSON *htmllibmanager_gzip_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_gzip);
    if(htmllibmanager_gzip_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.gzip", htmllibmanager_gzip_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_maxage
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_maxage) {
    cJSON *htmllibmanager_maxage_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_maxage);
    if(htmllibmanager_maxage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.maxage", htmllibmanager_maxage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size) {
    cJSON *htmllibmanager_max_data_uri_size_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size);
    if(htmllibmanager_max_data_uri_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.maxDataUriSize", htmllibmanager_max_data_uri_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_minify
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_minify) {
    cJSON *htmllibmanager_minify_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_minify);
    if(htmllibmanager_minify_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.minify", htmllibmanager_minify_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_path_list
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_path_list) {
    cJSON *htmllibmanager_path_list_local_JSON = config_node_property_array_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_path_list);
    if(htmllibmanager_path_list_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.path.list", htmllibmanager_path_list_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_timing
    if(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_timing) {
    cJSON *htmllibmanager_timing_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_timing);
    if(htmllibmanager_timing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.timing", htmllibmanager_timing_local_JSON);
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

com_day_cq_widget_impl_html_library_manager_impl_properties_t *com_day_cq_widget_impl_html_library_manager_impl_properties_parseFromJSON(cJSON *com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON){

    com_day_cq_widget_impl_html_library_manager_impl_properties_t *com_day_cq_widget_impl_html_library_manager_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager
    config_node_property_string_t *htmllibmanager_clientmanager_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug
    config_node_property_boolean_t *htmllibmanager_debug_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_console
    config_node_property_boolean_t *htmllibmanager_debug_console_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js
    config_node_property_string_t *htmllibmanager_debug_init_js_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename
    config_node_property_string_t *htmllibmanager_defaultthemename_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename
    config_node_property_string_t *htmllibmanager_defaultuserthemename_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_firebuglite_path
    config_node_property_string_t *htmllibmanager_firebuglite_path_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info
    config_node_property_boolean_t *htmllibmanager_force_cq_url_info_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_gzip
    config_node_property_boolean_t *htmllibmanager_gzip_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_maxage
    config_node_property_integer_t *htmllibmanager_maxage_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size
    config_node_property_integer_t *htmllibmanager_max_data_uri_size_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_minify
    config_node_property_boolean_t *htmllibmanager_minify_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_path_list
    config_node_property_array_t *htmllibmanager_path_list_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_timing
    config_node_property_boolean_t *htmllibmanager_timing_local_nonprim = NULL;

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager
    cJSON *htmllibmanager_clientmanager = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.clientmanager");
    if (cJSON_IsNull(htmllibmanager_clientmanager)) {
        htmllibmanager_clientmanager = NULL;
    }
    if (htmllibmanager_clientmanager) { 
    htmllibmanager_clientmanager_local_nonprim = config_node_property_string_parseFromJSON(htmllibmanager_clientmanager); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug
    cJSON *htmllibmanager_debug = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.debug");
    if (cJSON_IsNull(htmllibmanager_debug)) {
        htmllibmanager_debug = NULL;
    }
    if (htmllibmanager_debug) { 
    htmllibmanager_debug_local_nonprim = config_node_property_boolean_parseFromJSON(htmllibmanager_debug); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_console
    cJSON *htmllibmanager_debug_console = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.debug.console");
    if (cJSON_IsNull(htmllibmanager_debug_console)) {
        htmllibmanager_debug_console = NULL;
    }
    if (htmllibmanager_debug_console) { 
    htmllibmanager_debug_console_local_nonprim = config_node_property_boolean_parseFromJSON(htmllibmanager_debug_console); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js
    cJSON *htmllibmanager_debug_init_js = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.debug.init.js");
    if (cJSON_IsNull(htmllibmanager_debug_init_js)) {
        htmllibmanager_debug_init_js = NULL;
    }
    if (htmllibmanager_debug_init_js) { 
    htmllibmanager_debug_init_js_local_nonprim = config_node_property_string_parseFromJSON(htmllibmanager_debug_init_js); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename
    cJSON *htmllibmanager_defaultthemename = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.defaultthemename");
    if (cJSON_IsNull(htmllibmanager_defaultthemename)) {
        htmllibmanager_defaultthemename = NULL;
    }
    if (htmllibmanager_defaultthemename) { 
    htmllibmanager_defaultthemename_local_nonprim = config_node_property_string_parseFromJSON(htmllibmanager_defaultthemename); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename
    cJSON *htmllibmanager_defaultuserthemename = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.defaultuserthemename");
    if (cJSON_IsNull(htmllibmanager_defaultuserthemename)) {
        htmllibmanager_defaultuserthemename = NULL;
    }
    if (htmllibmanager_defaultuserthemename) { 
    htmllibmanager_defaultuserthemename_local_nonprim = config_node_property_string_parseFromJSON(htmllibmanager_defaultuserthemename); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_firebuglite_path
    cJSON *htmllibmanager_firebuglite_path = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.firebuglite.path");
    if (cJSON_IsNull(htmllibmanager_firebuglite_path)) {
        htmllibmanager_firebuglite_path = NULL;
    }
    if (htmllibmanager_firebuglite_path) { 
    htmllibmanager_firebuglite_path_local_nonprim = config_node_property_string_parseFromJSON(htmllibmanager_firebuglite_path); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info
    cJSON *htmllibmanager_force_cq_url_info = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.forceCQUrlInfo");
    if (cJSON_IsNull(htmllibmanager_force_cq_url_info)) {
        htmllibmanager_force_cq_url_info = NULL;
    }
    if (htmllibmanager_force_cq_url_info) { 
    htmllibmanager_force_cq_url_info_local_nonprim = config_node_property_boolean_parseFromJSON(htmllibmanager_force_cq_url_info); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_gzip
    cJSON *htmllibmanager_gzip = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.gzip");
    if (cJSON_IsNull(htmllibmanager_gzip)) {
        htmllibmanager_gzip = NULL;
    }
    if (htmllibmanager_gzip) { 
    htmllibmanager_gzip_local_nonprim = config_node_property_boolean_parseFromJSON(htmllibmanager_gzip); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_maxage
    cJSON *htmllibmanager_maxage = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.maxage");
    if (cJSON_IsNull(htmllibmanager_maxage)) {
        htmllibmanager_maxage = NULL;
    }
    if (htmllibmanager_maxage) { 
    htmllibmanager_maxage_local_nonprim = config_node_property_integer_parseFromJSON(htmllibmanager_maxage); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size
    cJSON *htmllibmanager_max_data_uri_size = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.maxDataUriSize");
    if (cJSON_IsNull(htmllibmanager_max_data_uri_size)) {
        htmllibmanager_max_data_uri_size = NULL;
    }
    if (htmllibmanager_max_data_uri_size) { 
    htmllibmanager_max_data_uri_size_local_nonprim = config_node_property_integer_parseFromJSON(htmllibmanager_max_data_uri_size); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_minify
    cJSON *htmllibmanager_minify = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.minify");
    if (cJSON_IsNull(htmllibmanager_minify)) {
        htmllibmanager_minify = NULL;
    }
    if (htmllibmanager_minify) { 
    htmllibmanager_minify_local_nonprim = config_node_property_boolean_parseFromJSON(htmllibmanager_minify); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_path_list
    cJSON *htmllibmanager_path_list = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.path.list");
    if (cJSON_IsNull(htmllibmanager_path_list)) {
        htmllibmanager_path_list = NULL;
    }
    if (htmllibmanager_path_list) { 
    htmllibmanager_path_list_local_nonprim = config_node_property_array_parseFromJSON(htmllibmanager_path_list); //nonprimitive
    }

    // com_day_cq_widget_impl_html_library_manager_impl_properties->htmllibmanager_timing
    cJSON *htmllibmanager_timing = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.timing");
    if (cJSON_IsNull(htmllibmanager_timing)) {
        htmllibmanager_timing = NULL;
    }
    if (htmllibmanager_timing) { 
    htmllibmanager_timing_local_nonprim = config_node_property_boolean_parseFromJSON(htmllibmanager_timing); //nonprimitive
    }



    com_day_cq_widget_impl_html_library_manager_impl_properties_local_var = com_day_cq_widget_impl_html_library_manager_impl_properties_create_internal (
        htmllibmanager_clientmanager ? htmllibmanager_clientmanager_local_nonprim : NULL,
        htmllibmanager_debug ? htmllibmanager_debug_local_nonprim : NULL,
        htmllibmanager_debug_console ? htmllibmanager_debug_console_local_nonprim : NULL,
        htmllibmanager_debug_init_js ? htmllibmanager_debug_init_js_local_nonprim : NULL,
        htmllibmanager_defaultthemename ? htmllibmanager_defaultthemename_local_nonprim : NULL,
        htmllibmanager_defaultuserthemename ? htmllibmanager_defaultuserthemename_local_nonprim : NULL,
        htmllibmanager_firebuglite_path ? htmllibmanager_firebuglite_path_local_nonprim : NULL,
        htmllibmanager_force_cq_url_info ? htmllibmanager_force_cq_url_info_local_nonprim : NULL,
        htmllibmanager_gzip ? htmllibmanager_gzip_local_nonprim : NULL,
        htmllibmanager_maxage ? htmllibmanager_maxage_local_nonprim : NULL,
        htmllibmanager_max_data_uri_size ? htmllibmanager_max_data_uri_size_local_nonprim : NULL,
        htmllibmanager_minify ? htmllibmanager_minify_local_nonprim : NULL,
        htmllibmanager_path_list ? htmllibmanager_path_list_local_nonprim : NULL,
        htmllibmanager_timing ? htmllibmanager_timing_local_nonprim : NULL
        );

    if (!com_day_cq_widget_impl_html_library_manager_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_widget_impl_html_library_manager_impl_properties_local_var;
end:
    if (htmllibmanager_clientmanager_local_nonprim) {
        config_node_property_string_free(htmllibmanager_clientmanager_local_nonprim);
        htmllibmanager_clientmanager_local_nonprim = NULL;
    }
    if (htmllibmanager_debug_local_nonprim) {
        config_node_property_boolean_free(htmllibmanager_debug_local_nonprim);
        htmllibmanager_debug_local_nonprim = NULL;
    }
    if (htmllibmanager_debug_console_local_nonprim) {
        config_node_property_boolean_free(htmllibmanager_debug_console_local_nonprim);
        htmllibmanager_debug_console_local_nonprim = NULL;
    }
    if (htmllibmanager_debug_init_js_local_nonprim) {
        config_node_property_string_free(htmllibmanager_debug_init_js_local_nonprim);
        htmllibmanager_debug_init_js_local_nonprim = NULL;
    }
    if (htmllibmanager_defaultthemename_local_nonprim) {
        config_node_property_string_free(htmllibmanager_defaultthemename_local_nonprim);
        htmllibmanager_defaultthemename_local_nonprim = NULL;
    }
    if (htmllibmanager_defaultuserthemename_local_nonprim) {
        config_node_property_string_free(htmllibmanager_defaultuserthemename_local_nonprim);
        htmllibmanager_defaultuserthemename_local_nonprim = NULL;
    }
    if (htmllibmanager_firebuglite_path_local_nonprim) {
        config_node_property_string_free(htmllibmanager_firebuglite_path_local_nonprim);
        htmllibmanager_firebuglite_path_local_nonprim = NULL;
    }
    if (htmllibmanager_force_cq_url_info_local_nonprim) {
        config_node_property_boolean_free(htmllibmanager_force_cq_url_info_local_nonprim);
        htmllibmanager_force_cq_url_info_local_nonprim = NULL;
    }
    if (htmllibmanager_gzip_local_nonprim) {
        config_node_property_boolean_free(htmllibmanager_gzip_local_nonprim);
        htmllibmanager_gzip_local_nonprim = NULL;
    }
    if (htmllibmanager_maxage_local_nonprim) {
        config_node_property_integer_free(htmllibmanager_maxage_local_nonprim);
        htmllibmanager_maxage_local_nonprim = NULL;
    }
    if (htmllibmanager_max_data_uri_size_local_nonprim) {
        config_node_property_integer_free(htmllibmanager_max_data_uri_size_local_nonprim);
        htmllibmanager_max_data_uri_size_local_nonprim = NULL;
    }
    if (htmllibmanager_minify_local_nonprim) {
        config_node_property_boolean_free(htmllibmanager_minify_local_nonprim);
        htmllibmanager_minify_local_nonprim = NULL;
    }
    if (htmllibmanager_path_list_local_nonprim) {
        config_node_property_array_free(htmllibmanager_path_list_local_nonprim);
        htmllibmanager_path_list_local_nonprim = NULL;
    }
    if (htmllibmanager_timing_local_nonprim) {
        config_node_property_boolean_free(htmllibmanager_timing_local_nonprim);
        htmllibmanager_timing_local_nonprim = NULL;
    }
    return NULL;

}
