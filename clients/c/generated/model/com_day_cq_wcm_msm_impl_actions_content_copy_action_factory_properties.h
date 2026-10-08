/*
 * com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_H_
#define _com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_t com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_drop_down.h"



typedef struct com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_t {
    struct config_node_property_array_t *cq_wcm_msm_action_excludednodetypes; //model
    struct config_node_property_array_t *cq_wcm_msm_action_excludedparagraphitems; //model
    struct config_node_property_array_t *cq_wcm_msm_action_excludedprops; //model
    struct config_node_property_drop_down_t *contentcopyaction_order_style; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_t;

__attribute__((deprecated)) com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_t *com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_create(
    config_node_property_array_t *cq_wcm_msm_action_excludednodetypes,
    config_node_property_array_t *cq_wcm_msm_action_excludedparagraphitems,
    config_node_property_array_t *cq_wcm_msm_action_excludedprops,
    config_node_property_drop_down_t *contentcopyaction_order_style
);

void com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_free(com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_t *com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties);

com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_t *com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_parseFromJSON(cJSON *com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_propertiesJSON);

cJSON *com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_convertToJSON(com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_t *com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties);

#endif /* _com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_properties_H_ */

