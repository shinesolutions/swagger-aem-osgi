/*
 * ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties_H_
#define _ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties();
	ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqsocialcontentfragmentsservicesenabled();

	/*! \brief Set 
	 */
	void setCqsocialcontentfragmentsservicesenabled(ConfigNodePropertyBoolean  cqsocialcontentfragmentsservicesenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqsocialcontentfragmentsserviceswaitTimeSeconds();

	/*! \brief Set 
	 */
	void setCqsocialcontentfragmentsserviceswaitTimeSeconds(ConfigNodePropertyInteger  cqsocialcontentfragmentsserviceswaitTimeSeconds);

private:
	ConfigNodePropertyBoolean cqsocialcontentfragmentsservicesenabled;
	ConfigNodePropertyInteger cqsocialcontentfragmentsserviceswaitTimeSeconds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties_H_ */
