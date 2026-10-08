#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties.h"



static com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_t *com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_create_internal(
    config_node_property_boolean_t *htmllibmanager_timing,
    config_node_property_string_t *htmllibmanager_debug_init_js,
    config_node_property_boolean_t *htmllibmanager_minify,
    config_node_property_boolean_t *htmllibmanager_debug,
    config_node_property_boolean_t *htmllibmanager_gzip,
    config_node_property_integer_t *htmllibmanager_max_data_uri_size,
    config_node_property_integer_t *htmllibmanager_maxage,
    config_node_property_boolean_t *htmllibmanager_force_cq_url_info,
    config_node_property_string_t *htmllibmanager_defaultthemename,
    config_node_property_string_t *htmllibmanager_defaultuserthemename,
    config_node_property_string_t *htmllibmanager_clientmanager,
    config_node_property_array_t *htmllibmanager_path_list,
    config_node_property_array_t *htmllibmanager_excluded_path_list,
    config_node_property_array_t *htmllibmanager_processor_js,
    config_node_property_array_t *htmllibmanager_processor_css,
    config_node_property_array_t *htmllibmanager_longcache_patterns,
    config_node_property_string_t *htmllibmanager_longcache_format,
    config_node_property_boolean_t *htmllibmanager_use_file_system_output_cache,
    config_node_property_string_t *htmllibmanager_file_system_output_cache_location,
    config_node_property_array_t *htmllibmanager_disable_replacement
    ) {
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_t *com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var = malloc(sizeof(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_t));
    if (!com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var, 0, sizeof(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_t));
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_timing = htmllibmanager_timing;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_debug_init_js = htmllibmanager_debug_init_js;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_minify = htmllibmanager_minify;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_debug = htmllibmanager_debug;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_gzip = htmllibmanager_gzip;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_max_data_uri_size = htmllibmanager_max_data_uri_size;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_maxage = htmllibmanager_maxage;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_force_cq_url_info = htmllibmanager_force_cq_url_info;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_defaultthemename = htmllibmanager_defaultthemename;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_defaultuserthemename = htmllibmanager_defaultuserthemename;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_clientmanager = htmllibmanager_clientmanager;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_path_list = htmllibmanager_path_list;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_excluded_path_list = htmllibmanager_excluded_path_list;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_processor_js = htmllibmanager_processor_js;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_processor_css = htmllibmanager_processor_css;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_longcache_patterns = htmllibmanager_longcache_patterns;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_longcache_format = htmllibmanager_longcache_format;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_use_file_system_output_cache = htmllibmanager_use_file_system_output_cache;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_file_system_output_cache_location = htmllibmanager_file_system_output_cache_location;
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var->htmllibmanager_disable_replacement = htmllibmanager_disable_replacement;
    return com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_t *com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_create(
    config_node_property_boolean_t *htmllibmanager_timing,
    config_node_property_string_t *htmllibmanager_debug_init_js,
    config_node_property_boolean_t *htmllibmanager_minify,
    config_node_property_boolean_t *htmllibmanager_debug,
    config_node_property_boolean_t *htmllibmanager_gzip,
    config_node_property_integer_t *htmllibmanager_max_data_uri_size,
    config_node_property_integer_t *htmllibmanager_maxage,
    config_node_property_boolean_t *htmllibmanager_force_cq_url_info,
    config_node_property_string_t *htmllibmanager_defaultthemename,
    config_node_property_string_t *htmllibmanager_defaultuserthemename,
    config_node_property_string_t *htmllibmanager_clientmanager,
    config_node_property_array_t *htmllibmanager_path_list,
    config_node_property_array_t *htmllibmanager_excluded_path_list,
    config_node_property_array_t *htmllibmanager_processor_js,
    config_node_property_array_t *htmllibmanager_processor_css,
    config_node_property_array_t *htmllibmanager_longcache_patterns,
    config_node_property_string_t *htmllibmanager_longcache_format,
    config_node_property_boolean_t *htmllibmanager_use_file_system_output_cache,
    config_node_property_string_t *htmllibmanager_file_system_output_cache_location,
    config_node_property_array_t *htmllibmanager_disable_replacement
    ) {
    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_t *result = com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_create_internal (
        htmllibmanager_timing,
        htmllibmanager_debug_init_js,
        htmllibmanager_minify,
        htmllibmanager_debug,
        htmllibmanager_gzip,
        htmllibmanager_max_data_uri_size,
        htmllibmanager_maxage,
        htmllibmanager_force_cq_url_info,
        htmllibmanager_defaultthemename,
        htmllibmanager_defaultuserthemename,
        htmllibmanager_clientmanager,
        htmllibmanager_path_list,
        htmllibmanager_excluded_path_list,
        htmllibmanager_processor_js,
        htmllibmanager_processor_css,
        htmllibmanager_longcache_patterns,
        htmllibmanager_longcache_format,
        htmllibmanager_use_file_system_output_cache,
        htmllibmanager_file_system_output_cache_location,
        htmllibmanager_disable_replacement
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_t *com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties) {
    if(NULL == com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties){
        return ;
    }
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_timing) {
        config_node_property_boolean_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_timing);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_timing = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js) {
        config_node_property_string_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_minify) {
        config_node_property_boolean_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_minify);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_minify = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug) {
        config_node_property_boolean_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_gzip) {
        config_node_property_boolean_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_gzip);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_gzip = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size) {
        config_node_property_integer_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_maxage) {
        config_node_property_integer_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_maxage);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_maxage = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info) {
        config_node_property_boolean_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename) {
        config_node_property_string_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename) {
        config_node_property_string_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager) {
        config_node_property_string_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_path_list) {
        config_node_property_array_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_path_list);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_path_list = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_excluded_path_list) {
        config_node_property_array_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_excluded_path_list);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_excluded_path_list = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_js) {
        config_node_property_array_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_js);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_js = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_css) {
        config_node_property_array_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_css);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_css = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_patterns) {
        config_node_property_array_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_patterns);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_patterns = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_format) {
        config_node_property_string_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_format);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_format = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_use_file_system_output_cache) {
        config_node_property_boolean_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_use_file_system_output_cache);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_use_file_system_output_cache = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_file_system_output_cache_location) {
        config_node_property_string_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_file_system_output_cache_location);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_file_system_output_cache_location = NULL;
    }
    if (com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_disable_replacement) {
        config_node_property_array_free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_disable_replacement);
        com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_disable_replacement = NULL;
    }
    free(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties);
}

