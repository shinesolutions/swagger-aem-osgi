using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReportingImplCacheCacheImplProperties
    /// </summary>
    public sealed class ComDayCqReportingImplCacheCacheImplProperties:  IEquatable<ComDayCqReportingImplCacheCacheImplProperties>
    { 
        /// <summary>
        /// RepcacheEnable
        /// </summary>
        public ConfigNodePropertyBoolean RepcacheEnable { get; private set; }

        /// <summary>
        /// RepcacheTtl
        /// </summary>
        public ConfigNodePropertyInteger RepcacheTtl { get; private set; }

        /// <summary>
        /// RepcacheMax
        /// </summary>
        public ConfigNodePropertyInteger RepcacheMax { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReportingImplCacheCacheImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReportingImplCacheCacheImplProperties()
        {
        }

        private ComDayCqReportingImplCacheCacheImplProperties(ConfigNodePropertyBoolean RepcacheEnable, ConfigNodePropertyInteger RepcacheTtl, ConfigNodePropertyInteger RepcacheMax)
        {
            
            this.RepcacheEnable = RepcacheEnable;
            
            this.RepcacheTtl = RepcacheTtl;
            
            this.RepcacheMax = RepcacheMax;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReportingImplCacheCacheImplProperties.
        /// </summary>
        /// <returns>ComDayCqReportingImplCacheCacheImplPropertiesBuilder</returns>
        public static ComDayCqReportingImplCacheCacheImplPropertiesBuilder Builder()
        {
            return new ComDayCqReportingImplCacheCacheImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReportingImplCacheCacheImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReportingImplCacheCacheImplPropertiesBuilder</returns>
        public ComDayCqReportingImplCacheCacheImplPropertiesBuilder With()
        {
            return Builder()
                .RepcacheEnable(RepcacheEnable)
                .RepcacheTtl(RepcacheTtl)
                .RepcacheMax(RepcacheMax);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReportingImplCacheCacheImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReportingImplCacheCacheImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReportingImplCacheCacheImplProperties</param>
        /// <param name="right">Compared (ComDayCqReportingImplCacheCacheImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReportingImplCacheCacheImplProperties left, ComDayCqReportingImplCacheCacheImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReportingImplCacheCacheImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReportingImplCacheCacheImplProperties</param>
        /// <param name="right">Compared (ComDayCqReportingImplCacheCacheImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReportingImplCacheCacheImplProperties left, ComDayCqReportingImplCacheCacheImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReportingImplCacheCacheImplProperties.
        /// </summary>
        public sealed class ComDayCqReportingImplCacheCacheImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _RepcacheEnable;
            private ConfigNodePropertyInteger _RepcacheTtl;
            private ConfigNodePropertyInteger _RepcacheMax;

            internal ComDayCqReportingImplCacheCacheImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplCacheCacheImplProperties.RepcacheEnable property.
            /// </summary>
            /// <param name="value">RepcacheEnable</param>
            public ComDayCqReportingImplCacheCacheImplPropertiesBuilder RepcacheEnable(ConfigNodePropertyBoolean value)
            {
                _RepcacheEnable = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplCacheCacheImplProperties.RepcacheTtl property.
            /// </summary>
            /// <param name="value">RepcacheTtl</param>
            public ComDayCqReportingImplCacheCacheImplPropertiesBuilder RepcacheTtl(ConfigNodePropertyInteger value)
            {
                _RepcacheTtl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplCacheCacheImplProperties.RepcacheMax property.
            /// </summary>
            /// <param name="value">RepcacheMax</param>
            public ComDayCqReportingImplCacheCacheImplPropertiesBuilder RepcacheMax(ConfigNodePropertyInteger value)
            {
                _RepcacheMax = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReportingImplCacheCacheImplProperties.
            /// </summary>
            /// <returns>ComDayCqReportingImplCacheCacheImplProperties</returns>
            public ComDayCqReportingImplCacheCacheImplProperties Build()
            {
                Validate();
                return new ComDayCqReportingImplCacheCacheImplProperties(
                    RepcacheEnable: _RepcacheEnable,
                    RepcacheTtl: _RepcacheTtl,
                    RepcacheMax: _RepcacheMax
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}