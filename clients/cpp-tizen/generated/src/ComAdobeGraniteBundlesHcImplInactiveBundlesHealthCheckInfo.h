/*
 * ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo_H_
#define _ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo_H_


#include <string>
#include "ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.h"
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

class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo();
	ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo();

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
	ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo_H_ */
