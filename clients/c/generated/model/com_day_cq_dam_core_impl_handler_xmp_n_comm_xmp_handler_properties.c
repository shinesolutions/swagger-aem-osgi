#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties.h"



static com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_t *com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_create_internal(
    config_node_property_array_t *xmphandler_cq_formats
    ) {
    com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_t *com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_t));
    if (!com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_t));
    com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_local_var->xmphandler_cq_formats = xmphandler_cq_formats;
    return com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_t *com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_create(
    config_node_property_array_t *xmphandler_cq_formats
    ) {
    com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_t *result = com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_create_internal (
        xmphandler_cq_formats
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_free(com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_t *com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties) {
    if(NULL == com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties->xmphandler_cq_formats) {
        config_node_property_array_free(com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties->xmphandler_cq_formats);
        com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties->xmphandler_cq_formats = NULL;
    }
    free(com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties);
}

cJSON *com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_convertToJSON(com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_t *com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties->xmphandler_cq_formats
    if(com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties->xmphandler_cq_formats) {
    cJSON *xmphandler_cq_formats_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties->xmphandler_cq_formats);
    if(xmphandler_cq_formats_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "xmphandler.cq.formats", xmphandler_cq_formats_local_JSON);
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

com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_t *com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_propertiesJSON){

    com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_t *com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties->xmphandler_cq_formats
    config_node_property_array_t *xmphandler_cq_formats_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties->xmphandler_cq_formats
    cJSON *xmphandler_cq_formats = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_propertiesJSON, "xmphandler.cq.formats");
    if (cJSON_IsNull(xmphandler_cq_formats)) {
        xmphandler_cq_formats = NULL;
    }
    if (xmphandler_cq_formats) { 
    xmphandler_cq_formats_local_nonprim = config_node_property_array_parseFromJSON(xmphandler_cq_formats); //nonprimitive
    }



    com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_local_var = com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_create_internal (
        xmphandler_cq_formats ? xmphandler_cq_formats_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties_local_var;
end:
    if (xmphandler_cq_formats_local_nonprim) {
        config_node_property_array_free(xmphandler_cq_formats_local_nonprim);
        xmphandler_cq_formats_local_nonprim = NULL;
    }
    return NULL;

}
