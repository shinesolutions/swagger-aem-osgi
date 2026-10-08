#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties.h"



static org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_t *org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_create_internal(
    config_node_property_string_t *felix_inventory_printer_name,
    config_node_property_string_t *felix_inventory_printer_title,
    config_node_property_string_t *path
    ) {
    org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_t *org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_local_var = malloc(sizeof(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_t));
    if (!org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_local_var, 0, sizeof(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_t));
    org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_local_var->_library_owned = 1;
    org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_local_var->felix_inventory_printer_name = felix_inventory_printer_name;
    org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_local_var->felix_inventory_printer_title = felix_inventory_printer_title;
    org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_local_var->path = path;
    return org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_t *org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_create(
    config_node_property_string_t *felix_inventory_printer_name,
    config_node_property_string_t *felix_inventory_printer_title,
    config_node_property_string_t *path
    ) {
    org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_t *result = org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_create_internal (
        felix_inventory_printer_name,
        felix_inventory_printer_title,
        path
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_free(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_t *org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties) {
    if(NULL == org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties){
        return ;
    }
    if(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_name) {
        config_node_property_string_free(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_name);
        org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_name = NULL;
    }
    if (org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_title) {
        config_node_property_string_free(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_title);
        org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_title = NULL;
    }
    if (org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->path) {
        config_node_property_string_free(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->path);
        org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->path = NULL;
    }
    free(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties);
}

cJSON *org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_convertToJSON(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_t *org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_name
    if(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_name) {
    cJSON *felix_inventory_printer_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_name);
    if(felix_inventory_printer_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "felix.inventory.printer.name", felix_inventory_printer_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_title
    if(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_title) {
    cJSON *felix_inventory_printer_title_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_title);
    if(felix_inventory_printer_title_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "felix.inventory.printer.title", felix_inventory_printer_title_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->path
    if(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->path) {
    cJSON *path_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
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

org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_t *org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_parseFromJSON(cJSON *org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_propertiesJSON){

    org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_t *org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_local_var = NULL;

    // define the local variable for org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_name
    config_node_property_string_t *felix_inventory_printer_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_title
    config_node_property_string_t *felix_inventory_printer_title_local_nonprim = NULL;

    // define the local variable for org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->path
    config_node_property_string_t *path_local_nonprim = NULL;

    // org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_name
    cJSON *felix_inventory_printer_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_propertiesJSON, "felix.inventory.printer.name");
    if (cJSON_IsNull(felix_inventory_printer_name)) {
        felix_inventory_printer_name = NULL;
    }
    if (felix_inventory_printer_name) { 
    felix_inventory_printer_name_local_nonprim = config_node_property_string_parseFromJSON(felix_inventory_printer_name); //nonprimitive
    }

    // org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->felix_inventory_printer_title
    cJSON *felix_inventory_printer_title = cJSON_GetObjectItemCaseSensitive(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_propertiesJSON, "felix.inventory.printer.title");
    if (cJSON_IsNull(felix_inventory_printer_title)) {
        felix_inventory_printer_title = NULL;
    }
    if (felix_inventory_printer_title) { 
    felix_inventory_printer_title_local_nonprim = config_node_property_string_parseFromJSON(felix_inventory_printer_title); //nonprimitive
    }

    // org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_string_parseFromJSON(path); //nonprimitive
    }



    org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_local_var = org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_create_internal (
        felix_inventory_printer_name ? felix_inventory_printer_name_local_nonprim : NULL,
        felix_inventory_printer_title ? felix_inventory_printer_title_local_nonprim : NULL,
        path ? path_local_nonprim : NULL
        );

    if (!org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_local_var) {
        goto end;
    }

    return org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties_local_var;
end:
    if (felix_inventory_printer_name_local_nonprim) {
        config_node_property_string_free(felix_inventory_printer_name_local_nonprim);
        felix_inventory_printer_name_local_nonprim = NULL;
    }
    if (felix_inventory_printer_title_local_nonprim) {
        config_node_property_string_free(felix_inventory_printer_title_local_nonprim);
        felix_inventory_printer_title_local_nonprim = NULL;
    }
    if (path_local_nonprim) {
        config_node_property_string_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    return NULL;

}
