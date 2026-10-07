#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties.h"



static com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_create_internal(
    config_node_property_string_t *tcp_port,
    config_node_property_boolean_t *allow_remote_access,
    config_node_property_string_t *max_render_rgn_pixels,
    config_node_property_string_t *max_message_size,
    config_node_property_integer_t *random_access_url_timeout,
    config_node_property_integer_t *worker_threads
    ) {
    com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var = malloc(sizeof(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t));
    if (!com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var, 0, sizeof(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t));
    com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var->_library_owned = 1;
    com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var->tcp_port = tcp_port;
    com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var->allow_remote_access = allow_remote_access;
    com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var->max_render_rgn_pixels = max_render_rgn_pixels;
    com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var->max_message_size = max_message_size;
    com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var->random_access_url_timeout = random_access_url_timeout;
    com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var->worker_threads = worker_threads;
    return com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_create(
    config_node_property_string_t *tcp_port,
    config_node_property_boolean_t *allow_remote_access,
    config_node_property_string_t *max_render_rgn_pixels,
    config_node_property_string_t *max_message_size,
    config_node_property_integer_t *random_access_url_timeout,
    config_node_property_integer_t *worker_threads
    ) {
    com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t *result = com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_create_internal (
        tcp_port,
        allow_remote_access,
        max_render_rgn_pixels,
        max_message_size,
        random_access_url_timeout,
        worker_threads
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_free(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties) {
    if(NULL == com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties){
        return ;
    }
    if(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->tcp_port) {
        config_node_property_string_free(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->tcp_port);
        com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->tcp_port = NULL;
    }
    if (com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->allow_remote_access) {
        config_node_property_boolean_free(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->allow_remote_access);
        com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->allow_remote_access = NULL;
    }
    if (com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_render_rgn_pixels) {
        config_node_property_string_free(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_render_rgn_pixels);
        com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_render_rgn_pixels = NULL;
    }
    if (com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_message_size) {
        config_node_property_string_free(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_message_size);
        com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_message_size = NULL;
    }
    if (com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->random_access_url_timeout) {
        config_node_property_integer_free(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->random_access_url_timeout);
        com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->random_access_url_timeout = NULL;
    }
    if (com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->worker_threads) {
        config_node_property_integer_free(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->worker_threads);
        com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->worker_threads = NULL;
    }
    free(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties);
}

cJSON *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_convertToJSON(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->tcp_port
    if(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->tcp_port) {
    cJSON *tcp_port_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->tcp_port);
    if(tcp_port_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "TcpPort", tcp_port_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->allow_remote_access
    if(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->allow_remote_access) {
    cJSON *allow_remote_access_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->allow_remote_access);
    if(allow_remote_access_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "AllowRemoteAccess", allow_remote_access_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_render_rgn_pixels
    if(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_render_rgn_pixels) {
    cJSON *max_render_rgn_pixels_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_render_rgn_pixels);
    if(max_render_rgn_pixels_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MaxRenderRgnPixels", max_render_rgn_pixels_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_message_size
    if(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_message_size) {
    cJSON *max_message_size_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_message_size);
    if(max_message_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MaxMessageSize", max_message_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->random_access_url_timeout
    if(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->random_access_url_timeout) {
    cJSON *random_access_url_timeout_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->random_access_url_timeout);
    if(random_access_url_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "RandomAccessUrlTimeout", random_access_url_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->worker_threads
    if(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->worker_threads) {
    cJSON *worker_threads_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->worker_threads);
    if(worker_threads_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "WorkerThreads", worker_threads_local_JSON);
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

com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_parseFromJSON(cJSON *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_propertiesJSON){

    com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->tcp_port
    config_node_property_string_t *tcp_port_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->allow_remote_access
    config_node_property_boolean_t *allow_remote_access_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_render_rgn_pixels
    config_node_property_string_t *max_render_rgn_pixels_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_message_size
    config_node_property_string_t *max_message_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->random_access_url_timeout
    config_node_property_integer_t *random_access_url_timeout_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->worker_threads
    config_node_property_integer_t *worker_threads_local_nonprim = NULL;

    // com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->tcp_port
    cJSON *tcp_port = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_propertiesJSON, "TcpPort");
    if (cJSON_IsNull(tcp_port)) {
        tcp_port = NULL;
    }
    if (tcp_port) { 
    tcp_port_local_nonprim = config_node_property_string_parseFromJSON(tcp_port); //nonprimitive
    }

    // com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->allow_remote_access
    cJSON *allow_remote_access = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_propertiesJSON, "AllowRemoteAccess");
    if (cJSON_IsNull(allow_remote_access)) {
        allow_remote_access = NULL;
    }
    if (allow_remote_access) { 
    allow_remote_access_local_nonprim = config_node_property_boolean_parseFromJSON(allow_remote_access); //nonprimitive
    }

    // com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_render_rgn_pixels
    cJSON *max_render_rgn_pixels = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_propertiesJSON, "MaxRenderRgnPixels");
    if (cJSON_IsNull(max_render_rgn_pixels)) {
        max_render_rgn_pixels = NULL;
    }
    if (max_render_rgn_pixels) { 
    max_render_rgn_pixels_local_nonprim = config_node_property_string_parseFromJSON(max_render_rgn_pixels); //nonprimitive
    }

    // com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->max_message_size
    cJSON *max_message_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_propertiesJSON, "MaxMessageSize");
    if (cJSON_IsNull(max_message_size)) {
        max_message_size = NULL;
    }
    if (max_message_size) { 
    max_message_size_local_nonprim = config_node_property_string_parseFromJSON(max_message_size); //nonprimitive
    }

    // com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->random_access_url_timeout
    cJSON *random_access_url_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_propertiesJSON, "RandomAccessUrlTimeout");
    if (cJSON_IsNull(random_access_url_timeout)) {
        random_access_url_timeout = NULL;
    }
    if (random_access_url_timeout) { 
    random_access_url_timeout_local_nonprim = config_node_property_integer_parseFromJSON(random_access_url_timeout); //nonprimitive
    }

    // com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties->worker_threads
    cJSON *worker_threads = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_propertiesJSON, "WorkerThreads");
    if (cJSON_IsNull(worker_threads)) {
        worker_threads = NULL;
    }
    if (worker_threads) { 
    worker_threads_local_nonprim = config_node_property_integer_parseFromJSON(worker_threads); //nonprimitive
    }



    com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var = com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_create_internal (
        tcp_port ? tcp_port_local_nonprim : NULL,
        allow_remote_access ? allow_remote_access_local_nonprim : NULL,
        max_render_rgn_pixels ? max_render_rgn_pixels_local_nonprim : NULL,
        max_message_size ? max_message_size_local_nonprim : NULL,
        random_access_url_timeout ? random_access_url_timeout_local_nonprim : NULL,
        worker_threads ? worker_threads_local_nonprim : NULL
        );

    if (!com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_local_var;
end:
    if (tcp_port_local_nonprim) {
        config_node_property_string_free(tcp_port_local_nonprim);
        tcp_port_local_nonprim = NULL;
    }
    if (allow_remote_access_local_nonprim) {
        config_node_property_boolean_free(allow_remote_access_local_nonprim);
        allow_remote_access_local_nonprim = NULL;
    }
    if (max_render_rgn_pixels_local_nonprim) {
        config_node_property_string_free(max_render_rgn_pixels_local_nonprim);
        max_render_rgn_pixels_local_nonprim = NULL;
    }
    if (max_message_size_local_nonprim) {
        config_node_property_string_free(max_message_size_local_nonprim);
        max_message_size_local_nonprim = NULL;
    }
    if (random_access_url_timeout_local_nonprim) {
        config_node_property_integer_free(random_access_url_timeout_local_nonprim);
        random_access_url_timeout_local_nonprim = NULL;
    }
    if (worker_threads_local_nonprim) {
        config_node_property_integer_free(worker_threads_local_nonprim);
        worker_threads_local_nonprim = NULL;
    }
    return NULL;

}
