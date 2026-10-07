/*
 * messaging_user_component_factory_info.h
 *
 * 
 */

#ifndef _messaging_user_component_factory_info_H_
#define _messaging_user_component_factory_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct messaging_user_component_factory_info_t messaging_user_component_factory_info_t;

#include "messaging_user_component_factory_properties.h"



typedef struct messaging_user_component_factory_info_t {
    char *pid; // string
    char *title; // string
    char *description; // string
    struct messaging_user_component_factory_properties_t *properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} messaging_user_component_factory_info_t;

__attribute__((deprecated)) messaging_user_component_factory_info_t *messaging_user_component_factory_info_create(
    char *pid,
    char *title,
    char *description,
    messaging_user_component_factory_properties_t *properties
);

void messaging_user_component_factory_info_free(messaging_user_component_factory_info_t *messaging_user_component_factory_info);

messaging_user_component_factory_info_t *messaging_user_component_factory_info_parseFromJSON(cJSON *messaging_user_component_factory_infoJSON);

cJSON *messaging_user_component_factory_info_convertToJSON(messaging_user_component_factory_info_t *messaging_user_component_factory_info);

#endif /* _messaging_user_component_factory_info_H_ */

