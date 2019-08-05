/*
 * ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo_H_
#define _ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo_H_


#include <string>
#include "ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.h"
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

class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo();
	ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo();

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
	ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo_H_ */
