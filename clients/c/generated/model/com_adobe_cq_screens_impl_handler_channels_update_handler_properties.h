/*
 * com_adobe_cq_screens_impl_handler_channels_update_handler_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_screens_impl_handler_channels_update_handler_properties_H_
#define _com_adobe_cq_screens_impl_handler_channels_update_handler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t;

#include "config_node_property_array.h"



typedef struct com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t {
    struct config_node_property_array_t *cq_pagesupdatehandler_imageresourcetypes; //model
    struct config_node_property_array_t *cq_pagesupdatehandler_productresourcetypes; //model
    struct config_node_property_array_t *cq_pagesupdatehandler_videoresourcetypes; //model
    struct config_node_property_array_t *cq_pagesupdatehandler_dynamicsequenceresourcetypes; //model
    struct config_node_property_array_t *cq_pagesupdatehandler_previewmodepaths; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t;

__attribute__((deprecated)) com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t *com_adobe_cq_screens_impl_handler_channels_update_handler_properties_create(
    config_node_property_array_t *cq_pagesupdatehandler_imageresourcetypes,
    config_node_property_array_t *cq_pagesupdatehandler_productresourcetypes,
    config_node_property_array_t *cq_pagesupdatehandler_videoresourcetypes,
    config_node_property_array_t *cq_pagesupdatehandler_dynamicsequenceresourcetypes,
    config_node_property_array_t *cq_pagesupdatehandler_previewmodepaths
);

void com_adobe_cq_screens_impl_handler_channels_update_handler_properties_free(com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t *com_adobe_cq_screens_impl_handler_channels_update_handler_properties);

com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t *com_adobe_cq_screens_impl_handler_channels_update_handler_properties_parseFromJSON(cJSON *com_adobe_cq_screens_impl_handler_channels_update_handler_propertiesJSON);

cJSON *com_adobe_cq_screens_impl_handler_channels_update_handler_properties_convertToJSON(com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t *com_adobe_cq_screens_impl_handler_channels_update_handler_properties);

#endif /* _com_adobe_cq_screens_impl_handler_channels_update_handler_properties_H_ */

