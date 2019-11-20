/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.h"

#include <string>
#include <sstream>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties()
{
    
}

ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::~ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties()
{
}

std::string ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::shared_ptr<ConfigNodePropertyString> ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getOauthProviderId() const
{
    return m_Oauth_provider_id;
}
void ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setOauthProviderId(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Oauth_provider_id = value;
}
std::shared_ptr<ConfigNodePropertyString> ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getOauthCloudConfigRoot() const
{
    return m_Oauth_cloud_config_root;
}
void ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setOauthCloudConfigRoot(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Oauth_cloud_config_root = value;
}
std::shared_ptr<ConfigNodePropertyString> ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderConfigRoot() const
{
    return m_Provider_config_root;
}
void ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderConfigRoot(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Provider_config_root = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderConfigCreateTagsEnabled() const
{
    return m_Provider_config_create_tags_enabled;
}
void ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderConfigCreateTagsEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Provider_config_create_tags_enabled = value;
}
std::shared_ptr<ConfigNodePropertyDropDown> ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderConfigUserFolder() const
{
    return m_Provider_config_user_folder;
}
void ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderConfigUserFolder(std::shared_ptr<ConfigNodePropertyDropDown> value)
{
    m_Provider_config_user_folder = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderConfigFacebookFetchFields() const
{
    return m_Provider_config_facebook_fetch_fields;
}
void ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderConfigFacebookFetchFields(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Provider_config_facebook_fetch_fields = value;
}
std::shared_ptr<ConfigNodePropertyArray> ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderConfigFacebookFields() const
{
    return m_Provider_config_facebook_fields;
}
void ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderConfigFacebookFields(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Provider_config_facebook_fields = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderConfigRefreshUserdataEnabled() const
{
    return m_Provider_config_refresh_userdata_enabled;
}
void ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderConfigRefreshUserdataEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Provider_config_refresh_userdata_enabled = value;
}

}
}
}
}
