#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_resourcemerger_picker_overriding_properties.h"



static org_apache_sling_resourcemerger_picker_overriding_properties_t *org_apache_sling_resourcemerger_picker_overriding_properties_create_internal(
    config_node_property_string_t *merge_root,
    config_node_property_boolean_t *merge_read_only
    ) {
    org_apache_sling_resourcemerger_picker_overriding_properties_t *org_apache_sling_resourcemerger_picker_overriding_properties_local_var = malloc(sizeof(org_apache_sling_resourcemerger_picker_overriding_properties_t));
    if (!org_apache_sling_resourcemerger_picker_overriding_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_resourcemerger_picker_overriding_properties_local_var, 0, sizeof(org_apache_sling_resourcemerger_picker_overriding_properties_t));
    org_apache_sling_resourcemerger_picker_overriding_properties_local_var->_library_owned = 1;
    org_apache_sling_resourcemerger_picker_overriding_properties_local_var->merge_root = merge_root;
    org_apache_sling_resourcemerger_picker_overriding_properties_local_var->merge_read_only = merge_read_only;
    return org_apache_sling_resourcemerger_picker_overriding_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_resourcemerger_picker_overriding_properties_t *org_apache_sling_resourcemerger_picker_overriding_properties_create(
    config_node_property_string_t *merge_root,
    config_node_property_boolean_t *merge_read_only
    ) {
    org_apache_sling_resourcemerger_picker_overriding_properties_t *result = org_apache_sling_resourcemerger_picker_overriding_properties_create_internal (
        merge_root,
        merge_read_only
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_resourcemerger_picker_overriding_properties_free(org_apache_sling_resourcemerger_picker_overriding_properties_t *org_apache_sling_resourcemerger_picker_overriding_properties) {
    if(NULL == org_apache_sling_resourcemerger_picker_overriding_properties){
        return ;
    }
    if(org_apache_sling_resourcemerger_picker_overriding_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_resourcemerger_picker_overriding_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_resourcemerger_picker_overriding_properties->merge_root) {
        config_node_property_string_free(org_apache_sling_resourcemerger_picker_overriding_properties->merge_root);
        org_apache_sling_resourcemerger_picker_overriding_properties->merge_root = NULL;
    }
    if (org_apache_sling_resourcemerger_picker_overriding_properties->merge_read_only) {
        config_node_property_boolean_free(org_apache_sling_resourcemerger_picker_overriding_properties->merge_read_only);
        org_apache_sling_resourcemerger_picker_overriding_properties->merge_read_only = NULL;
    }
    free(org_apache_sling_resourcemerger_picker_overriding_properties);
}

cJSON *org_apache_sling_resourcemerger_picker_overriding_properties_convertToJSON(org_apache_sling_resourcemerger_picker_overriding_properties_t *org_apache_sling_resourcemerger_picker_overriding_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_resourcemerger_picker_overriding_properties->merge_root
    if(org_apache_sling_resourcemerger_picker_overriding_properties->merge_root) {
    cJSON *merge_root_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_resourcemerger_picker_overriding_properties->merge_root);
    if(merge_root_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "merge.root", merge_root_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_resourcemerger_picker_overriding_properties->merge_read_only
    if(org_apache_sling_resourcemerger_picker_overriding_properties->merge_read_only) {
    cJSON *merge_read_only_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_resourcemerger_picker_overriding_properties->merge_read_only);
    if(merge_read_only_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "merge.readOnly", merge_read_only_local_JSON);
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

org_apache_sling_resourcemerger_picker_overriding_properties_t *org_apache_sling_resourcemerger_picker_overriding_properties_parseFromJSON(cJSON *org_apache_sling_resourcemerger_picker_overriding_propertiesJSON){

    org_apache_sling_resourcemerger_picker_overriding_properties_t *org_apache_sling_resourcemerger_picker_overriding_properties_local_var = NULL;

    // define the local variable for org_apache_sling_resourcemerger_picker_overriding_properties->merge_root
    config_node_property_string_t *merge_root_local_nonprim = NULL;

    // define the local variable for org_apache_sling_resourcemerger_picker_overriding_properties->merge_read_only
    config_node_property_boolean_t *merge_read_only_local_nonprim = NULL;

    // org_apache_sling_resourcemerger_picker_overriding_properties->merge_root
    cJSON *merge_root = cJSON_GetObjectItemCaseSensitive(org_apache_sling_resourcemerger_picker_overriding_propertiesJSON, "merge.root");
    if (cJSON_IsNull(merge_root)) {
        merge_root = NULL;
    }
    if (merge_root) { 
    merge_root_local_nonprim = config_node_property_string_parseFromJSON(merge_root); //nonprimitive
    }

    // org_apache_sling_resourcemerger_picker_overriding_properties->merge_read_only
    cJSON *merge_read_only = cJSON_GetObjectItemCaseSensitive(org_apache_sling_resourcemerger_picker_overriding_propertiesJSON, "merge.readOnly");
    if (cJSON_IsNull(merge_read_only)) {
        merge_read_only = NULL;
    }
    if (merge_read_only) { 
    merge_read_only_local_nonprim = config_node_property_boolean_parseFromJSON(merge_read_only); //nonprimitive
    }



    org_apache_sling_resourcemerger_picker_overriding_properties_local_var = org_apache_sling_resourcemerger_picker_overriding_properties_create_internal (
        merge_root ? merge_root_local_nonprim : NULL,
        merge_read_only ? merge_read_only_local_nonprim : NULL
        );

    if (!org_apache_sling_resourcemerger_picker_overriding_properties_local_var) {
        goto end;
    }

    return org_apache_sling_resourcemerger_picker_overriding_properties_local_var;
end:
    if (merge_root_local_nonprim) {
        config_node_property_string_free(merge_root_local_nonprim);
        merge_root_local_nonprim = NULL;
    }
    if (merge_read_only_local_nonprim) {
        config_node_property_boolean_free(merge_read_only_local_nonprim);
        merge_read_only_local_nonprim = NULL;
    }
    return NULL;

}
