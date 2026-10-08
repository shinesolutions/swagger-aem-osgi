#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties.h"



static com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_t *com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_create_internal(
    config_node_property_string_t *brightedge_url
    ) {
    com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_t *com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_local_var = malloc(sizeof(com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_t));
    if (!com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_local_var, 0, sizeof(com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_t));
    com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_local_var->_library_owned = 1;
    com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_local_var->brightedge_url = brightedge_url;
    return com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_t *com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_create(
    config_node_property_string_t *brightedge_url
    ) {
    com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_t *result = com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_create_internal (
        brightedge_url
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_free(com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_t *com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties) {
    if(NULL == com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties){
        return ;
    }
    if(com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties->brightedge_url) {
        config_node_property_string_free(com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties->brightedge_url);
        com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties->brightedge_url = NULL;
    }
    free(com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties);
}

cJSON *com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_convertToJSON(com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_t *com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties->brightedge_url
    if(com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties->brightedge_url) {
    cJSON *brightedge_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties->brightedge_url);
    if(brightedge_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "brightedge.url", brightedge_url_local_JSON);
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

com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_t *com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_parseFromJSON(cJSON *com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_propertiesJSON){

    com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_t *com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties->brightedge_url
    config_node_property_string_t *brightedge_url_local_nonprim = NULL;

    // com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties->brightedge_url
    cJSON *brightedge_url = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_propertiesJSON, "brightedge.url");
    if (cJSON_IsNull(brightedge_url)) {
        brightedge_url = NULL;
    }
    if (brightedge_url) { 
    brightedge_url_local_nonprim = config_node_property_string_parseFromJSON(brightedge_url); //nonprimitive
    }



    com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_local_var = com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_create_internal (
        brightedge_url ? brightedge_url_local_nonprim : NULL
        );

    if (!com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties_local_var;
end:
    if (brightedge_url_local_nonprim) {
        config_node_property_string_free(brightedge_url_local_nonprim);
        brightedge_url_local_nonprim = NULL;
    }
    return NULL;

}
