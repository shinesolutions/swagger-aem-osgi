/*
 * ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo_H_
#define _ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo_H_


#include <string>
#include "ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.h"
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

class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo();
	ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo();

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
	ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo_H_ */
