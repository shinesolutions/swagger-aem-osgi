using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletCompanionServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletCompanionServletProperties:  IEquatable<ComDayCqDamCoreImplServletCompanionServletProperties>
    { 
        /// <summary>
        /// MoreInfo
        /// </summary>
        public ConfigNodePropertyString MoreInfo { get; private set; }

        /// <summary>
        /// MntoverlaydamguicontentassetsmoreinfoHtmlpath
        /// </summary>
        public ConfigNodePropertyString MntoverlaydamguicontentassetsmoreinfoHtmlpath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletCompanionServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletCompanionServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletCompanionServletProperties(ConfigNodePropertyString MoreInfo, ConfigNodePropertyString MntoverlaydamguicontentassetsmoreinfoHtmlpath)
        {
            
            this.MoreInfo = MoreInfo;
            
            this.MntoverlaydamguicontentassetsmoreinfoHtmlpath = MntoverlaydamguicontentassetsmoreinfoHtmlpath;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletCompanionServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder With()
        {
            return Builder()
                .MoreInfo(MoreInfo)
                .MntoverlaydamguicontentassetsmoreinfoHtmlpath(MntoverlaydamguicontentassetsmoreinfoHtmlpath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletCompanionServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletCompanionServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCompanionServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCompanionServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletCompanionServletProperties left, ComDayCqDamCoreImplServletCompanionServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletCompanionServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCompanionServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCompanionServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletCompanionServletProperties left, ComDayCqDamCoreImplServletCompanionServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletCompanionServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder
        {
            private ConfigNodePropertyString _MoreInfo;
            private ConfigNodePropertyString _MntoverlaydamguicontentassetsmoreinfoHtmlpath;

            internal ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCompanionServletProperties.MoreInfo property.
            /// </summary>
            /// <param name="value">MoreInfo</param>
            public ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder MoreInfo(ConfigNodePropertyString value)
            {
                _MoreInfo = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCompanionServletProperties.MntoverlaydamguicontentassetsmoreinfoHtmlpath property.
            /// </summary>
            /// <param name="value">MntoverlaydamguicontentassetsmoreinfoHtmlpath</param>
            public ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder MntoverlaydamguicontentassetsmoreinfoHtmlpath(ConfigNodePropertyString value)
            {
                _MntoverlaydamguicontentassetsmoreinfoHtmlpath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletCompanionServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletCompanionServletProperties</returns>
            public ComDayCqDamCoreImplServletCompanionServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletCompanionServletProperties(
                    MoreInfo: _MoreInfo,
                    MntoverlaydamguicontentassetsmoreinfoHtmlpath: _MntoverlaydamguicontentassetsmoreinfoHtmlpath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}