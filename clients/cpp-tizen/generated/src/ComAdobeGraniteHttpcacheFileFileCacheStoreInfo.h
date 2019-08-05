/*
 * ComAdobeGraniteHttpcacheFileFileCacheStoreInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteHttpcacheFileFileCacheStoreInfo_H_
#define _ComAdobeGraniteHttpcacheFileFileCacheStoreInfo_H_


#include <string>
#include "ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.h"
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

class ComAdobeGraniteHttpcacheFileFileCacheStoreInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteHttpcacheFileFileCacheStoreInfo();
	ComAdobeGraniteHttpcacheFileFileCacheStoreInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteHttpcacheFileFileCacheStoreInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string  pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	ComAdobeGraniteHttpcacheFileFileCacheStoreProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteHttpcacheFileFileCacheStoreProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteHttpcacheFileFileCacheStoreProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteHttpcacheFileFileCacheStoreInfo_H_ */
