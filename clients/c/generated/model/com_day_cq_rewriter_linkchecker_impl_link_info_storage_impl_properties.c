#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties.h"



static com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_create_internal(
    config_node_property_integer_t *service_max_links_per_host,
    config_node_property_boolean_t *service_save_external_link_references
    ) {
    com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_local_var = malloc(sizeof(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_t));
    if (!com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_local_var, 0, sizeof(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_t));
    com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_local_var->_library_owned = 1;
    com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_local_var->service_max_links_per_host = service_max_links_per_host;
    com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_local_var->service_save_external_link_references = service_save_external_link_references;
    return com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_create(
    config_node_property_integer_t *service_max_links_per_host,
    config_node_property_boolean_t *service_save_external_link_references
    ) {
    com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_t *result = com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_create_internal (
        service_max_links_per_host,
        service_save_external_link_references
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_free(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties) {
    if(NULL == com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties){
        return ;
    }
    if(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_max_links_per_host) {
        config_node_property_integer_free(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_max_links_per_host);
        com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_max_links_per_host = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_save_external_link_references) {
        config_node_property_boolean_free(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_save_external_link_references);
        com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_save_external_link_references = NULL;
    }
    free(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties);
}

cJSON *com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_max_links_per_host
    if(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_max_links_per_host) {
    cJSON *service_max_links_per_host_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_max_links_per_host);
    if(service_max_links_per_host_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.max_links_per_host", service_max_links_per_host_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_save_external_link_references
    if(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_save_external_link_references) {
    cJSON *service_save_external_link_references_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_save_external_link_references);
    if(service_save_external_link_references_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.save_external_link_references", service_save_external_link_references_local_JSON);
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

com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_parseFromJSON(cJSON *com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_propertiesJSON){

    com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_max_links_per_host
    config_node_property_integer_t *service_max_links_per_host_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_save_external_link_references
    config_node_property_boolean_t *service_save_external_link_references_local_nonprim = NULL;

    // com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_max_links_per_host
    cJSON *service_max_links_per_host = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_propertiesJSON, "service.max_links_per_host");
    if (cJSON_IsNull(service_max_links_per_host)) {
        service_max_links_per_host = NULL;
    }
    if (service_max_links_per_host) { 
    service_max_links_per_host_local_nonprim = config_node_property_integer_parseFromJSON(service_max_links_per_host); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties->service_save_external_link_references
    cJSON *service_save_external_link_references = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_propertiesJSON, "service.save_external_link_references");
    if (cJSON_IsNull(service_save_external_link_references)) {
        service_save_external_link_references = NULL;
    }
    if (service_save_external_link_references) { 
    service_save_external_link_references_local_nonprim = config_node_property_boolean_parseFromJSON(service_save_external_link_references); //nonprimitive
    }



    com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_local_var = com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_create_internal (
        service_max_links_per_host ? service_max_links_per_host_local_nonprim : NULL,
        service_save_external_link_references ? service_save_external_link_references_local_nonprim : NULL
        );

    if (!com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties_local_var;
end:
    if (service_max_links_per_host_local_nonprim) {
        config_node_property_integer_free(service_max_links_per_host_local_nonprim);
        service_max_links_per_host_local_nonprim = NULL;
    }
    if (service_save_external_link_references_local_nonprim) {
        config_node_property_boolean_free(service_save_external_link_references_local_nonprim);
        service_save_external_link_references_local_nonprim = NULL;
    }
    return NULL;

}
