#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_jcr_repoinit_repository_initializer_properties.h"



static org_apache_sling_jcr_repoinit_repository_initializer_properties_t *org_apache_sling_jcr_repoinit_repository_initializer_properties_create_internal(
    config_node_property_array_t *references,
    config_node_property_array_t *scripts
    ) {
    org_apache_sling_jcr_repoinit_repository_initializer_properties_t *org_apache_sling_jcr_repoinit_repository_initializer_properties_local_var = malloc(sizeof(org_apache_sling_jcr_repoinit_repository_initializer_properties_t));
    if (!org_apache_sling_jcr_repoinit_repository_initializer_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_jcr_repoinit_repository_initializer_properties_local_var, 0, sizeof(org_apache_sling_jcr_repoinit_repository_initializer_properties_t));
    org_apache_sling_jcr_repoinit_repository_initializer_properties_local_var->_library_owned = 1;
    org_apache_sling_jcr_repoinit_repository_initializer_properties_local_var->references = references;
    org_apache_sling_jcr_repoinit_repository_initializer_properties_local_var->scripts = scripts;
    return org_apache_sling_jcr_repoinit_repository_initializer_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_jcr_repoinit_repository_initializer_properties_t *org_apache_sling_jcr_repoinit_repository_initializer_properties_create(
    config_node_property_array_t *references,
    config_node_property_array_t *scripts
    ) {
    org_apache_sling_jcr_repoinit_repository_initializer_properties_t *result = org_apache_sling_jcr_repoinit_repository_initializer_properties_create_internal (
        references,
        scripts
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_jcr_repoinit_repository_initializer_properties_free(org_apache_sling_jcr_repoinit_repository_initializer_properties_t *org_apache_sling_jcr_repoinit_repository_initializer_properties) {
    if(NULL == org_apache_sling_jcr_repoinit_repository_initializer_properties){
        return ;
    }
    if(org_apache_sling_jcr_repoinit_repository_initializer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_jcr_repoinit_repository_initializer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_jcr_repoinit_repository_initializer_properties->references) {
        config_node_property_array_free(org_apache_sling_jcr_repoinit_repository_initializer_properties->references);
        org_apache_sling_jcr_repoinit_repository_initializer_properties->references = NULL;
    }
    if (org_apache_sling_jcr_repoinit_repository_initializer_properties->scripts) {
        config_node_property_array_free(org_apache_sling_jcr_repoinit_repository_initializer_properties->scripts);
        org_apache_sling_jcr_repoinit_repository_initializer_properties->scripts = NULL;
    }
    free(org_apache_sling_jcr_repoinit_repository_initializer_properties);
}

cJSON *org_apache_sling_jcr_repoinit_repository_initializer_properties_convertToJSON(org_apache_sling_jcr_repoinit_repository_initializer_properties_t *org_apache_sling_jcr_repoinit_repository_initializer_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_jcr_repoinit_repository_initializer_properties->references
    if(org_apache_sling_jcr_repoinit_repository_initializer_properties->references) {
    cJSON *references_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_repoinit_repository_initializer_properties->references);
    if(references_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "references", references_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_repoinit_repository_initializer_properties->scripts
    if(org_apache_sling_jcr_repoinit_repository_initializer_properties->scripts) {
    cJSON *scripts_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_repoinit_repository_initializer_properties->scripts);
    if(scripts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scripts", scripts_local_JSON);
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

org_apache_sling_jcr_repoinit_repository_initializer_properties_t *org_apache_sling_jcr_repoinit_repository_initializer_properties_parseFromJSON(cJSON *org_apache_sling_jcr_repoinit_repository_initializer_propertiesJSON){

    org_apache_sling_jcr_repoinit_repository_initializer_properties_t *org_apache_sling_jcr_repoinit_repository_initializer_properties_local_var = NULL;

    // define the local variable for org_apache_sling_jcr_repoinit_repository_initializer_properties->references
    config_node_property_array_t *references_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_repoinit_repository_initializer_properties->scripts
    config_node_property_array_t *scripts_local_nonprim = NULL;

    // org_apache_sling_jcr_repoinit_repository_initializer_properties->references
    cJSON *references = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_repoinit_repository_initializer_propertiesJSON, "references");
    if (cJSON_IsNull(references)) {
        references = NULL;
    }
    if (references) { 
    references_local_nonprim = config_node_property_array_parseFromJSON(references); //nonprimitive
    }

    // org_apache_sling_jcr_repoinit_repository_initializer_properties->scripts
    cJSON *scripts = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_repoinit_repository_initializer_propertiesJSON, "scripts");
    if (cJSON_IsNull(scripts)) {
        scripts = NULL;
    }
    if (scripts) { 
    scripts_local_nonprim = config_node_property_array_parseFromJSON(scripts); //nonprimitive
    }



    org_apache_sling_jcr_repoinit_repository_initializer_properties_local_var = org_apache_sling_jcr_repoinit_repository_initializer_properties_create_internal (
        references ? references_local_nonprim : NULL,
        scripts ? scripts_local_nonprim : NULL
        );

    if (!org_apache_sling_jcr_repoinit_repository_initializer_properties_local_var) {
        goto end;
    }

    return org_apache_sling_jcr_repoinit_repository_initializer_properties_local_var;
end:
    if (references_local_nonprim) {
        config_node_property_array_free(references_local_nonprim);
        references_local_nonprim = NULL;
    }
    if (scripts_local_nonprim) {
        config_node_property_array_free(scripts_local_nonprim);
        scripts_local_nonprim = NULL;
    }
    return NULL;

}
