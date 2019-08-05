/*
 * ComDayCqDamVideoImplServletVideoTestServletInfo.h
 *
 * 
 */

#ifndef _ComDayCqDamVideoImplServletVideoTestServletInfo_H_
#define _ComDayCqDamVideoImplServletVideoTestServletInfo_H_


#include <string>
#include "ComDayCqDamVideoImplServletVideoTestServletProperties.h"
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

class ComDayCqDamVideoImplServletVideoTestServletInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamVideoImplServletVideoTestServletInfo();
	ComDayCqDamVideoImplServletVideoTestServletInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamVideoImplServletVideoTestServletInfo();

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
	ComDayCqDamVideoImplServletVideoTestServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamVideoImplServletVideoTestServletProperties  properties);
	/*! \brief Get 
	 */
	std::string getBundleLocation();

	/*! \brief Set 
	 */
	void setBundleLocation(std::string  bundle_location);
	/*! \brief Get 
	 */
	std::string getServiceLocation();

	/*! \brief Set 
	 */
	void setServiceLocation(std::string  service_location);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqDamVideoImplServletVideoTestServletProperties properties;
	std::string bundle_location;
	std::string service_location;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamVideoImplServletVideoTestServletInfo_H_ */
