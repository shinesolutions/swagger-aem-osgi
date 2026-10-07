#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties.h"



static com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_t *com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_create_internal(
    config_node_property_array_t *cq_mime_type_blacklist,
    config_node_property_boolean_t *cq_dam_empty_mime
    ) {
    com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_t *com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_t));
    if (!com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_t));
    com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_local_var->cq_mime_type_blacklist = cq_mime_type_blacklist;
    com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_local_var->cq_dam_empty_mime = cq_dam_empty_mime;
    return com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_t *com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_create(
    config_node_property_array_t *cq_mime_type_blacklist,
    config_node_property_boolean_t *cq_dam_empty_mime
    ) {
    com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_t *result = com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_create_internal (
        cq_mime_type_blacklist,
        cq_dam_empty_mime
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_free(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_t *com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties) {
    if(NULL == com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_mime_type_blacklist) {
        config_node_property_array_free(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_mime_type_blacklist);
        com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_mime_type_blacklist = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_dam_empty_mime) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_dam_empty_mime);
        com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_dam_empty_mime = NULL;
    }
    free(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties);
}

cJSON *com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_convertToJSON(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_t *com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_mime_type_blacklist
    if(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_mime_type_blacklist) {
    cJSON *cq_mime_type_blacklist_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_mime_type_blacklist);
    if(cq_mime_type_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.mime.type.blacklist", cq_mime_type_blacklist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_dam_empty_mime
    if(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_dam_empty_mime) {
    cJSON *cq_dam_empty_mime_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_dam_empty_mime);
    if(cq_dam_empty_mime_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.empty.mime", cq_dam_empty_mime_local_JSON);
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

com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_t *com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_propertiesJSON){

    com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_t *com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_mime_type_blacklist
    config_node_property_array_t *cq_mime_type_blacklist_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_dam_empty_mime
    config_node_property_boolean_t *cq_dam_empty_mime_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_mime_type_blacklist
    cJSON *cq_mime_type_blacklist = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_propertiesJSON, "cq.mime.type.blacklist");
    if (cJSON_IsNull(cq_mime_type_blacklist)) {
        cq_mime_type_blacklist = NULL;
    }
    if (cq_mime_type_blacklist) { 
    cq_mime_type_blacklist_local_nonprim = config_node_property_array_parseFromJSON(cq_mime_type_blacklist); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties->cq_dam_empty_mime
    cJSON *cq_dam_empty_mime = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_propertiesJSON, "cq.dam.empty.mime");
    if (cJSON_IsNull(cq_dam_empty_mime)) {
        cq_dam_empty_mime = NULL;
    }
    if (cq_dam_empty_mime) { 
    cq_dam_empty_mime_local_nonprim = config_node_property_boolean_parseFromJSON(cq_dam_empty_mime); //nonprimitive
    }



    com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_local_var = com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_create_internal (
        cq_mime_type_blacklist ? cq_mime_type_blacklist_local_nonprim : NULL,
        cq_dam_empty_mime ? cq_dam_empty_mime_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties_local_var;
end:
    if (cq_mime_type_blacklist_local_nonprim) {
        config_node_property_array_free(cq_mime_type_blacklist_local_nonprim);
        cq_mime_type_blacklist_local_nonprim = NULL;
    }
    if (cq_dam_empty_mime_local_nonprim) {
        config_node_property_boolean_free(cq_dam_empty_mime_local_nonprim);
        cq_dam_empty_mime_local_nonprim = NULL;
    }
    return NULL;

}
