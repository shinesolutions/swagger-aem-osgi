
/*
 * OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties();
    OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardservletpattern();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardservletpattern(ConfigNodePropertyString osgihttpwhiteboardservletpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardcontextselect();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString osgihttpwhiteboardcontextselect);


    private:
    ConfigNodePropertyString osgihttpwhiteboardservletpattern;
    ConfigNodePropertyString osgihttpwhiteboardcontextselect;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties_H_ */
