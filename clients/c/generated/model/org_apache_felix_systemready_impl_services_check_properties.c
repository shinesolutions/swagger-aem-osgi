#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_systemready_impl_services_check_properties.h"



static org_apache_felix_systemready_impl_services_check_properties_t *org_apache_felix_systemready_impl_services_check_properties_create_internal(
    config_node_property_array_t *services_list,
    config_node_property_drop_down_t *type
    ) {
    org_apache_felix_systemready_impl_services_check_properties_t *org_apache_felix_systemready_impl_services_check_properties_local_var = malloc(sizeof(org_apache_felix_systemready_impl_services_check_properties_t));
    if (!org_apache_felix_systemready_impl_services_check_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_systemready_impl_services_check_properties_local_var, 0, sizeof(org_apache_felix_systemready_impl_services_check_properties_t));
    org_apache_felix_systemready_impl_services_check_properties_local_var->_library_owned = 1;
    org_apache_felix_systemready_impl_services_check_properties_local_var->services_list = services_list;
    org_apache_felix_systemready_impl_services_check_properties_local_var->type = type;
    return org_apache_felix_systemready_impl_services_check_properties_local_var;
}

__attribute__((deprecated)) org_apache_felix_systemready_impl_services_check_properties_t *org_apache_felix_systemready_impl_services_check_properties_create(
    config_node_property_array_t *services_list,
    config_node_property_drop_down_t *type
    ) {
    org_apache_felix_systemready_impl_services_check_properties_t *result = org_apache_felix_systemready_impl_services_check_properties_create_internal (
        services_list,
        type
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_systemready_impl_services_check_properties_free(org_apache_felix_systemready_impl_services_check_properties_t *org_apache_felix_systemready_impl_services_check_properties) {
    if(NULL == org_apache_felix_systemready_impl_services_check_properties){
        return ;
    }
    if(org_apache_felix_systemready_impl_services_check_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_systemready_impl_services_check_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_systemready_impl_services_check_properties->services_list) {
        config_node_property_array_free(org_apache_felix_systemready_impl_services_check_properties->services_list);
        org_apache_felix_systemready_impl_services_check_properties->services_list = NULL;
    }
    if (org_apache_felix_systemready_impl_services_check_properties->type) {
        config_node_property_drop_down_free(org_apache_felix_systemready_impl_services_check_properties->type);
        org_apache_felix_systemready_impl_services_check_properties->type = NULL;
    }
    free(org_apache_felix_systemready_impl_services_check_properties);
}

cJSON *org_apache_felix_systemready_impl_services_check_properties_convertToJSON(org_apache_felix_systemready_impl_services_check_properties_t *org_apache_felix_systemready_impl_services_check_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_systemready_impl_services_check_properties->services_list
    if(org_apache_felix_systemready_impl_services_check_properties->services_list) {
    cJSON *services_list_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_systemready_impl_services_check_properties->services_list);
    if(services_list_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "services.list", services_list_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_systemready_impl_services_check_properties->type
    if(org_apache_felix_systemready_impl_services_check_properties->type) {
    cJSON *type_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_felix_systemready_impl_services_check_properties->type);
    if(type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
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

org_apache_felix_systemready_impl_services_check_properties_t *org_apache_felix_systemready_impl_services_check_properties_parseFromJSON(cJSON *org_apache_felix_systemready_impl_services_check_propertiesJSON){

    org_apache_felix_systemready_impl_services_check_properties_t *org_apache_felix_systemready_impl_services_check_properties_local_var = NULL;

    // define the local variable for org_apache_felix_systemready_impl_services_check_properties->services_list
    config_node_property_array_t *services_list_local_nonprim = NULL;

    // define the local variable for org_apache_felix_systemready_impl_services_check_properties->type
    config_node_property_drop_down_t *type_local_nonprim = NULL;

    // org_apache_felix_systemready_impl_services_check_properties->services_list
    cJSON *services_list = cJSON_GetObjectItemCaseSensitive(org_apache_felix_systemready_impl_services_check_propertiesJSON, "services.list");
    if (cJSON_IsNull(services_list)) {
        services_list = NULL;
    }
    if (services_list) { 
    services_list_local_nonprim = config_node_property_array_parseFromJSON(services_list); //nonprimitive
    }

    // org_apache_felix_systemready_impl_services_check_properties->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(org_apache_felix_systemready_impl_services_check_propertiesJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    type_local_nonprim = config_node_property_drop_down_parseFromJSON(type); //nonprimitive
    }



    org_apache_felix_systemready_impl_services_check_properties_local_var = org_apache_felix_systemready_impl_services_check_properties_create_internal (
        services_list ? services_list_local_nonprim : NULL,
        type ? type_local_nonprim : NULL
        );

    if (!org_apache_felix_systemready_impl_services_check_properties_local_var) {
        goto end;
    }

    return org_apache_felix_systemready_impl_services_check_properties_local_var;
end:
    if (services_list_local_nonprim) {
        config_node_property_array_free(services_list_local_nonprim);
        services_list_local_nonprim = NULL;
    }
    if (type_local_nonprim) {
        config_node_property_drop_down_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
