/*
 * ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties_H_
#define _ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties_H_


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

class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties();
	ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCorsenabling();

	/*! \brief Set 
	 */
	void setCorsenabling(ConfigNodePropertyBoolean  corsenabling);

private:
	ConfigNodePropertyBoolean corsenabling;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties_H_ */
