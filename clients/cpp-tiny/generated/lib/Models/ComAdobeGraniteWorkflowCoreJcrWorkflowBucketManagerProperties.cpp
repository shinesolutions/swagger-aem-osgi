

#include "ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties()
{
	bucketSize = ConfigNodePropertyInteger();
}

ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::~ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties()
{

}

void
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bucketSizeKey = "bucketSize";

    if(object.has_key(bucketSizeKey))
    {
        bourne::json value = object[bucketSizeKey];




        ConfigNodePropertyInteger* obj = &bucketSize;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["bucketSize"] = getBucketSize().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::getBucketSize()
{
	return bucketSize;
}

void
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::setBucketSize(ConfigNodePropertyInteger bucketSize)
{
	this->bucketSize = bucketSize;
}



