#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties()
{
	//__init();
}

ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::~ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::__init()
{
	//defaulttransportagenttoworkerprefix = new ConfigNodePropertyString();
	//defaulttransportagenttomasterprefix = new ConfigNodePropertyString();
	//defaulttransportinputpackage = new ConfigNodePropertyString();
	//defaulttransportoutputpackage = new ConfigNodePropertyString();
	//defaulttransportreplicationsynchronous = new ConfigNodePropertyBoolean();
	//defaulttransportcontentpackage = new ConfigNodePropertyBoolean();
	//offloadingtransporterdefaultenabled = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::__cleanup()
{
	//if(defaulttransportagenttoworkerprefix != NULL) {
	//
	//delete defaulttransportagenttoworkerprefix;
	//defaulttransportagenttoworkerprefix = NULL;
	//}
	//if(defaulttransportagenttomasterprefix != NULL) {
	//
	//delete defaulttransportagenttomasterprefix;
	//defaulttransportagenttomasterprefix = NULL;
	//}
	//if(defaulttransportinputpackage != NULL) {
	//
	//delete defaulttransportinputpackage;
	//defaulttransportinputpackage = NULL;
	//}
	//if(defaulttransportoutputpackage != NULL) {
	//
	//delete defaulttransportoutputpackage;
	//defaulttransportoutputpackage = NULL;
	//}
	//if(defaulttransportreplicationsynchronous != NULL) {
	//
	//delete defaulttransportreplicationsynchronous;
	//defaulttransportreplicationsynchronous = NULL;
	//}
	//if(defaulttransportcontentpackage != NULL) {
	//
	//delete defaulttransportcontentpackage;
	//defaulttransportcontentpackage = NULL;
	//}
	//if(offloadingtransporterdefaultenabled != NULL) {
	//
	//delete offloadingtransporterdefaultenabled;
	//offloadingtransporterdefaultenabled = NULL;
	//}
	//
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *defaulttransportagenttoworkerprefixKey = "default.transport.agent-to-worker.prefix";
	node = json_object_get_member(pJsonObject, defaulttransportagenttoworkerprefixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaulttransportagenttoworkerprefix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaulttransportagenttoworkerprefix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaulttransportagenttomasterprefixKey = "default.transport.agent-to-master.prefix";
	node = json_object_get_member(pJsonObject, defaulttransportagenttomasterprefixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaulttransportagenttomasterprefix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaulttransportagenttomasterprefix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaulttransportinputpackageKey = "default.transport.input.package";
	node = json_object_get_member(pJsonObject, defaulttransportinputpackageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaulttransportinputpackage, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaulttransportinputpackage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaulttransportoutputpackageKey = "default.transport.output.package";
	node = json_object_get_member(pJsonObject, defaulttransportoutputpackageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaulttransportoutputpackage, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaulttransportoutputpackage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaulttransportreplicationsynchronousKey = "default.transport.replication.synchronous";
	node = json_object_get_member(pJsonObject, defaulttransportreplicationsynchronousKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&defaulttransportreplicationsynchronous, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&defaulttransportreplicationsynchronous);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaulttransportcontentpackageKey = "default.transport.contentpackage";
	node = json_object_get_member(pJsonObject, defaulttransportcontentpackageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&defaulttransportcontentpackage, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&defaulttransportcontentpackage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *offloadingtransporterdefaultenabledKey = "offloading.transporter.default.enabled";
	node = json_object_get_member(pJsonObject, offloadingtransporterdefaultenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&offloadingtransporterdefaultenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&offloadingtransporterdefaultenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaulttransportagenttoworkerprefix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaulttransportagenttoworkerprefix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaulttransportagenttoworkerprefixKey = "default.transport.agent-to-worker.prefix";
	json_object_set_member(pJsonObject, defaulttransportagenttoworkerprefixKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaulttransportagenttomasterprefix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaulttransportagenttomasterprefix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaulttransportagenttomasterprefixKey = "default.transport.agent-to-master.prefix";
	json_object_set_member(pJsonObject, defaulttransportagenttomasterprefixKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaulttransportinputpackage();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaulttransportinputpackage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaulttransportinputpackageKey = "default.transport.input.package";
	json_object_set_member(pJsonObject, defaulttransportinputpackageKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaulttransportoutputpackage();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaulttransportoutputpackage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaulttransportoutputpackageKey = "default.transport.output.package";
	json_object_set_member(pJsonObject, defaulttransportoutputpackageKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDefaulttransportreplicationsynchronous();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDefaulttransportreplicationsynchronous());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaulttransportreplicationsynchronousKey = "default.transport.replication.synchronous";
	json_object_set_member(pJsonObject, defaulttransportreplicationsynchronousKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDefaulttransportcontentpackage();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDefaulttransportcontentpackage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaulttransportcontentpackageKey = "default.transport.contentpackage";
	json_object_set_member(pJsonObject, defaulttransportcontentpackageKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOffloadingtransporterdefaultenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOffloadingtransporterdefaultenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *offloadingtransporterdefaultenabledKey = "offloading.transporter.default.enabled";
	json_object_set_member(pJsonObject, offloadingtransporterdefaultenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getDefaulttransportagenttoworkerprefix()
{
	return defaulttransportagenttoworkerprefix;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setDefaulttransportagenttoworkerprefix(ConfigNodePropertyString  defaulttransportagenttoworkerprefix)
{
	this->defaulttransportagenttoworkerprefix = defaulttransportagenttoworkerprefix;
}

ConfigNodePropertyString
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getDefaulttransportagenttomasterprefix()
{
	return defaulttransportagenttomasterprefix;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setDefaulttransportagenttomasterprefix(ConfigNodePropertyString  defaulttransportagenttomasterprefix)
{
	this->defaulttransportagenttomasterprefix = defaulttransportagenttomasterprefix;
}

ConfigNodePropertyString
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getDefaulttransportinputpackage()
{
	return defaulttransportinputpackage;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setDefaulttransportinputpackage(ConfigNodePropertyString  defaulttransportinputpackage)
{
	this->defaulttransportinputpackage = defaulttransportinputpackage;
}

ConfigNodePropertyString
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getDefaulttransportoutputpackage()
{
	return defaulttransportoutputpackage;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setDefaulttransportoutputpackage(ConfigNodePropertyString  defaulttransportoutputpackage)
{
	this->defaulttransportoutputpackage = defaulttransportoutputpackage;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getDefaulttransportreplicationsynchronous()
{
	return defaulttransportreplicationsynchronous;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setDefaulttransportreplicationsynchronous(ConfigNodePropertyBoolean  defaulttransportreplicationsynchronous)
{
	this->defaulttransportreplicationsynchronous = defaulttransportreplicationsynchronous;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getDefaulttransportcontentpackage()
{
	return defaulttransportcontentpackage;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setDefaulttransportcontentpackage(ConfigNodePropertyBoolean  defaulttransportcontentpackage)
{
	this->defaulttransportcontentpackage = defaulttransportcontentpackage;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getOffloadingtransporterdefaultenabled()
{
	return offloadingtransporterdefaultenabled;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setOffloadingtransporterdefaultenabled(ConfigNodePropertyBoolean  offloadingtransporterdefaultenabled)
{
	this->offloadingtransporterdefaultenabled = offloadingtransporterdefaultenabled;
}


