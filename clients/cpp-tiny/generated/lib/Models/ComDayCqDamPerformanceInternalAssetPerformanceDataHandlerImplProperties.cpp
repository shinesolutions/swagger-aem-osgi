

#include "ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.h"

using namespace Tiny;

ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties()
{
	batchcommitsize = ConfigNodePropertyInteger();
}

ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::~ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties()
{

}

void
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *batchcommitsizeKey = "batch.commit.size";

    if(object.has_key(batchcommitsizeKey))
    {
        bourne::json value = object[batchcommitsizeKey];




        ConfigNodePropertyInteger* obj = &batchcommitsize;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["batchcommitsize"] = getBatchcommitsize().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::getBatchcommitsize()
{
	return batchcommitsize;
}

void
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::setBatchcommitsize(ConfigNodePropertyInteger batchcommitsize)
{
	this->batchcommitsize = batchcommitsize;
}



