
/*
 * ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties_H_
#define TINY_CPP_CLIENT_ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties();
    ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPreservehierarchynodes();

	/*! \brief Set 
	 */
	void setPreservehierarchynodes(ConfigNodePropertyBoolean preservehierarchynodes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIgnoreversioning();

	/*! \brief Set 
	 */
	void setIgnoreversioning(ConfigNodePropertyBoolean ignoreversioning);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getImportacl();

	/*! \brief Set 
	 */
	void setImportacl(ConfigNodePropertyBoolean importacl);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSavethreshold();

	/*! \brief Set 
	 */
	void setSavethreshold(ConfigNodePropertyInteger savethreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPreserveuserpaths();

	/*! \brief Set 
	 */
	void setPreserveuserpaths(ConfigNodePropertyBoolean preserveuserpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPreserveuuid();

	/*! \brief Set 
	 */
	void setPreserveuuid(ConfigNodePropertyBoolean preserveuuid);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPreserveuuidnodetypes();

	/*! \brief Set 
	 */
	void setPreserveuuidnodetypes(ConfigNodePropertyArray preserveuuidnodetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPreserveuuidsubtrees();

	/*! \brief Set 
	 */
	void setPreserveuuidsubtrees(ConfigNodePropertyArray preserveuuidsubtrees);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAutocommit();

	/*! \brief Set 
	 */
	void setAutocommit(ConfigNodePropertyBoolean autocommit);


    private:
    ConfigNodePropertyBoolean preservehierarchynodes;
    ConfigNodePropertyBoolean ignoreversioning;
    ConfigNodePropertyBoolean importacl;
    ConfigNodePropertyInteger savethreshold;
    ConfigNodePropertyBoolean preserveuserpaths;
    ConfigNodePropertyBoolean preserveuuid;
    ConfigNodePropertyArray preserveuuidnodetypes;
    ConfigNodePropertyArray preserveuuidsubtrees;
    ConfigNodePropertyBoolean autocommit;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties_H_ */
