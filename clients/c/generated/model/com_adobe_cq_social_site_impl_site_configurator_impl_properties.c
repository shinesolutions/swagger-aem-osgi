#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_site_impl_site_configurator_impl_properties.h"



static com_adobe_cq_social_site_impl_site_configurator_impl_properties_t *com_adobe_cq_social_site_impl_site_configurator_impl_properties_create_internal(
    config_node_property_array_t *components_using_tags
    ) {
    com_adobe_cq_social_site_impl_site_configurator_impl_properties_t *com_adobe_cq_social_site_impl_site_configurator_impl_properties_local_var = malloc(sizeof(com_adobe_cq_social_site_impl_site_configurator_impl_properties_t));
    if (!com_adobe_cq_social_site_impl_site_configurator_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_site_impl_site_configurator_impl_properties_local_var, 0, sizeof(com_adobe_cq_social_site_impl_site_configurator_impl_properties_t));
    com_adobe_cq_social_site_impl_site_configurator_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_site_impl_site_configurator_impl_properties_local_var->components_using_tags = components_using_tags;
    return com_adobe_cq_social_site_impl_site_configurator_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_site_impl_site_configurator_impl_properties_t *com_adobe_cq_social_site_impl_site_configurator_impl_properties_create(
    config_node_property_array_t *components_using_tags
    ) {
    com_adobe_cq_social_site_impl_site_configurator_impl_properties_t *result = com_adobe_cq_social_site_impl_site_configurator_impl_properties_create_internal (
        components_using_tags
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_site_impl_site_configurator_impl_properties_free(com_adobe_cq_social_site_impl_site_configurator_impl_properties_t *com_adobe_cq_social_site_impl_site_configurator_impl_properties) {
    if(NULL == com_adobe_cq_social_site_impl_site_configurator_impl_properties){
        return ;
    }
    if(com_adobe_cq_social_site_impl_site_configurator_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_site_impl_site_configurator_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_site_impl_site_configurator_impl_properties->components_using_tags) {
        config_node_property_array_free(com_adobe_cq_social_site_impl_site_configurator_impl_properties->components_using_tags);
        com_adobe_cq_social_site_impl_site_configurator_impl_properties->components_using_tags = NULL;
    }
    free(com_adobe_cq_social_site_impl_site_configurator_impl_properties);
}

cJSON *com_adobe_cq_social_site_impl_site_configurator_impl_properties_convertToJSON(com_adobe_cq_social_site_impl_site_configurator_impl_properties_t *com_adobe_cq_social_site_impl_site_configurator_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_site_impl_site_configurator_impl_properties->components_using_tags
    if(com_adobe_cq_social_site_impl_site_configurator_impl_properties->components_using_tags) {
    cJSON *components_using_tags_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_site_impl_site_configurator_impl_properties->components_using_tags);
    if(components_using_tags_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "componentsUsingTags", components_using_tags_local_JSON);
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

com_adobe_cq_social_site_impl_site_configurator_impl_properties_t *com_adobe_cq_social_site_impl_site_configurator_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_site_impl_site_configurator_impl_propertiesJSON){

    com_adobe_cq_social_site_impl_site_configurator_impl_properties_t *com_adobe_cq_social_site_impl_site_configurator_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_site_impl_site_configurator_impl_properties->components_using_tags
    config_node_property_array_t *components_using_tags_local_nonprim = NULL;

    // com_adobe_cq_social_site_impl_site_configurator_impl_properties->components_using_tags
    cJSON *components_using_tags = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_site_impl_site_configurator_impl_propertiesJSON, "componentsUsingTags");
    if (cJSON_IsNull(components_using_tags)) {
        components_using_tags = NULL;
    }
    if (components_using_tags) { 
    components_using_tags_local_nonprim = config_node_property_array_parseFromJSON(components_using_tags); //nonprimitive
    }



    com_adobe_cq_social_site_impl_site_configurator_impl_properties_local_var = com_adobe_cq_social_site_impl_site_configurator_impl_properties_create_internal (
        components_using_tags ? components_using_tags_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_site_impl_site_configurator_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_site_impl_site_configurator_impl_properties_local_var;
end:
    if (components_using_tags_local_nonprim) {
        config_node_property_array_free(components_using_tags_local_nonprim);
        components_using_tags_local_nonprim = NULL;
    }
    return NULL;

}
