/*
 * ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialUserImplTransportHttpToPublisherProperties_H_
#define _ComAdobeCqSocialUserImplTransportHttpToPublisherProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialUserImplTransportHttpToPublisherProperties();
	ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialUserImplTransportHttpToPublisherProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnable();

	/*! \brief Set 
	 */
	void setEnable(ConfigNodePropertyBoolean  enable);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAgentconfiguration();

	/*! \brief Set 
	 */
	void setAgentconfiguration(ConfigNodePropertyArray  agentconfiguration);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getContextpath();

	/*! \brief Set 
	 */
	void setContextpath(ConfigNodePropertyString  contextpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDisabledciphersuites();

	/*! \brief Set 
	 */
	void setDisabledciphersuites(ConfigNodePropertyArray  disabledciphersuites);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getEnabledciphersuites();

	/*! \brief Set 
	 */
	void setEnabledciphersuites(ConfigNodePropertyArray  enabledciphersuites);

private:
	ConfigNodePropertyBoolean enable;
	ConfigNodePropertyArray agentconfiguration;
	ConfigNodePropertyString contextpath;
	ConfigNodePropertyArray disabledciphersuites;
	ConfigNodePropertyArray enabledciphersuites;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialUserImplTransportHttpToPublisherProperties_H_ */
