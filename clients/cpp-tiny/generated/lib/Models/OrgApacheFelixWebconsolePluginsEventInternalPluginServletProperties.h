
/*
 * OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties();
    OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxsize();

	/*! \brief Set 
	 */
	void setMaxsize(ConfigNodePropertyInteger maxsize);


    private:
    ConfigNodePropertyInteger maxsize;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties_H_ */
