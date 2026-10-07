

#include "ComDayCqAuthImplLoginSelectorHandlerProperties.h"

using namespace Tiny;

ComDayCqAuthImplLoginSelectorHandlerProperties::ComDayCqAuthImplLoginSelectorHandlerProperties()
{
	path = ConfigNodePropertyString();
	serviceranking = ConfigNodePropertyInteger();
	authloginselectormappings = ConfigNodePropertyArray();
	authloginselectorchangepwmappings = ConfigNodePropertyArray();
	authloginselectordefaultloginpage = ConfigNodePropertyString();
	authloginselectordefaultchangepwpage = ConfigNodePropertyString();
	authloginselectorhandle = ConfigNodePropertyArray();
	authloginselectorhandleallextensions = ConfigNodePropertyBoolean();
}

ComDayCqAuthImplLoginSelectorHandlerProperties::ComDayCqAuthImplLoginSelectorHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAuthImplLoginSelectorHandlerProperties::~ComDayCqAuthImplLoginSelectorHandlerProperties()
{

}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }

    const char *authloginselectormappingsKey = "auth.loginselector.mappings";

    if(object.has_key(authloginselectormappingsKey))
    {
        bourne::json value = object[authloginselectormappingsKey];




        ConfigNodePropertyArray* obj = &authloginselectormappings;
		obj->fromJson(value.dump());

    }

    const char *authloginselectorchangepwmappingsKey = "auth.loginselector.changepw.mappings";

    if(object.has_key(authloginselectorchangepwmappingsKey))
    {
        bourne::json value = object[authloginselectorchangepwmappingsKey];




        ConfigNodePropertyArray* obj = &authloginselectorchangepwmappings;
		obj->fromJson(value.dump());

    }

    const char *authloginselectordefaultloginpageKey = "auth.loginselector.defaultloginpage";

    if(object.has_key(authloginselectordefaultloginpageKey))
    {
        bourne::json value = object[authloginselectordefaultloginpageKey];




        ConfigNodePropertyString* obj = &authloginselectordefaultloginpage;
		obj->fromJson(value.dump());

    }

    const char *authloginselectordefaultchangepwpageKey = "auth.loginselector.defaultchangepwpage";

    if(object.has_key(authloginselectordefaultchangepwpageKey))
    {
        bourne::json value = object[authloginselectordefaultchangepwpageKey];




        ConfigNodePropertyString* obj = &authloginselectordefaultchangepwpage;
		obj->fromJson(value.dump());

    }

    const char *authloginselectorhandleKey = "auth.loginselector.handle";

    if(object.has_key(authloginselectorhandleKey))
    {
        bourne::json value = object[authloginselectorhandleKey];




        ConfigNodePropertyArray* obj = &authloginselectorhandle;
		obj->fromJson(value.dump());

    }

    const char *authloginselectorhandleallextensionsKey = "auth.loginselector.handle.all.extensions";

    if(object.has_key(authloginselectorhandleallextensionsKey))
    {
        bourne::json value = object[authloginselectorhandleallextensionsKey];




        ConfigNodePropertyBoolean* obj = &authloginselectorhandleallextensions;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAuthImplLoginSelectorHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();






	object["serviceranking"] = getServiceranking().toJson();






	object["authloginselectormappings"] = getAuthloginselectormappings().toJson();






	object["authloginselectorchangepwmappings"] = getAuthloginselectorchangepwmappings().toJson();






	object["authloginselectordefaultloginpage"] = getAuthloginselectordefaultloginpage().toJson();






	object["authloginselectordefaultchangepwpage"] = getAuthloginselectordefaultchangepwpage().toJson();






	object["authloginselectorhandle"] = getAuthloginselectorhandle().toJson();






	object["authloginselectorhandleallextensions"] = getAuthloginselectorhandleallextensions().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqAuthImplLoginSelectorHandlerProperties::getPath()
{
	return path;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyInteger
ComDayCqAuthImplLoginSelectorHandlerProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyArray
ComDayCqAuthImplLoginSelectorHandlerProperties::getAuthloginselectormappings()
{
	return authloginselectormappings;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setAuthloginselectormappings(ConfigNodePropertyArray authloginselectormappings)
{
	this->authloginselectormappings = authloginselectormappings;
}

ConfigNodePropertyArray
ComDayCqAuthImplLoginSelectorHandlerProperties::getAuthloginselectorchangepwmappings()
{
	return authloginselectorchangepwmappings;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setAuthloginselectorchangepwmappings(ConfigNodePropertyArray authloginselectorchangepwmappings)
{
	this->authloginselectorchangepwmappings = authloginselectorchangepwmappings;
}

ConfigNodePropertyString
ComDayCqAuthImplLoginSelectorHandlerProperties::getAuthloginselectordefaultloginpage()
{
	return authloginselectordefaultloginpage;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setAuthloginselectordefaultloginpage(ConfigNodePropertyString authloginselectordefaultloginpage)
{
	this->authloginselectordefaultloginpage = authloginselectordefaultloginpage;
}

ConfigNodePropertyString
ComDayCqAuthImplLoginSelectorHandlerProperties::getAuthloginselectordefaultchangepwpage()
{
	return authloginselectordefaultchangepwpage;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setAuthloginselectordefaultchangepwpage(ConfigNodePropertyString authloginselectordefaultchangepwpage)
{
	this->authloginselectordefaultchangepwpage = authloginselectordefaultchangepwpage;
}

ConfigNodePropertyArray
ComDayCqAuthImplLoginSelectorHandlerProperties::getAuthloginselectorhandle()
{
	return authloginselectorhandle;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setAuthloginselectorhandle(ConfigNodePropertyArray authloginselectorhandle)
{
	this->authloginselectorhandle = authloginselectorhandle;
}

ConfigNodePropertyBoolean
ComDayCqAuthImplLoginSelectorHandlerProperties::getAuthloginselectorhandleallextensions()
{
	return authloginselectorhandleallextensions;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setAuthloginselectorhandleallextensions(ConfigNodePropertyBoolean authloginselectorhandleallextensions)
{
	this->authloginselectorhandleallextensions = authloginselectorhandleallextensions;
}



