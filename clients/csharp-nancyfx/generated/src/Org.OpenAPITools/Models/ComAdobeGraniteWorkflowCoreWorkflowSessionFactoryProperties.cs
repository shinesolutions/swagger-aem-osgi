using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties:  IEquatable<ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties>
    { 
        /// <summary>
        /// GraniteWorkflowinboxSortPropertyName
        /// </summary>
        public ConfigNodePropertyDropDown GraniteWorkflowinboxSortPropertyName { get; private set; }

        /// <summary>
        /// GraniteWorkflowinboxSortOrder
        /// </summary>
        public ConfigNodePropertyString GraniteWorkflowinboxSortOrder { get; private set; }

        /// <summary>
        /// CqWorkflowJobRetry
        /// </summary>
        public ConfigNodePropertyInteger CqWorkflowJobRetry { get; private set; }

        /// <summary>
        /// CqWorkflowSuperuser
        /// </summary>
        public ConfigNodePropertyArray CqWorkflowSuperuser { get; private set; }

        /// <summary>
        /// GraniteWorkflowInboxQuerySize
        /// </summary>
        public ConfigNodePropertyInteger GraniteWorkflowInboxQuerySize { get; private set; }

        /// <summary>
        /// GraniteWorkflowAdminUserGroupFilter
        /// </summary>
        public ConfigNodePropertyBoolean GraniteWorkflowAdminUserGroupFilter { get; private set; }

        /// <summary>
        /// GraniteWorkflowEnforceWorkitemAssigneePermissions
        /// </summary>
        public ConfigNodePropertyBoolean GraniteWorkflowEnforceWorkitemAssigneePermissions { get; private set; }

        /// <summary>
        /// GraniteWorkflowEnforceWorkflowInitiatorPermissions
        /// </summary>
        public ConfigNodePropertyBoolean GraniteWorkflowEnforceWorkflowInitiatorPermissions { get; private set; }

        /// <summary>
        /// GraniteWorkflowInjectTenantIdInJobTopics
        /// </summary>
        public ConfigNodePropertyBoolean GraniteWorkflowInjectTenantIdInJobTopics { get; private set; }

        /// <summary>
        /// GraniteWorkflowMaxPurgeSaveThreshold
        /// </summary>
        public ConfigNodePropertyInteger GraniteWorkflowMaxPurgeSaveThreshold { get; private set; }

        /// <summary>
        /// GraniteWorkflowMaxPurgeQueryCount
        /// </summary>
        public ConfigNodePropertyInteger GraniteWorkflowMaxPurgeQueryCount { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties()
        {
        }

        private ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties(ConfigNodePropertyDropDown GraniteWorkflowinboxSortPropertyName, ConfigNodePropertyString GraniteWorkflowinboxSortOrder, ConfigNodePropertyInteger CqWorkflowJobRetry, ConfigNodePropertyArray CqWorkflowSuperuser, ConfigNodePropertyInteger GraniteWorkflowInboxQuerySize, ConfigNodePropertyBoolean GraniteWorkflowAdminUserGroupFilter, ConfigNodePropertyBoolean GraniteWorkflowEnforceWorkitemAssigneePermissions, ConfigNodePropertyBoolean GraniteWorkflowEnforceWorkflowInitiatorPermissions, ConfigNodePropertyBoolean GraniteWorkflowInjectTenantIdInJobTopics, ConfigNodePropertyInteger GraniteWorkflowMaxPurgeSaveThreshold, ConfigNodePropertyInteger GraniteWorkflowMaxPurgeQueryCount)
        {
            
            this.GraniteWorkflowinboxSortPropertyName = GraniteWorkflowinboxSortPropertyName;
            
            this.GraniteWorkflowinboxSortOrder = GraniteWorkflowinboxSortOrder;
            
            this.CqWorkflowJobRetry = CqWorkflowJobRetry;
            
            this.CqWorkflowSuperuser = CqWorkflowSuperuser;
            
            this.GraniteWorkflowInboxQuerySize = GraniteWorkflowInboxQuerySize;
            
            this.GraniteWorkflowAdminUserGroupFilter = GraniteWorkflowAdminUserGroupFilter;
            
            this.GraniteWorkflowEnforceWorkitemAssigneePermissions = GraniteWorkflowEnforceWorkitemAssigneePermissions;
            
            this.GraniteWorkflowEnforceWorkflowInitiatorPermissions = GraniteWorkflowEnforceWorkflowInitiatorPermissions;
            
            this.GraniteWorkflowInjectTenantIdInJobTopics = GraniteWorkflowInjectTenantIdInJobTopics;
            
            this.GraniteWorkflowMaxPurgeSaveThreshold = GraniteWorkflowMaxPurgeSaveThreshold;
            
            this.GraniteWorkflowMaxPurgeQueryCount = GraniteWorkflowMaxPurgeQueryCount;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder</returns>
        public static ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder</returns>
        public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder With()
        {
            return Builder()
                .GraniteWorkflowinboxSortPropertyName(GraniteWorkflowinboxSortPropertyName)
                .GraniteWorkflowinboxSortOrder(GraniteWorkflowinboxSortOrder)
                .CqWorkflowJobRetry(CqWorkflowJobRetry)
                .CqWorkflowSuperuser(CqWorkflowSuperuser)
                .GraniteWorkflowInboxQuerySize(GraniteWorkflowInboxQuerySize)
                .GraniteWorkflowAdminUserGroupFilter(GraniteWorkflowAdminUserGroupFilter)
                .GraniteWorkflowEnforceWorkitemAssigneePermissions(GraniteWorkflowEnforceWorkitemAssigneePermissions)
                .GraniteWorkflowEnforceWorkflowInitiatorPermissions(GraniteWorkflowEnforceWorkflowInitiatorPermissions)
                .GraniteWorkflowInjectTenantIdInJobTopics(GraniteWorkflowInjectTenantIdInJobTopics)
                .GraniteWorkflowMaxPurgeSaveThreshold(GraniteWorkflowMaxPurgeSaveThreshold)
                .GraniteWorkflowMaxPurgeQueryCount(GraniteWorkflowMaxPurgeQueryCount);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties left, ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties left, ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _GraniteWorkflowinboxSortPropertyName;
            private ConfigNodePropertyString _GraniteWorkflowinboxSortOrder;
            private ConfigNodePropertyInteger _CqWorkflowJobRetry;
            private ConfigNodePropertyArray _CqWorkflowSuperuser;
            private ConfigNodePropertyInteger _GraniteWorkflowInboxQuerySize;
            private ConfigNodePropertyBoolean _GraniteWorkflowAdminUserGroupFilter;
            private ConfigNodePropertyBoolean _GraniteWorkflowEnforceWorkitemAssigneePermissions;
            private ConfigNodePropertyBoolean _GraniteWorkflowEnforceWorkflowInitiatorPermissions;
            private ConfigNodePropertyBoolean _GraniteWorkflowInjectTenantIdInJobTopics;
            private ConfigNodePropertyInteger _GraniteWorkflowMaxPurgeSaveThreshold;
            private ConfigNodePropertyInteger _GraniteWorkflowMaxPurgeQueryCount;

            internal ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.GraniteWorkflowinboxSortPropertyName property.
            /// </summary>
            /// <param name="value">GraniteWorkflowinboxSortPropertyName</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder GraniteWorkflowinboxSortPropertyName(ConfigNodePropertyDropDown value)
            {
                _GraniteWorkflowinboxSortPropertyName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.GraniteWorkflowinboxSortOrder property.
            /// </summary>
            /// <param name="value">GraniteWorkflowinboxSortOrder</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder GraniteWorkflowinboxSortOrder(ConfigNodePropertyString value)
            {
                _GraniteWorkflowinboxSortOrder = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.CqWorkflowJobRetry property.
            /// </summary>
            /// <param name="value">CqWorkflowJobRetry</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder CqWorkflowJobRetry(ConfigNodePropertyInteger value)
            {
                _CqWorkflowJobRetry = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.CqWorkflowSuperuser property.
            /// </summary>
            /// <param name="value">CqWorkflowSuperuser</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder CqWorkflowSuperuser(ConfigNodePropertyArray value)
            {
                _CqWorkflowSuperuser = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.GraniteWorkflowInboxQuerySize property.
            /// </summary>
            /// <param name="value">GraniteWorkflowInboxQuerySize</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder GraniteWorkflowInboxQuerySize(ConfigNodePropertyInteger value)
            {
                _GraniteWorkflowInboxQuerySize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.GraniteWorkflowAdminUserGroupFilter property.
            /// </summary>
            /// <param name="value">GraniteWorkflowAdminUserGroupFilter</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder GraniteWorkflowAdminUserGroupFilter(ConfigNodePropertyBoolean value)
            {
                _GraniteWorkflowAdminUserGroupFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.GraniteWorkflowEnforceWorkitemAssigneePermissions property.
            /// </summary>
            /// <param name="value">GraniteWorkflowEnforceWorkitemAssigneePermissions</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder GraniteWorkflowEnforceWorkitemAssigneePermissions(ConfigNodePropertyBoolean value)
            {
                _GraniteWorkflowEnforceWorkitemAssigneePermissions = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.GraniteWorkflowEnforceWorkflowInitiatorPermissions property.
            /// </summary>
            /// <param name="value">GraniteWorkflowEnforceWorkflowInitiatorPermissions</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder GraniteWorkflowEnforceWorkflowInitiatorPermissions(ConfigNodePropertyBoolean value)
            {
                _GraniteWorkflowEnforceWorkflowInitiatorPermissions = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.GraniteWorkflowInjectTenantIdInJobTopics property.
            /// </summary>
            /// <param name="value">GraniteWorkflowInjectTenantIdInJobTopics</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder GraniteWorkflowInjectTenantIdInJobTopics(ConfigNodePropertyBoolean value)
            {
                _GraniteWorkflowInjectTenantIdInJobTopics = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.GraniteWorkflowMaxPurgeSaveThreshold property.
            /// </summary>
            /// <param name="value">GraniteWorkflowMaxPurgeSaveThreshold</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder GraniteWorkflowMaxPurgeSaveThreshold(ConfigNodePropertyInteger value)
            {
                _GraniteWorkflowMaxPurgeSaveThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.GraniteWorkflowMaxPurgeQueryCount property.
            /// </summary>
            /// <param name="value">GraniteWorkflowMaxPurgeQueryCount</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder GraniteWorkflowMaxPurgeQueryCount(ConfigNodePropertyInteger value)
            {
                _GraniteWorkflowMaxPurgeQueryCount = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties</returns>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties(
                    GraniteWorkflowinboxSortPropertyName: _GraniteWorkflowinboxSortPropertyName,
                    GraniteWorkflowinboxSortOrder: _GraniteWorkflowinboxSortOrder,
                    CqWorkflowJobRetry: _CqWorkflowJobRetry,
                    CqWorkflowSuperuser: _CqWorkflowSuperuser,
                    GraniteWorkflowInboxQuerySize: _GraniteWorkflowInboxQuerySize,
                    GraniteWorkflowAdminUserGroupFilter: _GraniteWorkflowAdminUserGroupFilter,
                    GraniteWorkflowEnforceWorkitemAssigneePermissions: _GraniteWorkflowEnforceWorkitemAssigneePermissions,
                    GraniteWorkflowEnforceWorkflowInitiatorPermissions: _GraniteWorkflowEnforceWorkflowInitiatorPermissions,
                    GraniteWorkflowInjectTenantIdInJobTopics: _GraniteWorkflowInjectTenantIdInJobTopics,
                    GraniteWorkflowMaxPurgeSaveThreshold: _GraniteWorkflowMaxPurgeSaveThreshold,
                    GraniteWorkflowMaxPurgeQueryCount: _GraniteWorkflowMaxPurgeQueryCount
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}