/*
 * ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties_H_
#define _ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties_H_


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

class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties();
	ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmqrcodeservletwhitelist();

	/*! \brief Set 
	 */
	void setCqwcmqrcodeservletwhitelist(ConfigNodePropertyArray  cqwcmqrcodeservletwhitelist);

private:
	ConfigNodePropertyArray cqwcmqrcodeservletwhitelist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties_H_ */