cJSON *com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_t *com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_timing
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_timing) {
    cJSON *htmllibmanager_timing_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_timing);
    if(htmllibmanager_timing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.timing", htmllibmanager_timing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js) {
    cJSON *htmllibmanager_debug_init_js_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js);
    if(htmllibmanager_debug_init_js_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.debug.init.js", htmllibmanager_debug_init_js_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_minify
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_minify) {
    cJSON *htmllibmanager_minify_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_minify);
    if(htmllibmanager_minify_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.minify", htmllibmanager_minify_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug) {
    cJSON *htmllibmanager_debug_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug);
    if(htmllibmanager_debug_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.debug", htmllibmanager_debug_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_gzip
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_gzip) {
    cJSON *htmllibmanager_gzip_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_gzip);
    if(htmllibmanager_gzip_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.gzip", htmllibmanager_gzip_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size) {
    cJSON *htmllibmanager_max_data_uri_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size);
    if(htmllibmanager_max_data_uri_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.maxDataUriSize", htmllibmanager_max_data_uri_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_maxage
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_maxage) {
    cJSON *htmllibmanager_maxage_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_maxage);
    if(htmllibmanager_maxage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.maxage", htmllibmanager_maxage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info) {
    cJSON *htmllibmanager_force_cq_url_info_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info);
    if(htmllibmanager_force_cq_url_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.forceCQUrlInfo", htmllibmanager_force_cq_url_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename) {
    cJSON *htmllibmanager_defaultthemename_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename);
    if(htmllibmanager_defaultthemename_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.defaultthemename", htmllibmanager_defaultthemename_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename) {
    cJSON *htmllibmanager_defaultuserthemename_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename);
    if(htmllibmanager_defaultuserthemename_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.defaultuserthemename", htmllibmanager_defaultuserthemename_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager) {
    cJSON *htmllibmanager_clientmanager_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager);
    if(htmllibmanager_clientmanager_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.clientmanager", htmllibmanager_clientmanager_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_path_list
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_path_list) {
    cJSON *htmllibmanager_path_list_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_path_list);
    if(htmllibmanager_path_list_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.path.list", htmllibmanager_path_list_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_excluded_path_list
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_excluded_path_list) {
    cJSON *htmllibmanager_excluded_path_list_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_excluded_path_list);
    if(htmllibmanager_excluded_path_list_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.excluded.path.list", htmllibmanager_excluded_path_list_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_js
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_js) {
    cJSON *htmllibmanager_processor_js_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_js);
    if(htmllibmanager_processor_js_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.processor.js", htmllibmanager_processor_js_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_css
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_css) {
    cJSON *htmllibmanager_processor_css_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_css);
    if(htmllibmanager_processor_css_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.processor.css", htmllibmanager_processor_css_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_patterns
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_patterns) {
    cJSON *htmllibmanager_longcache_patterns_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_patterns);
    if(htmllibmanager_longcache_patterns_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.longcache.patterns", htmllibmanager_longcache_patterns_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_format
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_format) {
    cJSON *htmllibmanager_longcache_format_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_format);
    if(htmllibmanager_longcache_format_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.longcache.format", htmllibmanager_longcache_format_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_use_file_system_output_cache
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_use_file_system_output_cache) {
    cJSON *htmllibmanager_use_file_system_output_cache_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_use_file_system_output_cache);
    if(htmllibmanager_use_file_system_output_cache_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.useFileSystemOutputCache", htmllibmanager_use_file_system_output_cache_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_file_system_output_cache_location
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_file_system_output_cache_location) {
    cJSON *htmllibmanager_file_system_output_cache_location_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_file_system_output_cache_location);
    if(htmllibmanager_file_system_output_cache_location_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.fileSystemOutputCacheLocation", htmllibmanager_file_system_output_cache_location_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_disable_replacement
    if(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_disable_replacement) {
    cJSON *htmllibmanager_disable_replacement_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_disable_replacement);
    if(htmllibmanager_disable_replacement_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmllibmanager.disable.replacement", htmllibmanager_disable_replacement_local_JSON);
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

com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_t *com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_parseFromJSON(cJSON *com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON){

    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_t *com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_timing
    config_node_property_boolean_t *htmllibmanager_timing_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js
    config_node_property_string_t *htmllibmanager_debug_init_js_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_minify
    config_node_property_boolean_t *htmllibmanager_minify_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug
    config_node_property_boolean_t *htmllibmanager_debug_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_gzip
    config_node_property_boolean_t *htmllibmanager_gzip_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size
    config_node_property_integer_t *htmllibmanager_max_data_uri_size_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_maxage
    config_node_property_integer_t *htmllibmanager_maxage_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info
    config_node_property_boolean_t *htmllibmanager_force_cq_url_info_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename
    config_node_property_string_t *htmllibmanager_defaultthemename_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename
    config_node_property_string_t *htmllibmanager_defaultuserthemename_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager
    config_node_property_string_t *htmllibmanager_clientmanager_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_path_list
    config_node_property_array_t *htmllibmanager_path_list_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_excluded_path_list
    config_node_property_array_t *htmllibmanager_excluded_path_list_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_js
    config_node_property_array_t *htmllibmanager_processor_js_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_css
    config_node_property_array_t *htmllibmanager_processor_css_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_patterns
    config_node_property_array_t *htmllibmanager_longcache_patterns_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_format
    config_node_property_string_t *htmllibmanager_longcache_format_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_use_file_system_output_cache
    config_node_property_boolean_t *htmllibmanager_use_file_system_output_cache_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_file_system_output_cache_location
    config_node_property_string_t *htmllibmanager_file_system_output_cache_location_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_disable_replacement
    config_node_property_array_t *htmllibmanager_disable_replacement_local_nonprim = NULL;

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_timing
    cJSON *htmllibmanager_timing = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.timing");
    if (cJSON_IsNull(htmllibmanager_timing)) {
        htmllibmanager_timing = NULL;
    }
    if (htmllibmanager_timing) { 
    htmllibmanager_timing_local_nonprim = config_node_property_boolean_parseFromJSON(htmllibmanager_timing); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug_init_js
    cJSON *htmllibmanager_debug_init_js = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.debug.init.js");
    if (cJSON_IsNull(htmllibmanager_debug_init_js)) {
        htmllibmanager_debug_init_js = NULL;
    }
    if (htmllibmanager_debug_init_js) { 
    htmllibmanager_debug_init_js_local_nonprim = config_node_property_string_parseFromJSON(htmllibmanager_debug_init_js); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_minify
    cJSON *htmllibmanager_minify = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.minify");
    if (cJSON_IsNull(htmllibmanager_minify)) {
        htmllibmanager_minify = NULL;
    }
    if (htmllibmanager_minify) { 
    htmllibmanager_minify_local_nonprim = config_node_property_boolean_parseFromJSON(htmllibmanager_minify); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_debug
    cJSON *htmllibmanager_debug = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.debug");
    if (cJSON_IsNull(htmllibmanager_debug)) {
        htmllibmanager_debug = NULL;
    }
    if (htmllibmanager_debug) { 
    htmllibmanager_debug_local_nonprim = config_node_property_boolean_parseFromJSON(htmllibmanager_debug); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_gzip
    cJSON *htmllibmanager_gzip = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.gzip");
    if (cJSON_IsNull(htmllibmanager_gzip)) {
        htmllibmanager_gzip = NULL;
    }
    if (htmllibmanager_gzip) { 
    htmllibmanager_gzip_local_nonprim = config_node_property_boolean_parseFromJSON(htmllibmanager_gzip); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_max_data_uri_size
    cJSON *htmllibmanager_max_data_uri_size = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.maxDataUriSize");
    if (cJSON_IsNull(htmllibmanager_max_data_uri_size)) {
        htmllibmanager_max_data_uri_size = NULL;
    }
    if (htmllibmanager_max_data_uri_size) { 
    htmllibmanager_max_data_uri_size_local_nonprim = config_node_property_integer_parseFromJSON(htmllibmanager_max_data_uri_size); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_maxage
    cJSON *htmllibmanager_maxage = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.maxage");
    if (cJSON_IsNull(htmllibmanager_maxage)) {
        htmllibmanager_maxage = NULL;
    }
    if (htmllibmanager_maxage) { 
    htmllibmanager_maxage_local_nonprim = config_node_property_integer_parseFromJSON(htmllibmanager_maxage); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_force_cq_url_info
    cJSON *htmllibmanager_force_cq_url_info = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.forceCQUrlInfo");
    if (cJSON_IsNull(htmllibmanager_force_cq_url_info)) {
        htmllibmanager_force_cq_url_info = NULL;
    }
    if (htmllibmanager_force_cq_url_info) { 
    htmllibmanager_force_cq_url_info_local_nonprim = config_node_property_boolean_parseFromJSON(htmllibmanager_force_cq_url_info); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultthemename
    cJSON *htmllibmanager_defaultthemename = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.defaultthemename");
    if (cJSON_IsNull(htmllibmanager_defaultthemename)) {
        htmllibmanager_defaultthemename = NULL;
    }
    if (htmllibmanager_defaultthemename) { 
    htmllibmanager_defaultthemename_local_nonprim = config_node_property_string_parseFromJSON(htmllibmanager_defaultthemename); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_defaultuserthemename
    cJSON *htmllibmanager_defaultuserthemename = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.defaultuserthemename");
    if (cJSON_IsNull(htmllibmanager_defaultuserthemename)) {
        htmllibmanager_defaultuserthemename = NULL;
    }
    if (htmllibmanager_defaultuserthemename) { 
    htmllibmanager_defaultuserthemename_local_nonprim = config_node_property_string_parseFromJSON(htmllibmanager_defaultuserthemename); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_clientmanager
    cJSON *htmllibmanager_clientmanager = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.clientmanager");
    if (cJSON_IsNull(htmllibmanager_clientmanager)) {
        htmllibmanager_clientmanager = NULL;
    }
    if (htmllibmanager_clientmanager) { 
    htmllibmanager_clientmanager_local_nonprim = config_node_property_string_parseFromJSON(htmllibmanager_clientmanager); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_path_list
    cJSON *htmllibmanager_path_list = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.path.list");
    if (cJSON_IsNull(htmllibmanager_path_list)) {
        htmllibmanager_path_list = NULL;
    }
    if (htmllibmanager_path_list) { 
    htmllibmanager_path_list_local_nonprim = config_node_property_array_parseFromJSON(htmllibmanager_path_list); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_excluded_path_list
    cJSON *htmllibmanager_excluded_path_list = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.excluded.path.list");
    if (cJSON_IsNull(htmllibmanager_excluded_path_list)) {
        htmllibmanager_excluded_path_list = NULL;
    }
    if (htmllibmanager_excluded_path_list) { 
    htmllibmanager_excluded_path_list_local_nonprim = config_node_property_array_parseFromJSON(htmllibmanager_excluded_path_list); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_js
    cJSON *htmllibmanager_processor_js = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.processor.js");
    if (cJSON_IsNull(htmllibmanager_processor_js)) {
        htmllibmanager_processor_js = NULL;
    }
    if (htmllibmanager_processor_js) { 
    htmllibmanager_processor_js_local_nonprim = config_node_property_array_parseFromJSON(htmllibmanager_processor_js); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_processor_css
    cJSON *htmllibmanager_processor_css = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.processor.css");
    if (cJSON_IsNull(htmllibmanager_processor_css)) {
        htmllibmanager_processor_css = NULL;
    }
    if (htmllibmanager_processor_css) { 
    htmllibmanager_processor_css_local_nonprim = config_node_property_array_parseFromJSON(htmllibmanager_processor_css); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_patterns
    cJSON *htmllibmanager_longcache_patterns = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.longcache.patterns");
    if (cJSON_IsNull(htmllibmanager_longcache_patterns)) {
        htmllibmanager_longcache_patterns = NULL;
    }
    if (htmllibmanager_longcache_patterns) { 
    htmllibmanager_longcache_patterns_local_nonprim = config_node_property_array_parseFromJSON(htmllibmanager_longcache_patterns); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_longcache_format
    cJSON *htmllibmanager_longcache_format = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.longcache.format");
    if (cJSON_IsNull(htmllibmanager_longcache_format)) {
        htmllibmanager_longcache_format = NULL;
    }
    if (htmllibmanager_longcache_format) { 
    htmllibmanager_longcache_format_local_nonprim = config_node_property_string_parseFromJSON(htmllibmanager_longcache_format); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_use_file_system_output_cache
    cJSON *htmllibmanager_use_file_system_output_cache = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.useFileSystemOutputCache");
    if (cJSON_IsNull(htmllibmanager_use_file_system_output_cache)) {
        htmllibmanager_use_file_system_output_cache = NULL;
    }
    if (htmllibmanager_use_file_system_output_cache) { 
    htmllibmanager_use_file_system_output_cache_local_nonprim = config_node_property_boolean_parseFromJSON(htmllibmanager_use_file_system_output_cache); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_file_system_output_cache_location
    cJSON *htmllibmanager_file_system_output_cache_location = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.fileSystemOutputCacheLocation");
    if (cJSON_IsNull(htmllibmanager_file_system_output_cache_location)) {
        htmllibmanager_file_system_output_cache_location = NULL;
    }
    if (htmllibmanager_file_system_output_cache_location) { 
    htmllibmanager_file_system_output_cache_location_local_nonprim = config_node_property_string_parseFromJSON(htmllibmanager_file_system_output_cache_location); //nonprimitive
    }

    // com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties->htmllibmanager_disable_replacement
    cJSON *htmllibmanager_disable_replacement = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_propertiesJSON, "htmllibmanager.disable.replacement");
    if (cJSON_IsNull(htmllibmanager_disable_replacement)) {
        htmllibmanager_disable_replacement = NULL;
    }
    if (htmllibmanager_disable_replacement) { 
    htmllibmanager_disable_replacement_local_nonprim = config_node_property_array_parseFromJSON(htmllibmanager_disable_replacement); //nonprimitive
    }



    com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var = com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_create_internal (
        htmllibmanager_timing ? htmllibmanager_timing_local_nonprim : NULL,
        htmllibmanager_debug_init_js ? htmllibmanager_debug_init_js_local_nonprim : NULL,
        htmllibmanager_minify ? htmllibmanager_minify_local_nonprim : NULL,
        htmllibmanager_debug ? htmllibmanager_debug_local_nonprim : NULL,
        htmllibmanager_gzip ? htmllibmanager_gzip_local_nonprim : NULL,
        htmllibmanager_max_data_uri_size ? htmllibmanager_max_data_uri_size_local_nonprim : NULL,
        htmllibmanager_maxage ? htmllibmanager_maxage_local_nonprim : NULL,
        htmllibmanager_force_cq_url_info ? htmllibmanager_force_cq_url_info_local_nonprim : NULL,
        htmllibmanager_defaultthemename ? htmllibmanager_defaultthemename_local_nonprim : NULL,
        htmllibmanager_defaultuserthemename ? htmllibmanager_defaultuserthemename_local_nonprim : NULL,
        htmllibmanager_clientmanager ? htmllibmanager_clientmanager_local_nonprim : NULL,
        htmllibmanager_path_list ? htmllibmanager_path_list_local_nonprim : NULL,
        htmllibmanager_excluded_path_list ? htmllibmanager_excluded_path_list_local_nonprim : NULL,
        htmllibmanager_processor_js ? htmllibmanager_processor_js_local_nonprim : NULL,
        htmllibmanager_processor_css ? htmllibmanager_processor_css_local_nonprim : NULL,
        htmllibmanager_longcache_patterns ? htmllibmanager_longcache_patterns_local_nonprim : NULL,
        htmllibmanager_longcache_format ? htmllibmanager_longcache_format_local_nonprim : NULL,
        htmllibmanager_use_file_system_output_cache ? htmllibmanager_use_file_system_output_cache_local_nonprim : NULL,
        htmllibmanager_file_system_output_cache_location ? htmllibmanager_file_system_output_cache_location_local_nonprim : NULL,
        htmllibmanager_disable_replacement ? htmllibmanager_disable_replacement_local_nonprim : NULL
        );

    if (!com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties_local_var;
end:
    if (htmllibmanager_timing_local_nonprim) {
        config_node_property_boolean_free(htmllibmanager_timing_local_nonprim);
        htmllibmanager_timing_local_nonprim = NULL;
    }
    if (htmllibmanager_debug_init_js_local_nonprim) {
        config_node_property_string_free(htmllibmanager_debug_init_js_local_nonprim);
        htmllibmanager_debug_init_js_local_nonprim = NULL;
    }
    if (htmllibmanager_minify_local_nonprim) {
        config_node_property_boolean_free(htmllibmanager_minify_local_nonprim);
        htmllibmanager_minify_local_nonprim = NULL;
    }
    if (htmllibmanager_debug_local_nonprim) {
        config_node_property_boolean_free(htmllibmanager_debug_local_nonprim);
        htmllibmanager_debug_local_nonprim = NULL;
    }
    if (htmllibmanager_gzip_local_nonprim) {
        config_node_property_boolean_free(htmllibmanager_gzip_local_nonprim);
        htmllibmanager_gzip_local_nonprim = NULL;
    }
    if (htmllibmanager_max_data_uri_size_local_nonprim) {
        config_node_property_integer_free(htmllibmanager_max_data_uri_size_local_nonprim);
        htmllibmanager_max_data_uri_size_local_nonprim = NULL;
    }
    if (htmllibmanager_maxage_local_nonprim) {
        config_node_property_integer_free(htmllibmanager_maxage_local_nonprim);
        htmllibmanager_maxage_local_nonprim = NULL;
    }
    if (htmllibmanager_force_cq_url_info_local_nonprim) {
        config_node_property_boolean_free(htmllibmanager_force_cq_url_info_local_nonprim);
        htmllibmanager_force_cq_url_info_local_nonprim = NULL;
    }
    if (htmllibmanager_defaultthemename_local_nonprim) {
        config_node_property_string_free(htmllibmanager_defaultthemename_local_nonprim);
        htmllibmanager_defaultthemename_local_nonprim = NULL;
    }
    if (htmllibmanager_defaultuserthemename_local_nonprim) {
        config_node_property_string_free(htmllibmanager_defaultuserthemename_local_nonprim);
        htmllibmanager_defaultuserthemename_local_nonprim = NULL;
    }
    if (htmllibmanager_clientmanager_local_nonprim) {
        config_node_property_string_free(htmllibmanager_clientmanager_local_nonprim);
        htmllibmanager_clientmanager_local_nonprim = NULL;
    }
    if (htmllibmanager_path_list_local_nonprim) {
        config_node_property_array_free(htmllibmanager_path_list_local_nonprim);
        htmllibmanager_path_list_local_nonprim = NULL;
    }
    if (htmllibmanager_excluded_path_list_local_nonprim) {
        config_node_property_array_free(htmllibmanager_excluded_path_list_local_nonprim);
        htmllibmanager_excluded_path_list_local_nonprim = NULL;
    }
    if (htmllibmanager_processor_js_local_nonprim) {
        config_node_property_array_free(htmllibmanager_processor_js_local_nonprim);
        htmllibmanager_processor_js_local_nonprim = NULL;
    }
    if (htmllibmanager_processor_css_local_nonprim) {
        config_node_property_array_free(htmllibmanager_processor_css_local_nonprim);
        htmllibmanager_processor_css_local_nonprim = NULL;
    }
    if (htmllibmanager_longcache_patterns_local_nonprim) {
        config_node_property_array_free(htmllibmanager_longcache_patterns_local_nonprim);
        htmllibmanager_longcache_patterns_local_nonprim = NULL;
    }
    if (htmllibmanager_longcache_format_local_nonprim) {
        config_node_property_string_free(htmllibmanager_longcache_format_local_nonprim);
        htmllibmanager_longcache_format_local_nonprim = NULL;
    }
    if (htmllibmanager_use_file_system_output_cache_local_nonprim) {
        config_node_property_boolean_free(htmllibmanager_use_file_system_output_cache_local_nonprim);
        htmllibmanager_use_file_system_output_cache_local_nonprim = NULL;
    }
    if (htmllibmanager_file_system_output_cache_location_local_nonprim) {
        config_node_property_string_free(htmllibmanager_file_system_output_cache_location_local_nonprim);
        htmllibmanager_file_system_output_cache_location_local_nonprim = NULL;
    }
    if (htmllibmanager_disable_replacement_local_nonprim) {
        config_node_property_array_free(htmllibmanager_disable_replacement_local_nonprim);
        htmllibmanager_disable_replacement_local_nonprim = NULL;
    }
    return NULL;

}
