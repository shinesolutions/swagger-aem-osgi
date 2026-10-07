#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties()
{
	//__init();
}

ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::~ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::__init()
{
	//deviceRegistrationTimeout = new ConfigNodePropertyInteger();
}

void
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::__cleanup()
{
	//if(deviceRegistrationTimeout != NULL) {
	//
	//delete deviceRegistrationTimeout;
	//deviceRegistrationTimeout = NULL;
	//}
	//
}

void
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *deviceRegistrationTimeoutKey = "deviceRegistrationTimeout";
	node = json_object_get_member(pJsonObject, deviceRegistrationTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&deviceRegistrationTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&deviceRegistrationTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getDeviceRegistrationTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getDeviceRegistrationTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deviceRegistrationTimeoutKey = "deviceRegistrationTimeout";
	json_object_set_member(pJsonObject, deviceRegistrationTimeoutKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::getDeviceRegistrationTimeout()
{
	return deviceRegistrationTimeout;
}

void
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::setDeviceRegistrationTimeout(ConfigNodePropertyInteger  deviceRegistrationTimeout)
{
	this->deviceRegistrationTimeout = deviceRegistrationTimeout;
}


