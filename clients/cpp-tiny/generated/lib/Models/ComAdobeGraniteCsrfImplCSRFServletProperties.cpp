

#include "ComAdobeGraniteCsrfImplCSRFServletProperties.h"

using namespace Tiny;

ComAdobeGraniteCsrfImplCSRFServletProperties::ComAdobeGraniteCsrfImplCSRFServletProperties()
{
	csrftokenexpiresin = ConfigNodePropertyInteger();
	slingauthrequirements = ConfigNodePropertyString();
}

ComAdobeGraniteCsrfImplCSRFServletProperties::ComAdobeGraniteCsrfImplCSRFServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteCsrfImplCSRFServletProperties::~ComAdobeGraniteCsrfImplCSRFServletProperties()
{

}

void
ComAdobeGraniteCsrfImplCSRFServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *csrftokenexpiresinKey = "csrf.token.expires.in";

    if(object.has_key(csrftokenexpiresinKey))
    {
        bourne::json value = object[csrftokenexpiresinKey];




        ConfigNodePropertyInteger* obj = &csrftokenexpiresin;
		obj->fromJson(value.dump());

    }

    const char *slingauthrequirementsKey = "sling.auth.requirements";

    if(object.has_key(slingauthrequirementsKey))
    {
        bourne::json value = object[slingauthrequirementsKey];




        ConfigNodePropertyString* obj = &slingauthrequirements;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteCsrfImplCSRFServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["csrftokenexpiresin"] = getCsrftokenexpiresin().toJson();






	object["slingauthrequirements"] = getSlingauthrequirements().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteCsrfImplCSRFServletProperties::getCsrftokenexpiresin()
{
	return csrftokenexpiresin;
}

void
ComAdobeGraniteCsrfImplCSRFServletProperties::setCsrftokenexpiresin(ConfigNodePropertyInteger csrftokenexpiresin)
{
	this->csrftokenexpiresin = csrftokenexpiresin;
}

ConfigNodePropertyString
ComAdobeGraniteCsrfImplCSRFServletProperties::getSlingauthrequirements()
{
	return slingauthrequirements;
}

void
ComAdobeGraniteCsrfImplCSRFServletProperties::setSlingauthrequirements(ConfigNodePropertyString slingauthrequirements)
{
	this->slingauthrequirements = slingauthrequirements;
}



