
/*
 * ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScheduledExporterImplScheduledExporterImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqScheduledExporterImplScheduledExporterImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScheduledExporterImplScheduledExporterImplProperties();
    ComAdobeCqScheduledExporterImplScheduledExporterImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScheduledExporterImplScheduledExporterImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIncludepaths();

	/*! \brief Set 
	 */
	void setIncludepaths(ConfigNodePropertyArray includepaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getExporteruser();

	/*! \brief Set 
	 */
	void setExporteruser(ConfigNodePropertyString exporteruser);


    private:
    ConfigNodePropertyArray includepaths;
    ConfigNodePropertyString exporteruser;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScheduledExporterImplScheduledExporterImplProperties_H_ */
