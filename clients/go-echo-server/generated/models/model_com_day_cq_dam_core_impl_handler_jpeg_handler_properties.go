package models

type ComDayCqDamCoreImplHandlerJpegHandlerProperties struct {

	CqDamEnableExtMetaExtraction ConfigNodePropertyBoolean `json:"cq.dam.enable.ext.meta.extraction,omitempty"`

	LargeFileThreshold ConfigNodePropertyInteger `json:"large_file_threshold,omitempty"`

	LargeCommentThreshold ConfigNodePropertyInteger `json:"large_comment_threshold,omitempty"`
}
