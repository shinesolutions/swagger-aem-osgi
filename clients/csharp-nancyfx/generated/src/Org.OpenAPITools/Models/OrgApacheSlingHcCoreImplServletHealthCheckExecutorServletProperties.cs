using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties
    /// </summary>
    public sealed class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties:  IEquatable<OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties>
    { 
        /// <summary>
        /// ServletPath
        /// </summary>
        public ConfigNodePropertyString ServletPath { get; private set; }

        /// <summary>
        /// Disabled
        /// </summary>
        public ConfigNodePropertyBoolean Disabled { get; private set; }

        /// <summary>
        /// CorsAccessControlAllowOrigin
        /// </summary>
        public ConfigNodePropertyString CorsAccessControlAllowOrigin { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties()
        {
        }

        private OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties(ConfigNodePropertyString ServletPath, ConfigNodePropertyBoolean Disabled, ConfigNodePropertyString CorsAccessControlAllowOrigin)
        {
            
            this.ServletPath = ServletPath;
            
            this.Disabled = Disabled;
            
            this.CorsAccessControlAllowOrigin = CorsAccessControlAllowOrigin;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder</returns>
        public static OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder Builder()
        {
            return new OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder</returns>
        public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder With()
        {
            return Builder()
                .ServletPath(ServletPath)
                .Disabled(Disabled)
                .CorsAccessControlAllowOrigin(CorsAccessControlAllowOrigin);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties left, OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties left, OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.
        /// </summary>
        public sealed class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder
        {
            private ConfigNodePropertyString _ServletPath;
            private ConfigNodePropertyBoolean _Disabled;
            private ConfigNodePropertyString _CorsAccessControlAllowOrigin;

            internal OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.ServletPath property.
            /// </summary>
            /// <param name="value">ServletPath</param>
            public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder ServletPath(ConfigNodePropertyString value)
            {
                _ServletPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.Disabled property.
            /// </summary>
            /// <param name="value">Disabled</param>
            public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder Disabled(ConfigNodePropertyBoolean value)
            {
                _Disabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.CorsAccessControlAllowOrigin property.
            /// </summary>
            /// <param name="value">CorsAccessControlAllowOrigin</param>
            public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder CorsAccessControlAllowOrigin(ConfigNodePropertyString value)
            {
                _CorsAccessControlAllowOrigin = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.
            /// </summary>
            /// <returns>OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties</returns>
            public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties Build()
            {
                Validate();
                return new OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties(
                    ServletPath: _ServletPath,
                    Disabled: _Disabled,
                    CorsAccessControlAllowOrigin: _CorsAccessControlAllowOrigin
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}