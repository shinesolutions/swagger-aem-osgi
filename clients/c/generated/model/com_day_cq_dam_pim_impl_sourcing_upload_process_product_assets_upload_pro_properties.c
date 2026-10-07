#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties.h"



static com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_t *com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_create_internal(
    config_node_property_boolean_t *delete_zip_file
    ) {
    com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_t *com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_local_var = malloc(sizeof(com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_t));
    if (!com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_local_var, 0, sizeof(com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_t));
    com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_local_var->_library_owned = 1;
    com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_local_var->delete_zip_file = delete_zip_file;
    return com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_t *com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_create(
    config_node_property_boolean_t *delete_zip_file
    ) {
    com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_t *result = com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_create_internal (
        delete_zip_file
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_free(com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_t *com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties) {
    if(NULL == com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties){
        return ;
    }
    if(com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties->delete_zip_file) {
        config_node_property_boolean_free(com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties->delete_zip_file);
        com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties->delete_zip_file = NULL;
    }
    free(com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties);
}

cJSON *com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_convertToJSON(com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_t *com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties->delete_zip_file
    if(com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties->delete_zip_file) {
    cJSON *delete_zip_file_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties->delete_zip_file);
    if(delete_zip_file_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "delete.zip.file", delete_zip_file_local_JSON);
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

com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_t *com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_parseFromJSON(cJSON *com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_propertiesJSON){

    com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_t *com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties->delete_zip_file
    config_node_property_boolean_t *delete_zip_file_local_nonprim = NULL;

    // com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties->delete_zip_file
    cJSON *delete_zip_file = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_propertiesJSON, "delete.zip.file");
    if (cJSON_IsNull(delete_zip_file)) {
        delete_zip_file = NULL;
    }
    if (delete_zip_file) { 
    delete_zip_file_local_nonprim = config_node_property_boolean_parseFromJSON(delete_zip_file); //nonprimitive
    }



    com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_local_var = com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_create_internal (
        delete_zip_file ? delete_zip_file_local_nonprim : NULL
        );

    if (!com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties_local_var;
end:
    if (delete_zip_file_local_nonprim) {
        config_node_property_boolean_free(delete_zip_file_local_nonprim);
        delete_zip_file_local_nonprim = NULL;
    }
    return NULL;

}
