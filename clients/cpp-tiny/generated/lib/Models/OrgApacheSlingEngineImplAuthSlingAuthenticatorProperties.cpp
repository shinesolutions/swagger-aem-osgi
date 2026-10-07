

#include "OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.h"

using namespace Tiny;

OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties()
{
	osgihttpwhiteboardcontextselect = ConfigNodePropertyString();
	osgihttpwhiteboardlistener = ConfigNodePropertyString();
	authsudocookie = ConfigNodePropertyString();
	authsudoparameter = ConfigNodePropertyString();
	authannonymous = ConfigNodePropertyBoolean();
	slingauthrequirements = ConfigNodePropertyArray();
	slingauthanonymoususer = ConfigNodePropertyString();
	slingauthanonymouspassword = ConfigNodePropertyString();
	authhttp = ConfigNodePropertyDropDown();
	authhttprealm = ConfigNodePropertyString();
	authurisuffix = ConfigNodePropertyArray();
}

OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::~OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties()
{

}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *osgihttpwhiteboardcontextselectKey = "osgi.http.whiteboard.context.select";

    if(object.has_key(osgihttpwhiteboardcontextselectKey))
    {
        bourne::json value = object[osgihttpwhiteboardcontextselectKey];




        ConfigNodePropertyString* obj = &osgihttpwhiteboardcontextselect;
		obj->fromJson(value.dump());

    }

    const char *osgihttpwhiteboardlistenerKey = "osgi.http.whiteboard.listener";

    if(object.has_key(osgihttpwhiteboardlistenerKey))
    {
        bourne::json value = object[osgihttpwhiteboardlistenerKey];




        ConfigNodePropertyString* obj = &osgihttpwhiteboardlistener;
		obj->fromJson(value.dump());

    }

    const char *authsudocookieKey = "auth.sudo.cookie";

    if(object.has_key(authsudocookieKey))
    {
        bourne::json value = object[authsudocookieKey];




        ConfigNodePropertyString* obj = &authsudocookie;
		obj->fromJson(value.dump());

    }

    const char *authsudoparameterKey = "auth.sudo.parameter";

    if(object.has_key(authsudoparameterKey))
    {
        bourne::json value = object[authsudoparameterKey];




        ConfigNodePropertyString* obj = &authsudoparameter;
		obj->fromJson(value.dump());

    }

    const char *authannonymousKey = "auth.annonymous";

    if(object.has_key(authannonymousKey))
    {
        bourne::json value = object[authannonymousKey];




        ConfigNodePropertyBoolean* obj = &authannonymous;
		obj->fromJson(value.dump());

    }

    const char *slingauthrequirementsKey = "sling.auth.requirements";

    if(object.has_key(slingauthrequirementsKey))
    {
        bourne::json value = object[slingauthrequirementsKey];




        ConfigNodePropertyArray* obj = &slingauthrequirements;
		obj->fromJson(value.dump());

    }

    const char *slingauthanonymoususerKey = "sling.auth.anonymous.user";

    if(object.has_key(slingauthanonymoususerKey))
    {
        bourne::json value = object[slingauthanonymoususerKey];




        ConfigNodePropertyString* obj = &slingauthanonymoususer;
		obj->fromJson(value.dump());

    }

    const char *slingauthanonymouspasswordKey = "sling.auth.anonymous.password";

    if(object.has_key(slingauthanonymouspasswordKey))
    {
        bourne::json value = object[slingauthanonymouspasswordKey];




        ConfigNodePropertyString* obj = &slingauthanonymouspassword;
		obj->fromJson(value.dump());

    }

    const char *authhttpKey = "auth.http";

    if(object.has_key(authhttpKey))
    {
        bourne::json value = object[authhttpKey];




        ConfigNodePropertyDropDown* obj = &authhttp;
		obj->fromJson(value.dump());

    }

    const char *authhttprealmKey = "auth.http.realm";

    if(object.has_key(authhttprealmKey))
    {
        bourne::json value = object[authhttprealmKey];




        ConfigNodePropertyString* obj = &authhttprealm;
		obj->fromJson(value.dump());

    }

    const char *authurisuffixKey = "auth.uri.suffix";

    if(object.has_key(authurisuffixKey))
    {
        bourne::json value = object[authurisuffixKey];




        ConfigNodePropertyArray* obj = &authurisuffix;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["osgihttpwhiteboardcontextselect"] = getOsgihttpwhiteboardcontextselect().toJson();






	object["osgihttpwhiteboardlistener"] = getOsgihttpwhiteboardlistener().toJson();






	object["authsudocookie"] = getAuthsudocookie().toJson();






	object["authsudoparameter"] = getAuthsudoparameter().toJson();






	object["authannonymous"] = getAuthannonymous().toJson();






	object["slingauthrequirements"] = getSlingauthrequirements().toJson();






	object["slingauthanonymoususer"] = getSlingauthanonymoususer().toJson();






	object["slingauthanonymouspassword"] = getSlingauthanonymouspassword().toJson();






	object["authhttp"] = getAuthhttp().toJson();






	object["authhttprealm"] = getAuthhttprealm().toJson();






	object["authurisuffix"] = getAuthurisuffix().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getOsgihttpwhiteboardcontextselect()
{
	return osgihttpwhiteboardcontextselect;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString osgihttpwhiteboardcontextselect)
{
	this->osgihttpwhiteboardcontextselect = osgihttpwhiteboardcontextselect;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getOsgihttpwhiteboardlistener()
{
	return osgihttpwhiteboardlistener;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setOsgihttpwhiteboardlistener(ConfigNodePropertyString osgihttpwhiteboardlistener)
{
	this->osgihttpwhiteboardlistener = osgihttpwhiteboardlistener;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthsudocookie()
{
	return authsudocookie;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthsudocookie(ConfigNodePropertyString authsudocookie)
{
	this->authsudocookie = authsudocookie;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthsudoparameter()
{
	return authsudoparameter;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthsudoparameter(ConfigNodePropertyString authsudoparameter)
{
	this->authsudoparameter = authsudoparameter;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthannonymous()
{
	return authannonymous;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthannonymous(ConfigNodePropertyBoolean authannonymous)
{
	this->authannonymous = authannonymous;
}

ConfigNodePropertyArray
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getSlingauthrequirements()
{
	return slingauthrequirements;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setSlingauthrequirements(ConfigNodePropertyArray slingauthrequirements)
{
	this->slingauthrequirements = slingauthrequirements;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getSlingauthanonymoususer()
{
	return slingauthanonymoususer;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setSlingauthanonymoususer(ConfigNodePropertyString slingauthanonymoususer)
{
	this->slingauthanonymoususer = slingauthanonymoususer;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getSlingauthanonymouspassword()
{
	return slingauthanonymouspassword;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setSlingauthanonymouspassword(ConfigNodePropertyString slingauthanonymouspassword)
{
	this->slingauthanonymouspassword = slingauthanonymouspassword;
}

ConfigNodePropertyDropDown
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthhttp()
{
	return authhttp;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthhttp(ConfigNodePropertyDropDown authhttp)
{
	this->authhttp = authhttp;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthhttprealm()
{
	return authhttprealm;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthhttprealm(ConfigNodePropertyString authhttprealm)
{
	this->authhttprealm = authhttprealm;
}

ConfigNodePropertyArray
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthurisuffix()
{
	return authurisuffix;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthurisuffix(ConfigNodePropertyArray authurisuffix)
{
	this->authurisuffix = authurisuffix;
}



