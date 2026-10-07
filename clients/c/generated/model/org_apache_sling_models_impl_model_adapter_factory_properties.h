/*
 * org_apache_sling_models_impl_model_adapter_factory_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_models_impl_model_adapter_factory_properties_H_
#define _org_apache_sling_models_impl_model_adapter_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_models_impl_model_adapter_factory_properties_t org_apache_sling_models_impl_model_adapter_factory_properties_t;

#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_models_impl_model_adapter_factory_properties_t {
    struct config_node_property_string_t *osgi_http_whiteboard_listener; //model
    struct config_node_property_string_t *osgi_http_whiteboard_context_select; //model
    struct config_node_property_integer_t *max_recursion_depth; //model
    struct config_node_property_integer_t *cleanup_job_period; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_models_impl_model_adapter_factory_properties_t;

__attribute__((deprecated)) org_apache_sling_models_impl_model_adapter_factory_properties_t *org_apache_sling_models_impl_model_adapter_factory_properties_create(
    config_node_property_string_t *osgi_http_whiteboard_listener,
    config_node_property_string_t *osgi_http_whiteboard_context_select,
    config_node_property_integer_t *max_recursion_depth,
    config_node_property_integer_t *cleanup_job_period
);

void org_apache_sling_models_impl_model_adapter_factory_properties_free(org_apache_sling_models_impl_model_adapter_factory_properties_t *org_apache_sling_models_impl_model_adapter_factory_properties);

org_apache_sling_models_impl_model_adapter_factory_properties_t *org_apache_sling_models_impl_model_adapter_factory_properties_parseFromJSON(cJSON *org_apache_sling_models_impl_model_adapter_factory_propertiesJSON);

cJSON *org_apache_sling_models_impl_model_adapter_factory_properties_convertToJSON(org_apache_sling_models_impl_model_adapter_factory_properties_t *org_apache_sling_models_impl_model_adapter_factory_properties);

#endif /* _org_apache_sling_models_impl_model_adapter_factory_properties_H_ */

