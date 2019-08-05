/*
 * ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties_H_
#define _ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties_H_


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

class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties();
	ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties();

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
	ConfigNodePropertyInteger getTtl1();

	/*! \brief Set 
	 */
	void setTtl1(ConfigNodePropertyInteger  ttl1);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTtl2();

	/*! \brief Set 
	 */
	void setTtl2(ConfigNodePropertyInteger  ttl2);

private:
	ConfigNodePropertyBoolean enable;
	ConfigNodePropertyInteger ttl1;
	ConfigNodePropertyInteger ttl2;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties_H_ */
