
/*
 * ComDayCqWcmMsmImplServletsAuditLogServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmMsmImplServletsAuditLogServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmMsmImplServletsAuditLogServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmMsmImplServletsAuditLogServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmMsmImplServletsAuditLogServletProperties();
    ComDayCqWcmMsmImplServletsAuditLogServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmMsmImplServletsAuditLogServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAuditlogservletdefaulteventscount();

	/*! \brief Set 
	 */
	void setAuditlogservletdefaulteventscount(ConfigNodePropertyInteger auditlogservletdefaulteventscount);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuditlogservletdefaultpath();

	/*! \brief Set 
	 */
	void setAuditlogservletdefaultpath(ConfigNodePropertyString auditlogservletdefaultpath);


    private:
    ConfigNodePropertyInteger auditlogservletdefaulteventscount;
    ConfigNodePropertyString auditlogservletdefaultpath;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmMsmImplServletsAuditLogServletProperties_H_ */
