/*
 * ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteHttpcacheFileFileCacheStoreProperties_H_
#define _ComAdobeGraniteHttpcacheFileFileCacheStoreProperties_H_


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

class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteHttpcacheFileFileCacheStoreProperties();
	ComAdobeGraniteHttpcacheFileFileCacheStoreProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteHttpcacheFileFileCacheStoreProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobegranitehttpcachefiledocumentRoot();

	/*! \brief Set 
	 */
	void setComadobegranitehttpcachefiledocumentRoot(ConfigNodePropertyString  comadobegranitehttpcachefiledocumentRoot);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobegranitehttpcachefileincludeHost();

	/*! \brief Set 
	 */
	void setComadobegranitehttpcachefileincludeHost(ConfigNodePropertyString  comadobegranitehttpcachefileincludeHost);

private:
	ConfigNodePropertyString comadobegranitehttpcachefiledocumentRoot;
	ConfigNodePropertyString comadobegranitehttpcachefileincludeHost;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteHttpcacheFileFileCacheStoreProperties_H_ */
