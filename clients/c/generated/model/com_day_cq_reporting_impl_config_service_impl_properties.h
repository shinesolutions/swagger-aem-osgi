/*
 * com_day_cq_reporting_impl_config_service_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_reporting_impl_config_service_impl_properties_H_
#define _com_day_cq_reporting_impl_config_service_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_reporting_impl_config_service_impl_properties_t com_day_cq_reporting_impl_config_service_impl_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_reporting_impl_config_service_impl_properties_t {
    struct config_node_property_string_t *repconf_timezone; //model
    struct config_node_property_string_t *repconf_locale; //model
    struct config_node_property_string_t *repconf_snapshots; //model
    struct config_node_property_string_t *repconf_repdir; //model
    struct config_node_property_integer_t *repconf_hourofday; //model
    struct config_node_property_integer_t *repconf_minofhour; //model
    struct config_node_property_integer_t *repconf_maxrows; //model
    struct config_node_property_boolean_t *repconf_fakedata; //model
    struct config_node_property_string_t *repconf_snapshotuser; //model
    struct config_node_property_boolean_t *repconf_enforcesnapshotuser; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_reporting_impl_config_service_impl_properties_t;

__attribute__((deprecated)) com_day_cq_reporting_impl_config_service_impl_properties_t *com_day_cq_reporting_impl_config_service_impl_properties_create(
    config_node_property_string_t *repconf_timezone,
    config_node_property_string_t *repconf_locale,
    config_node_property_string_t *repconf_snapshots,
    config_node_property_string_t *repconf_repdir,
    config_node_property_integer_t *repconf_hourofday,
    config_node_property_integer_t *repconf_minofhour,
    config_node_property_integer_t *repconf_maxrows,
    config_node_property_boolean_t *repconf_fakedata,
    config_node_property_string_t *repconf_snapshotuser,
    config_node_property_boolean_t *repconf_enforcesnapshotuser
);

void com_day_cq_reporting_impl_config_service_impl_properties_free(com_day_cq_reporting_impl_config_service_impl_properties_t *com_day_cq_reporting_impl_config_service_impl_properties);

com_day_cq_reporting_impl_config_service_impl_properties_t *com_day_cq_reporting_impl_config_service_impl_properties_parseFromJSON(cJSON *com_day_cq_reporting_impl_config_service_impl_propertiesJSON);

cJSON *com_day_cq_reporting_impl_config_service_impl_properties_convertToJSON(com_day_cq_reporting_impl_config_service_impl_properties_t *com_day_cq_reporting_impl_config_service_impl_properties);

#endif /* _com_day_cq_reporting_impl_config_service_impl_properties_H_ */

