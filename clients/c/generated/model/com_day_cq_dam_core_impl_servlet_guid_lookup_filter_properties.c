#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties.h"



static com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_t *com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_create_internal(
    config_node_property_boolean_t *cq_dam_core_guidlookupfilter_enabled
    ) {
    com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_t *com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_t));
    if (!com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_t));
    com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_local_var->cq_dam_core_guidlookupfilter_enabled = cq_dam_core_guidlookupfilter_enabled;
    return com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_t *com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_create(
    config_node_property_boolean_t *cq_dam_core_guidlookupfilter_enabled
    ) {
    com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_t *result = com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_create_internal (
        cq_dam_core_guidlookupfilter_enabled
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_free(com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_t *com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties) {
    if(NULL == com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties->cq_dam_core_guidlookupfilter_enabled) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties->cq_dam_core_guidlookupfilter_enabled);
        com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties->cq_dam_core_guidlookupfilter_enabled = NULL;
    }
    free(com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties);
}

cJSON *com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_convertToJSON(com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_t *com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties->cq_dam_core_guidlookupfilter_enabled
    if(com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties->cq_dam_core_guidlookupfilter_enabled) {
    cJSON *cq_dam_core_guidlookupfilter_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties->cq_dam_core_guidlookupfilter_enabled);
    if(cq_dam_core_guidlookupfilter_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.core.guidlookupfilter.enabled", cq_dam_core_guidlookupfilter_enabled_local_JSON);
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

com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_t *com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_servlet_guid_lookup_filter_propertiesJSON){

    com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_t *com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties->cq_dam_core_guidlookupfilter_enabled
    config_node_property_boolean_t *cq_dam_core_guidlookupfilter_enabled_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties->cq_dam_core_guidlookupfilter_enabled
    cJSON *cq_dam_core_guidlookupfilter_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_guid_lookup_filter_propertiesJSON, "cq.dam.core.guidlookupfilter.enabled");
    if (cJSON_IsNull(cq_dam_core_guidlookupfilter_enabled)) {
        cq_dam_core_guidlookupfilter_enabled = NULL;
    }
    if (cq_dam_core_guidlookupfilter_enabled) { 
    cq_dam_core_guidlookupfilter_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(cq_dam_core_guidlookupfilter_enabled); //nonprimitive
    }



    com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_local_var = com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_create_internal (
        cq_dam_core_guidlookupfilter_enabled ? cq_dam_core_guidlookupfilter_enabled_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties_local_var;
end:
    if (cq_dam_core_guidlookupfilter_enabled_local_nonprim) {
        config_node_property_boolean_free(cq_dam_core_guidlookupfilter_enabled_local_nonprim);
        cq_dam_core_guidlookupfilter_enabled_local_nonprim = NULL;
    }
    return NULL;

}
