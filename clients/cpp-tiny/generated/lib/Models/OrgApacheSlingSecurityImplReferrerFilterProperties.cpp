

#include "OrgApacheSlingSecurityImplReferrerFilterProperties.h"

using namespace Tiny;

OrgApacheSlingSecurityImplReferrerFilterProperties::OrgApacheSlingSecurityImplReferrerFilterProperties()
{
	allowempty = ConfigNodePropertyBoolean();
	allowhosts = ConfigNodePropertyArray();
	allowhostsregexp = ConfigNodePropertyArray();
	filtermethods = ConfigNodePropertyArray();
	excludeagentsregexp = ConfigNodePropertyArray();
}

OrgApacheSlingSecurityImplReferrerFilterProperties::OrgApacheSlingSecurityImplReferrerFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingSecurityImplReferrerFilterProperties::~OrgApacheSlingSecurityImplReferrerFilterProperties()
{

}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *allowemptyKey = "allow.empty";

    if(object.has_key(allowemptyKey))
    {
        bourne::json value = object[allowemptyKey];




        ConfigNodePropertyBoolean* obj = &allowempty;
		obj->fromJson(value.dump());

    }

    const char *allowhostsKey = "allow.hosts";

    if(object.has_key(allowhostsKey))
    {
        bourne::json value = object[allowhostsKey];




        ConfigNodePropertyArray* obj = &allowhosts;
		obj->fromJson(value.dump());

    }

    const char *allowhostsregexpKey = "allow.hosts.regexp";

    if(object.has_key(allowhostsregexpKey))
    {
        bourne::json value = object[allowhostsregexpKey];




        ConfigNodePropertyArray* obj = &allowhostsregexp;
		obj->fromJson(value.dump());

    }

    const char *filtermethodsKey = "filter.methods";

    if(object.has_key(filtermethodsKey))
    {
        bourne::json value = object[filtermethodsKey];




        ConfigNodePropertyArray* obj = &filtermethods;
		obj->fromJson(value.dump());

    }

    const char *excludeagentsregexpKey = "exclude.agents.regexp";

    if(object.has_key(excludeagentsregexpKey))
    {
        bourne::json value = object[excludeagentsregexpKey];




        ConfigNodePropertyArray* obj = &excludeagentsregexp;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingSecurityImplReferrerFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["allowempty"] = getAllowempty().toJson();






	object["allowhosts"] = getAllowhosts().toJson();






	object["allowhostsregexp"] = getAllowhostsregexp().toJson();






	object["filtermethods"] = getFiltermethods().toJson();






	object["excludeagentsregexp"] = getExcludeagentsregexp().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingSecurityImplReferrerFilterProperties::getAllowempty()
{
	return allowempty;
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::setAllowempty(ConfigNodePropertyBoolean allowempty)
{
	this->allowempty = allowempty;
}

ConfigNodePropertyArray
OrgApacheSlingSecurityImplReferrerFilterProperties::getAllowhosts()
{
	return allowhosts;
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::setAllowhosts(ConfigNodePropertyArray allowhosts)
{
	this->allowhosts = allowhosts;
}

ConfigNodePropertyArray
OrgApacheSlingSecurityImplReferrerFilterProperties::getAllowhostsregexp()
{
	return allowhostsregexp;
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::setAllowhostsregexp(ConfigNodePropertyArray allowhostsregexp)
{
	this->allowhostsregexp = allowhostsregexp;
}

ConfigNodePropertyArray
OrgApacheSlingSecurityImplReferrerFilterProperties::getFiltermethods()
{
	return filtermethods;
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::setFiltermethods(ConfigNodePropertyArray filtermethods)
{
	this->filtermethods = filtermethods;
}

ConfigNodePropertyArray
OrgApacheSlingSecurityImplReferrerFilterProperties::getExcludeagentsregexp()
{
	return excludeagentsregexp;
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::setExcludeagentsregexp(ConfigNodePropertyArray excludeagentsregexp)
{
	this->excludeagentsregexp = excludeagentsregexp;
}



