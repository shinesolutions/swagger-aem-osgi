/*
 * ComAdobeCqAuditPurgePagesProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqAuditPurgePagesProperties_H_
#define _ComAdobeCqAuditPurgePagesProperties_H_


#include <string>
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
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

class ComAdobeCqAuditPurgePagesProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqAuditPurgePagesProperties();
	ComAdobeCqAuditPurgePagesProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqAuditPurgePagesProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuditlogrulename();

	/*! \brief Set 
	 */
	void setAuditlogrulename(ConfigNodePropertyString  auditlogrulename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuditlogrulecontentpath();

	/*! \brief Set 
	 */
	void setAuditlogrulecontentpath(ConfigNodePropertyString  auditlogrulecontentpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAuditlogruleminimumage();

	/*! \brief Set 
	 */
	void setAuditlogruleminimumage(ConfigNodePropertyInteger  auditlogruleminimumage);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getAuditlogruletypes();

	/*! \brief Set 
	 */
	void setAuditlogruletypes(ConfigNodePropertyDropDown  auditlogruletypes);

private:
	ConfigNodePropertyString auditlogrulename;
	ConfigNodePropertyString auditlogrulecontentpath;
	ConfigNodePropertyInteger auditlogruleminimumage;
	ConfigNodePropertyDropDown auditlogruletypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqAuditPurgePagesProperties_H_ */