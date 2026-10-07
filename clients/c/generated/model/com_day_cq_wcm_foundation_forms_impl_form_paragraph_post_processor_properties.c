#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties.h"



static com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_t *com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_create_internal(
    config_node_property_boolean_t *forms_formparagraphpostprocessor_enabled,
    config_node_property_array_t *forms_formparagraphpostprocessor_formresourcetypes
    ) {
    com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_t *com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_local_var = malloc(sizeof(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_t));
    if (!com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_local_var, 0, sizeof(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_t));
    com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_local_var->forms_formparagraphpostprocessor_enabled = forms_formparagraphpostprocessor_enabled;
    com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_local_var->forms_formparagraphpostprocessor_formresourcetypes = forms_formparagraphpostprocessor_formresourcetypes;
    return com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_t *com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_create(
    config_node_property_boolean_t *forms_formparagraphpostprocessor_enabled,
    config_node_property_array_t *forms_formparagraphpostprocessor_formresourcetypes
    ) {
    com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_t *result = com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_create_internal (
        forms_formparagraphpostprocessor_enabled,
        forms_formparagraphpostprocessor_formresourcetypes
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_free(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_t *com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties) {
    if(NULL == com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties){
        return ;
    }
    if(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_enabled) {
        config_node_property_boolean_free(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_enabled);
        com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_enabled = NULL;
    }
    if (com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_formresourcetypes) {
        config_node_property_array_free(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_formresourcetypes);
        com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_formresourcetypes = NULL;
    }
    free(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties);
}

cJSON *com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_convertToJSON(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_t *com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_enabled
    if(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_enabled) {
    cJSON *forms_formparagraphpostprocessor_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_enabled);
    if(forms_formparagraphpostprocessor_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "forms.formparagraphpostprocessor.enabled", forms_formparagraphpostprocessor_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_formresourcetypes
    if(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_formresourcetypes) {
    cJSON *forms_formparagraphpostprocessor_formresourcetypes_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_formresourcetypes);
    if(forms_formparagraphpostprocessor_formresourcetypes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "forms.formparagraphpostprocessor.formresourcetypes", forms_formparagraphpostprocessor_formresourcetypes_local_JSON);
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

com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_t *com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_parseFromJSON(cJSON *com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_propertiesJSON){

    com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_t *com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_enabled
    config_node_property_boolean_t *forms_formparagraphpostprocessor_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_formresourcetypes
    config_node_property_array_t *forms_formparagraphpostprocessor_formresourcetypes_local_nonprim = NULL;

    // com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_enabled
    cJSON *forms_formparagraphpostprocessor_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_propertiesJSON, "forms.formparagraphpostprocessor.enabled");
    if (cJSON_IsNull(forms_formparagraphpostprocessor_enabled)) {
        forms_formparagraphpostprocessor_enabled = NULL;
    }
    if (forms_formparagraphpostprocessor_enabled) { 
    forms_formparagraphpostprocessor_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(forms_formparagraphpostprocessor_enabled); //nonprimitive
    }

    // com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties->forms_formparagraphpostprocessor_formresourcetypes
    cJSON *forms_formparagraphpostprocessor_formresourcetypes = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_propertiesJSON, "forms.formparagraphpostprocessor.formresourcetypes");
    if (cJSON_IsNull(forms_formparagraphpostprocessor_formresourcetypes)) {
        forms_formparagraphpostprocessor_formresourcetypes = NULL;
    }
    if (forms_formparagraphpostprocessor_formresourcetypes) { 
    forms_formparagraphpostprocessor_formresourcetypes_local_nonprim = config_node_property_array_parseFromJSON(forms_formparagraphpostprocessor_formresourcetypes); //nonprimitive
    }



    com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_local_var = com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_create_internal (
        forms_formparagraphpostprocessor_enabled ? forms_formparagraphpostprocessor_enabled_local_nonprim : NULL,
        forms_formparagraphpostprocessor_formresourcetypes ? forms_formparagraphpostprocessor_formresourcetypes_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties_local_var;
end:
    if (forms_formparagraphpostprocessor_enabled_local_nonprim) {
        config_node_property_boolean_free(forms_formparagraphpostprocessor_enabled_local_nonprim);
        forms_formparagraphpostprocessor_enabled_local_nonprim = NULL;
    }
    if (forms_formparagraphpostprocessor_formresourcetypes_local_nonprim) {
        config_node_property_array_free(forms_formparagraphpostprocessor_formresourcetypes_local_nonprim);
        forms_formparagraphpostprocessor_formresourcetypes_local_nonprim = NULL;
    }
    return NULL;

}
