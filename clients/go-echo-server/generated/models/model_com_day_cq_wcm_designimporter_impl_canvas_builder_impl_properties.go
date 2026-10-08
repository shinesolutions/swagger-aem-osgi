package models

type ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties struct {

	Filepattern ConfigNodePropertyString `json:"filepattern,omitempty"`

	BuildPageNodes ConfigNodePropertyBoolean `json:"build.page.nodes,omitempty"`

	BuildClientLibs ConfigNodePropertyBoolean `json:"build.client.libs,omitempty"`

	BuildCanvasComponent ConfigNodePropertyBoolean `json:"build.canvas.component,omitempty"`
}
