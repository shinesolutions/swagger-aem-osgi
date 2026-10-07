/*
 * adaptive_form_and_interactive_communication_web_channel_theme_configur_info.h
 *
 * 
 */

#ifndef _adaptive_form_and_interactive_communication_web_channel_theme_configur_info_H_
#define _adaptive_form_and_interactive_communication_web_channel_theme_configur_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct adaptive_form_and_interactive_communication_web_channel_theme_configur_info_t adaptive_form_and_interactive_communication_web_channel_theme_configur_info_t;

#include "adaptive_form_and_interactive_communication_web_channel_theme_configur_properties.h"



typedef struct adaptive_form_and_interactive_communication_web_channel_theme_configur_info_t {
    char *pid; // string
    char *title; // string
    char *description; // string
    struct adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_t *properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} adaptive_form_and_interactive_communication_web_channel_theme_configur_info_t;

__attribute__((deprecated)) adaptive_form_and_interactive_communication_web_channel_theme_configur_info_t *adaptive_form_and_interactive_communication_web_channel_theme_configur_info_create(
    char *pid,
    char *title,
    char *description,
    adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_t *properties
);

void adaptive_form_and_interactive_communication_web_channel_theme_configur_info_free(adaptive_form_and_interactive_communication_web_channel_theme_configur_info_t *adaptive_form_and_interactive_communication_web_channel_theme_configur_info);

adaptive_form_and_interactive_communication_web_channel_theme_configur_info_t *adaptive_form_and_interactive_communication_web_channel_theme_configur_info_parseFromJSON(cJSON *adaptive_form_and_interactive_communication_web_channel_theme_configur_infoJSON);

cJSON *adaptive_form_and_interactive_communication_web_channel_theme_configur_info_convertToJSON(adaptive_form_and_interactive_communication_web_channel_theme_configur_info_t *adaptive_form_and_interactive_communication_web_channel_theme_configur_info);

#endif /* _adaptive_form_and_interactive_communication_web_channel_theme_configur_info_H_ */

