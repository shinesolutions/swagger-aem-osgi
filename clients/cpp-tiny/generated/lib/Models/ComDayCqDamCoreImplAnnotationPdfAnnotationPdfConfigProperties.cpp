

#include "ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties()
{
	cqdamconfigannotationpdfdocumentwidth = ConfigNodePropertyInteger();
	cqdamconfigannotationpdfdocumentheight = ConfigNodePropertyInteger();
	cqdamconfigannotationpdfdocumentpaddinghorizontal = ConfigNodePropertyInteger();
	cqdamconfigannotationpdfdocumentpaddingvertical = ConfigNodePropertyInteger();
	cqdamconfigannotationpdffontsize = ConfigNodePropertyInteger();
	cqdamconfigannotationpdffontcolor = ConfigNodePropertyString();
	cqdamconfigannotationpdffontfamily = ConfigNodePropertyString();
	cqdamconfigannotationpdffontlight = ConfigNodePropertyString();
	cqdamconfigannotationpdfmarginTextImage = ConfigNodePropertyInteger();
	cqdamconfigannotationpdfminImageHeight = ConfigNodePropertyInteger();
	cqdamconfigannotationpdfreviewStatuswidth = ConfigNodePropertyInteger();
	cqdamconfigannotationpdfreviewStatuscolorapproved = ConfigNodePropertyString();
	cqdamconfigannotationpdfreviewStatuscolorrejected = ConfigNodePropertyString();
	cqdamconfigannotationpdfreviewStatuscolorchangesRequested = ConfigNodePropertyString();
	cqdamconfigannotationpdfannotationMarkerwidth = ConfigNodePropertyInteger();
	cqdamconfigannotationpdfassetminheight = ConfigNodePropertyInteger();
}

ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::~ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties()
{

}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamconfigannotationpdfdocumentwidthKey = "cq.dam.config.annotation.pdf.document.width";

    if(object.has_key(cqdamconfigannotationpdfdocumentwidthKey))
    {
        bourne::json value = object[cqdamconfigannotationpdfdocumentwidthKey];




        ConfigNodePropertyInteger* obj = &cqdamconfigannotationpdfdocumentwidth;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdfdocumentheightKey = "cq.dam.config.annotation.pdf.document.height";

    if(object.has_key(cqdamconfigannotationpdfdocumentheightKey))
    {
        bourne::json value = object[cqdamconfigannotationpdfdocumentheightKey];




        ConfigNodePropertyInteger* obj = &cqdamconfigannotationpdfdocumentheight;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdfdocumentpaddinghorizontalKey = "cq.dam.config.annotation.pdf.document.padding.horizontal";

    if(object.has_key(cqdamconfigannotationpdfdocumentpaddinghorizontalKey))
    {
        bourne::json value = object[cqdamconfigannotationpdfdocumentpaddinghorizontalKey];




        ConfigNodePropertyInteger* obj = &cqdamconfigannotationpdfdocumentpaddinghorizontal;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdfdocumentpaddingverticalKey = "cq.dam.config.annotation.pdf.document.padding.vertical";

    if(object.has_key(cqdamconfigannotationpdfdocumentpaddingverticalKey))
    {
        bourne::json value = object[cqdamconfigannotationpdfdocumentpaddingverticalKey];




        ConfigNodePropertyInteger* obj = &cqdamconfigannotationpdfdocumentpaddingvertical;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdffontsizeKey = "cq.dam.config.annotation.pdf.font.size";

    if(object.has_key(cqdamconfigannotationpdffontsizeKey))
    {
        bourne::json value = object[cqdamconfigannotationpdffontsizeKey];




        ConfigNodePropertyInteger* obj = &cqdamconfigannotationpdffontsize;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdffontcolorKey = "cq.dam.config.annotation.pdf.font.color";

    if(object.has_key(cqdamconfigannotationpdffontcolorKey))
    {
        bourne::json value = object[cqdamconfigannotationpdffontcolorKey];




        ConfigNodePropertyString* obj = &cqdamconfigannotationpdffontcolor;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdffontfamilyKey = "cq.dam.config.annotation.pdf.font.family";

    if(object.has_key(cqdamconfigannotationpdffontfamilyKey))
    {
        bourne::json value = object[cqdamconfigannotationpdffontfamilyKey];




        ConfigNodePropertyString* obj = &cqdamconfigannotationpdffontfamily;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdffontlightKey = "cq.dam.config.annotation.pdf.font.light";

    if(object.has_key(cqdamconfigannotationpdffontlightKey))
    {
        bourne::json value = object[cqdamconfigannotationpdffontlightKey];




        ConfigNodePropertyString* obj = &cqdamconfigannotationpdffontlight;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdfmarginTextImageKey = "cq.dam.config.annotation.pdf.marginTextImage";

    if(object.has_key(cqdamconfigannotationpdfmarginTextImageKey))
    {
        bourne::json value = object[cqdamconfigannotationpdfmarginTextImageKey];




        ConfigNodePropertyInteger* obj = &cqdamconfigannotationpdfmarginTextImage;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdfminImageHeightKey = "cq.dam.config.annotation.pdf.minImageHeight";

    if(object.has_key(cqdamconfigannotationpdfminImageHeightKey))
    {
        bourne::json value = object[cqdamconfigannotationpdfminImageHeightKey];




        ConfigNodePropertyInteger* obj = &cqdamconfigannotationpdfminImageHeight;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdfreviewStatuswidthKey = "cq.dam.config.annotation.pdf.reviewStatus.width";

    if(object.has_key(cqdamconfigannotationpdfreviewStatuswidthKey))
    {
        bourne::json value = object[cqdamconfigannotationpdfreviewStatuswidthKey];




        ConfigNodePropertyInteger* obj = &cqdamconfigannotationpdfreviewStatuswidth;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdfreviewStatuscolorapprovedKey = "cq.dam.config.annotation.pdf.reviewStatus.color.approved";

    if(object.has_key(cqdamconfigannotationpdfreviewStatuscolorapprovedKey))
    {
        bourne::json value = object[cqdamconfigannotationpdfreviewStatuscolorapprovedKey];




        ConfigNodePropertyString* obj = &cqdamconfigannotationpdfreviewStatuscolorapproved;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdfreviewStatuscolorrejectedKey = "cq.dam.config.annotation.pdf.reviewStatus.color.rejected";

    if(object.has_key(cqdamconfigannotationpdfreviewStatuscolorrejectedKey))
    {
        bourne::json value = object[cqdamconfigannotationpdfreviewStatuscolorrejectedKey];




        ConfigNodePropertyString* obj = &cqdamconfigannotationpdfreviewStatuscolorrejected;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdfreviewStatuscolorchangesRequestedKey = "cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested";

    if(object.has_key(cqdamconfigannotationpdfreviewStatuscolorchangesRequestedKey))
    {
        bourne::json value = object[cqdamconfigannotationpdfreviewStatuscolorchangesRequestedKey];




        ConfigNodePropertyString* obj = &cqdamconfigannotationpdfreviewStatuscolorchangesRequested;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdfannotationMarkerwidthKey = "cq.dam.config.annotation.pdf.annotationMarker.width";

    if(object.has_key(cqdamconfigannotationpdfannotationMarkerwidthKey))
    {
        bourne::json value = object[cqdamconfigannotationpdfannotationMarkerwidthKey];




        ConfigNodePropertyInteger* obj = &cqdamconfigannotationpdfannotationMarkerwidth;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigannotationpdfassetminheightKey = "cq.dam.config.annotation.pdf.asset.minheight";

    if(object.has_key(cqdamconfigannotationpdfassetminheightKey))
    {
        bourne::json value = object[cqdamconfigannotationpdfassetminheightKey];




        ConfigNodePropertyInteger* obj = &cqdamconfigannotationpdfassetminheight;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamconfigannotationpdfdocumentwidth"] = getCqdamconfigannotationpdfdocumentwidth().toJson();






	object["cqdamconfigannotationpdfdocumentheight"] = getCqdamconfigannotationpdfdocumentheight().toJson();






	object["cqdamconfigannotationpdfdocumentpaddinghorizontal"] = getCqdamconfigannotationpdfdocumentpaddinghorizontal().toJson();






	object["cqdamconfigannotationpdfdocumentpaddingvertical"] = getCqdamconfigannotationpdfdocumentpaddingvertical().toJson();






	object["cqdamconfigannotationpdffontsize"] = getCqdamconfigannotationpdffontsize().toJson();






	object["cqdamconfigannotationpdffontcolor"] = getCqdamconfigannotationpdffontcolor().toJson();






	object["cqdamconfigannotationpdffontfamily"] = getCqdamconfigannotationpdffontfamily().toJson();






	object["cqdamconfigannotationpdffontlight"] = getCqdamconfigannotationpdffontlight().toJson();






	object["cqdamconfigannotationpdfmarginTextImage"] = getCqdamconfigannotationpdfmarginTextImage().toJson();






	object["cqdamconfigannotationpdfminImageHeight"] = getCqdamconfigannotationpdfminImageHeight().toJson();






	object["cqdamconfigannotationpdfreviewStatuswidth"] = getCqdamconfigannotationpdfreviewStatuswidth().toJson();






	object["cqdamconfigannotationpdfreviewStatuscolorapproved"] = getCqdamconfigannotationpdfreviewStatuscolorapproved().toJson();






	object["cqdamconfigannotationpdfreviewStatuscolorrejected"] = getCqdamconfigannotationpdfreviewStatuscolorrejected().toJson();






	object["cqdamconfigannotationpdfreviewStatuscolorchangesRequested"] = getCqdamconfigannotationpdfreviewStatuscolorchangesRequested().toJson();






	object["cqdamconfigannotationpdfannotationMarkerwidth"] = getCqdamconfigannotationpdfannotationMarkerwidth().toJson();






	object["cqdamconfigannotationpdfassetminheight"] = getCqdamconfigannotationpdfassetminheight().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfdocumentwidth()
{
	return cqdamconfigannotationpdfdocumentwidth;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfdocumentwidth(ConfigNodePropertyInteger cqdamconfigannotationpdfdocumentwidth)
{
	this->cqdamconfigannotationpdfdocumentwidth = cqdamconfigannotationpdfdocumentwidth;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfdocumentheight()
{
	return cqdamconfigannotationpdfdocumentheight;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfdocumentheight(ConfigNodePropertyInteger cqdamconfigannotationpdfdocumentheight)
{
	this->cqdamconfigannotationpdfdocumentheight = cqdamconfigannotationpdfdocumentheight;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfdocumentpaddinghorizontal()
{
	return cqdamconfigannotationpdfdocumentpaddinghorizontal;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfdocumentpaddinghorizontal(ConfigNodePropertyInteger cqdamconfigannotationpdfdocumentpaddinghorizontal)
{
	this->cqdamconfigannotationpdfdocumentpaddinghorizontal = cqdamconfigannotationpdfdocumentpaddinghorizontal;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfdocumentpaddingvertical()
{
	return cqdamconfigannotationpdfdocumentpaddingvertical;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfdocumentpaddingvertical(ConfigNodePropertyInteger cqdamconfigannotationpdfdocumentpaddingvertical)
{
	this->cqdamconfigannotationpdfdocumentpaddingvertical = cqdamconfigannotationpdfdocumentpaddingvertical;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdffontsize()
{
	return cqdamconfigannotationpdffontsize;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdffontsize(ConfigNodePropertyInteger cqdamconfigannotationpdffontsize)
{
	this->cqdamconfigannotationpdffontsize = cqdamconfigannotationpdffontsize;
}

ConfigNodePropertyString
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdffontcolor()
{
	return cqdamconfigannotationpdffontcolor;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdffontcolor(ConfigNodePropertyString cqdamconfigannotationpdffontcolor)
{
	this->cqdamconfigannotationpdffontcolor = cqdamconfigannotationpdffontcolor;
}

ConfigNodePropertyString
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdffontfamily()
{
	return cqdamconfigannotationpdffontfamily;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdffontfamily(ConfigNodePropertyString cqdamconfigannotationpdffontfamily)
{
	this->cqdamconfigannotationpdffontfamily = cqdamconfigannotationpdffontfamily;
}

ConfigNodePropertyString
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdffontlight()
{
	return cqdamconfigannotationpdffontlight;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdffontlight(ConfigNodePropertyString cqdamconfigannotationpdffontlight)
{
	this->cqdamconfigannotationpdffontlight = cqdamconfigannotationpdffontlight;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfmarginTextImage()
{
	return cqdamconfigannotationpdfmarginTextImage;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfmarginTextImage(ConfigNodePropertyInteger cqdamconfigannotationpdfmarginTextImage)
{
	this->cqdamconfigannotationpdfmarginTextImage = cqdamconfigannotationpdfmarginTextImage;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfminImageHeight()
{
	return cqdamconfigannotationpdfminImageHeight;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfminImageHeight(ConfigNodePropertyInteger cqdamconfigannotationpdfminImageHeight)
{
	this->cqdamconfigannotationpdfminImageHeight = cqdamconfigannotationpdfminImageHeight;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfreviewStatuswidth()
{
	return cqdamconfigannotationpdfreviewStatuswidth;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfreviewStatuswidth(ConfigNodePropertyInteger cqdamconfigannotationpdfreviewStatuswidth)
{
	this->cqdamconfigannotationpdfreviewStatuswidth = cqdamconfigannotationpdfreviewStatuswidth;
}

ConfigNodePropertyString
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfreviewStatuscolorapproved()
{
	return cqdamconfigannotationpdfreviewStatuscolorapproved;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfreviewStatuscolorapproved(ConfigNodePropertyString cqdamconfigannotationpdfreviewStatuscolorapproved)
{
	this->cqdamconfigannotationpdfreviewStatuscolorapproved = cqdamconfigannotationpdfreviewStatuscolorapproved;
}

ConfigNodePropertyString
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfreviewStatuscolorrejected()
{
	return cqdamconfigannotationpdfreviewStatuscolorrejected;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfreviewStatuscolorrejected(ConfigNodePropertyString cqdamconfigannotationpdfreviewStatuscolorrejected)
{
	this->cqdamconfigannotationpdfreviewStatuscolorrejected = cqdamconfigannotationpdfreviewStatuscolorrejected;
}

ConfigNodePropertyString
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfreviewStatuscolorchangesRequested()
{
	return cqdamconfigannotationpdfreviewStatuscolorchangesRequested;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfreviewStatuscolorchangesRequested(ConfigNodePropertyString cqdamconfigannotationpdfreviewStatuscolorchangesRequested)
{
	this->cqdamconfigannotationpdfreviewStatuscolorchangesRequested = cqdamconfigannotationpdfreviewStatuscolorchangesRequested;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfannotationMarkerwidth()
{
	return cqdamconfigannotationpdfannotationMarkerwidth;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfannotationMarkerwidth(ConfigNodePropertyInteger cqdamconfigannotationpdfannotationMarkerwidth)
{
	this->cqdamconfigannotationpdfannotationMarkerwidth = cqdamconfigannotationpdfannotationMarkerwidth;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::getCqdamconfigannotationpdfassetminheight()
{
	return cqdamconfigannotationpdfassetminheight;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties::setCqdamconfigannotationpdfassetminheight(ConfigNodePropertyInteger cqdamconfigannotationpdfassetminheight)
{
	this->cqdamconfigannotationpdfassetminheight = cqdamconfigannotationpdfassetminheight;
}



