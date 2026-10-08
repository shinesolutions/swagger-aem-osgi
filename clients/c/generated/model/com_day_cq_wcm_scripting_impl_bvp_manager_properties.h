/*
 * com_day_cq_wcm_scripting_impl_bvp_manager_properties.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_scripting_impl_bvp_manager_properties_H_
#define _com_day_cq_wcm_scripting_impl_bvp_manager_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_scripting_impl_bvp_manager_properties_t com_day_cq_wcm_scripting_impl_bvp_manager_properties_t;

#include "config_node_property_array.h"



typedef struct com_day_cq_wcm_scripting_impl_bvp_manager_properties_t {
    struct config_node_property_array_t *com_day_cq_wcm_scripting_bvp_script_engines; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_scripting_impl_bvp_manager_properties_t;

__attribute__((deprecated)) com_day_cq_wcm_scripting_impl_bvp_manager_properties_t *com_day_cq_wcm_scripting_impl_bvp_manager_properties_create(
    config_node_property_array_t *com_day_cq_wcm_scripting_bvp_script_engines
);

void com_day_cq_wcm_scripting_impl_bvp_manager_properties_free(com_day_cq_wcm_scripting_impl_bvp_manager_properties_t *com_day_cq_wcm_scripting_impl_bvp_manager_properties);

com_day_cq_wcm_scripting_impl_bvp_manager_properties_t *com_day_cq_wcm_scripting_impl_bvp_manager_properties_parseFromJSON(cJSON *com_day_cq_wcm_scripting_impl_bvp_manager_propertiesJSON);

cJSON *com_day_cq_wcm_scripting_impl_bvp_manager_properties_convertToJSON(com_day_cq_wcm_scripting_impl_bvp_manager_properties_t *com_day_cq_wcm_scripting_impl_bvp_manager_properties);

#endif /* _com_day_cq_wcm_scripting_impl_bvp_manager_properties_H_ */

