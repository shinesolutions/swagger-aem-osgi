#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqMailerDefaultMailServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqMailerDefaultMailServiceProperties::ComDayCqMailerDefaultMailServiceProperties()
{
	//__init();
}

ComDayCqMailerDefaultMailServiceProperties::~ComDayCqMailerDefaultMailServiceProperties()
{
	//__cleanup();
}

void
ComDayCqMailerDefaultMailServiceProperties::__init()
{
	//smtphost = new ConfigNodePropertyString();
	//smtpport = new ConfigNodePropertyInteger();
	//smtpuser = new ConfigNodePropertyString();
	//smtppassword = new ConfigNodePropertyString();
	//fromaddress = new ConfigNodePropertyString();
	//smtpssl = new ConfigNodePropertyBoolean();
	//smtpstarttls = new ConfigNodePropertyBoolean();
	//debugemail = new ConfigNodePropertyBoolean();
}

void
ComDayCqMailerDefaultMailServiceProperties::__cleanup()
{
	//if(smtphost != NULL) {
	//
	//delete smtphost;
	//smtphost = NULL;
	//}
	//if(smtpport != NULL) {
	//
	//delete smtpport;
	//smtpport = NULL;
	//}
	//if(smtpuser != NULL) {
	//
	//delete smtpuser;
	//smtpuser = NULL;
	//}
	//if(smtppassword != NULL) {
	//
	//delete smtppassword;
	//smtppassword = NULL;
	//}
	//if(fromaddress != NULL) {
	//
	//delete fromaddress;
	//fromaddress = NULL;
	//}
	//if(smtpssl != NULL) {
	//
	//delete smtpssl;
	//smtpssl = NULL;
	//}
	//if(smtpstarttls != NULL) {
	//
	//delete smtpstarttls;
	//smtpstarttls = NULL;
	//}
	//if(debugemail != NULL) {
	//
	//delete debugemail;
	//debugemail = NULL;
	//}
	//
}

void
ComDayCqMailerDefaultMailServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *smtphostKey = "smtp.host";
	node = json_object_get_member(pJsonObject, smtphostKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&smtphost, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&smtphost);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *smtpportKey = "smtp.port";
	node = json_object_get_member(pJsonObject, smtpportKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&smtpport, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&smtpport);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *smtpuserKey = "smtp.user";
	node = json_object_get_member(pJsonObject, smtpuserKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&smtpuser, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&smtpuser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *smtppasswordKey = "smtp.password";
	node = json_object_get_member(pJsonObject, smtppasswordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&smtppassword, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&smtppassword);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fromaddressKey = "from.address";
	node = json_object_get_member(pJsonObject, fromaddressKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&fromaddress, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&fromaddress);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *smtpsslKey = "smtp.ssl";
	node = json_object_get_member(pJsonObject, smtpsslKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&smtpssl, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&smtpssl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *smtpstarttlsKey = "smtp.starttls";
	node = json_object_get_member(pJsonObject, smtpstarttlsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&smtpstarttls, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&smtpstarttls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *debugemailKey = "debug.email";
	node = json_object_get_member(pJsonObject, debugemailKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&debugemail, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&debugemail);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqMailerDefaultMailServiceProperties::ComDayCqMailerDefaultMailServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqMailerDefaultMailServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSmtphost();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSmtphost());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *smtphostKey = "smtp.host";
	json_object_set_member(pJsonObject, smtphostKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSmtpport();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSmtpport());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *smtpportKey = "smtp.port";
	json_object_set_member(pJsonObject, smtpportKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSmtpuser();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSmtpuser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *smtpuserKey = "smtp.user";
	json_object_set_member(pJsonObject, smtpuserKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSmtppassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSmtppassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *smtppasswordKey = "smtp.password";
	json_object_set_member(pJsonObject, smtppasswordKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFromaddress();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFromaddress());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fromaddressKey = "from.address";
	json_object_set_member(pJsonObject, fromaddressKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSmtpssl();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSmtpssl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *smtpsslKey = "smtp.ssl";
	json_object_set_member(pJsonObject, smtpsslKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSmtpstarttls();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSmtpstarttls());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *smtpstarttlsKey = "smtp.starttls";
	json_object_set_member(pJsonObject, smtpstarttlsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDebugemail();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDebugemail());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *debugemailKey = "debug.email";
	json_object_set_member(pJsonObject, debugemailKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqMailerDefaultMailServiceProperties::getSmtphost()
{
	return smtphost;
}

void
ComDayCqMailerDefaultMailServiceProperties::setSmtphost(ConfigNodePropertyString  smtphost)
{
	this->smtphost = smtphost;
}

ConfigNodePropertyInteger
ComDayCqMailerDefaultMailServiceProperties::getSmtpport()
{
	return smtpport;
}

void
ComDayCqMailerDefaultMailServiceProperties::setSmtpport(ConfigNodePropertyInteger  smtpport)
{
	this->smtpport = smtpport;
}

ConfigNodePropertyString
ComDayCqMailerDefaultMailServiceProperties::getSmtpuser()
{
	return smtpuser;
}

void
ComDayCqMailerDefaultMailServiceProperties::setSmtpuser(ConfigNodePropertyString  smtpuser)
{
	this->smtpuser = smtpuser;
}

ConfigNodePropertyString
ComDayCqMailerDefaultMailServiceProperties::getSmtppassword()
{
	return smtppassword;
}

void
ComDayCqMailerDefaultMailServiceProperties::setSmtppassword(ConfigNodePropertyString  smtppassword)
{
	this->smtppassword = smtppassword;
}

ConfigNodePropertyString
ComDayCqMailerDefaultMailServiceProperties::getFromaddress()
{
	return fromaddress;
}

void
ComDayCqMailerDefaultMailServiceProperties::setFromaddress(ConfigNodePropertyString  fromaddress)
{
	this->fromaddress = fromaddress;
}

ConfigNodePropertyBoolean
ComDayCqMailerDefaultMailServiceProperties::getSmtpssl()
{
	return smtpssl;
}

void
ComDayCqMailerDefaultMailServiceProperties::setSmtpssl(ConfigNodePropertyBoolean  smtpssl)
{
	this->smtpssl = smtpssl;
}

ConfigNodePropertyBoolean
ComDayCqMailerDefaultMailServiceProperties::getSmtpstarttls()
{
	return smtpstarttls;
}

void
ComDayCqMailerDefaultMailServiceProperties::setSmtpstarttls(ConfigNodePropertyBoolean  smtpstarttls)
{
	this->smtpstarttls = smtpstarttls;
}

ConfigNodePropertyBoolean
ComDayCqMailerDefaultMailServiceProperties::getDebugemail()
{
	return debugemail;
}

void
ComDayCqMailerDefaultMailServiceProperties::setDebugemail(ConfigNodePropertyBoolean  debugemail)
{
	this->debugemail = debugemail;
}


