#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties.h"



static com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_t *com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_create_internal(
    config_node_property_integer_t *number_of_days,
    config_node_property_integer_t *age_of_file
    ) {
    com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_t *com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_local_var = malloc(sizeof(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_t));
    if (!com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_local_var, 0, sizeof(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_t));
    com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_local_var->number_of_days = number_of_days;
    com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_local_var->age_of_file = age_of_file;
    return com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_t *com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_create(
    config_node_property_integer_t *number_of_days,
    config_node_property_integer_t *age_of_file
    ) {
    com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_t *result = com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_create_internal (
        number_of_days,
        age_of_file
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_free(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_t *com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties) {
    if(NULL == com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties){
        return ;
    }
    if(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->number_of_days) {
        config_node_property_integer_free(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->number_of_days);
        com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->number_of_days = NULL;
    }
    if (com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->age_of_file) {
        config_node_property_integer_free(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->age_of_file);
        com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->age_of_file = NULL;
    }
    free(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties);
}

cJSON *com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_convertToJSON(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_t *com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->number_of_days
    if(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->number_of_days) {
    cJSON *number_of_days_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->number_of_days);
    if(number_of_days_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "numberOfDays", number_of_days_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->age_of_file
    if(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->age_of_file) {
    cJSON *age_of_file_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->age_of_file);
    if(age_of_file_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ageOfFile", age_of_file_local_JSON);
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

com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_t *com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_propertiesJSON){

    com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_t *com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->number_of_days
    config_node_property_integer_t *number_of_days_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->age_of_file
    config_node_property_integer_t *age_of_file_local_nonprim = NULL;

    // com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->number_of_days
    cJSON *number_of_days = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_propertiesJSON, "numberOfDays");
    if (cJSON_IsNull(number_of_days)) {
        number_of_days = NULL;
    }
    if (number_of_days) { 
    number_of_days_local_nonprim = config_node_property_integer_parseFromJSON(number_of_days); //nonprimitive
    }

    // com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties->age_of_file
    cJSON *age_of_file = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_propertiesJSON, "ageOfFile");
    if (cJSON_IsNull(age_of_file)) {
        age_of_file = NULL;
    }
    if (age_of_file) { 
    age_of_file_local_nonprim = config_node_property_integer_parseFromJSON(age_of_file); //nonprimitive
    }



    com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_local_var = com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_create_internal (
        number_of_days ? number_of_days_local_nonprim : NULL,
        age_of_file ? age_of_file_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties_local_var;
end:
    if (number_of_days_local_nonprim) {
        config_node_property_integer_free(number_of_days_local_nonprim);
        number_of_days_local_nonprim = NULL;
    }
    if (age_of_file_local_nonprim) {
        config_node_property_integer_free(age_of_file_local_nonprim);
        age_of_file_local_nonprim = NULL;
    }
    return NULL;

}
