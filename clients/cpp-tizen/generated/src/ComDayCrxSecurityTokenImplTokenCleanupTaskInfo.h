/*
 * ComDayCrxSecurityTokenImplTokenCleanupTaskInfo.h
 *
 * 
 */

#ifndef _ComDayCrxSecurityTokenImplTokenCleanupTaskInfo_H_
#define _ComDayCrxSecurityTokenImplTokenCleanupTaskInfo_H_


#include <string>
#include "ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.h"
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

class ComDayCrxSecurityTokenImplTokenCleanupTaskInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCrxSecurityTokenImplTokenCleanupTaskInfo();
	ComDayCrxSecurityTokenImplTokenCleanupTaskInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCrxSecurityTokenImplTokenCleanupTaskInfo();

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
	ComDayCrxSecurityTokenImplTokenCleanupTaskProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCrxSecurityTokenImplTokenCleanupTaskProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCrxSecurityTokenImplTokenCleanupTaskProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCrxSecurityTokenImplTokenCleanupTaskInfo_H_ */
