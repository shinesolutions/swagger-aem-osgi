using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSyncImplUserSyncListenerImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties:  IEquatable<ComAdobeCqSocialSyncImplUserSyncListenerImplProperties>
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
        public ConfigNodePropertyArray Ignorablenodes { get; private set; }

        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// Distfolders
        /// </summary>
        public ConfigNodePropertyArray Distfolders { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties()
        {
        }

        private ComAdobeCqSocialSyncImplUserSyncListenerImplProperties(ConfigNodePropertyArray Nodetypes, ConfigNodePropertyArray Ignorableprops, ConfigNodePropertyArray Ignorablenodes, ConfigNodePropertyBoolean Enabled, ConfigNodePropertyArray Distfolders)
        {
            
            this.Nodetypes = Nodetypes;
            
            this.Ignorableprops = Ignorableprops;
            
            this.Ignorablenodes = Ignorablenodes;
            
            this.Enabled = Enabled;
            
            this.Distfolders = Distfolders;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder</returns>
        public ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialSyncImplUserSyncListenerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSyncImplUserSyncListenerImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSyncImplUserSyncListenerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSyncImplUserSyncListenerImplProperties left, ComAdobeCqSocialSyncImplUserSyncListenerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSyncImplUserSyncListenerImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSyncImplUserSyncListenerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSyncImplUserSyncListenerImplProperties left, ComAdobeCqSocialSyncImplUserSyncListenerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _Nodetypes;
            private ConfigNodePropertyArray _Ignorableprops;
            private ConfigNodePropertyArray _Ignorablenodes;
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyArray _Distfolders;

            internal ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.Nodetypes property.
            /// </summary>
            /// <param name="value">Nodetypes</param>
            public ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder Nodetypes(ConfigNodePropertyArray value)
            {
                _Nodetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.Ignorableprops property.
            /// </summary>
            /// <param name="value">Ignorableprops</param>
            public ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder Ignorableprops(ConfigNodePropertyArray value)
            {
                _Ignorableprops = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.Ignorablenodes property.
            /// </summary>
            /// <param name="value">Ignorablenodes</param>
            public ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder Ignorablenodes(ConfigNodePropertyArray value)
            {
                _Ignorablenodes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.Distfolders property.
            /// </summary>
            /// <param name="value">Distfolders</param>
            public ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder Distfolders(ConfigNodePropertyArray value)
            {
                _Distfolders = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialSyncImplUserSyncListenerImplProperties</returns>
            public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialSyncImplUserSyncListenerImplProperties(
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