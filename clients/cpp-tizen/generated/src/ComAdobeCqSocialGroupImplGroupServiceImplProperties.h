/*
 * ComAdobeCqSocialGroupImplGroupServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialGroupImplGroupServiceImplProperties_H_
#define _ComAdobeCqSocialGroupImplGroupServiceImplProperties_H_


#include <string>
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

class ComAdobeCqSocialGroupImplGroupServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialGroupImplGroupServiceImplProperties();
	ComAdobeCqSocialGroupImplGroupServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialGroupImplGroupServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxWaitTime();

	/*! \brief Set 
	 */
	void setMaxWaitTime(ConfigNodePropertyInteger  maxWaitTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinWaitBetweenRetries();

	/*! \brief Set 
	 */
	void setMinWaitBetweenRetries(ConfigNodePropertyInteger  minWaitBetweenRetries);

private:
	ConfigNodePropertyInteger maxWaitTime;
	ConfigNodePropertyInteger minWaitBetweenRetries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialGroupImplGroupServiceImplProperties_H_ */
