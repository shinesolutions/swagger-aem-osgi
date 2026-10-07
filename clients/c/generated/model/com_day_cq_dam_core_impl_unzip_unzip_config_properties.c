#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_unzip_unzip_config_properties.h"



static com_day_cq_dam_core_impl_unzip_unzip_config_properties_t *com_day_cq_dam_core_impl_unzip_unzip_config_properties_create_internal(
    config_node_property_integer_t *cq_dam_config_unzip_maxuncompressedsize,
    config_node_property_string_t *cq_dam_config_unzip_encoding
    ) {
    com_day_cq_dam_core_impl_unzip_unzip_config_properties_t *com_day_cq_dam_core_impl_unzip_unzip_config_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_unzip_unzip_config_properties_t));
    if (!com_day_cq_dam_core_impl_unzip_unzip_config_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_unzip_unzip_config_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_unzip_unzip_config_properties_t));
    com_day_cq_dam_core_impl_unzip_unzip_config_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_unzip_unzip_config_properties_local_var->cq_dam_config_unzip_maxuncompressedsize = cq_dam_config_unzip_maxuncompressedsize;
    com_day_cq_dam_core_impl_unzip_unzip_config_properties_local_var->cq_dam_config_unzip_encoding = cq_dam_config_unzip_encoding;
    return com_day_cq_dam_core_impl_unzip_unzip_config_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_unzip_unzip_config_properties_t *com_day_cq_dam_core_impl_unzip_unzip_config_properties_create(
    config_node_property_integer_t *cq_dam_config_unzip_maxuncompressedsize,
    config_node_property_string_t *cq_dam_config_unzip_encoding
    ) {
    com_day_cq_dam_core_impl_unzip_unzip_config_properties_t *result = com_day_cq_dam_core_impl_unzip_unzip_config_properties_create_internal (
        cq_dam_config_unzip_maxuncompressedsize,
        cq_dam_config_unzip_encoding
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_unzip_unzip_config_properties_free(com_day_cq_dam_core_impl_unzip_unzip_config_properties_t *com_day_cq_dam_core_impl_unzip_unzip_config_properties) {
    if(NULL == com_day_cq_dam_core_impl_unzip_unzip_config_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_unzip_unzip_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_unzip_unzip_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_maxuncompressedsize) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_maxuncompressedsize);
        com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_maxuncompressedsize = NULL;
    }
    if (com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_encoding) {
        config_node_property_string_free(com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_encoding);
        com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_encoding = NULL;
    }
    free(com_day_cq_dam_core_impl_unzip_unzip_config_properties);
}

cJSON *com_day_cq_dam_core_impl_unzip_unzip_config_properties_convertToJSON(com_day_cq_dam_core_impl_unzip_unzip_config_properties_t *com_day_cq_dam_core_impl_unzip_unzip_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_maxuncompressedsize
    if(com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_maxuncompressedsize) {
    cJSON *cq_dam_config_unzip_maxuncompressedsize_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_maxuncompressedsize);
    if(cq_dam_config_unzip_maxuncompressedsize_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.unzip.maxuncompressedsize", cq_dam_config_unzip_maxuncompressedsize_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_encoding
    if(com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_encoding) {
    cJSON *cq_dam_config_unzip_encoding_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_encoding);
    if(cq_dam_config_unzip_encoding_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.unzip.encoding", cq_dam_config_unzip_encoding_local_JSON);
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

com_day_cq_dam_core_impl_unzip_unzip_config_properties_t *com_day_cq_dam_core_impl_unzip_unzip_config_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_unzip_unzip_config_propertiesJSON){

    com_day_cq_dam_core_impl_unzip_unzip_config_properties_t *com_day_cq_dam_core_impl_unzip_unzip_config_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_maxuncompressedsize
    config_node_property_integer_t *cq_dam_config_unzip_maxuncompressedsize_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_encoding
    config_node_property_string_t *cq_dam_config_unzip_encoding_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_maxuncompressedsize
    cJSON *cq_dam_config_unzip_maxuncompressedsize = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_unzip_unzip_config_propertiesJSON, "cq.dam.config.unzip.maxuncompressedsize");
    if (cJSON_IsNull(cq_dam_config_unzip_maxuncompressedsize)) {
        cq_dam_config_unzip_maxuncompressedsize = NULL;
    }
    if (cq_dam_config_unzip_maxuncompressedsize) { 
    cq_dam_config_unzip_maxuncompressedsize_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_config_unzip_maxuncompressedsize); //nonprimitive
    }

    // com_day_cq_dam_core_impl_unzip_unzip_config_properties->cq_dam_config_unzip_encoding
    cJSON *cq_dam_config_unzip_encoding = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_unzip_unzip_config_propertiesJSON, "cq.dam.config.unzip.encoding");
    if (cJSON_IsNull(cq_dam_config_unzip_encoding)) {
        cq_dam_config_unzip_encoding = NULL;
    }
    if (cq_dam_config_unzip_encoding) { 
    cq_dam_config_unzip_encoding_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_config_unzip_encoding); //nonprimitive
    }



    com_day_cq_dam_core_impl_unzip_unzip_config_properties_local_var = com_day_cq_dam_core_impl_unzip_unzip_config_properties_create_internal (
        cq_dam_config_unzip_maxuncompressedsize ? cq_dam_config_unzip_maxuncompressedsize_local_nonprim : NULL,
        cq_dam_config_unzip_encoding ? cq_dam_config_unzip_encoding_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_unzip_unzip_config_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_unzip_unzip_config_properties_local_var;
end:
    if (cq_dam_config_unzip_maxuncompressedsize_local_nonprim) {
        config_node_property_integer_free(cq_dam_config_unzip_maxuncompressedsize_local_nonprim);
        cq_dam_config_unzip_maxuncompressedsize_local_nonprim = NULL;
    }
    if (cq_dam_config_unzip_encoding_local_nonprim) {
        config_node_property_string_free(cq_dam_config_unzip_encoding_local_nonprim);
        cq_dam_config_unzip_encoding_local_nonprim = NULL;
    }
    return NULL;

}
