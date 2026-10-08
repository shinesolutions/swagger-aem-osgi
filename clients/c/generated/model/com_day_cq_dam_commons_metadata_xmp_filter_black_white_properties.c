#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties.h"



static com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_t *com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_create_internal(
    config_node_property_boolean_t *xmp_filter_apply_whitelist,
    config_node_property_array_t *xmp_filter_whitelist,
    config_node_property_boolean_t *xmp_filter_apply_blacklist,
    config_node_property_array_t *xmp_filter_blacklist
    ) {
    com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_t *com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var = malloc(sizeof(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_t));
    if (!com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var, 0, sizeof(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_t));
    com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var->_library_owned = 1;
    com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var->xmp_filter_apply_whitelist = xmp_filter_apply_whitelist;
    com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var->xmp_filter_whitelist = xmp_filter_whitelist;
    com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var->xmp_filter_apply_blacklist = xmp_filter_apply_blacklist;
    com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var->xmp_filter_blacklist = xmp_filter_blacklist;
    return com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_t *com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_create(
    config_node_property_boolean_t *xmp_filter_apply_whitelist,
    config_node_property_array_t *xmp_filter_whitelist,
    config_node_property_boolean_t *xmp_filter_apply_blacklist,
    config_node_property_array_t *xmp_filter_blacklist
    ) {
    com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_t *result = com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_create_internal (
        xmp_filter_apply_whitelist,
        xmp_filter_whitelist,
        xmp_filter_apply_blacklist,
        xmp_filter_blacklist
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_free(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_t *com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties) {
    if(NULL == com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties){
        return ;
    }
    if(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_whitelist) {
        config_node_property_boolean_free(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_whitelist);
        com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_whitelist = NULL;
    }
    if (com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_whitelist) {
        config_node_property_array_free(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_whitelist);
        com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_whitelist = NULL;
    }
    if (com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_blacklist) {
        config_node_property_boolean_free(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_blacklist);
        com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_blacklist = NULL;
    }
    if (com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_blacklist) {
        config_node_property_array_free(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_blacklist);
        com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_blacklist = NULL;
    }
    free(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties);
}

cJSON *com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_convertToJSON(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_t *com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_whitelist
    if(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_whitelist) {
    cJSON *xmp_filter_apply_whitelist_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_whitelist);
    if(xmp_filter_apply_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "xmp.filter.apply_whitelist", xmp_filter_apply_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_whitelist
    if(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_whitelist) {
    cJSON *xmp_filter_whitelist_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_whitelist);
    if(xmp_filter_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "xmp.filter.whitelist", xmp_filter_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_blacklist
    if(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_blacklist) {
    cJSON *xmp_filter_apply_blacklist_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_blacklist);
    if(xmp_filter_apply_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "xmp.filter.apply_blacklist", xmp_filter_apply_blacklist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_blacklist
    if(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_blacklist) {
    cJSON *xmp_filter_blacklist_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_blacklist);
    if(xmp_filter_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "xmp.filter.blacklist", xmp_filter_blacklist_local_JSON);
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

com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_t *com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_parseFromJSON(cJSON *com_day_cq_dam_commons_metadata_xmp_filter_black_white_propertiesJSON){

    com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_t *com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_whitelist
    config_node_property_boolean_t *xmp_filter_apply_whitelist_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_whitelist
    config_node_property_array_t *xmp_filter_whitelist_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_blacklist
    config_node_property_boolean_t *xmp_filter_apply_blacklist_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_blacklist
    config_node_property_array_t *xmp_filter_blacklist_local_nonprim = NULL;

    // com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_whitelist
    cJSON *xmp_filter_apply_whitelist = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_commons_metadata_xmp_filter_black_white_propertiesJSON, "xmp.filter.apply_whitelist");
    if (cJSON_IsNull(xmp_filter_apply_whitelist)) {
        xmp_filter_apply_whitelist = NULL;
    }
    if (xmp_filter_apply_whitelist) { 
    xmp_filter_apply_whitelist_local_nonprim = config_node_property_boolean_parseFromJSON(xmp_filter_apply_whitelist); //nonprimitive
    }

    // com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_whitelist
    cJSON *xmp_filter_whitelist = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_commons_metadata_xmp_filter_black_white_propertiesJSON, "xmp.filter.whitelist");
    if (cJSON_IsNull(xmp_filter_whitelist)) {
        xmp_filter_whitelist = NULL;
    }
    if (xmp_filter_whitelist) { 
    xmp_filter_whitelist_local_nonprim = config_node_property_array_parseFromJSON(xmp_filter_whitelist); //nonprimitive
    }

    // com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_apply_blacklist
    cJSON *xmp_filter_apply_blacklist = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_commons_metadata_xmp_filter_black_white_propertiesJSON, "xmp.filter.apply_blacklist");
    if (cJSON_IsNull(xmp_filter_apply_blacklist)) {
        xmp_filter_apply_blacklist = NULL;
    }
    if (xmp_filter_apply_blacklist) { 
    xmp_filter_apply_blacklist_local_nonprim = config_node_property_boolean_parseFromJSON(xmp_filter_apply_blacklist); //nonprimitive
    }

    // com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties->xmp_filter_blacklist
    cJSON *xmp_filter_blacklist = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_commons_metadata_xmp_filter_black_white_propertiesJSON, "xmp.filter.blacklist");
    if (cJSON_IsNull(xmp_filter_blacklist)) {
        xmp_filter_blacklist = NULL;
    }
    if (xmp_filter_blacklist) { 
    xmp_filter_blacklist_local_nonprim = config_node_property_array_parseFromJSON(xmp_filter_blacklist); //nonprimitive
    }



    com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var = com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_create_internal (
        xmp_filter_apply_whitelist ? xmp_filter_apply_whitelist_local_nonprim : NULL,
        xmp_filter_whitelist ? xmp_filter_whitelist_local_nonprim : NULL,
        xmp_filter_apply_blacklist ? xmp_filter_apply_blacklist_local_nonprim : NULL,
        xmp_filter_blacklist ? xmp_filter_blacklist_local_nonprim : NULL
        );

    if (!com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties_local_var;
end:
    if (xmp_filter_apply_whitelist_local_nonprim) {
        config_node_property_boolean_free(xmp_filter_apply_whitelist_local_nonprim);
        xmp_filter_apply_whitelist_local_nonprim = NULL;
    }
    if (xmp_filter_whitelist_local_nonprim) {
        config_node_property_array_free(xmp_filter_whitelist_local_nonprim);
        xmp_filter_whitelist_local_nonprim = NULL;
    }
    if (xmp_filter_apply_blacklist_local_nonprim) {
        config_node_property_boolean_free(xmp_filter_apply_blacklist_local_nonprim);
        xmp_filter_apply_blacklist_local_nonprim = NULL;
    }
    if (xmp_filter_blacklist_local_nonprim) {
        config_node_property_array_free(xmp_filter_blacklist_local_nonprim);
        xmp_filter_blacklist_local_nonprim = NULL;
    }
    return NULL;

}
