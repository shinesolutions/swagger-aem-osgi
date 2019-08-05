#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties()
{
	//__init();
}

OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::~OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//jcrPrivilege = new ConfigNodePropertyString();
}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(jcrPrivilege != NULL) {
	//
	//delete jcrPrivilege;
	//jcrPrivilege = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::fromJson(char* jsonStr)
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
	const gchar *jcrPrivilegeKey = "jcrPrivilege";
	node = json_object_get_member(pJsonObject, jcrPrivilegeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jcrPrivilege, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jcrPrivilege);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::toJson()
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
		ConfigNodePropertyString obj = getJcrPrivilege();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJcrPrivilege());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jcrPrivilegeKey = "jcrPrivilege";
	json_object_set_member(pJsonObject, jcrPrivilegeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::getJcrPrivilege()
{
	return jcrPrivilege;
}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::setJcrPrivilege(ConfigNodePropertyString  jcrPrivilege)
{
	this->jcrPrivilege = jcrPrivilege;
}


