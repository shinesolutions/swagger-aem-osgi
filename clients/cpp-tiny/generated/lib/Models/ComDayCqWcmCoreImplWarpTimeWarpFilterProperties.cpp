

#include "ComDayCqWcmCoreImplWarpTimeWarpFilterProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplWarpTimeWarpFilterProperties::ComDayCqWcmCoreImplWarpTimeWarpFilterProperties()
{
	filterorder = ConfigNodePropertyString();
	filterscope = ConfigNodePropertyString();
}

ComDayCqWcmCoreImplWarpTimeWarpFilterProperties::ComDayCqWcmCoreImplWarpTimeWarpFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplWarpTimeWarpFilterProperties::~ComDayCqWcmCoreImplWarpTimeWarpFilterProperties()
{

}

void
ComDayCqWcmCoreImplWarpTimeWarpFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *filterorderKey = "filter.order";

    if(object.has_key(filterorderKey))
    {
        bourne::json value = object[filterorderKey];




        ConfigNodePropertyString* obj = &filterorder;
		obj->fromJson(value.dump());

    }

    const char *filterscopeKey = "filter.scope";

    if(object.has_key(filterscopeKey))
    {
        bourne::json value = object[filterscopeKey];




        ConfigNodePropertyString* obj = &filterscope;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplWarpTimeWarpFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["filterorder"] = getFilterorder().toJson();






	object["filterscope"] = getFilterscope().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreImplWarpTimeWarpFilterProperties::getFilterorder()
{
	return filterorder;
}

void
ComDayCqWcmCoreImplWarpTimeWarpFilterProperties::setFilterorder(ConfigNodePropertyString filterorder)
{
	this->filterorder = filterorder;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplWarpTimeWarpFilterProperties::getFilterscope()
{
	return filterscope;
}

void
ComDayCqWcmCoreImplWarpTimeWarpFilterProperties::setFilterscope(ConfigNodePropertyString filterscope)
{
	this->filterscope = filterscope;
}



