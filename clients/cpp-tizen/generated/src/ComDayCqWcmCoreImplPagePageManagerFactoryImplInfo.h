/*
 * ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo_H_
#define _ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo_H_


#include <string>
#include "ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.h"
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

class ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo();
	ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo();

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
	ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo_H_ */
