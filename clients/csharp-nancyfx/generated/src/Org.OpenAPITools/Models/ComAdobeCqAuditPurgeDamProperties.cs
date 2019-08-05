using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqAuditPurgeDamProperties
    /// </summary>
    public sealed class ComAdobeCqAuditPurgeDamProperties:  IEquatable<ComAdobeCqAuditPurgeDamProperties>
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
        /// Use ComAdobeCqAuditPurgeDamProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqAuditPurgeDamProperties()
        {
        }

        private ComAdobeCqAuditPurgeDamProperties(ConfigNodePropertyString AuditlogRuleName, ConfigNodePropertyString AuditlogRuleContentpath, ConfigNodePropertyInteger AuditlogRuleMinimumage, ConfigNodePropertyDropDown AuditlogRuleTypes)
        {
            
            this.AuditlogRuleName = AuditlogRuleName;
            
            this.AuditlogRuleContentpath = AuditlogRuleContentpath;
            
            this.AuditlogRuleMinimumage = AuditlogRuleMinimumage;
            
            this.AuditlogRuleTypes = AuditlogRuleTypes;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqAuditPurgeDamProperties.
        /// </summary>
        /// <returns>ComAdobeCqAuditPurgeDamPropertiesBuilder</returns>
        public static ComAdobeCqAuditPurgeDamPropertiesBuilder Builder()
        {
            return new ComAdobeCqAuditPurgeDamPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqAuditPurgeDamPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqAuditPurgeDamPropertiesBuilder</returns>
        public ComAdobeCqAuditPurgeDamPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqAuditPurgeDamProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqAuditPurgeDamProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAuditPurgeDamProperties</param>
        /// <param name="right">Compared (ComAdobeCqAuditPurgeDamProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqAuditPurgeDamProperties left, ComAdobeCqAuditPurgeDamProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqAuditPurgeDamProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAuditPurgeDamProperties</param>
        /// <param name="right">Compared (ComAdobeCqAuditPurgeDamProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqAuditPurgeDamProperties left, ComAdobeCqAuditPurgeDamProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqAuditPurgeDamProperties.
        /// </summary>
        public sealed class ComAdobeCqAuditPurgeDamPropertiesBuilder
        {
            private ConfigNodePropertyString _AuditlogRuleName;
            private ConfigNodePropertyString _AuditlogRuleContentpath;
            private ConfigNodePropertyInteger _AuditlogRuleMinimumage;
            private ConfigNodePropertyDropDown _AuditlogRuleTypes;

            internal ComAdobeCqAuditPurgeDamPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeDamProperties.AuditlogRuleName property.
            /// </summary>
            /// <param name="value">AuditlogRuleName</param>
            public ComAdobeCqAuditPurgeDamPropertiesBuilder AuditlogRuleName(ConfigNodePropertyString value)
            {
                _AuditlogRuleName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeDamProperties.AuditlogRuleContentpath property.
            /// </summary>
            /// <param name="value">AuditlogRuleContentpath</param>
            public ComAdobeCqAuditPurgeDamPropertiesBuilder AuditlogRuleContentpath(ConfigNodePropertyString value)
            {
                _AuditlogRuleContentpath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeDamProperties.AuditlogRuleMinimumage property.
            /// </summary>
            /// <param name="value">AuditlogRuleMinimumage</param>
            public ComAdobeCqAuditPurgeDamPropertiesBuilder AuditlogRuleMinimumage(ConfigNodePropertyInteger value)
            {
                _AuditlogRuleMinimumage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeDamProperties.AuditlogRuleTypes property.
            /// </summary>
            /// <param name="value">AuditlogRuleTypes</param>
            public ComAdobeCqAuditPurgeDamPropertiesBuilder AuditlogRuleTypes(ConfigNodePropertyDropDown value)
            {
                _AuditlogRuleTypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqAuditPurgeDamProperties.
            /// </summary>
            /// <returns>ComAdobeCqAuditPurgeDamProperties</returns>
            public ComAdobeCqAuditPurgeDamProperties Build()
            {
                Validate();
                return new ComAdobeCqAuditPurgeDamProperties(
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