/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties()
{
    m_Jasper_compilerTargetVMIsSet = false;
    m_Jasper_compilerSourceVMIsSet = false;
    m_Jasper_classdebuginfoIsSet = false;
    m_Jasper_enablePoolingIsSet = false;
    m_Jasper_ieClassIdIsSet = false;
    m_Jasper_genStringAsCharArrayIsSet = false;
    m_Jasper_keepgeneratedIsSet = false;
    m_Jasper_mappedfileIsSet = false;
    m_Jasper_trimSpacesIsSet = false;
    m_Jasper_displaySourceFragmentsIsSet = false;
    m_Default_is_sessionIsSet = false;
}

OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::~OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties()
{
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::validate()
{
    // TODO: implement validation
}

web::json::value OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Jasper_compilerTargetVMIsSet)
    {
        val[utility::conversions::to_string_t("jasper.compilerTargetVM")] = ModelBase::toJson(m_Jasper_compilerTargetVM);
    }
    if(m_Jasper_compilerSourceVMIsSet)
    {
        val[utility::conversions::to_string_t("jasper.compilerSourceVM")] = ModelBase::toJson(m_Jasper_compilerSourceVM);
    }
    if(m_Jasper_classdebuginfoIsSet)
    {
        val[utility::conversions::to_string_t("jasper.classdebuginfo")] = ModelBase::toJson(m_Jasper_classdebuginfo);
    }
    if(m_Jasper_enablePoolingIsSet)
    {
        val[utility::conversions::to_string_t("jasper.enablePooling")] = ModelBase::toJson(m_Jasper_enablePooling);
    }
    if(m_Jasper_ieClassIdIsSet)
    {
        val[utility::conversions::to_string_t("jasper.ieClassId")] = ModelBase::toJson(m_Jasper_ieClassId);
    }
    if(m_Jasper_genStringAsCharArrayIsSet)
    {
        val[utility::conversions::to_string_t("jasper.genStringAsCharArray")] = ModelBase::toJson(m_Jasper_genStringAsCharArray);
    }
    if(m_Jasper_keepgeneratedIsSet)
    {
        val[utility::conversions::to_string_t("jasper.keepgenerated")] = ModelBase::toJson(m_Jasper_keepgenerated);
    }
    if(m_Jasper_mappedfileIsSet)
    {
        val[utility::conversions::to_string_t("jasper.mappedfile")] = ModelBase::toJson(m_Jasper_mappedfile);
    }
    if(m_Jasper_trimSpacesIsSet)
    {
        val[utility::conversions::to_string_t("jasper.trimSpaces")] = ModelBase::toJson(m_Jasper_trimSpaces);
    }
    if(m_Jasper_displaySourceFragmentsIsSet)
    {
        val[utility::conversions::to_string_t("jasper.displaySourceFragments")] = ModelBase::toJson(m_Jasper_displaySourceFragments);
    }
    if(m_Default_is_sessionIsSet)
    {
        val[utility::conversions::to_string_t("default.is.session")] = ModelBase::toJson(m_Default_is_session);
    }

    return val;
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("jasper.compilerTargetVM")))
    {
        if(!val[utility::conversions::to_string_t("jasper.compilerTargetVM")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("jasper.compilerTargetVM")]);
            setJasperCompilerTargetVM( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("jasper.compilerSourceVM")))
    {
        if(!val[utility::conversions::to_string_t("jasper.compilerSourceVM")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("jasper.compilerSourceVM")]);
            setJasperCompilerSourceVM( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("jasper.classdebuginfo")))
    {
        if(!val[utility::conversions::to_string_t("jasper.classdebuginfo")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("jasper.classdebuginfo")]);
            setJasperClassdebuginfo( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("jasper.enablePooling")))
    {
        if(!val[utility::conversions::to_string_t("jasper.enablePooling")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("jasper.enablePooling")]);
            setJasperEnablePooling( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("jasper.ieClassId")))
    {
        if(!val[utility::conversions::to_string_t("jasper.ieClassId")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("jasper.ieClassId")]);
            setJasperIeClassId( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("jasper.genStringAsCharArray")))
    {
        if(!val[utility::conversions::to_string_t("jasper.genStringAsCharArray")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("jasper.genStringAsCharArray")]);
            setJasperGenStringAsCharArray( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("jasper.keepgenerated")))
    {
        if(!val[utility::conversions::to_string_t("jasper.keepgenerated")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("jasper.keepgenerated")]);
            setJasperKeepgenerated( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("jasper.mappedfile")))
    {
        if(!val[utility::conversions::to_string_t("jasper.mappedfile")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("jasper.mappedfile")]);
            setJasperMappedfile( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("jasper.trimSpaces")))
    {
        if(!val[utility::conversions::to_string_t("jasper.trimSpaces")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("jasper.trimSpaces")]);
            setJasperTrimSpaces( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("jasper.displaySourceFragments")))
    {
        if(!val[utility::conversions::to_string_t("jasper.displaySourceFragments")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("jasper.displaySourceFragments")]);
            setJasperDisplaySourceFragments( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("default.is.session")))
    {
        if(!val[utility::conversions::to_string_t("default.is.session")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("default.is.session")]);
            setDefaultIsSession( newItem );
        }
    }
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Jasper_compilerTargetVMIsSet)
    {
        if (m_Jasper_compilerTargetVM.get())
        {
            m_Jasper_compilerTargetVM->toMultipart(multipart, utility::conversions::to_string_t("jasper.compilerTargetVM."));
        }
    }
    if(m_Jasper_compilerSourceVMIsSet)
    {
        if (m_Jasper_compilerSourceVM.get())
        {
            m_Jasper_compilerSourceVM->toMultipart(multipart, utility::conversions::to_string_t("jasper.compilerSourceVM."));
        }
    }
    if(m_Jasper_classdebuginfoIsSet)
    {
        if (m_Jasper_classdebuginfo.get())
        {
            m_Jasper_classdebuginfo->toMultipart(multipart, utility::conversions::to_string_t("jasper.classdebuginfo."));
        }
    }
    if(m_Jasper_enablePoolingIsSet)
    {
        if (m_Jasper_enablePooling.get())
        {
            m_Jasper_enablePooling->toMultipart(multipart, utility::conversions::to_string_t("jasper.enablePooling."));
        }
    }
    if(m_Jasper_ieClassIdIsSet)
    {
        if (m_Jasper_ieClassId.get())
        {
            m_Jasper_ieClassId->toMultipart(multipart, utility::conversions::to_string_t("jasper.ieClassId."));
        }
    }
    if(m_Jasper_genStringAsCharArrayIsSet)
    {
        if (m_Jasper_genStringAsCharArray.get())
        {
            m_Jasper_genStringAsCharArray->toMultipart(multipart, utility::conversions::to_string_t("jasper.genStringAsCharArray."));
        }
    }
    if(m_Jasper_keepgeneratedIsSet)
    {
        if (m_Jasper_keepgenerated.get())
        {
            m_Jasper_keepgenerated->toMultipart(multipart, utility::conversions::to_string_t("jasper.keepgenerated."));
        }
    }
    if(m_Jasper_mappedfileIsSet)
    {
        if (m_Jasper_mappedfile.get())
        {
            m_Jasper_mappedfile->toMultipart(multipart, utility::conversions::to_string_t("jasper.mappedfile."));
        }
    }
    if(m_Jasper_trimSpacesIsSet)
    {
        if (m_Jasper_trimSpaces.get())
        {
            m_Jasper_trimSpaces->toMultipart(multipart, utility::conversions::to_string_t("jasper.trimSpaces."));
        }
    }
    if(m_Jasper_displaySourceFragmentsIsSet)
    {
        if (m_Jasper_displaySourceFragments.get())
        {
            m_Jasper_displaySourceFragments->toMultipart(multipart, utility::conversions::to_string_t("jasper.displaySourceFragments."));
        }
    }
    if(m_Default_is_sessionIsSet)
    {
        if (m_Default_is_session.get())
        {
            m_Default_is_session->toMultipart(multipart, utility::conversions::to_string_t("default.is.session."));
        }
    }
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("jasper.compilerTargetVM")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("jasper.compilerTargetVM")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("jasper.compilerTargetVM."));
            setJasperCompilerTargetVM( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("jasper.compilerSourceVM")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("jasper.compilerSourceVM")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("jasper.compilerSourceVM."));
            setJasperCompilerSourceVM( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("jasper.classdebuginfo")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("jasper.classdebuginfo")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("jasper.classdebuginfo."));
            setJasperClassdebuginfo( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("jasper.enablePooling")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("jasper.enablePooling")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("jasper.enablePooling."));
            setJasperEnablePooling( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("jasper.ieClassId")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("jasper.ieClassId")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("jasper.ieClassId."));
            setJasperIeClassId( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("jasper.genStringAsCharArray")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("jasper.genStringAsCharArray")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("jasper.genStringAsCharArray."));
            setJasperGenStringAsCharArray( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("jasper.keepgenerated")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("jasper.keepgenerated")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("jasper.keepgenerated."));
            setJasperKeepgenerated( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("jasper.mappedfile")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("jasper.mappedfile")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("jasper.mappedfile."));
            setJasperMappedfile( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("jasper.trimSpaces")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("jasper.trimSpaces")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("jasper.trimSpaces."));
            setJasperTrimSpaces( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("jasper.displaySourceFragments")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("jasper.displaySourceFragments")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("jasper.displaySourceFragments."));
            setJasperDisplaySourceFragments( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("default.is.session")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("default.is.session")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("default.is.session."));
            setDefaultIsSession( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyString> OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperCompilerTargetVM() const
{
    return m_Jasper_compilerTargetVM;
}


void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperCompilerTargetVM(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Jasper_compilerTargetVM = value;
    m_Jasper_compilerTargetVMIsSet = true;
}
bool OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::jasperCompilerTargetVMIsSet() const
{
    return m_Jasper_compilerTargetVMIsSet;
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::unsetJasper_compilerTargetVM()
{
    m_Jasper_compilerTargetVMIsSet = false;
}

std::shared_ptr<ConfigNodePropertyString> OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperCompilerSourceVM() const
{
    return m_Jasper_compilerSourceVM;
}


void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperCompilerSourceVM(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Jasper_compilerSourceVM = value;
    m_Jasper_compilerSourceVMIsSet = true;
}
bool OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::jasperCompilerSourceVMIsSet() const
{
    return m_Jasper_compilerSourceVMIsSet;
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::unsetJasper_compilerSourceVM()
{
    m_Jasper_compilerSourceVMIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperClassdebuginfo() const
{
    return m_Jasper_classdebuginfo;
}


void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperClassdebuginfo(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Jasper_classdebuginfo = value;
    m_Jasper_classdebuginfoIsSet = true;
}
bool OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::jasperClassdebuginfoIsSet() const
{
    return m_Jasper_classdebuginfoIsSet;
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::unsetJasper_classdebuginfo()
{
    m_Jasper_classdebuginfoIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperEnablePooling() const
{
    return m_Jasper_enablePooling;
}


void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperEnablePooling(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Jasper_enablePooling = value;
    m_Jasper_enablePoolingIsSet = true;
}
bool OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::jasperEnablePoolingIsSet() const
{
    return m_Jasper_enablePoolingIsSet;
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::unsetJasper_enablePooling()
{
    m_Jasper_enablePoolingIsSet = false;
}

std::shared_ptr<ConfigNodePropertyString> OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperIeClassId() const
{
    return m_Jasper_ieClassId;
}


void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperIeClassId(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Jasper_ieClassId = value;
    m_Jasper_ieClassIdIsSet = true;
}
bool OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::jasperIeClassIdIsSet() const
{
    return m_Jasper_ieClassIdIsSet;
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::unsetJasper_ieClassId()
{
    m_Jasper_ieClassIdIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperGenStringAsCharArray() const
{
    return m_Jasper_genStringAsCharArray;
}


void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperGenStringAsCharArray(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Jasper_genStringAsCharArray = value;
    m_Jasper_genStringAsCharArrayIsSet = true;
}
bool OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::jasperGenStringAsCharArrayIsSet() const
{
    return m_Jasper_genStringAsCharArrayIsSet;
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::unsetJasper_genStringAsCharArray()
{
    m_Jasper_genStringAsCharArrayIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperKeepgenerated() const
{
    return m_Jasper_keepgenerated;
}


void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperKeepgenerated(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Jasper_keepgenerated = value;
    m_Jasper_keepgeneratedIsSet = true;
}
bool OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::jasperKeepgeneratedIsSet() const
{
    return m_Jasper_keepgeneratedIsSet;
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::unsetJasper_keepgenerated()
{
    m_Jasper_keepgeneratedIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperMappedfile() const
{
    return m_Jasper_mappedfile;
}


void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperMappedfile(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Jasper_mappedfile = value;
    m_Jasper_mappedfileIsSet = true;
}
bool OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::jasperMappedfileIsSet() const
{
    return m_Jasper_mappedfileIsSet;
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::unsetJasper_mappedfile()
{
    m_Jasper_mappedfileIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperTrimSpaces() const
{
    return m_Jasper_trimSpaces;
}


void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperTrimSpaces(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Jasper_trimSpaces = value;
    m_Jasper_trimSpacesIsSet = true;
}
bool OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::jasperTrimSpacesIsSet() const
{
    return m_Jasper_trimSpacesIsSet;
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::unsetJasper_trimSpaces()
{
    m_Jasper_trimSpacesIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperDisplaySourceFragments() const
{
    return m_Jasper_displaySourceFragments;
}


void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperDisplaySourceFragments(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Jasper_displaySourceFragments = value;
    m_Jasper_displaySourceFragmentsIsSet = true;
}
bool OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::jasperDisplaySourceFragmentsIsSet() const
{
    return m_Jasper_displaySourceFragmentsIsSet;
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::unsetJasper_displaySourceFragments()
{
    m_Jasper_displaySourceFragmentsIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getDefaultIsSession() const
{
    return m_Default_is_session;
}


void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setDefaultIsSession(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Default_is_session = value;
    m_Default_is_sessionIsSet = true;
}
bool OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::defaultIsSessionIsSet() const
{
    return m_Default_is_sessionIsSet;
}

void OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::unsetDefault_is_session()
{
    m_Default_is_sessionIsSet = false;
}

}
}
}
}

