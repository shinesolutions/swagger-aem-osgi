/*
 * ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo_H_
#define _ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo_H_


#include <string>
#include "ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.h"
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

class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo();
	ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo();

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
	ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo_H_ */
