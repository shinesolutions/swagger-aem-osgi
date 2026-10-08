/*
 * com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_H_
#define _com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t {
    struct config_node_property_integer_t *service_ranking; //model
    struct config_node_property_string_t *keypair_id; //model
    struct config_node_property_string_t *keypair_alias; //model
    struct config_node_property_array_t *cdnrewriter_attributes; //model
    struct config_node_property_string_t *cdn_rewriter_distribution_domain; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t;

__attribute__((deprecated)) com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_create(
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *keypair_id,
    config_node_property_string_t *keypair_alias,
    config_node_property_array_t *cdnrewriter_attributes,
    config_node_property_string_t *cdn_rewriter_distribution_domain
);

void com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_free(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties);

com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_parseFromJSON(cJSON *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propertiesJSON);

cJSON *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_convertToJSON(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_t *com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties);

#endif /* _com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_H_ */

