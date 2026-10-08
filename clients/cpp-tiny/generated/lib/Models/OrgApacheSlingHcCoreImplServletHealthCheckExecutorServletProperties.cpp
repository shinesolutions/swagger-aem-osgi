

#include "OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.h"

using namespace Tiny;

OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties()
{
	servletPath = ConfigNodePropertyString();
	disabled = ConfigNodePropertyBoolean();
	corsaccessControlAllowOrigin = ConfigNodePropertyString();
}

OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::~OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties()
{

}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servletPathKey = "servletPath";

    if(object.has_key(servletPathKey))
    {
        bourne::json value = object[servletPathKey];




        ConfigNodePropertyString* obj = &servletPath;
		obj->fromJson(value.dump());

    }

    const char *disabledKey = "disabled";

    if(object.has_key(disabledKey))
    {
        bourne::json value = object[disabledKey];




        ConfigNodePropertyBoolean* obj = &disabled;
		obj->fromJson(value.dump());

    }

    const char *corsaccessControlAllowOriginKey = "cors.accessControlAllowOrigin";

    if(object.has_key(corsaccessControlAllowOriginKey))
    {
        bourne::json value = object[corsaccessControlAllowOriginKey];




        ConfigNodePropertyString* obj = &corsaccessControlAllowOrigin;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["servletPath"] = getServletPath().toJson();






	object["disabled"] = getDisabled().toJson();






	object["corsaccessControlAllowOrigin"] = getCorsaccessControlAllowOrigin().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::getServletPath()
{
	return servletPath;
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::setServletPath(ConfigNodePropertyString servletPath)
{
	this->servletPath = servletPath;
}

ConfigNodePropertyBoolean
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::getDisabled()
{
	return disabled;
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::setDisabled(ConfigNodePropertyBoolean disabled)
{
	this->disabled = disabled;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::getCorsaccessControlAllowOrigin()
{
	return corsaccessControlAllowOrigin;
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::setCorsaccessControlAllowOrigin(ConfigNodePropertyString corsaccessControlAllowOrigin)
{
	this->corsaccessControlAllowOrigin = corsaccessControlAllowOrigin;
}



