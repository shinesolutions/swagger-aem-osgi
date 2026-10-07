#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties.h"



static com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_t *com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_create_internal(
    config_node_property_boolean_t *is_primary_publisher
    ) {
    com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_t *com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_local_var = malloc(sizeof(com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_t));
    if (!com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_local_var, 0, sizeof(com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_t));
    com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_local_var->is_primary_publisher = is_primary_publisher;
    return com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_t *com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_create(
    config_node_property_boolean_t *is_primary_publisher
    ) {
    com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_t *result = com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_create_internal (
        is_primary_publisher
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_free(com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_t *com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties) {
    if(NULL == com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties){
        return ;
    }
    if(com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties->is_primary_publisher) {
        config_node_property_boolean_free(com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties->is_primary_publisher);
        com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties->is_primary_publisher = NULL;
    }
    free(com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties);
}

cJSON *com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_convertToJSON(com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_t *com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties->is_primary_publisher
    if(com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties->is_primary_publisher) {
    cJSON *is_primary_publisher_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties->is_primary_publisher);
    if(is_primary_publisher_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "isPrimaryPublisher", is_primary_publisher_local_JSON);
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

com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_t *com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_propertiesJSON){

    com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_t *com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties->is_primary_publisher
    config_node_property_boolean_t *is_primary_publisher_local_nonprim = NULL;

    // com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties->is_primary_publisher
    cJSON *is_primary_publisher = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_propertiesJSON, "isPrimaryPublisher");
    if (cJSON_IsNull(is_primary_publisher)) {
        is_primary_publisher = NULL;
    }
    if (is_primary_publisher) { 
    is_primary_publisher_local_nonprim = config_node_property_boolean_parseFromJSON(is_primary_publisher); //nonprimitive
    }



    com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_local_var = com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_create_internal (
        is_primary_publisher ? is_primary_publisher_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties_local_var;
end:
    if (is_primary_publisher_local_nonprim) {
        config_node_property_boolean_free(is_primary_publisher_local_nonprim);
        is_primary_publisher_local_nonprim = NULL;
    }
    return NULL;

}
