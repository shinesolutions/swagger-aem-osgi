/*
 * ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo.h
 *
 * 
 */

#ifndef _ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo_H_
#define _ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo_H_


#include <string>
#include "ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.h"
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

class ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo();
	ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo();

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
	ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo_H_ */
