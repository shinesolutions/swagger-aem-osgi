

#include "ComDayCqDamCoreImplServletGuidLookupFilterProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletGuidLookupFilterProperties::ComDayCqDamCoreImplServletGuidLookupFilterProperties()
{
	cqdamcoreguidlookupfilterenabled = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplServletGuidLookupFilterProperties::ComDayCqDamCoreImplServletGuidLookupFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletGuidLookupFilterProperties::~ComDayCqDamCoreImplServletGuidLookupFilterProperties()
{

}

void
ComDayCqDamCoreImplServletGuidLookupFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamcoreguidlookupfilterenabledKey = "cq.dam.core.guidlookupfilter.enabled";

    if(object.has_key(cqdamcoreguidlookupfilterenabledKey))
    {
        bourne::json value = object[cqdamcoreguidlookupfilterenabledKey];




        ConfigNodePropertyBoolean* obj = &cqdamcoreguidlookupfilterenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletGuidLookupFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamcoreguidlookupfilterenabled"] = getCqdamcoreguidlookupfilterenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletGuidLookupFilterProperties::getCqdamcoreguidlookupfilterenabled()
{
	return cqdamcoreguidlookupfilterenabled;
}

void
ComDayCqDamCoreImplServletGuidLookupFilterProperties::setCqdamcoreguidlookupfilterenabled(ConfigNodePropertyBoolean cqdamcoreguidlookupfilterenabled)
{
	this->cqdamcoreguidlookupfilterenabled = cqdamcoreguidlookupfilterenabled;
}



