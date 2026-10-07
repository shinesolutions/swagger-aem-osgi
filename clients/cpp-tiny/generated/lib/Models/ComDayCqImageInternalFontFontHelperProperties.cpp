

#include "ComDayCqImageInternalFontFontHelperProperties.h"

using namespace Tiny;

ComDayCqImageInternalFontFontHelperProperties::ComDayCqImageInternalFontFontHelperProperties()
{
	fontpath = ConfigNodePropertyArray();
	oversamplingFactor = ConfigNodePropertyInteger();
}

ComDayCqImageInternalFontFontHelperProperties::ComDayCqImageInternalFontFontHelperProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqImageInternalFontFontHelperProperties::~ComDayCqImageInternalFontFontHelperProperties()
{

}

void
ComDayCqImageInternalFontFontHelperProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fontpathKey = "fontpath";

    if(object.has_key(fontpathKey))
    {
        bourne::json value = object[fontpathKey];




        ConfigNodePropertyArray* obj = &fontpath;
		obj->fromJson(value.dump());

    }

    const char *oversamplingFactorKey = "oversamplingFactor";

    if(object.has_key(oversamplingFactorKey))
    {
        bourne::json value = object[oversamplingFactorKey];




        ConfigNodePropertyInteger* obj = &oversamplingFactor;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqImageInternalFontFontHelperProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fontpath"] = getFontpath().toJson();






	object["oversamplingFactor"] = getOversamplingFactor().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqImageInternalFontFontHelperProperties::getFontpath()
{
	return fontpath;
}

void
ComDayCqImageInternalFontFontHelperProperties::setFontpath(ConfigNodePropertyArray fontpath)
{
	this->fontpath = fontpath;
}

ConfigNodePropertyInteger
ComDayCqImageInternalFontFontHelperProperties::getOversamplingFactor()
{
	return oversamplingFactor;
}

void
ComDayCqImageInternalFontFontHelperProperties::setOversamplingFactor(ConfigNodePropertyInteger oversamplingFactor)
{
	this->oversamplingFactor = oversamplingFactor;
}



