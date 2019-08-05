/*
 * ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo_H_
#define _ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo_H_


#include <string>
#include "ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.h"
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

class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo();
	ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo();

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
	ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo_H_ */
