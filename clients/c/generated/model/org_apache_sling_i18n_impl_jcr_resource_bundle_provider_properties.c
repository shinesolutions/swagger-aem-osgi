#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties.h"



static org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_t *org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_create_internal(
    config_node_property_string_t *locale_default,
    config_node_property_boolean_t *preload_bundles,
    config_node_property_integer_t *invalidation_delay
    ) {
    org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_t *org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_local_var = malloc(sizeof(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_t));
    if (!org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_local_var, 0, sizeof(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_t));
    org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_local_var->_library_owned = 1;
    org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_local_var->locale_default = locale_default;
    org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_local_var->preload_bundles = preload_bundles;
    org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_local_var->invalidation_delay = invalidation_delay;
    return org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_t *org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_create(
    config_node_property_string_t *locale_default,
    config_node_property_boolean_t *preload_bundles,
    config_node_property_integer_t *invalidation_delay
    ) {
    org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_t *result = org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_create_internal (
        locale_default,
        preload_bundles,
        invalidation_delay
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_free(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_t *org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties) {
    if(NULL == org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties){
        return ;
    }
    if(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->locale_default) {
        config_node_property_string_free(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->locale_default);
        org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->locale_default = NULL;
    }
    if (org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->preload_bundles) {
        config_node_property_boolean_free(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->preload_bundles);
        org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->preload_bundles = NULL;
    }
    if (org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->invalidation_delay) {
        config_node_property_integer_free(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->invalidation_delay);
        org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->invalidation_delay = NULL;
    }
    free(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties);
}

cJSON *org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_convertToJSON(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_t *org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->locale_default
    if(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->locale_default) {
    cJSON *locale_default_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->locale_default);
    if(locale_default_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "locale.default", locale_default_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->preload_bundles
    if(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->preload_bundles) {
    cJSON *preload_bundles_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->preload_bundles);
    if(preload_bundles_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preload.bundles", preload_bundles_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->invalidation_delay
    if(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->invalidation_delay) {
    cJSON *invalidation_delay_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->invalidation_delay);
    if(invalidation_delay_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "invalidation.delay", invalidation_delay_local_JSON);
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

org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_t *org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_parseFromJSON(cJSON *org_apache_sling_i18n_impl_jcr_resource_bundle_provider_propertiesJSON){

    org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_t *org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_local_var = NULL;

    // define the local variable for org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->locale_default
    config_node_property_string_t *locale_default_local_nonprim = NULL;

    // define the local variable for org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->preload_bundles
    config_node_property_boolean_t *preload_bundles_local_nonprim = NULL;

    // define the local variable for org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->invalidation_delay
    config_node_property_integer_t *invalidation_delay_local_nonprim = NULL;

    // org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->locale_default
    cJSON *locale_default = cJSON_GetObjectItemCaseSensitive(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_propertiesJSON, "locale.default");
    if (cJSON_IsNull(locale_default)) {
        locale_default = NULL;
    }
    if (locale_default) { 
    locale_default_local_nonprim = config_node_property_string_parseFromJSON(locale_default); //nonprimitive
    }

    // org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->preload_bundles
    cJSON *preload_bundles = cJSON_GetObjectItemCaseSensitive(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_propertiesJSON, "preload.bundles");
    if (cJSON_IsNull(preload_bundles)) {
        preload_bundles = NULL;
    }
    if (preload_bundles) { 
    preload_bundles_local_nonprim = config_node_property_boolean_parseFromJSON(preload_bundles); //nonprimitive
    }

    // org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties->invalidation_delay
    cJSON *invalidation_delay = cJSON_GetObjectItemCaseSensitive(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_propertiesJSON, "invalidation.delay");
    if (cJSON_IsNull(invalidation_delay)) {
        invalidation_delay = NULL;
    }
    if (invalidation_delay) { 
    invalidation_delay_local_nonprim = config_node_property_integer_parseFromJSON(invalidation_delay); //nonprimitive
    }



    org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_local_var = org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_create_internal (
        locale_default ? locale_default_local_nonprim : NULL,
        preload_bundles ? preload_bundles_local_nonprim : NULL,
        invalidation_delay ? invalidation_delay_local_nonprim : NULL
        );

    if (!org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_local_var) {
        goto end;
    }

    return org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_local_var;
end:
    if (locale_default_local_nonprim) {
        config_node_property_string_free(locale_default_local_nonprim);
        locale_default_local_nonprim = NULL;
    }
    if (preload_bundles_local_nonprim) {
        config_node_property_boolean_free(preload_bundles_local_nonprim);
        preload_bundles_local_nonprim = NULL;
    }
    if (invalidation_delay_local_nonprim) {
        config_node_property_integer_free(invalidation_delay_local_nonprim);
        invalidation_delay_local_nonprim = NULL;
    }
    return NULL;

}
