

#include "ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.h"

using namespace Tiny;

ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties()
{
	cqsocialconsoleanalyticscomponents = ConfigNodePropertyArray();
}

ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::~ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties()
{

}

void
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqsocialconsoleanalyticscomponentsKey = "cq.social.console.analytics.components";

    if(object.has_key(cqsocialconsoleanalyticscomponentsKey))
    {
        bourne::json value = object[cqsocialconsoleanalyticscomponentsKey];




        ConfigNodePropertyArray* obj = &cqsocialconsoleanalyticscomponents;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqsocialconsoleanalyticscomponents"] = getCqsocialconsoleanalyticscomponents().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::getCqsocialconsoleanalyticscomponents()
{
	return cqsocialconsoleanalyticscomponents;
}

void
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::setCqsocialconsoleanalyticscomponents(ConfigNodePropertyArray cqsocialconsoleanalyticscomponents)
{
	this->cqsocialconsoleanalyticscomponents = cqsocialconsoleanalyticscomponents;
}



