

#include "ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties()
{
	comadobecqscreensanalyticsimplurl = ConfigNodePropertyString();
	comadobecqscreensanalyticsimplapikey = ConfigNodePropertyString();
	comadobecqscreensanalyticsimplproject = ConfigNodePropertyString();
	comadobecqscreensanalyticsimplenvironment = ConfigNodePropertyDropDown();
	comadobecqscreensanalyticsimplsendFrequency = ConfigNodePropertyInteger();
}

ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::~ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties()
{

}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comadobecqscreensanalyticsimplurlKey = "com.adobe.cq.screens.analytics.impl.url";

    if(object.has_key(comadobecqscreensanalyticsimplurlKey))
    {
        bourne::json value = object[comadobecqscreensanalyticsimplurlKey];




        ConfigNodePropertyString* obj = &comadobecqscreensanalyticsimplurl;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensanalyticsimplapikeyKey = "com.adobe.cq.screens.analytics.impl.apikey";

    if(object.has_key(comadobecqscreensanalyticsimplapikeyKey))
    {
        bourne::json value = object[comadobecqscreensanalyticsimplapikeyKey];




        ConfigNodePropertyString* obj = &comadobecqscreensanalyticsimplapikey;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensanalyticsimplprojectKey = "com.adobe.cq.screens.analytics.impl.project";

    if(object.has_key(comadobecqscreensanalyticsimplprojectKey))
    {
        bourne::json value = object[comadobecqscreensanalyticsimplprojectKey];




        ConfigNodePropertyString* obj = &comadobecqscreensanalyticsimplproject;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensanalyticsimplenvironmentKey = "com.adobe.cq.screens.analytics.impl.environment";

    if(object.has_key(comadobecqscreensanalyticsimplenvironmentKey))
    {
        bourne::json value = object[comadobecqscreensanalyticsimplenvironmentKey];




        ConfigNodePropertyDropDown* obj = &comadobecqscreensanalyticsimplenvironment;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensanalyticsimplsendFrequencyKey = "com.adobe.cq.screens.analytics.impl.sendFrequency";

    if(object.has_key(comadobecqscreensanalyticsimplsendFrequencyKey))
    {
        bourne::json value = object[comadobecqscreensanalyticsimplsendFrequencyKey];




        ConfigNodePropertyInteger* obj = &comadobecqscreensanalyticsimplsendFrequency;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comadobecqscreensanalyticsimplurl"] = getComadobecqscreensanalyticsimplurl().toJson();






	object["comadobecqscreensanalyticsimplapikey"] = getComadobecqscreensanalyticsimplapikey().toJson();






	object["comadobecqscreensanalyticsimplproject"] = getComadobecqscreensanalyticsimplproject().toJson();






	object["comadobecqscreensanalyticsimplenvironment"] = getComadobecqscreensanalyticsimplenvironment().toJson();






	object["comadobecqscreensanalyticsimplsendFrequency"] = getComadobecqscreensanalyticsimplsendFrequency().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComadobecqscreensanalyticsimplurl()
{
	return comadobecqscreensanalyticsimplurl;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComadobecqscreensanalyticsimplurl(ConfigNodePropertyString comadobecqscreensanalyticsimplurl)
{
	this->comadobecqscreensanalyticsimplurl = comadobecqscreensanalyticsimplurl;
}

ConfigNodePropertyString
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComadobecqscreensanalyticsimplapikey()
{
	return comadobecqscreensanalyticsimplapikey;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComadobecqscreensanalyticsimplapikey(ConfigNodePropertyString comadobecqscreensanalyticsimplapikey)
{
	this->comadobecqscreensanalyticsimplapikey = comadobecqscreensanalyticsimplapikey;
}

ConfigNodePropertyString
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComadobecqscreensanalyticsimplproject()
{
	return comadobecqscreensanalyticsimplproject;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComadobecqscreensanalyticsimplproject(ConfigNodePropertyString comadobecqscreensanalyticsimplproject)
{
	this->comadobecqscreensanalyticsimplproject = comadobecqscreensanalyticsimplproject;
}

ConfigNodePropertyDropDown
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComadobecqscreensanalyticsimplenvironment()
{
	return comadobecqscreensanalyticsimplenvironment;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComadobecqscreensanalyticsimplenvironment(ConfigNodePropertyDropDown comadobecqscreensanalyticsimplenvironment)
{
	this->comadobecqscreensanalyticsimplenvironment = comadobecqscreensanalyticsimplenvironment;
}

ConfigNodePropertyInteger
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComadobecqscreensanalyticsimplsendFrequency()
{
	return comadobecqscreensanalyticsimplsendFrequency;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComadobecqscreensanalyticsimplsendFrequency(ConfigNodePropertyInteger comadobecqscreensanalyticsimplsendFrequency)
{
	this->comadobecqscreensanalyticsimplsendFrequency = comadobecqscreensanalyticsimplsendFrequency;
}



