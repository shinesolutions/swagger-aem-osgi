#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties()
{
	//__init();
}

ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::~ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::__init()
{
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath = new ConfigNodePropertyArray();
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency = new ConfigNodePropertyString();
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout = new ConfigNodePropertyInteger();
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients = new ConfigNodePropertyString();
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver = new ConfigNodePropertyString();
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport = new ConfigNodePropertyInteger();
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls = new ConfigNodePropertyBoolean();
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername = new ConfigNodePropertyString();
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword = new ConfigNodePropertyString();
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::__cleanup()
{
	//if(comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath != NULL) {
	//
	//delete comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath;
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath = NULL;
	//}
	//if(comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency != NULL) {
	//
	//delete comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency;
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency = NULL;
	//}
	//if(comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout != NULL) {
	//
	//delete comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout;
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout = NULL;
	//}
	//if(comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients != NULL) {
	//
	//delete comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients;
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients = NULL;
	//}
	//if(comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver != NULL) {
	//
	//delete comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver;
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver = NULL;
	//}
	//if(comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport != NULL) {
	//
	//delete comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport;
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport = NULL;
	//}
	//if(comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls != NULL) {
	//
	//delete comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls;
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls = NULL;
	//}
	//if(comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername != NULL) {
	//
	//delete comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername;
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername = NULL;
	//}
	//if(comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword != NULL) {
	//
	//delete comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword;
	//comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword = NULL;
	//}
	//
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPathKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath";
	node = json_object_get_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequencyKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency";
	node = json_object_get_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequencyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeoutKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout";
	node = json_object_get_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipientsKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients";
	node = json_object_get_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipientsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserverKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver";
	node = json_object_get_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserverKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpportKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport";
	node = json_object_get_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpportKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetlsKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls";
	node = json_object_get_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetlsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplusernameKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username";
	node = json_object_get_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplusernameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplpasswordKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password";
	node = json_object_get_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplpasswordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getComadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPathKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath";
	json_object_set_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequencyKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency";
	json_object_set_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequencyKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeoutKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout";
	json_object_set_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipientsKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients";
	json_object_set_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipientsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserverKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver";
	json_object_set_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserverKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpportKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport";
	json_object_set_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpportKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetlsKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls";
	json_object_set_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetlsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusername();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplusernameKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username";
	json_object_set_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplusernameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensmonitoringimplScreensMonitoringServiceImplpasswordKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password";
	json_object_set_member(pJsonObject, comadobecqscreensmonitoringimplScreensMonitoringServiceImplpasswordKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath(ConfigNodePropertyArray  comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath = comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath;
}

ConfigNodePropertyString
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency(ConfigNodePropertyString  comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency = comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout(ConfigNodePropertyInteger  comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout = comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout;
}

ConfigNodePropertyString
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients(ConfigNodePropertyString  comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients = comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients;
}

ConfigNodePropertyString
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver(ConfigNodePropertyString  comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver = comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport(ConfigNodePropertyInteger  comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport = comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport;
}

ConfigNodePropertyBoolean
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls(ConfigNodePropertyBoolean  comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls = comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls;
}

ConfigNodePropertyString
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusername()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplusername(ConfigNodePropertyString  comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername = comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername;
}

ConfigNodePropertyString
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword(ConfigNodePropertyString  comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword = comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword;
}


