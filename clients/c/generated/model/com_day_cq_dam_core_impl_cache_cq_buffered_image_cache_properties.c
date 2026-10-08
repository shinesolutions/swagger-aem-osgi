#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties.h"



static com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_create_internal(
    config_node_property_integer_t *cq_dam_image_cache_max_memory,
    config_node_property_integer_t *cq_dam_image_cache_max_age,
    config_node_property_string_t *cq_dam_image_cache_max_dimension
    ) {
    com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t));
    if (!com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t));
    com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_local_var->cq_dam_image_cache_max_memory = cq_dam_image_cache_max_memory;
    com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_local_var->cq_dam_image_cache_max_age = cq_dam_image_cache_max_age;
    com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_local_var->cq_dam_image_cache_max_dimension = cq_dam_image_cache_max_dimension;
    return com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_create(
    config_node_property_integer_t *cq_dam_image_cache_max_memory,
    config_node_property_integer_t *cq_dam_image_cache_max_age,
    config_node_property_string_t *cq_dam_image_cache_max_dimension
    ) {
    com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t *result = com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_create_internal (
        cq_dam_image_cache_max_memory,
        cq_dam_image_cache_max_age,
        cq_dam_image_cache_max_dimension
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_free(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties) {
    if(NULL == com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_memory) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_memory);
        com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_memory = NULL;
    }
    if (com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_age) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_age);
        com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_age = NULL;
    }
    if (com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_dimension) {
        config_node_property_string_free(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_dimension);
        com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_dimension = NULL;
    }
    free(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties);
}

cJSON *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_convertToJSON(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_memory
    if(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_memory) {
    cJSON *cq_dam_image_cache_max_memory_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_memory);
    if(cq_dam_image_cache_max_memory_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.image.cache.max.memory", cq_dam_image_cache_max_memory_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_age
    if(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_age) {
    cJSON *cq_dam_image_cache_max_age_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_age);
    if(cq_dam_image_cache_max_age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.image.cache.max.age", cq_dam_image_cache_max_age_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_dimension
    if(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_dimension) {
    cJSON *cq_dam_image_cache_max_dimension_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_dimension);
    if(cq_dam_image_cache_max_dimension_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.image.cache.max.dimension", cq_dam_image_cache_max_dimension_local_JSON);
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

com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_propertiesJSON){

    com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_memory
    config_node_property_integer_t *cq_dam_image_cache_max_memory_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_age
    config_node_property_integer_t *cq_dam_image_cache_max_age_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_dimension
    config_node_property_string_t *cq_dam_image_cache_max_dimension_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_memory
    cJSON *cq_dam_image_cache_max_memory = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_propertiesJSON, "cq.dam.image.cache.max.memory");
    if (cJSON_IsNull(cq_dam_image_cache_max_memory)) {
        cq_dam_image_cache_max_memory = NULL;
    }
    if (cq_dam_image_cache_max_memory) { 
    cq_dam_image_cache_max_memory_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_image_cache_max_memory); //nonprimitive
    }

    // com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_age
    cJSON *cq_dam_image_cache_max_age = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_propertiesJSON, "cq.dam.image.cache.max.age");
    if (cJSON_IsNull(cq_dam_image_cache_max_age)) {
        cq_dam_image_cache_max_age = NULL;
    }
    if (cq_dam_image_cache_max_age) { 
    cq_dam_image_cache_max_age_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_image_cache_max_age); //nonprimitive
    }

    // com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties->cq_dam_image_cache_max_dimension
    cJSON *cq_dam_image_cache_max_dimension = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_propertiesJSON, "cq.dam.image.cache.max.dimension");
    if (cJSON_IsNull(cq_dam_image_cache_max_dimension)) {
        cq_dam_image_cache_max_dimension = NULL;
    }
    if (cq_dam_image_cache_max_dimension) { 
    cq_dam_image_cache_max_dimension_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_image_cache_max_dimension); //nonprimitive
    }



    com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_local_var = com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_create_internal (
        cq_dam_image_cache_max_memory ? cq_dam_image_cache_max_memory_local_nonprim : NULL,
        cq_dam_image_cache_max_age ? cq_dam_image_cache_max_age_local_nonprim : NULL,
        cq_dam_image_cache_max_dimension ? cq_dam_image_cache_max_dimension_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_local_var;
end:
    if (cq_dam_image_cache_max_memory_local_nonprim) {
        config_node_property_integer_free(cq_dam_image_cache_max_memory_local_nonprim);
        cq_dam_image_cache_max_memory_local_nonprim = NULL;
    }
    if (cq_dam_image_cache_max_age_local_nonprim) {
        config_node_property_integer_free(cq_dam_image_cache_max_age_local_nonprim);
        cq_dam_image_cache_max_age_local_nonprim = NULL;
    }
    if (cq_dam_image_cache_max_dimension_local_nonprim) {
        config_node_property_string_free(cq_dam_image_cache_max_dimension_local_nonprim);
        cq_dam_image_cache_max_dimension_local_nonprim = NULL;
    }
    return NULL;

}
