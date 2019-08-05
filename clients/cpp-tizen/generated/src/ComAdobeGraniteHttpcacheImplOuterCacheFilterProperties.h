/*
 * ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties_H_
#define _ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties_H_


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

class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties();
	ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComadobegranitehttpcacheurlpaths();

	/*! \brief Set 
	 */
	void setComadobegranitehttpcacheurlpaths(ConfigNodePropertyArray  comadobegranitehttpcacheurlpaths);

private:
	ConfigNodePropertyArray comadobegranitehttpcacheurlpaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties_H_ */
