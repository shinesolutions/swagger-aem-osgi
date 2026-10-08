

#include "ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.h"

using namespace Tiny;

ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties()
{
	reportingservicesurl = ConfigNodePropertyString();
}

ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::~ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties()
{

}

void
ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *reportingservicesurlKey = "reportingservices.url";

    if(object.has_key(reportingservicesurlKey))
    {
        bourne::json value = object[reportingservicesurlKey];




        ConfigNodePropertyString* obj = &reportingservicesurl;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["reportingservicesurl"] = getReportingservicesurl().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::getReportingservicesurl()
{
	return reportingservicesurl;
}

void
ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::setReportingservicesurl(ConfigNodePropertyString reportingservicesurl)
{
	this->reportingservicesurl = reportingservicesurl;
}



