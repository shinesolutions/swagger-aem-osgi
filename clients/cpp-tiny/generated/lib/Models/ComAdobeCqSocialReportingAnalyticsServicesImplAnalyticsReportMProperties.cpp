

#include "ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.h"

using namespace Tiny;

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties()
{
	reportfetchdelay = ConfigNodePropertyInteger();
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::~ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties()
{

}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *reportfetchdelayKey = "report.fetch.delay";

    if(object.has_key(reportfetchdelayKey))
    {
        bourne::json value = object[reportfetchdelayKey];




        ConfigNodePropertyInteger* obj = &reportfetchdelay;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["reportfetchdelay"] = getReportfetchdelay().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::getReportfetchdelay()
{
	return reportfetchdelay;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::setReportfetchdelay(ConfigNodePropertyInteger reportfetchdelay)
{
	this->reportfetchdelay = reportfetchdelay;
}



