/**
* Adobe Experience Manager OSGI config (AEM) API
* Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
*
* OpenAPI spec version: 1.0.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "ComAdobeCqScreensDeviceImplDeviceServiceProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeCqScreensDeviceImplDeviceServiceProperties::ComAdobeCqScreensDeviceImplDeviceServiceProperties()
{
    m_Com_adobe_aem_screens_player_pingfrequencyIsSet = false;
    m_Com_adobe_aem_screens_device_pasword_specialcharsIsSet = false;
    m_Com_adobe_aem_screens_device_pasword_minlowercasecharsIsSet = false;
    m_Com_adobe_aem_screens_device_pasword_minuppercasecharsIsSet = false;
    m_Com_adobe_aem_screens_device_pasword_minnumbercharsIsSet = false;
    m_Com_adobe_aem_screens_device_pasword_minspecialcharsIsSet = false;
    m_Com_adobe_aem_screens_device_pasword_minlengthIsSet = false;
    
}

ComAdobeCqScreensDeviceImplDeviceServiceProperties::~ComAdobeCqScreensDeviceImplDeviceServiceProperties()
{
}

void ComAdobeCqScreensDeviceImplDeviceServiceProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComAdobeCqScreensDeviceImplDeviceServiceProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Com_adobe_aem_screens_player_pingfrequencyIsSet)
    {
        val["com.adobe.aem.screens.player.pingfrequency"] = ModelBase::toJson(m_Com_adobe_aem_screens_player_pingfrequency);
    }
    if(m_Com_adobe_aem_screens_device_pasword_specialcharsIsSet)
    {
        val["com.adobe.aem.screens.device.pasword.specialchars"] = ModelBase::toJson(m_Com_adobe_aem_screens_device_pasword_specialchars);
    }
    if(m_Com_adobe_aem_screens_device_pasword_minlowercasecharsIsSet)
    {
        val["com.adobe.aem.screens.device.pasword.minlowercasechars"] = ModelBase::toJson(m_Com_adobe_aem_screens_device_pasword_minlowercasechars);
    }
    if(m_Com_adobe_aem_screens_device_pasword_minuppercasecharsIsSet)
    {
        val["com.adobe.aem.screens.device.pasword.minuppercasechars"] = ModelBase::toJson(m_Com_adobe_aem_screens_device_pasword_minuppercasechars);
    }
    if(m_Com_adobe_aem_screens_device_pasword_minnumbercharsIsSet)
    {
        val["com.adobe.aem.screens.device.pasword.minnumberchars"] = ModelBase::toJson(m_Com_adobe_aem_screens_device_pasword_minnumberchars);
    }
    if(m_Com_adobe_aem_screens_device_pasword_minspecialcharsIsSet)
    {
        val["com.adobe.aem.screens.device.pasword.minspecialchars"] = ModelBase::toJson(m_Com_adobe_aem_screens_device_pasword_minspecialchars);
    }
    if(m_Com_adobe_aem_screens_device_pasword_minlengthIsSet)
    {
        val["com.adobe.aem.screens.device.pasword.minlength"] = ModelBase::toJson(m_Com_adobe_aem_screens_device_pasword_minlength);
    }
    

    return val;
}

void ComAdobeCqScreensDeviceImplDeviceServiceProperties::fromJson(nlohmann::json& val)
{
    if(val.find("com.adobe.aem.screens.player.pingfrequency") != val.end())
    {
        if(!val["com.adobe.aem.screens.player.pingfrequency"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["com.adobe.aem.screens.player.pingfrequency"]);
            setComAdobeAemScreensPlayerPingfrequency( newItem );
        }
        
    }
    if(val.find("com.adobe.aem.screens.device.pasword.specialchars") != val.end())
    {
        if(!val["com.adobe.aem.screens.device.pasword.specialchars"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["com.adobe.aem.screens.device.pasword.specialchars"]);
            setComAdobeAemScreensDevicePaswordSpecialchars( newItem );
        }
        
    }
    if(val.find("com.adobe.aem.screens.device.pasword.minlowercasechars") != val.end())
    {
        if(!val["com.adobe.aem.screens.device.pasword.minlowercasechars"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["com.adobe.aem.screens.device.pasword.minlowercasechars"]);
            setComAdobeAemScreensDevicePaswordMinlowercasechars( newItem );
        }
        
    }
    if(val.find("com.adobe.aem.screens.device.pasword.minuppercasechars") != val.end())
    {
        if(!val["com.adobe.aem.screens.device.pasword.minuppercasechars"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["com.adobe.aem.screens.device.pasword.minuppercasechars"]);
            setComAdobeAemScreensDevicePaswordMinuppercasechars( newItem );
        }
        
    }
    if(val.find("com.adobe.aem.screens.device.pasword.minnumberchars") != val.end())
    {
        if(!val["com.adobe.aem.screens.device.pasword.minnumberchars"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["com.adobe.aem.screens.device.pasword.minnumberchars"]);
            setComAdobeAemScreensDevicePaswordMinnumberchars( newItem );
        }
        
    }
    if(val.find("com.adobe.aem.screens.device.pasword.minspecialchars") != val.end())
    {
        if(!val["com.adobe.aem.screens.device.pasword.minspecialchars"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["com.adobe.aem.screens.device.pasword.minspecialchars"]);
            setComAdobeAemScreensDevicePaswordMinspecialchars( newItem );
        }
        
    }
    if(val.find("com.adobe.aem.screens.device.pasword.minlength") != val.end())
    {
        if(!val["com.adobe.aem.screens.device.pasword.minlength"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["com.adobe.aem.screens.device.pasword.minlength"]);
            setComAdobeAemScreensDevicePaswordMinlength( newItem );
        }
        
    }
    
}


ConfigNodePropertyInteger ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComAdobeAemScreensPlayerPingfrequency() const
{
    return m_Com_adobe_aem_screens_player_pingfrequency;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComAdobeAemScreensPlayerPingfrequency(ConfigNodePropertyInteger const& value)
{
    m_Com_adobe_aem_screens_player_pingfrequency = value;
    m_Com_adobe_aem_screens_player_pingfrequencyIsSet = true;
}
bool ComAdobeCqScreensDeviceImplDeviceServiceProperties::comAdobeAemScreensPlayerPingfrequencyIsSet() const
{
    return m_Com_adobe_aem_screens_player_pingfrequencyIsSet;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::unsetCom_adobe_aem_screens_player_pingfrequency()
{
    m_Com_adobe_aem_screens_player_pingfrequencyIsSet = false;
}
ConfigNodePropertyString ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComAdobeAemScreensDevicePaswordSpecialchars() const
{
    return m_Com_adobe_aem_screens_device_pasword_specialchars;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComAdobeAemScreensDevicePaswordSpecialchars(ConfigNodePropertyString const& value)
{
    m_Com_adobe_aem_screens_device_pasword_specialchars = value;
    m_Com_adobe_aem_screens_device_pasword_specialcharsIsSet = true;
}
bool ComAdobeCqScreensDeviceImplDeviceServiceProperties::comAdobeAemScreensDevicePaswordSpecialcharsIsSet() const
{
    return m_Com_adobe_aem_screens_device_pasword_specialcharsIsSet;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::unsetCom_adobe_aem_screens_device_pasword_specialchars()
{
    m_Com_adobe_aem_screens_device_pasword_specialcharsIsSet = false;
}
ConfigNodePropertyInteger ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComAdobeAemScreensDevicePaswordMinlowercasechars() const
{
    return m_Com_adobe_aem_screens_device_pasword_minlowercasechars;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComAdobeAemScreensDevicePaswordMinlowercasechars(ConfigNodePropertyInteger const& value)
{
    m_Com_adobe_aem_screens_device_pasword_minlowercasechars = value;
    m_Com_adobe_aem_screens_device_pasword_minlowercasecharsIsSet = true;
}
bool ComAdobeCqScreensDeviceImplDeviceServiceProperties::comAdobeAemScreensDevicePaswordMinlowercasecharsIsSet() const
{
    return m_Com_adobe_aem_screens_device_pasword_minlowercasecharsIsSet;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::unsetCom_adobe_aem_screens_device_pasword_minlowercasechars()
{
    m_Com_adobe_aem_screens_device_pasword_minlowercasecharsIsSet = false;
}
ConfigNodePropertyInteger ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComAdobeAemScreensDevicePaswordMinuppercasechars() const
{
    return m_Com_adobe_aem_screens_device_pasword_minuppercasechars;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComAdobeAemScreensDevicePaswordMinuppercasechars(ConfigNodePropertyInteger const& value)
{
    m_Com_adobe_aem_screens_device_pasword_minuppercasechars = value;
    m_Com_adobe_aem_screens_device_pasword_minuppercasecharsIsSet = true;
}
bool ComAdobeCqScreensDeviceImplDeviceServiceProperties::comAdobeAemScreensDevicePaswordMinuppercasecharsIsSet() const
{
    return m_Com_adobe_aem_screens_device_pasword_minuppercasecharsIsSet;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::unsetCom_adobe_aem_screens_device_pasword_minuppercasechars()
{
    m_Com_adobe_aem_screens_device_pasword_minuppercasecharsIsSet = false;
}
ConfigNodePropertyInteger ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComAdobeAemScreensDevicePaswordMinnumberchars() const
{
    return m_Com_adobe_aem_screens_device_pasword_minnumberchars;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComAdobeAemScreensDevicePaswordMinnumberchars(ConfigNodePropertyInteger const& value)
{
    m_Com_adobe_aem_screens_device_pasword_minnumberchars = value;
    m_Com_adobe_aem_screens_device_pasword_minnumbercharsIsSet = true;
}
bool ComAdobeCqScreensDeviceImplDeviceServiceProperties::comAdobeAemScreensDevicePaswordMinnumbercharsIsSet() const
{
    return m_Com_adobe_aem_screens_device_pasword_minnumbercharsIsSet;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::unsetCom_adobe_aem_screens_device_pasword_minnumberchars()
{
    m_Com_adobe_aem_screens_device_pasword_minnumbercharsIsSet = false;
}
ConfigNodePropertyInteger ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComAdobeAemScreensDevicePaswordMinspecialchars() const
{
    return m_Com_adobe_aem_screens_device_pasword_minspecialchars;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComAdobeAemScreensDevicePaswordMinspecialchars(ConfigNodePropertyInteger const& value)
{
    m_Com_adobe_aem_screens_device_pasword_minspecialchars = value;
    m_Com_adobe_aem_screens_device_pasword_minspecialcharsIsSet = true;
}
bool ComAdobeCqScreensDeviceImplDeviceServiceProperties::comAdobeAemScreensDevicePaswordMinspecialcharsIsSet() const
{
    return m_Com_adobe_aem_screens_device_pasword_minspecialcharsIsSet;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::unsetCom_adobe_aem_screens_device_pasword_minspecialchars()
{
    m_Com_adobe_aem_screens_device_pasword_minspecialcharsIsSet = false;
}
ConfigNodePropertyInteger ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComAdobeAemScreensDevicePaswordMinlength() const
{
    return m_Com_adobe_aem_screens_device_pasword_minlength;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComAdobeAemScreensDevicePaswordMinlength(ConfigNodePropertyInteger const& value)
{
    m_Com_adobe_aem_screens_device_pasword_minlength = value;
    m_Com_adobe_aem_screens_device_pasword_minlengthIsSet = true;
}
bool ComAdobeCqScreensDeviceImplDeviceServiceProperties::comAdobeAemScreensDevicePaswordMinlengthIsSet() const
{
    return m_Com_adobe_aem_screens_device_pasword_minlengthIsSet;
}
void ComAdobeCqScreensDeviceImplDeviceServiceProperties::unsetCom_adobe_aem_screens_device_pasword_minlength()
{
    m_Com_adobe_aem_screens_device_pasword_minlengthIsSet = false;
}

}
}
}
}
