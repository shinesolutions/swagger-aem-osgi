#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties.h"



static com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_create_internal(
    config_node_property_array_t *pseudo_patterns
    ) {
    com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_local_var = malloc(sizeof(com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t));
    if (!com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_local_var, 0, sizeof(com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t));
    com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_local_var->_library_owned = 1;
    com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_local_var->pseudo_patterns = pseudo_patterns;
    return com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_create(
    config_node_property_array_t *pseudo_patterns
    ) {
    com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t *result = com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_create_internal (
        pseudo_patterns
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_free(com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties) {
    if(NULL == com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties){
        return ;
    }
    if(com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties->pseudo_patterns) {
        config_node_property_array_free(com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties->pseudo_patterns);
        com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties->pseudo_patterns = NULL;
    }
    free(com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties);
}

cJSON *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_convertToJSON(com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties->pseudo_patterns
    if(com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties->pseudo_patterns) {
    cJSON *pseudo_patterns_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties->pseudo_patterns);
    if(pseudo_patterns_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pseudo.patterns", pseudo_patterns_local_JSON);
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

com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_parseFromJSON(cJSON *com_adobe_granite_i18n_impl_bundle_pseudo_translations_propertiesJSON){

    com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties->pseudo_patterns
    config_node_property_array_t *pseudo_patterns_local_nonprim = NULL;

    // com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties->pseudo_patterns
    cJSON *pseudo_patterns = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_i18n_impl_bundle_pseudo_translations_propertiesJSON, "pseudo.patterns");
    if (cJSON_IsNull(pseudo_patterns)) {
        pseudo_patterns = NULL;
    }
    if (pseudo_patterns) { 
    pseudo_patterns_local_nonprim = config_node_property_array_parseFromJSON(pseudo_patterns); //nonprimitive
    }



    com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_local_var = com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_create_internal (
        pseudo_patterns ? pseudo_patterns_local_nonprim : NULL
        );

    if (!com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_local_var;
end:
    if (pseudo_patterns_local_nonprim) {
        config_node_property_array_free(pseudo_patterns_local_nonprim);
        pseudo_patterns_local_nonprim = NULL;
    }
    return NULL;

}
