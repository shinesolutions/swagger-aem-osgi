

#include "OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.h"

using namespace Tiny;

OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::OrgApacheSlingHcCoreImplCompositeHealthCheckProperties()
{
	hcname = ConfigNodePropertyString();
	hctags = ConfigNodePropertyArray();
	hcmbeanname = ConfigNodePropertyString();
	filtertags = ConfigNodePropertyArray();
	filtercombineTagsWithOr = ConfigNodePropertyBoolean();
}

OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::OrgApacheSlingHcCoreImplCompositeHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::~OrgApacheSlingHcCoreImplCompositeHealthCheckProperties()
{

}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hcnameKey = "hc.name";

    if(object.has_key(hcnameKey))
    {
        bourne::json value = object[hcnameKey];




        ConfigNodePropertyString* obj = &hcname;
		obj->fromJson(value.dump());

    }

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *hcmbeannameKey = "hc.mbean.name";

    if(object.has_key(hcmbeannameKey))
    {
        bourne::json value = object[hcmbeannameKey];




        ConfigNodePropertyString* obj = &hcmbeanname;
		obj->fromJson(value.dump());

    }

    const char *filtertagsKey = "filter.tags";

    if(object.has_key(filtertagsKey))
    {
        bourne::json value = object[filtertagsKey];




        ConfigNodePropertyArray* obj = &filtertags;
		obj->fromJson(value.dump());

    }

    const char *filtercombineTagsWithOrKey = "filter.combineTagsWithOr";

    if(object.has_key(filtercombineTagsWithOrKey))
    {
        bourne::json value = object[filtercombineTagsWithOrKey];




        ConfigNodePropertyBoolean* obj = &filtercombineTagsWithOr;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hcname"] = getHcname().toJson();






	object["hctags"] = getHctags().toJson();






	object["hcmbeanname"] = getHcmbeanname().toJson();






	object["filtertags"] = getFiltertags().toJson();






	object["filtercombineTagsWithOr"] = getFiltercombineTagsWithOr().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::getHcname()
{
	return hcname;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::setHcname(ConfigNodePropertyString hcname)
{
	this->hcname = hcname;
}

ConfigNodePropertyArray
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::getHctags()
{
	return hctags;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::getHcmbeanname()
{
	return hcmbeanname;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::setHcmbeanname(ConfigNodePropertyString hcmbeanname)
{
	this->hcmbeanname = hcmbeanname;
}

ConfigNodePropertyArray
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::getFiltertags()
{
	return filtertags;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::setFiltertags(ConfigNodePropertyArray filtertags)
{
	this->filtertags = filtertags;
}

ConfigNodePropertyBoolean
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::getFiltercombineTagsWithOr()
{
	return filtercombineTagsWithOr;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::setFiltercombineTagsWithOr(ConfigNodePropertyBoolean filtercombineTagsWithOr)
{
	this->filtercombineTagsWithOr = filtercombineTagsWithOr;
}



