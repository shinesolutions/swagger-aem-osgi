using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties
    /// </summary>
    public sealed class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties:  IEquatable<ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties>
    { 
        /// <summary>
        /// CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName
        /// </summary>
        public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName { get; private set; }

        /// <summary>
        /// CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName
        /// </summary>
        public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName { get; private set; }

        /// <summary>
        /// CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName
        /// </summary>
        public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName { get; private set; }

        /// <summary>
        /// CqDamS7damVideoproxyclientserviceHttpReadtimeoutName
        /// </summary>
        public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceHttpReadtimeoutName { get; private set; }

        /// <summary>
        /// CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName
        /// </summary>
        public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName { get; private set; }

        /// <summary>
        /// CqDamS7damVideoproxyclientserviceHttpMaxretrycountName
        /// </summary>
        public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceHttpMaxretrycountName { get; private set; }

        /// <summary>
        /// CqDamS7damVideoproxyclientserviceUploadprogressIntervalName
        /// </summary>
        public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceUploadprogressIntervalName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties()
        {
        }

        private ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties(ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName, ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName, ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName, ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceHttpReadtimeoutName, ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName, ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceHttpMaxretrycountName, ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceUploadprogressIntervalName)
        {
            
            this.CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName = CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName;
            
            this.CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName = CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName;
            
            this.CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName = CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName;
            
            this.CqDamS7damVideoproxyclientserviceHttpReadtimeoutName = CqDamS7damVideoproxyclientserviceHttpReadtimeoutName;
            
            this.CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName = CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName;
            
            this.CqDamS7damVideoproxyclientserviceHttpMaxretrycountName = CqDamS7damVideoproxyclientserviceHttpMaxretrycountName;
            
            this.CqDamS7damVideoproxyclientserviceUploadprogressIntervalName = CqDamS7damVideoproxyclientserviceUploadprogressIntervalName;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder</returns>
        public static ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder</returns>
        public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder With()
        {
            return Builder()
                .CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName(CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName)
                .CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName(CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName)
                .CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName(CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName)
                .CqDamS7damVideoproxyclientserviceHttpReadtimeoutName(CqDamS7damVideoproxyclientserviceHttpReadtimeoutName)
                .CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName(CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName)
                .CqDamS7damVideoproxyclientserviceHttpMaxretrycountName(CqDamS7damVideoproxyclientserviceHttpMaxretrycountName)
                .CqDamS7damVideoproxyclientserviceUploadprogressIntervalName(CqDamS7damVideoproxyclientserviceUploadprogressIntervalName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties left, ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties left, ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName;
            private ConfigNodePropertyInteger _CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName;
            private ConfigNodePropertyInteger _CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName;
            private ConfigNodePropertyInteger _CqDamS7damVideoproxyclientserviceHttpReadtimeoutName;
            private ConfigNodePropertyInteger _CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName;
            private ConfigNodePropertyInteger _CqDamS7damVideoproxyclientserviceHttpMaxretrycountName;
            private ConfigNodePropertyInteger _CqDamS7damVideoproxyclientserviceUploadprogressIntervalName;

            internal ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName property.
            /// </summary>
            /// <param name="value">CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName</param>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName(ConfigNodePropertyInteger value)
            {
                _CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName property.
            /// </summary>
            /// <param name="value">CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName</param>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName(ConfigNodePropertyInteger value)
            {
                _CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName property.
            /// </summary>
            /// <param name="value">CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName</param>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName(ConfigNodePropertyInteger value)
            {
                _CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.CqDamS7damVideoproxyclientserviceHttpReadtimeoutName property.
            /// </summary>
            /// <param name="value">CqDamS7damVideoproxyclientserviceHttpReadtimeoutName</param>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder CqDamS7damVideoproxyclientserviceHttpReadtimeoutName(ConfigNodePropertyInteger value)
            {
                _CqDamS7damVideoproxyclientserviceHttpReadtimeoutName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName property.
            /// </summary>
            /// <param name="value">CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName</param>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName(ConfigNodePropertyInteger value)
            {
                _CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.CqDamS7damVideoproxyclientserviceHttpMaxretrycountName property.
            /// </summary>
            /// <param name="value">CqDamS7damVideoproxyclientserviceHttpMaxretrycountName</param>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder CqDamS7damVideoproxyclientserviceHttpMaxretrycountName(ConfigNodePropertyInteger value)
            {
                _CqDamS7damVideoproxyclientserviceHttpMaxretrycountName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.CqDamS7damVideoproxyclientserviceUploadprogressIntervalName property.
            /// </summary>
            /// <param name="value">CqDamS7damVideoproxyclientserviceUploadprogressIntervalName</param>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder CqDamS7damVideoproxyclientserviceUploadprogressIntervalName(ConfigNodePropertyInteger value)
            {
                _CqDamS7damVideoproxyclientserviceUploadprogressIntervalName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties</returns>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties(
                    CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName: _CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName,
                    CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName: _CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName,
                    CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName: _CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName,
                    CqDamS7damVideoproxyclientserviceHttpReadtimeoutName: _CqDamS7damVideoproxyclientserviceHttpReadtimeoutName,
                    CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName: _CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName,
                    CqDamS7damVideoproxyclientserviceHttpMaxretrycountName: _CqDamS7damVideoproxyclientserviceHttpMaxretrycountName,
                    CqDamS7damVideoproxyclientserviceUploadprogressIntervalName: _CqDamS7damVideoproxyclientserviceUploadprogressIntervalName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}