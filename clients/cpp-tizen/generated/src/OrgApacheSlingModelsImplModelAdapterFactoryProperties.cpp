#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingModelsImplModelAdapterFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingModelsImplModelAdapterFactoryProperties::OrgApacheSlingModelsImplModelAdapterFactoryProperties()
{
	//__init();
}

OrgApacheSlingModelsImplModelAdapterFactoryProperties::~OrgApacheSlingModelsImplModelAdapterFactoryProperties()
{
	//__cleanup();
}

void
OrgApacheSlingModelsImplModelAdapterFactoryProperties::__init()
{
	//osgihttpwhiteboardlistener = new ConfigNodePropertyString();
	//osgihttpwhiteboardcontextselect = new ConfigNodePropertyString();
	//maxrecursiondepth = new ConfigNodePropertyInteger();
	//cleanupjobperiod = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingModelsImplModelAdapterFactoryProperties::__cleanup()
{
	//if(osgihttpwhiteboardlistener != NULL) {
	//
	//delete osgihttpwhiteboardlistener;
	//osgihttpwhiteboardlistener = NULL;
	//}
	//if(osgihttpwhiteboardcontextselect != NULL) {
	//
	//delete osgihttpwhiteboardcontextselect;
	//osgihttpwhiteboardcontextselect = NULL;
	//}
	//if(maxrecursiondepth != NULL) {
	//
	//delete maxrecursiondepth;
	//maxrecursiondepth = NULL;
	//}
	//if(cleanupjobperiod != NULL) {
	//
	//delete cleanupjobperiod;
	//cleanupjobperiod = NULL;
	//}
	//
}

void
OrgApacheSlingModelsImplModelAdapterFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *osgihttpwhiteboardlistenerKey = "osgi.http.whiteboard.listener";
	node = json_object_get_member(pJsonObject, osgihttpwhiteboardlistenerKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&osgihttpwhiteboardlistener, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&osgihttpwhiteboardlistener);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *osgihttpwhiteboardcontextselectKey = "osgi.http.whiteboard.context.select";
	node = json_object_get_member(pJsonObject, osgihttpwhiteboardcontextselectKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&osgihttpwhiteboardcontextselect, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&osgihttpwhiteboardcontextselect);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxrecursiondepthKey = "max.recursion.depth";
	node = json_object_get_member(pJsonObject, maxrecursiondepthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxrecursiondepth, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxrecursiondepth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cleanupjobperiodKey = "cleanup.job.period";
	node = json_object_get_member(pJsonObject, cleanupjobperiodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cleanupjobperiod, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cleanupjobperiod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingModelsImplModelAdapterFactoryProperties::OrgApacheSlingModelsImplModelAdapterFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingModelsImplModelAdapterFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOsgihttpwhiteboardlistener();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOsgihttpwhiteboardlistener());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *osgihttpwhiteboardlistenerKey = "osgi.http.whiteboard.listener";
	json_object_set_member(pJsonObject, osgihttpwhiteboardlistenerKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOsgihttpwhiteboardcontextselect();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOsgihttpwhiteboardcontextselect());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *osgihttpwhiteboardcontextselectKey = "osgi.http.whiteboard.context.select";
	json_object_set_member(pJsonObject, osgihttpwhiteboardcontextselectKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxrecursiondepth();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxrecursiondepth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxrecursiondepthKey = "max.recursion.depth";
	json_object_set_member(pJsonObject, maxrecursiondepthKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCleanupjobperiod();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCleanupjobperiod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cleanupjobperiodKey = "cleanup.job.period";
	json_object_set_member(pJsonObject, cleanupjobperiodKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingModelsImplModelAdapterFactoryProperties::getOsgihttpwhiteboardlistener()
{
	return osgihttpwhiteboardlistener;
}

void
OrgApacheSlingModelsImplModelAdapterFactoryProperties::setOsgihttpwhiteboardlistener(ConfigNodePropertyString  osgihttpwhiteboardlistener)
{
	this->osgihttpwhiteboardlistener = osgihttpwhiteboardlistener;
}

ConfigNodePropertyString
OrgApacheSlingModelsImplModelAdapterFactoryProperties::getOsgihttpwhiteboardcontextselect()
{
	return osgihttpwhiteboardcontextselect;
}

void
OrgApacheSlingModelsImplModelAdapterFactoryProperties::setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString  osgihttpwhiteboardcontextselect)
{
	this->osgihttpwhiteboardcontextselect = osgihttpwhiteboardcontextselect;
}

ConfigNodePropertyInteger
OrgApacheSlingModelsImplModelAdapterFactoryProperties::getMaxrecursiondepth()
{
	return maxrecursiondepth;
}

void
OrgApacheSlingModelsImplModelAdapterFactoryProperties::setMaxrecursiondepth(ConfigNodePropertyInteger  maxrecursiondepth)
{
	this->maxrecursiondepth = maxrecursiondepth;
}

ConfigNodePropertyInteger
OrgApacheSlingModelsImplModelAdapterFactoryProperties::getCleanupjobperiod()
{
	return cleanupjobperiod;
}

void
OrgApacheSlingModelsImplModelAdapterFactoryProperties::setCleanupjobperiod(ConfigNodePropertyInteger  cleanupjobperiod)
{
	this->cleanupjobperiod = cleanupjobperiod;
}


