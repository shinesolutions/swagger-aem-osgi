

#include "ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.h"

using namespace Tiny;

ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties()
{
	translatelanguage = ConfigNodePropertyDropDown();
	translatedisplay = ConfigNodePropertyDropDown();
	translateattribution = ConfigNodePropertyBoolean();
	translatecaching = ConfigNodePropertyDropDown();
	translatesmartrendering = ConfigNodePropertyDropDown();
	translatecachingduration = ConfigNodePropertyString();
	translatesessionsaveinterval = ConfigNodePropertyString();
	translatesessionsavebatchLimit = ConfigNodePropertyString();
}

ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::~ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties()
{

}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *translatelanguageKey = "translate.language";

    if(object.has_key(translatelanguageKey))
    {
        bourne::json value = object[translatelanguageKey];




        ConfigNodePropertyDropDown* obj = &translatelanguage;
		obj->fromJson(value.dump());

    }

    const char *translatedisplayKey = "translate.display";

    if(object.has_key(translatedisplayKey))
    {
        bourne::json value = object[translatedisplayKey];




        ConfigNodePropertyDropDown* obj = &translatedisplay;
		obj->fromJson(value.dump());

    }

    const char *translateattributionKey = "translate.attribution";

    if(object.has_key(translateattributionKey))
    {
        bourne::json value = object[translateattributionKey];




        ConfigNodePropertyBoolean* obj = &translateattribution;
		obj->fromJson(value.dump());

    }

    const char *translatecachingKey = "translate.caching";

    if(object.has_key(translatecachingKey))
    {
        bourne::json value = object[translatecachingKey];




        ConfigNodePropertyDropDown* obj = &translatecaching;
		obj->fromJson(value.dump());

    }

    const char *translatesmartrenderingKey = "translate.smart.rendering";

    if(object.has_key(translatesmartrenderingKey))
    {
        bourne::json value = object[translatesmartrenderingKey];




        ConfigNodePropertyDropDown* obj = &translatesmartrendering;
		obj->fromJson(value.dump());

    }

    const char *translatecachingdurationKey = "translate.caching.duration";

    if(object.has_key(translatecachingdurationKey))
    {
        bourne::json value = object[translatecachingdurationKey];




        ConfigNodePropertyString* obj = &translatecachingduration;
		obj->fromJson(value.dump());

    }

    const char *translatesessionsaveintervalKey = "translate.session.save.interval";

    if(object.has_key(translatesessionsaveintervalKey))
    {
        bourne::json value = object[translatesessionsaveintervalKey];




        ConfigNodePropertyString* obj = &translatesessionsaveinterval;
		obj->fromJson(value.dump());

    }

    const char *translatesessionsavebatchLimitKey = "translate.session.save.batchLimit";

    if(object.has_key(translatesessionsavebatchLimitKey))
    {
        bourne::json value = object[translatesessionsavebatchLimitKey];




        ConfigNodePropertyString* obj = &translatesessionsavebatchLimit;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["translatelanguage"] = getTranslatelanguage().toJson();






	object["translatedisplay"] = getTranslatedisplay().toJson();






	object["translateattribution"] = getTranslateattribution().toJson();






	object["translatecaching"] = getTranslatecaching().toJson();






	object["translatesmartrendering"] = getTranslatesmartrendering().toJson();






	object["translatecachingduration"] = getTranslatecachingduration().toJson();






	object["translatesessionsaveinterval"] = getTranslatesessionsaveinterval().toJson();






	object["translatesessionsavebatchLimit"] = getTranslatesessionsavebatchLimit().toJson();


    return object;

}

ConfigNodePropertyDropDown
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatelanguage()
{
	return translatelanguage;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatelanguage(ConfigNodePropertyDropDown translatelanguage)
{
	this->translatelanguage = translatelanguage;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatedisplay()
{
	return translatedisplay;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatedisplay(ConfigNodePropertyDropDown translatedisplay)
{
	this->translatedisplay = translatedisplay;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslateattribution()
{
	return translateattribution;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslateattribution(ConfigNodePropertyBoolean translateattribution)
{
	this->translateattribution = translateattribution;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatecaching()
{
	return translatecaching;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatecaching(ConfigNodePropertyDropDown translatecaching)
{
	this->translatecaching = translatecaching;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatesmartrendering()
{
	return translatesmartrendering;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatesmartrendering(ConfigNodePropertyDropDown translatesmartrendering)
{
	this->translatesmartrendering = translatesmartrendering;
}

ConfigNodePropertyString
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatecachingduration()
{
	return translatecachingduration;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatecachingduration(ConfigNodePropertyString translatecachingduration)
{
	this->translatecachingduration = translatecachingduration;
}

ConfigNodePropertyString
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatesessionsaveinterval()
{
	return translatesessionsaveinterval;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatesessionsaveinterval(ConfigNodePropertyString translatesessionsaveinterval)
{
	this->translatesessionsaveinterval = translatesessionsaveinterval;
}

ConfigNodePropertyString
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatesessionsavebatchLimit()
{
	return translatesessionsavebatchLimit;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatesessionsavebatchLimit(ConfigNodePropertyString translatesessionsavebatchLimit)
{
	this->translatesessionsavebatchLimit = translatesessionsavebatchLimit;
}



