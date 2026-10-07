

#include "ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.h"

using namespace Tiny;

ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties()
{
	path = ConfigNodePropertyString();
	tokenrequiredattr = ConfigNodePropertyDropDown();
	tokenalternateurl = ConfigNodePropertyString();
	tokenencapsulated = ConfigNodePropertyBoolean();
	skiptokenrefresh = ConfigNodePropertyArray();
}

ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::~ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties()
{

}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *tokenrequiredattrKey = "token.required.attr";

    if(object.has_key(tokenrequiredattrKey))
    {
        bourne::json value = object[tokenrequiredattrKey];




        ConfigNodePropertyDropDown* obj = &tokenrequiredattr;
		obj->fromJson(value.dump());

    }

    const char *tokenalternateurlKey = "token.alternate.url";

    if(object.has_key(tokenalternateurlKey))
    {
        bourne::json value = object[tokenalternateurlKey];




        ConfigNodePropertyString* obj = &tokenalternateurl;
		obj->fromJson(value.dump());

    }

    const char *tokenencapsulatedKey = "token.encapsulated";

    if(object.has_key(tokenencapsulatedKey))
    {
        bourne::json value = object[tokenencapsulatedKey];




        ConfigNodePropertyBoolean* obj = &tokenencapsulated;
		obj->fromJson(value.dump());

    }

    const char *skiptokenrefreshKey = "skip.token.refresh";

    if(object.has_key(skiptokenrefreshKey))
    {
        bourne::json value = object[skiptokenrefreshKey];




        ConfigNodePropertyArray* obj = &skiptokenrefresh;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();






	object["tokenrequiredattr"] = getTokenrequiredattr().toJson();






	object["tokenalternateurl"] = getTokenalternateurl().toJson();






	object["tokenencapsulated"] = getTokenencapsulated().toJson();






	object["skiptokenrefresh"] = getSkiptokenrefresh().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::getPath()
{
	return path;
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyDropDown
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::getTokenrequiredattr()
{
	return tokenrequiredattr;
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::setTokenrequiredattr(ConfigNodePropertyDropDown tokenrequiredattr)
{
	this->tokenrequiredattr = tokenrequiredattr;
}

ConfigNodePropertyString
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::getTokenalternateurl()
{
	return tokenalternateurl;
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::setTokenalternateurl(ConfigNodePropertyString tokenalternateurl)
{
	this->tokenalternateurl = tokenalternateurl;
}

ConfigNodePropertyBoolean
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::getTokenencapsulated()
{
	return tokenencapsulated;
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::setTokenencapsulated(ConfigNodePropertyBoolean tokenencapsulated)
{
	this->tokenencapsulated = tokenencapsulated;
}

ConfigNodePropertyArray
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::getSkiptokenrefresh()
{
	return skiptokenrefresh;
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::setSkiptokenrefresh(ConfigNodePropertyArray skiptokenrefresh)
{
	this->skiptokenrefresh = skiptokenrefresh;
}



