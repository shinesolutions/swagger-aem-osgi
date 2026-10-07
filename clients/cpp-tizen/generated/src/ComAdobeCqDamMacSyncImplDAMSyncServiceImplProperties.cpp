#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties()
{
	//__init();
}

ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::~ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::__init()
{
	//comadobecqdammacsyncdamsyncserviceregistered_paths = new ConfigNodePropertyArray();
	//comadobecqdammacsyncdamsyncservicesyncrenditions = new ConfigNodePropertyBoolean();
	//comadobecqdammacsyncdamsyncservicereplicatethreadwaitms = new ConfigNodePropertyInteger();
	//comadobecqdammacsyncdamsyncserviceplatform = new ConfigNodePropertyDropDown();
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::__cleanup()
{
	//if(comadobecqdammacsyncdamsyncserviceregistered_paths != NULL) {
	//
	//delete comadobecqdammacsyncdamsyncserviceregistered_paths;
	//comadobecqdammacsyncdamsyncserviceregistered_paths = NULL;
	//}
	//if(comadobecqdammacsyncdamsyncservicesyncrenditions != NULL) {
	//
	//delete comadobecqdammacsyncdamsyncservicesyncrenditions;
	//comadobecqdammacsyncdamsyncservicesyncrenditions = NULL;
	//}
	//if(comadobecqdammacsyncdamsyncservicereplicatethreadwaitms != NULL) {
	//
	//delete comadobecqdammacsyncdamsyncservicereplicatethreadwaitms;
	//comadobecqdammacsyncdamsyncservicereplicatethreadwaitms = NULL;
	//}
	//if(comadobecqdammacsyncdamsyncserviceplatform != NULL) {
	//
	//delete comadobecqdammacsyncdamsyncserviceplatform;
	//comadobecqdammacsyncdamsyncserviceplatform = NULL;
	//}
	//
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comadobecqdammacsyncdamsyncserviceregistered_pathsKey = "com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths";
	node = json_object_get_member(pJsonObject, comadobecqdammacsyncdamsyncserviceregistered_pathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&comadobecqdammacsyncdamsyncserviceregistered_paths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&comadobecqdammacsyncdamsyncserviceregistered_paths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqdammacsyncdamsyncservicesyncrenditionsKey = "com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions";
	node = json_object_get_member(pJsonObject, comadobecqdammacsyncdamsyncservicesyncrenditionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&comadobecqdammacsyncdamsyncservicesyncrenditions, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&comadobecqdammacsyncdamsyncservicesyncrenditions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqdammacsyncdamsyncservicereplicatethreadwaitmsKey = "com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms";
	node = json_object_get_member(pJsonObject, comadobecqdammacsyncdamsyncservicereplicatethreadwaitmsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobecqdammacsyncdamsyncservicereplicatethreadwaitms, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobecqdammacsyncdamsyncservicereplicatethreadwaitms);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqdammacsyncdamsyncserviceplatformKey = "com.adobe.cq.dam.mac.sync.damsyncservice.platform";
	node = json_object_get_member(pJsonObject, comadobecqdammacsyncdamsyncserviceplatformKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&comadobecqdammacsyncdamsyncserviceplatform, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&comadobecqdammacsyncdamsyncserviceplatform);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getComadobecqdammacsyncdamsyncserviceregisteredPaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getComadobecqdammacsyncdamsyncserviceregisteredPaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqdammacsyncdamsyncserviceregistered_pathsKey = "com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths";
	json_object_set_member(pJsonObject, comadobecqdammacsyncdamsyncserviceregistered_pathsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getComadobecqdammacsyncdamsyncservicesyncrenditions();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getComadobecqdammacsyncdamsyncservicesyncrenditions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqdammacsyncdamsyncservicesyncrenditionsKey = "com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions";
	json_object_set_member(pJsonObject, comadobecqdammacsyncdamsyncservicesyncrenditionsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobecqdammacsyncdamsyncservicereplicatethreadwaitms();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobecqdammacsyncdamsyncservicereplicatethreadwaitms());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqdammacsyncdamsyncservicereplicatethreadwaitmsKey = "com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms";
	json_object_set_member(pJsonObject, comadobecqdammacsyncdamsyncservicereplicatethreadwaitmsKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getComadobecqdammacsyncdamsyncserviceplatform();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getComadobecqdammacsyncdamsyncserviceplatform());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqdammacsyncdamsyncserviceplatformKey = "com.adobe.cq.dam.mac.sync.damsyncservice.platform";
	json_object_set_member(pJsonObject, comadobecqdammacsyncdamsyncserviceplatformKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::getComadobecqdammacsyncdamsyncserviceregisteredPaths()
{
	return comadobecqdammacsyncdamsyncserviceregistered_paths;
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::setComadobecqdammacsyncdamsyncserviceregisteredPaths(ConfigNodePropertyArray  comadobecqdammacsyncdamsyncserviceregistered_paths)
{
	this->comadobecqdammacsyncdamsyncserviceregistered_paths = comadobecqdammacsyncdamsyncserviceregistered_paths;
}

ConfigNodePropertyBoolean
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::getComadobecqdammacsyncdamsyncservicesyncrenditions()
{
	return comadobecqdammacsyncdamsyncservicesyncrenditions;
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::setComadobecqdammacsyncdamsyncservicesyncrenditions(ConfigNodePropertyBoolean  comadobecqdammacsyncdamsyncservicesyncrenditions)
{
	this->comadobecqdammacsyncdamsyncservicesyncrenditions = comadobecqdammacsyncdamsyncservicesyncrenditions;
}

ConfigNodePropertyInteger
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::getComadobecqdammacsyncdamsyncservicereplicatethreadwaitms()
{
	return comadobecqdammacsyncdamsyncservicereplicatethreadwaitms;
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::setComadobecqdammacsyncdamsyncservicereplicatethreadwaitms(ConfigNodePropertyInteger  comadobecqdammacsyncdamsyncservicereplicatethreadwaitms)
{
	this->comadobecqdammacsyncdamsyncservicereplicatethreadwaitms = comadobecqdammacsyncdamsyncservicereplicatethreadwaitms;
}

ConfigNodePropertyDropDown
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::getComadobecqdammacsyncdamsyncserviceplatform()
{
	return comadobecqdammacsyncdamsyncserviceplatform;
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::setComadobecqdammacsyncdamsyncserviceplatform(ConfigNodePropertyDropDown  comadobecqdammacsyncdamsyncserviceplatform)
{
	this->comadobecqdammacsyncdamsyncserviceplatform = comadobecqdammacsyncdamsyncserviceplatform;
}


