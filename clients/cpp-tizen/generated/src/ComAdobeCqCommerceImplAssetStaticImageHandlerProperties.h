/*
 * ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqCommerceImplAssetStaticImageHandlerProperties_H_
#define _ComAdobeCqCommerceImplAssetStaticImageHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqCommerceImplAssetStaticImageHandlerProperties();
	ComAdobeCqCommerceImplAssetStaticImageHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqCommerceImplAssetStaticImageHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqcommerceassethandleractive();

	/*! \brief Set 
	 */
	void setCqcommerceassethandleractive(ConfigNodePropertyBoolean  cqcommerceassethandleractive);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcommerceassethandlername();

	/*! \brief Set 
	 */
	void setCqcommerceassethandlername(ConfigNodePropertyString  cqcommerceassethandlername);

private:
	ConfigNodePropertyBoolean cqcommerceassethandleractive;
	ConfigNodePropertyString cqcommerceassethandlername;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqCommerceImplAssetStaticImageHandlerProperties_H_ */
