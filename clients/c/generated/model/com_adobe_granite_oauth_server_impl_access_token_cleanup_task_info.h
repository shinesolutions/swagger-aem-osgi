/*
 * com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info.h
 *
 * 
 */

#ifndef _com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_H_
#define _com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_t com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_t;

#include "com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties.h"



typedef struct com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_t {
    char *pid; // string
    char *title; // string
    char *description; // string
    struct com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties_t *properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_t;

__attribute__((deprecated)) com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_t *com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_create(
    char *pid,
    char *title,
    char *description,
    com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties_t *properties
);

void com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_free(com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_t *com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info);

com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_t *com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_parseFromJSON(cJSON *com_adobe_granite_oauth_server_impl_access_token_cleanup_task_infoJSON);

cJSON *com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_convertToJSON(com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_t *com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info);

#endif /* _com_adobe_granite_oauth_server_impl_access_token_cleanup_task_info_H_ */

