/*
 * ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties_H_
#define _ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties();
	ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getMimeallowEmpty();

	/*! \brief Set 
	 */
	void setMimeallowEmpty(ConfigNodePropertyBoolean  mimeallowEmpty);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMimeallowed();

	/*! \brief Set 
	 */
	void setMimeallowed(ConfigNodePropertyArray  mimeallowed);

private:
	ConfigNodePropertyBoolean mimeallowEmpty;
	ConfigNodePropertyArray mimeallowed;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties_H_ */
