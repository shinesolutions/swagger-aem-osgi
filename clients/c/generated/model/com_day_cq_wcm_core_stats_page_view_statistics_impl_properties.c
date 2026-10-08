#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_stats_page_view_statistics_impl_properties.h"



static com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_t *com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_create_internal(
    config_node_property_string_t *pageviewstatistics_trackingurl,
    config_node_property_string_t *pageviewstatistics_trackingscript_enabled
    ) {
    com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_t *com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_t));
    if (!com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_local_var, 0, sizeof(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_t));
    com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_local_var->pageviewstatistics_trackingurl = pageviewstatistics_trackingurl;
    com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_local_var->pageviewstatistics_trackingscript_enabled = pageviewstatistics_trackingscript_enabled;
    return com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_t *com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_create(
    config_node_property_string_t *pageviewstatistics_trackingurl,
    config_node_property_string_t *pageviewstatistics_trackingscript_enabled
    ) {
    com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_t *result = com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_create_internal (
        pageviewstatistics_trackingurl,
        pageviewstatistics_trackingscript_enabled
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_free(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_t *com_day_cq_wcm_core_stats_page_view_statistics_impl_properties) {
    if(NULL == com_day_cq_wcm_core_stats_page_view_statistics_impl_properties){
        return ;
    }
    if(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingurl) {
        config_node_property_string_free(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingurl);
        com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingurl = NULL;
    }
    if (com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingscript_enabled) {
        config_node_property_string_free(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingscript_enabled);
        com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingscript_enabled = NULL;
    }
    free(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties);
}

cJSON *com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_convertToJSON(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_t *com_day_cq_wcm_core_stats_page_view_statistics_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingurl
    if(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingurl) {
    cJSON *pageviewstatistics_trackingurl_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingurl);
    if(pageviewstatistics_trackingurl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pageviewstatistics.trackingurl", pageviewstatistics_trackingurl_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingscript_enabled
    if(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingscript_enabled) {
    cJSON *pageviewstatistics_trackingscript_enabled_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingscript_enabled);
    if(pageviewstatistics_trackingscript_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pageviewstatistics.trackingscript.enabled", pageviewstatistics_trackingscript_enabled_local_JSON);
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

com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_t *com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_stats_page_view_statistics_impl_propertiesJSON){

    com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_t *com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingurl
    config_node_property_string_t *pageviewstatistics_trackingurl_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingscript_enabled
    config_node_property_string_t *pageviewstatistics_trackingscript_enabled_local_nonprim = NULL;

    // com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingurl
    cJSON *pageviewstatistics_trackingurl = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_stats_page_view_statistics_impl_propertiesJSON, "pageviewstatistics.trackingurl");
    if (cJSON_IsNull(pageviewstatistics_trackingurl)) {
        pageviewstatistics_trackingurl = NULL;
    }
    if (pageviewstatistics_trackingurl) { 
    pageviewstatistics_trackingurl_local_nonprim = config_node_property_string_parseFromJSON(pageviewstatistics_trackingurl); //nonprimitive
    }

    // com_day_cq_wcm_core_stats_page_view_statistics_impl_properties->pageviewstatistics_trackingscript_enabled
    cJSON *pageviewstatistics_trackingscript_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_stats_page_view_statistics_impl_propertiesJSON, "pageviewstatistics.trackingscript.enabled");
    if (cJSON_IsNull(pageviewstatistics_trackingscript_enabled)) {
        pageviewstatistics_trackingscript_enabled = NULL;
    }
    if (pageviewstatistics_trackingscript_enabled) { 
    pageviewstatistics_trackingscript_enabled_local_nonprim = config_node_property_string_parseFromJSON(pageviewstatistics_trackingscript_enabled); //nonprimitive
    }



    com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_local_var = com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_create_internal (
        pageviewstatistics_trackingurl ? pageviewstatistics_trackingurl_local_nonprim : NULL,
        pageviewstatistics_trackingscript_enabled ? pageviewstatistics_trackingscript_enabled_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_stats_page_view_statistics_impl_properties_local_var;
end:
    if (pageviewstatistics_trackingurl_local_nonprim) {
        config_node_property_string_free(pageviewstatistics_trackingurl_local_nonprim);
        pageviewstatistics_trackingurl_local_nonprim = NULL;
    }
    if (pageviewstatistics_trackingscript_enabled_local_nonprim) {
        config_node_property_string_free(pageviewstatistics_trackingscript_enabled_local_nonprim);
        pageviewstatistics_trackingscript_enabled_local_nonprim = NULL;
    }
    return NULL;

}
