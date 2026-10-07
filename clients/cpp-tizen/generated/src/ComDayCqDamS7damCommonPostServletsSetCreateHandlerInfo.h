/*
 * ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.h
 *
 * 
 */

#ifndef _ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo_H_
#define _ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo_H_


#include <string>
#include "ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.h"
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

class ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo();
	ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo();

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
	ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo_H_ */
