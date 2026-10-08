#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_rendition_maker_impl_properties.h"



static com_day_cq_dam_core_impl_rendition_maker_impl_properties_t *com_day_cq_dam_core_impl_rendition_maker_impl_properties_create_internal(
    config_node_property_boolean_t *xmp_propagate,
    config_node_property_array_t *xmp_excludes
    ) {
    com_day_cq_dam_core_impl_rendition_maker_impl_properties_t *com_day_cq_dam_core_impl_rendition_maker_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_rendition_maker_impl_properties_t));
    if (!com_day_cq_dam_core_impl_rendition_maker_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_rendition_maker_impl_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_rendition_maker_impl_properties_t));
    com_day_cq_dam_core_impl_rendition_maker_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_rendition_maker_impl_properties_local_var->xmp_propagate = xmp_propagate;
    com_day_cq_dam_core_impl_rendition_maker_impl_properties_local_var->xmp_excludes = xmp_excludes;
    return com_day_cq_dam_core_impl_rendition_maker_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_rendition_maker_impl_properties_t *com_day_cq_dam_core_impl_rendition_maker_impl_properties_create(
    config_node_property_boolean_t *xmp_propagate,
    config_node_property_array_t *xmp_excludes
    ) {
    com_day_cq_dam_core_impl_rendition_maker_impl_properties_t *result = com_day_cq_dam_core_impl_rendition_maker_impl_properties_create_internal (
        xmp_propagate,
        xmp_excludes
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_rendition_maker_impl_properties_free(com_day_cq_dam_core_impl_rendition_maker_impl_properties_t *com_day_cq_dam_core_impl_rendition_maker_impl_properties) {
    if(NULL == com_day_cq_dam_core_impl_rendition_maker_impl_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_rendition_maker_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_rendition_maker_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_propagate) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_propagate);
        com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_propagate = NULL;
    }
    if (com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_excludes) {
        config_node_property_array_free(com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_excludes);
        com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_excludes = NULL;
    }
    free(com_day_cq_dam_core_impl_rendition_maker_impl_properties);
}

cJSON *com_day_cq_dam_core_impl_rendition_maker_impl_properties_convertToJSON(com_day_cq_dam_core_impl_rendition_maker_impl_properties_t *com_day_cq_dam_core_impl_rendition_maker_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_propagate
    if(com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_propagate) {
    cJSON *xmp_propagate_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_propagate);
    if(xmp_propagate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "xmp.propagate", xmp_propagate_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_excludes
    if(com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_excludes) {
    cJSON *xmp_excludes_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_excludes);
    if(xmp_excludes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "xmp.excludes", xmp_excludes_local_JSON);
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

com_day_cq_dam_core_impl_rendition_maker_impl_properties_t *com_day_cq_dam_core_impl_rendition_maker_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_rendition_maker_impl_propertiesJSON){

    com_day_cq_dam_core_impl_rendition_maker_impl_properties_t *com_day_cq_dam_core_impl_rendition_maker_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_propagate
    config_node_property_boolean_t *xmp_propagate_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_excludes
    config_node_property_array_t *xmp_excludes_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_propagate
    cJSON *xmp_propagate = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_rendition_maker_impl_propertiesJSON, "xmp.propagate");
    if (cJSON_IsNull(xmp_propagate)) {
        xmp_propagate = NULL;
    }
    if (xmp_propagate) { 
    xmp_propagate_local_nonprim = config_node_property_boolean_parseFromJSON(xmp_propagate); //nonprimitive
    }

    // com_day_cq_dam_core_impl_rendition_maker_impl_properties->xmp_excludes
    cJSON *xmp_excludes = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_rendition_maker_impl_propertiesJSON, "xmp.excludes");
    if (cJSON_IsNull(xmp_excludes)) {
        xmp_excludes = NULL;
    }
    if (xmp_excludes) { 
    xmp_excludes_local_nonprim = config_node_property_array_parseFromJSON(xmp_excludes); //nonprimitive
    }



    com_day_cq_dam_core_impl_rendition_maker_impl_properties_local_var = com_day_cq_dam_core_impl_rendition_maker_impl_properties_create_internal (
        xmp_propagate ? xmp_propagate_local_nonprim : NULL,
        xmp_excludes ? xmp_excludes_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_rendition_maker_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_rendition_maker_impl_properties_local_var;
end:
    if (xmp_propagate_local_nonprim) {
        config_node_property_boolean_free(xmp_propagate_local_nonprim);
        xmp_propagate_local_nonprim = NULL;
    }
    if (xmp_excludes_local_nonprim) {
        config_node_property_array_free(xmp_excludes_local_nonprim);
        xmp_excludes_local_nonprim = NULL;
    }
    return NULL;

}
