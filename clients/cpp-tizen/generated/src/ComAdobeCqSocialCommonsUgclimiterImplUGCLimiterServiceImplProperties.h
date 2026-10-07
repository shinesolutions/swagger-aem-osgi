/*
 * ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties_H_
#define _ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties();
	ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventtopics();

	/*! \brief Set 
	 */
	void setEventtopics(ConfigNodePropertyString  eventtopics);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString  eventfilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getVerbs();

	/*! \brief Set 
	 */
	void setVerbs(ConfigNodePropertyArray  verbs);

private:
	ConfigNodePropertyString eventtopics;
	ConfigNodePropertyString eventfilter;
	ConfigNodePropertyArray verbs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties_H_ */
