#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties.h"



static com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_create_internal(
    config_node_property_string_t *importer_user
    ) {
    com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_local_var = malloc(sizeof(com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_t));
    if (!com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_local_var, 0, sizeof(com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_t));
    com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_local_var->_library_owned = 1;
    com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_local_var->importer_user = importer_user;
    return com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_create(
    config_node_property_string_t *importer_user
    ) {
    com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_t *result = com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_create_internal (
        importer_user
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_free(com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties) {
    if(NULL == com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties){
        return ;
    }
    if(com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties->importer_user) {
        config_node_property_string_free(com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties->importer_user);
        com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties->importer_user = NULL;
    }
    free(com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties);
}

cJSON *com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_convertToJSON(com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties->importer_user
    if(com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties->importer_user) {
    cJSON *importer_user_local_JSON = config_node_property_string_convertToJSON(com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties->importer_user);
    if(importer_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "importer.user", importer_user_local_JSON);
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

com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_parseFromJSON(cJSON *com_day_cq_polling_importer_impl_managed_polling_importer_impl_propertiesJSON){

    com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties->importer_user
    config_node_property_string_t *importer_user_local_nonprim = NULL;

    // com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties->importer_user
    cJSON *importer_user = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_managed_polling_importer_impl_propertiesJSON, "importer.user");
    if (cJSON_IsNull(importer_user)) {
        importer_user = NULL;
    }
    if (importer_user) { 
    importer_user_local_nonprim = config_node_property_string_parseFromJSON(importer_user); //nonprimitive
    }



    com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_local_var = com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_create_internal (
        importer_user ? importer_user_local_nonprim : NULL
        );

    if (!com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties_local_var;
end:
    if (importer_user_local_nonprim) {
        config_node_property_string_free(importer_user_local_nonprim);
        importer_user_local_nonprim = NULL;
    }
    return NULL;

}
