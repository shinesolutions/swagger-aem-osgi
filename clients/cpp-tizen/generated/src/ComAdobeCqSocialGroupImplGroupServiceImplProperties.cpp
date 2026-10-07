#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialGroupImplGroupServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialGroupImplGroupServiceImplProperties::ComAdobeCqSocialGroupImplGroupServiceImplProperties()
{
	//__init();
}

ComAdobeCqSocialGroupImplGroupServiceImplProperties::~ComAdobeCqSocialGroupImplGroupServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialGroupImplGroupServiceImplProperties::__init()
{
	//maxWaitTime = new ConfigNodePropertyInteger();
	//minWaitBetweenRetries = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialGroupImplGroupServiceImplProperties::__cleanup()
{
	//if(maxWaitTime != NULL) {
	//
	//delete maxWaitTime;
	//maxWaitTime = NULL;
	//}
	//if(minWaitBetweenRetries != NULL) {
	//
	//delete minWaitBetweenRetries;
	//minWaitBetweenRetries = NULL;
	//}
	//
}

void
ComAdobeCqSocialGroupImplGroupServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxWaitTimeKey = "maxWaitTime";
	node = json_object_get_member(pJsonObject, maxWaitTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxWaitTime, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxWaitTime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *minWaitBetweenRetriesKey = "minWaitBetweenRetries";
	node = json_object_get_member(pJsonObject, minWaitBetweenRetriesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&minWaitBetweenRetries, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&minWaitBetweenRetries);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialGroupImplGroupServiceImplProperties::ComAdobeCqSocialGroupImplGroupServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialGroupImplGroupServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxWaitTime();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxWaitTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxWaitTimeKey = "maxWaitTime";
	json_object_set_member(pJsonObject, maxWaitTimeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMinWaitBetweenRetries();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMinWaitBetweenRetries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *minWaitBetweenRetriesKey = "minWaitBetweenRetries";
	json_object_set_member(pJsonObject, minWaitBetweenRetriesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialGroupImplGroupServiceImplProperties::getMaxWaitTime()
{
	return maxWaitTime;
}

void
ComAdobeCqSocialGroupImplGroupServiceImplProperties::setMaxWaitTime(ConfigNodePropertyInteger  maxWaitTime)
{
	this->maxWaitTime = maxWaitTime;
}

ConfigNodePropertyInteger
ComAdobeCqSocialGroupImplGroupServiceImplProperties::getMinWaitBetweenRetries()
{
	return minWaitBetweenRetries;
}

void
ComAdobeCqSocialGroupImplGroupServiceImplProperties::setMinWaitBetweenRetries(ConfigNodePropertyInteger  minWaitBetweenRetries)
{
	this->minWaitBetweenRetries = minWaitBetweenRetries;
}


