

#include "ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.h"

using namespace Tiny;

ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties()
{
	cqsocialconsoleanalyticssitesmapping = ConfigNodePropertyArray();
	priority = ConfigNodePropertyInteger();
}

ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::~ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties()
{

}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqsocialconsoleanalyticssitesmappingKey = "cq.social.console.analytics.sites.mapping";

    if(object.has_key(cqsocialconsoleanalyticssitesmappingKey))
    {
        bourne::json value = object[cqsocialconsoleanalyticssitesmappingKey];




        ConfigNodePropertyArray* obj = &cqsocialconsoleanalyticssitesmapping;
		obj->fromJson(value.dump());

    }

    const char *priorityKey = "priority";

    if(object.has_key(priorityKey))
    {
        bourne::json value = object[priorityKey];




        ConfigNodePropertyInteger* obj = &priority;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqsocialconsoleanalyticssitesmapping"] = getCqsocialconsoleanalyticssitesmapping().toJson();






	object["priority"] = getPriority().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::getCqsocialconsoleanalyticssitesmapping()
{
	return cqsocialconsoleanalyticssitesmapping;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::setCqsocialconsoleanalyticssitesmapping(ConfigNodePropertyArray cqsocialconsoleanalyticssitesmapping)
{
	this->cqsocialconsoleanalyticssitesmapping = cqsocialconsoleanalyticssitesmapping;
}

ConfigNodePropertyInteger
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::setPriority(ConfigNodePropertyInteger priority)
{
	this->priority = priority;
}



