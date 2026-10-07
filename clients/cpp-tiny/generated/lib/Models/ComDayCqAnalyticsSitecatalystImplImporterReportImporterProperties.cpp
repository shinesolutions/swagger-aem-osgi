

#include "ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.h"

using namespace Tiny;

ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties()
{
	reportfetchattempts = ConfigNodePropertyInteger();
	reportfetchdelay = ConfigNodePropertyInteger();
}

ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::~ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties()
{

}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *reportfetchattemptsKey = "report.fetch.attempts";

    if(object.has_key(reportfetchattemptsKey))
    {
        bourne::json value = object[reportfetchattemptsKey];




        ConfigNodePropertyInteger* obj = &reportfetchattempts;
		obj->fromJson(value.dump());

    }

    const char *reportfetchdelayKey = "report.fetch.delay";

    if(object.has_key(reportfetchdelayKey))
    {
        bourne::json value = object[reportfetchdelayKey];




        ConfigNodePropertyInteger* obj = &reportfetchdelay;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["reportfetchattempts"] = getReportfetchattempts().toJson();






	object["reportfetchdelay"] = getReportfetchdelay().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::getReportfetchattempts()
{
	return reportfetchattempts;
}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::setReportfetchattempts(ConfigNodePropertyInteger reportfetchattempts)
{
	this->reportfetchattempts = reportfetchattempts;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::getReportfetchdelay()
{
	return reportfetchdelay;
}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::setReportfetchdelay(ConfigNodePropertyInteger reportfetchdelay)
{
	this->reportfetchdelay = reportfetchdelay;
}



