/*
 * ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplMissingMetadataNotificationJobInfo_H_
#define _ComDayCqDamCoreImplMissingMetadataNotificationJobInfo_H_


#include <string>
#include "ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.h"
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

class ComDayCqDamCoreImplMissingMetadataNotificationJobInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplMissingMetadataNotificationJobInfo();
	ComDayCqDamCoreImplMissingMetadataNotificationJobInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplMissingMetadataNotificationJobInfo();

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
	ComDayCqDamCoreImplMissingMetadataNotificationJobProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamCoreImplMissingMetadataNotificationJobProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqDamCoreImplMissingMetadataNotificationJobProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplMissingMetadataNotificationJobInfo_H_ */
