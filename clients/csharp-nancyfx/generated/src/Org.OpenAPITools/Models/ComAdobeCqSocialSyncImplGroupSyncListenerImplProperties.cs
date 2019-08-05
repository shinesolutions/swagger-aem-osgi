using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties:  IEquatable<ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties>
    { 
        /// <summary>
        /// Nodetypes
        /// </summary>
        public ConfigNodePropertyArray Nodetypes { get; private set; }

        /// <summary>
        /// Ignorableprops
        /// </summary>
        public ConfigNodePropertyArray Ignorableprops { get; private set; }

        /// <summary>
        /// Ignorablenodes
        /// </summary>
        public ConfigNodePropertyString Ignorablenodes { get; private set; }

        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// Distfolders
        /// </summary>
        public ConfigNodePropertyString Distfolders { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties()
        {
        }

        private ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties(ConfigNodePropertyArray Nodetypes, ConfigNodePropertyArray Ignorableprops, ConfigNodePropertyString Ignorablenodes, ConfigNodePropertyBoolean Enabled, ConfigNodePropertyString Distfolders)
        {
            
            this.Nodetypes = Nodetypes;
            
            this.Ignorableprops = Ignorableprops;
            
            this.Ignorablenodes = Ignorablenodes;
            
            this.Enabled = Enabled;
            
            this.Distfolders = Distfolders;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder</returns>
        public ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder With()
        {
            return Builder()
                .Nodetypes(Nodetypes)
                .Ignorableprops(Ignorableprops)
                .Ignorablenodes(Ignorablenodes)
                .Enabled(Enabled)
                .Distfolders(Distfolders);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties left, ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties left, ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _Nodetypes;
            private ConfigNodePropertyArray _Ignorableprops;
            private ConfigNodePropertyString _Ignorablenodes;
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyString _Distfolders;

            internal ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.Nodetypes property.
            /// </summary>
            /// <param name="value">Nodetypes</param>
            public ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder Nodetypes(ConfigNodePropertyArray value)
            {
                _Nodetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.Ignorableprops property.
            /// </summary>
            /// <param name="value">Ignorableprops</param>
            public ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder Ignorableprops(ConfigNodePropertyArray value)
            {
                _Ignorableprops = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.Ignorablenodes property.
            /// </summary>
            /// <param name="value">Ignorablenodes</param>
            public ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder Ignorablenodes(ConfigNodePropertyString value)
            {
                _Ignorablenodes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.Distfolders property.
            /// </summary>
            /// <param name="value">Distfolders</param>
            public ComAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesBuilder Distfolders(ConfigNodePropertyString value)
            {
                _Distfolders = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties</returns>
            public ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties(
                    Nodetypes: _Nodetypes,
                    Ignorableprops: _Ignorableprops,
                    Ignorablenodes: _Ignorablenodes,
                    Enabled: _Enabled,
                    Distfolders: _Distfolders
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}