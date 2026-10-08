#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties.h"



static com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_create_internal(
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
    ) {
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t));
    if (!com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t));
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_document_width = cq_dam_config_annotation_pdf_document_width;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_document_height = cq_dam_config_annotation_pdf_document_height;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_document_padding_horizontal = cq_dam_config_annotation_pdf_document_padding_horizontal;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_document_padding_vertical = cq_dam_config_annotation_pdf_document_padding_vertical;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_font_size = cq_dam_config_annotation_pdf_font_size;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_font_color = cq_dam_config_annotation_pdf_font_color;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_font_family = cq_dam_config_annotation_pdf_font_family;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_font_light = cq_dam_config_annotation_pdf_font_light;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_margin_text_image = cq_dam_config_annotation_pdf_margin_text_image;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_min_image_height = cq_dam_config_annotation_pdf_min_image_height;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_review_status_width = cq_dam_config_annotation_pdf_review_status_width;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_review_status_color_approved = cq_dam_config_annotation_pdf_review_status_color_approved;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_review_status_color_rejected = cq_dam_config_annotation_pdf_review_status_color_rejected;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_review_status_color_changes_requested = cq_dam_config_annotation_pdf_review_status_color_changes_requested;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_annotation_marker_width = cq_dam_config_annotation_pdf_annotation_marker_width;
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var->cq_dam_config_annotation_pdf_asset_minheight = cq_dam_config_annotation_pdf_asset_minheight;
    return com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var;
}

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
    ) {
    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t *result = com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_create_internal (
        cq_dam_config_annotation_pdf_document_width,
        cq_dam_config_annotation_pdf_document_height,
        cq_dam_config_annotation_pdf_document_padding_horizontal,
        cq_dam_config_annotation_pdf_document_padding_vertical,
        cq_dam_config_annotation_pdf_font_size,
        cq_dam_config_annotation_pdf_font_color,
        cq_dam_config_annotation_pdf_font_family,
        cq_dam_config_annotation_pdf_font_light,
        cq_dam_config_annotation_pdf_margin_text_image,
        cq_dam_config_annotation_pdf_min_image_height,
        cq_dam_config_annotation_pdf_review_status_width,
        cq_dam_config_annotation_pdf_review_status_color_approved,
        cq_dam_config_annotation_pdf_review_status_color_rejected,
        cq_dam_config_annotation_pdf_review_status_color_changes_requested,
        cq_dam_config_annotation_pdf_annotation_marker_width,
        cq_dam_config_annotation_pdf_asset_minheight
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties) {
    if(NULL == com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_width) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_width);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_width = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_height) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_height);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_height = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_horizontal) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_horizontal);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_horizontal = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_vertical) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_vertical);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_vertical = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_size) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_size);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_size = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_color) {
        config_node_property_string_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_color);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_color = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_family) {
        config_node_property_string_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_family);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_family = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_light) {
        config_node_property_string_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_light);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_light = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_margin_text_image) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_margin_text_image);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_margin_text_image = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_min_image_height) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_min_image_height);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_min_image_height = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_width) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_width);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_width = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_approved) {
        config_node_property_string_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_approved);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_approved = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_rejected) {
        config_node_property_string_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_rejected);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_rejected = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_changes_requested) {
        config_node_property_string_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_changes_requested);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_changes_requested = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_annotation_marker_width) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_annotation_marker_width);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_annotation_marker_width = NULL;
    }
    if (com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_asset_minheight) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_asset_minheight);
        com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_asset_minheight = NULL;
    }
    free(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties);
}

