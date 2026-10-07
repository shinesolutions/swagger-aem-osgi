/*
 * ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties_H_
#define _ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties();
	ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIsMemberCheck();

	/*! \brief Set 
	 */
	void setIsMemberCheck(ConfigNodePropertyBoolean  isMemberCheck);

private:
	ConfigNodePropertyBoolean isMemberCheck;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties_H_ */
