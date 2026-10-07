

#include "ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.h"

using namespace Tiny;

ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties()
{
	portaloutboxes = ConfigNodePropertyArray();
	draftdataservice = ConfigNodePropertyString();
	draftmetadataservice = ConfigNodePropertyString();
	submitdataservice = ConfigNodePropertyString();
	submitmetadataservice = ConfigNodePropertyString();
	pendingSigndataservice = ConfigNodePropertyString();
	pendingSignmetadataservice = ConfigNodePropertyString();
}

ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::~ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties()
{

}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *portaloutboxesKey = "portal.outboxes";

    if(object.has_key(portaloutboxesKey))
    {
        bourne::json value = object[portaloutboxesKey];




        ConfigNodePropertyArray* obj = &portaloutboxes;
		obj->fromJson(value.dump());

    }

    const char *draftdataserviceKey = "draft.data.service";

    if(object.has_key(draftdataserviceKey))
    {
        bourne::json value = object[draftdataserviceKey];




        ConfigNodePropertyString* obj = &draftdataservice;
		obj->fromJson(value.dump());

    }

    const char *draftmetadataserviceKey = "draft.metadata.service";

    if(object.has_key(draftmetadataserviceKey))
    {
        bourne::json value = object[draftmetadataserviceKey];




        ConfigNodePropertyString* obj = &draftmetadataservice;
		obj->fromJson(value.dump());

    }

    const char *submitdataserviceKey = "submit.data.service";

    if(object.has_key(submitdataserviceKey))
    {
        bourne::json value = object[submitdataserviceKey];




        ConfigNodePropertyString* obj = &submitdataservice;
		obj->fromJson(value.dump());

    }

    const char *submitmetadataserviceKey = "submit.metadata.service";

    if(object.has_key(submitmetadataserviceKey))
    {
        bourne::json value = object[submitmetadataserviceKey];




        ConfigNodePropertyString* obj = &submitmetadataservice;
		obj->fromJson(value.dump());

    }

    const char *pendingSigndataserviceKey = "pendingSign.data.service";

    if(object.has_key(pendingSigndataserviceKey))
    {
        bourne::json value = object[pendingSigndataserviceKey];




        ConfigNodePropertyString* obj = &pendingSigndataservice;
		obj->fromJson(value.dump());

    }

    const char *pendingSignmetadataserviceKey = "pendingSign.metadata.service";

    if(object.has_key(pendingSignmetadataserviceKey))
    {
        bourne::json value = object[pendingSignmetadataserviceKey];




        ConfigNodePropertyString* obj = &pendingSignmetadataservice;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["portaloutboxes"] = getPortaloutboxes().toJson();






	object["draftdataservice"] = getDraftdataservice().toJson();






	object["draftmetadataservice"] = getDraftmetadataservice().toJson();






	object["submitdataservice"] = getSubmitdataservice().toJson();






	object["submitmetadataservice"] = getSubmitmetadataservice().toJson();






	object["pendingSigndataservice"] = getPendingSigndataservice().toJson();






	object["pendingSignmetadataservice"] = getPendingSignmetadataservice().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getPortaloutboxes()
{
	return portaloutboxes;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setPortaloutboxes(ConfigNodePropertyArray portaloutboxes)
{
	this->portaloutboxes = portaloutboxes;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getDraftdataservice()
{
	return draftdataservice;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setDraftdataservice(ConfigNodePropertyString draftdataservice)
{
	this->draftdataservice = draftdataservice;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getDraftmetadataservice()
{
	return draftmetadataservice;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setDraftmetadataservice(ConfigNodePropertyString draftmetadataservice)
{
	this->draftmetadataservice = draftmetadataservice;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getSubmitdataservice()
{
	return submitdataservice;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setSubmitdataservice(ConfigNodePropertyString submitdataservice)
{
	this->submitdataservice = submitdataservice;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getSubmitmetadataservice()
{
	return submitmetadataservice;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setSubmitmetadataservice(ConfigNodePropertyString submitmetadataservice)
{
	this->submitmetadataservice = submitmetadataservice;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getPendingSigndataservice()
{
	return pendingSigndataservice;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setPendingSigndataservice(ConfigNodePropertyString pendingSigndataservice)
{
	this->pendingSigndataservice = pendingSigndataservice;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getPendingSignmetadataservice()
{
	return pendingSignmetadataservice;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setPendingSignmetadataservice(ConfigNodePropertyString pendingSignmetadataservice)
{
	this->pendingSignmetadataservice = pendingSignmetadataservice;
}



