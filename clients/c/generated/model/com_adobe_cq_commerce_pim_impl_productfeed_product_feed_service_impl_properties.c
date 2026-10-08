#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties.h"



static com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_t *com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_create_internal(
    config_node_property_drop_down_t *feed_generator_algorithm
    ) {
    com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_t *com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_local_var = malloc(sizeof(com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_t));
    if (!com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_local_var, 0, sizeof(com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_t));
    com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_local_var->feed_generator_algorithm = feed_generator_algorithm;
    return com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_t *com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_create(
    config_node_property_drop_down_t *feed_generator_algorithm
    ) {
    com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_t *result = com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_create_internal (
        feed_generator_algorithm
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_free(com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_t *com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties) {
    if(NULL == com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties){
        return ;
    }
    if(com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties->feed_generator_algorithm) {
        config_node_property_drop_down_free(com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties->feed_generator_algorithm);
        com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties->feed_generator_algorithm = NULL;
    }
    free(com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties);
}

cJSON *com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_convertToJSON(com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_t *com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties->feed_generator_algorithm
    if(com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties->feed_generator_algorithm) {
    cJSON *feed_generator_algorithm_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties->feed_generator_algorithm);
    if(feed_generator_algorithm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "Feed generator algorithm", feed_generator_algorithm_local_JSON);
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

com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_t *com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_parseFromJSON(cJSON *com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_propertiesJSON){

    com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_t *com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties->feed_generator_algorithm
    config_node_property_drop_down_t *feed_generator_algorithm_local_nonprim = NULL;

    // com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties->feed_generator_algorithm
    cJSON *feed_generator_algorithm = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_propertiesJSON, "Feed generator algorithm");
    if (cJSON_IsNull(feed_generator_algorithm)) {
        feed_generator_algorithm = NULL;
    }
    if (feed_generator_algorithm) { 
    feed_generator_algorithm_local_nonprim = config_node_property_drop_down_parseFromJSON(feed_generator_algorithm); //nonprimitive
    }



    com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_local_var = com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_create_internal (
        feed_generator_algorithm ? feed_generator_algorithm_local_nonprim : NULL
        );

    if (!com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties_local_var;
end:
    if (feed_generator_algorithm_local_nonprim) {
        config_node_property_drop_down_free(feed_generator_algorithm_local_nonprim);
        feed_generator_algorithm_local_nonprim = NULL;
    }
    return NULL;

}
