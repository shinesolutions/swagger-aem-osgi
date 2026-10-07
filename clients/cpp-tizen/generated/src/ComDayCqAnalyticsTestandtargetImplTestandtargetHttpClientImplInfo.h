/*
 * ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo_H_
#define _ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo_H_


#include <string>
#include "ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.h"
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

class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo();
	ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo();

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
	ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo_H_ */
