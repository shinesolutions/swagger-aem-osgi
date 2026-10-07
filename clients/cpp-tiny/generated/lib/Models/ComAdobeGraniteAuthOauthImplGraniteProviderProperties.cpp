

#include "ComAdobeGraniteAuthOauthImplGraniteProviderProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplGraniteProviderProperties::ComAdobeGraniteAuthOauthImplGraniteProviderProperties()
{
	oauthproviderid = ConfigNodePropertyString();
	oauthprovidergraniteauthorizationurl = ConfigNodePropertyString();
	oauthprovidergranitetokenurl = ConfigNodePropertyString();
	oauthprovidergraniteprofileurl = ConfigNodePropertyString();
	oauthprovidergraniteextendeddetailsurls = ConfigNodePropertyString();
}

ComAdobeGraniteAuthOauthImplGraniteProviderProperties::ComAdobeGraniteAuthOauthImplGraniteProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplGraniteProviderProperties::~ComAdobeGraniteAuthOauthImplGraniteProviderProperties()
{

}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *oauthprovideridKey = "oauth.provider.id";

    if(object.has_key(oauthprovideridKey))
    {
        bourne::json value = object[oauthprovideridKey];




        ConfigNodePropertyString* obj = &oauthproviderid;
		obj->fromJson(value.dump());

    }

    const char *oauthprovidergraniteauthorizationurlKey = "oauth.provider.granite.authorization.url";

    if(object.has_key(oauthprovidergraniteauthorizationurlKey))
    {
        bourne::json value = object[oauthprovidergraniteauthorizationurlKey];




        ConfigNodePropertyString* obj = &oauthprovidergraniteauthorizationurl;
		obj->fromJson(value.dump());

    }

    const char *oauthprovidergranitetokenurlKey = "oauth.provider.granite.token.url";

    if(object.has_key(oauthprovidergranitetokenurlKey))
    {
        bourne::json value = object[oauthprovidergranitetokenurlKey];




        ConfigNodePropertyString* obj = &oauthprovidergranitetokenurl;
		obj->fromJson(value.dump());

    }

    const char *oauthprovidergraniteprofileurlKey = "oauth.provider.granite.profile.url";

    if(object.has_key(oauthprovidergraniteprofileurlKey))
    {
        bourne::json value = object[oauthprovidergraniteprofileurlKey];




        ConfigNodePropertyString* obj = &oauthprovidergraniteprofileurl;
		obj->fromJson(value.dump());

    }

    const char *oauthprovidergraniteextendeddetailsurlsKey = "oauth.provider.granite.extended.details.urls";

    if(object.has_key(oauthprovidergraniteextendeddetailsurlsKey))
    {
        bourne::json value = object[oauthprovidergraniteextendeddetailsurlsKey];




        ConfigNodePropertyString* obj = &oauthprovidergraniteextendeddetailsurls;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthproviderid"] = getOauthproviderid().toJson();






	object["oauthprovidergraniteauthorizationurl"] = getOauthprovidergraniteauthorizationurl().toJson();






	object["oauthprovidergranitetokenurl"] = getOauthprovidergranitetokenurl().toJson();






	object["oauthprovidergraniteprofileurl"] = getOauthprovidergraniteprofileurl().toJson();






	object["oauthprovidergraniteextendeddetailsurls"] = getOauthprovidergraniteextendeddetailsurls().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::setOauthproviderid(ConfigNodePropertyString oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::getOauthprovidergraniteauthorizationurl()
{
	return oauthprovidergraniteauthorizationurl;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::setOauthprovidergraniteauthorizationurl(ConfigNodePropertyString oauthprovidergraniteauthorizationurl)
{
	this->oauthprovidergraniteauthorizationurl = oauthprovidergraniteauthorizationurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::getOauthprovidergranitetokenurl()
{
	return oauthprovidergranitetokenurl;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::setOauthprovidergranitetokenurl(ConfigNodePropertyString oauthprovidergranitetokenurl)
{
	this->oauthprovidergranitetokenurl = oauthprovidergranitetokenurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::getOauthprovidergraniteprofileurl()
{
	return oauthprovidergraniteprofileurl;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::setOauthprovidergraniteprofileurl(ConfigNodePropertyString oauthprovidergraniteprofileurl)
{
	this->oauthprovidergraniteprofileurl = oauthprovidergraniteprofileurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::getOauthprovidergraniteextendeddetailsurls()
{
	return oauthprovidergraniteextendeddetailsurls;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::setOauthprovidergraniteextendeddetailsurls(ConfigNodePropertyString oauthprovidergraniteextendeddetailsurls)
{
	this->oauthprovidergraniteextendeddetailsurls = oauthprovidergraniteextendeddetailsurls;
}



