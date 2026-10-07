
/*
 * ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialUserImplTransportHttpToPublisherProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialUserImplTransportHttpToPublisherProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialUserImplTransportHttpToPublisherProperties();
    ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialUserImplTransportHttpToPublisherProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnable();

	/*! \brief Set 
	 */
	void setEnable(ConfigNodePropertyBoolean enable);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAgentconfiguration();

	/*! \brief Set 
	 */
	void setAgentconfiguration(ConfigNodePropertyArray agentconfiguration);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getContextpath();

	/*! \brief Set 
	 */
	void setContextpath(ConfigNodePropertyString contextpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDisabledciphersuites();

	/*! \brief Set 
	 */
	void setDisabledciphersuites(ConfigNodePropertyArray disabledciphersuites);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getEnabledciphersuites();

	/*! \brief Set 
	 */
	void setEnabledciphersuites(ConfigNodePropertyArray enabledciphersuites);


    private:
    ConfigNodePropertyBoolean enable;
    ConfigNodePropertyArray agentconfiguration;
    ConfigNodePropertyString contextpath;
    ConfigNodePropertyArray disabledciphersuites;
    ConfigNodePropertyArray enabledciphersuites;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialUserImplTransportHttpToPublisherProperties_H_ */
