/*
 * com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties.h
 *
 * 
 */

#ifndef _com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_H_
#define _com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t;

#include "config_node_property_string.h"



typedef struct com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t {
    struct config_node_property_string_t *max_connections; //model
    struct config_node_property_string_t *max_requests; //model
    struct config_node_property_string_t *request_timeout; //model
    struct config_node_property_string_t *log_dir; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t;

__attribute__((deprecated)) com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_create(
    config_node_property_string_t *max_connections,
    config_node_property_string_t *max_requests,
    config_node_property_string_t *request_timeout,
    config_node_property_string_t *log_dir
);

void com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_free(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties);

com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_parseFromJSON(cJSON *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_propertiesJSON);

cJSON *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_convertToJSON(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties);

#endif /* _com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_H_ */

