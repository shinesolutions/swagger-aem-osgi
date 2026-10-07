/*
 * org_apache_sling_scripting_java_impl_java_script_engine_factory_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_H_
#define _org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t {
    struct config_node_property_boolean_t *java_classdebuginfo; //model
    struct config_node_property_string_t *java_java_encoding; //model
    struct config_node_property_string_t *java_compiler_source_vm; //model
    struct config_node_property_string_t *java_compiler_target_vm; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t;

__attribute__((deprecated)) org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_create(
    config_node_property_boolean_t *java_classdebuginfo,
    config_node_property_string_t *java_java_encoding,
    config_node_property_string_t *java_compiler_source_vm,
    config_node_property_string_t *java_compiler_target_vm
);

void org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_free(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties);

org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_parseFromJSON(cJSON *org_apache_sling_scripting_java_impl_java_script_engine_factory_propertiesJSON);

cJSON *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_convertToJSON(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties);

#endif /* _org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_H_ */

