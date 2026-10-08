

#include "ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.h"

using namespace Tiny;

ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties()
{
	offloadingoffloaderenabled = ConfigNodePropertyBoolean();
}

ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::~ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties()
{

}

void
ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offloadingoffloaderenabledKey = "offloading.offloader.enabled";

    if(object.has_key(offloadingoffloaderenabledKey))
    {
        bourne::json value = object[offloadingoffloaderenabledKey];




        ConfigNodePropertyBoolean* obj = &offloadingoffloaderenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["offloadingoffloaderenabled"] = getOffloadingoffloaderenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::getOffloadingoffloaderenabled()
{
	return offloadingoffloaderenabled;
}

void
ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::setOffloadingoffloaderenabled(ConfigNodePropertyBoolean offloadingoffloaderenabled)
{
	this->offloadingoffloaderenabled = offloadingoffloaderenabled;
}



