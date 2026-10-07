#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties.h"



static com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_t *com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_create_internal(
    config_node_property_boolean_t *disabled
    ) {
    com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_t *com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_local_var = malloc(sizeof(com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_t));
    if (!com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_local_var, 0, sizeof(com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_t));
    com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_local_var->_library_owned = 1;
    com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_local_var->disabled = disabled;
    return com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_t *com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_create(
    config_node_property_boolean_t *disabled
    ) {
    com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_t *result = com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_create_internal (
        disabled
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_free(com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_t *com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties) {
    if(NULL == com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties){
        return ;
    }
    if(com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties->disabled) {
        config_node_property_boolean_free(com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties->disabled);
        com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties->disabled = NULL;
    }
    free(com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties);
}

cJSON *com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_convertToJSON(com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_t *com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties->disabled
    if(com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties->disabled) {
    cJSON *disabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties->disabled);
    if(disabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "disabled", disabled_local_JSON);
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

com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_t *com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_parseFromJSON(cJSON *com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_propertiesJSON){

    com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_t *com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties->disabled
    config_node_property_boolean_t *disabled_local_nonprim = NULL;

    // com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties->disabled
    cJSON *disabled = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_propertiesJSON, "disabled");
    if (cJSON_IsNull(disabled)) {
        disabled = NULL;
    }
    if (disabled) { 
    disabled_local_nonprim = config_node_property_boolean_parseFromJSON(disabled); //nonprimitive
    }



    com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_local_var = com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_create_internal (
        disabled ? disabled_local_nonprim : NULL
        );

    if (!com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties_local_var;
end:
    if (disabled_local_nonprim) {
        config_node_property_boolean_free(disabled_local_nonprim);
        disabled_local_nonprim = NULL;
    }
    return NULL;

}
