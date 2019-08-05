/*
 * OrgApacheSlingStartupfilterImplStartupFilterImplInfo.h
 *
 * 
 */

#ifndef _OrgApacheSlingStartupfilterImplStartupFilterImplInfo_H_
#define _OrgApacheSlingStartupfilterImplStartupFilterImplInfo_H_


#include <string>
#include "OrgApacheSlingStartupfilterImplStartupFilterImplProperties.h"
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

class OrgApacheSlingStartupfilterImplStartupFilterImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingStartupfilterImplStartupFilterImplInfo();
	OrgApacheSlingStartupfilterImplStartupFilterImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingStartupfilterImplStartupFilterImplInfo();

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
	OrgApacheSlingStartupfilterImplStartupFilterImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingStartupfilterImplStartupFilterImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	OrgApacheSlingStartupfilterImplStartupFilterImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingStartupfilterImplStartupFilterImplInfo_H_ */
