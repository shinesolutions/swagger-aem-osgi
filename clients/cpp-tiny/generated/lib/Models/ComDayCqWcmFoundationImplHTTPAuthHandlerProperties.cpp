

#include "ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.h"

using namespace Tiny;

ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::ComDayCqWcmFoundationImplHTTPAuthHandlerProperties()
{
	path = ConfigNodePropertyString();
	authhttpnologin = ConfigNodePropertyBoolean();
	authhttprealm = ConfigNodePropertyString();
	authdefaultloginpage = ConfigNodePropertyString();
	authcredform = ConfigNodePropertyArray();
	authcredutf8 = ConfigNodePropertyArray();
}

ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::~ComDayCqWcmFoundationImplHTTPAuthHandlerProperties()
{

}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *authhttpnologinKey = "auth.http.nologin";

    if(object.has_key(authhttpnologinKey))
    {
        bourne::json value = object[authhttpnologinKey];




        ConfigNodePropertyBoolean* obj = &authhttpnologin;
		obj->fromJson(value.dump());

    }

    const char *authhttprealmKey = "auth.http.realm";

    if(object.has_key(authhttprealmKey))
    {
        bourne::json value = object[authhttprealmKey];




        ConfigNodePropertyString* obj = &authhttprealm;
		obj->fromJson(value.dump());

    }

    const char *authdefaultloginpageKey = "auth.default.loginpage";

    if(object.has_key(authdefaultloginpageKey))
    {
        bourne::json value = object[authdefaultloginpageKey];




        ConfigNodePropertyString* obj = &authdefaultloginpage;
		obj->fromJson(value.dump());

    }

    const char *authcredformKey = "auth.cred.form";

    if(object.has_key(authcredformKey))
    {
        bourne::json value = object[authcredformKey];




        ConfigNodePropertyArray* obj = &authcredform;
		obj->fromJson(value.dump());

    }

    const char *authcredutf8Key = "auth.cred.utf8";

    if(object.has_key(authcredutf8Key))
    {
        bourne::json value = object[authcredutf8Key];




        ConfigNodePropertyArray* obj = &authcredutf8;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();






	object["authhttpnologin"] = getAuthhttpnologin().toJson();






	object["authhttprealm"] = getAuthhttprealm().toJson();






	object["authdefaultloginpage"] = getAuthdefaultloginpage().toJson();






	object["authcredform"] = getAuthcredform().toJson();






	object["authcredutf8"] = getAuthcredutf8().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getPath()
{
	return path;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyBoolean
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthhttpnologin()
{
	return authhttpnologin;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthhttpnologin(ConfigNodePropertyBoolean authhttpnologin)
{
	this->authhttpnologin = authhttpnologin;
}

ConfigNodePropertyString
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthhttprealm()
{
	return authhttprealm;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthhttprealm(ConfigNodePropertyString authhttprealm)
{
	this->authhttprealm = authhttprealm;
}

ConfigNodePropertyString
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthdefaultloginpage()
{
	return authdefaultloginpage;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthdefaultloginpage(ConfigNodePropertyString authdefaultloginpage)
{
	this->authdefaultloginpage = authdefaultloginpage;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthcredform()
{
	return authcredform;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthcredform(ConfigNodePropertyArray authcredform)
{
	this->authcredform = authcredform;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthcredutf8()
{
	return authcredutf8;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthcredutf8(ConfigNodePropertyArray authcredutf8)
{
	this->authcredutf8 = authcredutf8;
}



