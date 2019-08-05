/*
 * ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo_H_
#define _ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo_H_


#include <string>
#include "ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.h"
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

class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo();
	ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo();

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
	ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo_H_ */
