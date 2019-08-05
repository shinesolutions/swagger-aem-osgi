/*
 * ComAdobeCqSocialSyncImplDiffChangesObserverProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialSyncImplDiffChangesObserverProperties_H_
#define _ComAdobeCqSocialSyncImplDiffChangesObserverProperties_H_


#include <string>
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

class ComAdobeCqSocialSyncImplDiffChangesObserverProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialSyncImplDiffChangesObserverProperties();
	ComAdobeCqSocialSyncImplDiffChangesObserverProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialSyncImplDiffChangesObserverProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAgentName();

	/*! \brief Set 
	 */
	void setAgentName(ConfigNodePropertyString  agentName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDiffPath();

	/*! \brief Set 
	 */
	void setDiffPath(ConfigNodePropertyString  diffPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPropertyNames();

	/*! \brief Set 
	 */
	void setPropertyNames(ConfigNodePropertyString  propertyNames);

private:
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyString agentName;
	ConfigNodePropertyString diffPath;
	ConfigNodePropertyString propertyNames;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialSyncImplDiffChangesObserverProperties_H_ */
