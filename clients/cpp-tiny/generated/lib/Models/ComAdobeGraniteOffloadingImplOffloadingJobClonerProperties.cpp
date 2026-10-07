

#include "ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.h"

using namespace Tiny;

ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties()
{
	offloadingjobclonerenabled = ConfigNodePropertyBoolean();
}

ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::~ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties()
{

}

void
ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offloadingjobclonerenabledKey = "offloading.jobcloner.enabled";

    if(object.has_key(offloadingjobclonerenabledKey))
    {
        bourne::json value = object[offloadingjobclonerenabledKey];




        ConfigNodePropertyBoolean* obj = &offloadingjobclonerenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["offloadingjobclonerenabled"] = getOffloadingjobclonerenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::getOffloadingjobclonerenabled()
{
	return offloadingjobclonerenabled;
}

void
ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::setOffloadingjobclonerenabled(ConfigNodePropertyBoolean offloadingjobclonerenabled)
{
	this->offloadingjobclonerenabled = offloadingjobclonerenabled;
}



