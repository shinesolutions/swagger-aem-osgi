/*
 * ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.h
 *
 * 
 */

#ifndef _ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo_H_
#define _ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo_H_


#include <string>
#include "ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.h"
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

class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo();
	ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo();

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
	ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo_H_ */
