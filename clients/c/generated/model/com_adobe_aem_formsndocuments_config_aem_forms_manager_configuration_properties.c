#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties.h"



static com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_t *com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_create_internal(
    config_node_property_boolean_t *forms_manager_config_include_ootb_templates,
    config_node_property_boolean_t *forms_manager_config_include_deprecated_templates
    ) {
    com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_t *com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_local_var = malloc(sizeof(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_t));
    if (!com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_local_var, 0, sizeof(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_t));
    com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_local_var->_library_owned = 1;
    com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_local_var->forms_manager_config_include_ootb_templates = forms_manager_config_include_ootb_templates;
    com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_local_var->forms_manager_config_include_deprecated_templates = forms_manager_config_include_deprecated_templates;
    return com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_local_var;
}

__attribute__((deprecated)) com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_t *com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_create(
    config_node_property_boolean_t *forms_manager_config_include_ootb_templates,
    config_node_property_boolean_t *forms_manager_config_include_deprecated_templates
    ) {
    com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_t *result = com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_create_internal (
        forms_manager_config_include_ootb_templates,
        forms_manager_config_include_deprecated_templates
        );
    if (!result) {
    }
    return result;
}

void com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_free(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_t *com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties) {
    if(NULL == com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties){
        return ;
    }
    if(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_ootb_templates) {
        config_node_property_boolean_free(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_ootb_templates);
        com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_ootb_templates = NULL;
    }
    if (com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_deprecated_templates) {
        config_node_property_boolean_free(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_deprecated_templates);
        com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_deprecated_templates = NULL;
    }
    free(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties);
}

cJSON *com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_convertToJSON(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_t *com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_ootb_templates
    if(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_ootb_templates) {
    cJSON *forms_manager_config_include_ootb_templates_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_ootb_templates);
    if(forms_manager_config_include_ootb_templates_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "formsManagerConfig.includeOOTBTemplates", forms_manager_config_include_ootb_templates_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_deprecated_templates
    if(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_deprecated_templates) {
    cJSON *forms_manager_config_include_deprecated_templates_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_deprecated_templates);
    if(forms_manager_config_include_deprecated_templates_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "formsManagerConfig.includeDeprecatedTemplates", forms_manager_config_include_deprecated_templates_local_JSON);
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

com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_t *com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_parseFromJSON(cJSON *com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_propertiesJSON){

    com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_t *com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_local_var = NULL;

    // define the local variable for com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_ootb_templates
    config_node_property_boolean_t *forms_manager_config_include_ootb_templates_local_nonprim = NULL;

    // define the local variable for com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_deprecated_templates
    config_node_property_boolean_t *forms_manager_config_include_deprecated_templates_local_nonprim = NULL;

    // com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_ootb_templates
    cJSON *forms_manager_config_include_ootb_templates = cJSON_GetObjectItemCaseSensitive(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_propertiesJSON, "formsManagerConfig.includeOOTBTemplates");
    if (cJSON_IsNull(forms_manager_config_include_ootb_templates)) {
        forms_manager_config_include_ootb_templates = NULL;
    }
    if (forms_manager_config_include_ootb_templates) { 
    forms_manager_config_include_ootb_templates_local_nonprim = config_node_property_boolean_parseFromJSON(forms_manager_config_include_ootb_templates); //nonprimitive
    }

    // com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties->forms_manager_config_include_deprecated_templates
    cJSON *forms_manager_config_include_deprecated_templates = cJSON_GetObjectItemCaseSensitive(com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_propertiesJSON, "formsManagerConfig.includeDeprecatedTemplates");
    if (cJSON_IsNull(forms_manager_config_include_deprecated_templates)) {
        forms_manager_config_include_deprecated_templates = NULL;
    }
    if (forms_manager_config_include_deprecated_templates) { 
    forms_manager_config_include_deprecated_templates_local_nonprim = config_node_property_boolean_parseFromJSON(forms_manager_config_include_deprecated_templates); //nonprimitive
    }



    com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_local_var = com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_create_internal (
        forms_manager_config_include_ootb_templates ? forms_manager_config_include_ootb_templates_local_nonprim : NULL,
        forms_manager_config_include_deprecated_templates ? forms_manager_config_include_deprecated_templates_local_nonprim : NULL
        );

    if (!com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_local_var) {
        goto end;
    }

    return com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties_local_var;
end:
    if (forms_manager_config_include_ootb_templates_local_nonprim) {
        config_node_property_boolean_free(forms_manager_config_include_ootb_templates_local_nonprim);
        forms_manager_config_include_ootb_templates_local_nonprim = NULL;
    }
    if (forms_manager_config_include_deprecated_templates_local_nonprim) {
        config_node_property_boolean_free(forms_manager_config_include_deprecated_templates_local_nonprim);
        forms_manager_config_include_deprecated_templates_local_nonprim = NULL;
    }
    return NULL;

}
