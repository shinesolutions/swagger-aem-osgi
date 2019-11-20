--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties class
local com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties = {}
local com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_mt = {
	__name = "com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties";
	__index = com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties;
}

local function cast_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties(t)
	return setmetatable(t, com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties_mt)
end

local function new_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties(cq_dam_config_annotation_pdf_document_width, cq_dam_config_annotation_pdf_document_height, cq_dam_config_annotation_pdf_document_padding_horizontal, cq_dam_config_annotation_pdf_document_padding_vertical, cq_dam_config_annotation_pdf_font_size, cq_dam_config_annotation_pdf_font_color, cq_dam_config_annotation_pdf_font_family, cq_dam_config_annotation_pdf_font_light, cq_dam_config_annotation_pdf_margin_text_image, cq_dam_config_annotation_pdf_min_image_height, cq_dam_config_annotation_pdf_review_status_width, cq_dam_config_annotation_pdf_review_status_color_approved, cq_dam_config_annotation_pdf_review_status_color_rejected, cq_dam_config_annotation_pdf_review_status_color_changes_requested, cq_dam_config_annotation_pdf_annotation_marker_width, cq_dam_config_annotation_pdf_asset_minheight)
	return cast_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties({
		["cq.dam.config.annotation.pdf.document.width"] = cq_dam_config_annotation_pdf_document_width;
		["cq.dam.config.annotation.pdf.document.height"] = cq_dam_config_annotation_pdf_document_height;
		["cq.dam.config.annotation.pdf.document.padding.horizontal"] = cq_dam_config_annotation_pdf_document_padding_horizontal;
		["cq.dam.config.annotation.pdf.document.padding.vertical"] = cq_dam_config_annotation_pdf_document_padding_vertical;
		["cq.dam.config.annotation.pdf.font.size"] = cq_dam_config_annotation_pdf_font_size;
		["cq.dam.config.annotation.pdf.font.color"] = cq_dam_config_annotation_pdf_font_color;
		["cq.dam.config.annotation.pdf.font.family"] = cq_dam_config_annotation_pdf_font_family;
		["cq.dam.config.annotation.pdf.font.light"] = cq_dam_config_annotation_pdf_font_light;
		["cq.dam.config.annotation.pdf.marginTextImage"] = cq_dam_config_annotation_pdf_margin_text_image;
		["cq.dam.config.annotation.pdf.minImageHeight"] = cq_dam_config_annotation_pdf_min_image_height;
		["cq.dam.config.annotation.pdf.reviewStatus.width"] = cq_dam_config_annotation_pdf_review_status_width;
		["cq.dam.config.annotation.pdf.reviewStatus.color.approved"] = cq_dam_config_annotation_pdf_review_status_color_approved;
		["cq.dam.config.annotation.pdf.reviewStatus.color.rejected"] = cq_dam_config_annotation_pdf_review_status_color_rejected;
		["cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested"] = cq_dam_config_annotation_pdf_review_status_color_changes_requested;
		["cq.dam.config.annotation.pdf.annotationMarker.width"] = cq_dam_config_annotation_pdf_annotation_marker_width;
		["cq.dam.config.annotation.pdf.asset.minheight"] = cq_dam_config_annotation_pdf_asset_minheight;
	})
end

return {
	cast = cast_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties;
	new = new_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties;
}