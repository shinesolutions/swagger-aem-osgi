
/*
 * ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties();
    ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getArchivingenabled();

	/*! \brief Set 
	 */
	void setArchivingenabled(ConfigNodePropertyBoolean archivingenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getArchivesincedayscompleted();

	/*! \brief Set 
	 */
	void setArchivesincedayscompleted(ConfigNodePropertyInteger archivesincedayscompleted);


    private:
    ConfigNodePropertyBoolean archivingenabled;
    ConfigNodePropertyString schedulerexpression;
    ConfigNodePropertyInteger archivesincedayscompleted;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties_H_ */
