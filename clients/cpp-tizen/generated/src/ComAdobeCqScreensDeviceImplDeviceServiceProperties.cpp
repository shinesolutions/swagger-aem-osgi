#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqScreensDeviceImplDeviceServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqScreensDeviceImplDeviceServiceProperties::ComAdobeCqScreensDeviceImplDeviceServiceProperties()
{
	//__init();
}

ComAdobeCqScreensDeviceImplDeviceServiceProperties::~ComAdobeCqScreensDeviceImplDeviceServiceProperties()
{
	//__cleanup();
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::__init()
{
	//comadobeaemscreensplayerpingfrequency = new ConfigNodePropertyInteger();
	//comadobeaemscreensdevicepaswordspecialchars = new ConfigNodePropertyString();
	//comadobeaemscreensdevicepaswordminlowercasechars = new ConfigNodePropertyInteger();
	//comadobeaemscreensdevicepaswordminuppercasechars = new ConfigNodePropertyInteger();
	//comadobeaemscreensdevicepaswordminnumberchars = new ConfigNodePropertyInteger();
	//comadobeaemscreensdevicepaswordminspecialchars = new ConfigNodePropertyInteger();
	//comadobeaemscreensdevicepaswordminlength = new ConfigNodePropertyInteger();
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::__cleanup()
{
	//if(comadobeaemscreensplayerpingfrequency != NULL) {
	//
	//delete comadobeaemscreensplayerpingfrequency;
	//comadobeaemscreensplayerpingfrequency = NULL;
	//}
	//if(comadobeaemscreensdevicepaswordspecialchars != NULL) {
	//
	//delete comadobeaemscreensdevicepaswordspecialchars;
	//comadobeaemscreensdevicepaswordspecialchars = NULL;
	//}
	//if(comadobeaemscreensdevicepaswordminlowercasechars != NULL) {
	//
	//delete comadobeaemscreensdevicepaswordminlowercasechars;
	//comadobeaemscreensdevicepaswordminlowercasechars = NULL;
	//}
	//if(comadobeaemscreensdevicepaswordminuppercasechars != NULL) {
	//
	//delete comadobeaemscreensdevicepaswordminuppercasechars;
	//comadobeaemscreensdevicepaswordminuppercasechars = NULL;
	//}
	//if(comadobeaemscreensdevicepaswordminnumberchars != NULL) {
	//
	//delete comadobeaemscreensdevicepaswordminnumberchars;
	//comadobeaemscreensdevicepaswordminnumberchars = NULL;
	//}
	//if(comadobeaemscreensdevicepaswordminspecialchars != NULL) {
	//
	//delete comadobeaemscreensdevicepaswordminspecialchars;
	//comadobeaemscreensdevicepaswordminspecialchars = NULL;
	//}
	//if(comadobeaemscreensdevicepaswordminlength != NULL) {
	//
	//delete comadobeaemscreensdevicepaswordminlength;
	//comadobeaemscreensdevicepaswordminlength = NULL;
	//}
	//
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comadobeaemscreensplayerpingfrequencyKey = "com.adobe.aem.screens.player.pingfrequency";
	node = json_object_get_member(pJsonObject, comadobeaemscreensplayerpingfrequencyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobeaemscreensplayerpingfrequency, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobeaemscreensplayerpingfrequency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobeaemscreensdevicepaswordspecialcharsKey = "com.adobe.aem.screens.device.pasword.specialchars";
	node = json_object_get_member(pJsonObject, comadobeaemscreensdevicepaswordspecialcharsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobeaemscreensdevicepaswordspecialchars, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobeaemscreensdevicepaswordspecialchars);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobeaemscreensdevicepaswordminlowercasecharsKey = "com.adobe.aem.screens.device.pasword.minlowercasechars";
	node = json_object_get_member(pJsonObject, comadobeaemscreensdevicepaswordminlowercasecharsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobeaemscreensdevicepaswordminlowercasechars, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobeaemscreensdevicepaswordminlowercasechars);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobeaemscreensdevicepaswordminuppercasecharsKey = "com.adobe.aem.screens.device.pasword.minuppercasechars";
	node = json_object_get_member(pJsonObject, comadobeaemscreensdevicepaswordminuppercasecharsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobeaemscreensdevicepaswordminuppercasechars, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobeaemscreensdevicepaswordminuppercasechars);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobeaemscreensdevicepaswordminnumbercharsKey = "com.adobe.aem.screens.device.pasword.minnumberchars";
	node = json_object_get_member(pJsonObject, comadobeaemscreensdevicepaswordminnumbercharsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobeaemscreensdevicepaswordminnumberchars, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobeaemscreensdevicepaswordminnumberchars);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobeaemscreensdevicepaswordminspecialcharsKey = "com.adobe.aem.screens.device.pasword.minspecialchars";
	node = json_object_get_member(pJsonObject, comadobeaemscreensdevicepaswordminspecialcharsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobeaemscreensdevicepaswordminspecialchars, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobeaemscreensdevicepaswordminspecialchars);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobeaemscreensdevicepaswordminlengthKey = "com.adobe.aem.screens.device.pasword.minlength";
	node = json_object_get_member(pJsonObject, comadobeaemscreensdevicepaswordminlengthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobeaemscreensdevicepaswordminlength, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobeaemscreensdevicepaswordminlength);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqScreensDeviceImplDeviceServiceProperties::ComAdobeCqScreensDeviceImplDeviceServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqScreensDeviceImplDeviceServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobeaemscreensplayerpingfrequency();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobeaemscreensplayerpingfrequency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobeaemscreensplayerpingfrequencyKey = "com.adobe.aem.screens.player.pingfrequency";
	json_object_set_member(pJsonObject, comadobeaemscreensplayerpingfrequencyKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobeaemscreensdevicepaswordspecialchars();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobeaemscreensdevicepaswordspecialchars());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobeaemscreensdevicepaswordspecialcharsKey = "com.adobe.aem.screens.device.pasword.specialchars";
	json_object_set_member(pJsonObject, comadobeaemscreensdevicepaswordspecialcharsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobeaemscreensdevicepaswordminlowercasechars();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobeaemscreensdevicepaswordminlowercasechars());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobeaemscreensdevicepaswordminlowercasecharsKey = "com.adobe.aem.screens.device.pasword.minlowercasechars";
	json_object_set_member(pJsonObject, comadobeaemscreensdevicepaswordminlowercasecharsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobeaemscreensdevicepaswordminuppercasechars();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobeaemscreensdevicepaswordminuppercasechars());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobeaemscreensdevicepaswordminuppercasecharsKey = "com.adobe.aem.screens.device.pasword.minuppercasechars";
	json_object_set_member(pJsonObject, comadobeaemscreensdevicepaswordminuppercasecharsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobeaemscreensdevicepaswordminnumberchars();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobeaemscreensdevicepaswordminnumberchars());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobeaemscreensdevicepaswordminnumbercharsKey = "com.adobe.aem.screens.device.pasword.minnumberchars";
	json_object_set_member(pJsonObject, comadobeaemscreensdevicepaswordminnumbercharsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobeaemscreensdevicepaswordminspecialchars();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobeaemscreensdevicepaswordminspecialchars());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobeaemscreensdevicepaswordminspecialcharsKey = "com.adobe.aem.screens.device.pasword.minspecialchars";
	json_object_set_member(pJsonObject, comadobeaemscreensdevicepaswordminspecialcharsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobeaemscreensdevicepaswordminlength();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobeaemscreensdevicepaswordminlength());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobeaemscreensdevicepaswordminlengthKey = "com.adobe.aem.screens.device.pasword.minlength";
	json_object_set_member(pJsonObject, comadobeaemscreensdevicepaswordminlengthKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensplayerpingfrequency()
{
	return comadobeaemscreensplayerpingfrequency;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensplayerpingfrequency(ConfigNodePropertyInteger  comadobeaemscreensplayerpingfrequency)
{
	this->comadobeaemscreensplayerpingfrequency = comadobeaemscreensplayerpingfrequency;
}

ConfigNodePropertyString
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensdevicepaswordspecialchars()
{
	return comadobeaemscreensdevicepaswordspecialchars;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensdevicepaswordspecialchars(ConfigNodePropertyString  comadobeaemscreensdevicepaswordspecialchars)
{
	this->comadobeaemscreensdevicepaswordspecialchars = comadobeaemscreensdevicepaswordspecialchars;
}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensdevicepaswordminlowercasechars()
{
	return comadobeaemscreensdevicepaswordminlowercasechars;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensdevicepaswordminlowercasechars(ConfigNodePropertyInteger  comadobeaemscreensdevicepaswordminlowercasechars)
{
	this->comadobeaemscreensdevicepaswordminlowercasechars = comadobeaemscreensdevicepaswordminlowercasechars;
}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensdevicepaswordminuppercasechars()
{
	return comadobeaemscreensdevicepaswordminuppercasechars;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensdevicepaswordminuppercasechars(ConfigNodePropertyInteger  comadobeaemscreensdevicepaswordminuppercasechars)
{
	this->comadobeaemscreensdevicepaswordminuppercasechars = comadobeaemscreensdevicepaswordminuppercasechars;
}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensdevicepaswordminnumberchars()
{
	return comadobeaemscreensdevicepaswordminnumberchars;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensdevicepaswordminnumberchars(ConfigNodePropertyInteger  comadobeaemscreensdevicepaswordminnumberchars)
{
	this->comadobeaemscreensdevicepaswordminnumberchars = comadobeaemscreensdevicepaswordminnumberchars;
}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensdevicepaswordminspecialchars()
{
	return comadobeaemscreensdevicepaswordminspecialchars;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensdevicepaswordminspecialchars(ConfigNodePropertyInteger  comadobeaemscreensdevicepaswordminspecialchars)
{
	this->comadobeaemscreensdevicepaswordminspecialchars = comadobeaemscreensdevicepaswordminspecialchars;
}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensdevicepaswordminlength()
{
	return comadobeaemscreensdevicepaswordminlength;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensdevicepaswordminlength(ConfigNodePropertyInteger  comadobeaemscreensdevicepaswordminlength)
{
	this->comadobeaemscreensdevicepaswordminlength = comadobeaemscreensdevicepaswordminlength;
}


