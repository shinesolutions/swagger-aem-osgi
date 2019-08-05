using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties
    /// </summary>
    public sealed class OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties:  IEquatable<OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties>
    { 
        /// <summary>
        /// MaxSize
        /// </summary>
        public ConfigNodePropertyInteger MaxSize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties()
        {
        }

        private OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties(ConfigNodePropertyInteger MaxSize)
        {
            
            this.MaxSize = MaxSize;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.
        /// </summary>
        /// <returns>OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder</returns>
        public static OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder Builder()
        {
            return new OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder</returns>
        public OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder With()
        {
            return Builder()
                .MaxSize(MaxSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties</param>
        /// <param name="right">Compared (OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties left, OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties</param>
        /// <param name="right">Compared (OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties left, OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.
        /// </summary>
        public sealed class OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MaxSize;

            internal OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.MaxSize property.
            /// </summary>
            /// <param name="value">MaxSize</param>
            public OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder MaxSize(ConfigNodePropertyInteger value)
            {
                _MaxSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.
            /// </summary>
            /// <returns>OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties</returns>
            public OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties Build()
            {
                Validate();
                return new OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties(
                    MaxSize: _MaxSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}