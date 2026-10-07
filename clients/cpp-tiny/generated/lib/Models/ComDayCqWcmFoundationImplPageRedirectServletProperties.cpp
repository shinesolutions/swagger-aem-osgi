

#include "ComDayCqWcmFoundationImplPageRedirectServletProperties.h"

using namespace Tiny;

ComDayCqWcmFoundationImplPageRedirectServletProperties::ComDayCqWcmFoundationImplPageRedirectServletProperties()
{
	excludedresourcetypes = ConfigNodePropertyArray();
}

ComDayCqWcmFoundationImplPageRedirectServletProperties::ComDayCqWcmFoundationImplPageRedirectServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationImplPageRedirectServletProperties::~ComDayCqWcmFoundationImplPageRedirectServletProperties()
{

}

void
ComDayCqWcmFoundationImplPageRedirectServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *excludedresourcetypesKey = "excluded.resource.types";

    if(object.has_key(excludedresourcetypesKey))
    {
        bourne::json value = object[excludedresourcetypesKey];




        ConfigNodePropertyArray* obj = &excludedresourcetypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationImplPageRedirectServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["excludedresourcetypes"] = getExcludedresourcetypes().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmFoundationImplPageRedirectServletProperties::getExcludedresourcetypes()
{
	return excludedresourcetypes;
}

void
ComDayCqWcmFoundationImplPageRedirectServletProperties::setExcludedresourcetypes(ConfigNodePropertyArray excludedresourcetypes)
{
	this->excludedresourcetypes = excludedresourcetypes;
}



