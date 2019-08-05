#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties()
{
	//__init();
}

ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::~ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::__init()
{
	//cqdamconfigannotationpdfdocumentwidth = new ConfigNodePropertyInteger();
	//cqdamconfigannotationpdfdocumentheight = new ConfigNodePropertyInteger();
	//cqdamconfigannotationpdfdocumentpaddinghorizontal = new ConfigNodePropertyInteger();
	//cqdamconfigannotationpdfdocumentpaddingvertical = new ConfigNodePropertyInteger();
	//cqdamconfigannotationpdffontsize = new ConfigNodePropertyInteger();
	//cqdamconfigannotationpdffontcolor = new ConfigNodePropertyString();
	//cqdamconfigannotationpdffontfamily = new ConfigNodePropertyString();
	//cqdamconfigannotationpdffontlight = new ConfigNodePropertyString();
	//cqdamconfigannotationpdfmarginTextImage = new ConfigNodePropertyInteger();
	//cqdamconfigannotationpdfminImageHeight = new ConfigNodePropertyInteger();
	//cqdamconfigannotationpdfreviewStatuswidth = new ConfigNodePropertyInteger();
	//cqdamconfigannotationpdfreviewStatuscolorapproved = new ConfigNodePropertyString();
	//cqdamconfigannotationpdfreviewStatuscolorrejected = new ConfigNodePropertyString();
	//cqdamconfigannotationpdfreviewStatuscolorchangesRequested = new ConfigNodePropertyString();
	//cqdamconfigannotationpdfannotationMarkerwidth = new ConfigNodePropertyInteger();
	//cqdamconfigannotationpdfassetminheight = new ConfigNodePropertyInteger();
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::__cleanup()
{
	//if(cqdamconfigannotationpdfdocumentwidth != NULL) {
	//
	//delete cqdamconfigannotationpdfdocumentwidth;
	//cqdamconfigannotationpdfdocumentwidth = NULL;
	//}
	//if(cqdamconfigannotationpdfdocumentheight != NULL) {
	//
	//delete cqdamconfigannotationpdfdocumentheight;
	//cqdamconfigannotationpdfdocumentheight = NULL;
	//}
	//if(cqdamconfigannotationpdfdocumentpaddinghorizontal != NULL) {
	//
	//delete cqdamconfigannotationpdfdocumentpaddinghorizontal;
	//cqdamconfigannotationpdfdocumentpaddinghorizontal = NULL;
	//}
	//if(cqdamconfigannotationpdfdocumentpaddingvertical != NULL) {
	//
	//delete cqdamconfigannotationpdfdocumentpaddingvertical;
	//cqdamconfigannotationpdfdocumentpaddingvertical = NULL;
	//}
	//if(cqdamconfigannotationpdffontsize != NULL) {
	//
	//delete cqdamconfigannotationpdffontsize;
	//cqdamconfigannotationpdffontsize = NULL;
	//}
	//if(cqdamconfigannotationpdffontcolor != NULL) {
	//
	//delete cqdamconfigannotationpdffontcolor;
	//cqdamconfigannotationpdffontcolor = NULL;
	//}
	//if(cqdamconfigannotationpdffontfamily != NULL) {
	//
	//delete cqdamconfigannotationpdffontfamily;
	//cqdamconfigannotationpdffontfamily = NULL;
	//}
	//if(cqdamconfigannotationpdffontlight != NULL) {
	//
	//delete cqdamconfigannotationpdffontlight;
	//cqdamconfigannotationpdffontlight = NULL;
	//}
	//if(cqdamconfigannotationpdfmarginTextImage != NULL) {
	//
	//delete cqdamconfigannotationpdfmarginTextImage;
	//cqdamconfigannotationpdfmarginTextImage = NULL;
	//}
	//if(cqdamconfigannotationpdfminImageHeight != NULL) {
	//
	//delete cqdamconfigannotationpdfminImageHeight;
	//cqdamconfigannotationpdfminImageHeight = NULL;
	//}
	//if(cqdamconfigannotationpdfreviewStatuswidth != NULL) {
	//
	//delete cqdamconfigannotationpdfreviewStatuswidth;
	//cqdamconfigannotationpdfreviewStatuswidth = NULL;
	//}
	//if(cqdamconfigannotationpdfreviewStatuscolorapproved != NULL) {
	//
	//delete cqdamconfigannotationpdfreviewStatuscolorapproved;
	//cqdamconfigannotationpdfreviewStatuscolorapproved = NULL;
	//}
	//if(cqdamconfigannotationpdfreviewStatuscolorrejected != NULL) {
	//
	//delete cqdamconfigannotationpdfreviewStatuscolorrejected;
	//cqdamconfigannotationpdfreviewStatuscolorrejected = NULL;
	//}
	//if(cqdamconfigannotationpdfreviewStatuscolorchangesRequested != NULL) {
	//
	//delete cqdamconfigannotationpdfreviewStatuscolorchangesRequested;
	//cqdamconfigannotationpdfreviewStatuscolorchangesRequested = NULL;
	//}
	//if(cqdamconfigannotationpdfannotationMarkerwidth != NULL) {
	//
	//delete cqdamconfigannotationpdfannotationMarkerwidth;
	//cqdamconfigannotationpdfannotationMarkerwidth = NULL;
	//}
	//if(cqdamconfigannotationpdfassetminheight != NULL) {
	//
	//delete cqdamconfigannotationpdfassetminheight;
	//cqdamconfigannotationpdfassetminheight = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamconfigannotationpdfdocumentwidthKey = "cq.dam.config.annotation.pdf.document.width";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdfdocumentwidthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamconfigannotationpdfdocumentwidth, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamconfigannotationpdfdocumentwidth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdfdocumentheightKey = "cq.dam.config.annotation.pdf.document.height";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdfdocumentheightKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamconfigannotationpdfdocumentheight, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamconfigannotationpdfdocumentheight);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdfdocumentpaddinghorizontalKey = "cq.dam.config.annotation.pdf.document.padding.horizontal";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdfdocumentpaddinghorizontalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamconfigannotationpdfdocumentpaddinghorizontal, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamconfigannotationpdfdocumentpaddinghorizontal);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdfdocumentpaddingverticalKey = "cq.dam.config.annotation.pdf.document.padding.vertical";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdfdocumentpaddingverticalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamconfigannotationpdfdocumentpaddingvertical, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamconfigannotationpdfdocumentpaddingvertical);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdffontsizeKey = "cq.dam.config.annotation.pdf.font.size";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdffontsizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamconfigannotationpdffontsize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamconfigannotationpdffontsize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdffontcolorKey = "cq.dam.config.annotation.pdf.font.color";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdffontcolorKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdamconfigannotationpdffontcolor, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdamconfigannotationpdffontcolor);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdffontfamilyKey = "cq.dam.config.annotation.pdf.font.family";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdffontfamilyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdamconfigannotationpdffontfamily, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdamconfigannotationpdffontfamily);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdffontlightKey = "cq.dam.config.annotation.pdf.font.light";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdffontlightKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdamconfigannotationpdffontlight, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdamconfigannotationpdffontlight);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdfmarginTextImageKey = "cq.dam.config.annotation.pdf.marginTextImage";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdfmarginTextImageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamconfigannotationpdfmarginTextImage, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamconfigannotationpdfmarginTextImage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdfminImageHeightKey = "cq.dam.config.annotation.pdf.minImageHeight";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdfminImageHeightKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamconfigannotationpdfminImageHeight, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamconfigannotationpdfminImageHeight);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdfreviewStatuswidthKey = "cq.dam.config.annotation.pdf.reviewStatus.width";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdfreviewStatuswidthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamconfigannotationpdfreviewStatuswidth, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamconfigannotationpdfreviewStatuswidth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdfreviewStatuscolorapprovedKey = "cq.dam.config.annotation.pdf.reviewStatus.color.approved";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdfreviewStatuscolorapprovedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdamconfigannotationpdfreviewStatuscolorapproved, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdamconfigannotationpdfreviewStatuscolorapproved);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdfreviewStatuscolorrejectedKey = "cq.dam.config.annotation.pdf.reviewStatus.color.rejected";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdfreviewStatuscolorrejectedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdamconfigannotationpdfreviewStatuscolorrejected, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdamconfigannotationpdfreviewStatuscolorrejected);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdfreviewStatuscolorchangesRequestedKey = "cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdfreviewStatuscolorchangesRequestedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdamconfigannotationpdfreviewStatuscolorchangesRequested, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdamconfigannotationpdfreviewStatuscolorchangesRequested);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdfannotationMarkerwidthKey = "cq.dam.config.annotation.pdf.annotationMarker.width";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdfannotationMarkerwidthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamconfigannotationpdfannotationMarkerwidth, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamconfigannotationpdfannotationMarkerwidth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigannotationpdfassetminheightKey = "cq.dam.config.annotation.pdf.asset.minheight";
	node = json_object_get_member(pJsonObject, cqdamconfigannotationpdfassetminheightKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamconfigannotationpdfassetminheight, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamconfigannotationpdfassetminheight);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamconfigannotationpdfdocumentwidth();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamconfigannotationpdfdocumentwidth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdfdocumentwidthKey = "cq.dam.config.annotation.pdf.document.width";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdfdocumentwidthKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamconfigannotationpdfdocumentheight();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamconfigannotationpdfdocumentheight());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdfdocumentheightKey = "cq.dam.config.annotation.pdf.document.height";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdfdocumentheightKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamconfigannotationpdfdocumentpaddinghorizontal();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamconfigannotationpdfdocumentpaddinghorizontal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdfdocumentpaddinghorizontalKey = "cq.dam.config.annotation.pdf.document.padding.horizontal";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdfdocumentpaddinghorizontalKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamconfigannotationpdfdocumentpaddingvertical();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamconfigannotationpdfdocumentpaddingvertical());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdfdocumentpaddingverticalKey = "cq.dam.config.annotation.pdf.document.padding.vertical";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdfdocumentpaddingverticalKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamconfigannotationpdffontsize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamconfigannotationpdffontsize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdffontsizeKey = "cq.dam.config.annotation.pdf.font.size";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdffontsizeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdamconfigannotationpdffontcolor();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdamconfigannotationpdffontcolor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdffontcolorKey = "cq.dam.config.annotation.pdf.font.color";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdffontcolorKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdamconfigannotationpdffontfamily();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdamconfigannotationpdffontfamily());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdffontfamilyKey = "cq.dam.config.annotation.pdf.font.family";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdffontfamilyKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdamconfigannotationpdffontlight();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdamconfigannotationpdffontlight());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdffontlightKey = "cq.dam.config.annotation.pdf.font.light";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdffontlightKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamconfigannotationpdfmarginTextImage();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamconfigannotationpdfmarginTextImage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdfmarginTextImageKey = "cq.dam.config.annotation.pdf.marginTextImage";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdfmarginTextImageKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamconfigannotationpdfminImageHeight();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamconfigannotationpdfminImageHeight());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdfminImageHeightKey = "cq.dam.config.annotation.pdf.minImageHeight";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdfminImageHeightKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamconfigannotationpdfreviewStatuswidth();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamconfigannotationpdfreviewStatuswidth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdfreviewStatuswidthKey = "cq.dam.config.annotation.pdf.reviewStatus.width";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdfreviewStatuswidthKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdamconfigannotationpdfreviewStatuscolorapproved();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdamconfigannotationpdfreviewStatuscolorapproved());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdfreviewStatuscolorapprovedKey = "cq.dam.config.annotation.pdf.reviewStatus.color.approved";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdfreviewStatuscolorapprovedKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdamconfigannotationpdfreviewStatuscolorrejected();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdamconfigannotationpdfreviewStatuscolorrejected());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdfreviewStatuscolorrejectedKey = "cq.dam.config.annotation.pdf.reviewStatus.color.rejected";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdfreviewStatuscolorrejectedKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdamconfigannotationpdfreviewStatuscolorchangesRequested();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdamconfigannotationpdfreviewStatuscolorchangesRequested());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdfreviewStatuscolorchangesRequestedKey = "cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdfreviewStatuscolorchangesRequestedKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamconfigannotationpdfannotationMarkerwidth();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamconfigannotationpdfannotationMarkerwidth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdfannotationMarkerwidthKey = "cq.dam.config.annotation.pdf.annotationMarker.width";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdfannotationMarkerwidthKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamconfigannotationpdfassetminheight();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamconfigannotationpdfassetminheight());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigannotationpdfassetminheightKey = "cq.dam.config.annotation.pdf.asset.minheight";
	json_object_set_member(pJsonObject, cqdamconfigannotationpdfassetminheightKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfdocumentwidth()
{
	return cqdamconfigannotationpdfdocumentwidth;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfdocumentwidth(ConfigNodePropertyInteger  cqdamconfigannotationpdfdocumentwidth)
{
	this->cqdamconfigannotationpdfdocumentwidth = cqdamconfigannotationpdfdocumentwidth;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfdocumentheight()
{
	return cqdamconfigannotationpdfdocumentheight;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfdocumentheight(ConfigNodePropertyInteger  cqdamconfigannotationpdfdocumentheight)
{
	this->cqdamconfigannotationpdfdocumentheight = cqdamconfigannotationpdfdocumentheight;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfdocumentpaddinghorizontal()
{
	return cqdamconfigannotationpdfdocumentpaddinghorizontal;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfdocumentpaddinghorizontal(ConfigNodePropertyInteger  cqdamconfigannotationpdfdocumentpaddinghorizontal)
{
	this->cqdamconfigannotationpdfdocumentpaddinghorizontal = cqdamconfigannotationpdfdocumentpaddinghorizontal;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfdocumentpaddingvertical()
{
	return cqdamconfigannotationpdfdocumentpaddingvertical;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfdocumentpaddingvertical(ConfigNodePropertyInteger  cqdamconfigannotationpdfdocumentpaddingvertical)
{
	this->cqdamconfigannotationpdfdocumentpaddingvertical = cqdamconfigannotationpdfdocumentpaddingvertical;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdffontsize()
{
	return cqdamconfigannotationpdffontsize;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdffontsize(ConfigNodePropertyInteger  cqdamconfigannotationpdffontsize)
{
	this->cqdamconfigannotationpdffontsize = cqdamconfigannotationpdffontsize;
}

ConfigNodePropertyString
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdffontcolor()
{
	return cqdamconfigannotationpdffontcolor;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdffontcolor(ConfigNodePropertyString  cqdamconfigannotationpdffontcolor)
{
	this->cqdamconfigannotationpdffontcolor = cqdamconfigannotationpdffontcolor;
}

ConfigNodePropertyString
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdffontfamily()
{
	return cqdamconfigannotationpdffontfamily;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdffontfamily(ConfigNodePropertyString  cqdamconfigannotationpdffontfamily)
{
	this->cqdamconfigannotationpdffontfamily = cqdamconfigannotationpdffontfamily;
}

ConfigNodePropertyString
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdffontlight()
{
	return cqdamconfigannotationpdffontlight;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdffontlight(ConfigNodePropertyString  cqdamconfigannotationpdffontlight)
{
	this->cqdamconfigannotationpdffontlight = cqdamconfigannotationpdffontlight;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfmarginTextImage()
{
	return cqdamconfigannotationpdfmarginTextImage;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfmarginTextImage(ConfigNodePropertyInteger  cqdamconfigannotationpdfmarginTextImage)
{
	this->cqdamconfigannotationpdfmarginTextImage = cqdamconfigannotationpdfmarginTextImage;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfminImageHeight()
{
	return cqdamconfigannotationpdfminImageHeight;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfminImageHeight(ConfigNodePropertyInteger  cqdamconfigannotationpdfminImageHeight)
{
	this->cqdamconfigannotationpdfminImageHeight = cqdamconfigannotationpdfminImageHeight;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfreviewStatuswidth()
{
	return cqdamconfigannotationpdfreviewStatuswidth;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfreviewStatuswidth(ConfigNodePropertyInteger  cqdamconfigannotationpdfreviewStatuswidth)
{
	this->cqdamconfigannotationpdfreviewStatuswidth = cqdamconfigannotationpdfreviewStatuswidth;
}

ConfigNodePropertyString
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfreviewStatuscolorapproved()
{
	return cqdamconfigannotationpdfreviewStatuscolorapproved;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfreviewStatuscolorapproved(ConfigNodePropertyString  cqdamconfigannotationpdfreviewStatuscolorapproved)
{
	this->cqdamconfigannotationpdfreviewStatuscolorapproved = cqdamconfigannotationpdfreviewStatuscolorapproved;
}

ConfigNodePropertyString
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfreviewStatuscolorrejected()
{
	return cqdamconfigannotationpdfreviewStatuscolorrejected;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfreviewStatuscolorrejected(ConfigNodePropertyString  cqdamconfigannotationpdfreviewStatuscolorrejected)
{
	this->cqdamconfigannotationpdfreviewStatuscolorrejected = cqdamconfigannotationpdfreviewStatuscolorrejected;
}

ConfigNodePropertyString
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfreviewStatuscolorchangesRequested()
{
	return cqdamconfigannotationpdfreviewStatuscolorchangesRequested;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfreviewStatuscolorchangesRequested(ConfigNodePropertyString  cqdamconfigannotationpdfreviewStatuscolorchangesRequested)
{
	this->cqdamconfigannotationpdfreviewStatuscolorchangesRequested = cqdamconfigannotationpdfreviewStatuscolorchangesRequested;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfannotationMarkerwidth()
{
	return cqdamconfigannotationpdfannotationMarkerwidth;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfannotationMarkerwidth(ConfigNodePropertyInteger  cqdamconfigannotationpdfannotationMarkerwidth)
{
	this->cqdamconfigannotationpdfannotationMarkerwidth = cqdamconfigannotationpdfannotationMarkerwidth;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfassetminheight()
{
	return cqdamconfigannotationpdfassetminheight;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfassetminheight(ConfigNodePropertyInteger  cqdamconfigannotationpdfassetminheight)
{
	this->cqdamconfigannotationpdfassetminheight = cqdamconfigannotationpdfassetminheight;
}


