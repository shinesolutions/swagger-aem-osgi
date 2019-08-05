using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqAuditPurgeReplicationProperties
    /// </summary>
    public sealed class ComAdobeCqAuditPurgeReplicationProperties:  IEquatable<ComAdobeCqAuditPurgeReplicationProperties>
    { 
        /// <summary>
        /// AuditlogRuleName
        /// </summary>
        public ConfigNodePropertyString AuditlogRuleName { get; private set; }

        /// <summary>
        /// AuditlogRuleContentpath
        /// </summary>
        public ConfigNodePropertyString AuditlogRuleContentpath { get; private set; }

        /// <summary>
        /// AuditlogRuleMinimumage
        /// </summary>
        public ConfigNodePropertyInteger AuditlogRuleMinimumage { get; private set; }

        /// <summary>
        /// AuditlogRuleTypes
        /// </summary>
        public ConfigNodePropertyDropDown AuditlogRuleTypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqAuditPurgeReplicationProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqAuditPurgeReplicationProperties()
        {
        }

        private ComAdobeCqAuditPurgeReplicationProperties(ConfigNodePropertyString AuditlogRuleName, ConfigNodePropertyString AuditlogRuleContentpath, ConfigNodePropertyInteger AuditlogRuleMinimumage, ConfigNodePropertyDropDown AuditlogRuleTypes)
        {
            
            this.AuditlogRuleName = AuditlogRuleName;
            
            this.AuditlogRuleContentpath = AuditlogRuleContentpath;
            
            this.AuditlogRuleMinimumage = AuditlogRuleMinimumage;
            
            this.AuditlogRuleTypes = AuditlogRuleTypes;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqAuditPurgeReplicationProperties.
        /// </summary>
        /// <returns>ComAdobeCqAuditPurgeReplicationPropertiesBuilder</returns>
        public static ComAdobeCqAuditPurgeReplicationPropertiesBuilder Builder()
        {
            return new ComAdobeCqAuditPurgeReplicationPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqAuditPurgeReplicationPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqAuditPurgeReplicationPropertiesBuilder</returns>
        public ComAdobeCqAuditPurgeReplicationPropertiesBuilder With()
        {
            return Builder()
                .AuditlogRuleName(AuditlogRuleName)
                .AuditlogRuleContentpath(AuditlogRuleContentpath)
                .AuditlogRuleMinimumage(AuditlogRuleMinimumage)
                .AuditlogRuleTypes(AuditlogRuleTypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqAuditPurgeReplicationProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqAuditPurgeReplicationProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAuditPurgeReplicationProperties</param>
        /// <param name="right">Compared (ComAdobeCqAuditPurgeReplicationProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqAuditPurgeReplicationProperties left, ComAdobeCqAuditPurgeReplicationProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqAuditPurgeReplicationProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAuditPurgeReplicationProperties</param>
        /// <param name="right">Compared (ComAdobeCqAuditPurgeReplicationProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqAuditPurgeReplicationProperties left, ComAdobeCqAuditPurgeReplicationProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqAuditPurgeReplicationProperties.
        /// </summary>
        public sealed class ComAdobeCqAuditPurgeReplicationPropertiesBuilder
        {
            private ConfigNodePropertyString _AuditlogRuleName;
            private ConfigNodePropertyString _AuditlogRuleContentpath;
            private ConfigNodePropertyInteger _AuditlogRuleMinimumage;
            private ConfigNodePropertyDropDown _AuditlogRuleTypes;

            internal ComAdobeCqAuditPurgeReplicationPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeReplicationProperties.AuditlogRuleName property.
            /// </summary>
            /// <param name="value">AuditlogRuleName</param>
            public ComAdobeCqAuditPurgeReplicationPropertiesBuilder AuditlogRuleName(ConfigNodePropertyString value)
            {
                _AuditlogRuleName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeReplicationProperties.AuditlogRuleContentpath property.
            /// </summary>
            /// <param name="value">AuditlogRuleContentpath</param>
            public ComAdobeCqAuditPurgeReplicationPropertiesBuilder AuditlogRuleContentpath(ConfigNodePropertyString value)
            {
                _AuditlogRuleContentpath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeReplicationProperties.AuditlogRuleMinimumage property.
            /// </summary>
            /// <param name="value">AuditlogRuleMinimumage</param>
            public ComAdobeCqAuditPurgeReplicationPropertiesBuilder AuditlogRuleMinimumage(ConfigNodePropertyInteger value)
            {
                _AuditlogRuleMinimumage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeReplicationProperties.AuditlogRuleTypes property.
            /// </summary>
            /// <param name="value">AuditlogRuleTypes</param>
            public ComAdobeCqAuditPurgeReplicationPropertiesBuilder AuditlogRuleTypes(ConfigNodePropertyDropDown value)
            {
                _AuditlogRuleTypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqAuditPurgeReplicationProperties.
            /// </summary>
            /// <returns>ComAdobeCqAuditPurgeReplicationProperties</returns>
            public ComAdobeCqAuditPurgeReplicationProperties Build()
            {
                Validate();
                return new ComAdobeCqAuditPurgeReplicationProperties(
                    AuditlogRuleName: _AuditlogRuleName,
                    AuditlogRuleContentpath: _AuditlogRuleContentpath,
                    AuditlogRuleMinimumage: _AuditlogRuleMinimumage,
                    AuditlogRuleTypes: _AuditlogRuleTypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}