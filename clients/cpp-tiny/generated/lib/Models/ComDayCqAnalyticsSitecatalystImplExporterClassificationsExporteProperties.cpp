

#include "ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.h"

using namespace Tiny;

ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties()
{
	allowedpaths = ConfigNodePropertyArray();
	cqanalyticssaintexporterpagesize = ConfigNodePropertyInteger();
}

ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::~ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties()
{

}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *allowedpathsKey = "allowed.paths";

    if(object.has_key(allowedpathsKey))
    {
        bourne::json value = object[allowedpathsKey];




        ConfigNodePropertyArray* obj = &allowedpaths;
		obj->fromJson(value.dump());

    }

    const char *cqanalyticssaintexporterpagesizeKey = "cq.analytics.saint.exporter.pagesize";

    if(object.has_key(cqanalyticssaintexporterpagesizeKey))
    {
        bourne::json value = object[cqanalyticssaintexporterpagesizeKey];




        ConfigNodePropertyInteger* obj = &cqanalyticssaintexporterpagesize;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["allowedpaths"] = getAllowedpaths().toJson();






	object["cqanalyticssaintexporterpagesize"] = getCqanalyticssaintexporterpagesize().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::getAllowedpaths()
{
	return allowedpaths;
}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::setAllowedpaths(ConfigNodePropertyArray allowedpaths)
{
	this->allowedpaths = allowedpaths;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::getCqanalyticssaintexporterpagesize()
{
	return cqanalyticssaintexporterpagesize;
}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::setCqanalyticssaintexporterpagesize(ConfigNodePropertyInteger cqanalyticssaintexporterpagesize)
{
	this->cqanalyticssaintexporterpagesize = cqanalyticssaintexporterpagesize;
}



