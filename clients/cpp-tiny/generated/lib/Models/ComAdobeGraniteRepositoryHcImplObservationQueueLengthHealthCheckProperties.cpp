

#include "ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties::ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties::ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties::~ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties()
{

}

void
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



