

#include "ComDayCqWcmCoreImplServletsFindReplaceServletProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplServletsFindReplaceServletProperties::ComDayCqWcmCoreImplServletsFindReplaceServletProperties()
{
	scope = ConfigNodePropertyArray();
}

ComDayCqWcmCoreImplServletsFindReplaceServletProperties::ComDayCqWcmCoreImplServletsFindReplaceServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplServletsFindReplaceServletProperties::~ComDayCqWcmCoreImplServletsFindReplaceServletProperties()
{

}

void
ComDayCqWcmCoreImplServletsFindReplaceServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *scopeKey = "scope";

    if(object.has_key(scopeKey))
    {
        bourne::json value = object[scopeKey];




        ConfigNodePropertyArray* obj = &scope;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplServletsFindReplaceServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["scope"] = getScope().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmCoreImplServletsFindReplaceServletProperties::getScope()
{
	return scope;
}

void
ComDayCqWcmCoreImplServletsFindReplaceServletProperties::setScope(ConfigNodePropertyArray scope)
{
	this->scope = scope;
}



