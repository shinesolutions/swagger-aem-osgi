#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_mcm_campaign_impl_integration_config_impl_properties.h"



static com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t *com_day_cq_mcm_campaign_impl_integration_config_impl_properties_create_internal(
    config_node_property_array_t *aem_mcm_campaign_form_constraints,
    config_node_property_string_t *aem_mcm_campaign_public_url,
    config_node_property_boolean_t *aem_mcm_campaign_relaxed_ssl
    ) {
    com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t *com_day_cq_mcm_campaign_impl_integration_config_impl_properties_local_var = malloc(sizeof(com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t));
    if (!com_day_cq_mcm_campaign_impl_integration_config_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_mcm_campaign_impl_integration_config_impl_properties_local_var, 0, sizeof(com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t));
    com_day_cq_mcm_campaign_impl_integration_config_impl_properties_local_var->_library_owned = 1;
    com_day_cq_mcm_campaign_impl_integration_config_impl_properties_local_var->aem_mcm_campaign_form_constraints = aem_mcm_campaign_form_constraints;
    com_day_cq_mcm_campaign_impl_integration_config_impl_properties_local_var->aem_mcm_campaign_public_url = aem_mcm_campaign_public_url;
    com_day_cq_mcm_campaign_impl_integration_config_impl_properties_local_var->aem_mcm_campaign_relaxed_ssl = aem_mcm_campaign_relaxed_ssl;
    return com_day_cq_mcm_campaign_impl_integration_config_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t *com_day_cq_mcm_campaign_impl_integration_config_impl_properties_create(
    config_node_property_array_t *aem_mcm_campaign_form_constraints,
    config_node_property_string_t *aem_mcm_campaign_public_url,
    config_node_property_boolean_t *aem_mcm_campaign_relaxed_ssl
    ) {
    com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t *result = com_day_cq_mcm_campaign_impl_integration_config_impl_properties_create_internal (
        aem_mcm_campaign_form_constraints,
        aem_mcm_campaign_public_url,
        aem_mcm_campaign_relaxed_ssl
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_mcm_campaign_impl_integration_config_impl_properties_free(com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t *com_day_cq_mcm_campaign_impl_integration_config_impl_properties) {
    if(NULL == com_day_cq_mcm_campaign_impl_integration_config_impl_properties){
        return ;
    }
    if(com_day_cq_mcm_campaign_impl_integration_config_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_mcm_campaign_impl_integration_config_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_form_constraints) {
        config_node_property_array_free(com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_form_constraints);
        com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_form_constraints = NULL;
    }
    if (com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_public_url) {
        config_node_property_string_free(com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_public_url);
        com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_public_url = NULL;
    }
    if (com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_relaxed_ssl) {
        config_node_property_boolean_free(com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_relaxed_ssl);
        com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_relaxed_ssl = NULL;
    }
    free(com_day_cq_mcm_campaign_impl_integration_config_impl_properties);
}

cJSON *com_day_cq_mcm_campaign_impl_integration_config_impl_properties_convertToJSON(com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t *com_day_cq_mcm_campaign_impl_integration_config_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_form_constraints
    if(com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_form_constraints) {
    cJSON *aem_mcm_campaign_form_constraints_local_JSON = config_node_property_array_convertToJSON(com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_form_constraints);
    if(aem_mcm_campaign_form_constraints_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "aem.mcm.campaign.formConstraints", aem_mcm_campaign_form_constraints_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_public_url
    if(com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_public_url) {
    cJSON *aem_mcm_campaign_public_url_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_public_url);
    if(aem_mcm_campaign_public_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "aem.mcm.campaign.publicUrl", aem_mcm_campaign_public_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_relaxed_ssl
    if(com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_relaxed_ssl) {
    cJSON *aem_mcm_campaign_relaxed_ssl_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_relaxed_ssl);
    if(aem_mcm_campaign_relaxed_ssl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "aem.mcm.campaign.relaxedSSL", aem_mcm_campaign_relaxed_ssl_local_JSON);
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

com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t *com_day_cq_mcm_campaign_impl_integration_config_impl_properties_parseFromJSON(cJSON *com_day_cq_mcm_campaign_impl_integration_config_impl_propertiesJSON){

    com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t *com_day_cq_mcm_campaign_impl_integration_config_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_form_constraints
    config_node_property_array_t *aem_mcm_campaign_form_constraints_local_nonprim = NULL;

    // define the local variable for com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_public_url
    config_node_property_string_t *aem_mcm_campaign_public_url_local_nonprim = NULL;

    // define the local variable for com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_relaxed_ssl
    config_node_property_boolean_t *aem_mcm_campaign_relaxed_ssl_local_nonprim = NULL;

    // com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_form_constraints
    cJSON *aem_mcm_campaign_form_constraints = cJSON_GetObjectItemCaseSensitive(com_day_cq_mcm_campaign_impl_integration_config_impl_propertiesJSON, "aem.mcm.campaign.formConstraints");
    if (cJSON_IsNull(aem_mcm_campaign_form_constraints)) {
        aem_mcm_campaign_form_constraints = NULL;
    }
    if (aem_mcm_campaign_form_constraints) { 
    aem_mcm_campaign_form_constraints_local_nonprim = config_node_property_array_parseFromJSON(aem_mcm_campaign_form_constraints); //nonprimitive
    }

    // com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_public_url
    cJSON *aem_mcm_campaign_public_url = cJSON_GetObjectItemCaseSensitive(com_day_cq_mcm_campaign_impl_integration_config_impl_propertiesJSON, "aem.mcm.campaign.publicUrl");
    if (cJSON_IsNull(aem_mcm_campaign_public_url)) {
        aem_mcm_campaign_public_url = NULL;
    }
    if (aem_mcm_campaign_public_url) { 
    aem_mcm_campaign_public_url_local_nonprim = config_node_property_string_parseFromJSON(aem_mcm_campaign_public_url); //nonprimitive
    }

    // com_day_cq_mcm_campaign_impl_integration_config_impl_properties->aem_mcm_campaign_relaxed_ssl
    cJSON *aem_mcm_campaign_relaxed_ssl = cJSON_GetObjectItemCaseSensitive(com_day_cq_mcm_campaign_impl_integration_config_impl_propertiesJSON, "aem.mcm.campaign.relaxedSSL");
    if (cJSON_IsNull(aem_mcm_campaign_relaxed_ssl)) {
        aem_mcm_campaign_relaxed_ssl = NULL;
    }
    if (aem_mcm_campaign_relaxed_ssl) { 
    aem_mcm_campaign_relaxed_ssl_local_nonprim = config_node_property_boolean_parseFromJSON(aem_mcm_campaign_relaxed_ssl); //nonprimitive
    }



    com_day_cq_mcm_campaign_impl_integration_config_impl_properties_local_var = com_day_cq_mcm_campaign_impl_integration_config_impl_properties_create_internal (
        aem_mcm_campaign_form_constraints ? aem_mcm_campaign_form_constraints_local_nonprim : NULL,
        aem_mcm_campaign_public_url ? aem_mcm_campaign_public_url_local_nonprim : NULL,
        aem_mcm_campaign_relaxed_ssl ? aem_mcm_campaign_relaxed_ssl_local_nonprim : NULL
        );

    if (!com_day_cq_mcm_campaign_impl_integration_config_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_mcm_campaign_impl_integration_config_impl_properties_local_var;
end:
    if (aem_mcm_campaign_form_constraints_local_nonprim) {
        config_node_property_array_free(aem_mcm_campaign_form_constraints_local_nonprim);
        aem_mcm_campaign_form_constraints_local_nonprim = NULL;
    }
    if (aem_mcm_campaign_public_url_local_nonprim) {
        config_node_property_string_free(aem_mcm_campaign_public_url_local_nonprim);
        aem_mcm_campaign_public_url_local_nonprim = NULL;
    }
    if (aem_mcm_campaign_relaxed_ssl_local_nonprim) {
        config_node_property_boolean_free(aem_mcm_campaign_relaxed_ssl_local_nonprim);
        aem_mcm_campaign_relaxed_ssl_local_nonprim = NULL;
    }
    return NULL;

}
