

#include "ComAdobeGraniteAuthImsImplIMSProviderImplProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthImsImplIMSProviderImplProperties::ComAdobeGraniteAuthImsImplIMSProviderImplProperties()
{
	oauthproviderid = ConfigNodePropertyString();
	oauthproviderimsauthorizationurl = ConfigNodePropertyString();
	oauthproviderimstokenurl = ConfigNodePropertyString();
	oauthproviderimsprofileurl = ConfigNodePropertyString();
	oauthproviderimsextendeddetailsurls = ConfigNodePropertyArray();
	oauthproviderimsvalidatetokenurl = ConfigNodePropertyString();
	oauthproviderimssessionproperty = ConfigNodePropertyString();
	oauthproviderimsservicetokenclientid = ConfigNodePropertyString();
	oauthproviderimsservicetokenclientsecret = ConfigNodePropertyString();
	oauthproviderimsservicetoken = ConfigNodePropertyString();
	imsorgref = ConfigNodePropertyString();
	imsgroupmapping = ConfigNodePropertyArray();
	oauthproviderimsonlylicensegroup = ConfigNodePropertyBoolean();
}

ComAdobeGraniteAuthImsImplIMSProviderImplProperties::ComAdobeGraniteAuthImsImplIMSProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthImsImplIMSProviderImplProperties::~ComAdobeGraniteAuthImsImplIMSProviderImplProperties()
{

}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *oauthprovideridKey = "oauth.provider.id";

    if(object.has_key(oauthprovideridKey))
    {
        bourne::json value = object[oauthprovideridKey];




        ConfigNodePropertyString* obj = &oauthproviderid;
		obj->fromJson(value.dump());

    }

    const char *oauthproviderimsauthorizationurlKey = "oauth.provider.ims.authorization.url";

    if(object.has_key(oauthproviderimsauthorizationurlKey))
    {
        bourne::json value = object[oauthproviderimsauthorizationurlKey];




        ConfigNodePropertyString* obj = &oauthproviderimsauthorizationurl;
		obj->fromJson(value.dump());

    }

    const char *oauthproviderimstokenurlKey = "oauth.provider.ims.token.url";

    if(object.has_key(oauthproviderimstokenurlKey))
    {
        bourne::json value = object[oauthproviderimstokenurlKey];




        ConfigNodePropertyString* obj = &oauthproviderimstokenurl;
		obj->fromJson(value.dump());

    }

    const char *oauthproviderimsprofileurlKey = "oauth.provider.ims.profile.url";

    if(object.has_key(oauthproviderimsprofileurlKey))
    {
        bourne::json value = object[oauthproviderimsprofileurlKey];




        ConfigNodePropertyString* obj = &oauthproviderimsprofileurl;
		obj->fromJson(value.dump());

    }

    const char *oauthproviderimsextendeddetailsurlsKey = "oauth.provider.ims.extended.details.urls";

    if(object.has_key(oauthproviderimsextendeddetailsurlsKey))
    {
        bourne::json value = object[oauthproviderimsextendeddetailsurlsKey];




        ConfigNodePropertyArray* obj = &oauthproviderimsextendeddetailsurls;
		obj->fromJson(value.dump());

    }

    const char *oauthproviderimsvalidatetokenurlKey = "oauth.provider.ims.validate.token.url";

    if(object.has_key(oauthproviderimsvalidatetokenurlKey))
    {
        bourne::json value = object[oauthproviderimsvalidatetokenurlKey];




        ConfigNodePropertyString* obj = &oauthproviderimsvalidatetokenurl;
		obj->fromJson(value.dump());

    }

    const char *oauthproviderimssessionpropertyKey = "oauth.provider.ims.session.property";

    if(object.has_key(oauthproviderimssessionpropertyKey))
    {
        bourne::json value = object[oauthproviderimssessionpropertyKey];




        ConfigNodePropertyString* obj = &oauthproviderimssessionproperty;
		obj->fromJson(value.dump());

    }

    const char *oauthproviderimsservicetokenclientidKey = "oauth.provider.ims.service.token.client.id";

    if(object.has_key(oauthproviderimsservicetokenclientidKey))
    {
        bourne::json value = object[oauthproviderimsservicetokenclientidKey];




        ConfigNodePropertyString* obj = &oauthproviderimsservicetokenclientid;
		obj->fromJson(value.dump());

    }

    const char *oauthproviderimsservicetokenclientsecretKey = "oauth.provider.ims.service.token.client.secret";

    if(object.has_key(oauthproviderimsservicetokenclientsecretKey))
    {
        bourne::json value = object[oauthproviderimsservicetokenclientsecretKey];




        ConfigNodePropertyString* obj = &oauthproviderimsservicetokenclientsecret;
		obj->fromJson(value.dump());

    }

    const char *oauthproviderimsservicetokenKey = "oauth.provider.ims.service.token";

    if(object.has_key(oauthproviderimsservicetokenKey))
    {
        bourne::json value = object[oauthproviderimsservicetokenKey];




        ConfigNodePropertyString* obj = &oauthproviderimsservicetoken;
		obj->fromJson(value.dump());

    }

    const char *imsorgrefKey = "ims.org.ref";

    if(object.has_key(imsorgrefKey))
    {
        bourne::json value = object[imsorgrefKey];




        ConfigNodePropertyString* obj = &imsorgref;
		obj->fromJson(value.dump());

    }

    const char *imsgroupmappingKey = "ims.group.mapping";

    if(object.has_key(imsgroupmappingKey))
    {
        bourne::json value = object[imsgroupmappingKey];




        ConfigNodePropertyArray* obj = &imsgroupmapping;
		obj->fromJson(value.dump());

    }

    const char *oauthproviderimsonlylicensegroupKey = "oauth.provider.ims.only.license.group";

    if(object.has_key(oauthproviderimsonlylicensegroupKey))
    {
        bourne::json value = object[oauthproviderimsonlylicensegroupKey];




        ConfigNodePropertyBoolean* obj = &oauthproviderimsonlylicensegroup;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthproviderid"] = getOauthproviderid().toJson();






	object["oauthproviderimsauthorizationurl"] = getOauthproviderimsauthorizationurl().toJson();






	object["oauthproviderimstokenurl"] = getOauthproviderimstokenurl().toJson();






	object["oauthproviderimsprofileurl"] = getOauthproviderimsprofileurl().toJson();






	object["oauthproviderimsextendeddetailsurls"] = getOauthproviderimsextendeddetailsurls().toJson();






	object["oauthproviderimsvalidatetokenurl"] = getOauthproviderimsvalidatetokenurl().toJson();






	object["oauthproviderimssessionproperty"] = getOauthproviderimssessionproperty().toJson();






	object["oauthproviderimsservicetokenclientid"] = getOauthproviderimsservicetokenclientid().toJson();






	object["oauthproviderimsservicetokenclientsecret"] = getOauthproviderimsservicetokenclientsecret().toJson();






	object["oauthproviderimsservicetoken"] = getOauthproviderimsservicetoken().toJson();






	object["imsorgref"] = getImsorgref().toJson();






	object["imsgroupmapping"] = getImsgroupmapping().toJson();






	object["oauthproviderimsonlylicensegroup"] = getOauthproviderimsonlylicensegroup().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderid(ConfigNodePropertyString oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsauthorizationurl()
{
	return oauthproviderimsauthorizationurl;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsauthorizationurl(ConfigNodePropertyString oauthproviderimsauthorizationurl)
{
	this->oauthproviderimsauthorizationurl = oauthproviderimsauthorizationurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimstokenurl()
{
	return oauthproviderimstokenurl;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimstokenurl(ConfigNodePropertyString oauthproviderimstokenurl)
{
	this->oauthproviderimstokenurl = oauthproviderimstokenurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsprofileurl()
{
	return oauthproviderimsprofileurl;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsprofileurl(ConfigNodePropertyString oauthproviderimsprofileurl)
{
	this->oauthproviderimsprofileurl = oauthproviderimsprofileurl;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsextendeddetailsurls()
{
	return oauthproviderimsextendeddetailsurls;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsextendeddetailsurls(ConfigNodePropertyArray oauthproviderimsextendeddetailsurls)
{
	this->oauthproviderimsextendeddetailsurls = oauthproviderimsextendeddetailsurls;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsvalidatetokenurl()
{
	return oauthproviderimsvalidatetokenurl;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsvalidatetokenurl(ConfigNodePropertyString oauthproviderimsvalidatetokenurl)
{
	this->oauthproviderimsvalidatetokenurl = oauthproviderimsvalidatetokenurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimssessionproperty()
{
	return oauthproviderimssessionproperty;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimssessionproperty(ConfigNodePropertyString oauthproviderimssessionproperty)
{
	this->oauthproviderimssessionproperty = oauthproviderimssessionproperty;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsservicetokenclientid()
{
	return oauthproviderimsservicetokenclientid;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsservicetokenclientid(ConfigNodePropertyString oauthproviderimsservicetokenclientid)
{
	this->oauthproviderimsservicetokenclientid = oauthproviderimsservicetokenclientid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsservicetokenclientsecret()
{
	return oauthproviderimsservicetokenclientsecret;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsservicetokenclientsecret(ConfigNodePropertyString oauthproviderimsservicetokenclientsecret)
{
	this->oauthproviderimsservicetokenclientsecret = oauthproviderimsservicetokenclientsecret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsservicetoken()
{
	return oauthproviderimsservicetoken;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsservicetoken(ConfigNodePropertyString oauthproviderimsservicetoken)
{
	this->oauthproviderimsservicetoken = oauthproviderimsservicetoken;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getImsorgref()
{
	return imsorgref;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setImsorgref(ConfigNodePropertyString imsorgref)
{
	this->imsorgref = imsorgref;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getImsgroupmapping()
{
	return imsgroupmapping;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setImsgroupmapping(ConfigNodePropertyArray imsgroupmapping)
{
	this->imsgroupmapping = imsgroupmapping;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsonlylicensegroup()
{
	return oauthproviderimsonlylicensegroup;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsonlylicensegroup(ConfigNodePropertyBoolean oauthproviderimsonlylicensegroup)
{
	this->oauthproviderimsonlylicensegroup = oauthproviderimsonlylicensegroup;
}