cJSON *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_width
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_width) {
    cJSON *cq_dam_config_annotation_pdf_document_width_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_width);
    if(cq_dam_config_annotation_pdf_document_width_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.document.width", cq_dam_config_annotation_pdf_document_width_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_height
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_height) {
    cJSON *cq_dam_config_annotation_pdf_document_height_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_height);
    if(cq_dam_config_annotation_pdf_document_height_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.document.height", cq_dam_config_annotation_pdf_document_height_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_horizontal
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_horizontal) {
    cJSON *cq_dam_config_annotation_pdf_document_padding_horizontal_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_horizontal);
    if(cq_dam_config_annotation_pdf_document_padding_horizontal_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.document.padding.horizontal", cq_dam_config_annotation_pdf_document_padding_horizontal_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_vertical
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_vertical) {
    cJSON *cq_dam_config_annotation_pdf_document_padding_vertical_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_vertical);
    if(cq_dam_config_annotation_pdf_document_padding_vertical_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.document.padding.vertical", cq_dam_config_annotation_pdf_document_padding_vertical_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_size
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_size) {
    cJSON *cq_dam_config_annotation_pdf_font_size_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_size);
    if(cq_dam_config_annotation_pdf_font_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.font.size", cq_dam_config_annotation_pdf_font_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_color
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_color) {
    cJSON *cq_dam_config_annotation_pdf_font_color_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_color);
    if(cq_dam_config_annotation_pdf_font_color_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.font.color", cq_dam_config_annotation_pdf_font_color_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_family
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_family) {
    cJSON *cq_dam_config_annotation_pdf_font_family_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_family);
    if(cq_dam_config_annotation_pdf_font_family_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.font.family", cq_dam_config_annotation_pdf_font_family_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_light
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_light) {
    cJSON *cq_dam_config_annotation_pdf_font_light_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_light);
    if(cq_dam_config_annotation_pdf_font_light_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.font.light", cq_dam_config_annotation_pdf_font_light_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_margin_text_image
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_margin_text_image) {
    cJSON *cq_dam_config_annotation_pdf_margin_text_image_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_margin_text_image);
    if(cq_dam_config_annotation_pdf_margin_text_image_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.marginTextImage", cq_dam_config_annotation_pdf_margin_text_image_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_min_image_height
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_min_image_height) {
    cJSON *cq_dam_config_annotation_pdf_min_image_height_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_min_image_height);
    if(cq_dam_config_annotation_pdf_min_image_height_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.minImageHeight", cq_dam_config_annotation_pdf_min_image_height_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_width
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_width) {
    cJSON *cq_dam_config_annotation_pdf_review_status_width_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_width);
    if(cq_dam_config_annotation_pdf_review_status_width_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.reviewStatus.width", cq_dam_config_annotation_pdf_review_status_width_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_approved
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_approved) {
    cJSON *cq_dam_config_annotation_pdf_review_status_color_approved_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_approved);
    if(cq_dam_config_annotation_pdf_review_status_color_approved_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.reviewStatus.color.approved", cq_dam_config_annotation_pdf_review_status_color_approved_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_rejected
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_rejected) {
    cJSON *cq_dam_config_annotation_pdf_review_status_color_rejected_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_rejected);
    if(cq_dam_config_annotation_pdf_review_status_color_rejected_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.reviewStatus.color.rejected", cq_dam_config_annotation_pdf_review_status_color_rejected_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_changes_requested
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_changes_requested) {
    cJSON *cq_dam_config_annotation_pdf_review_status_color_changes_requested_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_changes_requested);
    if(cq_dam_config_annotation_pdf_review_status_color_changes_requested_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested", cq_dam_config_annotation_pdf_review_status_color_changes_requested_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_annotation_marker_width
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_annotation_marker_width) {
    cJSON *cq_dam_config_annotation_pdf_annotation_marker_width_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_annotation_marker_width);
    if(cq_dam_config_annotation_pdf_annotation_marker_width_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.annotationMarker.width", cq_dam_config_annotation_pdf_annotation_marker_width_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_asset_minheight
    if(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_asset_minheight) {
    cJSON *cq_dam_config_annotation_pdf_asset_minheight_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_asset_minheight);
    if(cq_dam_config_annotation_pdf_asset_minheight_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.config.annotation.pdf.asset.minheight", cq_dam_config_annotation_pdf_asset_minheight_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON){

    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_t *com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_width
    config_node_property_integer_t *cq_dam_config_annotation_pdf_document_width_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_height
    config_node_property_integer_t *cq_dam_config_annotation_pdf_document_height_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_horizontal
    config_node_property_integer_t *cq_dam_config_annotation_pdf_document_padding_horizontal_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_vertical
    config_node_property_integer_t *cq_dam_config_annotation_pdf_document_padding_vertical_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_size
    config_node_property_integer_t *cq_dam_config_annotation_pdf_font_size_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_color
    config_node_property_string_t *cq_dam_config_annotation_pdf_font_color_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_family
    config_node_property_string_t *cq_dam_config_annotation_pdf_font_family_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_light
    config_node_property_string_t *cq_dam_config_annotation_pdf_font_light_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_margin_text_image
    config_node_property_integer_t *cq_dam_config_annotation_pdf_margin_text_image_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_min_image_height
    config_node_property_integer_t *cq_dam_config_annotation_pdf_min_image_height_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_width
    config_node_property_integer_t *cq_dam_config_annotation_pdf_review_status_width_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_approved
    config_node_property_string_t *cq_dam_config_annotation_pdf_review_status_color_approved_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_rejected
    config_node_property_string_t *cq_dam_config_annotation_pdf_review_status_color_rejected_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_changes_requested
    config_node_property_string_t *cq_dam_config_annotation_pdf_review_status_color_changes_requested_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_annotation_marker_width
    config_node_property_integer_t *cq_dam_config_annotation_pdf_annotation_marker_width_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_asset_minheight
    config_node_property_integer_t *cq_dam_config_annotation_pdf_asset_minheight_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_width
    cJSON *cq_dam_config_annotation_pdf_document_width = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.document.width");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_document_width)) {
        cq_dam_config_annotation_pdf_document_width = NULL;
    }
    if (cq_dam_config_annotation_pdf_document_width) { 
    cq_dam_config_annotation_pdf_document_width_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_config_annotation_pdf_document_width); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_height
    cJSON *cq_dam_config_annotation_pdf_document_height = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.document.height");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_document_height)) {
        cq_dam_config_annotation_pdf_document_height = NULL;
    }
    if (cq_dam_config_annotation_pdf_document_height) { 
    cq_dam_config_annotation_pdf_document_height_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_config_annotation_pdf_document_height); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_horizontal
    cJSON *cq_dam_config_annotation_pdf_document_padding_horizontal = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.document.padding.horizontal");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_document_padding_horizontal)) {
        cq_dam_config_annotation_pdf_document_padding_horizontal = NULL;
    }
    if (cq_dam_config_annotation_pdf_document_padding_horizontal) { 
    cq_dam_config_annotation_pdf_document_padding_horizontal_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_config_annotation_pdf_document_padding_horizontal); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_document_padding_vertical
    cJSON *cq_dam_config_annotation_pdf_document_padding_vertical = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.document.padding.vertical");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_document_padding_vertical)) {
        cq_dam_config_annotation_pdf_document_padding_vertical = NULL;
    }
    if (cq_dam_config_annotation_pdf_document_padding_vertical) { 
    cq_dam_config_annotation_pdf_document_padding_vertical_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_config_annotation_pdf_document_padding_vertical); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_size
    cJSON *cq_dam_config_annotation_pdf_font_size = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.font.size");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_font_size)) {
        cq_dam_config_annotation_pdf_font_size = NULL;
    }
    if (cq_dam_config_annotation_pdf_font_size) { 
    cq_dam_config_annotation_pdf_font_size_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_config_annotation_pdf_font_size); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_color
    cJSON *cq_dam_config_annotation_pdf_font_color = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.font.color");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_font_color)) {
        cq_dam_config_annotation_pdf_font_color = NULL;
    }
    if (cq_dam_config_annotation_pdf_font_color) { 
    cq_dam_config_annotation_pdf_font_color_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_config_annotation_pdf_font_color); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_family
    cJSON *cq_dam_config_annotation_pdf_font_family = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.font.family");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_font_family)) {
        cq_dam_config_annotation_pdf_font_family = NULL;
    }
    if (cq_dam_config_annotation_pdf_font_family) { 
    cq_dam_config_annotation_pdf_font_family_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_config_annotation_pdf_font_family); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_font_light
    cJSON *cq_dam_config_annotation_pdf_font_light = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.font.light");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_font_light)) {
        cq_dam_config_annotation_pdf_font_light = NULL;
    }
    if (cq_dam_config_annotation_pdf_font_light) { 
    cq_dam_config_annotation_pdf_font_light_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_config_annotation_pdf_font_light); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_margin_text_image
    cJSON *cq_dam_config_annotation_pdf_margin_text_image = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.marginTextImage");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_margin_text_image)) {
        cq_dam_config_annotation_pdf_margin_text_image = NULL;
    }
    if (cq_dam_config_annotation_pdf_margin_text_image) { 
    cq_dam_config_annotation_pdf_margin_text_image_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_config_annotation_pdf_margin_text_image); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_min_image_height
    cJSON *cq_dam_config_annotation_pdf_min_image_height = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.minImageHeight");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_min_image_height)) {
        cq_dam_config_annotation_pdf_min_image_height = NULL;
    }
    if (cq_dam_config_annotation_pdf_min_image_height) { 
    cq_dam_config_annotation_pdf_min_image_height_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_config_annotation_pdf_min_image_height); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_width
    cJSON *cq_dam_config_annotation_pdf_review_status_width = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.reviewStatus.width");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_review_status_width)) {
        cq_dam_config_annotation_pdf_review_status_width = NULL;
    }
    if (cq_dam_config_annotation_pdf_review_status_width) { 
    cq_dam_config_annotation_pdf_review_status_width_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_config_annotation_pdf_review_status_width); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_approved
    cJSON *cq_dam_config_annotation_pdf_review_status_color_approved = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.reviewStatus.color.approved");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_review_status_color_approved)) {
        cq_dam_config_annotation_pdf_review_status_color_approved = NULL;
    }
    if (cq_dam_config_annotation_pdf_review_status_color_approved) { 
    cq_dam_config_annotation_pdf_review_status_color_approved_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_config_annotation_pdf_review_status_color_approved); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_rejected
    cJSON *cq_dam_config_annotation_pdf_review_status_color_rejected = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.reviewStatus.color.rejected");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_review_status_color_rejected)) {
        cq_dam_config_annotation_pdf_review_status_color_rejected = NULL;
    }
    if (cq_dam_config_annotation_pdf_review_status_color_rejected) { 
    cq_dam_config_annotation_pdf_review_status_color_rejected_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_config_annotation_pdf_review_status_color_rejected); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_review_status_color_changes_requested
    cJSON *cq_dam_config_annotation_pdf_review_status_color_changes_requested = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_review_status_color_changes_requested)) {
        cq_dam_config_annotation_pdf_review_status_color_changes_requested = NULL;
    }
    if (cq_dam_config_annotation_pdf_review_status_color_changes_requested) { 
    cq_dam_config_annotation_pdf_review_status_color_changes_requested_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_config_annotation_pdf_review_status_color_changes_requested); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_annotation_marker_width
    cJSON *cq_dam_config_annotation_pdf_annotation_marker_width = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.annotationMarker.width");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_annotation_marker_width)) {
        cq_dam_config_annotation_pdf_annotation_marker_width = NULL;
    }
    if (cq_dam_config_annotation_pdf_annotation_marker_width) { 
    cq_dam_config_annotation_pdf_annotation_marker_width_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_config_annotation_pdf_annotation_marker_width); //nonprimitive
    }

    // com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties->cq_dam_config_annotation_pdf_asset_minheight
    cJSON *cq_dam_config_annotation_pdf_asset_minheight = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_propertiesJSON, "cq.dam.config.annotation.pdf.asset.minheight");
    if (cJSON_IsNull(cq_dam_config_annotation_pdf_asset_minheight)) {
        cq_dam_config_annotation_pdf_asset_minheight = NULL;
    }
    if (cq_dam_config_annotation_pdf_asset_minheight) { 
    cq_dam_config_annotation_pdf_asset_minheight_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_config_annotation_pdf_asset_minheight); //nonprimitive
    }



    com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var = com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_create_internal (
        cq_dam_config_annotation_pdf_document_width ? cq_dam_config_annotation_pdf_document_width_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_document_height ? cq_dam_config_annotation_pdf_document_height_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_document_padding_horizontal ? cq_dam_config_annotation_pdf_document_padding_horizontal_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_document_padding_vertical ? cq_dam_config_annotation_pdf_document_padding_vertical_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_font_size ? cq_dam_config_annotation_pdf_font_size_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_font_color ? cq_dam_config_annotation_pdf_font_color_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_font_family ? cq_dam_config_annotation_pdf_font_family_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_font_light ? cq_dam_config_annotation_pdf_font_light_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_margin_text_image ? cq_dam_config_annotation_pdf_margin_text_image_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_min_image_height ? cq_dam_config_annotation_pdf_min_image_height_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_review_status_width ? cq_dam_config_annotation_pdf_review_status_width_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_review_status_color_approved ? cq_dam_config_annotation_pdf_review_status_color_approved_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_review_status_color_rejected ? cq_dam_config_annotation_pdf_review_status_color_rejected_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_review_status_color_changes_requested ? cq_dam_config_annotation_pdf_review_status_color_changes_requested_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_annotation_marker_width ? cq_dam_config_annotation_pdf_annotation_marker_width_local_nonprim : NULL,
        cq_dam_config_annotation_pdf_asset_minheight ? cq_dam_config_annotation_pdf_asset_minheight_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_local_var;
end:
    if (cq_dam_config_annotation_pdf_document_width_local_nonprim) {
        config_node_property_integer_free(cq_dam_config_annotation_pdf_document_width_local_nonprim);
        cq_dam_config_annotation_pdf_document_width_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_document_height_local_nonprim) {
        config_node_property_integer_free(cq_dam_config_annotation_pdf_document_height_local_nonprim);
        cq_dam_config_annotation_pdf_document_height_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_document_padding_horizontal_local_nonprim) {
        config_node_property_integer_free(cq_dam_config_annotation_pdf_document_padding_horizontal_local_nonprim);
        cq_dam_config_annotation_pdf_document_padding_horizontal_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_document_padding_vertical_local_nonprim) {
        config_node_property_integer_free(cq_dam_config_annotation_pdf_document_padding_vertical_local_nonprim);
        cq_dam_config_annotation_pdf_document_padding_vertical_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_font_size_local_nonprim) {
        config_node_property_integer_free(cq_dam_config_annotation_pdf_font_size_local_nonprim);
        cq_dam_config_annotation_pdf_font_size_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_font_color_local_nonprim) {
        config_node_property_string_free(cq_dam_config_annotation_pdf_font_color_local_nonprim);
        cq_dam_config_annotation_pdf_font_color_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_font_family_local_nonprim) {
        config_node_property_string_free(cq_dam_config_annotation_pdf_font_family_local_nonprim);
        cq_dam_config_annotation_pdf_font_family_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_font_light_local_nonprim) {
        config_node_property_string_free(cq_dam_config_annotation_pdf_font_light_local_nonprim);
        cq_dam_config_annotation_pdf_font_light_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_margin_text_image_local_nonprim) {
        config_node_property_integer_free(cq_dam_config_annotation_pdf_margin_text_image_local_nonprim);
        cq_dam_config_annotation_pdf_margin_text_image_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_min_image_height_local_nonprim) {
        config_node_property_integer_free(cq_dam_config_annotation_pdf_min_image_height_local_nonprim);
        cq_dam_config_annotation_pdf_min_image_height_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_review_status_width_local_nonprim) {
        config_node_property_integer_free(cq_dam_config_annotation_pdf_review_status_width_local_nonprim);
        cq_dam_config_annotation_pdf_review_status_width_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_review_status_color_approved_local_nonprim) {
        config_node_property_string_free(cq_dam_config_annotation_pdf_review_status_color_approved_local_nonprim);
        cq_dam_config_annotation_pdf_review_status_color_approved_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_review_status_color_rejected_local_nonprim) {
        config_node_property_string_free(cq_dam_config_annotation_pdf_review_status_color_rejected_local_nonprim);
        cq_dam_config_annotation_pdf_review_status_color_rejected_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_review_status_color_changes_requested_local_nonprim) {
        config_node_property_string_free(cq_dam_config_annotation_pdf_review_status_color_changes_requested_local_nonprim);
        cq_dam_config_annotation_pdf_review_status_color_changes_requested_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_annotation_marker_width_local_nonprim) {
        config_node_property_integer_free(cq_dam_config_annotation_pdf_annotation_marker_width_local_nonprim);
        cq_dam_config_annotation_pdf_annotation_marker_width_local_nonprim = NULL;
    }
    if (cq_dam_config_annotation_pdf_asset_minheight_local_nonprim) {
        config_node_property_integer_free(cq_dam_config_annotation_pdf_asset_minheight_local_nonprim);
        cq_dam_config_annotation_pdf_asset_minheight_local_nonprim = NULL;
    }
    return NULL;

}
