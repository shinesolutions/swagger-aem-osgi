
/*
 * ComAdobeCqSocialSyncImplDiffChangesObserverProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplDiffChangesObserverProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplDiffChangesObserverProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialSyncImplDiffChangesObserverProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialSyncImplDiffChangesObserverProperties();
    ComAdobeCqSocialSyncImplDiffChangesObserverProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialSyncImplDiffChangesObserverProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAgentName();

	/*! \brief Set 
	 */
	void setAgentName(ConfigNodePropertyString agentName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDiffPath();

	/*! \brief Set 
	 */
	void setDiffPath(ConfigNodePropertyString diffPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPropertyNames();

	/*! \brief Set 
	 */
	void setPropertyNames(ConfigNodePropertyString propertyNames);


    private:
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyString agentName;
    ConfigNodePropertyString diffPath;
    ConfigNodePropertyString propertyNames;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplDiffChangesObserverProperties_H_ */
