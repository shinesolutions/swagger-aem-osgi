#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties.h"



static com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_create_internal(
    config_node_property_string_t *cdn_config_distribution_domain,
    config_node_property_boolean_t *cdn_config_enable_rewriting,
    config_node_property_array_t *cdn_config_path_prefixes,
    config_node_property_integer_t *cdn_config_cdnttl,
    config_node_property_string_t *cdn_config_application_protocol
    ) {
    com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var = malloc(sizeof(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t));
    if (!com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var, 0, sizeof(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t));
    com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var->cdn_config_distribution_domain = cdn_config_distribution_domain;
    com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var->cdn_config_enable_rewriting = cdn_config_enable_rewriting;
    com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var->cdn_config_path_prefixes = cdn_config_path_prefixes;
    com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var->cdn_config_cdnttl = cdn_config_cdnttl;
    com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var->cdn_config_application_protocol = cdn_config_application_protocol;
    return com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_create(
    config_node_property_string_t *cdn_config_distribution_domain,
    config_node_property_boolean_t *cdn_config_enable_rewriting,
    config_node_property_array_t *cdn_config_path_prefixes,
    config_node_property_integer_t *cdn_config_cdnttl,
    config_node_property_string_t *cdn_config_application_protocol
    ) {
    com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t *result = com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_create_internal (
        cdn_config_distribution_domain,
        cdn_config_enable_rewriting,
        cdn_config_path_prefixes,
        cdn_config_cdnttl,
        cdn_config_application_protocol
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_free(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties) {
    if(NULL == com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties){
        return ;
    }
    if(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_distribution_domain) {
        config_node_property_string_free(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_distribution_domain);
        com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_distribution_domain = NULL;
    }
    if (com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_enable_rewriting) {
        config_node_property_boolean_free(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_enable_rewriting);
        com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_enable_rewriting = NULL;
    }
    if (com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_path_prefixes) {
        config_node_property_array_free(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_path_prefixes);
        com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_path_prefixes = NULL;
    }
    if (com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_cdnttl) {
        config_node_property_integer_free(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_cdnttl);
        com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_cdnttl = NULL;
    }
    if (com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_application_protocol) {
        config_node_property_string_free(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_application_protocol);
        com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_application_protocol = NULL;
    }
    free(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties);
}

cJSON *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_convertToJSON(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_distribution_domain
    if(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_distribution_domain) {
    cJSON *cdn_config_distribution_domain_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_distribution_domain);
    if(cdn_config_distribution_domain_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cdn.config.distribution.domain", cdn_config_distribution_domain_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_enable_rewriting
    if(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_enable_rewriting) {
    cJSON *cdn_config_enable_rewriting_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_enable_rewriting);
    if(cdn_config_enable_rewriting_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cdn.config.enable.rewriting", cdn_config_enable_rewriting_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_path_prefixes
    if(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_path_prefixes) {
    cJSON *cdn_config_path_prefixes_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_path_prefixes);
    if(cdn_config_path_prefixes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cdn.config.path.prefixes", cdn_config_path_prefixes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_cdnttl
    if(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_cdnttl) {
    cJSON *cdn_config_cdnttl_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_cdnttl);
    if(cdn_config_cdnttl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cdn.config.cdnttl", cdn_config_cdnttl_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_application_protocol
    if(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_application_protocol) {
    cJSON *cdn_config_application_protocol_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_application_protocol);
    if(cdn_config_application_protocol_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cdn.config.application.protocol", cdn_config_application_protocol_local_JSON);
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

com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_parseFromJSON(cJSON *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_propertiesJSON){

    com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_distribution_domain
    config_node_property_string_t *cdn_config_distribution_domain_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_enable_rewriting
    config_node_property_boolean_t *cdn_config_enable_rewriting_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_path_prefixes
    config_node_property_array_t *cdn_config_path_prefixes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_cdnttl
    config_node_property_integer_t *cdn_config_cdnttl_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_application_protocol
    config_node_property_string_t *cdn_config_application_protocol_local_nonprim = NULL;

    // com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_distribution_domain
    cJSON *cdn_config_distribution_domain = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_propertiesJSON, "cdn.config.distribution.domain");
    if (cJSON_IsNull(cdn_config_distribution_domain)) {
        cdn_config_distribution_domain = NULL;
    }
    if (cdn_config_distribution_domain) { 
    cdn_config_distribution_domain_local_nonprim = config_node_property_string_parseFromJSON(cdn_config_distribution_domain); //nonprimitive
    }

    // com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_enable_rewriting
    cJSON *cdn_config_enable_rewriting = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_propertiesJSON, "cdn.config.enable.rewriting");
    if (cJSON_IsNull(cdn_config_enable_rewriting)) {
        cdn_config_enable_rewriting = NULL;
    }
    if (cdn_config_enable_rewriting) { 
    cdn_config_enable_rewriting_local_nonprim = config_node_property_boolean_parseFromJSON(cdn_config_enable_rewriting); //nonprimitive
    }

    // com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_path_prefixes
    cJSON *cdn_config_path_prefixes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_propertiesJSON, "cdn.config.path.prefixes");
    if (cJSON_IsNull(cdn_config_path_prefixes)) {
        cdn_config_path_prefixes = NULL;
    }
    if (cdn_config_path_prefixes) { 
    cdn_config_path_prefixes_local_nonprim = config_node_property_array_parseFromJSON(cdn_config_path_prefixes); //nonprimitive
    }

    // com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_cdnttl
    cJSON *cdn_config_cdnttl = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_propertiesJSON, "cdn.config.cdnttl");
    if (cJSON_IsNull(cdn_config_cdnttl)) {
        cdn_config_cdnttl = NULL;
    }
    if (cdn_config_cdnttl) { 
    cdn_config_cdnttl_local_nonprim = config_node_property_integer_parseFromJSON(cdn_config_cdnttl); //nonprimitive
    }

    // com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties->cdn_config_application_protocol
    cJSON *cdn_config_application_protocol = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_propertiesJSON, "cdn.config.application.protocol");
    if (cJSON_IsNull(cdn_config_application_protocol)) {
        cdn_config_application_protocol = NULL;
    }
    if (cdn_config_application_protocol) { 
    cdn_config_application_protocol_local_nonprim = config_node_property_string_parseFromJSON(cdn_config_application_protocol); //nonprimitive
    }



    com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var = com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_create_internal (
        cdn_config_distribution_domain ? cdn_config_distribution_domain_local_nonprim : NULL,
        cdn_config_enable_rewriting ? cdn_config_enable_rewriting_local_nonprim : NULL,
        cdn_config_path_prefixes ? cdn_config_path_prefixes_local_nonprim : NULL,
        cdn_config_cdnttl ? cdn_config_cdnttl_local_nonprim : NULL,
        cdn_config_application_protocol ? cdn_config_application_protocol_local_nonprim : NULL
        );

    if (!com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_local_var;
end:
    if (cdn_config_distribution_domain_local_nonprim) {
        config_node_property_string_free(cdn_config_distribution_domain_local_nonprim);
        cdn_config_distribution_domain_local_nonprim = NULL;
    }
    if (cdn_config_enable_rewriting_local_nonprim) {
        config_node_property_boolean_free(cdn_config_enable_rewriting_local_nonprim);
        cdn_config_enable_rewriting_local_nonprim = NULL;
    }
    if (cdn_config_path_prefixes_local_nonprim) {
        config_node_property_array_free(cdn_config_path_prefixes_local_nonprim);
        cdn_config_path_prefixes_local_nonprim = NULL;
    }
    if (cdn_config_cdnttl_local_nonprim) {
        config_node_property_integer_free(cdn_config_cdnttl_local_nonprim);
        cdn_config_cdnttl_local_nonprim = NULL;
    }
    if (cdn_config_application_protocol_local_nonprim) {
        config_node_property_string_free(cdn_config_application_protocol_local_nonprim);
        cdn_config_application_protocol_local_nonprim = NULL;
    }
    return NULL;

}
