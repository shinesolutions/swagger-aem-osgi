#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties()
{
	//__init();
}

OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::~OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//queue = new ConfigNodePropertyString();
	//dropinvaliditems = new ConfigNodePropertyBoolean();
	//agenttarget = new ConfigNodePropertyString();
}

void
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(queue != NULL) {
	//
	//delete queue;
	//queue = NULL;
	//}
	//if(dropinvaliditems != NULL) {
	//
	//delete dropinvaliditems;
	//dropinvaliditems = NULL;
	//}
	//if(agenttarget != NULL) {
	//
	//delete agenttarget;
	//agenttarget = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&name, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queueKey = "queue";
	node = json_object_get_member(pJsonObject, queueKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&queue, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&queue);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dropinvaliditemsKey = "drop.invalid.items";
	node = json_object_get_member(pJsonObject, dropinvaliditemsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&dropinvaliditems, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&dropinvaliditems);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *agenttargetKey = "agent.target";
	node = json_object_get_member(pJsonObject, agenttargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&agenttarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&agenttarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getQueue();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getQueue());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queueKey = "queue";
	json_object_set_member(pJsonObject, queueKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDropinvaliditems();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDropinvaliditems());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dropinvaliditemsKey = "drop.invalid.items";
	json_object_set_member(pJsonObject, dropinvaliditemsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAgenttarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAgenttarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *agenttargetKey = "agent.target";
	json_object_set_member(pJsonObject, agenttargetKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::getQueue()
{
	return queue;
}

void
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::setQueue(ConfigNodePropertyString  queue)
{
	this->queue = queue;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::getDropinvaliditems()
{
	return dropinvaliditems;
}

void
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::setDropinvaliditems(ConfigNodePropertyBoolean  dropinvaliditems)
{
	this->dropinvaliditems = dropinvaliditems;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::getAgenttarget()
{
	return agenttarget;
}

void
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::setAgenttarget(ConfigNodePropertyString  agenttarget)
{
	this->agenttarget = agenttarget;
}


