

#include "ComDayCqDamCoreImplReportsReportExportServiceProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplReportsReportExportServiceProperties::ComDayCqDamCoreImplReportsReportExportServiceProperties()
{
	queryBatchSize = ConfigNodePropertyInteger();
}

ComDayCqDamCoreImplReportsReportExportServiceProperties::ComDayCqDamCoreImplReportsReportExportServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplReportsReportExportServiceProperties::~ComDayCqDamCoreImplReportsReportExportServiceProperties()
{

}

void
ComDayCqDamCoreImplReportsReportExportServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *queryBatchSizeKey = "queryBatchSize";

    if(object.has_key(queryBatchSizeKey))
    {
        bourne::json value = object[queryBatchSizeKey];




        ConfigNodePropertyInteger* obj = &queryBatchSize;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplReportsReportExportServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["queryBatchSize"] = getQueryBatchSize().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamCoreImplReportsReportExportServiceProperties::getQueryBatchSize()
{
	return queryBatchSize;
}

void
ComDayCqDamCoreImplReportsReportExportServiceProperties::setQueryBatchSize(ConfigNodePropertyInteger queryBatchSize)
{
	this->queryBatchSize = queryBatchSize;
}



