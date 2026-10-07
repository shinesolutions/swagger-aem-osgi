
/*
 * ComAdobeCqAuditPurgeDamProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqAuditPurgeDamProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqAuditPurgeDamProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqAuditPurgeDamProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqAuditPurgeDamProperties();
    ComAdobeCqAuditPurgeDamProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqAuditPurgeDamProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuditlogrulename();

	/*! \brief Set 
	 */
	void setAuditlogrulename(ConfigNodePropertyString auditlogrulename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuditlogrulecontentpath();

	/*! \brief Set 
	 */
	void setAuditlogrulecontentpath(ConfigNodePropertyString auditlogrulecontentpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAuditlogruleminimumage();

	/*! \brief Set 
	 */
	void setAuditlogruleminimumage(ConfigNodePropertyInteger auditlogruleminimumage);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getAuditlogruletypes();

	/*! \brief Set 
	 */
	void setAuditlogruletypes(ConfigNodePropertyDropDown auditlogruletypes);


    private:
    ConfigNodePropertyString auditlogrulename;
    ConfigNodePropertyString auditlogrulecontentpath;
    ConfigNodePropertyInteger auditlogruleminimumage;
    ConfigNodePropertyDropDown auditlogruletypes;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqAuditPurgeDamProperties_H_ */
