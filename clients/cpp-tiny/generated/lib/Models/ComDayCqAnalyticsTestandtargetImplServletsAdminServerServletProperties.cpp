

#include "ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties()
{
	testandtargetendpointurl = ConfigNodePropertyString();
}

ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::~ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties()
{

}

void
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *testandtargetendpointurlKey = "testandtarget.endpoint.url";

    if(object.has_key(testandtargetendpointurlKey))
    {
        bourne::json value = object[testandtargetendpointurlKey];




        ConfigNodePropertyString* obj = &testandtargetendpointurl;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["testandtargetendpointurl"] = getTestandtargetendpointurl().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::getTestandtargetendpointurl()
{
	return testandtargetendpointurl;
}

void
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::setTestandtargetendpointurl(ConfigNodePropertyString testandtargetendpointurl)
{
	this->testandtargetendpointurl = testandtargetendpointurl;
}



