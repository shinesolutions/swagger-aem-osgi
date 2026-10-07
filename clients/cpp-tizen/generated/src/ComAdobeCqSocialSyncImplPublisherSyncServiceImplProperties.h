/*
 * ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties_H_
#define _ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties();
	ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getActiveRunModes();

	/*! \brief Set 
	 */
	void setActiveRunModes(ConfigNodePropertyArray  activeRunModes);

private:
	ConfigNodePropertyArray activeRunModes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties_H_ */
