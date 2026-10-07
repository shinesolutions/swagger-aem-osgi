

#include "ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.h"

using namespace Tiny;

ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties()
{
	archivingenabled = ConfigNodePropertyBoolean();
	schedulerexpression = ConfigNodePropertyString();
	archivesincedayscompleted = ConfigNodePropertyInteger();
}

ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::~ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties()
{

}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *archivingenabledKey = "archiving.enabled";

    if(object.has_key(archivingenabledKey))
    {
        bourne::json value = object[archivingenabledKey];




        ConfigNodePropertyBoolean* obj = &archivingenabled;
		obj->fromJson(value.dump());

    }

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }

    const char *archivesincedayscompletedKey = "archive.since.days.completed";

    if(object.has_key(archivesincedayscompletedKey))
    {
        bourne::json value = object[archivesincedayscompletedKey];




        ConfigNodePropertyInteger* obj = &archivesincedayscompleted;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["archivingenabled"] = getArchivingenabled().toJson();






	object["schedulerexpression"] = getSchedulerexpression().toJson();






	object["archivesincedayscompleted"] = getArchivesincedayscompleted().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::getArchivingenabled()
{
	return archivingenabled;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::setArchivingenabled(ConfigNodePropertyBoolean archivingenabled)
{
	this->archivingenabled = archivingenabled;
}

ConfigNodePropertyString
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyInteger
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::getArchivesincedayscompleted()
{
	return archivesincedayscompleted;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::setArchivesincedayscompleted(ConfigNodePropertyInteger archivesincedayscompleted)
{
	this->archivesincedayscompleted = archivesincedayscompleted;
}



