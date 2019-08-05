using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWidgetImplHtmlLibraryManagerImplProperties
    /// </summary>
    public sealed class ComDayCqWidgetImplHtmlLibraryManagerImplProperties:  IEquatable<ComDayCqWidgetImplHtmlLibraryManagerImplProperties>
    { 
        /// <summary>
        /// HtmllibmanagerClientmanager
        /// </summary>
        public ConfigNodePropertyString HtmllibmanagerClientmanager { get; private set; }

        /// <summary>
        /// HtmllibmanagerDebug
        /// </summary>
        public ConfigNodePropertyBoolean HtmllibmanagerDebug { get; private set; }

        /// <summary>
        /// HtmllibmanagerDebugConsole
        /// </summary>
        public ConfigNodePropertyBoolean HtmllibmanagerDebugConsole { get; private set; }

        /// <summary>
        /// HtmllibmanagerDebugInitJs
        /// </summary>
        public ConfigNodePropertyString HtmllibmanagerDebugInitJs { get; private set; }

        /// <summary>
        /// HtmllibmanagerDefaultthemename
        /// </summary>
        public ConfigNodePropertyString HtmllibmanagerDefaultthemename { get; private set; }

        /// <summary>
        /// HtmllibmanagerDefaultuserthemename
        /// </summary>
        public ConfigNodePropertyString HtmllibmanagerDefaultuserthemename { get; private set; }

        /// <summary>
        /// HtmllibmanagerFirebuglitePath
        /// </summary>
        public ConfigNodePropertyString HtmllibmanagerFirebuglitePath { get; private set; }

        /// <summary>
        /// HtmllibmanagerForceCQUrlInfo
        /// </summary>
        public ConfigNodePropertyBoolean HtmllibmanagerForceCQUrlInfo { get; private set; }

        /// <summary>
        /// HtmllibmanagerGzip
        /// </summary>
        public ConfigNodePropertyBoolean HtmllibmanagerGzip { get; private set; }

        /// <summary>
        /// HtmllibmanagerMaxage
        /// </summary>
        public ConfigNodePropertyInteger HtmllibmanagerMaxage { get; private set; }

        /// <summary>
        /// HtmllibmanagerMaxDataUriSize
        /// </summary>
        public ConfigNodePropertyInteger HtmllibmanagerMaxDataUriSize { get; private set; }

        /// <summary>
        /// HtmllibmanagerMinify
        /// </summary>
        public ConfigNodePropertyBoolean HtmllibmanagerMinify { get; private set; }

        /// <summary>
        /// HtmllibmanagerPathList
        /// </summary>
        public ConfigNodePropertyArray HtmllibmanagerPathList { get; private set; }

        /// <summary>
        /// HtmllibmanagerTiming
        /// </summary>
        public ConfigNodePropertyBoolean HtmllibmanagerTiming { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWidgetImplHtmlLibraryManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWidgetImplHtmlLibraryManagerImplProperties()
        {
        }

        private ComDayCqWidgetImplHtmlLibraryManagerImplProperties(ConfigNodePropertyString HtmllibmanagerClientmanager, ConfigNodePropertyBoolean HtmllibmanagerDebug, ConfigNodePropertyBoolean HtmllibmanagerDebugConsole, ConfigNodePropertyString HtmllibmanagerDebugInitJs, ConfigNodePropertyString HtmllibmanagerDefaultthemename, ConfigNodePropertyString HtmllibmanagerDefaultuserthemename, ConfigNodePropertyString HtmllibmanagerFirebuglitePath, ConfigNodePropertyBoolean HtmllibmanagerForceCQUrlInfo, ConfigNodePropertyBoolean HtmllibmanagerGzip, ConfigNodePropertyInteger HtmllibmanagerMaxage, ConfigNodePropertyInteger HtmllibmanagerMaxDataUriSize, ConfigNodePropertyBoolean HtmllibmanagerMinify, ConfigNodePropertyArray HtmllibmanagerPathList, ConfigNodePropertyBoolean HtmllibmanagerTiming)
        {
            
            this.HtmllibmanagerClientmanager = HtmllibmanagerClientmanager;
            
            this.HtmllibmanagerDebug = HtmllibmanagerDebug;
            
            this.HtmllibmanagerDebugConsole = HtmllibmanagerDebugConsole;
            
            this.HtmllibmanagerDebugInitJs = HtmllibmanagerDebugInitJs;
            
            this.HtmllibmanagerDefaultthemename = HtmllibmanagerDefaultthemename;
            
            this.HtmllibmanagerDefaultuserthemename = HtmllibmanagerDefaultuserthemename;
            
            this.HtmllibmanagerFirebuglitePath = HtmllibmanagerFirebuglitePath;
            
            this.HtmllibmanagerForceCQUrlInfo = HtmllibmanagerForceCQUrlInfo;
            
            this.HtmllibmanagerGzip = HtmllibmanagerGzip;
            
            this.HtmllibmanagerMaxage = HtmllibmanagerMaxage;
            
            this.HtmllibmanagerMaxDataUriSize = HtmllibmanagerMaxDataUriSize;
            
            this.HtmllibmanagerMinify = HtmllibmanagerMinify;
            
            this.HtmllibmanagerPathList = HtmllibmanagerPathList;
            
            this.HtmllibmanagerTiming = HtmllibmanagerTiming;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWidgetImplHtmlLibraryManagerImplProperties.
        /// </summary>
        /// <returns>ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder</returns>
        public static ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder Builder()
        {
            return new ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder</returns>
        public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder With()
        {
            return Builder()
                .HtmllibmanagerClientmanager(HtmllibmanagerClientmanager)
                .HtmllibmanagerDebug(HtmllibmanagerDebug)
                .HtmllibmanagerDebugConsole(HtmllibmanagerDebugConsole)
                .HtmllibmanagerDebugInitJs(HtmllibmanagerDebugInitJs)
                .HtmllibmanagerDefaultthemename(HtmllibmanagerDefaultthemename)
                .HtmllibmanagerDefaultuserthemename(HtmllibmanagerDefaultuserthemename)
                .HtmllibmanagerFirebuglitePath(HtmllibmanagerFirebuglitePath)
                .HtmllibmanagerForceCQUrlInfo(HtmllibmanagerForceCQUrlInfo)
                .HtmllibmanagerGzip(HtmllibmanagerGzip)
                .HtmllibmanagerMaxage(HtmllibmanagerMaxage)
                .HtmllibmanagerMaxDataUriSize(HtmllibmanagerMaxDataUriSize)
                .HtmllibmanagerMinify(HtmllibmanagerMinify)
                .HtmllibmanagerPathList(HtmllibmanagerPathList)
                .HtmllibmanagerTiming(HtmllibmanagerTiming);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWidgetImplHtmlLibraryManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWidgetImplHtmlLibraryManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWidgetImplHtmlLibraryManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqWidgetImplHtmlLibraryManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWidgetImplHtmlLibraryManagerImplProperties left, ComDayCqWidgetImplHtmlLibraryManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWidgetImplHtmlLibraryManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWidgetImplHtmlLibraryManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqWidgetImplHtmlLibraryManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWidgetImplHtmlLibraryManagerImplProperties left, ComDayCqWidgetImplHtmlLibraryManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWidgetImplHtmlLibraryManagerImplProperties.
        /// </summary>
        public sealed class ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyString _HtmllibmanagerClientmanager;
            private ConfigNodePropertyBoolean _HtmllibmanagerDebug;
            private ConfigNodePropertyBoolean _HtmllibmanagerDebugConsole;
            private ConfigNodePropertyString _HtmllibmanagerDebugInitJs;
            private ConfigNodePropertyString _HtmllibmanagerDefaultthemename;
            private ConfigNodePropertyString _HtmllibmanagerDefaultuserthemename;
            private ConfigNodePropertyString _HtmllibmanagerFirebuglitePath;
            private ConfigNodePropertyBoolean _HtmllibmanagerForceCQUrlInfo;
            private ConfigNodePropertyBoolean _HtmllibmanagerGzip;
            private ConfigNodePropertyInteger _HtmllibmanagerMaxage;
            private ConfigNodePropertyInteger _HtmllibmanagerMaxDataUriSize;
            private ConfigNodePropertyBoolean _HtmllibmanagerMinify;
            private ConfigNodePropertyArray _HtmllibmanagerPathList;
            private ConfigNodePropertyBoolean _HtmllibmanagerTiming;

            internal ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerClientmanager property.
            /// </summary>
            /// <param name="value">HtmllibmanagerClientmanager</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerClientmanager(ConfigNodePropertyString value)
            {
                _HtmllibmanagerClientmanager = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerDebug property.
            /// </summary>
            /// <param name="value">HtmllibmanagerDebug</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerDebug(ConfigNodePropertyBoolean value)
            {
                _HtmllibmanagerDebug = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerDebugConsole property.
            /// </summary>
            /// <param name="value">HtmllibmanagerDebugConsole</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerDebugConsole(ConfigNodePropertyBoolean value)
            {
                _HtmllibmanagerDebugConsole = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerDebugInitJs property.
            /// </summary>
            /// <param name="value">HtmllibmanagerDebugInitJs</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerDebugInitJs(ConfigNodePropertyString value)
            {
                _HtmllibmanagerDebugInitJs = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerDefaultthemename property.
            /// </summary>
            /// <param name="value">HtmllibmanagerDefaultthemename</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerDefaultthemename(ConfigNodePropertyString value)
            {
                _HtmllibmanagerDefaultthemename = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerDefaultuserthemename property.
            /// </summary>
            /// <param name="value">HtmllibmanagerDefaultuserthemename</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerDefaultuserthemename(ConfigNodePropertyString value)
            {
                _HtmllibmanagerDefaultuserthemename = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerFirebuglitePath property.
            /// </summary>
            /// <param name="value">HtmllibmanagerFirebuglitePath</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerFirebuglitePath(ConfigNodePropertyString value)
            {
                _HtmllibmanagerFirebuglitePath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerForceCQUrlInfo property.
            /// </summary>
            /// <param name="value">HtmllibmanagerForceCQUrlInfo</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean value)
            {
                _HtmllibmanagerForceCQUrlInfo = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerGzip property.
            /// </summary>
            /// <param name="value">HtmllibmanagerGzip</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerGzip(ConfigNodePropertyBoolean value)
            {
                _HtmllibmanagerGzip = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerMaxage property.
            /// </summary>
            /// <param name="value">HtmllibmanagerMaxage</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerMaxage(ConfigNodePropertyInteger value)
            {
                _HtmllibmanagerMaxage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerMaxDataUriSize property.
            /// </summary>
            /// <param name="value">HtmllibmanagerMaxDataUriSize</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger value)
            {
                _HtmllibmanagerMaxDataUriSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerMinify property.
            /// </summary>
            /// <param name="value">HtmllibmanagerMinify</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerMinify(ConfigNodePropertyBoolean value)
            {
                _HtmllibmanagerMinify = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerPathList property.
            /// </summary>
            /// <param name="value">HtmllibmanagerPathList</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerPathList(ConfigNodePropertyArray value)
            {
                _HtmllibmanagerPathList = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplProperties.HtmllibmanagerTiming property.
            /// </summary>
            /// <param name="value">HtmllibmanagerTiming</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerTiming(ConfigNodePropertyBoolean value)
            {
                _HtmllibmanagerTiming = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWidgetImplHtmlLibraryManagerImplProperties.
            /// </summary>
            /// <returns>ComDayCqWidgetImplHtmlLibraryManagerImplProperties</returns>
            public ComDayCqWidgetImplHtmlLibraryManagerImplProperties Build()
            {
                Validate();
                return new ComDayCqWidgetImplHtmlLibraryManagerImplProperties(
                    HtmllibmanagerClientmanager: _HtmllibmanagerClientmanager,
                    HtmllibmanagerDebug: _HtmllibmanagerDebug,
                    HtmllibmanagerDebugConsole: _HtmllibmanagerDebugConsole,
                    HtmllibmanagerDebugInitJs: _HtmllibmanagerDebugInitJs,
                    HtmllibmanagerDefaultthemename: _HtmllibmanagerDefaultthemename,
                    HtmllibmanagerDefaultuserthemename: _HtmllibmanagerDefaultuserthemename,
                    HtmllibmanagerFirebuglitePath: _HtmllibmanagerFirebuglitePath,
                    HtmllibmanagerForceCQUrlInfo: _HtmllibmanagerForceCQUrlInfo,
                    HtmllibmanagerGzip: _HtmllibmanagerGzip,
                    HtmllibmanagerMaxage: _HtmllibmanagerMaxage,
                    HtmllibmanagerMaxDataUriSize: _HtmllibmanagerMaxDataUriSize,
                    HtmllibmanagerMinify: _HtmllibmanagerMinify,
                    HtmllibmanagerPathList: _HtmllibmanagerPathList,
                    HtmllibmanagerTiming: _HtmllibmanagerTiming
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}