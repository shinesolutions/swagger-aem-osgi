#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties.h"



static com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_create_internal(
    config_node_property_string_t *filepattern,
    config_node_property_array_t *device_groups,
    config_node_property_boolean_t *build_page_nodes,
    config_node_property_boolean_t *build_client_libs,
    config_node_property_boolean_t *build_canvas_component
    ) {
    com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var = malloc(sizeof(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t));
    if (!com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var, 0, sizeof(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t));
    com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var->filepattern = filepattern;
    com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var->device_groups = device_groups;
    com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var->build_page_nodes = build_page_nodes;
    com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var->build_client_libs = build_client_libs;
    com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var->build_canvas_component = build_canvas_component;
    return com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_create(
    config_node_property_string_t *filepattern,
    config_node_property_array_t *device_groups,
    config_node_property_boolean_t *build_page_nodes,
    config_node_property_boolean_t *build_client_libs,
    config_node_property_boolean_t *build_canvas_component
    ) {
    com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t *result = com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_create_internal (
        filepattern,
        device_groups,
        build_page_nodes,
        build_client_libs,
        build_canvas_component
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_free(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties) {
    if(NULL == com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties){
        return ;
    }
    if(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->filepattern) {
        config_node_property_string_free(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->filepattern);
        com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->filepattern = NULL;
    }
    if (com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->device_groups) {
        config_node_property_array_free(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->device_groups);
        com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->device_groups = NULL;
    }
    if (com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_page_nodes) {
        config_node_property_boolean_free(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_page_nodes);
        com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_page_nodes = NULL;
    }
    if (com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_client_libs) {
        config_node_property_boolean_free(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_client_libs);
        com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_client_libs = NULL;
    }
    if (com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_canvas_component) {
        config_node_property_boolean_free(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_canvas_component);
        com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_canvas_component = NULL;
    }
    free(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties);
}

cJSON *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_convertToJSON(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->filepattern
    if(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->filepattern) {
    cJSON *filepattern_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->filepattern);
    if(filepattern_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filepattern", filepattern_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->device_groups
    if(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->device_groups) {
    cJSON *device_groups_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->device_groups);
    if(device_groups_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "device.groups", device_groups_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_page_nodes
    if(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_page_nodes) {
    cJSON *build_page_nodes_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_page_nodes);
    if(build_page_nodes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "build.page.nodes", build_page_nodes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_client_libs
    if(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_client_libs) {
    cJSON *build_client_libs_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_client_libs);
    if(build_client_libs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "build.client.libs", build_client_libs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_canvas_component
    if(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_canvas_component) {
    cJSON *build_canvas_component_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_canvas_component);
    if(build_canvas_component_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "build.canvas.component", build_canvas_component_local_JSON);
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

com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_propertiesJSON){

    com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->filepattern
    config_node_property_string_t *filepattern_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->device_groups
    config_node_property_array_t *device_groups_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_page_nodes
    config_node_property_boolean_t *build_page_nodes_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_client_libs
    config_node_property_boolean_t *build_client_libs_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_canvas_component
    config_node_property_boolean_t *build_canvas_component_local_nonprim = NULL;

    // com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->filepattern
    cJSON *filepattern = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_propertiesJSON, "filepattern");
    if (cJSON_IsNull(filepattern)) {
        filepattern = NULL;
    }
    if (filepattern) { 
    filepattern_local_nonprim = config_node_property_string_parseFromJSON(filepattern); //nonprimitive
    }

    // com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->device_groups
    cJSON *device_groups = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_propertiesJSON, "device.groups");
    if (cJSON_IsNull(device_groups)) {
        device_groups = NULL;
    }
    if (device_groups) { 
    device_groups_local_nonprim = config_node_property_array_parseFromJSON(device_groups); //nonprimitive
    }

    // com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_page_nodes
    cJSON *build_page_nodes = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_propertiesJSON, "build.page.nodes");
    if (cJSON_IsNull(build_page_nodes)) {
        build_page_nodes = NULL;
    }
    if (build_page_nodes) { 
    build_page_nodes_local_nonprim = config_node_property_boolean_parseFromJSON(build_page_nodes); //nonprimitive
    }

    // com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_client_libs
    cJSON *build_client_libs = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_propertiesJSON, "build.client.libs");
    if (cJSON_IsNull(build_client_libs)) {
        build_client_libs = NULL;
    }
    if (build_client_libs) { 
    build_client_libs_local_nonprim = config_node_property_boolean_parseFromJSON(build_client_libs); //nonprimitive
    }

    // com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties->build_canvas_component
    cJSON *build_canvas_component = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_propertiesJSON, "build.canvas.component");
    if (cJSON_IsNull(build_canvas_component)) {
        build_canvas_component = NULL;
    }
    if (build_canvas_component) { 
    build_canvas_component_local_nonprim = config_node_property_boolean_parseFromJSON(build_canvas_component); //nonprimitive
    }



    com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var = com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_create_internal (
        filepattern ? filepattern_local_nonprim : NULL,
        device_groups ? device_groups_local_nonprim : NULL,
        build_page_nodes ? build_page_nodes_local_nonprim : NULL,
        build_client_libs ? build_client_libs_local_nonprim : NULL,
        build_canvas_component ? build_canvas_component_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_local_var;
end:
    if (filepattern_local_nonprim) {
        config_node_property_string_free(filepattern_local_nonprim);
        filepattern_local_nonprim = NULL;
    }
    if (device_groups_local_nonprim) {
        config_node_property_array_free(device_groups_local_nonprim);
        device_groups_local_nonprim = NULL;
    }
    if (build_page_nodes_local_nonprim) {
        config_node_property_boolean_free(build_page_nodes_local_nonprim);
        build_page_nodes_local_nonprim = NULL;
    }
    if (build_client_libs_local_nonprim) {
        config_node_property_boolean_free(build_client_libs_local_nonprim);
        build_client_libs_local_nonprim = NULL;
    }
    if (build_canvas_component_local_nonprim) {
        config_node_property_boolean_free(build_canvas_component_local_nonprim);
        build_canvas_component_local_nonprim = NULL;
    }
    return NULL;

}
