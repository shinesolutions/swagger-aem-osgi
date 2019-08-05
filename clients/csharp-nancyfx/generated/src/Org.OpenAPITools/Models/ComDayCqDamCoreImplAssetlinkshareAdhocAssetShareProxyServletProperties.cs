using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties:  IEquatable<ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties>
    { 
        /// <summary>
        /// CqDamAdhocAssetSharePrezipMaxcontentsize
        /// </summary>
        public ConfigNodePropertyInteger CqDamAdhocAssetSharePrezipMaxcontentsize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties()
        {
        }

        private ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties(ConfigNodePropertyInteger CqDamAdhocAssetSharePrezipMaxcontentsize)
        {
            
            this.CqDamAdhocAssetSharePrezipMaxcontentsize = CqDamAdhocAssetSharePrezipMaxcontentsize;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder With()
        {
            return Builder()
                .CqDamAdhocAssetSharePrezipMaxcontentsize(CqDamAdhocAssetSharePrezipMaxcontentsize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties left, ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties left, ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqDamAdhocAssetSharePrezipMaxcontentsize;

            internal ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.CqDamAdhocAssetSharePrezipMaxcontentsize property.
            /// </summary>
            /// <param name="value">CqDamAdhocAssetSharePrezipMaxcontentsize</param>
            public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder CqDamAdhocAssetSharePrezipMaxcontentsize(ConfigNodePropertyInteger value)
            {
                _CqDamAdhocAssetSharePrezipMaxcontentsize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties</returns>
            public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties(
                    CqDamAdhocAssetSharePrezipMaxcontentsize: _CqDamAdhocAssetSharePrezipMaxcontentsize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}