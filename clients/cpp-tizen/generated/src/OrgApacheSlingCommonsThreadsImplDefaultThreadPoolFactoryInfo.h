/*
 * OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo.h
 *
 * 
 */

#ifndef _OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo_H_
#define _OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo_H_


#include <string>
#include "OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.h"
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

class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo();
	OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo();

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
	OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo_H_ */
