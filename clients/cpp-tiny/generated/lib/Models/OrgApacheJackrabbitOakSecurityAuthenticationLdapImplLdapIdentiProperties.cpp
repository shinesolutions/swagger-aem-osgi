

#include "OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties()
{
	providername = ConfigNodePropertyString();
	hostname = ConfigNodePropertyString();
	hostport = ConfigNodePropertyInteger();
	hostssl = ConfigNodePropertyBoolean();
	hosttls = ConfigNodePropertyBoolean();
	hostnoCertCheck = ConfigNodePropertyBoolean();
	binddn = ConfigNodePropertyString();
	bindpassword = ConfigNodePropertyString();
	searchTimeout = ConfigNodePropertyString();
	adminPoolmaxActive = ConfigNodePropertyInteger();
	adminPoollookupOnValidate = ConfigNodePropertyBoolean();
	userPoolmaxActive = ConfigNodePropertyInteger();
	userPoollookupOnValidate = ConfigNodePropertyBoolean();
	userbaseDN = ConfigNodePropertyString();
	userobjectclass = ConfigNodePropertyArray();
	useridAttribute = ConfigNodePropertyString();
	userextraFilter = ConfigNodePropertyString();
	usermakeDnPath = ConfigNodePropertyBoolean();
	groupbaseDN = ConfigNodePropertyString();
	groupobjectclass = ConfigNodePropertyArray();
	groupnameAttribute = ConfigNodePropertyString();
	groupextraFilter = ConfigNodePropertyString();
	groupmakeDnPath = ConfigNodePropertyBoolean();
	groupmemberAttribute = ConfigNodePropertyString();
	useUidForExtId = ConfigNodePropertyBoolean();
	customattributes = ConfigNodePropertyArray();
}

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::~OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties()
{

}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *providernameKey = "provider.name";

    if(object.has_key(providernameKey))
    {
        bourne::json value = object[providernameKey];




        ConfigNodePropertyString* obj = &providername;
		obj->fromJson(value.dump());

    }

    const char *hostnameKey = "host.name";

    if(object.has_key(hostnameKey))
    {
        bourne::json value = object[hostnameKey];




        ConfigNodePropertyString* obj = &hostname;
		obj->fromJson(value.dump());

    }

    const char *hostportKey = "host.port";

    if(object.has_key(hostportKey))
    {
        bourne::json value = object[hostportKey];




        ConfigNodePropertyInteger* obj = &hostport;
		obj->fromJson(value.dump());

    }

    const char *hostsslKey = "host.ssl";

    if(object.has_key(hostsslKey))
    {
        bourne::json value = object[hostsslKey];




        ConfigNodePropertyBoolean* obj = &hostssl;
		obj->fromJson(value.dump());

    }

    const char *hosttlsKey = "host.tls";

    if(object.has_key(hosttlsKey))
    {
        bourne::json value = object[hosttlsKey];




        ConfigNodePropertyBoolean* obj = &hosttls;
		obj->fromJson(value.dump());

    }

    const char *hostnoCertCheckKey = "host.noCertCheck";

    if(object.has_key(hostnoCertCheckKey))
    {
        bourne::json value = object[hostnoCertCheckKey];




        ConfigNodePropertyBoolean* obj = &hostnoCertCheck;
		obj->fromJson(value.dump());

    }

    const char *binddnKey = "bind.dn";

    if(object.has_key(binddnKey))
    {
        bourne::json value = object[binddnKey];




        ConfigNodePropertyString* obj = &binddn;
		obj->fromJson(value.dump());

    }

    const char *bindpasswordKey = "bind.password";

    if(object.has_key(bindpasswordKey))
    {
        bourne::json value = object[bindpasswordKey];




        ConfigNodePropertyString* obj = &bindpassword;
		obj->fromJson(value.dump());

    }

    const char *searchTimeoutKey = "searchTimeout";

    if(object.has_key(searchTimeoutKey))
    {
        bourne::json value = object[searchTimeoutKey];




        ConfigNodePropertyString* obj = &searchTimeout;
		obj->fromJson(value.dump());

    }

    const char *adminPoolmaxActiveKey = "adminPool.maxActive";

    if(object.has_key(adminPoolmaxActiveKey))
    {
        bourne::json value = object[adminPoolmaxActiveKey];




        ConfigNodePropertyInteger* obj = &adminPoolmaxActive;
		obj->fromJson(value.dump());

    }

    const char *adminPoollookupOnValidateKey = "adminPool.lookupOnValidate";

    if(object.has_key(adminPoollookupOnValidateKey))
    {
        bourne::json value = object[adminPoollookupOnValidateKey];




        ConfigNodePropertyBoolean* obj = &adminPoollookupOnValidate;
		obj->fromJson(value.dump());

    }

    const char *userPoolmaxActiveKey = "userPool.maxActive";

    if(object.has_key(userPoolmaxActiveKey))
    {
        bourne::json value = object[userPoolmaxActiveKey];




        ConfigNodePropertyInteger* obj = &userPoolmaxActive;
		obj->fromJson(value.dump());

    }

    const char *userPoollookupOnValidateKey = "userPool.lookupOnValidate";

    if(object.has_key(userPoollookupOnValidateKey))
    {
        bourne::json value = object[userPoollookupOnValidateKey];




        ConfigNodePropertyBoolean* obj = &userPoollookupOnValidate;
		obj->fromJson(value.dump());

    }

    const char *userbaseDNKey = "user.baseDN";

    if(object.has_key(userbaseDNKey))
    {
        bourne::json value = object[userbaseDNKey];




        ConfigNodePropertyString* obj = &userbaseDN;
		obj->fromJson(value.dump());

    }

    const char *userobjectclassKey = "user.objectclass";

    if(object.has_key(userobjectclassKey))
    {
        bourne::json value = object[userobjectclassKey];




        ConfigNodePropertyArray* obj = &userobjectclass;
		obj->fromJson(value.dump());

    }

    const char *useridAttributeKey = "user.idAttribute";

    if(object.has_key(useridAttributeKey))
    {
        bourne::json value = object[useridAttributeKey];




        ConfigNodePropertyString* obj = &useridAttribute;
		obj->fromJson(value.dump());

    }

    const char *userextraFilterKey = "user.extraFilter";

    if(object.has_key(userextraFilterKey))
    {
        bourne::json value = object[userextraFilterKey];




        ConfigNodePropertyString* obj = &userextraFilter;
		obj->fromJson(value.dump());

    }

    const char *usermakeDnPathKey = "user.makeDnPath";

    if(object.has_key(usermakeDnPathKey))
    {
        bourne::json value = object[usermakeDnPathKey];




        ConfigNodePropertyBoolean* obj = &usermakeDnPath;
		obj->fromJson(value.dump());

    }

    const char *groupbaseDNKey = "group.baseDN";

    if(object.has_key(groupbaseDNKey))
    {
        bourne::json value = object[groupbaseDNKey];




        ConfigNodePropertyString* obj = &groupbaseDN;
		obj->fromJson(value.dump());

    }

    const char *groupobjectclassKey = "group.objectclass";

    if(object.has_key(groupobjectclassKey))
    {
        bourne::json value = object[groupobjectclassKey];




        ConfigNodePropertyArray* obj = &groupobjectclass;
		obj->fromJson(value.dump());

    }

    const char *groupnameAttributeKey = "group.nameAttribute";

    if(object.has_key(groupnameAttributeKey))
    {
        bourne::json value = object[groupnameAttributeKey];




        ConfigNodePropertyString* obj = &groupnameAttribute;
		obj->fromJson(value.dump());

    }

    const char *groupextraFilterKey = "group.extraFilter";

    if(object.has_key(groupextraFilterKey))
    {
        bourne::json value = object[groupextraFilterKey];




        ConfigNodePropertyString* obj = &groupextraFilter;
		obj->fromJson(value.dump());

    }

    const char *groupmakeDnPathKey = "group.makeDnPath";

    if(object.has_key(groupmakeDnPathKey))
    {
        bourne::json value = object[groupmakeDnPathKey];




        ConfigNodePropertyBoolean* obj = &groupmakeDnPath;
		obj->fromJson(value.dump());

    }

    const char *groupmemberAttributeKey = "group.memberAttribute";

    if(object.has_key(groupmemberAttributeKey))
    {
        bourne::json value = object[groupmemberAttributeKey];




        ConfigNodePropertyString* obj = &groupmemberAttribute;
		obj->fromJson(value.dump());

    }

    const char *useUidForExtIdKey = "useUidForExtId";

    if(object.has_key(useUidForExtIdKey))
    {
        bourne::json value = object[useUidForExtIdKey];




        ConfigNodePropertyBoolean* obj = &useUidForExtId;
		obj->fromJson(value.dump());

    }

    const char *customattributesKey = "customattributes";

    if(object.has_key(customattributesKey))
    {
        bourne::json value = object[customattributesKey];




        ConfigNodePropertyArray* obj = &customattributes;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["providername"] = getProvidername().toJson();






	object["hostname"] = getHostname().toJson();






	object["hostport"] = getHostport().toJson();






	object["hostssl"] = getHostssl().toJson();






	object["hosttls"] = getHosttls().toJson();






	object["hostnoCertCheck"] = getHostnoCertCheck().toJson();






	object["binddn"] = getBinddn().toJson();






	object["bindpassword"] = getBindpassword().toJson();






	object["searchTimeout"] = getSearchTimeout().toJson();






	object["adminPoolmaxActive"] = getAdminPoolmaxActive().toJson();






	object["adminPoollookupOnValidate"] = getAdminPoollookupOnValidate().toJson();






	object["userPoolmaxActive"] = getUserPoolmaxActive().toJson();






	object["userPoollookupOnValidate"] = getUserPoollookupOnValidate().toJson();






	object["userbaseDN"] = getUserbaseDN().toJson();






	object["userobjectclass"] = getUserobjectclass().toJson();






	object["useridAttribute"] = getUseridAttribute().toJson();






	object["userextraFilter"] = getUserextraFilter().toJson();






	object["usermakeDnPath"] = getUsermakeDnPath().toJson();






	object["groupbaseDN"] = getGroupbaseDN().toJson();






	object["groupobjectclass"] = getGroupobjectclass().toJson();






	object["groupnameAttribute"] = getGroupnameAttribute().toJson();






	object["groupextraFilter"] = getGroupextraFilter().toJson();






	object["groupmakeDnPath"] = getGroupmakeDnPath().toJson();






	object["groupmemberAttribute"] = getGroupmemberAttribute().toJson();






	object["useUidForExtId"] = getUseUidForExtId().toJson();






	object["customattributes"] = getCustomattributes().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getProvidername()
{
	return providername;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setProvidername(ConfigNodePropertyString providername)
{
	this->providername = providername;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getHostname()
{
	return hostname;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setHostname(ConfigNodePropertyString hostname)
{
	this->hostname = hostname;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getHostport()
{
	return hostport;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setHostport(ConfigNodePropertyInteger hostport)
{
	this->hostport = hostport;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getHostssl()
{
	return hostssl;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setHostssl(ConfigNodePropertyBoolean hostssl)
{
	this->hostssl = hostssl;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getHosttls()
{
	return hosttls;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setHosttls(ConfigNodePropertyBoolean hosttls)
{
	this->hosttls = hosttls;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getHostnoCertCheck()
{
	return hostnoCertCheck;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setHostnoCertCheck(ConfigNodePropertyBoolean hostnoCertCheck)
{
	this->hostnoCertCheck = hostnoCertCheck;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getBinddn()
{
	return binddn;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setBinddn(ConfigNodePropertyString binddn)
{
	this->binddn = binddn;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getBindpassword()
{
	return bindpassword;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setBindpassword(ConfigNodePropertyString bindpassword)
{
	this->bindpassword = bindpassword;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getSearchTimeout()
{
	return searchTimeout;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setSearchTimeout(ConfigNodePropertyString searchTimeout)
{
	this->searchTimeout = searchTimeout;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getAdminPoolmaxActive()
{
	return adminPoolmaxActive;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setAdminPoolmaxActive(ConfigNodePropertyInteger adminPoolmaxActive)
{
	this->adminPoolmaxActive = adminPoolmaxActive;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getAdminPoollookupOnValidate()
{
	return adminPoollookupOnValidate;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setAdminPoollookupOnValidate(ConfigNodePropertyBoolean adminPoollookupOnValidate)
{
	this->adminPoollookupOnValidate = adminPoollookupOnValidate;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUserPoolmaxActive()
{
	return userPoolmaxActive;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUserPoolmaxActive(ConfigNodePropertyInteger userPoolmaxActive)
{
	this->userPoolmaxActive = userPoolmaxActive;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUserPoollookupOnValidate()
{
	return userPoollookupOnValidate;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUserPoollookupOnValidate(ConfigNodePropertyBoolean userPoollookupOnValidate)
{
	this->userPoollookupOnValidate = userPoollookupOnValidate;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUserbaseDN()
{
	return userbaseDN;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUserbaseDN(ConfigNodePropertyString userbaseDN)
{
	this->userbaseDN = userbaseDN;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUserobjectclass()
{
	return userobjectclass;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUserobjectclass(ConfigNodePropertyArray userobjectclass)
{
	this->userobjectclass = userobjectclass;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUseridAttribute()
{
	return useridAttribute;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUseridAttribute(ConfigNodePropertyString useridAttribute)
{
	this->useridAttribute = useridAttribute;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUserextraFilter()
{
	return userextraFilter;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUserextraFilter(ConfigNodePropertyString userextraFilter)
{
	this->userextraFilter = userextraFilter;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUsermakeDnPath()
{
	return usermakeDnPath;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUsermakeDnPath(ConfigNodePropertyBoolean usermakeDnPath)
{
	this->usermakeDnPath = usermakeDnPath;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getGroupbaseDN()
{
	return groupbaseDN;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setGroupbaseDN(ConfigNodePropertyString groupbaseDN)
{
	this->groupbaseDN = groupbaseDN;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getGroupobjectclass()
{
	return groupobjectclass;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setGroupobjectclass(ConfigNodePropertyArray groupobjectclass)
{
	this->groupobjectclass = groupobjectclass;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getGroupnameAttribute()
{
	return groupnameAttribute;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setGroupnameAttribute(ConfigNodePropertyString groupnameAttribute)
{
	this->groupnameAttribute = groupnameAttribute;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getGroupextraFilter()
{
	return groupextraFilter;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setGroupextraFilter(ConfigNodePropertyString groupextraFilter)
{
	this->groupextraFilter = groupextraFilter;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getGroupmakeDnPath()
{
	return groupmakeDnPath;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setGroupmakeDnPath(ConfigNodePropertyBoolean groupmakeDnPath)
{
	this->groupmakeDnPath = groupmakeDnPath;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getGroupmemberAttribute()
{
	return groupmemberAttribute;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setGroupmemberAttribute(ConfigNodePropertyString groupmemberAttribute)
{
	this->groupmemberAttribute = groupmemberAttribute;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getUseUidForExtId()
{
	return useUidForExtId;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setUseUidForExtId(ConfigNodePropertyBoolean useUidForExtId)
{
	this->useUidForExtId = useUidForExtId;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::getCustomattributes()
{
	return customattributes;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties::setCustomattributes(ConfigNodePropertyArray customattributes)
{
	this->customattributes = customattributes;
}



