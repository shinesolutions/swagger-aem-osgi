using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqAuditPurgePagesProperties
    /// </summary>
    public sealed class ComAdobeCqAuditPurgePagesProperties:  IEquatable<ComAdobeCqAuditPurgePagesProperties>
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
        /// Use ComAdobeCqAuditPurgePagesProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqAuditPurgePagesProperties()
        {
        }

        private ComAdobeCqAuditPurgePagesProperties(ConfigNodePropertyString AuditlogRuleName, ConfigNodePropertyString AuditlogRuleContentpath, ConfigNodePropertyInteger AuditlogRuleMinimumage, ConfigNodePropertyDropDown AuditlogRuleTypes)
        {
            
            this.AuditlogRuleName = AuditlogRuleName;
            
            this.AuditlogRuleContentpath = AuditlogRuleContentpath;
            
            this.AuditlogRuleMinimumage = AuditlogRuleMinimumage;
            
            this.AuditlogRuleTypes = AuditlogRuleTypes;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqAuditPurgePagesProperties.
        /// </summary>
        /// <returns>ComAdobeCqAuditPurgePagesPropertiesBuilder</returns>
        public static ComAdobeCqAuditPurgePagesPropertiesBuilder Builder()
        {
            return new ComAdobeCqAuditPurgePagesPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqAuditPurgePagesPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqAuditPurgePagesPropertiesBuilder</returns>
        public ComAdobeCqAuditPurgePagesPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqAuditPurgePagesProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqAuditPurgePagesProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAuditPurgePagesProperties</param>
        /// <param name="right">Compared (ComAdobeCqAuditPurgePagesProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqAuditPurgePagesProperties left, ComAdobeCqAuditPurgePagesProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqAuditPurgePagesProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAuditPurgePagesProperties</param>
        /// <param name="right">Compared (ComAdobeCqAuditPurgePagesProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqAuditPurgePagesProperties left, ComAdobeCqAuditPurgePagesProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqAuditPurgePagesProperties.
        /// </summary>
        public sealed class ComAdobeCqAuditPurgePagesPropertiesBuilder
        {
            private ConfigNodePropertyString _AuditlogRuleName;
            private ConfigNodePropertyString _AuditlogRuleContentpath;
            private ConfigNodePropertyInteger _AuditlogRuleMinimumage;
            private ConfigNodePropertyDropDown _AuditlogRuleTypes;

            internal ComAdobeCqAuditPurgePagesPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgePagesProperties.AuditlogRuleName property.
            /// </summary>
            /// <param name="value">AuditlogRuleName</param>
            public ComAdobeCqAuditPurgePagesPropertiesBuilder AuditlogRuleName(ConfigNodePropertyString value)
            {
                _AuditlogRuleName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgePagesProperties.AuditlogRuleContentpath property.
            /// </summary>
            /// <param name="value">AuditlogRuleContentpath</param>
            public ComAdobeCqAuditPurgePagesPropertiesBuilder AuditlogRuleContentpath(ConfigNodePropertyString value)
            {
                _AuditlogRuleContentpath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgePagesProperties.AuditlogRuleMinimumage property.
            /// </summary>
            /// <param name="value">AuditlogRuleMinimumage</param>
            public ComAdobeCqAuditPurgePagesPropertiesBuilder AuditlogRuleMinimumage(ConfigNodePropertyInteger value)
            {
                _AuditlogRuleMinimumage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgePagesProperties.AuditlogRuleTypes property.
            /// </summary>
            /// <param name="value">AuditlogRuleTypes</param>
            public ComAdobeCqAuditPurgePagesPropertiesBuilder AuditlogRuleTypes(ConfigNodePropertyDropDown value)
            {
                _AuditlogRuleTypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqAuditPurgePagesProperties.
            /// </summary>
            /// <returns>ComAdobeCqAuditPurgePagesProperties</returns>
            public ComAdobeCqAuditPurgePagesProperties Build()
            {
                Validate();
                return new ComAdobeCqAuditPurgePagesProperties(
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