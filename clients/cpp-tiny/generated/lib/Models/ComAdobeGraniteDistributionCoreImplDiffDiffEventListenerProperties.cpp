

#include "ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties()
{
	diffPath = ConfigNodePropertyString();
	serviceName = ConfigNodePropertyString();
	serviceUsertarget = ConfigNodePropertyString();
}

ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::~ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties()
{

}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *diffPathKey = "diffPath";

    if(object.has_key(diffPathKey))
    {
        bourne::json value = object[diffPathKey];




        ConfigNodePropertyString* obj = &diffPath;
		obj->fromJson(value.dump());

    }

    const char *serviceNameKey = "serviceName";

    if(object.has_key(serviceNameKey))
    {
        bourne::json value = object[serviceNameKey];




        ConfigNodePropertyString* obj = &serviceName;
		obj->fromJson(value.dump());

    }

    const char *serviceUsertargetKey = "serviceUser.target";

    if(object.has_key(serviceUsertargetKey))
    {
        bourne::json value = object[serviceUsertargetKey];




        ConfigNodePropertyString* obj = &serviceUsertarget;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["diffPath"] = getDiffPath().toJson();






	object["serviceName"] = getServiceName().toJson();






	object["serviceUsertarget"] = getServiceUsertarget().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::getDiffPath()
{
	return diffPath;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::setDiffPath(ConfigNodePropertyString diffPath)
{
	this->diffPath = diffPath;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::getServiceName()
{
	return serviceName;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::setServiceName(ConfigNodePropertyString serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::getServiceUsertarget()
{
	return serviceUsertarget;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::setServiceUsertarget(ConfigNodePropertyString serviceUsertarget)
{
	this->serviceUsertarget = serviceUsertarget;
}



