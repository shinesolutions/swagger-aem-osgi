/*
 * ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties_H_
#define _ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties_H_


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

class ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties();
	ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcommercepromotionroot();

	/*! \brief Set 
	 */
	void setCqcommercepromotionroot(ConfigNodePropertyString  cqcommercepromotionroot);

private:
	ConfigNodePropertyString cqcommercepromotionroot;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties_H_ */
