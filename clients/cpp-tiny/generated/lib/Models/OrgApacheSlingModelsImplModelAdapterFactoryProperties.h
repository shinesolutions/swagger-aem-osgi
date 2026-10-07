
/*
 * OrgApacheSlingModelsImplModelAdapterFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingModelsImplModelAdapterFactoryProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingModelsImplModelAdapterFactoryProperties_H_


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

class OrgApacheSlingModelsImplModelAdapterFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingModelsImplModelAdapterFactoryProperties();
    OrgApacheSlingModelsImplModelAdapterFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingModelsImplModelAdapterFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardlistener();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardlistener(ConfigNodePropertyString osgihttpwhiteboardlistener);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardcontextselect();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString osgihttpwhiteboardcontextselect);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxrecursiondepth();

	/*! \brief Set 
	 */
	void setMaxrecursiondepth(ConfigNodePropertyInteger maxrecursiondepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCleanupjobperiod();

	/*! \brief Set 
	 */
	void setCleanupjobperiod(ConfigNodePropertyInteger cleanupjobperiod);


    private:
    ConfigNodePropertyString osgihttpwhiteboardlistener;
    ConfigNodePropertyString osgihttpwhiteboardcontextselect;
    ConfigNodePropertyInteger maxrecursiondepth;
    ConfigNodePropertyInteger cleanupjobperiod;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingModelsImplModelAdapterFactoryProperties_H_ */
