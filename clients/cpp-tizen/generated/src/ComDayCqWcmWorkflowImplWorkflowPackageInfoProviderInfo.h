/*
 * ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo.h
 *
 * 
 */

#ifndef _ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo_H_
#define _ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo_H_


#include <string>
#include "ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.h"
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

class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo();
	ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo();

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
	ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo_H_ */
