#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties.h"



static com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_t *com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_create_internal(
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name,
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name,
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name,
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name,
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name,
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name,
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name
    ) {
    com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_t *com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_t));
    if (!com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var, 0, sizeof(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_t));
    com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var->cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name = cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name;
    com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var->cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name = cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name;
    com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var->cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name = cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name;
    com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var->cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name = cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name;
    com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var->cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name = cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name;
    com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var->cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name = cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name;
    com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var->cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name = cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name;
    return com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_t *com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_create(
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name,
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name,
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name,
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name,
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name,
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name,
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name
    ) {
    com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_t *result = com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_create_internal (
        cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name,
        cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name,
        cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name,
        cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name,
        cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name,
        cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name,
        cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_free(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_t *com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties) {
    if(NULL == com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties){
        return ;
    }
    if(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name) {
        config_node_property_integer_free(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name);
        com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name = NULL;
    }
    if (com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name) {
        config_node_property_integer_free(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name);
        com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name = NULL;
    }
    if (com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name) {
        config_node_property_integer_free(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name);
        com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name = NULL;
    }
    if (com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name) {
        config_node_property_integer_free(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name);
        com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name = NULL;
    }
    if (com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name) {
        config_node_property_integer_free(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name);
        com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name = NULL;
    }
    if (com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name) {
        config_node_property_integer_free(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name);
        com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name = NULL;
    }
    if (com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name) {
        config_node_property_integer_free(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name);
        com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name = NULL;
    }
    free(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties);
}

cJSON *com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_convertToJSON(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_t *com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name
    if(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name) {
    cJSON *cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name);
    if(cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name", cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name
    if(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name) {
    cJSON *cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name);
    if(cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name", cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name
    if(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name) {
    cJSON *cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name);
    if(cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name", cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name
    if(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name) {
    cJSON *cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name);
    if(cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name", cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name
    if(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name) {
    cJSON *cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name);
    if(cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name", cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name
    if(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name) {
    cJSON *cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name);
    if(cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name", cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name
    if(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name) {
    cJSON *cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name);
    if(cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name", cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name_local_JSON);
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

com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_t *com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_propertiesJSON){

    com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_t *com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name
    config_node_property_integer_t *cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name_local_nonprim = NULL;

    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name
    cJSON *cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_propertiesJSON, "cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name");
    if (cJSON_IsNull(cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name)) {
        cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name) { 
    cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name); //nonprimitive
    }

    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name
    cJSON *cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_propertiesJSON, "cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name");
    if (cJSON_IsNull(cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name)) {
        cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name) { 
    cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name); //nonprimitive
    }

    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name
    cJSON *cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_propertiesJSON, "cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name");
    if (cJSON_IsNull(cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name)) {
        cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name) { 
    cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name); //nonprimitive
    }

    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name
    cJSON *cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_propertiesJSON, "cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name");
    if (cJSON_IsNull(cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name)) {
        cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name) { 
    cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name); //nonprimitive
    }

    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name
    cJSON *cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_propertiesJSON, "cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name");
    if (cJSON_IsNull(cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name)) {
        cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name) { 
    cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name); //nonprimitive
    }

    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name
    cJSON *cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_propertiesJSON, "cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name");
    if (cJSON_IsNull(cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name)) {
        cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name) { 
    cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name); //nonprimitive
    }

    // com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties->cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name
    cJSON *cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_propertiesJSON, "cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name");
    if (cJSON_IsNull(cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name)) {
        cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name) { 
    cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name); //nonprimitive
    }



    com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var = com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_create_internal (
        cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name ? cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name_local_nonprim : NULL,
        cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name ? cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name_local_nonprim : NULL,
        cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name ? cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name_local_nonprim : NULL,
        cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name ? cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name_local_nonprim : NULL,
        cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name ? cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name_local_nonprim : NULL,
        cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name ? cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name_local_nonprim : NULL,
        cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name ? cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name_local_nonprim : NULL
        );

    if (!com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties_local_var;
end:
    if (cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name_local_nonprim) {
        config_node_property_integer_free(cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name_local_nonprim);
        cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name_local_nonprim = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name_local_nonprim) {
        config_node_property_integer_free(cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name_local_nonprim);
        cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name_local_nonprim = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name_local_nonprim) {
        config_node_property_integer_free(cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name_local_nonprim);
        cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name_local_nonprim = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name_local_nonprim) {
        config_node_property_integer_free(cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name_local_nonprim);
        cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name_local_nonprim = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name_local_nonprim) {
        config_node_property_integer_free(cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name_local_nonprim);
        cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name_local_nonprim = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name_local_nonprim) {
        config_node_property_integer_free(cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name_local_nonprim);
        cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name_local_nonprim = NULL;
    }
    if (cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name_local_nonprim) {
        config_node_property_integer_free(cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name_local_nonprim);
        cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name_local_nonprim = NULL;
    }
    return NULL;

}
