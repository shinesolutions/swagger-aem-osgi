-module(openapi_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties/0]).

-type openapi_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties() ::
  [ {'cq_dam_config_annotation_pdf_document_width', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_config_annotation_pdf_document_height', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_config_annotation_pdf_document_padding_horizontal', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_config_annotation_pdf_document_padding_vertical', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_config_annotation_pdf_font_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_config_annotation_pdf_font_color', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_dam_config_annotation_pdf_font_family', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_dam_config_annotation_pdf_font_light', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_dam_config_annotation_pdf_marginTextImage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_config_annotation_pdf_minImageHeight', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_config_annotation_pdf_reviewStatus_width', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_config_annotation_pdf_reviewStatus_color_approved', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_dam_config_annotation_pdf_reviewStatus_color_rejected', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_dam_config_annotation_pdf_reviewStatus_color_changesRequested', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_dam_config_annotation_pdf_annotationMarker_width', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_config_annotation_pdf_asset_minheight', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties() ->
    openapi_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties([]).

openapi_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties(Fields) ->
  Default = [ {'cq.dam.config.annotation.pdf.document.width', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.config.annotation.pdf.document.height', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.config.annotation.pdf.document.padding.horizontal', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.config.annotation.pdf.document.padding.vertical', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.config.annotation.pdf.font.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.config.annotation.pdf.font.color', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.dam.config.annotation.pdf.font.family', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.dam.config.annotation.pdf.font.light', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.dam.config.annotation.pdf.marginTextImage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.config.annotation.pdf.minImageHeight', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.config.annotation.pdf.reviewStatus.width', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.config.annotation.pdf.reviewStatus.color.approved', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.dam.config.annotation.pdf.reviewStatus.color.rejected', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.dam.config.annotation.pdf.annotationMarker.width', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.config.annotation.pdf.asset.minheight', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

