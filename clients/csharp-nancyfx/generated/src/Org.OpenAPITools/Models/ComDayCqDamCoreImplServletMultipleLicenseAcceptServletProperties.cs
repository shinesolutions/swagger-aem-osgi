using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties:  IEquatable<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties>
    { 
        /// <summary>
        /// CqDamDrmEnable
        /// </summary>
        public ConfigNodePropertyBoolean CqDamDrmEnable { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties(ConfigNodePropertyBoolean CqDamDrmEnable)
        {
            
            this.CqDamDrmEnable = CqDamDrmEnable;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder With()
        {
            return Builder()
                .CqDamDrmEnable(CqDamDrmEnable);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties left, ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties left, ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqDamDrmEnable;

            internal ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.CqDamDrmEnable property.
            /// </summary>
            /// <param name="value">CqDamDrmEnable</param>
            public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder CqDamDrmEnable(ConfigNodePropertyBoolean value)
            {
                _CqDamDrmEnable = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties</returns>
            public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties(
                    CqDamDrmEnable: _CqDamDrmEnable
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}