#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties.h"



static com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_t *com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_create_internal(
    config_node_property_string_t *default_externalizer_domain
    ) {
    com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_t *com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_t));
    if (!com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_t));
    com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_local_var->default_externalizer_domain = default_externalizer_domain;
    return com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_t *com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_create(
    config_node_property_string_t *default_externalizer_domain
    ) {
    com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_t *result = com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_create_internal (
        default_externalizer_domain
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_free(com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_t *com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties) {
    if(NULL == com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties->default_externalizer_domain) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties->default_externalizer_domain);
        com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties->default_externalizer_domain = NULL;
    }
    free(com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties);
}

cJSON *com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_convertToJSON(com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_t *com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties->default_externalizer_domain
    if(com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties->default_externalizer_domain) {
    cJSON *default_externalizer_domain_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties->default_externalizer_domain);
    if(default_externalizer_domain_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.externalizer.domain", default_externalizer_domain_local_JSON);
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

com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_t *com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_propertiesJSON){

    com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_t *com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties->default_externalizer_domain
    config_node_property_string_t *default_externalizer_domain_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties->default_externalizer_domain
    cJSON *default_externalizer_domain = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_propertiesJSON, "default.externalizer.domain");
    if (cJSON_IsNull(default_externalizer_domain)) {
        default_externalizer_domain = NULL;
    }
    if (default_externalizer_domain) { 
    default_externalizer_domain_local_nonprim = config_node_property_string_parseFromJSON(default_externalizer_domain); //nonprimitive
    }



    com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_local_var = com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_create_internal (
        default_externalizer_domain ? default_externalizer_domain_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties_local_var;
end:
    if (default_externalizer_domain_local_nonprim) {
        config_node_property_string_free(default_externalizer_domain_local_nonprim);
        default_externalizer_domain_local_nonprim = NULL;
    }
    return NULL;

}
