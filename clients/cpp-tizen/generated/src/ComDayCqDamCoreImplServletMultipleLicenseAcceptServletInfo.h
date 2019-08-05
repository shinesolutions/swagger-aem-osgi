/*
 * ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo_H_
#define _ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo_H_


#include <string>
#include "ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.h"
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

class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo();
	ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo();

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
	ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo_H_ */
