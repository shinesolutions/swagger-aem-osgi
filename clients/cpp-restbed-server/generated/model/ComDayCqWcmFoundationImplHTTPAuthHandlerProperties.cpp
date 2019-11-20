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



#include "ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.h"

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

ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::ComDayCqWcmFoundationImplHTTPAuthHandlerProperties()
{
    
}

ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::~ComDayCqWcmFoundationImplHTTPAuthHandlerProperties()
{
}

std::string ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::shared_ptr<ConfigNodePropertyString> ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getPath() const
{
    return m_Path;
}
void ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setPath(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Path = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthHttpNologin() const
{
    return m_Auth_http_nologin;
}
void ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthHttpNologin(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Auth_http_nologin = value;
}
std::shared_ptr<ConfigNodePropertyString> ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthHttpRealm() const
{
    return m_Auth_http_realm;
}
void ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthHttpRealm(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Auth_http_realm = value;
}
std::shared_ptr<ConfigNodePropertyString> ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthDefaultLoginpage() const
{
    return m_Auth_default_loginpage;
}
void ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthDefaultLoginpage(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Auth_default_loginpage = value;
}
std::shared_ptr<ConfigNodePropertyArray> ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthCredForm() const
{
    return m_Auth_cred_form;
}
void ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthCredForm(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Auth_cred_form = value;
}
std::shared_ptr<ConfigNodePropertyArray> ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthCredUtf8() const
{
    return m_Auth_cred_utf8;
}
void ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthCredUtf8(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Auth_cred_utf8 = value;
}

}
}
}
}
