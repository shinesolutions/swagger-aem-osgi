#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties.h"



static com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_create_internal(
    config_node_property_string_t *service_name,
    config_node_property_string_t *sling_servlet_resource_types,
    config_node_property_string_t *sling_servlet_selectors,
    config_node_property_array_t *sling_servlet_methods,
    config_node_property_boolean_t *forms_formchooserservlet_advansesearch_require
    ) {
    com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var = malloc(sizeof(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_t));
    if (!com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var, 0, sizeof(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_t));
    com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var->service_name = service_name;
    com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var->sling_servlet_resource_types = sling_servlet_resource_types;
    com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var->sling_servlet_selectors = sling_servlet_selectors;
    com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var->sling_servlet_methods = sling_servlet_methods;
    com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var->forms_formchooserservlet_advansesearch_require = forms_formchooserservlet_advansesearch_require;
    return com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_create(
    config_node_property_string_t *service_name,
    config_node_property_string_t *sling_servlet_resource_types,
    config_node_property_string_t *sling_servlet_selectors,
    config_node_property_array_t *sling_servlet_methods,
    config_node_property_boolean_t *forms_formchooserservlet_advansesearch_require
    ) {
    com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_t *result = com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_create_internal (
        service_name,
        sling_servlet_resource_types,
        sling_servlet_selectors,
        sling_servlet_methods,
        forms_formchooserservlet_advansesearch_require
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_free(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties) {
    if(NULL == com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties){
        return ;
    }
    if(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->service_name) {
        config_node_property_string_free(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->service_name);
        com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->service_name = NULL;
    }
    if (com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_resource_types) {
        config_node_property_string_free(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_resource_types);
        com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_resource_types = NULL;
    }
    if (com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_selectors) {
        config_node_property_string_free(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_selectors);
        com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_selectors = NULL;
    }
    if (com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_methods) {
        config_node_property_array_free(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_methods);
        com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_methods = NULL;
    }
    if (com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->forms_formchooserservlet_advansesearch_require) {
        config_node_property_boolean_free(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->forms_formchooserservlet_advansesearch_require);
        com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->forms_formchooserservlet_advansesearch_require = NULL;
    }
    free(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties);
}

cJSON *com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_convertToJSON(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->service_name
    if(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->service_name) {
    cJSON *service_name_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->service_name);
    if(service_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.name", service_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_resource_types
    if(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_resource_types) {
    cJSON *sling_servlet_resource_types_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_resource_types);
    if(sling_servlet_resource_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.resourceTypes", sling_servlet_resource_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_selectors
    if(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_selectors) {
    cJSON *sling_servlet_selectors_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_selectors);
    if(sling_servlet_selectors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.selectors", sling_servlet_selectors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_methods
    if(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_methods) {
    cJSON *sling_servlet_methods_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_methods);
    if(sling_servlet_methods_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.methods", sling_servlet_methods_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->forms_formchooserservlet_advansesearch_require
    if(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->forms_formchooserservlet_advansesearch_require) {
    cJSON *forms_formchooserservlet_advansesearch_require_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->forms_formchooserservlet_advansesearch_require);
    if(forms_formchooserservlet_advansesearch_require_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "forms.formchooserservlet.advansesearch.require", forms_formchooserservlet_advansesearch_require_local_JSON);
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

com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_parseFromJSON(cJSON *com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_propertiesJSON){

    com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->service_name
    config_node_property_string_t *service_name_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_resource_types
    config_node_property_string_t *sling_servlet_resource_types_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_selectors
    config_node_property_string_t *sling_servlet_selectors_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_methods
    config_node_property_array_t *sling_servlet_methods_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->forms_formchooserservlet_advansesearch_require
    config_node_property_boolean_t *forms_formchooserservlet_advansesearch_require_local_nonprim = NULL;

    // com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->service_name
    cJSON *service_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_propertiesJSON, "service.name");
    if (cJSON_IsNull(service_name)) {
        service_name = NULL;
    }
    if (service_name) { 
    service_name_local_nonprim = config_node_property_string_parseFromJSON(service_name); //nonprimitive
    }

    // com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_resource_types
    cJSON *sling_servlet_resource_types = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_propertiesJSON, "sling.servlet.resourceTypes");
    if (cJSON_IsNull(sling_servlet_resource_types)) {
        sling_servlet_resource_types = NULL;
    }
    if (sling_servlet_resource_types) { 
    sling_servlet_resource_types_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_resource_types); //nonprimitive
    }

    // com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_selectors
    cJSON *sling_servlet_selectors = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_propertiesJSON, "sling.servlet.selectors");
    if (cJSON_IsNull(sling_servlet_selectors)) {
        sling_servlet_selectors = NULL;
    }
    if (sling_servlet_selectors) { 
    sling_servlet_selectors_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_selectors); //nonprimitive
    }

    // com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->sling_servlet_methods
    cJSON *sling_servlet_methods = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_propertiesJSON, "sling.servlet.methods");
    if (cJSON_IsNull(sling_servlet_methods)) {
        sling_servlet_methods = NULL;
    }
    if (sling_servlet_methods) { 
    sling_servlet_methods_local_nonprim = config_node_property_array_parseFromJSON(sling_servlet_methods); //nonprimitive
    }

    // com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties->forms_formchooserservlet_advansesearch_require
    cJSON *forms_formchooserservlet_advansesearch_require = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_propertiesJSON, "forms.formchooserservlet.advansesearch.require");
    if (cJSON_IsNull(forms_formchooserservlet_advansesearch_require)) {
        forms_formchooserservlet_advansesearch_require = NULL;
    }
    if (forms_formchooserservlet_advansesearch_require) { 
    forms_formchooserservlet_advansesearch_require_local_nonprim = config_node_property_boolean_parseFromJSON(forms_formchooserservlet_advansesearch_require); //nonprimitive
    }



    com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var = com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_create_internal (
        service_name ? service_name_local_nonprim : NULL,
        sling_servlet_resource_types ? sling_servlet_resource_types_local_nonprim : NULL,
        sling_servlet_selectors ? sling_servlet_selectors_local_nonprim : NULL,
        sling_servlet_methods ? sling_servlet_methods_local_nonprim : NULL,
        forms_formchooserservlet_advansesearch_require ? forms_formchooserservlet_advansesearch_require_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties_local_var;
end:
    if (service_name_local_nonprim) {
        config_node_property_string_free(service_name_local_nonprim);
        service_name_local_nonprim = NULL;
    }
    if (sling_servlet_resource_types_local_nonprim) {
        config_node_property_string_free(sling_servlet_resource_types_local_nonprim);
        sling_servlet_resource_types_local_nonprim = NULL;
    }
    if (sling_servlet_selectors_local_nonprim) {
        config_node_property_string_free(sling_servlet_selectors_local_nonprim);
        sling_servlet_selectors_local_nonprim = NULL;
    }
    if (sling_servlet_methods_local_nonprim) {
        config_node_property_array_free(sling_servlet_methods_local_nonprim);
        sling_servlet_methods_local_nonprim = NULL;
    }
    if (forms_formchooserservlet_advansesearch_require_local_nonprim) {
        config_node_property_boolean_free(forms_formchooserservlet_advansesearch_require_local_nonprim);
        forms_formchooserservlet_advansesearch_require_local_nonprim = NULL;
    }
    return NULL;

}
