/*
 * com_adobe_cq_social_handlebars_guava_template_cache_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_H_
#define _com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_t com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_t {
    struct config_node_property_boolean_t *parameter_guava_cache_enabled; //model
    struct config_node_property_string_t *parameter_guava_cache_params; //model
    struct config_node_property_boolean_t *parameter_guava_cache_reload; //model
    struct config_node_property_integer_t *service_ranking; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_t;

__attribute__((deprecated)) com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_t *com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_create(
    config_node_property_boolean_t *parameter_guava_cache_enabled,
    config_node_property_string_t *parameter_guava_cache_params,
    config_node_property_boolean_t *parameter_guava_cache_reload,
    config_node_property_integer_t *service_ranking
);

void com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_free(com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_t *com_adobe_cq_social_handlebars_guava_template_cache_impl_properties);

com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_t *com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_handlebars_guava_template_cache_impl_propertiesJSON);

cJSON *com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_convertToJSON(com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_t *com_adobe_cq_social_handlebars_guava_template_cache_impl_properties);

#endif /* _com_adobe_cq_social_handlebars_guava_template_cache_impl_properties_H_ */

