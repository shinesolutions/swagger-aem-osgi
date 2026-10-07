/*
 * ComAdobeCqSocialScoringImplScoringEventListenerProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialScoringImplScoringEventListenerProperties_H_
#define _ComAdobeCqSocialScoringImplScoringEventListenerProperties_H_


#include <string>
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

class ComAdobeCqSocialScoringImplScoringEventListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialScoringImplScoringEventListenerProperties();
	ComAdobeCqSocialScoringImplScoringEventListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialScoringImplScoringEventListenerProperties();

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

private:
	ConfigNodePropertyString eventtopics;
	ConfigNodePropertyString eventfilter;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialScoringImplScoringEventListenerProperties_H_ */
