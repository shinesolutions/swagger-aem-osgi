#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties.h"



static org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_t *org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_create_internal(
    config_node_property_integer_t *service_ranking
    ) {
    org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_t *org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_local_var = malloc(sizeof(org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_t));
    if (!org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_local_var, 0, sizeof(org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_t));
    org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_local_var->_library_owned = 1;
    org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_local_var->service_ranking = service_ranking;
    return org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_t *org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_create(
    config_node_property_integer_t *service_ranking
    ) {
    org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_t *result = org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_create_internal (
        service_ranking
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_free(org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_t *org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties) {
    if(NULL == org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties){
        return ;
    }
    if(org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties->service_ranking) {
        config_node_property_integer_free(org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties->service_ranking);
        org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties->service_ranking = NULL;
    }
    free(org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties);
}

cJSON *org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_convertToJSON(org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_t *org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties->service_ranking
    if(org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
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

org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_t *org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_parseFromJSON(cJSON *org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_propertiesJSON){

    org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_t *org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_local_var = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }



    org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_local_var = org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_create_internal (
        service_ranking ? service_ranking_local_nonprim : NULL
        );

    if (!org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_local_var) {
        goto end;
    }

    return org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties_local_var;
end:
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    return NULL;

}
