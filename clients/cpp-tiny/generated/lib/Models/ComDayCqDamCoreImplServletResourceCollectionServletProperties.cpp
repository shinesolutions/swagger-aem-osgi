

#include "ComDayCqDamCoreImplServletResourceCollectionServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletResourceCollectionServletProperties::ComDayCqDamCoreImplServletResourceCollectionServletProperties()
{
	slingservletresourceTypes = ConfigNodePropertyArray();
	slingservletmethods = ConfigNodePropertyString();
	slingservletselectors = ConfigNodePropertyString();
	downloadconfig = ConfigNodePropertyString();
	viewselector = ConfigNodePropertyString();
	send_email = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplServletResourceCollectionServletProperties::ComDayCqDamCoreImplServletResourceCollectionServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletResourceCollectionServletProperties::~ComDayCqDamCoreImplServletResourceCollectionServletProperties()
{

}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingservletresourceTypesKey = "sling.servlet.resourceTypes";

    if(object.has_key(slingservletresourceTypesKey))
    {
        bourne::json value = object[slingservletresourceTypesKey];




        ConfigNodePropertyArray* obj = &slingservletresourceTypes;
		obj->fromJson(value.dump());

    }

    const char *slingservletmethodsKey = "sling.servlet.methods";

    if(object.has_key(slingservletmethodsKey))
    {
        bourne::json value = object[slingservletmethodsKey];




        ConfigNodePropertyString* obj = &slingservletmethods;
		obj->fromJson(value.dump());

    }

    const char *slingservletselectorsKey = "sling.servlet.selectors";

    if(object.has_key(slingservletselectorsKey))
    {
        bourne::json value = object[slingservletselectorsKey];




        ConfigNodePropertyString* obj = &slingservletselectors;
		obj->fromJson(value.dump());

    }

    const char *downloadconfigKey = "download.config";

    if(object.has_key(downloadconfigKey))
    {
        bourne::json value = object[downloadconfigKey];




        ConfigNodePropertyString* obj = &downloadconfig;
		obj->fromJson(value.dump());

    }

    const char *viewselectorKey = "view.selector";

    if(object.has_key(viewselectorKey))
    {
        bourne::json value = object[viewselectorKey];




        ConfigNodePropertyString* obj = &viewselector;
		obj->fromJson(value.dump());

    }

    const char *send_emailKey = "send_email";

    if(object.has_key(send_emailKey))
    {
        bourne::json value = object[send_emailKey];




        ConfigNodePropertyBoolean* obj = &send_email;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletResourceCollectionServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletresourceTypes"] = getSlingservletresourceTypes().toJson();






	object["slingservletmethods"] = getSlingservletmethods().toJson();






	object["slingservletselectors"] = getSlingservletselectors().toJson();






	object["downloadconfig"] = getDownloadconfig().toJson();






	object["viewselector"] = getViewselector().toJson();






	object["send_email"] = getSendEmail().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletResourceCollectionServletProperties::getSlingservletresourceTypes()
{
	return slingservletresourceTypes;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::setSlingservletresourceTypes(ConfigNodePropertyArray slingservletresourceTypes)
{
	this->slingservletresourceTypes = slingservletresourceTypes;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletResourceCollectionServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::setSlingservletmethods(ConfigNodePropertyString slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletResourceCollectionServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::setSlingservletselectors(ConfigNodePropertyString slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletResourceCollectionServletProperties::getDownloadconfig()
{
	return downloadconfig;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::setDownloadconfig(ConfigNodePropertyString downloadconfig)
{
	this->downloadconfig = downloadconfig;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletResourceCollectionServletProperties::getViewselector()
{
	return viewselector;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::setViewselector(ConfigNodePropertyString viewselector)
{
	this->viewselector = viewselector;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletResourceCollectionServletProperties::getSendEmail()
{
	return send_email;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::setSendEmail(ConfigNodePropertyBoolean send_email)
{
	this->send_email = send_email;
}



