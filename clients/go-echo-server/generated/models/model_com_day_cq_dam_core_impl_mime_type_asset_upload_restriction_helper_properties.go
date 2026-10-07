package models

type ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties struct {

	CqDamAllowAllMime ConfigNodePropertyBoolean `json:"cq.dam.allow.all.mime,omitempty"`

	CqDamAllowedAssetMimes ConfigNodePropertyArray `json:"cq.dam.allowed.asset.mimes,omitempty"`
}
