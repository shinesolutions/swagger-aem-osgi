

#include "ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.h"

using namespace Tiny;

ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties()
{
	formportalinterval = ConfigNodePropertyString();
}

ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::~ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties()
{

}

void
ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *formportalintervalKey = "formportal.interval";

    if(object.has_key(formportalintervalKey))
    {
        bourne::json value = object[formportalintervalKey];




        ConfigNodePropertyString* obj = &formportalinterval;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["formportalinterval"] = getFormportalinterval().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::getFormportalinterval()
{
	return formportalinterval;
}

void
ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::setFormportalinterval(ConfigNodePropertyString formportalinterval)
{
	this->formportalinterval = formportalinterval;
}



