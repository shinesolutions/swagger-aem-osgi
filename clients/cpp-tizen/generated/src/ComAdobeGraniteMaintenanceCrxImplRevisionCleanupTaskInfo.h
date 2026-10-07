/*
 * ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo_H_
#define _ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo_H_


#include <string>
#include "ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.h"
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

class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo();
	ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo();

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
	ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo_H_ */
