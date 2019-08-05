/*
 * ComAdobeCqAuditPurgePagesInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqAuditPurgePagesInfo_H_
#define _ComAdobeCqAuditPurgePagesInfo_H_


#include <string>
#include "ComAdobeCqAuditPurgePagesProperties.h"
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

class ComAdobeCqAuditPurgePagesInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqAuditPurgePagesInfo();
	ComAdobeCqAuditPurgePagesInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqAuditPurgePagesInfo();

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
	ComAdobeCqAuditPurgePagesProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqAuditPurgePagesProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqAuditPurgePagesProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqAuditPurgePagesInfo_H_ */
