/*
 * org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_H_
#define _org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t {
    struct config_node_property_string_t *jasper_compiler_target_vm; //model
    struct config_node_property_string_t *jasper_compiler_source_vm; //model
    struct config_node_property_boolean_t *jasper_classdebuginfo; //model
    struct config_node_property_boolean_t *jasper_enable_pooling; //model
    struct config_node_property_string_t *jasper_ie_class_id; //model
    struct config_node_property_boolean_t *jasper_gen_string_as_char_array; //model
    struct config_node_property_boolean_t *jasper_keepgenerated; //model
    struct config_node_property_boolean_t *jasper_mappedfile; //model
    struct config_node_property_boolean_t *jasper_trim_spaces; //model
    struct config_node_property_boolean_t *jasper_display_source_fragments; //model
    struct config_node_property_boolean_t *default_is_session; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t;

__attribute__((deprecated)) org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_create(
    config_node_property_string_t *jasper_compiler_target_vm,
    config_node_property_string_t *jasper_compiler_source_vm,
    config_node_property_boolean_t *jasper_classdebuginfo,
    config_node_property_boolean_t *jasper_enable_pooling,
    config_node_property_string_t *jasper_ie_class_id,
    config_node_property_boolean_t *jasper_gen_string_as_char_array,
    config_node_property_boolean_t *jasper_keepgenerated,
    config_node_property_boolean_t *jasper_mappedfile,
    config_node_property_boolean_t *jasper_trim_spaces,
    config_node_property_boolean_t *jasper_display_source_fragments,
    config_node_property_boolean_t *default_is_session
);

void org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties);

org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_parseFromJSON(cJSON *org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON);

cJSON *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties);

#endif /* _org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_H_ */

