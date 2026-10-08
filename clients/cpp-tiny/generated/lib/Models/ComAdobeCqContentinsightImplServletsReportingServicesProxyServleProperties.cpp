

#include "ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.h"

using namespace Tiny;

ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties()
{
	reportingservicesproxywhitelist = ConfigNodePropertyArray();
}

ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::~ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties()
{

}

void
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *reportingservicesproxywhitelistKey = "reportingservices.proxy.whitelist";

    if(object.has_key(reportingservicesproxywhitelistKey))
    {
        bourne::json value = object[reportingservicesproxywhitelistKey];




        ConfigNodePropertyArray* obj = &reportingservicesproxywhitelist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["reportingservicesproxywhitelist"] = getReportingservicesproxywhitelist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::getReportingservicesproxywhitelist()
{
	return reportingservicesproxywhitelist;
}

void
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::setReportingservicesproxywhitelist(ConfigNodePropertyArray reportingservicesproxywhitelist)
{
	this->reportingservicesproxywhitelist = reportingservicesproxywhitelist;
}



