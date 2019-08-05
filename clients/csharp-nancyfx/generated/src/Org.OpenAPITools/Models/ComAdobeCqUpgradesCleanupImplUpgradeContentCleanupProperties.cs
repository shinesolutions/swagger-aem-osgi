using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties
    /// </summary>
    public sealed class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties:  IEquatable<ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties>
    { 
        /// <summary>
        /// DeletePathRegexps
        /// </summary>
        public ConfigNodePropertyArray DeletePathRegexps { get; private set; }

        /// <summary>
        /// DeleteSql2Query
        /// </summary>
        public ConfigNodePropertyString DeleteSql2Query { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties()
        {
        }

        private ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties(ConfigNodePropertyArray DeletePathRegexps, ConfigNodePropertyString DeleteSql2Query)
        {
            
            this.DeletePathRegexps = DeletePathRegexps;
            
            this.DeleteSql2Query = DeleteSql2Query;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.
        /// </summary>
        /// <returns>ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder</returns>
        public static ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder Builder()
        {
            return new ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder</returns>
        public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder With()
        {
            return Builder()
                .DeletePathRegexps(DeletePathRegexps)
                .DeleteSql2Query(DeleteSql2Query);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties</param>
        /// <param name="right">Compared (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties left, ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties</param>
        /// <param name="right">Compared (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties left, ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.
        /// </summary>
        public sealed class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder
        {
            private ConfigNodePropertyArray _DeletePathRegexps;
            private ConfigNodePropertyString _DeleteSql2Query;

            internal ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.DeletePathRegexps property.
            /// </summary>
            /// <param name="value">DeletePathRegexps</param>
            public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder DeletePathRegexps(ConfigNodePropertyArray value)
            {
                _DeletePathRegexps = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.DeleteSql2Query property.
            /// </summary>
            /// <param name="value">DeleteSql2Query</param>
            public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder DeleteSql2Query(ConfigNodePropertyString value)
            {
                _DeleteSql2Query = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.
            /// </summary>
            /// <returns>ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties</returns>
            public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties Build()
            {
                Validate();
                return new ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties(
                    DeletePathRegexps: _DeletePathRegexps,
                    DeleteSql2Query: _DeleteSql2Query
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}