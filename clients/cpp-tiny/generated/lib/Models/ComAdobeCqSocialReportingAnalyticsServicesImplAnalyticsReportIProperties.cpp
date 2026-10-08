

#include "ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.h"

using namespace Tiny;

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties()
{
	cqsocialreportinganalyticspollingimporterinterval = ConfigNodePropertyInteger();
	cqsocialreportinganalyticspollingimporterpageSize = ConfigNodePropertyInteger();
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::~ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties()
{

}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqsocialreportinganalyticspollingimporterintervalKey = "cq.social.reporting.analytics.polling.importer.interval";

    if(object.has_key(cqsocialreportinganalyticspollingimporterintervalKey))
    {
        bourne::json value = object[cqsocialreportinganalyticspollingimporterintervalKey];




        ConfigNodePropertyInteger* obj = &cqsocialreportinganalyticspollingimporterinterval;
		obj->fromJson(value.dump());

    }

    const char *cqsocialreportinganalyticspollingimporterpageSizeKey = "cq.social.reporting.analytics.polling.importer.pageSize";

    if(object.has_key(cqsocialreportinganalyticspollingimporterpageSizeKey))
    {
        bourne::json value = object[cqsocialreportinganalyticspollingimporterpageSizeKey];




        ConfigNodePropertyInteger* obj = &cqsocialreportinganalyticspollingimporterpageSize;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqsocialreportinganalyticspollingimporterinterval"] = getCqsocialreportinganalyticspollingimporterinterval().toJson();






	object["cqsocialreportinganalyticspollingimporterpageSize"] = getCqsocialreportinganalyticspollingimporterpageSize().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::getCqsocialreportinganalyticspollingimporterinterval()
{
	return cqsocialreportinganalyticspollingimporterinterval;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::setCqsocialreportinganalyticspollingimporterinterval(ConfigNodePropertyInteger cqsocialreportinganalyticspollingimporterinterval)
{
	this->cqsocialreportinganalyticspollingimporterinterval = cqsocialreportinganalyticspollingimporterinterval;
}

ConfigNodePropertyInteger
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::getCqsocialreportinganalyticspollingimporterpageSize()
{
	return cqsocialreportinganalyticspollingimporterpageSize;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::setCqsocialreportinganalyticspollingimporterpageSize(ConfigNodePropertyInteger cqsocialreportinganalyticspollingimporterpageSize)
{
	this->cqsocialreportinganalyticspollingimporterpageSize = cqsocialreportinganalyticspollingimporterpageSize;
}



