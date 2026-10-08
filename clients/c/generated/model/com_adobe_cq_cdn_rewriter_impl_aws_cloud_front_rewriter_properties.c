#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties.h"



static com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_create_internal(
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *keypair_id,
    config_node_property_string_t *keypair_alias,
    config_node_property_array_t *cdnrewriter_attributes,
    config_node_property_string_t *cdn_rewriter_distribution_domain
    ) {
    com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var = malloc(sizeof(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t));
    if (!com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var, 0, sizeof(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t));
    com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var->_library_owned = 1;
    com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var->service_ranking = service_ranking;
    com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var->keypair_id = keypair_id;
    com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var->keypair_alias = keypair_alias;
    com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var->cdnrewriter_attributes = cdnrewriter_attributes;
    com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var->cdn_rewriter_distribution_domain = cdn_rewriter_distribution_domain;
    return com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_create(
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *keypair_id,
    config_node_property_string_t *keypair_alias,
    config_node_property_array_t *cdnrewriter_attributes,
    config_node_property_string_t *cdn_rewriter_distribution_domain
    ) {
    com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t *result = com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_create_internal (
        service_ranking,
        keypair_id,
        keypair_alias,
        cdnrewriter_attributes,
        cdn_rewriter_distribution_domain
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_free(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties) {
    if(NULL == com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties){
        return ;
    }
    if(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->service_ranking) {
        config_node_property_integer_free(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->service_ranking);
        com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->service_ranking = NULL;
    }
    if (com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_id) {
        config_node_property_string_free(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_id);
        com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_id = NULL;
    }
    if (com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_alias) {
        config_node_property_string_free(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_alias);
        com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_alias = NULL;
    }
    if (com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdnrewriter_attributes) {
        config_node_property_array_free(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdnrewriter_attributes);
        com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdnrewriter_attributes = NULL;
    }
    if (com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdn_rewriter_distribution_domain) {
        config_node_property_string_free(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdn_rewriter_distribution_domain);
        com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdn_rewriter_distribution_domain = NULL;
    }
    free(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties);
}

cJSON *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_convertToJSON(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->service_ranking
    if(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_id
    if(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_id) {
    cJSON *keypair_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_id);
    if(keypair_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "keypair.id", keypair_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_alias
    if(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_alias) {
    cJSON *keypair_alias_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_alias);
    if(keypair_alias_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "keypair.alias", keypair_alias_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdnrewriter_attributes
    if(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdnrewriter_attributes) {
    cJSON *cdnrewriter_attributes_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdnrewriter_attributes);
    if(cdnrewriter_attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cdnrewriter.attributes", cdnrewriter_attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdn_rewriter_distribution_domain
    if(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdn_rewriter_distribution_domain) {
    cJSON *cdn_rewriter_distribution_domain_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdn_rewriter_distribution_domain);
    if(cdn_rewriter_distribution_domain_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cdn.rewriter.distribution.domain", cdn_rewriter_distribution_domain_local_JSON);
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

com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_parseFromJSON(cJSON *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propertiesJSON){

    com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_id
    config_node_property_string_t *keypair_id_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_alias
    config_node_property_string_t *keypair_alias_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdnrewriter_attributes
    config_node_property_array_t *cdnrewriter_attributes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdn_rewriter_distribution_domain
    config_node_property_string_t *cdn_rewriter_distribution_domain_local_nonprim = NULL;

    // com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }

    // com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_id
    cJSON *keypair_id = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propertiesJSON, "keypair.id");
    if (cJSON_IsNull(keypair_id)) {
        keypair_id = NULL;
    }
    if (keypair_id) { 
    keypair_id_local_nonprim = config_node_property_string_parseFromJSON(keypair_id); //nonprimitive
    }

    // com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->keypair_alias
    cJSON *keypair_alias = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propertiesJSON, "keypair.alias");
    if (cJSON_IsNull(keypair_alias)) {
        keypair_alias = NULL;
    }
    if (keypair_alias) { 
    keypair_alias_local_nonprim = config_node_property_string_parseFromJSON(keypair_alias); //nonprimitive
    }

    // com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdnrewriter_attributes
    cJSON *cdnrewriter_attributes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propertiesJSON, "cdnrewriter.attributes");
    if (cJSON_IsNull(cdnrewriter_attributes)) {
        cdnrewriter_attributes = NULL;
    }
    if (cdnrewriter_attributes) { 
    cdnrewriter_attributes_local_nonprim = config_node_property_array_parseFromJSON(cdnrewriter_attributes); //nonprimitive
    }

    // com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties->cdn_rewriter_distribution_domain
    cJSON *cdn_rewriter_distribution_domain = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propertiesJSON, "cdn.rewriter.distribution.domain");
    if (cJSON_IsNull(cdn_rewriter_distribution_domain)) {
        cdn_rewriter_distribution_domain = NULL;
    }
    if (cdn_rewriter_distribution_domain) { 
    cdn_rewriter_distribution_domain_local_nonprim = config_node_property_string_parseFromJSON(cdn_rewriter_distribution_domain); //nonprimitive
    }



    com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var = com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_create_internal (
        service_ranking ? service_ranking_local_nonprim : NULL,
        keypair_id ? keypair_id_local_nonprim : NULL,
        keypair_alias ? keypair_alias_local_nonprim : NULL,
        cdnrewriter_attributes ? cdnrewriter_attributes_local_nonprim : NULL,
        cdn_rewriter_distribution_domain ? cdn_rewriter_distribution_domain_local_nonprim : NULL
        );

    if (!com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_local_var;
end:
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    if (keypair_id_local_nonprim) {
        config_node_property_string_free(keypair_id_local_nonprim);
        keypair_id_local_nonprim = NULL;
    }
    if (keypair_alias_local_nonprim) {
        config_node_property_string_free(keypair_alias_local_nonprim);
        keypair_alias_local_nonprim = NULL;
    }
    if (cdnrewriter_attributes_local_nonprim) {
        config_node_property_array_free(cdnrewriter_attributes_local_nonprim);
        cdnrewriter_attributes_local_nonprim = NULL;
    }
    if (cdn_rewriter_distribution_domain_local_nonprim) {
        config_node_property_string_free(cdn_rewriter_distribution_domain_local_nonprim);
        cdn_rewriter_distribution_domain_local_nonprim = NULL;
    }
    return NULL;

}
