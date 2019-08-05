using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDeserfwImplDeserializationFirewallImplProperties
    /// </summary>
    public sealed class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties:  IEquatable<ComAdobeCqDeserfwImplDeserializationFirewallImplProperties>
    { 
        /// <summary>
        /// FirewallDeserializationWhitelist
        /// </summary>
        public ConfigNodePropertyArray FirewallDeserializationWhitelist { get; private set; }

        /// <summary>
        /// FirewallDeserializationBlacklist
        /// </summary>
        public ConfigNodePropertyArray FirewallDeserializationBlacklist { get; private set; }

        /// <summary>
        /// FirewallDeserializationDiagnostics
        /// </summary>
        public ConfigNodePropertyString FirewallDeserializationDiagnostics { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties()
        {
        }

        private ComAdobeCqDeserfwImplDeserializationFirewallImplProperties(ConfigNodePropertyArray FirewallDeserializationWhitelist, ConfigNodePropertyArray FirewallDeserializationBlacklist, ConfigNodePropertyString FirewallDeserializationDiagnostics)
        {
            
            this.FirewallDeserializationWhitelist = FirewallDeserializationWhitelist;
            
            this.FirewallDeserializationBlacklist = FirewallDeserializationBlacklist;
            
            this.FirewallDeserializationDiagnostics = FirewallDeserializationDiagnostics;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder</returns>
        public static ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder</returns>
        public ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder With()
        {
            return Builder()
                .FirewallDeserializationWhitelist(FirewallDeserializationWhitelist)
                .FirewallDeserializationBlacklist(FirewallDeserializationBlacklist)
                .FirewallDeserializationDiagnostics(FirewallDeserializationDiagnostics);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDeserfwImplDeserializationFirewallImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDeserfwImplDeserializationFirewallImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDeserfwImplDeserializationFirewallImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDeserfwImplDeserializationFirewallImplProperties left, ComAdobeCqDeserfwImplDeserializationFirewallImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDeserfwImplDeserializationFirewallImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDeserfwImplDeserializationFirewallImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDeserfwImplDeserializationFirewallImplProperties left, ComAdobeCqDeserfwImplDeserializationFirewallImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.
        /// </summary>
        public sealed class ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _FirewallDeserializationWhitelist;
            private ConfigNodePropertyArray _FirewallDeserializationBlacklist;
            private ConfigNodePropertyString _FirewallDeserializationDiagnostics;

            internal ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.FirewallDeserializationWhitelist property.
            /// </summary>
            /// <param name="value">FirewallDeserializationWhitelist</param>
            public ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder FirewallDeserializationWhitelist(ConfigNodePropertyArray value)
            {
                _FirewallDeserializationWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.FirewallDeserializationBlacklist property.
            /// </summary>
            /// <param name="value">FirewallDeserializationBlacklist</param>
            public ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder FirewallDeserializationBlacklist(ConfigNodePropertyArray value)
            {
                _FirewallDeserializationBlacklist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.FirewallDeserializationDiagnostics property.
            /// </summary>
            /// <param name="value">FirewallDeserializationDiagnostics</param>
            public ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder FirewallDeserializationDiagnostics(ConfigNodePropertyString value)
            {
                _FirewallDeserializationDiagnostics = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqDeserfwImplDeserializationFirewallImplProperties</returns>
            public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties Build()
            {
                Validate();
                return new ComAdobeCqDeserfwImplDeserializationFirewallImplProperties(
                    FirewallDeserializationWhitelist: _FirewallDeserializationWhitelist,
                    FirewallDeserializationBlacklist: _FirewallDeserializationBlacklist,
                    FirewallDeserializationDiagnostics: _FirewallDeserializationDiagnostics
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}