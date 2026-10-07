

#include "ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.h"

using namespace Tiny;

ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties()
{
	comadobegranitejettysslport = ConfigNodePropertyInteger();
	comadobegranitejettysslkeystoreuser = ConfigNodePropertyString();
	comadobegranitejettysslkeystorepassword = ConfigNodePropertyString();
	comadobegranitejettysslciphersuitesexcluded = ConfigNodePropertyArray();
	comadobegranitejettysslciphersuitesincluded = ConfigNodePropertyArray();
	comadobegranitejettysslclientcertificate = ConfigNodePropertyDropDown();
}

ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::~ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties()
{

}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comadobegranitejettysslportKey = "com.adobe.granite.jetty.ssl.port";

    if(object.has_key(comadobegranitejettysslportKey))
    {
        bourne::json value = object[comadobegranitejettysslportKey];




        ConfigNodePropertyInteger* obj = &comadobegranitejettysslport;
		obj->fromJson(value.dump());

    }

    const char *comadobegranitejettysslkeystoreuserKey = "com.adobe.granite.jetty.ssl.keystore.user";

    if(object.has_key(comadobegranitejettysslkeystoreuserKey))
    {
        bourne::json value = object[comadobegranitejettysslkeystoreuserKey];




        ConfigNodePropertyString* obj = &comadobegranitejettysslkeystoreuser;
		obj->fromJson(value.dump());

    }

    const char *comadobegranitejettysslkeystorepasswordKey = "com.adobe.granite.jetty.ssl.keystore.password";

    if(object.has_key(comadobegranitejettysslkeystorepasswordKey))
    {
        bourne::json value = object[comadobegranitejettysslkeystorepasswordKey];




        ConfigNodePropertyString* obj = &comadobegranitejettysslkeystorepassword;
		obj->fromJson(value.dump());

    }

    const char *comadobegranitejettysslciphersuitesexcludedKey = "com.adobe.granite.jetty.ssl.ciphersuites.excluded";

    if(object.has_key(comadobegranitejettysslciphersuitesexcludedKey))
    {
        bourne::json value = object[comadobegranitejettysslciphersuitesexcludedKey];




        ConfigNodePropertyArray* obj = &comadobegranitejettysslciphersuitesexcluded;
		obj->fromJson(value.dump());

    }

    const char *comadobegranitejettysslciphersuitesincludedKey = "com.adobe.granite.jetty.ssl.ciphersuites.included";

    if(object.has_key(comadobegranitejettysslciphersuitesincludedKey))
    {
        bourne::json value = object[comadobegranitejettysslciphersuitesincludedKey];




        ConfigNodePropertyArray* obj = &comadobegranitejettysslciphersuitesincluded;
		obj->fromJson(value.dump());

    }

    const char *comadobegranitejettysslclientcertificateKey = "com.adobe.granite.jetty.ssl.client.certificate";

    if(object.has_key(comadobegranitejettysslclientcertificateKey))
    {
        bourne::json value = object[comadobegranitejettysslclientcertificateKey];




        ConfigNodePropertyDropDown* obj = &comadobegranitejettysslclientcertificate;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comadobegranitejettysslport"] = getComadobegranitejettysslport().toJson();






	object["comadobegranitejettysslkeystoreuser"] = getComadobegranitejettysslkeystoreuser().toJson();






	object["comadobegranitejettysslkeystorepassword"] = getComadobegranitejettysslkeystorepassword().toJson();






	object["comadobegranitejettysslciphersuitesexcluded"] = getComadobegranitejettysslciphersuitesexcluded().toJson();






	object["comadobegranitejettysslciphersuitesincluded"] = getComadobegranitejettysslciphersuitesincluded().toJson();






	object["comadobegranitejettysslclientcertificate"] = getComadobegranitejettysslclientcertificate().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::getComadobegranitejettysslport()
{
	return comadobegranitejettysslport;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::setComadobegranitejettysslport(ConfigNodePropertyInteger comadobegranitejettysslport)
{
	this->comadobegranitejettysslport = comadobegranitejettysslport;
}

ConfigNodePropertyString
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::getComadobegranitejettysslkeystoreuser()
{
	return comadobegranitejettysslkeystoreuser;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::setComadobegranitejettysslkeystoreuser(ConfigNodePropertyString comadobegranitejettysslkeystoreuser)
{
	this->comadobegranitejettysslkeystoreuser = comadobegranitejettysslkeystoreuser;
}

ConfigNodePropertyString
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::getComadobegranitejettysslkeystorepassword()
{
	return comadobegranitejettysslkeystorepassword;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::setComadobegranitejettysslkeystorepassword(ConfigNodePropertyString comadobegranitejettysslkeystorepassword)
{
	this->comadobegranitejettysslkeystorepassword = comadobegranitejettysslkeystorepassword;
}

ConfigNodePropertyArray
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::getComadobegranitejettysslciphersuitesexcluded()
{
	return comadobegranitejettysslciphersuitesexcluded;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::setComadobegranitejettysslciphersuitesexcluded(ConfigNodePropertyArray comadobegranitejettysslciphersuitesexcluded)
{
	this->comadobegranitejettysslciphersuitesexcluded = comadobegranitejettysslciphersuitesexcluded;
}

ConfigNodePropertyArray
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::getComadobegranitejettysslciphersuitesincluded()
{
	return comadobegranitejettysslciphersuitesincluded;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::setComadobegranitejettysslciphersuitesincluded(ConfigNodePropertyArray comadobegranitejettysslciphersuitesincluded)
{
	this->comadobegranitejettysslciphersuitesincluded = comadobegranitejettysslciphersuitesincluded;
}

ConfigNodePropertyDropDown
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::getComadobegranitejettysslclientcertificate()
{
	return comadobegranitejettysslclientcertificate;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::setComadobegranitejettysslclientcertificate(ConfigNodePropertyDropDown comadobegranitejettysslclientcertificate)
{
	this->comadobegranitejettysslclientcertificate = comadobegranitejettysslclientcertificate;
}



