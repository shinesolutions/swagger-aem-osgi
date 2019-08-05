/*
 * ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties_H_
#define _ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties_H_


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

class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties();
	ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSize();

	/*! \brief Set 
	 */
	void setSize(ConfigNodePropertyInteger  size);

private:
	ConfigNodePropertyInteger size;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties_H_ */
