require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_config_annotation_pdf_document_width : Int32? = nil, cq_dam_config_annotation_pdf_document_height : Int32? = nil, cq_dam_config_annotation_pdf_document_padding_horizontal : Int32? = nil, cq_dam_config_annotation_pdf_document_padding_vertical : Int32? = nil, cq_dam_config_annotation_pdf_font_size : Int32? = nil, cq_dam_config_annotation_pdf_font_color : String? = nil, cq_dam_config_annotation_pdf_font_family : String? = nil, cq_dam_config_annotation_pdf_font_light : String? = nil, cq_dam_config_annotation_pdf_margin_text_image : Int32? = nil, cq_dam_config_annotation_pdf_min_image_height : Int32? = nil, cq_dam_config_annotation_pdf_review_status_width : Int32? = nil, cq_dam_config_annotation_pdf_review_status_color_approved : String? = nil, cq_dam_config_annotation_pdf_review_status_color_rejected : String? = nil, cq_dam_config_annotation_pdf_review_status_color_changes_requested : String? = nil, cq_dam_config_annotation_pdf_annotation_marker_width : Int32? = nil, cq_dam_config_annotation_pdf_asset_minheight : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.annotation.pdf.AnnotationPdfConfig",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.config.annotation.pdf.document.width" => cq_dam_config_annotation_pdf_document_width, "cq.dam.config.annotation.pdf.document.height" => cq_dam_config_annotation_pdf_document_height, "cq.dam.config.annotation.pdf.document.padding.horizontal" => cq_dam_config_annotation_pdf_document_padding_horizontal, "cq.dam.config.annotation.pdf.document.padding.vertical" => cq_dam_config_annotation_pdf_document_padding_vertical, "cq.dam.config.annotation.pdf.font.size" => cq_dam_config_annotation_pdf_font_size, "cq.dam.config.annotation.pdf.font.color" => cq_dam_config_annotation_pdf_font_color, "cq.dam.config.annotation.pdf.font.family" => cq_dam_config_annotation_pdf_font_family, "cq.dam.config.annotation.pdf.font.light" => cq_dam_config_annotation_pdf_font_light, "cq.dam.config.annotation.pdf.marginTextImage" => cq_dam_config_annotation_pdf_margin_text_image, "cq.dam.config.annotation.pdf.minImageHeight" => cq_dam_config_annotation_pdf_min_image_height, "cq.dam.config.annotation.pdf.reviewStatus.width" => cq_dam_config_annotation_pdf_review_status_width, "cq.dam.config.annotation.pdf.reviewStatus.color.approved" => cq_dam_config_annotation_pdf_review_status_color_approved, "cq.dam.config.annotation.pdf.reviewStatus.color.rejected" => cq_dam_config_annotation_pdf_review_status_color_rejected, "cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested" => cq_dam_config_annotation_pdf_review_status_color_changes_requested, "cq.dam.config.annotation.pdf.annotationMarker.width" => cq_dam_config_annotation_pdf_annotation_marker_width, "cq.dam.config.annotation.pdf.asset.minheight" => cq_dam_config_annotation_pdf_asset_minheight },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
