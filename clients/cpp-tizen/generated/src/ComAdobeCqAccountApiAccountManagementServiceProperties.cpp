#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqAccountApiAccountManagementServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqAccountApiAccountManagementServiceProperties::ComAdobeCqAccountApiAccountManagementServiceProperties()
{
	//__init();
}

ComAdobeCqAccountApiAccountManagementServiceProperties::~ComAdobeCqAccountApiAccountManagementServiceProperties()
{
	//__cleanup();
}

void
ComAdobeCqAccountApiAccountManagementServiceProperties::__init()
{
	//cqaccountmanagertokenvalidityperiod = new ConfigNodePropertyInteger();
	//cqaccountmanagerconfigrequestnewaccountmail = new ConfigNodePropertyString();
	//cqaccountmanagerconfigrequestnewpwdmail = new ConfigNodePropertyString();
}

void
ComAdobeCqAccountApiAccountManagementServiceProperties::__cleanup()
{
	//if(cqaccountmanagertokenvalidityperiod != NULL) {
	//
	//delete cqaccountmanagertokenvalidityperiod;
	//cqaccountmanagertokenvalidityperiod = NULL;
	//}
	//if(cqaccountmanagerconfigrequestnewaccountmail != NULL) {
	//
	//delete cqaccountmanagerconfigrequestnewaccountmail;
	//cqaccountmanagerconfigrequestnewaccountmail = NULL;
	//}
	//if(cqaccountmanagerconfigrequestnewpwdmail != NULL) {
	//
	//delete cqaccountmanagerconfigrequestnewpwdmail;
	//cqaccountmanagerconfigrequestnewpwdmail = NULL;
	//}
	//
}

void
ComAdobeCqAccountApiAccountManagementServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqaccountmanagertokenvalidityperiodKey = "cq.accountmanager.token.validity.period";
	node = json_object_get_member(pJsonObject, cqaccountmanagertokenvalidityperiodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqaccountmanagertokenvalidityperiod, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqaccountmanagertokenvalidityperiod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqaccountmanagerconfigrequestnewaccountmailKey = "cq.accountmanager.config.requestnewaccount.mail";
	node = json_object_get_member(pJsonObject, cqaccountmanagerconfigrequestnewaccountmailKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqaccountmanagerconfigrequestnewaccountmail, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqaccountmanagerconfigrequestnewaccountmail);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqaccountmanagerconfigrequestnewpwdmailKey = "cq.accountmanager.config.requestnewpwd.mail";
	node = json_object_get_member(pJsonObject, cqaccountmanagerconfigrequestnewpwdmailKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqaccountmanagerconfigrequestnewpwdmail, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqaccountmanagerconfigrequestnewpwdmail);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqAccountApiAccountManagementServiceProperties::ComAdobeCqAccountApiAccountManagementServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqAccountApiAccountManagementServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqaccountmanagertokenvalidityperiod();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqaccountmanagertokenvalidityperiod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqaccountmanagertokenvalidityperiodKey = "cq.accountmanager.token.validity.period";
	json_object_set_member(pJsonObject, cqaccountmanagertokenvalidityperiodKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqaccountmanagerconfigrequestnewaccountmail();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqaccountmanagerconfigrequestnewaccountmail());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqaccountmanagerconfigrequestnewaccountmailKey = "cq.accountmanager.config.requestnewaccount.mail";
	json_object_set_member(pJsonObject, cqaccountmanagerconfigrequestnewaccountmailKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqaccountmanagerconfigrequestnewpwdmail();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqaccountmanagerconfigrequestnewpwdmail());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqaccountmanagerconfigrequestnewpwdmailKey = "cq.accountmanager.config.requestnewpwd.mail";
	json_object_set_member(pJsonObject, cqaccountmanagerconfigrequestnewpwdmailKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqAccountApiAccountManagementServiceProperties::getCqaccountmanagertokenvalidityperiod()
{
	return cqaccountmanagertokenvalidityperiod;
}

void
ComAdobeCqAccountApiAccountManagementServiceProperties::setCqaccountmanagertokenvalidityperiod(ConfigNodePropertyInteger  cqaccountmanagertokenvalidityperiod)
{
	this->cqaccountmanagertokenvalidityperiod = cqaccountmanagertokenvalidityperiod;
}

ConfigNodePropertyString
ComAdobeCqAccountApiAccountManagementServiceProperties::getCqaccountmanagerconfigrequestnewaccountmail()
{
	return cqaccountmanagerconfigrequestnewaccountmail;
}

void
ComAdobeCqAccountApiAccountManagementServiceProperties::setCqaccountmanagerconfigrequestnewaccountmail(ConfigNodePropertyString  cqaccountmanagerconfigrequestnewaccountmail)
{
	this->cqaccountmanagerconfigrequestnewaccountmail = cqaccountmanagerconfigrequestnewaccountmail;
}

ConfigNodePropertyString
ComAdobeCqAccountApiAccountManagementServiceProperties::getCqaccountmanagerconfigrequestnewpwdmail()
{
	return cqaccountmanagerconfigrequestnewpwdmail;
}

void
ComAdobeCqAccountApiAccountManagementServiceProperties::setCqaccountmanagerconfigrequestnewpwdmail(ConfigNodePropertyString  cqaccountmanagerconfigrequestnewpwdmail)
{
	this->cqaccountmanagerconfigrequestnewpwdmail = cqaccountmanagerconfigrequestnewpwdmail;
}


