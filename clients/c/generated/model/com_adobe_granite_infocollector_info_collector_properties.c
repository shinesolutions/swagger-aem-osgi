#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_infocollector_info_collector_properties.h"



static com_adobe_granite_infocollector_info_collector_properties_t *com_adobe_granite_infocollector_info_collector_properties_create_internal(
    config_node_property_boolean_t *granite_infocollector_include_thread_dumps,
    config_node_property_boolean_t *granite_infocollector_include_heap_dump
    ) {
    com_adobe_granite_infocollector_info_collector_properties_t *com_adobe_granite_infocollector_info_collector_properties_local_var = malloc(sizeof(com_adobe_granite_infocollector_info_collector_properties_t));
    if (!com_adobe_granite_infocollector_info_collector_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_infocollector_info_collector_properties_local_var, 0, sizeof(com_adobe_granite_infocollector_info_collector_properties_t));
    com_adobe_granite_infocollector_info_collector_properties_local_var->_library_owned = 1;
    com_adobe_granite_infocollector_info_collector_properties_local_var->granite_infocollector_include_thread_dumps = granite_infocollector_include_thread_dumps;
    com_adobe_granite_infocollector_info_collector_properties_local_var->granite_infocollector_include_heap_dump = granite_infocollector_include_heap_dump;
    return com_adobe_granite_infocollector_info_collector_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_infocollector_info_collector_properties_t *com_adobe_granite_infocollector_info_collector_properties_create(
    config_node_property_boolean_t *granite_infocollector_include_thread_dumps,
    config_node_property_boolean_t *granite_infocollector_include_heap_dump
    ) {
    com_adobe_granite_infocollector_info_collector_properties_t *result = com_adobe_granite_infocollector_info_collector_properties_create_internal (
        granite_infocollector_include_thread_dumps,
        granite_infocollector_include_heap_dump
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_infocollector_info_collector_properties_free(com_adobe_granite_infocollector_info_collector_properties_t *com_adobe_granite_infocollector_info_collector_properties) {
    if(NULL == com_adobe_granite_infocollector_info_collector_properties){
        return ;
    }
    if(com_adobe_granite_infocollector_info_collector_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_infocollector_info_collector_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_thread_dumps) {
        config_node_property_boolean_free(com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_thread_dumps);
        com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_thread_dumps = NULL;
    }
    if (com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_heap_dump) {
        config_node_property_boolean_free(com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_heap_dump);
        com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_heap_dump = NULL;
    }
    free(com_adobe_granite_infocollector_info_collector_properties);
}

cJSON *com_adobe_granite_infocollector_info_collector_properties_convertToJSON(com_adobe_granite_infocollector_info_collector_properties_t *com_adobe_granite_infocollector_info_collector_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_thread_dumps
    if(com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_thread_dumps) {
    cJSON *granite_infocollector_include_thread_dumps_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_thread_dumps);
    if(granite_infocollector_include_thread_dumps_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.infocollector.includeThreadDumps", granite_infocollector_include_thread_dumps_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_heap_dump
    if(com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_heap_dump) {
    cJSON *granite_infocollector_include_heap_dump_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_heap_dump);
    if(granite_infocollector_include_heap_dump_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.infocollector.includeHeapDump", granite_infocollector_include_heap_dump_local_JSON);
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

com_adobe_granite_infocollector_info_collector_properties_t *com_adobe_granite_infocollector_info_collector_properties_parseFromJSON(cJSON *com_adobe_granite_infocollector_info_collector_propertiesJSON){

    com_adobe_granite_infocollector_info_collector_properties_t *com_adobe_granite_infocollector_info_collector_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_thread_dumps
    config_node_property_boolean_t *granite_infocollector_include_thread_dumps_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_heap_dump
    config_node_property_boolean_t *granite_infocollector_include_heap_dump_local_nonprim = NULL;

    // com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_thread_dumps
    cJSON *granite_infocollector_include_thread_dumps = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_infocollector_info_collector_propertiesJSON, "granite.infocollector.includeThreadDumps");
    if (cJSON_IsNull(granite_infocollector_include_thread_dumps)) {
        granite_infocollector_include_thread_dumps = NULL;
    }
    if (granite_infocollector_include_thread_dumps) { 
    granite_infocollector_include_thread_dumps_local_nonprim = config_node_property_boolean_parseFromJSON(granite_infocollector_include_thread_dumps); //nonprimitive
    }

    // com_adobe_granite_infocollector_info_collector_properties->granite_infocollector_include_heap_dump
    cJSON *granite_infocollector_include_heap_dump = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_infocollector_info_collector_propertiesJSON, "granite.infocollector.includeHeapDump");
    if (cJSON_IsNull(granite_infocollector_include_heap_dump)) {
        granite_infocollector_include_heap_dump = NULL;
    }
    if (granite_infocollector_include_heap_dump) { 
    granite_infocollector_include_heap_dump_local_nonprim = config_node_property_boolean_parseFromJSON(granite_infocollector_include_heap_dump); //nonprimitive
    }



    com_adobe_granite_infocollector_info_collector_properties_local_var = com_adobe_granite_infocollector_info_collector_properties_create_internal (
        granite_infocollector_include_thread_dumps ? granite_infocollector_include_thread_dumps_local_nonprim : NULL,
        granite_infocollector_include_heap_dump ? granite_infocollector_include_heap_dump_local_nonprim : NULL
        );

    if (!com_adobe_granite_infocollector_info_collector_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_infocollector_info_collector_properties_local_var;
end:
    if (granite_infocollector_include_thread_dumps_local_nonprim) {
        config_node_property_boolean_free(granite_infocollector_include_thread_dumps_local_nonprim);
        granite_infocollector_include_thread_dumps_local_nonprim = NULL;
    }
    if (granite_infocollector_include_heap_dump_local_nonprim) {
        config_node_property_boolean_free(granite_infocollector_include_heap_dump_local_nonprim);
        granite_infocollector_include_heap_dump_local_nonprim = NULL;
    }
    return NULL;

}
