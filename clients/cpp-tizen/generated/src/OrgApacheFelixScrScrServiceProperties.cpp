#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixScrScrServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixScrScrServiceProperties::OrgApacheFelixScrScrServiceProperties()
{
	//__init();
}

OrgApacheFelixScrScrServiceProperties::~OrgApacheFelixScrScrServiceProperties()
{
	//__cleanup();
}

void
OrgApacheFelixScrScrServiceProperties::__init()
{
	//dsloglevel = new ConfigNodePropertyDropDown();
	//dsfactoryenabled = new ConfigNodePropertyBoolean();
	//dsdelayedkeepInstances = new ConfigNodePropertyBoolean();
	//dslocktimeoutmilliseconds = new ConfigNodePropertyInteger();
	//dsstoptimeoutmilliseconds = new ConfigNodePropertyInteger();
	//dsglobalextender = new ConfigNodePropertyBoolean();
}

void
OrgApacheFelixScrScrServiceProperties::__cleanup()
{
	//if(dsloglevel != NULL) {
	//
	//delete dsloglevel;
	//dsloglevel = NULL;
	//}
	//if(dsfactoryenabled != NULL) {
	//
	//delete dsfactoryenabled;
	//dsfactoryenabled = NULL;
	//}
	//if(dsdelayedkeepInstances != NULL) {
	//
	//delete dsdelayedkeepInstances;
	//dsdelayedkeepInstances = NULL;
	//}
	//if(dslocktimeoutmilliseconds != NULL) {
	//
	//delete dslocktimeoutmilliseconds;
	//dslocktimeoutmilliseconds = NULL;
	//}
	//if(dsstoptimeoutmilliseconds != NULL) {
	//
	//delete dsstoptimeoutmilliseconds;
	//dsstoptimeoutmilliseconds = NULL;
	//}
	//if(dsglobalextender != NULL) {
	//
	//delete dsglobalextender;
	//dsglobalextender = NULL;
	//}
	//
}

void
OrgApacheFelixScrScrServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dsloglevelKey = "ds.loglevel";
	node = json_object_get_member(pJsonObject, dsloglevelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&dsloglevel, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&dsloglevel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dsfactoryenabledKey = "ds.factory.enabled";
	node = json_object_get_member(pJsonObject, dsfactoryenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&dsfactoryenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&dsfactoryenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dsdelayedkeepInstancesKey = "ds.delayed.keepInstances";
	node = json_object_get_member(pJsonObject, dsdelayedkeepInstancesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&dsdelayedkeepInstances, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&dsdelayedkeepInstances);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dslocktimeoutmillisecondsKey = "ds.lock.timeout.milliseconds";
	node = json_object_get_member(pJsonObject, dslocktimeoutmillisecondsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&dslocktimeoutmilliseconds, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&dslocktimeoutmilliseconds);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dsstoptimeoutmillisecondsKey = "ds.stop.timeout.milliseconds";
	node = json_object_get_member(pJsonObject, dsstoptimeoutmillisecondsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&dsstoptimeoutmilliseconds, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&dsstoptimeoutmilliseconds);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dsglobalextenderKey = "ds.global.extender";
	node = json_object_get_member(pJsonObject, dsglobalextenderKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&dsglobalextender, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&dsglobalextender);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheFelixScrScrServiceProperties::OrgApacheFelixScrScrServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixScrScrServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getDsloglevel();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getDsloglevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dsloglevelKey = "ds.loglevel";
	json_object_set_member(pJsonObject, dsloglevelKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDsfactoryenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDsfactoryenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dsfactoryenabledKey = "ds.factory.enabled";
	json_object_set_member(pJsonObject, dsfactoryenabledKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDsdelayedkeepInstances();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDsdelayedkeepInstances());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dsdelayedkeepInstancesKey = "ds.delayed.keepInstances";
	json_object_set_member(pJsonObject, dsdelayedkeepInstancesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getDslocktimeoutmilliseconds();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getDslocktimeoutmilliseconds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dslocktimeoutmillisecondsKey = "ds.lock.timeout.milliseconds";
	json_object_set_member(pJsonObject, dslocktimeoutmillisecondsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getDsstoptimeoutmilliseconds();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getDsstoptimeoutmilliseconds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dsstoptimeoutmillisecondsKey = "ds.stop.timeout.milliseconds";
	json_object_set_member(pJsonObject, dsstoptimeoutmillisecondsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDsglobalextender();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDsglobalextender());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dsglobalextenderKey = "ds.global.extender";
	json_object_set_member(pJsonObject, dsglobalextenderKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
OrgApacheFelixScrScrServiceProperties::getDsloglevel()
{
	return dsloglevel;
}

void
OrgApacheFelixScrScrServiceProperties::setDsloglevel(ConfigNodePropertyDropDown  dsloglevel)
{
	this->dsloglevel = dsloglevel;
}

ConfigNodePropertyBoolean
OrgApacheFelixScrScrServiceProperties::getDsfactoryenabled()
{
	return dsfactoryenabled;
}

void
OrgApacheFelixScrScrServiceProperties::setDsfactoryenabled(ConfigNodePropertyBoolean  dsfactoryenabled)
{
	this->dsfactoryenabled = dsfactoryenabled;
}

ConfigNodePropertyBoolean
OrgApacheFelixScrScrServiceProperties::getDsdelayedkeepInstances()
{
	return dsdelayedkeepInstances;
}

void
OrgApacheFelixScrScrServiceProperties::setDsdelayedkeepInstances(ConfigNodePropertyBoolean  dsdelayedkeepInstances)
{
	this->dsdelayedkeepInstances = dsdelayedkeepInstances;
}

ConfigNodePropertyInteger
OrgApacheFelixScrScrServiceProperties::getDslocktimeoutmilliseconds()
{
	return dslocktimeoutmilliseconds;
}

void
OrgApacheFelixScrScrServiceProperties::setDslocktimeoutmilliseconds(ConfigNodePropertyInteger  dslocktimeoutmilliseconds)
{
	this->dslocktimeoutmilliseconds = dslocktimeoutmilliseconds;
}

ConfigNodePropertyInteger
OrgApacheFelixScrScrServiceProperties::getDsstoptimeoutmilliseconds()
{
	return dsstoptimeoutmilliseconds;
}

void
OrgApacheFelixScrScrServiceProperties::setDsstoptimeoutmilliseconds(ConfigNodePropertyInteger  dsstoptimeoutmilliseconds)
{
	this->dsstoptimeoutmilliseconds = dsstoptimeoutmilliseconds;
}

ConfigNodePropertyBoolean
OrgApacheFelixScrScrServiceProperties::getDsglobalextender()
{
	return dsglobalextender;
}

void
OrgApacheFelixScrScrServiceProperties::setDsglobalextender(ConfigNodePropertyBoolean  dsglobalextender)
{
	this->dsglobalextender = dsglobalextender;
}


