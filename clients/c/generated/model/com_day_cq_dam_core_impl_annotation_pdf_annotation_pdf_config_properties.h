/*
 * com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_H_
#define _com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t;

#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t {
    struct config_node_property_integer_t *cq_dam_config_annotation_pdf_document_width; //model
    struct config_node_property_integer_t *cq_dam_config_annotation_pdf_document_height; //model
    struct config_node_property_integer_t *cq_dam_config_annotation_pdf_document_padding_horizontal; //model
    struct config_node_property_integer_t *cq_dam_config_annotation_pdf_document_padding_vertical; //model
    struct config_node_property_integer_t *cq_dam_config_annotation_pdf_font_size; //model
    struct config_node_property_string_t *cq_dam_config_annotation_pdf_font_color; //model
    struct config_node_property_string_t *cq_dam_config_annotation_pdf_font_family; //model
    struct config_node_property_string_t *cq_dam_config_annotation_pdf_font_light; //model
    struct config_node_property_integer_t *cq_dam_config_annotation_pdf_margin_text_image; //model
    struct config_node_property_integer_t *cq_dam_config_annotation_pdf_min_image_height; //model
    struct config_node_property_integer_t *cq_dam_config_annotation_pdf_review_status_width; //model
    struct config_node_property_string_t *cq_dam_config_annotation_pdf_review_status_color_approved; //model
    struct config_node_property_string_t *cq_dam_config_annotation_pdf_review_status_color_rejected; //model
    struct config_node_property_string_t *cq_dam_config_annotation_pdf_review_status_color_changes_requested; //model
    struct config_node_property_integer_t *cq_dam_config_annotation_pdf_annotation_marker_width; //model
    struct config_node_property_integer_t *cq_dam_config_annotation_pdf_asset_minheight; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t;

__attribute__((deprecated)) com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_create(
    config_node_property_integer_t *cq_dam_config_annotation_pdf_document_width,
    config_node_property_integer_t *cq_dam_config_annotation_pdf_document_height,
    config_node_property_integer_t *cq_dam_config_annotation_pdf_document_padding_horizontal,
    config_node_property_integer_t *cq_dam_config_annotation_pdf_document_padding_vertical,
    config_node_property_integer_t *cq_dam_config_annotation_pdf_font_size,
    config_node_property_string_t *cq_dam_config_annotation_pdf_font_color,
    config_node_property_string_t *cq_dam_config_annotation_pdf_font_family,
    config_node_property_string_t *cq_dam_config_annotation_pdf_font_light,
    config_node_property_integer_t *cq_dam_config_annotation_pdf_margin_text_image,
    config_node_property_integer_t *cq_dam_config_annotation_pdf_min_image_height,
    config_node_property_integer_t *cq_dam_config_annotation_pdf_review_status_width,
    config_node_property_string_t *cq_dam_config_annotation_pdf_review_status_color_approved,
    config_node_property_string_t *cq_dam_config_annotation_pdf_review_status_color_rejected,
    config_node_property_string_t *cq_dam_config_annotation_pdf_review_status_color_changes_requested,
    config_node_property_integer_t *cq_dam_config_annotation_pdf_annotation_marker_width,
    config_node_property_integer_t *cq_dam_config_annotation_pdf_asset_minheight
);

void com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties);

com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON);

cJSON *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties);

#endif /* _com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_H_ */

