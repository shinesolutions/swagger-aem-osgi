/*
 * ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo_H_
#define _ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo_H_


#include <string>
#include "ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.h"
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

class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo();
	ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo();

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
	ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo_H_ */
