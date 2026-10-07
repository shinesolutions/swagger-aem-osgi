#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties.h"



static com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_create_internal(
    config_node_property_array_t *sling_servlet_resource_types,
    config_node_property_string_t *sling_servlet_methods,
    config_node_property_string_t *sling_servlet_selectors,
    config_node_property_string_t *download_config,
    config_node_property_string_t *view_selector,
    config_node_property_boolean_t *send_email
    ) {
    com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t));
    if (!com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t));
    com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var->sling_servlet_resource_types = sling_servlet_resource_types;
    com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var->sling_servlet_methods = sling_servlet_methods;
    com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var->sling_servlet_selectors = sling_servlet_selectors;
    com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var->download_config = download_config;
    com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var->view_selector = view_selector;
    com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var->send_email = send_email;
    return com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_create(
    config_node_property_array_t *sling_servlet_resource_types,
    config_node_property_string_t *sling_servlet_methods,
    config_node_property_string_t *sling_servlet_selectors,
    config_node_property_string_t *download_config,
    config_node_property_string_t *view_selector,
    config_node_property_boolean_t *send_email
    ) {
    com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t *result = com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_create_internal (
        sling_servlet_resource_types,
        sling_servlet_methods,
        sling_servlet_selectors,
        download_config,
        view_selector,
        send_email
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_free(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties) {
    if(NULL == com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_resource_types) {
        config_node_property_array_free(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_resource_types);
        com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_resource_types = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_methods) {
        config_node_property_string_free(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_methods);
        com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_methods = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_selectors) {
        config_node_property_string_free(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_selectors);
        com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_selectors = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->download_config) {
        config_node_property_string_free(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->download_config);
        com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->download_config = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->view_selector) {
        config_node_property_string_free(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->view_selector);
        com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->view_selector = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->send_email) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->send_email);
        com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->send_email = NULL;
    }
    free(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties);
}

cJSON *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_convertToJSON(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_resource_types
    if(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_resource_types) {
    cJSON *sling_servlet_resource_types_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_resource_types);
    if(sling_servlet_resource_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.resourceTypes", sling_servlet_resource_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_methods
    if(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_methods) {
    cJSON *sling_servlet_methods_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_methods);
    if(sling_servlet_methods_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.methods", sling_servlet_methods_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_selectors
    if(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_selectors) {
    cJSON *sling_servlet_selectors_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_selectors);
    if(sling_servlet_selectors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.selectors", sling_servlet_selectors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->download_config
    if(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->download_config) {
    cJSON *download_config_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->download_config);
    if(download_config_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "download.config", download_config_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->view_selector
    if(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->view_selector) {
    cJSON *view_selector_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->view_selector);
    if(view_selector_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "view.selector", view_selector_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->send_email
    if(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->send_email) {
    cJSON *send_email_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->send_email);
    if(send_email_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "send_email", send_email_local_JSON);
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

com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_propertiesJSON){

    com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_resource_types
    config_node_property_array_t *sling_servlet_resource_types_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_methods
    config_node_property_string_t *sling_servlet_methods_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_selectors
    config_node_property_string_t *sling_servlet_selectors_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->download_config
    config_node_property_string_t *download_config_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->view_selector
    config_node_property_string_t *view_selector_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->send_email
    config_node_property_boolean_t *send_email_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_resource_types
    cJSON *sling_servlet_resource_types = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_propertiesJSON, "sling.servlet.resourceTypes");
    if (cJSON_IsNull(sling_servlet_resource_types)) {
        sling_servlet_resource_types = NULL;
    }
    if (sling_servlet_resource_types) { 
    sling_servlet_resource_types_local_nonprim = config_node_property_array_parseFromJSON(sling_servlet_resource_types); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_methods
    cJSON *sling_servlet_methods = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_propertiesJSON, "sling.servlet.methods");
    if (cJSON_IsNull(sling_servlet_methods)) {
        sling_servlet_methods = NULL;
    }
    if (sling_servlet_methods) { 
    sling_servlet_methods_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_methods); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->sling_servlet_selectors
    cJSON *sling_servlet_selectors = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_propertiesJSON, "sling.servlet.selectors");
    if (cJSON_IsNull(sling_servlet_selectors)) {
        sling_servlet_selectors = NULL;
    }
    if (sling_servlet_selectors) { 
    sling_servlet_selectors_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_selectors); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->download_config
    cJSON *download_config = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_propertiesJSON, "download.config");
    if (cJSON_IsNull(download_config)) {
        download_config = NULL;
    }
    if (download_config) { 
    download_config_local_nonprim = config_node_property_string_parseFromJSON(download_config); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->view_selector
    cJSON *view_selector = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_propertiesJSON, "view.selector");
    if (cJSON_IsNull(view_selector)) {
        view_selector = NULL;
    }
    if (view_selector) { 
    view_selector_local_nonprim = config_node_property_string_parseFromJSON(view_selector); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties->send_email
    cJSON *send_email = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_propertiesJSON, "send_email");
    if (cJSON_IsNull(send_email)) {
        send_email = NULL;
    }
    if (send_email) { 
    send_email_local_nonprim = config_node_property_boolean_parseFromJSON(send_email); //nonprimitive
    }



    com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var = com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_create_internal (
        sling_servlet_resource_types ? sling_servlet_resource_types_local_nonprim : NULL,
        sling_servlet_methods ? sling_servlet_methods_local_nonprim : NULL,
        sling_servlet_selectors ? sling_servlet_selectors_local_nonprim : NULL,
        download_config ? download_config_local_nonprim : NULL,
        view_selector ? view_selector_local_nonprim : NULL,
        send_email ? send_email_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_local_var;
end:
    if (sling_servlet_resource_types_local_nonprim) {
        config_node_property_array_free(sling_servlet_resource_types_local_nonprim);
        sling_servlet_resource_types_local_nonprim = NULL;
    }
    if (sling_servlet_methods_local_nonprim) {
        config_node_property_string_free(sling_servlet_methods_local_nonprim);
        sling_servlet_methods_local_nonprim = NULL;
    }
    if (sling_servlet_selectors_local_nonprim) {
        config_node_property_string_free(sling_servlet_selectors_local_nonprim);
        sling_servlet_selectors_local_nonprim = NULL;
    }
    if (download_config_local_nonprim) {
        config_node_property_string_free(download_config_local_nonprim);
        download_config_local_nonprim = NULL;
    }
    if (view_selector_local_nonprim) {
        config_node_property_string_free(view_selector_local_nonprim);
        view_selector_local_nonprim = NULL;
    }
    if (send_email_local_nonprim) {
        config_node_property_boolean_free(send_email_local_nonprim);
        send_email_local_nonprim = NULL;
    }
    return NULL;

}
