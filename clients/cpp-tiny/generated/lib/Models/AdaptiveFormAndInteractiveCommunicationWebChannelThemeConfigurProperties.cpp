

#include "AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.h"

using namespace Tiny;

AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties()
{
	fontList = ConfigNodePropertyArray();
}

AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::~AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties()
{

}

void
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fontListKey = "fontList";

    if(object.has_key(fontListKey))
    {
        bourne::json value = object[fontListKey];




        ConfigNodePropertyArray* obj = &fontList;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fontList"] = getFontList().toJson();


    return object;

}

ConfigNodePropertyArray
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::getFontList()
{
	return fontList;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::setFontList(ConfigNodePropertyArray fontList)
{
	this->fontList = fontList;
}



