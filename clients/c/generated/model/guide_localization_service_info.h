/*
 * guide_localization_service_info.h
 *
 * 
 */

#ifndef _guide_localization_service_info_H_
#define _guide_localization_service_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct guide_localization_service_info_t guide_localization_service_info_t;

#include "guide_localization_service_properties.h"



typedef struct guide_localization_service_info_t {
    char *pid; // string
    char *title; // string
    char *description; // string
    struct guide_localization_service_properties_t *properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} guide_localization_service_info_t;

__attribute__((deprecated)) guide_localization_service_info_t *guide_localization_service_info_create(
    char *pid,
    char *title,
    char *description,
    guide_localization_service_properties_t *properties
);

void guide_localization_service_info_free(guide_localization_service_info_t *guide_localization_service_info);

guide_localization_service_info_t *guide_localization_service_info_parseFromJSON(cJSON *guide_localization_service_infoJSON);

cJSON *guide_localization_service_info_convertToJSON(guide_localization_service_info_t *guide_localization_service_info);

#endif /* _guide_localization_service_info_H_ */

