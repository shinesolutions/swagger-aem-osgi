

#include "ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties()
{
	cqanalyticstestandtargetsegmentimporterenabled = ConfigNodePropertyBoolean();
}

ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::~ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties()
{

}

void
ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqanalyticstestandtargetsegmentimporterenabledKey = "cq.analytics.testandtarget.segmentimporter.enabled";

    if(object.has_key(cqanalyticstestandtargetsegmentimporterenabledKey))
    {
        bourne::json value = object[cqanalyticstestandtargetsegmentimporterenabledKey];




        ConfigNodePropertyBoolean* obj = &cqanalyticstestandtargetsegmentimporterenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqanalyticstestandtargetsegmentimporterenabled"] = getCqanalyticstestandtargetsegmentimporterenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::getCqanalyticstestandtargetsegmentimporterenabled()
{
	return cqanalyticstestandtargetsegmentimporterenabled;
}

void
ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::setCqanalyticstestandtargetsegmentimporterenabled(ConfigNodePropertyBoolean cqanalyticstestandtargetsegmentimporterenabled)
{
	this->cqanalyticstestandtargetsegmentimporterenabled = cqanalyticstestandtargetsegmentimporterenabled;
}



