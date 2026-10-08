#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_commons_impl_externalizer_impl_properties.h"



static com_day_cq_commons_impl_externalizer_impl_properties_t *com_day_cq_commons_impl_externalizer_impl_properties_create_internal(
    config_node_property_array_t *externalizer_domains,
    config_node_property_string_t *externalizer_host,
    config_node_property_string_t *externalizer_contextpath,
    config_node_property_boolean_t *externalizer_encodedpath
    ) {
    com_day_cq_commons_impl_externalizer_impl_properties_t *com_day_cq_commons_impl_externalizer_impl_properties_local_var = malloc(sizeof(com_day_cq_commons_impl_externalizer_impl_properties_t));
    if (!com_day_cq_commons_impl_externalizer_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_commons_impl_externalizer_impl_properties_local_var, 0, sizeof(com_day_cq_commons_impl_externalizer_impl_properties_t));
    com_day_cq_commons_impl_externalizer_impl_properties_local_var->_library_owned = 1;
    com_day_cq_commons_impl_externalizer_impl_properties_local_var->externalizer_domains = externalizer_domains;
    com_day_cq_commons_impl_externalizer_impl_properties_local_var->externalizer_host = externalizer_host;
    com_day_cq_commons_impl_externalizer_impl_properties_local_var->externalizer_contextpath = externalizer_contextpath;
    com_day_cq_commons_impl_externalizer_impl_properties_local_var->externalizer_encodedpath = externalizer_encodedpath;
    return com_day_cq_commons_impl_externalizer_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_commons_impl_externalizer_impl_properties_t *com_day_cq_commons_impl_externalizer_impl_properties_create(
    config_node_property_array_t *externalizer_domains,
    config_node_property_string_t *externalizer_host,
    config_node_property_string_t *externalizer_contextpath,
    config_node_property_boolean_t *externalizer_encodedpath
    ) {
    com_day_cq_commons_impl_externalizer_impl_properties_t *result = com_day_cq_commons_impl_externalizer_impl_properties_create_internal (
        externalizer_domains,
        externalizer_host,
        externalizer_contextpath,
        externalizer_encodedpath
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_commons_impl_externalizer_impl_properties_free(com_day_cq_commons_impl_externalizer_impl_properties_t *com_day_cq_commons_impl_externalizer_impl_properties) {
    if(NULL == com_day_cq_commons_impl_externalizer_impl_properties){
        return ;
    }
    if(com_day_cq_commons_impl_externalizer_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_commons_impl_externalizer_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_commons_impl_externalizer_impl_properties->externalizer_domains) {
        config_node_property_array_free(com_day_cq_commons_impl_externalizer_impl_properties->externalizer_domains);
        com_day_cq_commons_impl_externalizer_impl_properties->externalizer_domains = NULL;
    }
    if (com_day_cq_commons_impl_externalizer_impl_properties->externalizer_host) {
        config_node_property_string_free(com_day_cq_commons_impl_externalizer_impl_properties->externalizer_host);
        com_day_cq_commons_impl_externalizer_impl_properties->externalizer_host = NULL;
    }
    if (com_day_cq_commons_impl_externalizer_impl_properties->externalizer_contextpath) {
        config_node_property_string_free(com_day_cq_commons_impl_externalizer_impl_properties->externalizer_contextpath);
        com_day_cq_commons_impl_externalizer_impl_properties->externalizer_contextpath = NULL;
    }
    if (com_day_cq_commons_impl_externalizer_impl_properties->externalizer_encodedpath) {
        config_node_property_boolean_free(com_day_cq_commons_impl_externalizer_impl_properties->externalizer_encodedpath);
        com_day_cq_commons_impl_externalizer_impl_properties->externalizer_encodedpath = NULL;
    }
    free(com_day_cq_commons_impl_externalizer_impl_properties);
}

cJSON *com_day_cq_commons_impl_externalizer_impl_properties_convertToJSON(com_day_cq_commons_impl_externalizer_impl_properties_t *com_day_cq_commons_impl_externalizer_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_commons_impl_externalizer_impl_properties->externalizer_domains
    if(com_day_cq_commons_impl_externalizer_impl_properties->externalizer_domains) {
    cJSON *externalizer_domains_local_JSON = config_node_property_array_convertToJSON(com_day_cq_commons_impl_externalizer_impl_properties->externalizer_domains);
    if(externalizer_domains_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "externalizer.domains", externalizer_domains_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_commons_impl_externalizer_impl_properties->externalizer_host
    if(com_day_cq_commons_impl_externalizer_impl_properties->externalizer_host) {
    cJSON *externalizer_host_local_JSON = config_node_property_string_convertToJSON(com_day_cq_commons_impl_externalizer_impl_properties->externalizer_host);
    if(externalizer_host_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "externalizer.host", externalizer_host_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_commons_impl_externalizer_impl_properties->externalizer_contextpath
    if(com_day_cq_commons_impl_externalizer_impl_properties->externalizer_contextpath) {
    cJSON *externalizer_contextpath_local_JSON = config_node_property_string_convertToJSON(com_day_cq_commons_impl_externalizer_impl_properties->externalizer_contextpath);
    if(externalizer_contextpath_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "externalizer.contextpath", externalizer_contextpath_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_commons_impl_externalizer_impl_properties->externalizer_encodedpath
    if(com_day_cq_commons_impl_externalizer_impl_properties->externalizer_encodedpath) {
    cJSON *externalizer_encodedpath_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_commons_impl_externalizer_impl_properties->externalizer_encodedpath);
    if(externalizer_encodedpath_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "externalizer.encodedpath", externalizer_encodedpath_local_JSON);
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

com_day_cq_commons_impl_externalizer_impl_properties_t *com_day_cq_commons_impl_externalizer_impl_properties_parseFromJSON(cJSON *com_day_cq_commons_impl_externalizer_impl_propertiesJSON){

    com_day_cq_commons_impl_externalizer_impl_properties_t *com_day_cq_commons_impl_externalizer_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_commons_impl_externalizer_impl_properties->externalizer_domains
    config_node_property_array_t *externalizer_domains_local_nonprim = NULL;

    // define the local variable for com_day_cq_commons_impl_externalizer_impl_properties->externalizer_host
    config_node_property_string_t *externalizer_host_local_nonprim = NULL;

    // define the local variable for com_day_cq_commons_impl_externalizer_impl_properties->externalizer_contextpath
    config_node_property_string_t *externalizer_contextpath_local_nonprim = NULL;

    // define the local variable for com_day_cq_commons_impl_externalizer_impl_properties->externalizer_encodedpath
    config_node_property_boolean_t *externalizer_encodedpath_local_nonprim = NULL;

    // com_day_cq_commons_impl_externalizer_impl_properties->externalizer_domains
    cJSON *externalizer_domains = cJSON_GetObjectItemCaseSensitive(com_day_cq_commons_impl_externalizer_impl_propertiesJSON, "externalizer.domains");
    if (cJSON_IsNull(externalizer_domains)) {
        externalizer_domains = NULL;
    }
    if (externalizer_domains) { 
    externalizer_domains_local_nonprim = config_node_property_array_parseFromJSON(externalizer_domains); //nonprimitive
    }

    // com_day_cq_commons_impl_externalizer_impl_properties->externalizer_host
    cJSON *externalizer_host = cJSON_GetObjectItemCaseSensitive(com_day_cq_commons_impl_externalizer_impl_propertiesJSON, "externalizer.host");
    if (cJSON_IsNull(externalizer_host)) {
        externalizer_host = NULL;
    }
    if (externalizer_host) { 
    externalizer_host_local_nonprim = config_node_property_string_parseFromJSON(externalizer_host); //nonprimitive
    }

    // com_day_cq_commons_impl_externalizer_impl_properties->externalizer_contextpath
    cJSON *externalizer_contextpath = cJSON_GetObjectItemCaseSensitive(com_day_cq_commons_impl_externalizer_impl_propertiesJSON, "externalizer.contextpath");
    if (cJSON_IsNull(externalizer_contextpath)) {
        externalizer_contextpath = NULL;
    }
    if (externalizer_contextpath) { 
    externalizer_contextpath_local_nonprim = config_node_property_string_parseFromJSON(externalizer_contextpath); //nonprimitive
    }

    // com_day_cq_commons_impl_externalizer_impl_properties->externalizer_encodedpath
    cJSON *externalizer_encodedpath = cJSON_GetObjectItemCaseSensitive(com_day_cq_commons_impl_externalizer_impl_propertiesJSON, "externalizer.encodedpath");
    if (cJSON_IsNull(externalizer_encodedpath)) {
        externalizer_encodedpath = NULL;
    }
    if (externalizer_encodedpath) { 
    externalizer_encodedpath_local_nonprim = config_node_property_boolean_parseFromJSON(externalizer_encodedpath); //nonprimitive
    }



    com_day_cq_commons_impl_externalizer_impl_properties_local_var = com_day_cq_commons_impl_externalizer_impl_properties_create_internal (
        externalizer_domains ? externalizer_domains_local_nonprim : NULL,
        externalizer_host ? externalizer_host_local_nonprim : NULL,
        externalizer_contextpath ? externalizer_contextpath_local_nonprim : NULL,
        externalizer_encodedpath ? externalizer_encodedpath_local_nonprim : NULL
        );

    if (!com_day_cq_commons_impl_externalizer_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_commons_impl_externalizer_impl_properties_local_var;
end:
    if (externalizer_domains_local_nonprim) {
        config_node_property_array_free(externalizer_domains_local_nonprim);
        externalizer_domains_local_nonprim = NULL;
    }
    if (externalizer_host_local_nonprim) {
        config_node_property_string_free(externalizer_host_local_nonprim);
        externalizer_host_local_nonprim = NULL;
    }
    if (externalizer_contextpath_local_nonprim) {
        config_node_property_string_free(externalizer_contextpath_local_nonprim);
        externalizer_contextpath_local_nonprim = NULL;
    }
    if (externalizer_encodedpath_local_nonprim) {
        config_node_property_boolean_free(externalizer_encodedpath_local_nonprim);
        externalizer_encodedpath_local_nonprim = NULL;
    }
    return NULL;

}
