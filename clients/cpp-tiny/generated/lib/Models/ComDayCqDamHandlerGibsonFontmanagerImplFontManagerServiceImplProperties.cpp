

#include "ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.h"

using namespace Tiny;

ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties()
{
	eventfilter = ConfigNodePropertyString();
	fontmgrsystemfontdir = ConfigNodePropertyArray();
	fontmgradobefontdir = ConfigNodePropertyString();
	fontmgrcustomerfontdir = ConfigNodePropertyString();
}

ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::~ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties()
{

}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *eventfilterKey = "event.filter";

    if(object.has_key(eventfilterKey))
    {
        bourne::json value = object[eventfilterKey];




        ConfigNodePropertyString* obj = &eventfilter;
		obj->fromJson(value.dump());

    }

    const char *fontmgrsystemfontdirKey = "fontmgr.system.font.dir";

    if(object.has_key(fontmgrsystemfontdirKey))
    {
        bourne::json value = object[fontmgrsystemfontdirKey];




        ConfigNodePropertyArray* obj = &fontmgrsystemfontdir;
		obj->fromJson(value.dump());

    }

    const char *fontmgradobefontdirKey = "fontmgr.adobe.font.dir";

    if(object.has_key(fontmgradobefontdirKey))
    {
        bourne::json value = object[fontmgradobefontdirKey];




        ConfigNodePropertyString* obj = &fontmgradobefontdir;
		obj->fromJson(value.dump());

    }

    const char *fontmgrcustomerfontdirKey = "fontmgr.customer.font.dir";

    if(object.has_key(fontmgrcustomerfontdirKey))
    {
        bourne::json value = object[fontmgrcustomerfontdirKey];




        ConfigNodePropertyString* obj = &fontmgrcustomerfontdir;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventfilter"] = getEventfilter().toJson();






	object["fontmgrsystemfontdir"] = getFontmgrsystemfontdir().toJson();






	object["fontmgradobefontdir"] = getFontmgradobefontdir().toJson();






	object["fontmgrcustomerfontdir"] = getFontmgrcustomerfontdir().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::getEventfilter()
{
	return eventfilter;
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyArray
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::getFontmgrsystemfontdir()
{
	return fontmgrsystemfontdir;
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::setFontmgrsystemfontdir(ConfigNodePropertyArray fontmgrsystemfontdir)
{
	this->fontmgrsystemfontdir = fontmgrsystemfontdir;
}

ConfigNodePropertyString
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::getFontmgradobefontdir()
{
	return fontmgradobefontdir;
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::setFontmgradobefontdir(ConfigNodePropertyString fontmgradobefontdir)
{
	this->fontmgradobefontdir = fontmgradobefontdir;
}

ConfigNodePropertyString
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::getFontmgrcustomerfontdir()
{
	return fontmgrcustomerfontdir;
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::setFontmgrcustomerfontdir(ConfigNodePropertyString fontmgrcustomerfontdir)
{
	this->fontmgrcustomerfontdir = fontmgrcustomerfontdir;
}



