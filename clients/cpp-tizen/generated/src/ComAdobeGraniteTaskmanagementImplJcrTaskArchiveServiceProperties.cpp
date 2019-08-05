#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties()
{
	//__init();
}

ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::~ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::__init()
{
	//archivingenabled = new ConfigNodePropertyBoolean();
	//schedulerexpression = new ConfigNodePropertyString();
	//archivesincedayscompleted = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::__cleanup()
{
	//if(archivingenabled != NULL) {
	//
	//delete archivingenabled;
	//archivingenabled = NULL;
	//}
	//if(schedulerexpression != NULL) {
	//
	//delete schedulerexpression;
	//schedulerexpression = NULL;
	//}
	//if(archivesincedayscompleted != NULL) {
	//
	//delete archivesincedayscompleted;
	//archivesincedayscompleted = NULL;
	//}
	//
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *archivingenabledKey = "archiving.enabled";
	node = json_object_get_member(pJsonObject, archivingenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&archivingenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&archivingenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *schedulerexpressionKey = "scheduler.expression";
	node = json_object_get_member(pJsonObject, schedulerexpressionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&schedulerexpression, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&schedulerexpression);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *archivesincedayscompletedKey = "archive.since.days.completed";
	node = json_object_get_member(pJsonObject, archivesincedayscompletedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&archivesincedayscompleted, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&archivesincedayscompleted);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getArchivingenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getArchivingenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *archivingenabledKey = "archiving.enabled";
	json_object_set_member(pJsonObject, archivingenabledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSchedulerexpression();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSchedulerexpression());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerexpressionKey = "scheduler.expression";
	json_object_set_member(pJsonObject, schedulerexpressionKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getArchivesincedayscompleted();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getArchivesincedayscompleted());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *archivesincedayscompletedKey = "archive.since.days.completed";
	json_object_set_member(pJsonObject, archivesincedayscompletedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::getArchivingenabled()
{
	return archivingenabled;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::setArchivingenabled(ConfigNodePropertyBoolean  archivingenabled)
{
	this->archivingenabled = archivingenabled;
}

ConfigNodePropertyString
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::setSchedulerexpression(ConfigNodePropertyString  schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyInteger
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::getArchivesincedayscompleted()
{
	return archivesincedayscompleted;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties::setArchivesincedayscompleted(ConfigNodePropertyInteger  archivesincedayscompleted)
{
	this->archivesincedayscompleted = archivesincedayscompleted;
}


