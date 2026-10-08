#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties.h"



static com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_t *com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_create_internal(
    config_node_property_array_t *importer_name
    ) {
    com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_t *com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_local_var = malloc(sizeof(com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_t));
    if (!com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_local_var, 0, sizeof(com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_t));
    com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_local_var->_library_owned = 1;
    com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_local_var->importer_name = importer_name;
    return com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_t *com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_create(
    config_node_property_array_t *importer_name
    ) {
    com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_t *result = com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_create_internal (
        importer_name
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_free(com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_t *com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties) {
    if(NULL == com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties){
        return ;
    }
    if(com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties->importer_name) {
        config_node_property_array_free(com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties->importer_name);
        com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties->importer_name = NULL;
    }
    free(com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties);
}

cJSON *com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_convertToJSON(com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_t *com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties->importer_name
    if(com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties->importer_name) {
    cJSON *importer_name_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties->importer_name);
    if(importer_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "importer.name", importer_name_local_JSON);
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

com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_t *com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_parseFromJSON(cJSON *com_adobe_granite_distribution_core_impl_distribution_to_replication_even_propertiesJSON){

    com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_t *com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties->importer_name
    config_node_property_array_t *importer_name_local_nonprim = NULL;

    // com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties->importer_name
    cJSON *importer_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_distribution_to_replication_even_propertiesJSON, "importer.name");
    if (cJSON_IsNull(importer_name)) {
        importer_name = NULL;
    }
    if (importer_name) { 
    importer_name_local_nonprim = config_node_property_array_parseFromJSON(importer_name); //nonprimitive
    }



    com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_local_var = com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_create_internal (
        importer_name ? importer_name_local_nonprim : NULL
        );

    if (!com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties_local_var;
end:
    if (importer_name_local_nonprim) {
        config_node_property_array_free(importer_name_local_nonprim);
        importer_name_local_nonprim = NULL;
    }
    return NULL;

}
