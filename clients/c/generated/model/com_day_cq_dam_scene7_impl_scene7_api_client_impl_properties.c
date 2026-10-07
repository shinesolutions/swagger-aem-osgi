#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties.h"



static com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_create_internal(
    config_node_property_integer_t *cq_dam_scene7_apiclient_recordsperpage_nofilter_name,
    config_node_property_integer_t *cq_dam_scene7_apiclient_recordsperpage_withfilter_name
    ) {
    com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_t));
    if (!com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_local_var, 0, sizeof(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_t));
    com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_local_var->cq_dam_scene7_apiclient_recordsperpage_nofilter_name = cq_dam_scene7_apiclient_recordsperpage_nofilter_name;
    com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_local_var->cq_dam_scene7_apiclient_recordsperpage_withfilter_name = cq_dam_scene7_apiclient_recordsperpage_withfilter_name;
    return com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_create(
    config_node_property_integer_t *cq_dam_scene7_apiclient_recordsperpage_nofilter_name,
    config_node_property_integer_t *cq_dam_scene7_apiclient_recordsperpage_withfilter_name
    ) {
    com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_t *result = com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_create_internal (
        cq_dam_scene7_apiclient_recordsperpage_nofilter_name,
        cq_dam_scene7_apiclient_recordsperpage_withfilter_name
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_free(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties) {
    if(NULL == com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties){
        return ;
    }
    if(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_nofilter_name) {
        config_node_property_integer_free(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_nofilter_name);
        com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_nofilter_name = NULL;
    }
    if (com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_withfilter_name) {
        config_node_property_integer_free(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_withfilter_name);
        com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_withfilter_name = NULL;
    }
    free(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties);
}

cJSON *com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_convertToJSON(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_nofilter_name
    if(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_nofilter_name) {
    cJSON *cq_dam_scene7_apiclient_recordsperpage_nofilter_name_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_nofilter_name);
    if(cq_dam_scene7_apiclient_recordsperpage_nofilter_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.scene7.apiclient.recordsperpage.nofilter.name", cq_dam_scene7_apiclient_recordsperpage_nofilter_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_withfilter_name
    if(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_withfilter_name) {
    cJSON *cq_dam_scene7_apiclient_recordsperpage_withfilter_name_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_withfilter_name);
    if(cq_dam_scene7_apiclient_recordsperpage_withfilter_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.scene7.apiclient.recordsperpage.withfilter.name", cq_dam_scene7_apiclient_recordsperpage_withfilter_name_local_JSON);
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

com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_scene7_impl_scene7_api_client_impl_propertiesJSON){

    com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_nofilter_name
    config_node_property_integer_t *cq_dam_scene7_apiclient_recordsperpage_nofilter_name_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_withfilter_name
    config_node_property_integer_t *cq_dam_scene7_apiclient_recordsperpage_withfilter_name_local_nonprim = NULL;

    // com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_nofilter_name
    cJSON *cq_dam_scene7_apiclient_recordsperpage_nofilter_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_scene7_impl_scene7_api_client_impl_propertiesJSON, "cq.dam.scene7.apiclient.recordsperpage.nofilter.name");
    if (cJSON_IsNull(cq_dam_scene7_apiclient_recordsperpage_nofilter_name)) {
        cq_dam_scene7_apiclient_recordsperpage_nofilter_name = NULL;
    }
    if (cq_dam_scene7_apiclient_recordsperpage_nofilter_name) { 
    cq_dam_scene7_apiclient_recordsperpage_nofilter_name_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_scene7_apiclient_recordsperpage_nofilter_name); //nonprimitive
    }

    // com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties->cq_dam_scene7_apiclient_recordsperpage_withfilter_name
    cJSON *cq_dam_scene7_apiclient_recordsperpage_withfilter_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_scene7_impl_scene7_api_client_impl_propertiesJSON, "cq.dam.scene7.apiclient.recordsperpage.withfilter.name");
    if (cJSON_IsNull(cq_dam_scene7_apiclient_recordsperpage_withfilter_name)) {
        cq_dam_scene7_apiclient_recordsperpage_withfilter_name = NULL;
    }
    if (cq_dam_scene7_apiclient_recordsperpage_withfilter_name) { 
    cq_dam_scene7_apiclient_recordsperpage_withfilter_name_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_scene7_apiclient_recordsperpage_withfilter_name); //nonprimitive
    }



    com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_local_var = com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_create_internal (
        cq_dam_scene7_apiclient_recordsperpage_nofilter_name ? cq_dam_scene7_apiclient_recordsperpage_nofilter_name_local_nonprim : NULL,
        cq_dam_scene7_apiclient_recordsperpage_withfilter_name ? cq_dam_scene7_apiclient_recordsperpage_withfilter_name_local_nonprim : NULL
        );

    if (!com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties_local_var;
end:
    if (cq_dam_scene7_apiclient_recordsperpage_nofilter_name_local_nonprim) {
        config_node_property_integer_free(cq_dam_scene7_apiclient_recordsperpage_nofilter_name_local_nonprim);
        cq_dam_scene7_apiclient_recordsperpage_nofilter_name_local_nonprim = NULL;
    }
    if (cq_dam_scene7_apiclient_recordsperpage_withfilter_name_local_nonprim) {
        config_node_property_integer_free(cq_dam_scene7_apiclient_recordsperpage_withfilter_name_local_nonprim);
        cq_dam_scene7_apiclient_recordsperpage_withfilter_name_local_nonprim = NULL;
    }
    return NULL;

}
