

#include "ComDayCqWcmFoundationFormsImplFormChooserServletProperties.h"

using namespace Tiny;

ComDayCqWcmFoundationFormsImplFormChooserServletProperties::ComDayCqWcmFoundationFormsImplFormChooserServletProperties()
{
	servicename = ConfigNodePropertyString();
	slingservletresourceTypes = ConfigNodePropertyString();
	slingservletselectors = ConfigNodePropertyString();
	slingservletmethods = ConfigNodePropertyArray();
	formsformchooserservletadvansesearchrequire = ConfigNodePropertyBoolean();
}

ComDayCqWcmFoundationFormsImplFormChooserServletProperties::ComDayCqWcmFoundationFormsImplFormChooserServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationFormsImplFormChooserServletProperties::~ComDayCqWcmFoundationFormsImplFormChooserServletProperties()
{

}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicenameKey = "service.name";

    if(object.has_key(servicenameKey))
    {
        bourne::json value = object[servicenameKey];




        ConfigNodePropertyString* obj = &servicename;
		obj->fromJson(value.dump());

    }

    const char *slingservletresourceTypesKey = "sling.servlet.resourceTypes";

    if(object.has_key(slingservletresourceTypesKey))
    {
        bourne::json value = object[slingservletresourceTypesKey];




        ConfigNodePropertyString* obj = &slingservletresourceTypes;
		obj->fromJson(value.dump());

    }

    const char *slingservletselectorsKey = "sling.servlet.selectors";

    if(object.has_key(slingservletselectorsKey))
    {
        bourne::json value = object[slingservletselectorsKey];




        ConfigNodePropertyString* obj = &slingservletselectors;
		obj->fromJson(value.dump());

    }

    const char *slingservletmethodsKey = "sling.servlet.methods";

    if(object.has_key(slingservletmethodsKey))
    {
        bourne::json value = object[slingservletmethodsKey];




        ConfigNodePropertyArray* obj = &slingservletmethods;
		obj->fromJson(value.dump());

    }

    const char *formsformchooserservletadvansesearchrequireKey = "forms.formchooserservlet.advansesearch.require";

    if(object.has_key(formsformchooserservletadvansesearchrequireKey))
    {
        bourne::json value = object[formsformchooserservletadvansesearchrequireKey];




        ConfigNodePropertyBoolean* obj = &formsformchooserservletadvansesearchrequire;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["servicename"] = getServicename().toJson();






	object["slingservletresourceTypes"] = getSlingservletresourceTypes().toJson();






	object["slingservletselectors"] = getSlingservletselectors().toJson();






	object["slingservletmethods"] = getSlingservletmethods().toJson();






	object["formsformchooserservletadvansesearchrequire"] = getFormsformchooserservletadvansesearchrequire().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::getServicename()
{
	return servicename;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::setServicename(ConfigNodePropertyString servicename)
{
	this->servicename = servicename;
}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::getSlingservletresourceTypes()
{
	return slingservletresourceTypes;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::setSlingservletresourceTypes(ConfigNodePropertyString slingservletresourceTypes)
{
	this->slingservletresourceTypes = slingservletresourceTypes;
}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::setSlingservletselectors(ConfigNodePropertyString slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::setSlingservletmethods(ConfigNodePropertyArray slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}

ConfigNodePropertyBoolean
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::getFormsformchooserservletadvansesearchrequire()
{
	return formsformchooserservletadvansesearchrequire;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::setFormsformchooserservletadvansesearchrequire(ConfigNodePropertyBoolean formsformchooserservletadvansesearchrequire)
{
	this->formsformchooserservletadvansesearchrequire = formsformchooserservletadvansesearchrequire;
}



