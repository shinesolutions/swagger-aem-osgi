#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties.h"



static com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_t *com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_create_internal(
    config_node_property_integer_t *cq_commerce_cataloggenerator_bucketsize,
    config_node_property_string_t *cq_commerce_cataloggenerator_bucketname,
    config_node_property_array_t *cq_commerce_cataloggenerator_excludedtemplateproperties
    ) {
    com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_t *com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_local_var = malloc(sizeof(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_t));
    if (!com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_local_var, 0, sizeof(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_t));
    com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_local_var->cq_commerce_cataloggenerator_bucketsize = cq_commerce_cataloggenerator_bucketsize;
    com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_local_var->cq_commerce_cataloggenerator_bucketname = cq_commerce_cataloggenerator_bucketname;
    com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_local_var->cq_commerce_cataloggenerator_excludedtemplateproperties = cq_commerce_cataloggenerator_excludedtemplateproperties;
    return com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_t *com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_create(
    config_node_property_integer_t *cq_commerce_cataloggenerator_bucketsize,
    config_node_property_string_t *cq_commerce_cataloggenerator_bucketname,
    config_node_property_array_t *cq_commerce_cataloggenerator_excludedtemplateproperties
    ) {
    com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_t *result = com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_create_internal (
        cq_commerce_cataloggenerator_bucketsize,
        cq_commerce_cataloggenerator_bucketname,
        cq_commerce_cataloggenerator_excludedtemplateproperties
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_free(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_t *com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties) {
    if(NULL == com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties){
        return ;
    }
    if(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketsize) {
        config_node_property_integer_free(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketsize);
        com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketsize = NULL;
    }
    if (com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketname) {
        config_node_property_string_free(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketname);
        com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketname = NULL;
    }
    if (com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_excludedtemplateproperties) {
        config_node_property_array_free(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_excludedtemplateproperties);
        com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_excludedtemplateproperties = NULL;
    }
    free(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties);
}

cJSON *com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_convertToJSON(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_t *com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketsize
    if(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketsize) {
    cJSON *cq_commerce_cataloggenerator_bucketsize_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketsize);
    if(cq_commerce_cataloggenerator_bucketsize_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.commerce.cataloggenerator.bucketsize", cq_commerce_cataloggenerator_bucketsize_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketname
    if(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketname) {
    cJSON *cq_commerce_cataloggenerator_bucketname_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketname);
    if(cq_commerce_cataloggenerator_bucketname_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.commerce.cataloggenerator.bucketname", cq_commerce_cataloggenerator_bucketname_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_excludedtemplateproperties
    if(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_excludedtemplateproperties) {
    cJSON *cq_commerce_cataloggenerator_excludedtemplateproperties_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_excludedtemplateproperties);
    if(cq_commerce_cataloggenerator_excludedtemplateproperties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.commerce.cataloggenerator.excludedtemplateproperties", cq_commerce_cataloggenerator_excludedtemplateproperties_local_JSON);
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

com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_t *com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_parseFromJSON(cJSON *com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_propertiesJSON){

    com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_t *com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketsize
    config_node_property_integer_t *cq_commerce_cataloggenerator_bucketsize_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketname
    config_node_property_string_t *cq_commerce_cataloggenerator_bucketname_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_excludedtemplateproperties
    config_node_property_array_t *cq_commerce_cataloggenerator_excludedtemplateproperties_local_nonprim = NULL;

    // com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketsize
    cJSON *cq_commerce_cataloggenerator_bucketsize = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_propertiesJSON, "cq.commerce.cataloggenerator.bucketsize");
    if (cJSON_IsNull(cq_commerce_cataloggenerator_bucketsize)) {
        cq_commerce_cataloggenerator_bucketsize = NULL;
    }
    if (cq_commerce_cataloggenerator_bucketsize) { 
    cq_commerce_cataloggenerator_bucketsize_local_nonprim = config_node_property_integer_parseFromJSON(cq_commerce_cataloggenerator_bucketsize); //nonprimitive
    }

    // com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_bucketname
    cJSON *cq_commerce_cataloggenerator_bucketname = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_propertiesJSON, "cq.commerce.cataloggenerator.bucketname");
    if (cJSON_IsNull(cq_commerce_cataloggenerator_bucketname)) {
        cq_commerce_cataloggenerator_bucketname = NULL;
    }
    if (cq_commerce_cataloggenerator_bucketname) { 
    cq_commerce_cataloggenerator_bucketname_local_nonprim = config_node_property_string_parseFromJSON(cq_commerce_cataloggenerator_bucketname); //nonprimitive
    }

    // com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties->cq_commerce_cataloggenerator_excludedtemplateproperties
    cJSON *cq_commerce_cataloggenerator_excludedtemplateproperties = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_propertiesJSON, "cq.commerce.cataloggenerator.excludedtemplateproperties");
    if (cJSON_IsNull(cq_commerce_cataloggenerator_excludedtemplateproperties)) {
        cq_commerce_cataloggenerator_excludedtemplateproperties = NULL;
    }
    if (cq_commerce_cataloggenerator_excludedtemplateproperties) { 
    cq_commerce_cataloggenerator_excludedtemplateproperties_local_nonprim = config_node_property_array_parseFromJSON(cq_commerce_cataloggenerator_excludedtemplateproperties); //nonprimitive
    }



    com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_local_var = com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_create_internal (
        cq_commerce_cataloggenerator_bucketsize ? cq_commerce_cataloggenerator_bucketsize_local_nonprim : NULL,
        cq_commerce_cataloggenerator_bucketname ? cq_commerce_cataloggenerator_bucketname_local_nonprim : NULL,
        cq_commerce_cataloggenerator_excludedtemplateproperties ? cq_commerce_cataloggenerator_excludedtemplateproperties_local_nonprim : NULL
        );

    if (!com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties_local_var;
end:
    if (cq_commerce_cataloggenerator_bucketsize_local_nonprim) {
        config_node_property_integer_free(cq_commerce_cataloggenerator_bucketsize_local_nonprim);
        cq_commerce_cataloggenerator_bucketsize_local_nonprim = NULL;
    }
    if (cq_commerce_cataloggenerator_bucketname_local_nonprim) {
        config_node_property_string_free(cq_commerce_cataloggenerator_bucketname_local_nonprim);
        cq_commerce_cataloggenerator_bucketname_local_nonprim = NULL;
    }
    if (cq_commerce_cataloggenerator_excludedtemplateproperties_local_nonprim) {
        config_node_property_array_free(cq_commerce_cataloggenerator_excludedtemplateproperties_local_nonprim);
        cq_commerce_cataloggenerator_excludedtemplateproperties_local_nonprim = NULL;
    }
    return NULL;

}
