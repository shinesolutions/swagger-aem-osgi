#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::~OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::__init()
{
	//providername = new ConfigNodePropertyString();
	//hostname = new ConfigNodePropertyString();
	//hostport = new ConfigNodePropertyInteger();
	//hostssl = new ConfigNodePropertyBoolean();
	//hosttls = new ConfigNodePropertyBoolean();
	//hostnoCertCheck = new ConfigNodePropertyBoolean();
	//binddn = new ConfigNodePropertyString();
	//bindpassword = new ConfigNodePropertyString();
	//searchTimeout = new ConfigNodePropertyString();
	//adminPoolmaxActive = new ConfigNodePropertyInteger();
	//adminPoollookupOnValidate = new ConfigNodePropertyBoolean();
	//userPoolmaxActive = new ConfigNodePropertyInteger();
	//userPoollookupOnValidate = new ConfigNodePropertyBoolean();
	//userbaseDN = new ConfigNodePropertyString();
	//userobjectclass = new ConfigNodePropertyArray();
	//useridAttribute = new ConfigNodePropertyString();
	//userextraFilter = new ConfigNodePropertyString();
	//usermakeDnPath = new ConfigNodePropertyBoolean();
	//groupbaseDN = new ConfigNodePropertyString();
	//groupobjectclass = new ConfigNodePropertyArray();
	//groupnameAttribute = new ConfigNodePropertyString();
	//groupextraFilter = new ConfigNodePropertyString();
	//groupmakeDnPath = new ConfigNodePropertyBoolean();
	//groupmemberAttribute = new ConfigNodePropertyString();
	//useUidForExtId = new ConfigNodePropertyBoolean();
	//customattributes = new ConfigNodePropertyArray();
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::__cleanup()
{
	//if(providername != NULL) {
	//
	//delete providername;
	//providername = NULL;
	//}
	//if(hostname != NULL) {
	//
	//delete hostname;
	//hostname = NULL;
	//}
	//if(hostport != NULL) {
	//
	//delete hostport;
	//hostport = NULL;
	//}
	//if(hostssl != NULL) {
	//
	//delete hostssl;
	//hostssl = NULL;
	//}
	//if(hosttls != NULL) {
	//
	//delete hosttls;
	//hosttls = NULL;
	//}
	//if(hostnoCertCheck != NULL) {
	//
	//delete hostnoCertCheck;
	//hostnoCertCheck = NULL;
	//}
	//if(binddn != NULL) {
	//
	//delete binddn;
	//binddn = NULL;
	//}
	//if(bindpassword != NULL) {
	//
	//delete bindpassword;
	//bindpassword = NULL;
	//}
	//if(searchTimeout != NULL) {
	//
	//delete searchTimeout;
	//searchTimeout = NULL;
	//}
	//if(adminPoolmaxActive != NULL) {
	//
	//delete adminPoolmaxActive;
	//adminPoolmaxActive = NULL;
	//}
	//if(adminPoollookupOnValidate != NULL) {
	//
	//delete adminPoollookupOnValidate;
	//adminPoollookupOnValidate = NULL;
	//}
	//if(userPoolmaxActive != NULL) {
	//
	//delete userPoolmaxActive;
	//userPoolmaxActive = NULL;
	//}
	//if(userPoollookupOnValidate != NULL) {
	//
	//delete userPoollookupOnValidate;
	//userPoollookupOnValidate = NULL;
	//}
	//if(userbaseDN != NULL) {
	//
	//delete userbaseDN;
	//userbaseDN = NULL;
	//}
	//if(userobjectclass != NULL) {
	//
	//delete userobjectclass;
	//userobjectclass = NULL;
	//}
	//if(useridAttribute != NULL) {
	//
	//delete useridAttribute;
	//useridAttribute = NULL;
	//}
	//if(userextraFilter != NULL) {
	//
	//delete userextraFilter;
	//userextraFilter = NULL;
	//}
	//if(usermakeDnPath != NULL) {
	//
	//delete usermakeDnPath;
	//usermakeDnPath = NULL;
	//}
	//if(groupbaseDN != NULL) {
	//
	//delete groupbaseDN;
	//groupbaseDN = NULL;
	//}
	//if(groupobjectclass != NULL) {
	//
	//delete groupobjectclass;
	//groupobjectclass = NULL;
	//}
	//if(groupnameAttribute != NULL) {
	//
	//delete groupnameAttribute;
	//groupnameAttribute = NULL;
	//}
	//if(groupextraFilter != NULL) {
	//
	//delete groupextraFilter;
	//groupextraFilter = NULL;
	//}
	//if(groupmakeDnPath != NULL) {
	//
	//delete groupmakeDnPath;
	//groupmakeDnPath = NULL;
	//}
	//if(groupmemberAttribute != NULL) {
	//
	//delete groupmemberAttribute;
	//groupmemberAttribute = NULL;
	//}
	//if(useUidForExtId != NULL) {
	//
	//delete useUidForExtId;
	//useUidForExtId = NULL;
	//}
	//if(customattributes != NULL) {
	//
	//delete customattributes;
	//customattributes = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *providernameKey = "provider.name";
	node = json_object_get_member(pJsonObject, providernameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&providername, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&providername);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hostnameKey = "host.name";
	node = json_object_get_member(pJsonObject, hostnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&hostname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&hostname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hostportKey = "host.port";
	node = json_object_get_member(pJsonObject, hostportKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&hostport, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&hostport);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hostsslKey = "host.ssl";
	node = json_object_get_member(pJsonObject, hostsslKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&hostssl, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&hostssl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hosttlsKey = "host.tls";
	node = json_object_get_member(pJsonObject, hosttlsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&hosttls, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&hosttls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hostnoCertCheckKey = "host.noCertCheck";
	node = json_object_get_member(pJsonObject, hostnoCertCheckKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&hostnoCertCheck, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&hostnoCertCheck);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *binddnKey = "bind.dn";
	node = json_object_get_member(pJsonObject, binddnKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&binddn, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&binddn);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *bindpasswordKey = "bind.password";
	node = json_object_get_member(pJsonObject, bindpasswordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&bindpassword, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&bindpassword);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *searchTimeoutKey = "searchTimeout";
	node = json_object_get_member(pJsonObject, searchTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&searchTimeout, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&searchTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *adminPoolmaxActiveKey = "adminPool.maxActive";
	node = json_object_get_member(pJsonObject, adminPoolmaxActiveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&adminPoolmaxActive, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&adminPoolmaxActive);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *adminPoollookupOnValidateKey = "adminPool.lookupOnValidate";
	node = json_object_get_member(pJsonObject, adminPoollookupOnValidateKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&adminPoollookupOnValidate, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&adminPoollookupOnValidate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userPoolmaxActiveKey = "userPool.maxActive";
	node = json_object_get_member(pJsonObject, userPoolmaxActiveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&userPoolmaxActive, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&userPoolmaxActive);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userPoollookupOnValidateKey = "userPool.lookupOnValidate";
	node = json_object_get_member(pJsonObject, userPoollookupOnValidateKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&userPoollookupOnValidate, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&userPoollookupOnValidate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userbaseDNKey = "user.baseDN";
	node = json_object_get_member(pJsonObject, userbaseDNKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&userbaseDN, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&userbaseDN);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userobjectclassKey = "user.objectclass";
	node = json_object_get_member(pJsonObject, userobjectclassKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&userobjectclass, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&userobjectclass);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *useridAttributeKey = "user.idAttribute";
	node = json_object_get_member(pJsonObject, useridAttributeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&useridAttribute, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&useridAttribute);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userextraFilterKey = "user.extraFilter";
	node = json_object_get_member(pJsonObject, userextraFilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&userextraFilter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&userextraFilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *usermakeDnPathKey = "user.makeDnPath";
	node = json_object_get_member(pJsonObject, usermakeDnPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&usermakeDnPath, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&usermakeDnPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupbaseDNKey = "group.baseDN";
	node = json_object_get_member(pJsonObject, groupbaseDNKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&groupbaseDN, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&groupbaseDN);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupobjectclassKey = "group.objectclass";
	node = json_object_get_member(pJsonObject, groupobjectclassKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&groupobjectclass, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&groupobjectclass);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupnameAttributeKey = "group.nameAttribute";
	node = json_object_get_member(pJsonObject, groupnameAttributeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&groupnameAttribute, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&groupnameAttribute);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupextraFilterKey = "group.extraFilter";
	node = json_object_get_member(pJsonObject, groupextraFilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&groupextraFilter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&groupextraFilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupmakeDnPathKey = "group.makeDnPath";
	node = json_object_get_member(pJsonObject, groupmakeDnPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&groupmakeDnPath, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&groupmakeDnPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupmemberAttributeKey = "group.memberAttribute";
	node = json_object_get_member(pJsonObject, groupmemberAttributeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&groupmemberAttribute, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&groupmemberAttribute);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *useUidForExtIdKey = "useUidForExtId";
	node = json_object_get_member(pJsonObject, useUidForExtIdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&useUidForExtId, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&useUidForExtId);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *customattributesKey = "customattributes";
	node = json_object_get_member(pJsonObject, customattributesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&customattributes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&customattributes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProvidername();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProvidername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providernameKey = "provider.name";
	json_object_set_member(pJsonObject, providernameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHostname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHostname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hostnameKey = "host.name";
	json_object_set_member(pJsonObject, hostnameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getHostport();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getHostport());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hostportKey = "host.port";
	json_object_set_member(pJsonObject, hostportKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHostssl();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHostssl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hostsslKey = "host.ssl";
	json_object_set_member(pJsonObject, hostsslKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHosttls();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHosttls());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hosttlsKey = "host.tls";
	json_object_set_member(pJsonObject, hosttlsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHostnoCertCheck();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHostnoCertCheck());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hostnoCertCheckKey = "host.noCertCheck";
	json_object_set_member(pJsonObject, hostnoCertCheckKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getBinddn();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getBinddn());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *binddnKey = "bind.dn";
	json_object_set_member(pJsonObject, binddnKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getBindpassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getBindpassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bindpasswordKey = "bind.password";
	json_object_set_member(pJsonObject, bindpasswordKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSearchTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSearchTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *searchTimeoutKey = "searchTimeout";
	json_object_set_member(pJsonObject, searchTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getAdminPoolmaxActive();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getAdminPoolmaxActive());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *adminPoolmaxActiveKey = "adminPool.maxActive";
	json_object_set_member(pJsonObject, adminPoolmaxActiveKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAdminPoollookupOnValidate();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAdminPoollookupOnValidate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *adminPoollookupOnValidateKey = "adminPool.lookupOnValidate";
	json_object_set_member(pJsonObject, adminPoollookupOnValidateKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getUserPoolmaxActive();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getUserPoolmaxActive());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userPoolmaxActiveKey = "userPool.maxActive";
	json_object_set_member(pJsonObject, userPoolmaxActiveKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getUserPoollookupOnValidate();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getUserPoollookupOnValidate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userPoollookupOnValidateKey = "userPool.lookupOnValidate";
	json_object_set_member(pJsonObject, userPoollookupOnValidateKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUserbaseDN();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUserbaseDN());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userbaseDNKey = "user.baseDN";
	json_object_set_member(pJsonObject, userbaseDNKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getUserobjectclass();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getUserobjectclass());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userobjectclassKey = "user.objectclass";
	json_object_set_member(pJsonObject, userobjectclassKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUseridAttribute();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUseridAttribute());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *useridAttributeKey = "user.idAttribute";
	json_object_set_member(pJsonObject, useridAttributeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUserextraFilter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUserextraFilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userextraFilterKey = "user.extraFilter";
	json_object_set_member(pJsonObject, userextraFilterKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getUsermakeDnPath();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getUsermakeDnPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usermakeDnPathKey = "user.makeDnPath";
	json_object_set_member(pJsonObject, usermakeDnPathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGroupbaseDN();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGroupbaseDN());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupbaseDNKey = "group.baseDN";
	json_object_set_member(pJsonObject, groupbaseDNKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getGroupobjectclass();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getGroupobjectclass());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupobjectclassKey = "group.objectclass";
	json_object_set_member(pJsonObject, groupobjectclassKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGroupnameAttribute();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGroupnameAttribute());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupnameAttributeKey = "group.nameAttribute";
	json_object_set_member(pJsonObject, groupnameAttributeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGroupextraFilter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGroupextraFilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupextraFilterKey = "group.extraFilter";
	json_object_set_member(pJsonObject, groupextraFilterKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGroupmakeDnPath();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGroupmakeDnPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupmakeDnPathKey = "group.makeDnPath";
	json_object_set_member(pJsonObject, groupmakeDnPathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGroupmemberAttribute();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGroupmemberAttribute());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupmemberAttributeKey = "group.memberAttribute";
	json_object_set_member(pJsonObject, groupmemberAttributeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getUseUidForExtId();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getUseUidForExtId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *useUidForExtIdKey = "useUidForExtId";
	json_object_set_member(pJsonObject, useUidForExtIdKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCustomattributes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCustomattributes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *customattributesKey = "customattributes";
	json_object_set_member(pJsonObject, customattributesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getProvidername()
{
	return providername;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setProvidername(ConfigNodePropertyString  providername)
{
	this->providername = providername;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getHostname()
{
	return hostname;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setHostname(ConfigNodePropertyString  hostname)
{
	this->hostname = hostname;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getHostport()
{
	return hostport;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setHostport(ConfigNodePropertyInteger  hostport)
{
	this->hostport = hostport;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getHostssl()
{
	return hostssl;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setHostssl(ConfigNodePropertyBoolean  hostssl)
{
	this->hostssl = hostssl;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getHosttls()
{
	return hosttls;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setHosttls(ConfigNodePropertyBoolean  hosttls)
{
	this->hosttls = hosttls;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getHostnoCertCheck()
{
	return hostnoCertCheck;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setHostnoCertCheck(ConfigNodePropertyBoolean  hostnoCertCheck)
{
	this->hostnoCertCheck = hostnoCertCheck;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getBinddn()
{
	return binddn;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setBinddn(ConfigNodePropertyString  binddn)
{
	this->binddn = binddn;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getBindpassword()
{
	return bindpassword;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setBindpassword(ConfigNodePropertyString  bindpassword)
{
	this->bindpassword = bindpassword;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getSearchTimeout()
{
	return searchTimeout;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setSearchTimeout(ConfigNodePropertyString  searchTimeout)
{
	this->searchTimeout = searchTimeout;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getAdminPoolmaxActive()
{
	return adminPoolmaxActive;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setAdminPoolmaxActive(ConfigNodePropertyInteger  adminPoolmaxActive)
{
	this->adminPoolmaxActive = adminPoolmaxActive;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getAdminPoollookupOnValidate()
{
	return adminPoollookupOnValidate;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setAdminPoollookupOnValidate(ConfigNodePropertyBoolean  adminPoollookupOnValidate)
{
	this->adminPoollookupOnValidate = adminPoollookupOnValidate;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUserPoolmaxActive()
{
	return userPoolmaxActive;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUserPoolmaxActive(ConfigNodePropertyInteger  userPoolmaxActive)
{
	this->userPoolmaxActive = userPoolmaxActive;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUserPoollookupOnValidate()
{
	return userPoollookupOnValidate;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUserPoollookupOnValidate(ConfigNodePropertyBoolean  userPoollookupOnValidate)
{
	this->userPoollookupOnValidate = userPoollookupOnValidate;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUserbaseDN()
{
	return userbaseDN;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUserbaseDN(ConfigNodePropertyString  userbaseDN)
{
	this->userbaseDN = userbaseDN;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUserobjectclass()
{
	return userobjectclass;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUserobjectclass(ConfigNodePropertyArray  userobjectclass)
{
	this->userobjectclass = userobjectclass;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUseridAttribute()
{
	return useridAttribute;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUseridAttribute(ConfigNodePropertyString  useridAttribute)
{
	this->useridAttribute = useridAttribute;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUserextraFilter()
{
	return userextraFilter;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUserextraFilter(ConfigNodePropertyString  userextraFilter)
{
	this->userextraFilter = userextraFilter;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUsermakeDnPath()
{
	return usermakeDnPath;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUsermakeDnPath(ConfigNodePropertyBoolean  usermakeDnPath)
{
	this->usermakeDnPath = usermakeDnPath;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getGroupbaseDN()
{
	return groupbaseDN;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setGroupbaseDN(ConfigNodePropertyString  groupbaseDN)
{
	this->groupbaseDN = groupbaseDN;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getGroupobjectclass()
{
	return groupobjectclass;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setGroupobjectclass(ConfigNodePropertyArray  groupobjectclass)
{
	this->groupobjectclass = groupobjectclass;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getGroupnameAttribute()
{
	return groupnameAttribute;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setGroupnameAttribute(ConfigNodePropertyString  groupnameAttribute)
{
	this->groupnameAttribute = groupnameAttribute;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getGroupextraFilter()
{
	return groupextraFilter;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setGroupextraFilter(ConfigNodePropertyString  groupextraFilter)
{
	this->groupextraFilter = groupextraFilter;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getGroupmakeDnPath()
{
	return groupmakeDnPath;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setGroupmakeDnPath(ConfigNodePropertyBoolean  groupmakeDnPath)
{
	this->groupmakeDnPath = groupmakeDnPath;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getGroupmemberAttribute()
{
	return groupmemberAttribute;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setGroupmemberAttribute(ConfigNodePropertyString  groupmemberAttribute)
{
	this->groupmemberAttribute = groupmemberAttribute;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUseUidForExtId()
{
	return useUidForExtId;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUseUidForExtId(ConfigNodePropertyBoolean  useUidForExtId)
{
	this->useUidForExtId = useUidForExtId;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getCustomattributes()
{
	return customattributes;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setCustomattributes(ConfigNodePropertyArray  customattributes)
{
	this->customattributes = customattributes;
}


