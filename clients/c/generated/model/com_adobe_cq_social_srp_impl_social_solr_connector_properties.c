#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_srp_impl_social_solr_connector_properties.h"



static com_adobe_cq_social_srp_impl_social_solr_connector_properties_t *com_adobe_cq_social_srp_impl_social_solr_connector_properties_create_internal(
    config_node_property_string_t *srp_type
    ) {
    com_adobe_cq_social_srp_impl_social_solr_connector_properties_t *com_adobe_cq_social_srp_impl_social_solr_connector_properties_local_var = malloc(sizeof(com_adobe_cq_social_srp_impl_social_solr_connector_properties_t));
    if (!com_adobe_cq_social_srp_impl_social_solr_connector_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_srp_impl_social_solr_connector_properties_local_var, 0, sizeof(com_adobe_cq_social_srp_impl_social_solr_connector_properties_t));
    com_adobe_cq_social_srp_impl_social_solr_connector_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_srp_impl_social_solr_connector_properties_local_var->srp_type = srp_type;
    return com_adobe_cq_social_srp_impl_social_solr_connector_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_srp_impl_social_solr_connector_properties_t *com_adobe_cq_social_srp_impl_social_solr_connector_properties_create(
    config_node_property_string_t *srp_type
    ) {
    com_adobe_cq_social_srp_impl_social_solr_connector_properties_t *result = com_adobe_cq_social_srp_impl_social_solr_connector_properties_create_internal (
        srp_type
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_srp_impl_social_solr_connector_properties_free(com_adobe_cq_social_srp_impl_social_solr_connector_properties_t *com_adobe_cq_social_srp_impl_social_solr_connector_properties) {
    if(NULL == com_adobe_cq_social_srp_impl_social_solr_connector_properties){
        return ;
    }
    if(com_adobe_cq_social_srp_impl_social_solr_connector_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_srp_impl_social_solr_connector_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_srp_impl_social_solr_connector_properties->srp_type) {
        config_node_property_string_free(com_adobe_cq_social_srp_impl_social_solr_connector_properties->srp_type);
        com_adobe_cq_social_srp_impl_social_solr_connector_properties->srp_type = NULL;
    }
    free(com_adobe_cq_social_srp_impl_social_solr_connector_properties);
}

cJSON *com_adobe_cq_social_srp_impl_social_solr_connector_properties_convertToJSON(com_adobe_cq_social_srp_impl_social_solr_connector_properties_t *com_adobe_cq_social_srp_impl_social_solr_connector_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_srp_impl_social_solr_connector_properties->srp_type
    if(com_adobe_cq_social_srp_impl_social_solr_connector_properties->srp_type) {
    cJSON *srp_type_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_srp_impl_social_solr_connector_properties->srp_type);
    if(srp_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "srp.type", srp_type_local_JSON);
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

com_adobe_cq_social_srp_impl_social_solr_connector_properties_t *com_adobe_cq_social_srp_impl_social_solr_connector_properties_parseFromJSON(cJSON *com_adobe_cq_social_srp_impl_social_solr_connector_propertiesJSON){

    com_adobe_cq_social_srp_impl_social_solr_connector_properties_t *com_adobe_cq_social_srp_impl_social_solr_connector_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_srp_impl_social_solr_connector_properties->srp_type
    config_node_property_string_t *srp_type_local_nonprim = NULL;

    // com_adobe_cq_social_srp_impl_social_solr_connector_properties->srp_type
    cJSON *srp_type = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_srp_impl_social_solr_connector_propertiesJSON, "srp.type");
    if (cJSON_IsNull(srp_type)) {
        srp_type = NULL;
    }
    if (srp_type) { 
    srp_type_local_nonprim = config_node_property_string_parseFromJSON(srp_type); //nonprimitive
    }



    com_adobe_cq_social_srp_impl_social_solr_connector_properties_local_var = com_adobe_cq_social_srp_impl_social_solr_connector_properties_create_internal (
        srp_type ? srp_type_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_srp_impl_social_solr_connector_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_srp_impl_social_solr_connector_properties_local_var;
end:
    if (srp_type_local_nonprim) {
        config_node_property_string_free(srp_type_local_nonprim);
        srp_type_local_nonprim = NULL;
    }
    return NULL;

}
