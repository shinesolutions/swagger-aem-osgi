/*
 * ComDayCqNotificationImplNotificationServiceImplInfo.h
 *
 * 
 */

#ifndef _ComDayCqNotificationImplNotificationServiceImplInfo_H_
#define _ComDayCqNotificationImplNotificationServiceImplInfo_H_


#include <string>
#include "ComDayCqNotificationImplNotificationServiceImplProperties.h"
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

class ComDayCqNotificationImplNotificationServiceImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqNotificationImplNotificationServiceImplInfo();
	ComDayCqNotificationImplNotificationServiceImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqNotificationImplNotificationServiceImplInfo();

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
	ComDayCqNotificationImplNotificationServiceImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqNotificationImplNotificationServiceImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqNotificationImplNotificationServiceImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqNotificationImplNotificationServiceImplInfo_H_ */
